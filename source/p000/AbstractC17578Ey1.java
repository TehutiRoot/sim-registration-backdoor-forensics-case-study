package p000;

import android.graphics.drawable.Drawable;

/* renamed from: Ey1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17578Ey1 extends Drawable {

    /* renamed from: a */
    public static final double f1464a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m68435a(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - f1464a) * f2));
        }
        return f;
    }

    /* renamed from: b */
    public static float m68434b(float f, float f2, boolean z) {
        if (z) {
            return (float) ((f * 1.5f) + ((1.0d - f1464a) * f2));
        }
        return f * 1.5f;
    }
}
