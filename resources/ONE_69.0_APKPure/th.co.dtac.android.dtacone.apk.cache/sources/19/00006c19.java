package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class CheckedTextViewCompat {

    /* renamed from: androidx.core.widget.CheckedTextViewCompat$a */
    /* loaded from: classes2.dex */
    public static class C4193a {
        /* renamed from: a */
        public static Drawable m56496a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: androidx.core.widget.CheckedTextViewCompat$b */
    /* loaded from: classes2.dex */
    public static class C4194b {
        /* renamed from: a */
        public static ColorStateList m56495a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m56494b(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        /* renamed from: c */
        public static void m56493c(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m56492d(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @Nullable
    public static Drawable getCheckMarkDrawable(@NonNull CheckedTextView checkedTextView) {
        return C4193a.m56496a(checkedTextView);
    }

    @Nullable
    public static ColorStateList getCheckMarkTintList(@NonNull CheckedTextView checkedTextView) {
        return C4194b.m56495a(checkedTextView);
    }

    @Nullable
    public static PorterDuff.Mode getCheckMarkTintMode(@NonNull CheckedTextView checkedTextView) {
        return C4194b.m56494b(checkedTextView);
    }

    public static void setCheckMarkTintList(@NonNull CheckedTextView checkedTextView, @Nullable ColorStateList colorStateList) {
        C4194b.m56493c(checkedTextView, colorStateList);
    }

    public static void setCheckMarkTintMode(@NonNull CheckedTextView checkedTextView, @Nullable PorterDuff.Mode mode) {
        C4194b.m56492d(checkedTextView, mode);
    }
}