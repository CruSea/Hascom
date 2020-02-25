package com.gcme.hascomamharic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.gcme.hascomamharic.activityFilmoch.ActivityFourty;
import com.gcme.hascomamharic.activityFilmoch.ActivityThirty5;
import com.gcme.hascomamharic.activityFilmoch.ActivityThirty6;
import com.gcme.hascomamharic.activityFilmoch.ActivityThirty7;
import com.gcme.hascomamharic.activityFilmoch.ActivityThirty8;
import com.gcme.hascomamharic.activityFilmoch.ActivityThirty9;
import com.gcme.hascomamharic.egziabherinMawekTabClass.EgziabherinMawek;
import com.gcme.hascomamharic.egziabherinMawekTabClass.EgziabherinMawek1;
import com.gcme.hascomamharic.egziabherinMawekTabClass.EgziabherinMawek2;
import com.gcme.hascomamharic.egziabherinMawekTabClass.EgziabherinMawek3;
import com.gcme.hascomamharic.egziabherinMawekTabClass.EgziabherinMawek4;
import com.gcme.hascomamharic.egziabherinMawekTabClass.EgziabherinMawek5;
import com.gcme.hascomamharic.egziabherinMawekTabClass.EgziabherinMawek6;
import com.gcme.hascomamharic.egziabherinMawekTabClass.EgziabherinMawek7;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib1;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib10;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib11;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib2;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib3;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib4;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib5;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib6;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib7;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib8;
import com.gcme.hascomamharic.fikirinawesibTabClass.FikirnaWesib9;
import com.gcme.hascomamharic.hiliwinawTabClass.Hiliwinaw;
import com.gcme.hascomamharic.hiliwinawTabClass.Hiliwinaw1;
import com.gcme.hascomamharic.hiliwinawTabClass.Hiliwinaw2;
import com.gcme.hascomamharic.hiliwinawTabClass.Hiliwinaw3;
import com.gcme.hascomamharic.hiliwinawTabClass.Hiliwinaw4;
import com.gcme.hascomamharic.hiliwinawTabClass.Hiliwinaw5;
import com.gcme.hascomamharic.R;
import com.gcme.hascomamharic.yehiwotTiyakewochTabClass.YehiwotTiyake;
import com.gcme.hascomamharic.yehiwotTiyakewochTabClass.YehiwotTiyake1;
import com.gcme.hascomamharic.yehiwotTiyakewochTabClass.YehiwotTiyake2;
import com.gcme.hascomamharic.yehiwotTiyakewochTabClass.YehiwotTiyake3;
import com.gcme.hascomamharic.yehiwotTiyakewochTabClass.YehiwotTiyake4;
import com.gcme.hascomamharic.yehiwotTiyakewochTabClass.YehiwotTiyake5;
import com.gcme.hascomamharic.yehiwotTiyakewochTabClass.YehiwotTiyake6;
import com.gcme.hascomamharic.yehiwotTiyakewochTabClass.YehiwotTiyake7;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity implements OnClickListener
{


    Toolbar toolbar;

    LinearLayout panel1,panel2,panel3,panel4,panel5;
    TextView text1,text2,text3,text4,text5;
    View openLayout;
    Button button, button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button111,button112,button12,button13,button14,button15,
            button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar =  findViewById(R.id.toolbar_home);
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        //startActivity(new Intent(MainActivity.this, MainActivity.class));
                        // Toast.makeText(MainActivity.this, "Recents", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_teleshataol:
                        startActivity(new Intent(MainActivity.this, TeleEshtaol.class));
                        Animatoo.animateSlideRight(MainActivity.this);
                        break;
                    case R.id.menu_contact_us:
                        startActivity(new Intent(MainActivity.this, Feedback.class));
                        Animatoo.animateSlideRight(MainActivity.this);
                        break;
                    case R.id.menu_about:
                        startActivity(new Intent(MainActivity.this, AboutUs.class));
                        Animatoo.animateSlideRight(MainActivity.this);
                        break;
                }
                return true;
            }
        });


        panel1 =  findViewById(R.id.panel1);
        panel2 =  findViewById(R.id.panel2);
        panel3 =  findViewById(R.id.panel3);
        panel4 =  findViewById(R.id.panel4);
        panel5 =  findViewById(R.id.panel5);
        button =  findViewById(R.id.btnegziabherale);
        button1 =  findViewById(R.id.btn1egziabhermanew);
        button2 =  findViewById(R.id.btn2yegziabhermenor);
        button3 =  findViewById(R.id.btn3egzaleminyefeterew);
        button4 =  findViewById(R.id.btn4silasenlitabrara);
        button5 =  findViewById(R.id.btn5silase);
        button6 =  findViewById(R.id.btn6hiyiwotkebadhone);
        button7 =  findViewById(R.id.btn7yehiwotealama);
        button8 =  findViewById(R.id.btn8bechinksinikebeb);
        button9 =  findViewById(R.id.btn9limolayalachalew);
        button10 =  findViewById(R.id.btn10egziabherbiku);
        button11 =  findViewById(R.id.btn11yewustihalem);
        button111 =  findViewById(R.id.btn11yecampuslife);
        button112 =  findViewById(R.id.btn11kesusmelakek);
        button12 =  findViewById(R.id.btn12yefikirguadegnafilega);
        button13 =  findViewById(R.id.btn13pornographymininet);
        button14 =  findViewById(R.id.btn14pornintelawalew);
        button15 =  findViewById(R.id.btn15yefikirginignunet);
        button16 =  findViewById(R.id.btn16yegziabherfikadgabicha);
        button17 =  findViewById(R.id.btn17lifersyetekarebetidar);
        button18 =  findViewById(R.id.btn18sega);
        button19 =  findViewById(R.id.btn19yewesibfilmmirkogna);
        button20 =  findViewById(R.id.btn20kidimegabichawesib);
        button21 =  findViewById(R.id.btn21yewesibhigmanyawita);
        button22 =  findViewById(R.id.btn22ewunetegnayesetochmebt);
        button23 =  findViewById(R.id.btn23gibiresedomawuyan);
        button24 =  findViewById(R.id.btn24egziabherinbegilmawek);
        button25 =  findViewById(R.id.btn25eyesusleminmote);
        button26 =  findViewById(R.id.btn26egziabhertselotyimelisalin);
        button27 =  findViewById(R.id.btn27eyesusamilaknew);
        button28 =  findViewById(R.id.btn28eysusinalelochhayimanotoch);
        button29 =  findViewById(R.id.btn29yegziabherfikirlemuslimoch);
        button30 =  findViewById(R.id.btn30catholiceminetnchristina);
        button31 =  findViewById(R.id.btn31mengistesemaymntimeslalech);
        button32 =  findViewById(R.id.btn32yehiwotmisikirinetoch);
        button33 =  findViewById(R.id.btn33yegilyehiwotmisikirinetoch);
        button34 =  findViewById(R.id.btn34yegilyehiwotmisikirinetoch);
        button35 =  findViewById(R.id.btn35yegilyehiwotmisikirinetoch);
        button36 =  findViewById(R.id.btn36yegilyehiwotmisikirinetoch);
        button37 =  findViewById(R.id.btn37yegilyehiwotmisikirinetoch);

        text1 =  findViewById(R.id.tv1yegziabherhiliwina);
        text2 =  findViewById(R.id.tv2yehiwottiyake);
        text3 =  findViewById(R.id.tv3wesibnfikir);
        text4 =  findViewById(R.id.tv4egziabmawek);
        text5 =  findViewById(R.id.tv5films);

        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        text4.setOnClickListener(this);
        text5.setOnClickListener(this);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button111.setOnClickListener(this);
        button112.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button28.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        button37.setOnClickListener(this);



    }
    @Override
    public void onClick(View v){
        switch (v.getId()){

            case R.id.btnegziabherale:
                startActivity(new Intent(MainActivity.this, Hiliwinaw.class));

                break;
            case R.id.btn1egziabhermanew:
                startActivity(new Intent(MainActivity.this, Hiliwinaw1.class));

                break;
            case R.id.btn2yegziabhermenor:
              startActivity(new Intent(MainActivity.this, Hiliwinaw2.class));

                break;
            case R.id.btn3egzaleminyefeterew:
                startActivity(new Intent(MainActivity.this, Hiliwinaw3.class));
                break;
            case R.id.btn4silasenlitabrara:
                startActivity(new Intent(MainActivity.this, Hiliwinaw4.class));
                break;
            case R.id.btn5silase:
                startActivity(new Intent(MainActivity.this, Hiliwinaw5.class));
                break;
            case R.id.btn6hiyiwotkebadhone:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake.class));
                break;
            case R.id.btn7yehiwotealama:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake1.class));
                break;
            case R.id.btn8bechinksinikebeb:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake2.class));
                break;
            case R.id.btn9limolayalachalew:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake3.class));
                break;
            case R.id.btn10egziabherbiku:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake4.class));
                break;
            case R.id.btn11yewustihalem:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake5.class));
                break;
            case R.id.btn11yecampuslife:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake6.class));
                break;
            case R.id.btn11kesusmelakek:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake7.class));
                break;
            case R.id.btn12yefikirguadegnafilega:
                startActivity(new Intent(MainActivity.this, FikirnaWesib.class));
                break;
            case R.id.btn13pornographymininet:
                startActivity(new Intent(MainActivity.this, FikirnaWesib1.class));
                break;
            case R.id.btn14pornintelawalew:
                startActivity(new Intent(MainActivity.this, FikirnaWesib2.class));
                break;
            case R.id.btn15yefikirginignunet:
                startActivity(new Intent(MainActivity.this, FikirnaWesib3.class));
                break;
            case R.id.btn16yegziabherfikadgabicha:
                startActivity(new Intent(MainActivity.this, FikirnaWesib4.class));
                break;
            case R.id.btn17lifersyetekarebetidar:
                startActivity(new Intent(MainActivity.this, FikirnaWesib5.class));
                break;
            case R.id.btn18sega:
                startActivity(new Intent(MainActivity.this, FikirnaWesib6.class));
                break;
            case R.id.btn19yewesibfilmmirkogna:
                startActivity(new Intent(MainActivity.this, FikirnaWesib7.class));
                break;
            case R.id.btn20kidimegabichawesib:
                startActivity(new Intent(MainActivity.this, FikirnaWesib8.class));
                break;
            case R.id.btn21yewesibhigmanyawita:
                startActivity(new Intent(MainActivity.this, FikirnaWesib9.class));
                break;
            case R.id.btn22ewunetegnayesetochmebt:
                startActivity(new Intent(MainActivity.this, FikirnaWesib10.class));
                break;
            case R.id.btn23gibiresedomawuyan:
                startActivity(new Intent(MainActivity.this, FikirnaWesib11.class));
                break;
            case R.id.btn24egziabherinbegilmawek:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek.class));
                break;
            case R.id.btn25eyesusleminmote:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek1.class));
                break;
            case R.id.btn26egziabhertselotyimelisalin:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek2.class));
                break;
            case R.id.btn27eyesusamilaknew:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek3.class));
                break;
            case R.id.btn28eysusinalelochhayimanotoch:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek4.class));
                break;
            case R.id.btn29yegziabherfikirlemuslimoch:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek5.class));
                break;
            case R.id.btn30catholiceminetnchristina:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek6.class));
                break;
            case R.id.btn31mengistesemaymntimeslalech:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek7.class));
                break;
            case R.id.btn32yehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, ActivityThirty5.class));
                break;
            case R.id.btn33yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, ActivityThirty6.class));
                break;
            case R.id.btn34yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, ActivityThirty7.class));
                break;
            case R.id.btn35yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, ActivityThirty8.class));
                break;
            case R.id.btn36yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, ActivityThirty9.class));
                break;
            case R.id.btn37yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, ActivityFourty.class));
                break;





        }
    {
        hideOthers(v);
    }}
    private void hideThemAll()
    {
        if(openLayout == null) return;
        if(openLayout == panel1)
            panel1.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel1, true));
        if(openLayout == panel2)
            panel2.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel2, true));
        if(openLayout == panel3)
            panel3.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel3, true));
        if(openLayout == panel4)
            panel4.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel4, true));
        if(openLayout == panel5)
            panel5.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel5, true));
    }


    private void hideOthers(View layoutView)
    {
        {
            int v;
            if(layoutView.getId() == R.id.tv1yegziabherhiliwina)
            {
                v = panel1.getVisibility();

                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel1.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel1, true));
                }
            }
            else if(layoutView.getId() == R.id.tv2yehiwottiyake)
            {
                v = panel2.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel2.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel2, true));
                }
            }
            else if(layoutView.getId() == R.id.tv3wesibnfikir)
            {
                v = panel3.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel3.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel3, true));
                }
            }
            else if(layoutView.getId() == R.id.tv4egziabmawek)
            {
                v = panel4.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel4.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel4, true));
                }
            }
            else if(layoutView.getId() == R.id.tv5films)
            {
                v = panel5.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel5.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel5, true));
                }
            }
        }
    }

    public class ScaleAnimToHide extends ScaleAnimation
    {

        private View mView;

        private LayoutParams mLayoutParams;

        private int mMarginBottomFromY, mMarginBottomToY;

        private boolean mVanishAfter = false;

        public ScaleAnimToHide(float fromX, float toX, float fromY, float toY, int duration, View view,boolean vanishAfter)
        {
            super(fromX, toX, fromY, toY);
            setDuration(duration);
            openLayout = null;
            mView = view;
            mVanishAfter = vanishAfter;
            mLayoutParams = (LayoutParams) view.getLayoutParams();
            int height = mView.getHeight();
            mMarginBottomFromY = (int) (height * fromY) + mLayoutParams.bottomMargin - height;
            mMarginBottomToY = (int) (0 - ((height * toY) + mLayoutParams.bottomMargin)) - height;

            Log.v("CZ","height..." + height + " , mMarginBottomFromY...." + mMarginBottomFromY  + " , mMarginBottomToY.." +mMarginBottomToY);
        }

        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t)
        {
            super.applyTransformation(interpolatedTime, t);
            if (interpolatedTime < 1.0f)
            {
                int newMarginBottom = mMarginBottomFromY + (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime);
                mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin,mLayoutParams.rightMargin, newMarginBottom);
                mView.getParent().requestLayout();
                 }
            else if (mVanishAfter)
            {
                mView.setVisibility(View.GONE);
            }
        }
    }
    public class ScaleAnimToShow extends ScaleAnimation
    {

        private View mView;

        private LayoutParams mLayoutParams;

        private int mMarginBottomFromY, mMarginBottomToY;

        private boolean mVanishAfter = false;

        public ScaleAnimToShow(float toX, float fromX, float toY, float fromY, int duration, View view,boolean vanishAfter)
        {
            super(fromX, toX, fromY, toY);
            openLayout = view;
            setDuration(duration);
            mView = view;
            mVanishAfter = vanishAfter;
            mLayoutParams = (LayoutParams) view.getLayoutParams();
            mView.setVisibility(View.VISIBLE);
            int height = mView.getHeight();

            mMarginBottomFromY = 0;
            mMarginBottomToY = height;

            Log.v("CZ",".................height..." + height + " , mMarginBottomFromY...." + mMarginBottomFromY  + " , mMarginBottomToY.." +mMarginBottomToY);
        }

        @Override
        protected void applyTransformation(float interpolatedTime, @NonNull Transformation t)
        {
            super.applyTransformation(interpolatedTime, t);
            if (interpolatedTime < 1.0f)
            {
                int newMarginBottom = (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime) - mMarginBottomToY;
                mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin,mLayoutParams.rightMargin, newMarginBottom);
                mView.getParent().requestLayout();

                  }
        }

    }
}

