package com.thenoob.blackbox.tiles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class Splash extends Activity implements AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Animation fadein;
        fadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.logo);
        ImageView logo = (ImageView)findViewById(R.id.splash);
        fadein.setAnimationListener(this);
        logo.startAnimation(fadein);
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Handler x = new Handler();
        x.postDelayed(new FireMenu(), (long) 1*1000);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    class FireMenu implements Runnable {
        @Override
        public void run() {
            startActivity(new Intent(getApplication(), Home.class));
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }
}
