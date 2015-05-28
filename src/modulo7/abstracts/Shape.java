/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo7.abstracts;


/**
 * @author Rosa Isela
 */

public abstract class Shape {
    private int x;
    private int y;

    public abstract void draw();

    public void setAnchor(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class CircleA extends Shape {
    private int radius;

    @Override
    public void draw() {

    }
}

abstract class CircleB extends Shape {
    private int radious;
}

abstract class CircleC extends Shape {
    private int radius;

    abstract void foo();
}

abstract class CircleD extends Shape {
    private int radius;

    //void draw();
}

class CircleE extends Shape {
    private int radius;

    public void draw() {
/* code here */
    }
}

abstract class CircleF extends Shape {
    private int radius;

    public void draw() {
/* code here */
    }
}

