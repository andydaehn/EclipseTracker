package com.example.user.eclipsetracker;


import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;


/**
 * Created by User on 6/5/2017.
 */

public class EclipseFeed extends AppCompatActivity implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener{


    private MediaPlayer mediaPlayer;
    private SurfaceHolder vidHolder;
    private SurfaceView vidSurface;
    String vidAddress = "https://ia902702.us.archive.org/30/items/ISSEarthviews/DI_2014008_106011.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eclipse_feed_class);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.telescopelarge);

        vidSurface = (SurfaceView) findViewById(R.id.surfView);
        vidHolder = vidSurface.getHolder();
        vidHolder.addCallback(this);


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


    @Override
    public void onPrepared(MediaPlayer mp) {
        mediaPlayer.start();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

        try {
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setDisplay(vidHolder);
            mediaPlayer.setDataSource(vidAddress);
            mediaPlayer.prepare();
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
