package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class CompoundButtonCompat {

    /* renamed from: a */
    public static Field f34369a;

    /* renamed from: b */
    public static boolean f34370b;

    /* renamed from: androidx.core.widget.CompoundButtonCompat$a */
    /* loaded from: classes2.dex */
    public static class C4213a {
        @DoNotInline
        /* renamed from: a */
        public static ColorStateList m56541a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @DoNotInline
        /* renamed from: b */
        public static PorterDuff.Mode m56540b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56539c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m56538d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.CompoundButtonCompat$b */
    /* loaded from: classes2.dex */
    public static class C4214b {
        @DoNotInline
        /* renamed from: a */
        public static Drawable m56537a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @Nullable
    public static Drawable getButtonDrawable(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4214b.m56537a(compoundButton);
        }
        if (!f34370b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f34369a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f34370b = true;
        }
        Field field = f34369a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f34369a = null;
            }
        }
        return null;
    }

    @Nullable
    public static ColorStateList getButtonTintList(@NonNull CompoundButton compoundButton) {
        return C4213a.m56541a(compoundButton);
    }

    @Nullable
    public static PorterDuff.Mode getButtonTintMode(@NonNull CompoundButton compoundButton) {
        return C4213a.m56540b(compoundButton);
    }

    public static void setButtonTintList(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        C4213a.m56539c(compoundButton, colorStateList);
    }

    public static void setButtonTintMode(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode mode) {
        C4213a.m56538d(compoundButton, mode);
    }
}
