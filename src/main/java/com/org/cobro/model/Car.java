package com.org.cobro.model;

public class Car {

    public Car(String color, String type){
        this.color = color;
        this.type = type;
    }
    private String color;
    private String type;

    // standard getters setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
