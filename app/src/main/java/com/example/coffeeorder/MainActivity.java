package com.example.coffeeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declare
    private EditText etJumlah;
    private Button BtnBayar;
    private RadioButton rd_Robusta, rd_Expreso, rd_Luwak, rd_nasiGoreng, rd_mieGoreng, rd_mieRebus;
    private CheckBox cb_Cream, cb_sugar;
    private RadioGroup rg_satu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        etJumlah = findViewById(R.id.et_jumlah);
        BtnBayar = findViewById(R.id.btn_bayar);
        rd_Robusta = findViewById(R.id.rd_robusta);
        rd_Expreso = findViewById(R.id.rd_ekpreso);
        rd_Luwak = findViewById(R.id.rd_luwak);
        rd_nasiGoreng = findViewById(R.id.rb_nasiGoreng);
        rd_mieGoreng = findViewById(R.id.rb_mieGoreng);
        rd_mieRebus = findViewById(R.id.rb_mieRebus);
        cb_Cream = findViewById(R.id.cb_cream);
        cb_sugar = findViewById(R.id.cb_sugar);

        rg_satu = findViewById(R.id.RadioGroupSatu);
    }

    public void btn_bayar(View view) {
       int hargaKopi = 0;
        int hargaCampuran = 0;
        int hargaTambahan = 0;

        // kopi
       if (rd_Robusta.isChecked()) {
           hargaKopi = 10000;
       }
       if (rd_Expreso.isChecked()) {
           hargaKopi = 20000;
       }
       if (rd_Luwak.isChecked()) {
           hargaKopi = 30000;
       }

       // campuran
       if (cb_Cream.isChecked()) {
           hargaCampuran = 1000;
       }
       if (cb_sugar.isChecked()) {
           hargaCampuran = 500;
       }

       // mie rebus
       if (rd_mieRebus.isChecked()) {
           hargaTambahan = 20000;
       }
       if (rd_mieGoreng.isChecked()) {
           hargaTambahan = 15000;
       }
       if (rd_nasiGoreng.isChecked()) {
           hargaTambahan = 10000;
       }
       int harga = Integer.valueOf(hargaKopi) + Integer.valueOf(hargaCampuran) + Integer.valueOf(hargaTambahan);
       etJumlah.setText(String.valueOf(harga));
    }
}