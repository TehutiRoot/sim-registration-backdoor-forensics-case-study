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
    public static class C4211a {
        /* renamed from: a */
        public static Drawable m56546a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: androidx.core.widget.CheckedTextViewCompat$b */
    /* loaded from: classes2.dex */
    public static class C4212b {
        /* renamed from: a */
        public static ColorStateList m56545a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m56544b(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        /* renamed from: c */
        public static void m56543c(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m56542d(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @Nullable
    public static Drawable getCheckMarkDrawable(@NonNull CheckedTextView checkedTextView) {
        return C4211a.m56546a(checkedTextView);
    }

    @Nullable
    public static ColorStateList getCheckMarkTintList(@NonNull CheckedTextView checkedTextView) {
        return C4212b.m56545a(checkedTextView);
    }

    @Nullable
    public static PorterDuff.Mode getCheckMarkTintMode(@NonNull CheckedTextView checkedTextView) {
        return C4212b.m56544b(checkedTextView);
    }

    public static void setCheckMarkTintList(@NonNull CheckedTextView checkedTextView, @Nullable ColorStateList colorStateList) {
        C4212b.m56543c(checkedTextView, colorStateList);
    }

    public static void setCheckMarkTintMode(@NonNull CheckedTextView checkedTextView, @Nullable PorterDuff.Mode mode) {
        C4212b.m56542d(checkedTextView, mode);
    }
}
