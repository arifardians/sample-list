package com.arif.samplelist;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recList = (RecyclerView) findViewById(R.id.reclist);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        int[] images = {R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5, R.drawable.image_6,
                R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5, R.drawable.image_6};
        ArrayList<Item> items = new ArrayList<>();
        Item item = null;

        for (int i = 0; i < images.length; i++){
            item = new Item();
            item.setTitle("Lorem ipsum dolor sit amet, consectetur ");
            item.setSubtile("Maecenas mattis, augue venenatis...");
            item.setImage(images[i]);

            items.add(item);
        }


        ItemListAdapter adapter = new ItemListAdapter(items);
        recList.setAdapter(adapter);
    }
}
