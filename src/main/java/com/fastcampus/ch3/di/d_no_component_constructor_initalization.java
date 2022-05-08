package com.fastcampus.ch3.di;

public class d_no_component_constructor_initalization {
    int z;
    String b;
    b_no_compoent d;

    public d_no_component_constructor_initalization(int z, String b, b_no_compoent d) {
        this.z = z;
        this.b = b;
        this.d=d;
    }

    @Override
    public String toString() {
        return "d_no_component_constructor_initalization{" +
                "z=" + z +
                ", b='" + b + '\'' +
                ", d=" + d +
                '}';
    }
}
