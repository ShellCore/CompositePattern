package com.shellcore.android.compositepattern;

/**
 * Created by MOGC on 04/12/2017.
 */

public interface Component {

    void add(Component c);
    String getName();
    void inflate();
}
