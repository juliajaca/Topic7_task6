package com.example.topic7_task6;

public class Dessert {
    private int mImageDrawable;
    private String mName;

    public Dessert (int imageDrawable, String mensaje){
        this.mImageDrawable = imageDrawable;
        this.mName = mensaje;
    }

    public int getImageDrawable() {
        return mImageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        mImageDrawable = imageDrawable;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
