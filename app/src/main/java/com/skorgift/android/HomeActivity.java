package com.skorgift.android;

import android.os.Bundle;
import android.view.View;

public class HomeActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

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

		mHomeImageView.setImageResource(R.drawable.ic_home_on);
		mHomeTextView.setTextColor(getResources().getColor(R.color.color_button));
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

	public void foodBevButtonClicked(View view) {

	}

	public void healthFitnessButtonClicked(View view) {

	}

	public void lifeStyleButtonClicked(View view) {

	}

	public void essentialMoreButtonClicked(View view) {

	}

	public void seeAllGiftButtonClicked(View view) {

	}
}
