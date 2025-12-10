package p000;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.animation.graphics.vector.AnimatorAnimationSpecsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: V02 */
/* loaded from: classes.dex */
public final class V02 implements VectorizedFiniteAnimationSpec {

    /* renamed from: a */
    public final VectorizedFiniteAnimationSpec f6517a;

    /* renamed from: b */
    public final long f6518b;

    public V02(VectorizedFiniteAnimationSpec animation, long j) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f6517a = animation;
        this.f6518b = j;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f6518b;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return Q02.m66695a(this, animationVector, animationVector2, animationVector3);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getValueFromNanos(long j, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f6517a.getValueFromNanos(this.f6518b - j, targetValue, initialValue, initialVelocity);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getVelocityFromNanos(long j, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        AnimationVector m61657a;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        m61657a = AnimatorAnimationSpecsKt.m61657a(this.f6517a.getVelocityFromNanos(this.f6518b - j, targetValue, initialValue, initialVelocity));
        return m61657a;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return T02.m66244a(this);
    }
}
