package p000;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20130gy1 implements FiniteAnimationSpec {

    /* renamed from: a */
    public final FiniteAnimationSpec f62362a;

    /* renamed from: b */
    public final int f62363b;

    public C20130gy1(FiniteAnimationSpec spec, int i) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.f62362a = spec;
        this.f62363b = i;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public VectorizedFiniteAnimationSpec vectorize(TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new V02(this.f62362a.vectorize(converter), this.f62363b * 1000000);
    }
}
