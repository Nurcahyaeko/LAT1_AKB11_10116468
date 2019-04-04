package com.lat1_akb11_10116468;

/*<!--Nim     : 10116468 -->
<!--Nama    : Muhamad Nurcahya Eko Diputra-->
<!--Kelas   : AKB-11 -->
<!--Tanggal : 4 April 2019 -->*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class biodata extends AppCompatActivity {

    EditText editNama, editUmur;
    Button btn_selanjutnya;

    private String KEY_NAME = "kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        editNama = (EditText) findViewById(R.id.inputNamaPanggilan);
        editUmur = (EditText) findViewById(R.id.inputUmur);
        btn_selanjutnya = (Button) findViewById(R.id.btnSelanjutnya);

        btn_selanjutnya.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String nama = editNama.getText().toString();
                String umur = editUmur.getText().toString();

                boolean isEmptyFIelds = false;

                if ((TextUtils.isEmpty(nama)) || (TextUtils.isEmpty(umur))) {
                    isEmptyFIelds = true;
                    editNama.setError("Harap isi semua data");
                } else {
                    Intent moveIntentWithData = new Intent(biodata.this, sayHai.class);
                    moveIntentWithData.putExtra(KEY_NAME, nama);
                    startActivity(moveIntentWithData);
                }

            }


        });


    }
}
