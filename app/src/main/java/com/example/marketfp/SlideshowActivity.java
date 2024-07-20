package com.example.marketfp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import java.util.Arrays;
import java.util.List;

public class SlideshowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slideshow);

        List<Integer> images = Arrays.asList(R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4);
        ViewPager viewPager = findViewById(R.id.viewPager);
        SlideshowAdapter adapter = new SlideshowAdapter(this, images);
        viewPager.setAdapter(adapter);
    }
}
