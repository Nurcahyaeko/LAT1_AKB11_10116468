package com.lat1_akb11_10116468;

/*<!--Nim     : 10116468 -->
<!--Nama    : Muhamad Nurcahya Eko Diputra-->
<!--Kelas   : AKB-11 -->
<!--Tanggal : 4 April 2019 -->*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMulai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMulai = (Button) findViewById(R.id.btn_mulai);
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, logincode.class);
                startActivity(i);
            }
        });
    }
}
