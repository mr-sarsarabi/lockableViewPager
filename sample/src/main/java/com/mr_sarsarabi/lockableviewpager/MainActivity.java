package com.mr_sarsarabi.lockableviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.mr_sarsarabi.library.LockableViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LockableViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);


        SampleFragment fragment1 = new SampleFragment();
        SampleFragment fragment2 = new SampleFragment();
        SampleFragment fragment3 = new SampleFragment();
        SampleFragment fragment4 = new SampleFragment();

        fragment1.setTitle("Fragment 1");
        fragment2.setTitle("Fragment 2");
        fragment3.setTitle("Fragment 3");
        fragment4.setTitle("Fragment 4");

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(fragment1);
        fragments.add(fragment2);
        fragments.add(fragment3);
        fragments.add(fragment4);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = new MenuInflater(getApplicationContext());
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.enable_swipe_item) {
            item.setChecked(!item.isChecked());
            viewPager.setSwipeLocked(!item.isChecked());
        }
        return super.onOptionsItemSelected(item);
    }
}
