package com.shellcore.android.compositepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Component oldLeaf = new Leaf("Old leaf");
//        Component newLeaf = new Leaf("New leaf");
//        Component composite1 = new Composite("New composite");
//        composite1.add(oldLeaf);
//        composite1.add(newLeaf);
//
//        Component composite2 = new Composite("Another composite");
//        composite2.add(oldLeaf);
//        composite2.add(composite1);
//        composite2.add(new Leaf("Recently added leaf"));
//
//        composite2.inflate();

        Builder builder = new Builder();
        builder.listView.inflate();
        builder.layout1().inflate();
        builder.layout2().inflate();
        builder.layout3().inflate();
    }
}
