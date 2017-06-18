package com.example.user.eclipsetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by User on 6/5/2017.
 */

public class EclipseSocial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eclipse_social_class);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.telescopelarge);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){

            case R.id.action_home:
                Intent intentHome = new Intent(this, MainActivity.class);

                startActivity(intentHome);
                return true;

            case R.id.action_camera:
                Intent intentCamera = new Intent(this, EclipseCamera.class);

                startActivity(intentCamera);
                return true;
            case R.id.action_map:
                Intent intentMap = new Intent(this, EclipseMap.class);

                startActivity(intentMap);
                return true;
            case R.id.action_info:
                Intent intentInfo = new Intent(this, EclipseInfo.class);

                startActivity(intentInfo);
                return true;
            case R.id.action_social:
                Intent intentSocial = new Intent(this, EclipseSocial.class);

                startActivity(intentSocial);
                return true;
            case R.id.action_feed:
                Intent intentFeed = new Intent(this, EclipseFeed.class);

                startActivity(intentFeed);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }



}
