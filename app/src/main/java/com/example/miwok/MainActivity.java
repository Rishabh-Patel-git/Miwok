package com.example.miwok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
  CategoryFragmentAdapter adapter;
  ViewPager2 viewPager2;
  TabLayout tabLayout;
    private String[] titles = new String[]{"Numbers","Colors","Family","Phrases"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CategoryFragmentAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager2 = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabs_r);
        viewPager2.setAdapter(adapter);


        new TabLayoutMediator(tabLayout,viewPager2,(((tab, position) -> tab.setText(titles[position])))).attach();
    }


}