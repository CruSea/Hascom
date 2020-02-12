package com.gcme.hascomamharic.yehiwotTiyakewochTabClass;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import android.view.Menu;
import android.view.MenuItem;

import com.gcme.hascomamharic.yehiwotTiyakewochFragment.Eight;
import com.gcme.hascomamharic.yehiwotTiyakewochFragment.Eleven;
import com.gcme.hascomamharic.yehiwotTiyakewochFragment.Fourteen;
import com.gcme.hascomamharic.yehiwotTiyakewochFragment.Nine;
import com.gcme.hascomamharic.yehiwotTiyakewochFragment.Seven;
import com.gcme.hascomamharic.yehiwotTiyakewochFragment.Ten;
import com.gcme.hascomamharic.yehiwotTiyakewochFragment.Thirteen;
import com.gcme.hascomamharic.yehiwotTiyakewochFragment.Twelve;
import com.gcme.hascomamharic.R;
import com.gcme.hascomamharic.activity.AboutUs;
import com.gcme.hascomamharic.activity.Feedback;
import com.gcme.hascomamharic.activity.TeleEshtaol;

/**
 * Created by buty on 12/29/15.
 */
public class YehiwotTiyake4 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yehiwottiyake4);

        toolbar = (Toolbar) findViewById(R.id.toolbar10);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager10);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs10);
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
                fragment = new Eleven();
            }
            if (position == 1) {

                fragment = new Ten();
            }

            if (position == 2) {
                fragment = new Nine();
            }

            if (position == 3) {
                fragment = new Eight();
            }
            if (position == 4) {
                fragment = new Seven();
            }
            if (position == 5) {
                fragment = new Twelve();
            }

            if (position == 6) {
                fragment = new Thirteen();
            }

            if (position == 7) {
                fragment = new Fourteen();
            }


            return fragment;
        }
        @Override
        public int getCount() {
            return 8;
        }


        @Override
        public CharSequence getPageTitle(int position) {

            if (position == 0) {
                return getResources().getString(R.string.egziabher_biqu_director_new);
            }
            if (position == 1) {
                return getResources().getString(R.string.limola_yalchale_hiwot);
            }
            if (position == 2) {
                return getResources().getString(R.string.bechink_sinikebeb);
            }
            if (position == 3) {
                return getResources().getString(R.string.yehiwote_alama_mndnew);
            }
            if (position == 4) {
                return getResources().getString(R.string.hiwot_lemin_kebad_hone);
            }
            if (position == 5) {
                return getResources().getString(R.string.yewust_alem);
            }
            if (position == 6) {
                return getResources().getString(R.string.yecampus_life_tesnsion);
            }
            if (position == 7) {
                return getResources().getString(R.string.kesus_melakek);
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

