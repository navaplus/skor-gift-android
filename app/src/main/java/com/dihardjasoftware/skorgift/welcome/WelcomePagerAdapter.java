package com.dihardjasoftware.skorgift.welcome;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dihardjasoftware.skorgift.R;

/**
 * Created by Ferry on 3/5/2018.
 */

public class WelcomePagerAdapter extends FragmentPagerAdapter {

	private Context mContext;
	private WelcomeFragment mFirstFragment;
	private WelcomeFragment mSecondFragment;
	private WelcomeFragment mThirdFragment;

	public WelcomePagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		WelcomeFragment fragment = new WelcomeFragment();

		Bundle args = new Bundle();
		if (position == 0) {
			mFirstFragment = fragment;
			args.putInt(WelcomeFragment.ARGUMENT_BACKGROUND_RESOURCE_ID, R.drawable.shape_welcome1_background);
			args.putInt(WelcomeFragment.ARGUMENT_IMAGE_RESOURCE_ID, R.mipmap.ic_launcher);
			args.putInt(WelcomeFragment.ARGUMENT_TEXT_RESOURCE_ID, R.string.title_welcome1);
		}
		else if (position == 1) {
			mSecondFragment = fragment;
			args.putInt(WelcomeFragment.ARGUMENT_BACKGROUND_RESOURCE_ID, R.drawable.shape_welcome2_background);
			args.putInt(WelcomeFragment.ARGUMENT_IMAGE_RESOURCE_ID, R.mipmap.ic_launcher);
			args.putInt(WelcomeFragment.ARGUMENT_TEXT_RESOURCE_ID, R.string.title_welcome2);
		}
		else if (position == 2) {
			mThirdFragment = fragment;
			args.putInt(WelcomeFragment.ARGUMENT_BACKGROUND_RESOURCE_ID, R.drawable.shape_welcome3_background);
			args.putInt(WelcomeFragment.ARGUMENT_IMAGE_RESOURCE_ID, R.mipmap.ic_launcher);
			args.putInt(WelcomeFragment.ARGUMENT_TEXT_RESOURCE_ID, R.string.title_welcome3);
		}

		fragment.setArguments(args);

		return fragment;
	}

	@Override
	public int getCount() {
		return 3;
	}
}
