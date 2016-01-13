package it.jaschke.alexandria;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by Denis on 13.01.2016.
 */
public class Utilies {
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}
