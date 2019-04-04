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
import android.widget.TextView;

public class sayHai extends AppCompatActivity {

    private String KEY_NAME = "kamu";
    private String nama;
    TextView textSayHai;
    Button btn_oke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);

        textSayHai = (TextView) findViewById(R.id.beres);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        textSayHai.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu " + nama + " ngatur waktu :)");

        btn_oke = (Button) findViewById(R.id.btnOke);
        btn_oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack( true );
            }
        });
    }
}
