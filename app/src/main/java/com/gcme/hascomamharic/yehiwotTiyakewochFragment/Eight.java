package com.gcme.hascomamharic.yehiwotTiyakewochFragment;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gcme.hascomamharic.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * Created by buty on 12/29/15.
 */
public class Eight extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_eight, container, false);
        TextView t=(TextView) view.findViewById(R.id.tvEight);
        Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
        t.setTypeface(tf);

        FloatingActionButton fab = view.findViewById(R.id.fab_eight);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shareBody = getResources().getString(R.string.yehiwote_alama_mndnew_link);
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.yehiwote_alama_mndnew));
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "choose one"));
            }
        });
        return view;
    }
}