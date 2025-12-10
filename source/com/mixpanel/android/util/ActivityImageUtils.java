package com.mixpanel.android.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;

/* loaded from: classes5.dex */
public class ActivityImageUtils {
    public static int getHighlightColor(int i) {
        Color.colorToHSV(i, r0);
        float[] fArr = {0.0f, 0.0f, 0.3f};
        return Color.HSVToColor(242, fArr);
    }

    public static int getHighlightColorFromBackground(Activity activity) {
        int i;
        Bitmap scaledScreenshot = getScaledScreenshot(activity, 1, 1, false);
        if (scaledScreenshot != null) {
            i = scaledScreenshot.getPixel(0, 0);
        } else {
            i = -16777216;
        }
        return getHighlightColor(i);
    }

    public static int getHighlightColorFromBitmap(Bitmap bitmap) {
        int i;
        if (bitmap != null) {
            i = Bitmap.createScaledBitmap(bitmap, 1, 1, false).getPixel(0, 0);
        } else {
            i = -16777216;
        }
        return getHighlightColor(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap getScaledScreenshot(android.app.Activity r4, int r5, int r6, boolean r7) {
        /*
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r0)
            android.view.View r4 = r4.getRootView()
            boolean r0 = r4.isDrawingCacheEnabled()
            r1 = 1
            r4.setDrawingCacheEnabled(r1)
            r4.buildDrawingCache(r1)
            android.graphics.Bitmap r1 = r4.getDrawingCache()
            r2 = 0
            if (r1 == 0) goto L47
            int r3 = r1.getWidth()
            if (r3 <= 0) goto L47
            int r3 = r1.getHeight()
            if (r3 <= 0) goto L47
            if (r7 == 0) goto L37
            int r7 = r1.getWidth()
            int r5 = r7 / r5
            int r7 = r1.getHeight()
            int r6 = r7 / r6
        L37:
            if (r5 <= 0) goto L47
            if (r6 <= 0) goto L47
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r1, r5, r6, r2)     // Catch: java.lang.OutOfMemoryError -> L40
            goto L48
        L40:
            java.lang.String r5 = "MixpanelAPI.ActImgUtils"
            java.lang.String r6 = "Not enough memory to produce scaled image, returning a null screenshot"
            com.mixpanel.android.util.MPLog.m33455i(r5, r6)
        L47:
            r5 = 0
        L48:
            if (r0 != 0) goto L4d
            r4.setDrawingCacheEnabled(r2)
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.util.ActivityImageUtils.getScaledScreenshot(android.app.Activity, int, int, boolean):android.graphics.Bitmap");
    }
}
