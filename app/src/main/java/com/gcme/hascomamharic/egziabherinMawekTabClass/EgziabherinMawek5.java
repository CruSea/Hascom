package com.gcme.hascomamharic.egziabherinMawekTabClass;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import com.gcme.hascomamharic.egziabherinMawekFragment.FragmentThirty;
import com.gcme.hascomamharic.egziabherinMawekFragment.FragmentThirty1;
import com.gcme.hascomamharic.egziabherinMawekFragment.FragmentThirty2;
import com.gcme.hascomamharic.egziabherinMawekFragment.FragmentThirty3;
import com.gcme.hascomamharic.egziabherinMawekFragment.FragmentThirty4;
import com.gcme.hascomamharic.egziabherinMawekFragment.FragmentTwenty7;
import com.gcme.hascomamharic.egziabherinMawekFragment.FragmentTwenty8;
import com.gcme.hascomamharic.egziabherinMawekFragment.FragmentTwenty9;
import com.gcme.hascomamharic.R;

/**
 * Created by buty on 12/29/15.
 */
public class EgziabherinMawek5 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private ShareActionProvider myShareActionProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egziabherin_mawek5);

        toolbar = (Toolbar) findViewById(R.id.toolbar31);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager31);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs31);
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
                fragment = new FragmentThirty2();
            }
            if (position == 1) {
                fragment = new FragmentThirty1();
            }
            if (position == 2) {
                fragment = new FragmentThirty();
            }
            if (position == 3) {
                fragment = new FragmentTwenty9();
            }
            if (position == 4) {
                fragment = new FragmentTwenty8();
            }
            if (position == 5) {
                fragment = new FragmentTwenty7();
            }
            if (position == 6) {
                fragment = new FragmentThirty3();
            }
            if (position == 7) {

                fragment = new FragmentThirty4();
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
                return "የእግዚአብሔር ፍቅር ለፅንፈኛ ሙስሊሞች";
            }
            if (position == 1) {
                return getResources().getString(R.string.eyesusina_leloch_haymanotoch);
            }
            if (position == 2) {
                return getResources().getString(R.string.eyesus_amilak_endehone_tenagroal);
            }
            if (position == 3) {
                return getResources().getString(R.string.egziabher_tselotin_yimelisal);
            }
            if (position == 4) {
                return getResources().getString(R.string.eyesus_lemin_mote);
            }
            if (position == 5) {
                return getResources().getString(R.string.egziabherin_begil_mawek);
            }
            if (position == 6) {
                return getResources().getString(R.string.catholic_ena_christina_liyunet);
            }
            if (position == 7) {
                return getResources().getString(R.string.mengiste_semay_mn_timeslalech);
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

