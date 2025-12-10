package p000;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.animation.graphics.vector.AnimatorAnimationSpecsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: S12 */
/* loaded from: classes.dex */
public final class S12 implements VectorizedFiniteAnimationSpec {

    /* renamed from: a */
    public final VectorizedFiniteAnimationSpec f5712a;

    /* renamed from: b */
    public final long f5713b;

    public S12(VectorizedFiniteAnimationSpec animation, long j) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f5712a = animation;
        this.f5713b = j;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f5713b;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return N12.m67298a(this, animationVector, animationVector2, animationVector3);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getValueFromNanos(long j, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f5712a.getValueFromNanos(this.f5713b - j, targetValue, initialValue, initialVelocity);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getVelocityFromNanos(long j, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        AnimationVector m61607a;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        m61607a = AnimatorAnimationSpecsKt.m61607a(this.f5712a.getVelocityFromNanos(this.f5713b - j, targetValue, initialValue, initialVelocity));
        return m61607a;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return Q12.m66860a(this);
    }
}