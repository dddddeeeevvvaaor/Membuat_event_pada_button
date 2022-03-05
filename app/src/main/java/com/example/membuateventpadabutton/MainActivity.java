package com.example.membuateventpadabutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel untuk button
    Button btnLogin;

    //deklrasi variabel untuk EditText
    EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di eddittex email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                if (nama.equals("prizan123@gmail.com")&&password.equals("cicakrowodowomanoke")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Sukses",Toast.LENGTH_LONG).show();

                }
                else if (nama.equals("prizan123@gmail.com") && password.equals(password)) {

                    //Paswword salah
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                }

                else if ( nama.equals(nama) && password.equals("cicakrowodowomanoke")) {

                    //Email salah
                    Toast.makeText(getApplicationContext(), "Email salah", Toast.LENGTH_LONG).show();

                }

                else if ( nama.equals(nama) && password.equals(password)) {
                    //login gagal
                    Toast.makeText(MainActivity.this, "Email dan Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
