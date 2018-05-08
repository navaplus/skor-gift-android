package com.skorgift.android;

import android.os.Bundle;
import android.view.View;

public class DiscountsActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_discounts);

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

		mDiscountsImageView.setImageResource(R.drawable.ic_discount_on);
		mDiscountsTextView.setTextColor(getResources().getColor(R.color.color_button));
	}

	@Override
	protected void initEvent() {
		super.initEvent();
	}

	//Event
	public void foodBevButtonClicked(View view) {

	}

	public void healthFitnessButtonClicked(View view) {

	}

	public void lifeStyleButtonClicked(View view) {

	}

	public void essentialMoreButtonClicked(View view) {

	}
}
