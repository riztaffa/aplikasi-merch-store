package com.example.merchstore;

import java.util.ArrayList;

public class MerchData {

        public static String [][] data = new String[][]{
                {"Death Longsleeve", "Rp.481.793", "https://cdn.shopify.com/s/files/1/0084/9142/products/DEATHECOM_900x.jpg?v=1562320864", "Black premium heavyweight long sleeve t-shirt with front print, sleeve prints & inside neck print.", ": Small\n  Medium\n  Large\n  XLarge\n  XXL", ": Longsleeve"},
                {"Support T-Shirt", "Rp.430.172", "https://cdn.shopify.com/s/files/1/0084/9142/products/PRODUCT-SHOT_900x.png?v=1565181068", "Black premium heavyweight t-shirt with front print.", ": Small\n  Medium\n  Large\n  XLarge\n  XXL\n  XXXL", ": T-Shirt"},
                {"Silence Speaks Longsleeve", "Rp.380.326", "https://cdn.shopify.com/s/files/1/0084/9142/products/SILENCE-ECOM_900x.jpg?v=1562261732", "White long-sleeve t-shirt with black front chest print & sleeve prints.", ": XLarge", ": Longsleeve"},
                {"Emblem Hoodie", "Rp.691.503", "https://cdn.shopify.com/s/files/1/0084/9142/products/S4_900x.jpg?v=1551954722", "Black pullover hoodie with front chest embroidered logo & sleeve prints.", ": Small\n  Medium", ": Hoodie"},
                {"Corrupt T-Shirt", "Rp.432.189", "https://cdn.shopify.com/s/files/1/0084/9142/products/CORRUPT_900x.jpg?v=1562320787", "Black premium heavyweight t-shirt with front print, back print & inside neck print.", ": Small\n  Medium\n  Large\n  XLarge", ": T-Shirt"},
                {"Anti-Social T-Shirt", "Rp.380.326", "https://cdn.shopify.com/s/files/1/0084/9142/products/S19_900x.jpg?v=1551980670", "Black mineral wash t-shirt with front print & back print.", ": Small\n  Medium\n  Large", ": T-Shirt"},
        };

        public  static ArrayList<Merch> getListData(){
            ArrayList<Merch> list = new ArrayList<>();
            for (String[] aData : data){
                Merch merch = new Merch();
                merch.setName(aData[0]);
                merch.setPrice(aData[1]);
                merch.setPhoto(aData[2]);
                merch.setDesc(aData[3]);
                merch.setSize(aData[4]);
                merch.setCate(aData[5]);


                list.add(merch);
            }
            return list;
        }
    }



