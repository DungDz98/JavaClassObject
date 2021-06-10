package com.codegym;

public class Main {

    public static void main(String[] args) {
	    MyFan fan1 = new MyFan();
	    MyFan fan2 = new MyFan();
	    fan1.setSpeed(fan1.SLOW);
	    fan1.setRadius(10);
	    fan1.setColor("Yellow");
	    fan1.setPower(true);
	    fan2.setSpeed(fan2.MEDIUM);
	    fan2.setRadius(5);
	    fan2.setColor("Blue");
	    fan2.setPower(false);
		System.out.println(fan1);
		System.out.println(fan2);

    }
}
