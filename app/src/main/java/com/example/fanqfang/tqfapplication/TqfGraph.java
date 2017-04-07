package com.example.fanqfang.tqfapplication;

import java.util.ArrayList;

/**
 * Created by fanqfang on 4/5/2017 AD.
 */

public class TqfGraph {
    float score;
    String name;

    public TqfGraph(String name, float score) {
        this.score = score;
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<TqfGraph> getTqfData(int size) {
        ArrayList<TqfGraph> tqfGraphs = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            tqfGraphs.add(new TqfGraph("Android v"+i, (float) Math.random() * 100));
        }
        return tqfGraphs;
    }
}
