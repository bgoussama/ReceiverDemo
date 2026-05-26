package com.example.receiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomEventReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if (MainActivity.CUSTOM_ACTION.equals(intent.getAction())) {

            String message = intent.getStringExtra("message");

            Toast.makeText(
                    context,
                    "Custom reçu : " + message,
                    Toast.LENGTH_LONG
            ).show();
        }
    }
}