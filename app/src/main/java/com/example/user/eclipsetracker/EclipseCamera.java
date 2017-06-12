package com.example.user.eclipsetracker;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 6/5/2017.
 */

public class EclipseCamera extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eclipse_camera_class);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.telescopelarge);




        Button btnCamera = (Button)findViewById(R.id.btnCamera);
        imageView = (ImageView)findViewById(R.id.imageView2);

        btnCamera.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        imageView.setImageBitmap(bitmap);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

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

