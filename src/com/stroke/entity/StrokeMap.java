package com.stroke.entity;

import java.util.HashMap;
/**
 * 保存已经排好序的汉字对象
 * */
public class StrokeMap extends HashMap<Integer, Integer> {

    private static final long serialVersionUID = -860722737778643665L;

    public void put(Stroke stroke) {
        if (stroke != null) {
            this.put(stroke.getCode(), stroke.getOrder());
        }
    }
}
