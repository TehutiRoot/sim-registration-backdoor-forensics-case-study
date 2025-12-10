package es.dmoral.toasty;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;

/* renamed from: es.dmoral.toasty.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10180a {
    /* renamed from: a */
    public static Drawable m31589a(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: b */
    public static void m31588b(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: c */
    public static Drawable m31587c(Context context, int i) {
        return m31586d((NinePatchDrawable) m31589a(context, R.drawable.toast_frame), i);
    }

    /* renamed from: d */
    public static Drawable m31586d(Drawable drawable, int i) {
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        return drawable;
    }
}