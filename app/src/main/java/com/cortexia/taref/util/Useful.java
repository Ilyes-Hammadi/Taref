package com.cortexia.taref.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.transition.Explode;

/**
 * Created by ilyes on 19/08/15.
 */
public class Useful {

    public static final String TAG = "TAG";

    /**
     * Sets notification.
     *
     * @param context the context
     * @param iconRes the icon res
     * @param title   the title
     * @param text    the text
     */
    public static void setNotification(Context context, int iconRes, String title, String text) {
        // Setup Notification
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context.getApplicationContext())
                        .setSmallIcon(iconRes)
                        .setContentTitle(title)
                        .setContentText(text);

        // Sets an ID for the notification
        int mNotificationId = 1;
        // Gets an instance of the NotificationManager service
        NotificationManager mNotifyMgr = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        // Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
    }

    /**
     * Sets notification with intent.
     *
     * @param context        the context
     * @param targetActivity the target activity
     * @param iconRes        the icon resource
     * @param title          the title
     * @param text           the text
     */
    public static void setNotificationWithIntent(Context context, Class<?> targetActivity, int iconRes, String title, String text) {
        // Setup Notification
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context.getApplicationContext())
                        .setSmallIcon(iconRes)
                        .setContentTitle(title)
                        .setContentText(text);


        Intent resultIntent = new Intent(context, targetActivity);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(pendingIntent);

        // Sets an ID for the notification
        int mNotificationId = 001;
        // Gets an instance of the NotificationManager service
        NotificationManager mNotifyMgr = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        // Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());

    }


    public static void splashScreen(final Activity splashScreenActivity, final Class<?> targetActivity, int splashTime) {
        new Handler().postDelayed(new Runnable() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void run() {
                splashScreenActivity.getWindow().setExitTransition(new Explode());
                Intent intent = new Intent(splashScreenActivity.getApplicationContext(), targetActivity);
                splashScreenActivity.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(splashScreenActivity).toBundle());
                splashScreenActivity.finish();
            }
        }, splashTime);
    }


}
