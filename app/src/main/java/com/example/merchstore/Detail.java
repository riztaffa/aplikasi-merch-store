package com.example.merchstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;



public class Detail  extends AppCompatActivity implements View.OnClickListener {
    public static String EXTRA_NAME = "NAME";
    public static String EXTRA_PRICE = "PRICE";
    public String EXTRA_DESC = "DESCRIPTION";
    public String EXTRA_CATE= "CATEGORY";
    public String EXTRA_SIZE= "SIZE";
    public String EXTRA_PHOTO = "PHOTO";

    private int total = 0;
    String name;
    String price;
    String desc;
    String cate;
    String size;

    ImageView img_item_Photo;
    Button btnBeli;
    TextView tvName, tvPrice, tvDesc, tvCate, tvSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img_item_Photo = findViewById(R.id.img_item_photo);
        tvName = findViewById(R.id.tv_item_name);
        tvPrice = findViewById(R.id.tv_item_price);
        tvDesc = findViewById(R.id.tv_item_desc);
        tvCate= findViewById(R.id.tv_item_cate);
        tvSize= findViewById(R.id.tv_item_size);
        btnBeli = findViewById(R.id.btn_set_buy);

        name = getIntent().getStringExtra(EXTRA_NAME);
        Glide.with(this).load(getIntent().getStringExtra(EXTRA_PHOTO)).into(img_item_Photo);
        desc = getIntent().getStringExtra(EXTRA_DESC);
        cate = getIntent().getStringExtra(EXTRA_CATE);
        size = getIntent().getStringExtra(EXTRA_SIZE);
        price = getIntent().getStringExtra(EXTRA_PRICE);



        tvName.setText(name);
        tvPrice.setText(price);
        tvDesc.setText(desc);
        tvCate.setText(cate);
        tvSize.setText(size);


        Button btnBeli = findViewById(R.id.btn_set_buy);
        btnBeli.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_set_buy:
                Intent moveIntent = new Intent(Detail.this, InputBeli.class);
                moveIntent.putExtra(EXTRA_NAME, name);
                moveIntent.putExtra(EXTRA_PRICE, price);
                startActivity(moveIntent);
                break;
        }
    }
}