package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.graphics.ColorUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class ThemeUtils {

    /* renamed from: a */
    public static final ThreadLocal f9931a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f9932b = {-16842910};

    /* renamed from: c */
    public static final int[] f9933c = {16842908};

    /* renamed from: d */
    public static final int[] f9934d = {16843518};

    /* renamed from: e */
    public static final int[] f9935e = {16842919};

    /* renamed from: f */
    public static final int[] f9936f = {16842912};

    /* renamed from: g */
    public static final int[] f9937g = {16842913};

    /* renamed from: h */
    public static final int[] f9938h = {-16842919, -16842908};

    /* renamed from: i */
    public static final int[] f9939i = new int[0];

    /* renamed from: j */
    public static final int[] f9940j = new int[1];

    /* renamed from: a */
    public static int m64156a(Context context, int i, float f) {
        int themeAttrColor = getThemeAttrColor(context, i);
        return ColorUtils.setAlphaComponent(themeAttrColor, Math.round(Color.alpha(themeAttrColor) * f));
    }

    /* renamed from: b */
    public static TypedValue m64155b() {
        ThreadLocal threadLocal = f9931a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static void checkAppCompatTheme(@NonNull View view, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.styleable.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static ColorStateList createDisabledStateList(int i, int i2) {
        return new ColorStateList(new int[][]{f9932b, f9939i}, new int[]{i2, i});
    }

    public static int getDisabledThemeAttrColor(@NonNull Context context, int i) {
        ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(f9932b, themeAttrColorStateList.getDefaultColor());
        }
        TypedValue m64155b = m64155b();
        context.getTheme().resolveAttribute(16842803, m64155b, true);
        return m64156a(context, i, m64155b.getFloat());
    }

    public static int getThemeAttrColor(@NonNull Context context, int i) {
        int[] iArr = f9940j;
        iArr[0] = i;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Nullable
    public static ColorStateList getThemeAttrColorStateList(@NonNull Context context, int i) {
        int[] iArr = f9940j;
        iArr[0] = i;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColorStateList(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
