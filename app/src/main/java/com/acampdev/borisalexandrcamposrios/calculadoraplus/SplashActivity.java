package com.acampdev.borisalexandrcamposrios.calculadoraplus;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_SCREEN_DELAY = 3500;
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }
    Thread splashTeard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        StarAnimations();
    }

    private void StarAnimations(){
        ImageView imageView = (ImageView) findViewById(R.id.loadingApp);
        Glide.with(this).load(R.drawable.preloader)
                .into(imageView);
        splashTeard = new Thread(){
            @Override
            public  void run(){
                try{
                    int waited =0;
                    // splash screen pause tieme
                    while (waited <SPLASH_SCREEN_DELAY){
                        sleep(100);
                        waited+=100;
                    }
                    Intent intent= new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();
                }catch (Exception e){e.printStackTrace();}
                finally {
                    SplashActivity.this.finish();
                }
            }
        };
        splashTeard.start();
    }
}
