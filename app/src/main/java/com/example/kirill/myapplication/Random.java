package com.example.kirill.myapplication;

/**
 * Created by kirill on 20.11.2016.
 */

public class Random {


    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
