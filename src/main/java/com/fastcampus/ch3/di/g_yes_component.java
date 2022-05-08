package com.fastcampus.ch3.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component class HHH_yes_component{}
@Component class QQQ_yes_component{}

@Component class KKK_yes_component{}
@Component class kkk_1_yes_component extends KKK_yes_component{}
@Component class kkk_2_yes_component extends KKK_yes_component{}
@Component("kkk_123456") class kkk_3_yes_component extends KKK_yes_component{}

@Component class TTTT_yes_component_method{}

@Component
public class g_yes_component {
    @Autowired HHH_yes_component hhh_yes_component;
    @Autowired QQQ_yes_component qqq_yes_component;
    @Autowired KKK_yes_component[] kkk_yes_components_array;


    @Autowired
    @Qualifier("kkk_123456")
    KKK_yes_component kkk_yes_component;

    @Override
    public String toString() {
        return "GGG_autowired{" +
                "hhh_yes_component=" + hhh_yes_component +
                ", qqq_yes_component=" + qqq_yes_component +
                ", kkk_yes_components_array=" + Arrays.toString(kkk_yes_components_array) +
                ", kkk_yes_component=" + kkk_yes_component +
                ", tttt_yes_component_method=" + tttt_yes_component_method +
                '}';
    }

    TTTT_yes_component_method tttt_yes_component_method;

    g_yes_component(){}

    @Autowired
    public g_yes_component(TTTT_yes_component_method tttt_yes_component_method) {
        this.tttt_yes_component_method = tttt_yes_component_method;
    }
}
