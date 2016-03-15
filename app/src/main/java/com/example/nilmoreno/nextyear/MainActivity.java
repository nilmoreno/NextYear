package com.example.nilmoreno.nextyear;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    public final static String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onGOButtonClicked(String message) {

        FragmentManager fragmentManager = this.getSupportFragmentManager();
        DetailFragment detailFragment = (DetailFragment) fragmentManager.findFragmentById(R.id.detailFragment);

        // if screen size = SMARTPHONE -> open DetailActivity (sending the message as EXTRA)
        if (detailFragment == null)
        {
            //SMARTPHONE
            //-> open DetailActivity (sending the message as EXTRA)
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);

            // else if screenSize = TABLET -> update DetailFragment textView with the message
        } else {
            //TABLET
            //-> update DetailFragment textView with the message
            textView =(TextView)findViewById(R.id.detailTextView);
            assert textView != null;
            textView.setText(message);

        }
    }
}
