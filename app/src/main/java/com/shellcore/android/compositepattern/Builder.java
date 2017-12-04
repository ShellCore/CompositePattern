package com.shellcore.android.compositepattern;

/**
 * Created by MOGC on 04/12/2017.
 */

public class Builder {

    Component imageView = new Leaf("Image view");
    Component textView = new Leaf("Text view");
    Component listView = new Leaf("List view");

    Component layout1() {
        Component c = new Composite("layout 1");
        c.add(imageView);
        c.add(textView);
        return c;
    }

    Component layout2() {
        Component c = new Composite("layout 2");
        c.add(listView);
        c.add(layout1());
        return c;
    }

    Component layout3() {
        Component c = new Composite("layout 3");
        c.add(layout1());
        c.add(layout2());
        return c;
    }
}
