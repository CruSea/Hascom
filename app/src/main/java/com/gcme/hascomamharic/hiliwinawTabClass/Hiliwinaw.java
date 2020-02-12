package com.gcme.hascomamharic.hiliwinawTabClass;

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

public class Hiliwinaw extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiliwinaw);

        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager =  findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout =  findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

//        FloatingActionButton fab =  findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("vnd.android-dir/mms-sms");
//                intent.putExtra("address", "+251911202110");
//                intent.putExtra("sms_body", "ሜሴጆን ይጻፉ!!!");
//                startActivity(intent);
//            }
//        });
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
                    fragment = new FragmentOne();
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
                    fragment = new FragmentSix();
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
                return getResources().getString(R.string.egziabher_ale_title);
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
                return getResources().getString(R.string.silase);
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