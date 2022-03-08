package com.example.membuateventpadabutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import android.os.Bundle;

public class ActivityHasil extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variabel txPassword dengan componen Textview pada Layout
        txPassword = findViewById(R.id.tvPassword);

        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil
        // pesan yang dikirim melalui method intent
        Bundle bundle = getIntent(). getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirim dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirim dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variabel pass kedalam txPassword
        txPassword.setText(pass);
    }
}