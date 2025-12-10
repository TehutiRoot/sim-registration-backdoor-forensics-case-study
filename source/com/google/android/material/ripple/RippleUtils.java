package com.google.android.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class RippleUtils {
    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean USE_FRAMEWORK_RIPPLE = true;

    /* renamed from: a */
    public static final int[] f50492a = {16842919};

    /* renamed from: b */
    public static final int[] f50493b = {16843623, 16842908};

    /* renamed from: c */
    public static final int[] f50494c = {16842908};

    /* renamed from: d */
    public static final int[] f50495d = {16843623};

    /* renamed from: e */
    public static final int[] f50496e = {16842913, 16842919};

    /* renamed from: f */
    public static final int[] f50497f = {16842913, 16843623, 16842908};

    /* renamed from: g */
    public static final int[] f50498g = {16842913, 16842908};

    /* renamed from: h */
    public static final int[] f50499h = {16842913, 16843623};

    /* renamed from: i */
    public static final int[] f50500i = {16842913};

    /* renamed from: j */
    public static final int[] f50501j = {16842910, 16842919};

    /* renamed from: k */
    public static final String f50502k = RippleUtils.class.getSimpleName();

    /* renamed from: com.google.android.material.ripple.RippleUtils$a */
    /* loaded from: classes4.dex */
    public static class C7036a {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        /* renamed from: b */
        public static Drawable m44389b(@NonNull Context context, @InterfaceC2055Px int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(MaterialColors.getColorStateList(context, R.attr.colorControlHighlight, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i, i, i, i));
        }
    }

    /* renamed from: a */
    public static int m44392a(int i) {
        return ColorUtils.setAlphaComponent(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: b */
    public static int m44391b(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (USE_FRAMEWORK_RIPPLE) {
            return m44392a(i);
        }
        return i;
    }

    @NonNull
    public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (USE_FRAMEWORK_RIPPLE) {
            int[] iArr = f50494c;
            return new ColorStateList(new int[][]{f50500i, iArr, StateSet.NOTHING}, new int[]{m44391b(colorStateList, f50496e), m44391b(colorStateList, iArr), m44391b(colorStateList, f50492a)});
        }
        int[] iArr2 = f50496e;
        int[] iArr3 = f50497f;
        int[] iArr4 = f50498g;
        int[] iArr5 = f50499h;
        int[] iArr6 = f50492a;
        int[] iArr7 = f50493b;
        int[] iArr8 = f50494c;
        int[] iArr9 = f50495d;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f50500i, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{m44391b(colorStateList, iArr2), m44391b(colorStateList, iArr3), m44391b(colorStateList, iArr4), m44391b(colorStateList, iArr5), 0, m44391b(colorStateList, iArr6), m44391b(colorStateList, iArr7), m44391b(colorStateList, iArr8), m44391b(colorStateList, iArr9), 0});
    }

    @NonNull
    @RequiresApi(21)
    public static Drawable createOvalRippleLollipop(@NonNull Context context, @InterfaceC2055Px int i) {
        return C7036a.m44389b(context, i);
    }

    @NonNull
    public static ColorStateList sanitizeRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f50501j, 0)) != 0) {
                Log.w(f50502k, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean shouldDrawRippleCompat(@NonNull int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
