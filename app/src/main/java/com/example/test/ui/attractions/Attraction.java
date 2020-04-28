package com.example.test.ui.attractions;

public class Attraction {
    private String name;
    private String address;
    private int image;

    public Attraction(String name, String address, int image) {
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
