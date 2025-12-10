package p000;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVectorsKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.VectorizedDecayAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R12 */
/* loaded from: classes.dex */
public final class R12 implements VectorizedDecayAnimationSpec {

    /* renamed from: a */
    public final FloatDecayAnimationSpec f5382a;

    /* renamed from: b */
    public AnimationVector f5383b;

    /* renamed from: c */
    public AnimationVector f5384c;

    /* renamed from: d */
    public AnimationVector f5385d;

    /* renamed from: e */
    public final float f5386e;

    public R12(FloatDecayAnimationSpec floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f5382a = floatDecaySpec;
        this.f5386e = floatDecaySpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.f5386e;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(AnimationVector initialValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f5384c == null) {
            this.f5384c = AnimationVectorsKt.newInstance(initialValue);
        }
        AnimationVector animationVector = this.f5384c;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector = null;
        }
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        long j = 0;
        for (int i = 0; i < size$animation_core_release; i++) {
            j = Math.max(j, this.f5382a.getDurationNanos(initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        return j;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public AnimationVector getTargetValue(AnimationVector initialValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f5385d == null) {
            this.f5385d = AnimationVectorsKt.newInstance(initialValue);
        }
        AnimationVector animationVector = this.f5385d;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            animationVector = null;
        }
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            AnimationVector animationVector2 = this.f5385d;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                animationVector2 = null;
            }
            animationVector2.set$animation_core_release(i, this.f5382a.getTargetValue(initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        AnimationVector animationVector3 = this.f5385d;
        if (animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            return null;
        }
        return animationVector3;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public AnimationVector getValueFromNanos(long j, AnimationVector initialValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f5383b == null) {
            this.f5383b = AnimationVectorsKt.newInstance(initialValue);
        }
        AnimationVector animationVector = this.f5383b;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            animationVector = null;
        }
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            AnimationVector animationVector2 = this.f5383b;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                animationVector2 = null;
            }
            animationVector2.set$animation_core_release(i, this.f5382a.getValueFromNanos(j, initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        AnimationVector animationVector3 = this.f5383b;
        if (animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        return animationVector3;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public AnimationVector getVelocityFromNanos(long j, AnimationVector initialValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f5384c == null) {
            this.f5384c = AnimationVectorsKt.newInstance(initialValue);
        }
        AnimationVector animationVector = this.f5384c;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector = null;
        }
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            AnimationVector animationVector2 = this.f5384c;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                animationVector2 = null;
            }
            animationVector2.set$animation_core_release(i, this.f5382a.getVelocityFromNanos(j, initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        AnimationVector animationVector3 = this.f5384c;
        if (animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return animationVector3;
    }
}