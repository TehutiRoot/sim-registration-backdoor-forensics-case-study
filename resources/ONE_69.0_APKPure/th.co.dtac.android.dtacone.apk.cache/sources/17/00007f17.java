package com.airbnb.lottie.compose;

import androidx.compose.animation.core.InfiniteAnimationPolicyKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.airbnb.lottie.LottieComposition;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.ranges.AbstractC11695c;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public final class LottieAnimatableImpl implements LottieAnimatable {

    /* renamed from: a */
    public final MutableState f41234a;

    /* renamed from: b */
    public final MutableState f41235b;

    /* renamed from: c */
    public final MutableState f41236c;

    /* renamed from: d */
    public final MutableState f41237d;

    /* renamed from: e */
    public final MutableState f41238e;

    /* renamed from: f */
    public final MutableState f41239f;

    /* renamed from: g */
    public final MutableState f41240g;

    /* renamed from: h */
    public final State f41241h;

    /* renamed from: i */
    public final MutableState f41242i;

    /* renamed from: j */
    public final MutableState f41243j;

    /* renamed from: k */
    public final MutableState f41244k;

    /* renamed from: l */
    public final MutableState f41245l;

    /* renamed from: m */
    public final State f41246m;

    /* renamed from: n */
    public final State f41247n;

    /* renamed from: o */
    public final MutatorMutex f41248o;

    public LottieAnimatableImpl() {
        MutableState m65148g;
        MutableState m65148g2;
        MutableState m65148g3;
        MutableState m65148g4;
        MutableState m65148g5;
        MutableState m65148g6;
        MutableState m65148g7;
        MutableState m65148g8;
        MutableState m65148g9;
        MutableState m65148g10;
        MutableState m65148g11;
        Boolean bool = Boolean.FALSE;
        m65148g = AbstractC19036aL1.m65148g(bool, null, 2, null);
        this.f41234a = m65148g;
        m65148g2 = AbstractC19036aL1.m65148g(1, null, 2, null);
        this.f41235b = m65148g2;
        m65148g3 = AbstractC19036aL1.m65148g(1, null, 2, null);
        this.f41236c = m65148g3;
        m65148g4 = AbstractC19036aL1.m65148g(bool, null, 2, null);
        this.f41237d = m65148g4;
        m65148g5 = AbstractC19036aL1.m65148g(null, null, 2, null);
        this.f41238e = m65148g5;
        m65148g6 = AbstractC19036aL1.m65148g(Float.valueOf(1.0f), null, 2, null);
        this.f41239f = m65148g6;
        m65148g7 = AbstractC19036aL1.m65148g(bool, null, 2, null);
        this.f41240g = m65148g7;
        this.f41241h = SnapshotStateKt.derivedStateOf(new LottieAnimatableImpl$frameSpeed$2(this));
        m65148g8 = AbstractC19036aL1.m65148g(null, null, 2, null);
        this.f41242i = m65148g8;
        Float valueOf = Float.valueOf(0.0f);
        m65148g9 = AbstractC19036aL1.m65148g(valueOf, null, 2, null);
        this.f41243j = m65148g9;
        m65148g10 = AbstractC19036aL1.m65148g(valueOf, null, 2, null);
        this.f41244k = m65148g10;
        m65148g11 = AbstractC19036aL1.m65148g(Long.MIN_VALUE, null, 2, null);
        this.f41245l = m65148g11;
        this.f41246m = SnapshotStateKt.derivedStateOf(new LottieAnimatableImpl$endProgress$2(this));
        this.f41247n = SnapshotStateKt.derivedStateOf(new LottieAnimatableImpl$isAtEnd$2(this));
        this.f41248o = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m50851C(float f) {
        this.f41239f.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m50850D(boolean z) {
        this.f41240g.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m50828u(LottieComposition lottieComposition) {
        this.f41242i.setValue(lottieComposition);
    }

    /* renamed from: z */
    private void m50823z(float f) {
        this.f41244k.setValue(Float.valueOf(f));
    }

    /* renamed from: A */
    public final void m50853A(float f) {
        this.f41243j.setValue(Float.valueOf(f));
    }

    /* renamed from: B */
    public final void m50852B(boolean z) {
        this.f41237d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: E */
    public final void m50849E(float f) {
        m50853A(f);
        if (getUseCompositionFrameRate()) {
            f = m50830s(f, getComposition());
        }
        m50823z(f);
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object animate(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, Continuation continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.f41248o, null, new LottieAnimatableImpl$animate$2(this, i, i2, z, f, lottieClipSpec, lottieComposition, f2, z4, z2, lottieCancellationBehavior, null), continuation, 1, null);
        if (mutate$default == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return mutate$default;
        }
        return Unit.INSTANCE;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieClipSpec getClipSpec() {
        return (LottieClipSpec) this.f41238e.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieComposition getComposition() {
        return (LottieComposition) this.f41242i.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIteration() {
        return ((Number) this.f41235b.getValue()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIterations() {
        return ((Number) this.f41236c.getValue()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public long getLastFrameNanos() {
        return ((Number) this.f41245l.getValue()).longValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getProgress() {
        return ((Number) this.f41244k.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getReverseOnRepeat() {
        return ((Boolean) this.f41237d.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getSpeed() {
        return ((Number) this.f41239f.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getUseCompositionFrameRate() {
        return ((Boolean) this.f41240g.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isAtEnd() {
        return ((Boolean) this.f41247n.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isPlaying() {
        return ((Boolean) this.f41234a.getValue()).booleanValue();
    }

    /* renamed from: n */
    public final Object m50835n(int i, Continuation continuation) {
        if (i == Integer.MAX_VALUE) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new LottieAnimatableImpl$doFrame$2(this, i), continuation);
        }
        return MonotonicFrameClockKt.withFrameNanos(new LottieAnimatableImpl$doFrame$3(this, i), continuation);
    }

    /* renamed from: o */
    public final float m50834o() {
        return ((Number) this.f41246m.getValue()).floatValue();
    }

    /* renamed from: p */
    public final float m50833p() {
        return ((Number) this.f41241h.getValue()).floatValue();
    }

    /* renamed from: q */
    public final float m50832q() {
        return ((Number) this.f41243j.getValue()).floatValue();
    }

    /* renamed from: r */
    public final boolean m50831r(int i, long j) {
        long lastFrameNanos;
        float minProgress$lottie_compose_release;
        float maxProgress$lottie_compose_release;
        float m50832q;
        float f;
        LottieComposition composition = getComposition();
        if (composition == null) {
            return true;
        }
        if (getLastFrameNanos() == Long.MIN_VALUE) {
            lastFrameNanos = 0;
        } else {
            lastFrameNanos = j - getLastFrameNanos();
        }
        m50825x(j);
        LottieClipSpec clipSpec = getClipSpec();
        if (clipSpec == null) {
            minProgress$lottie_compose_release = 0.0f;
        } else {
            minProgress$lottie_compose_release = clipSpec.getMinProgress$lottie_compose_release(composition);
        }
        LottieClipSpec clipSpec2 = getClipSpec();
        if (clipSpec2 == null) {
            maxProgress$lottie_compose_release = 1.0f;
        } else {
            maxProgress$lottie_compose_release = clipSpec2.getMaxProgress$lottie_compose_release(composition);
        }
        float duration = (((float) (lastFrameNanos / ((long) DurationKt.NANOS_IN_MILLIS))) / composition.getDuration()) * m50833p();
        if (m50833p() < 0.0f) {
            m50832q = minProgress$lottie_compose_release - (m50832q() + duration);
        } else {
            m50832q = (m50832q() + duration) - maxProgress$lottie_compose_release;
        }
        if (m50832q < 0.0f) {
            m50849E(AbstractC11695c.coerceIn(m50832q(), minProgress$lottie_compose_release, maxProgress$lottie_compose_release) + duration);
        } else {
            float f2 = maxProgress$lottie_compose_release - minProgress$lottie_compose_release;
            int i2 = (int) (m50832q / f2);
            int i3 = i2 + 1;
            if (getIteration() + i3 > i) {
                m50849E(m50834o());
                m50827v(i);
                return false;
            }
            m50827v(getIteration() + i3);
            float f3 = m50832q - (i2 * f2);
            if (m50833p() < 0.0f) {
                f = maxProgress$lottie_compose_release - f3;
            } else {
                f = minProgress$lottie_compose_release + f3;
            }
            m50849E(f);
        }
        return true;
    }

    /* renamed from: s */
    public final float m50830s(float f, LottieComposition lottieComposition) {
        if (lottieComposition == null) {
            return f;
        }
        return f - (f % (1 / lottieComposition.getFrameRate()));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object snapTo(LottieComposition lottieComposition, float f, int i, boolean z, Continuation continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.f41248o, null, new LottieAnimatableImpl$snapTo$2(this, lottieComposition, f, i, z, null), continuation, 1, null);
        if (mutate$default == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return mutate$default;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public final void m50829t(LottieClipSpec lottieClipSpec) {
        this.f41238e.setValue(lottieClipSpec);
    }

    /* renamed from: v */
    public final void m50827v(int i) {
        this.f41235b.setValue(Integer.valueOf(i));
    }

    /* renamed from: w */
    public final void m50826w(int i) {
        this.f41236c.setValue(Integer.valueOf(i));
    }

    /* renamed from: x */
    public final void m50825x(long j) {
        this.f41245l.setValue(Long.valueOf(j));
    }

    /* renamed from: y */
    public final void m50824y(boolean z) {
        this.f41234a.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public Float getValue() {
        return Float.valueOf(getProgress());
    }
}