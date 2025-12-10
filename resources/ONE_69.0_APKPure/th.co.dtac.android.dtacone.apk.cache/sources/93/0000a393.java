package com.google.android.material.theme.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.R;

/* loaded from: classes4.dex */
public class MaterialThemeOverlay {

    /* renamed from: a */
    public static final int[] f51134a = {16842752, R.attr.theme};

    /* renamed from: b */
    public static final int[] f51135b = {R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static int m43678a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f51134a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return resourceId2;
        }
        return resourceId;
    }

    /* renamed from: b */
    public static int m43677b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f51135b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        boolean z;
        int m43677b = m43677b(context, attributeSet, i, i2);
        if ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == m43677b) {
            z = true;
        } else {
            z = false;
        }
        if (m43677b != 0 && !z) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m43677b);
            int m43678a = m43678a(context, attributeSet);
            if (m43678a != 0) {
                contextThemeWrapper.getTheme().applyStyle(m43678a, true);
            }
            return contextThemeWrapper;
        }
        return context;
    }
}