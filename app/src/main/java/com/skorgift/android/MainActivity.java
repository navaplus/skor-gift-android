package com.skorgift.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ferry on 8/5/2018.
 */

public class MainActivity extends AppCompatActivity {

	//Layout
	protected ImageView mHomeImageView;
	protected ImageView mGiftsImageView;
	protected ImageView mDiscountsImageView;
	protected ImageView mAccountImageView;
	protected TextView mHomeTextView;
	protected TextView mGiftsTextView;
	protected TextView mDiscountsTextView;
	protected TextView mAccountTextView;

	protected void initData() {

	}

	protected void initLayout() {
		mHomeImageView = findViewById(R.id.imageview_home);
		mGiftsImageView = findViewById(R.id.imageview_gifts);
		mDiscountsImageView = findViewById(R.id.imageview_discounts);
		mAccountImageView = findViewById(R.id.imageview_account);
		mHomeTextView = findViewById(R.id.textview_home);
		mGiftsTextView = findViewById(R.id.textview_gifts);
		mDiscountsTextView = findViewById(R.id.textview_discounts);
		mAccountTextView = findViewById(R.id.textview_account);
	}

	protected void initEvent() {

	}

	//Event
	public void homeButtonClicked(View view) {
		if (!(this instanceof HomeActivity)) {
			Intent intent = new Intent(this, HomeActivity.class);
			startActivity(intent);

			finish();
			overridePendingTransition(0, 0);
		}
	}

	public void giftsButtonClicked(View view) {
		if (!(this instanceof GiftsActivity)) {
			Intent intent = new Intent(this, GiftsActivity.class);
			startActivity(intent);

			finish();
			overridePendingTransition(0, 0);
		}
	}

	public void discountsButtonClicked(View view) {
		if (!(this instanceof DiscountsActivity)) {
			Intent intent = new Intent(this, DiscountsActivity.class);
			startActivity(intent);

			finish();
			overridePendingTransition(0, 0);
		}
	}

	public void accountButtonClicked(View view) {

	}

	public void buyPointsButtonClicked(View view) {

	}

	public void transferButtonClicked(View view) {

	}

	public void sendEGiftButtonClicked(View view) {

	}
}
