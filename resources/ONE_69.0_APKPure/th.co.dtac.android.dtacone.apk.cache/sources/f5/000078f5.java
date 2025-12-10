package p000;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedDecayAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cE */
/* loaded from: classes.dex */
public final class C5416cE implements DecayAnimationSpec {

    /* renamed from: a */
    public final FloatDecayAnimationSpec f39370a;

    public C5416cE(FloatDecayAnimationSpec floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f39370a = floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    public VectorizedDecayAnimationSpec vectorize(TwoWayConverter typeConverter) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new R12(this.f39370a);
    }
}