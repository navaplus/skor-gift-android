package com.skorgift.android;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

	// Splash screen timer
    protected static int SPLASH_TIME_OUT = 2000;
	
	protected View mActivityBackground;
	protected ImageView mSplashLogo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);

		//Prevent splash to show twice
		if (!isTaskRoot()
				&& getIntent().hasCategory(Intent.CATEGORY_LAUNCHER)
				&& getIntent().getAction() != null
				&& getIntent().getAction().equals(Intent.ACTION_MAIN)) {

			finish();
			return;
		}

		initLayout();
		initialize();
		
		new Handler().postDelayed(new Runnable() {
			 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo_big / company
             */
 
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
            	onDismiss();
            	
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
	}
	
	protected void initLayout() {
		mActivityBackground = (View) findViewById(R.id.activity_background);
		mSplashLogo = (ImageView) findViewById(R.id.imageview_splash);
	}
	
	protected void initialize() {
		//mActivityBackground.setBackgroundColor(0xFF6A6A6A);
		//mSplashLogo.setImageResource(R.drawable.launch_image);

		//Cancel all notification
		NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
		notificationManager.cancelAll();
	}
	
	protected void onDismiss() {
		//TODO: Validate login
		boolean hasLogin = false;
		if (hasLogin)
			startActivity(new Intent(this, HomeActivity.class));
		else
			startActivity(new Intent(this, WelcomeActivity.class));
	}
}
