package project.dheeraj.completeclothing;

import android.content.Intent;

public class LayoutItems {

    private String name;
    private String price;
    private int imgRes;
    private String img;



    public LayoutItems(String Name, String Price, String imgIdUrl){
        name = Name;
        price = Price;
//        imgRes = imgIdRes;
        img = imgIdUrl;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getImg() {
        return img;
    }
    public int getImgRes() {
        return imgRes;
    }
}
