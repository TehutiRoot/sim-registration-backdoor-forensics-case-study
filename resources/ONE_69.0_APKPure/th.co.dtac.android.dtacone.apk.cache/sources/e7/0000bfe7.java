package com.roughike.bottombar;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.roughike.bottombar.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9794c {
    /* renamed from: a */
    public static int m33208a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m33207b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i3 = displayMetrics2.heightPixels;
        if (i2 - displayMetrics2.widthPixels <= 0 && i - i3 <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m33206c(Context context) {
        return context.getResources().getBoolean(R.bool.bb_bottom_bar_is_portrait_mode);
    }

    /* renamed from: d */
    public static boolean m33205d(Context context) {
        if (m33206c(context) && m33207b(context)) {
            return true;
        }
        return false;
    }
}