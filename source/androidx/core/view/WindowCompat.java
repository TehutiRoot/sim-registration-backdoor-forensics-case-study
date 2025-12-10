package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    /* renamed from: androidx.core.view.WindowCompat$a */
    /* loaded from: classes2.dex */
    public static class C4155a {
        @DoNotInline
        /* renamed from: a */
        public static void m56751a(@NonNull Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* renamed from: androidx.core.view.WindowCompat$b */
    /* loaded from: classes2.dex */
    public static class C4156b {
        @DoNotInline
        /* renamed from: a */
        public static <T> T m56750a(Window window, int i) {
            return (T) window.requireViewById(i);
        }
    }

    /* renamed from: androidx.core.view.WindowCompat$c */
    /* loaded from: classes2.dex */
    public static class C4157c {
        @DoNotInline
        /* renamed from: a */
        public static void m56749a(@NonNull Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @NonNull
    public static WindowInsetsControllerCompat getInsetsController(@NonNull Window window, @NonNull View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Window window, @IdRes int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C4156b.m56750a(window, i);
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C4157c.m56749a(window, z);
        } else {
            C4155a.m56751a(window, z);
        }
    }
}
