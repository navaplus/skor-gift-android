package com.skorgift.android;

import android.content.Context;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class SKORGiftFirebaseInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        //TODO: Save token
        //Storage.instance.saveToken(refreshedToken);

        requestSendToken(this, refreshedToken);
    }

    public static void requestSendToken(Context context, String token) {

    }
}
