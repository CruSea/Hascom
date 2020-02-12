package com.gcme.hascomamharic.hiliwinawTabClass;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import android.view.Menu;
import android.view.MenuItem;

import com.gcme.hascomamharic.hiliwinawFragments.FragmentFive;
import com.gcme.hascomamharic.hiliwinawFragments.FragmentFour;
import com.gcme.hascomamharic.hiliwinawFragments.FragmentOne;
import com.gcme.hascomamharic.hiliwinawFragments.FragmentSecond;
import com.gcme.hascomamharic.hiliwinawFragments.FragmentSix;
import com.gcme.hascomamharic.hiliwinawFragments.FragmentThree;
import com.gcme.hascomamharic.R;
import com.gcme.hascomamharic.activity.AboutUs;
import com.gcme.hascomamharic.activity.Feedback;
import com.gcme.hascomamharic.activity.TeleEshtaol;

/**
 * Created by buty on 12/29/15.
 */
public class Hiliwinaw5 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ShareActionProvider myShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiliwinaw5);

        toolbar = (Toolbar) findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager5);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs5);
        tabLayout.setupWithViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;

                    if (position == 0) {
                        fragment = new FragmentSix();
                    }
                    if (position == 1) {
                        fragment = new FragmentSecond();
                     }

                    if (position == 2) {

                        fragment = new FragmentThree();
                    }

                    if (position == 3) {
                        fragment = new FragmentFour();
                    }

                    if (position == 4) {
                        fragment = new FragmentFive();
                    }

                    if (position == 5) {
                        fragment = new FragmentOne();
                    }

            return fragment;
        }
        @Override
        public int getCount() {
            return 6;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return getResources().getString(R.string.silase);
            }
            if (position == 1) {
                return getResources().getString(R.string.egziabher_manew);
            }
            if (position == 2) {
                return getResources().getString(R.string.egziabher_menor_ergit_new);
            }
            if (position == 3) {
                return getResources().getString(R.string.alem_yetefeterew_besint_ken_new);
            }
            if (position == 4) {
                return getResources().getString(R.string.silasen_litabrara_tichilaleh);
            }
            if (position == 5) {
                return getResources().getString(R.string.egziabher_ale_title);
            }


            return null;
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}