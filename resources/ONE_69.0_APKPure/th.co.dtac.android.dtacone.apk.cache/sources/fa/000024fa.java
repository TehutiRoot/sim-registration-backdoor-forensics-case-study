package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorizedSpringSpec;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "frameTime", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class UpdatableAnimationState$animateToZero$3 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ Function1<Float, Unit> $beforeFrame;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpdatableAnimationState$animateToZero$3(UpdatableAnimationState updatableAnimationState, float f, Function1<? super Float, Unit> function1) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$durationScale = f;
        this.$beforeFrame = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
        invoke(l.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        long j2;
        long j3;
        long roundToLong;
        UpdatableAnimationState.C2814a c2814a;
        UpdatableAnimationState.C2814a c2814a2;
        AnimationVector1D animationVector1D;
        UpdatableAnimationState.C2814a c2814a3;
        UpdatableAnimationState.C2814a c2814a4;
        AnimationVector1D animationVector1D2;
        UpdatableAnimationState.C2814a c2814a5;
        UpdatableAnimationState.C2814a c2814a6;
        AnimationVector1D animationVector1D3;
        j2 = this.this$0.f13115a;
        if (j2 == Long.MIN_VALUE) {
            this.this$0.f13115a = j;
        }
        AnimationVector1D animationVector1D4 = new AnimationVector1D(this.this$0.getValue());
        if (this.$durationScale == 0.0f) {
            c2814a5 = UpdatableAnimationState.f13112e;
            VectorizedSpringSpec m61406a = c2814a5.m61406a();
            AnimationVector1D animationVector1D5 = new AnimationVector1D(this.this$0.getValue());
            c2814a6 = UpdatableAnimationState.f13112e;
            AnimationVector1D m61405b = c2814a6.m61405b();
            animationVector1D3 = this.this$0.f13116b;
            roundToLong = m61406a.getDurationNanos(animationVector1D5, m61405b, animationVector1D3);
        } else {
            j3 = this.this$0.f13115a;
            roundToLong = AbstractC22237sr0.roundToLong(((float) (j - j3)) / this.$durationScale);
        }
        long j4 = roundToLong;
        c2814a = UpdatableAnimationState.f13112e;
        VectorizedSpringSpec m61406a2 = c2814a.m61406a();
        c2814a2 = UpdatableAnimationState.f13112e;
        AnimationVector1D m61405b2 = c2814a2.m61405b();
        animationVector1D = this.this$0.f13116b;
        float value = ((AnimationVector1D) m61406a2.getValueFromNanos(j4, animationVector1D4, m61405b2, animationVector1D)).getValue();
        UpdatableAnimationState updatableAnimationState = this.this$0;
        c2814a3 = UpdatableAnimationState.f13112e;
        VectorizedSpringSpec m61406a3 = c2814a3.m61406a();
        c2814a4 = UpdatableAnimationState.f13112e;
        AnimationVector1D m61405b3 = c2814a4.m61405b();
        animationVector1D2 = this.this$0.f13116b;
        updatableAnimationState.f13116b = (AnimationVector1D) m61406a3.getVelocityFromNanos(j4, animationVector1D4, m61405b3, animationVector1D2);
        this.this$0.f13115a = j;
        this.this$0.setValue(value);
        this.$beforeFrame.invoke(Float.valueOf(this.this$0.getValue() - value));
    }
}