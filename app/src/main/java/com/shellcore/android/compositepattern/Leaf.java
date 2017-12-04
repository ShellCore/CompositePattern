package com.shellcore.android.compositepattern;

import android.util.Log;

/**
 * Created by MOGC on 04/12/2017.
 */

public class Leaf implements Component {

    private static final String TAG = "Leaf";

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void inflate() {
        Log.d(TAG, "inflate: " + getName());
    }
}
