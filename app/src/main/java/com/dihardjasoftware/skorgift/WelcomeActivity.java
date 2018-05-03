package com.dihardjasoftware.skorgift;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.dihardjasoftware.skorgift.welcome.WelcomePagerAdapter;

public class WelcomeActivity extends AppCompatActivity {

	//Layout
	private ViewPager mWelcomeViewPager;
	private TabLayout mWelcomeTabLayout;

	//Adapter
	private WelcomePagerAdapter mPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);

		initData();
		initLayout();
		initEvent();
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
}
