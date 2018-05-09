package com.skorgift.android.discount;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.skorgift.android.R;
import com.skorgift.android.utils.BitmapHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ferry on 9/5/2018.
 */

public class DiscountAdapter extends BaseAdapter {

	private Context mContext;
	private List<DiscountData> mData = new ArrayList<DiscountData>();

	private OnItemClickedListener mItemClickedListener;

	public DiscountAdapter(Context context) {
		mContext = context;
	}

	public void add(DiscountData item) {
		mData.add(item);
	}

	public void addAll(List<DiscountData> data) {
		mData.addAll(data);
	}

	public void clear() {
		mData.clear();
	}

	@Override
	public int getCount() {
		return mData.size();
	}

	@Override
	public DiscountData getItem(int position) {
		return mData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final GiftPlaceHolder placeHolder;
		if (convertView == null) {
			LayoutInflater infalInflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(R.layout.item_gift_discount, null);

			placeHolder = new GiftPlaceHolder();
			placeHolder.backgroundImageView = (ImageView) convertView.findViewById(R.id.imageview_background);
			placeHolder.iconImageView = (ImageView) convertView.findViewById(R.id.imageview_left);
			placeHolder.titleLabel = (TextView) convertView.findViewById(R.id.textview_title);

			convertView.setTag(placeHolder);

			convertView.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					if (mItemClickedListener != null) {
						int itemPosition = placeHolder.position;
						DiscountData item = getItem(itemPosition);
						mItemClickedListener.onItemClicked(item, itemPosition);
					}
				}
			});
		}
		else {
			placeHolder = (GiftPlaceHolder) convertView.getTag();
		}

		final DiscountData data = getItem(position);
		placeHolder.titleLabel.setText(data.title);

		Resources resources = mContext.getResources();
		int radius = resources.getDimensionPixelSize(R.dimen.dimen_corner_radius);
		if (data.backgroundUrl != null)
			BitmapHelper.loadRoundedRectangleImage(mContext, data.backgroundUrl, placeHolder.backgroundImageView, radius);

		if (data.iconUrl != null)
			BitmapHelper.loadRoundedRectangleImage(mContext, data.iconUrl, placeHolder.iconImageView, radius);

		placeHolder.position = position;

		return convertView;
	}

	//Listener
	public interface OnItemClickedListener {
		void onItemClicked(DiscountData item, int position);
	}

	public void setOnItemClickedListener(OnItemClickedListener listener) {
		mItemClickedListener = listener;
	}

	// View Holder
	public static class GiftPlaceHolder {
		ImageView backgroundImageView;
		ImageView iconImageView;
		TextView titleLabel;
		int position;
	}
}
