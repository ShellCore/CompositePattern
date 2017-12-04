package com.shellcore.android.compositepattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MOGC on 04/12/2017.
 */

public class Composite implements Component {

    private static final String TAG = "Composite";

    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void inflate() {
        Log.d(TAG, "inflate: " + getName());

        for (Component c : components) {
            c.inflate();
        }
    }
}
