package androidx.camera.core;

import android.util.Rational;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(21)
/* loaded from: classes.dex */
public class MeteringPoint {

    /* renamed from: a */
    public float f10948a;

    /* renamed from: b */
    public float f10949b;

    /* renamed from: c */
    public float f10950c;

    /* renamed from: d */
    public Rational f10951d;

    public MeteringPoint(float f, float f2, float f3, Rational rational) {
        this.f10948a = f;
        this.f10949b = f2;
        this.f10950c = f3;
        this.f10951d = rational;
    }

    public float getSize() {
        return this.f10950c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Rational getSurfaceAspectRatio() {
        return this.f10951d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getX() {
        return this.f10948a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getY() {
        return this.f10949b;
    }
}