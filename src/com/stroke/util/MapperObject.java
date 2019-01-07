package com.stroke.util;

import com.stroke.entity.StrokeMap;

import java.io.IOException;
import java.io.ObjectInputStream;

public class MapperObject {
    public StrokeMap getStrokeMapper() {
        StrokeMap mapper = null;
        ObjectInputStream is = null;
        try {
            is = new ObjectInputStream(MapperObject.class.getResourceAsStream("/res/Stroke.s"));
            mapper = (StrokeMap) is.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return mapper;
    }
}
