package com.example.sofya.levopravo;

/**
 * Created by Sofya on 7. 11. 2015.
 */
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class DetailsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        if (savedInstanceState == null) {
            DetailsFragment details = DetailsFragment.newInstance(getIntent().getIntExtra("position", 0));
            getSupportFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
        }
    }
}
