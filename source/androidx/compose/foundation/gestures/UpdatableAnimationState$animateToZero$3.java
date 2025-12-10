package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorizedSpringSpec;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "frameTime", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        UpdatableAnimationState.C2832a c2832a;
        UpdatableAnimationState.C2832a c2832a2;
        AnimationVector1D animationVector1D;
        UpdatableAnimationState.C2832a c2832a3;
        UpdatableAnimationState.C2832a c2832a4;
        AnimationVector1D animationVector1D2;
        UpdatableAnimationState.C2832a c2832a5;
        UpdatableAnimationState.C2832a c2832a6;
        AnimationVector1D animationVector1D3;
        j2 = this.this$0.f13027a;
        if (j2 == Long.MIN_VALUE) {
            this.this$0.f13027a = j;
        }
        AnimationVector1D animationVector1D4 = new AnimationVector1D(this.this$0.getValue());
        if (this.$durationScale == 0.0f) {
            c2832a5 = UpdatableAnimationState.f13024e;
            VectorizedSpringSpec m61456a = c2832a5.m61456a();
            AnimationVector1D animationVector1D5 = new AnimationVector1D(this.this$0.getValue());
            c2832a6 = UpdatableAnimationState.f13024e;
            AnimationVector1D m61455b = c2832a6.m61455b();
            animationVector1D3 = this.this$0.f13028b;
            roundToLong = m61456a.getDurationNanos(animationVector1D5, m61455b, animationVector1D3);
        } else {
            j3 = this.this$0.f13027a;
            roundToLong = AbstractC21140mr0.roundToLong(((float) (j - j3)) / this.$durationScale);
        }
        long j4 = roundToLong;
        c2832a = UpdatableAnimationState.f13024e;
        VectorizedSpringSpec m61456a2 = c2832a.m61456a();
        c2832a2 = UpdatableAnimationState.f13024e;
        AnimationVector1D m61455b2 = c2832a2.m61455b();
        animationVector1D = this.this$0.f13028b;
        float value = ((AnimationVector1D) m61456a2.getValueFromNanos(j4, animationVector1D4, m61455b2, animationVector1D)).getValue();
        UpdatableAnimationState updatableAnimationState = this.this$0;
        c2832a3 = UpdatableAnimationState.f13024e;
        VectorizedSpringSpec m61456a3 = c2832a3.m61456a();
        c2832a4 = UpdatableAnimationState.f13024e;
        AnimationVector1D m61455b3 = c2832a4.m61455b();
        animationVector1D2 = this.this$0.f13028b;
        updatableAnimationState.f13028b = (AnimationVector1D) m61456a3.getVelocityFromNanos(j4, animationVector1D4, m61455b3, animationVector1D2);
        this.this$0.f13027a = j;
        this.this$0.setValue(value);
        this.$beforeFrame.invoke(Float.valueOf(this.this$0.getValue() - value));
    }
}
