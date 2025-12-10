package com.google.android.material.internal;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;
import com.google.android.material.color.MaterialColors;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class EdgeToEdgeUtils {
    /* renamed from: a */
    public static int m44611a(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return ColorUtils.setAlphaComponent(MaterialColors.getColor(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, 16843858, -16777216);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z) {
        applyEdgeToEdge(window, z, null, null);
    }

    /* renamed from: b */
    public static int m44610b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 23) {
            return ColorUtils.setAlphaComponent(MaterialColors.getColor(context, 16843857, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, 16843857, -16777216);
    }

    /* renamed from: c */
    public static boolean m44609c(int i, boolean z) {
        if (!MaterialColors.isColorLight(i) && (i != 0 || !z)) {
            return false;
        }
        return true;
    }

    public static void setLightNavigationBar(@NonNull Window window, boolean z) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z);
    }

    public static void setLightStatusBar(@NonNull Window window, boolean z) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2) {
        boolean z2 = false;
        boolean z3 = num == null || num.intValue() == 0;
        z2 = (num2 == null || num2.intValue() == 0) ? true : true;
        if (z3 || z2) {
            int color = MaterialColors.getColor(window.getContext(), 16842801, -16777216);
            if (z3) {
                num = Integer.valueOf(color);
            }
            if (z2) {
                num2 = Integer.valueOf(color);
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window, !z);
        int m44610b = m44610b(window.getContext(), z);
        int m44611a = m44611a(window.getContext(), z);
        window.setStatusBarColor(m44610b);
        window.setNavigationBarColor(m44611a);
        setLightStatusBar(window, m44609c(m44610b, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, m44609c(m44611a, MaterialColors.isColorLight(num2.intValue())));
    }
}
