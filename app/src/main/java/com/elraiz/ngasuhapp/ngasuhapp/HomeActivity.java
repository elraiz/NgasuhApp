package com.elraiz.ngasuhapp.ngasuhapp;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF-5

//28 April 2020 : Pembuatan Activiy Home,Layout Home dan java class UserModel,Preference dan Util Static
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.elraiz.ngasuhapp.R;
import com.elraiz.ngasuhapp.ngasuhapps.utils.Preferences;

public class HomeActivity extends AppCompatActivity {
    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Preferences.setLogout(getBaseContext());
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });
    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
