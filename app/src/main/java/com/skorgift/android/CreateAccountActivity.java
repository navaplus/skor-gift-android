package com.skorgift.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CreateAccountActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_account);

		initData();
		initLayout();
		initEvent();
	}

	protected void initData() {

	}

	protected void initLayout() {

	}

	protected void initEvent() {
		
	}

	//Event
	public void backButtonClicked(View view) {
		onBackPressed();
	}

	public void createAccountButtonClicked(View view) {
		//TODO: Validate input
		//TODO: Call Create Account API
		setResult(Activity.RESULT_OK, new Intent());
		finish();
	}
}
