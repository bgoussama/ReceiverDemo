package com.example.receiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootReceiver extends BroadcastReceiver {

    private static final String TAG = "BootReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {

            Log.d(TAG, "BOOT_COMPLETED reçu : Receiver statique activé");

            Toast.makeText(
                    context,
                    "Téléphone démarré - Receiver statique activé",
                    Toast.LENGTH_LONG
            ).show();
        }
    }
}