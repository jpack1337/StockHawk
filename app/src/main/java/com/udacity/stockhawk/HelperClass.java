package com.udacity.stockhawk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.content.ContextCompat;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by jeremypacker on 4/26/17.
 */

public class HelperClass {

   public void setStatusBarColor(Activity activity){
        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(activity, R.color.colorPrimaryDark));
    }

    public void showPromptToUser(Context context, String Title, String Message, String Positive){
        new AlertDialog.Builder(context)
                .setTitle(Title)
                .setMessage(Message)
                .setPositiveButton(Positive, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        // continue with delete
                    }
                })

                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();


    }
}
