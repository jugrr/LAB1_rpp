package com.example.lab1;

public class Enumeration {
    private String number;
    private int picResource;
    private int color;

    public Enumeration(String num, int pic, int colour){
        this.number = num; //число
        this.picResource = pic; //ресурс картинки
        this.color = colour; //цвет строки
    }

    public String getNumber() { return this.number; }
    public void setNumber(String num) { this.number = num; }

    public int getPicResource() { return this.picResource; }
    public void setPicResource(int picResource) { this.picResource = picResource; }

    public void setColor(int color) { this.color = color; }
    public int getColor() { return color; }
}
