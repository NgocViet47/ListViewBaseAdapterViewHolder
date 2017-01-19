package com.example.mypc.listviewbaseadapterviewholder;

/**
 * Created by MyPC on 1/17/2017.
 */

public class Items {
    private String name;
    private int idImage;
    private String time;

    public Items() {
    }

    public Items(String name, int idImage, String time) {
        this.name = name;
        this.idImage = idImage;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
