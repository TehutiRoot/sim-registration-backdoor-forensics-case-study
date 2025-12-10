package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.resources.MaterialAttributes;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes4.dex */
public class MotionUtils {
    /* renamed from: a */
    public static float m44526a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    public static String m44525b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    public static TimeInterpolator m44524c(String str) {
        if (m44522e(str, "cubic-bezier")) {
            String[] split = m44525b(str, "cubic-bezier").split(",");
            if (split.length == 4) {
                return PathInterpolatorCompat.create(m44526a(split, 0), m44526a(split, 1), m44526a(split, 2), m44526a(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        } else if (m44522e(str, ClientCookie.PATH_ATTR)) {
            return PathInterpolatorCompat.create(PathParser.createPathFromPathData(m44525b(str, ClientCookie.PATH_ATTR)));
        } else {
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
    }

    /* renamed from: d */
    public static boolean m44523d(String str) {
        if (!m44522e(str, "cubic-bezier") && !m44522e(str, ClientCookie.PATH_ATTR)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m44522e(String str, String str2) {
        if (str.startsWith(str2 + "(") && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static int resolveThemeDuration(@NonNull Context context, @AttrRes int i, int i2) {
        return MaterialAttributes.resolveInteger(context, i, i2);
    }

    @NonNull
    public static TimeInterpolator resolveThemeInterpolator(@NonNull Context context, @AttrRes int i, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m44523d(valueOf)) {
                return m44524c(valueOf);
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
