package com.codegym;

public class MyFan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed;
    private boolean power;
    private double radius;
    private String color;
    public MyFan() {
        this.speed = SLOW;
        this.power = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.isPower()) {
            return "fan is on" + "{speed: " + this.getSpeed() + ", radius: " + this.getRadius() + ", color: " + this.getColor() + "}";
        } else {
            return "fan is off" + "{speed: " + this.getSpeed() + ", radius: " + this.getRadius() + ", color: " + this.getColor() + "}";
        }
    }
}
