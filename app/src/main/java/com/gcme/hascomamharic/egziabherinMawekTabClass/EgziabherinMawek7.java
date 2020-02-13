package com.gcme.hascomamharic.egziabherinMawekTabClass;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
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
public class EgziabherinMawek7 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egziabherin_mawek7);

        toolbar =  findViewById(R.id.toolbar33);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager =  findViewById(R.id.viewpager33);
        setupViewPager(viewPager);

        tabLayout =  findViewById(R.id.tabs33);
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

                fragment = new FragmentThirty4();
            }
            if (position == 1) {
                fragment = new FragmentThirty3();
            }
            if (position == 2) {
                fragment = new FragmentThirty2();
            }
            if (position == 3) {
                fragment = new FragmentThirty1();
            }
            if (position == 4) {
                fragment = new FragmentThirty();
            }
            if (position == 5) {
                fragment = new FragmentTwenty9();
            }
            if (position == 6) {
                fragment = new FragmentTwenty8();
            }
            if (position == 7) {
                fragment = new FragmentTwenty7();
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
                return getResources().getString(R.string.mengiste_semay_mn_timeslalech);
            }
            if (position == 1) {
                return getResources().getString(R.string.catholic_ena_christina_liyunet);
            }
            if (position == 2) {
                return getResources().getString(R.string.yegziabher_fikir_lemuslimoch);
            }
            if (position == 3) {
                return getResources().getString(R.string.eyesusina_leloch_haymanotoch);
            }
            if (position == 4) {
                return getResources().getString(R.string.eyesus_amilak_endehone_tenagroal);
            }
            if (position == 5) {
                return getResources().getString(R.string.egziabher_tselotin_yimelisal);
            }
            if (position == 6) {
                return getResources().getString(R.string.eyesus_lemin_mote);
            }
            if (position == 7) {
                return getResources().getString(R.string.egziabherin_begil_mawek);
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
