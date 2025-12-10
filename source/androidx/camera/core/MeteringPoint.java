package androidx.camera.core;

import android.util.Rational;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(21)
/* loaded from: classes.dex */
public class MeteringPoint {

    /* renamed from: a */
    public float f10860a;

    /* renamed from: b */
    public float f10861b;

    /* renamed from: c */
    public float f10862c;

    /* renamed from: d */
    public Rational f10863d;

    public MeteringPoint(float f, float f2, float f3, Rational rational) {
        this.f10860a = f;
        this.f10861b = f2;
        this.f10862c = f3;
        this.f10863d = rational;
    }

    public float getSize() {
        return this.f10862c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Rational getSurfaceAspectRatio() {
        return this.f10863d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getX() {
        return this.f10860a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getY() {
        return this.f10861b;
    }
}
