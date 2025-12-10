package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class GravityCompat {
    public static final int END = 8388613;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    /* renamed from: androidx.core.view.GravityCompat$a */
    /* loaded from: classes2.dex */
    public static class C4112a {
        @DoNotInline
        /* renamed from: a */
        public static void m57001a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57000b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56999c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    public static void apply(int i, int i2, int i3, @NonNull Rect rect, @NonNull Rect rect2, int i4) {
        C4112a.m57000b(i, i2, i3, rect, rect2, i4);
    }

    public static void applyDisplay(int i, @NonNull Rect rect, @NonNull Rect rect2, int i2) {
        C4112a.m56999c(i, rect, rect2, i2);
    }

    public static int getAbsoluteGravity(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static void apply(int i, int i2, int i3, @NonNull Rect rect, int i4, int i5, @NonNull Rect rect2, int i6) {
        C4112a.m57001a(i, i2, i3, rect, i4, i5, rect2, i6);
    }
}
