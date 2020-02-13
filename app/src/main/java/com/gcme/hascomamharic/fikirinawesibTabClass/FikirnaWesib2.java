package com.gcme.hascomamharic.fikirinawesibTabClass;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import com.gcme.hascomamharic.fikirinawesibFragment.FragmentEighteen;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentFifteen;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentNineteen;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentSeventeen;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentSixteen;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentTwenty;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentTwenty1;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentTwenty2;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentTwenty3;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentTwenty4;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentTwenty5;
import com.gcme.hascomamharic.fikirinawesibFragment.FragmentTwenty6;
import com.gcme.hascomamharic.R;

/**
 * Created by buty on 12/29/15.
 */
public class FikirnaWesib2 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fikirinawesib2);

        toolbar = (Toolbar) findViewById(R.id.toolbar16);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager16);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs16);
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
                fragment = new FragmentSeventeen();
            }
            if (position == 1) {
                fragment = new FragmentSixteen();
            }
            if (position == 2) {
                fragment = new FragmentFifteen();
            }
            if (position == 3) {
                fragment = new FragmentEighteen();
            }
            if (position == 4) {

                fragment = new FragmentNineteen();
            }

            if (position == 5) {
                fragment = new FragmentTwenty();
            }

            if (position == 6) {
                fragment = new FragmentTwenty1();
            }
            if (position == 7) {
                fragment = new FragmentTwenty2();
            }
            if (position == 8) {
                fragment = new FragmentTwenty3();
            }
            if (position == 9) {
                fragment = new FragmentTwenty4();
            }
            if (position == 10) {
                fragment = new FragmentTwenty5();
            }
            if (position == 11) {
                fragment = new FragmentTwenty6();
            }
            return fragment;
        }
        @Override
        public int getCount() {
            return 12;
        }


        @Override
        public CharSequence getPageTitle(int position) {


            if (position == 0) {
                return getResources().getString(R.string.pornin_etelawalew);
            }
            if (position == 1) {
                return getResources().getString(R.string.merrzegna_fitiwetina_yewesib_bikilet);
            }
            if (position == 2) {
                return getResources().getString(R.string.wesibina_yefikir_guadegna_filega);
            }

            if (position == 3) {
                return getResources().getString(R.string.yefikir_ginignunet);
            }
            if (position == 4) {
                return getResources().getString(R.string.yegziabher_fekad_silegabicha);
            }
            if (position == 5) {
                return getResources().getString(R.string.lifers_yetekarebe_tidar);
            }
            if (position == 6) {
                return getResources().getString(R.string.rasin_beras_markat);
            }
            if (position == 7) {
                return getResources().getString(R.string.yewesib_film_mirkogna);
            }
            if (position == 8) {
                return getResources().getString(R.string.kidime_gabicha_wesib);
            }
            if (position == 9) {
                return getResources().getString(R.string.yewesib_hig_man_yawutalin);
            }
            if (position == 10) {
                return getResources().getString(R.string.ewunetegna_yesetoch_mebt_akibari);
            }
            if (position == 11) {
                return getResources().getString(R.string.ewunetegna_yesetoch_mebt_akibari);
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
