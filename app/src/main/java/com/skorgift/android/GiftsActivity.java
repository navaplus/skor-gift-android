package com.skorgift.android;

import android.os.Bundle;
import android.view.View;

public class GiftsActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gifts);

		initData();
		initLayout();
		initEvent();
	}

	@Override
	protected void initData() {
		super.initData();
	}

	@Override
	protected void initLayout() {
		super.initLayout();

		mGiftsImageView.setImageResource(R.drawable.ic_gift_on);
		mGiftsTextView.setTextColor(getResources().getColor(R.color.color_button));
	}

	@Override
	protected void initEvent() {
		super.initEvent();
	}

	//Event
	public void topupButtonClicked(View view) {

	}

	public void eVoucherButtonClicked(View view) {

	}

	public void voucherButtonClicked(View view) {

	}

	public void eCommerceMoreButtonClicked(View view) {

	}
}
