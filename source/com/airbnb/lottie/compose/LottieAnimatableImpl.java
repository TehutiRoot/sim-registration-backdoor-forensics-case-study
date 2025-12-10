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
import kotlin.ranges.AbstractC11719c;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public final class LottieAnimatableImpl implements LottieAnimatable {

    /* renamed from: a */
    public final MutableState f41222a;

    /* renamed from: b */
    public final MutableState f41223b;

    /* renamed from: c */
    public final MutableState f41224c;

    /* renamed from: d */
    public final MutableState f41225d;

    /* renamed from: e */
    public final MutableState f41226e;

    /* renamed from: f */
    public final MutableState f41227f;

    /* renamed from: g */
    public final MutableState f41228g;

    /* renamed from: h */
    public final State f41229h;

    /* renamed from: i */
    public final MutableState f41230i;

    /* renamed from: j */
    public final MutableState f41231j;

    /* renamed from: k */
    public final MutableState f41232k;

    /* renamed from: l */
    public final MutableState f41233l;

    /* renamed from: m */
    public final State f41234m;

    /* renamed from: n */
    public final State f41235n;

    /* renamed from: o */
    public final MutatorMutex f41236o;

    public LottieAnimatableImpl() {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        MutableState m31891g5;
        MutableState m31891g6;
        MutableState m31891g7;
        MutableState m31891g8;
        MutableState m31891g9;
        MutableState m31891g10;
        MutableState m31891g11;
        Boolean bool = Boolean.FALSE;
        m31891g = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f41222a = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(1, null, 2, null);
        this.f41223b = m31891g2;
        m31891g3 = AbstractC19508dK1.m31891g(1, null, 2, null);
        this.f41224c = m31891g3;
        m31891g4 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f41225d = m31891g4;
        m31891g5 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f41226e = m31891g5;
        m31891g6 = AbstractC19508dK1.m31891g(Float.valueOf(1.0f), null, 2, null);
        this.f41227f = m31891g6;
        m31891g7 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f41228g = m31891g7;
        this.f41229h = SnapshotStateKt.derivedStateOf(new LottieAnimatableImpl$frameSpeed$2(this));
        m31891g8 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f41230i = m31891g8;
        Float valueOf = Float.valueOf(0.0f);
        m31891g9 = AbstractC19508dK1.m31891g(valueOf, null, 2, null);
        this.f41231j = m31891g9;
        m31891g10 = AbstractC19508dK1.m31891g(valueOf, null, 2, null);
        this.f41232k = m31891g10;
        m31891g11 = AbstractC19508dK1.m31891g(Long.MIN_VALUE, null, 2, null);
        this.f41233l = m31891g11;
        this.f41234m = SnapshotStateKt.derivedStateOf(new LottieAnimatableImpl$endProgress$2(this));
        this.f41235n = SnapshotStateKt.derivedStateOf(new LottieAnimatableImpl$isAtEnd$2(this));
        this.f41236o = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m50854C(float f) {
        this.f41227f.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m50853D(boolean z) {
        this.f41228g.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m50831u(LottieComposition lottieComposition) {
        this.f41230i.setValue(lottieComposition);
    }

    /* renamed from: z */
    private void m50826z(float f) {
        this.f41232k.setValue(Float.valueOf(f));
    }

    /* renamed from: A */
    public final void m50856A(float f) {
        this.f41231j.setValue(Float.valueOf(f));
    }

    /* renamed from: B */
    public final void m50855B(boolean z) {
        this.f41225d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: E */
    public final void m50852E(float f) {
        m50856A(f);
        if (getUseCompositionFrameRate()) {
            f = m50833s(f, getComposition());
        }
        m50826z(f);
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object animate(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, Continuation continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.f41236o, null, new LottieAnimatableImpl$animate$2(this, i, i2, z, f, lottieClipSpec, lottieComposition, f2, z4, z2, lottieCancellationBehavior, null), continuation, 1, null);
        if (mutate$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return mutate$default;
        }
        return Unit.INSTANCE;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieClipSpec getClipSpec() {
        return (LottieClipSpec) this.f41226e.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieComposition getComposition() {
        return (LottieComposition) this.f41230i.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIteration() {
        return ((Number) this.f41223b.getValue()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIterations() {
        return ((Number) this.f41224c.getValue()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public long getLastFrameNanos() {
        return ((Number) this.f41233l.getValue()).longValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getProgress() {
        return ((Number) this.f41232k.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getReverseOnRepeat() {
        return ((Boolean) this.f41225d.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getSpeed() {
        return ((Number) this.f41227f.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getUseCompositionFrameRate() {
        return ((Boolean) this.f41228g.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isAtEnd() {
        return ((Boolean) this.f41235n.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isPlaying() {
        return ((Boolean) this.f41222a.getValue()).booleanValue();
    }

    /* renamed from: n */
    public final Object m50838n(int i, Continuation continuation) {
        if (i == Integer.MAX_VALUE) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new LottieAnimatableImpl$doFrame$2(this, i), continuation);
        }
        return MonotonicFrameClockKt.withFrameNanos(new LottieAnimatableImpl$doFrame$3(this, i), continuation);
    }

    /* renamed from: o */
    public final float m50837o() {
        return ((Number) this.f41234m.getValue()).floatValue();
    }

    /* renamed from: p */
    public final float m50836p() {
        return ((Number) this.f41229h.getValue()).floatValue();
    }

    /* renamed from: q */
    public final float m50835q() {
        return ((Number) this.f41231j.getValue()).floatValue();
    }

    /* renamed from: r */
    public final boolean m50834r(int i, long j) {
        long lastFrameNanos;
        float minProgress$lottie_compose_release;
        float maxProgress$lottie_compose_release;
        float m50835q;
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
        m50828x(j);
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
        float duration = (((float) (lastFrameNanos / ((long) DurationKt.NANOS_IN_MILLIS))) / composition.getDuration()) * m50836p();
        if (m50836p() < 0.0f) {
            m50835q = minProgress$lottie_compose_release - (m50835q() + duration);
        } else {
            m50835q = (m50835q() + duration) - maxProgress$lottie_compose_release;
        }
        if (m50835q < 0.0f) {
            m50852E(AbstractC11719c.coerceIn(m50835q(), minProgress$lottie_compose_release, maxProgress$lottie_compose_release) + duration);
        } else {
            float f2 = maxProgress$lottie_compose_release - minProgress$lottie_compose_release;
            int i2 = (int) (m50835q / f2);
            int i3 = i2 + 1;
            if (getIteration() + i3 > i) {
                m50852E(m50837o());
                m50830v(i);
                return false;
            }
            m50830v(getIteration() + i3);
            float f3 = m50835q - (i2 * f2);
            if (m50836p() < 0.0f) {
                f = maxProgress$lottie_compose_release - f3;
            } else {
                f = minProgress$lottie_compose_release + f3;
            }
            m50852E(f);
        }
        return true;
    }

    /* renamed from: s */
    public final float m50833s(float f, LottieComposition lottieComposition) {
        if (lottieComposition == null) {
            return f;
        }
        return f - (f % (1 / lottieComposition.getFrameRate()));
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object snapTo(LottieComposition lottieComposition, float f, int i, boolean z, Continuation continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.f41236o, null, new LottieAnimatableImpl$snapTo$2(this, lottieComposition, f, i, z, null), continuation, 1, null);
        if (mutate$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return mutate$default;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public final void m50832t(LottieClipSpec lottieClipSpec) {
        this.f41226e.setValue(lottieClipSpec);
    }

    /* renamed from: v */
    public final void m50830v(int i) {
        this.f41223b.setValue(Integer.valueOf(i));
    }

    /* renamed from: w */
    public final void m50829w(int i) {
        this.f41224c.setValue(Integer.valueOf(i));
    }

    /* renamed from: x */
    public final void m50828x(long j) {
        this.f41233l.setValue(Long.valueOf(j));
    }

    /* renamed from: y */
    public final void m50827y(boolean z) {
        this.f41222a.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public Float getValue() {
        return Float.valueOf(getProgress());
    }
}
