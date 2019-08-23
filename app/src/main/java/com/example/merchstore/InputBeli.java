package com.example.merchstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InputBeli extends AppCompatActivity implements View.OnClickListener{
    private TextView eNamaMerch;
    private EditText eNamaPembeli;
    private EditText eAlamat;
    private EditText eEmail;
    private Button btnBuy;
    private TextView eOutputMerch;
    private TextView eOutputPembeli;
    private TextView eOutputAlamat;
    private TextView eOutputEmail;
    private TextView eOutputPrice;
    String name;
    String price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_beli);

        eNamaPembeli = findViewById(R.id.idname);
        eAlamat = findViewById(R.id.idaddress);
        eEmail = findViewById(R.id.idemail);
        btnBuy = findViewById(R.id.btn_buy);
        eOutputMerch= findViewById(R.id.idoutputmerch);
        eOutputPembeli = findViewById(R.id.idoutputname);
        eOutputAlamat = findViewById(R.id.idoutputaddress);
        eOutputEmail= findViewById(R.id.idoutputemail);
        eOutputPrice= findViewById(R.id.idoutputprice);
        name = getIntent().getStringExtra(Detail.EXTRA_NAME);
        price = getIntent().getStringExtra(Detail.EXTRA_PRICE);
        eOutputMerch.setText(name);

        btnBuy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String inputNamaPembeli = eNamaPembeli.getText().toString();
        String inputAlamat = eAlamat.getText().toString();
        String inputEmail= eEmail.getText().toString();


        if (inputNamaPembeli.length()==0){
            eNamaPembeli.setError("Data tidak boleh kosong");
        } else {
            eOutputPembeli.setText(inputNamaPembeli);
        } if (inputAlamat.length()==0){
            eAlamat.setError("Data tidak boleh kosong");
        } else {
            eOutputAlamat.setText(inputAlamat);
        } if (inputEmail.length()==0){
            eEmail.setError("Data tidak boleh kosong");
        } else {
            eOutputEmail.setText(inputEmail);
            eOutputMerch.setText(name);
            eOutputPrice.setText(price);
        }
    }
}