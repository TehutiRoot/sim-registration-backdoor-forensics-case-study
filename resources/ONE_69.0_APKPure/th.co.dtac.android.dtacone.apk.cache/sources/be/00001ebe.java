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
    public final float f10977b;

    /* renamed from: c */
    public final float f10978c;

    public SurfaceOrientedMeteringPointFactory(float f, float f2) {
        this.f10977b = f;
        this.f10978c = f2;
    }

    /* renamed from: a */
    public static Rational m63137a(UseCase useCase) {
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
        return new PointF(f / this.f10977b, f2 / this.f10978c);
    }

    public SurfaceOrientedMeteringPointFactory(float f, float f2, @NonNull UseCase useCase) {
        super(m63137a(useCase));
        this.f10977b = f;
        this.f10978c = f2;
    }
}