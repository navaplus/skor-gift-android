package com.skorgift.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.skorgift.android.welcome.WelcomePagerAdapter;

public class WelcomeActivity extends AppCompatActivity {

	//Layout
	private ViewPager mWelcomeViewPager;
	private TabLayout mWelcomeTabLayout;

	//Adapter
	private WelcomePagerAdapter mPagerAdapter;

	//Action
	public static final int ACTION_CREATE_ACCOUNT = 1;
	public static final int ACTION_SIGN_IN = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);

		initData();
		initLayout();
		initEvent();
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == ACTION_CREATE_ACCOUNT) {
			if (resultCode == Activity.RESULT_OK) {
				//TODO: Create account success action
				startActivity(new Intent(this, HomeActivity.class));
				finish();
			}
		}
		else if (requestCode == ACTION_SIGN_IN) {
			if (resultCode == Activity.RESULT_OK) {
				//TODO: Sign In success action
				startActivity(new Intent(this, HomeActivity.class));
				finish();
			}
		}
	}

	protected void initData() {
		mPagerAdapter = new WelcomePagerAdapter(this, getSupportFragmentManager());
	}

	protected void initLayout() {
		mWelcomeViewPager = findViewById(R.id.viewpager_welcome);
		mWelcomeViewPager.setAdapter(mPagerAdapter);

		mWelcomeTabLayout = findViewById(R.id.tablayout_welcome);
		mWelcomeTabLayout.setupWithViewPager(mWelcomeViewPager, true);
	}

	protected void initEvent() {

	}

	//Event
	public void createAccountButtonClicked(View view) {
		startActivityForResult(new Intent(this, CreateAccountActivity.class), ACTION_CREATE_ACCOUNT);
	}

	public void signInButtonClicked(View view) {
		startActivityForResult(new Intent(this, SignInActivity.class), ACTION_SIGN_IN);
	}
}
