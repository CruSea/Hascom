package com.gcme.hascomamharic.fikirinawesibFragment;

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
 * Created by buty on 12/7/15.
 */
public class Eighteen extends Fragment {
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fikir_eighteen, container, false);
         TextView t=(TextView) view.findViewById(R.id.tvEighteen);
         Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
         t.setTypeface(tf);

         FloatingActionButton fab = view.findViewById(R.id.fab_eighteen);
         fab.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String shareBody = getResources().getString(R.string.yefikir_ginignunet_link);
                 Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                 sharingIntent.setType("text/plain");
                 sharingIntent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.yefikir_ginignunet));
                 sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                 startActivity(Intent.createChooser(sharingIntent, "choose one"));
             }
         });
         return view;
    }
}
