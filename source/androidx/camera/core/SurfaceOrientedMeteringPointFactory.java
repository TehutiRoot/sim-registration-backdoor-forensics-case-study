package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(21)
/* loaded from: classes.dex */
public class SurfaceOrientedMeteringPointFactory extends MeteringPointFactory {

    /* renamed from: b */
    public final float f10889b;

    /* renamed from: c */
    public final float f10890c;

    public SurfaceOrientedMeteringPointFactory(float f, float f2) {
        this.f10889b = f;
        this.f10890c = f2;
    }

    /* renamed from: a */
    public static Rational m63189a(UseCase useCase) {
        if (useCase == null) {
            return null;
        }
        Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
        if (attachedSurfaceResolution != null) {
            return new Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        throw new IllegalStateException("UseCase " + useCase + " is not bound.");
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PointF convertPoint(float f, float f2) {
        return new PointF(f / this.f10889b, f2 / this.f10890c);
    }

    public SurfaceOrientedMeteringPointFactory(float f, float f2, @NonNull UseCase useCase) {
        super(m63189a(useCase));
        this.f10889b = f;
        this.f10890c = f2;
    }
}
