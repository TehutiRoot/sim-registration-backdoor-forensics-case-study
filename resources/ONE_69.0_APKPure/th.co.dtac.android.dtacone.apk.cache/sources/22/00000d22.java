package p000;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: Ns0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC18178Ns0 {
    /* renamed from: a */
    public static int m67191a(Context context, float f) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        try {
            return (int) (f * displayMetrics.density);
        } catch (NoSuchFieldError unused) {
            return (int) TypedValue.applyDimension(1, f, displayMetrics);
        }
    }

    /* renamed from: b */
    public static int m67190b(Context context, int i) {
        return m67187e(context, i).data;
    }

    /* renamed from: c */
    public static int m67189c(Context context, int i) {
        return m67187e(context, i).resourceId;
    }

    /* renamed from: d */
    public static int m67188d(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    /* renamed from: e */
    public static TypedValue m67187e(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    /* renamed from: f */
    public static int m67186f(Context context, int i) {
        return Math.round(i / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: g */
    public static void m67185g(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }
}