package com.example.user.eclipsetracker;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
            case R.id.action_feed:
                Intent intentFeed = new Intent(this, EclipseFeed.class);

                startActivity(intentFeed);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }


    public void liveFeed(View view){

        Intent intent = new Intent(this, EclipseFeed.class);

        startActivity(intent);
    }

    public void map(View view){

        Intent intent = new Intent(this, EclipseMap.class);

        startActivity(intent);

    }

    public void camera(View view){

        Intent intent = new Intent(this, EclipseCamera.class);

        startActivity(intent);

    }


}
