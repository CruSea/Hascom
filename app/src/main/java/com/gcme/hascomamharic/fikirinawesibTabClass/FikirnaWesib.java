package com.gcme.hascomamharic.fikirinawesibTabClass;

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

import com.gcme.hascomamharic.fikirinawesibFragment.Eighteen;
import com.gcme.hascomamharic.fikirinawesibFragment.Fiften;
import com.gcme.hascomamharic.fikirinawesibFragment.Nineteen;
import com.gcme.hascomamharic.fikirinawesibFragment.Seventhen;
import com.gcme.hascomamharic.fikirinawesibFragment.Sixteen;
import com.gcme.hascomamharic.fikirinawesibFragment.Twenty;
import com.gcme.hascomamharic.fikirinawesibFragment.Twenty1;
import com.gcme.hascomamharic.fikirinawesibFragment.Twenty2;
import com.gcme.hascomamharic.fikirinawesibFragment.Twenty3;
import com.gcme.hascomamharic.fikirinawesibFragment.Twenty4;
import com.gcme.hascomamharic.fikirinawesibFragment.Twenty5;
import com.gcme.hascomamharic.fikirinawesibFragment.Twenty6;
import com.gcme.hascomamharic.R;
import com.gcme.hascomamharic.activity.AboutUs;
import com.gcme.hascomamharic.activity.Feedback;
import com.gcme.hascomamharic.activity.TeleEshtaol;

/**
 * Created by buty on 12/29/15.
 */
public class FikirnaWesib extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ShareActionProvider myShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fikirinawesib);

        toolbar = (Toolbar) findViewById(R.id.toolbar14);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager14);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs14);
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
                fragment = new Fiften();
            }
            if (position == 1) {
                fragment = new Sixteen();
            }
            if (position == 2) {
                fragment = new Seventhen();
            }
            if (position == 3) {
                fragment = new Eighteen();
            }
            if (position == 4) {

                fragment = new Nineteen();
            }

            if (position == 5) {
                fragment = new Twenty();
            }

            if (position == 6) {
                fragment = new Twenty1();
            }
            if (position == 7) {
                fragment = new Twenty2();
            }
            if (position == 8) {
                fragment = new Twenty3();
            }
            if (position == 9) {
                fragment = new Twenty4();
            }
            if (position == 10) {
                fragment = new Twenty5();
            }
            if (position == 11) {
                fragment = new Twenty6();
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
                return getResources().getString(R.string.wesibina_yefikir_guadegna_filega);

            }
            if (position == 1) {
                return getResources().getString(R.string.merrzegna_fitiwetina_yewesib_bikilet);
            }
            if (position == 2) {
                return getResources().getString(R.string.pornin_etelawalew);
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
                return getResources().getString(R.string.gibire_sedom_lezbian);
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
