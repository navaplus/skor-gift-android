package com.dihardjasoftware.skorgift.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.dihardjasoftware.skorgift.R;

import java.util.ArrayList;

import retrofit2.Call;

/**
 * Created by Ferry on 3/5/2018.
 */

public class WelcomeFragment extends android.support.v4.app.Fragment {

	//Layout
	private LinearLayout mWelcomeLayout;
	private ImageView mWelcomeImageView;
	private TextView mWelcomeTextView;

	//Data
	private int mBackgroundResourceId;
	private int mImageResourceId;
	private int mTextResourceId;

	//Argument
	public static final String ARGUMENT_BACKGROUND_RESOURCE_ID = "ARGUMENT_BACKGROUND_RES_ID";
	public static final String ARGUMENT_IMAGE_RESOURCE_ID = "ARGUMENT_IMAGE_RES_ID";
	public static final String ARGUMENT_TEXT_RESOURCE_ID = "ARGUMENT_TEXT_RES_ID";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_welcome, container, false);

		initData();
		initLayout(rootView);
		initEvent();

		return rootView;
	}

	private void initData() {
		Bundle args = getArguments();
		try {
			mBackgroundResourceId = args.getInt(ARGUMENT_BACKGROUND_RESOURCE_ID);
			mImageResourceId = args.getInt(ARGUMENT_IMAGE_RESOURCE_ID);
			mTextResourceId = args.getInt(ARGUMENT_TEXT_RESOURCE_ID);
		}
		catch (Exception e) {}
	}

	private void initLayout(View rootView) {
		//Layout
		mWelcomeLayout = rootView.findViewById(R.id.layout_root);
		mWelcomeImageView = rootView.findViewById(R.id.imageview_welcome);
		mWelcomeTextView = rootView.findViewById(R.id.textview_welcome);

		//Set resource
		mWelcomeLayout.setBackgroundResource(mBackgroundResourceId);
		mWelcomeImageView.setImageResource(mImageResourceId);
		mWelcomeTextView.setText(mTextResourceId);
	}

	private void initEvent() {

	}
}
