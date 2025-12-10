package p000;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVectorsKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.VectorizedDecayAnimationSpec;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: U02 */
/* loaded from: classes.dex */
public final class U02 implements VectorizedDecayAnimationSpec {

    /* renamed from: a */
    public final FloatDecayAnimationSpec f6162a;

    /* renamed from: b */
    public AnimationVector f6163b;

    /* renamed from: c */
    public AnimationVector f6164c;

    /* renamed from: d */
    public AnimationVector f6165d;

    /* renamed from: e */
    public final float f6166e;

    public U02(FloatDecayAnimationSpec floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f6162a = floatDecaySpec;
        this.f6166e = floatDecaySpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.f6166e;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(AnimationVector initialValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f6164c == null) {
            this.f6164c = AnimationVectorsKt.newInstance(initialValue);
        }
        AnimationVector animationVector = this.f6164c;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector = null;
        }
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        long j = 0;
        for (int i = 0; i < size$animation_core_release; i++) {
            j = Math.max(j, this.f6162a.getDurationNanos(initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        return j;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public AnimationVector getTargetValue(AnimationVector initialValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f6165d == null) {
            this.f6165d = AnimationVectorsKt.newInstance(initialValue);
        }
        AnimationVector animationVector = this.f6165d;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            animationVector = null;
        }
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            AnimationVector animationVector2 = this.f6165d;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                animationVector2 = null;
            }
            animationVector2.set$animation_core_release(i, this.f6162a.getTargetValue(initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        AnimationVector animationVector3 = this.f6165d;
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
        if (this.f6163b == null) {
            this.f6163b = AnimationVectorsKt.newInstance(initialValue);
        }
        AnimationVector animationVector = this.f6163b;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            animationVector = null;
        }
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            AnimationVector animationVector2 = this.f6163b;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                animationVector2 = null;
            }
            animationVector2.set$animation_core_release(i, this.f6162a.getValueFromNanos(j, initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        AnimationVector animationVector3 = this.f6163b;
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
        if (this.f6164c == null) {
            this.f6164c = AnimationVectorsKt.newInstance(initialValue);
        }
        AnimationVector animationVector = this.f6164c;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector = null;
        }
        int size$animation_core_release = animationVector.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            AnimationVector animationVector2 = this.f6164c;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                animationVector2 = null;
            }
            animationVector2.set$animation_core_release(i, this.f6162a.getVelocityFromNanos(j, initialValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        AnimationVector animationVector3 = this.f6164c;
        if (animationVector3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return animationVector3;
    }
}
