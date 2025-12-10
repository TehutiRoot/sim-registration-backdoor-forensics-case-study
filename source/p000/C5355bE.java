package p000;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedDecayAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bE */
/* loaded from: classes.dex */
public final class C5355bE implements DecayAnimationSpec {

    /* renamed from: a */
    public final FloatDecayAnimationSpec f38970a;

    public C5355bE(FloatDecayAnimationSpec floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f38970a = floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    public VectorizedDecayAnimationSpec vectorize(TwoWayConverter typeConverter) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new U02(this.f38970a);
    }
}
