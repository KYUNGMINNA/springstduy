package com.fastcampus.ch3.di;

public class c_no_compoent_get_set_initialization {
    int a;
    String b;
    a_no_component c;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public a_no_component getC() {
        return c;
    }

    public void setC(a_no_component c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "c_no_compoent_get_set_initialization{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", c=" + c +
                '}';
    }
}
