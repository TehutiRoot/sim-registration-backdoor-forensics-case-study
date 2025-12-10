package p000;

import android.graphics.drawable.Drawable;

/* renamed from: Bz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17413Bz1 extends Drawable {

    /* renamed from: a */
    public static final double f606a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m69027a(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - f606a) * f2));
        }
        return f;
    }

    /* renamed from: b */
    public static float m69026b(float f, float f2, boolean z) {
        if (z) {
            return (float) ((f * 1.5f) + ((1.0d - f606a) * f2));
        }
        return f * 1.5f;
    }
}