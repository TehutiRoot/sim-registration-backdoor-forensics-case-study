package jp.wasabeef.glide.transformations.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class Utils {
    public static Drawable getMaskDrawable(Context context, int i) {
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalArgumentException("maskId is invalid");
    }

    public static int toDp(int i) {
        return i * ((int) Resources.getSystem().getDisplayMetrics().density);
    }
}
