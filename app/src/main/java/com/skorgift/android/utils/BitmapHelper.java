package com.skorgift.android.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * Created by Ferry on 7/5/2018.
 */

public class BitmapHelper {
	public static void loadRoundedRectangleImage(Context context, String url, ImageView into, int radius) {
		Glide.with(context).load(url).apply(RequestOptions.bitmapTransform(new RoundedCornersTransformation(radius, 0, RoundedCornersTransformation.CornerType.ALL))).into(into);
	}
}
