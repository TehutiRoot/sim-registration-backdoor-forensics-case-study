package p000;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19667dz1 implements FiniteAnimationSpec {

    /* renamed from: a */
    public final FiniteAnimationSpec f61438a;

    /* renamed from: b */
    public final int f61439b;

    public C19667dz1(FiniteAnimationSpec spec, int i) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.f61438a = spec;
        this.f61439b = i;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public VectorizedFiniteAnimationSpec vectorize(TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new S12(this.f61438a.vectorize(converter), this.f61439b * 1000000);
    }
}