package androidx.compose.p003ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.p003ui.tooling.animation.AnimateXAsStateComposeAnimation;
import androidx.compose.p003ui.tooling.animation.states.ComposeAnimationState;
import androidx.compose.p003ui.tooling.animation.states.TargetState;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R6\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00100\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00008\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\"\u0004\b-\u0010/R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00106\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b4\u00105\"\u0004\b&\u0010\u001e¨\u00067"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;)V", "", "par1", "par2", "", "setStateParameters", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "()Ljava/util/List;", "", "getMaxDurationPerIteration", "()J", "getMaxDuration", "stepMillis", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(J)Ljava/util/List;", "animationTimeNanos", "setClockTime", "(J)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Landroidx/compose/animation/core/TargetBasedAnimation;", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "getAnimation", "()Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "value", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/tooling/animation/states/TargetState;", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", RemoteConfigConstants.ResponseFieldKey.STATE, OperatorName.CURVE_TO, "Ljava/lang/Object;", "(Ljava/lang/Object;)V", "currentValue", "d", "Landroidx/compose/animation/core/TargetBasedAnimation;", "currAnimation", "e", OperatorName.SET_LINE_CAPSTYLE, "clockTimeNanos", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock */
/* loaded from: classes2.dex */
public final class AnimateXAsStateClock<T, V extends AnimationVector> implements ComposeAnimationClock<AnimateXAsStateComposeAnimation<T, V>, TargetState<T>> {

    /* renamed from: a */
    public final AnimateXAsStateComposeAnimation f31689a;

    /* renamed from: b */
    public TargetState f31690b;

    /* renamed from: c */
    public Object f31691c;

    /* renamed from: d */
    public TargetBasedAnimation f31692d;

    /* renamed from: e */
    public long f31693e;

    public AnimateXAsStateClock(@NotNull AnimateXAsStateComposeAnimation<T, V> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f31689a = animation;
        this.f31690b = new TargetState(getAnimation().m73601getAnimationObject().getValue(), getAnimation().m73601getAnimationObject().getValue());
        this.f31691c = getAnimation().getToolingState().getValue();
        this.f31692d = m58917a();
    }

    /* renamed from: a */
    public final TargetBasedAnimation m58917a() {
        return AnimationKt.TargetBasedAnimation(getAnimation().getAnimationSpec(), getAnimation().m73601getAnimationObject().getTypeConverter(), getState().getInitial(), getState().getTarget(), getAnimation().m73601getAnimationObject().getVelocity());
    }

    /* renamed from: b */
    public final void m58916b(long j) {
        this.f31693e = j;
        m58915c(this.f31692d.getValueFromNanos(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m58915c(Object obj) {
        this.f31691c = obj;
        getAnimation().getToolingState().setValue(obj);
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        String label = getAnimation().getLabel();
        Object obj = this.f31691c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
        return AbstractC10108ds.listOf(new ComposeAnimatedProperty(label, obj));
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return UtilsKt.nanosToMillis(this.f31692d.getDurationNanos());
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return UtilsKt.nanosToMillis(this.f31692d.getDurationNanos());
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List<TransitionInfo> getTransitions(long j) {
        return AbstractC10108ds.listOf(UtilsKt.createTransitionInfo(this.f31692d, getAnimation().getLabel(), getAnimation().getAnimationSpec(), j));
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j) {
        m58916b(j);
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ void setState(ComposeAnimationState composeAnimationState) {
        setState((TargetState) ((TargetState) composeAnimationState));
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@NotNull Object par1, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(par1, "par1");
        TargetState<T> parseParametersToValue = UtilsKt.parseParametersToValue(this.f31691c, par1, obj);
        if (parseParametersToValue != null) {
            setState((TargetState) parseParametersToValue);
        }
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public AnimateXAsStateComposeAnimation<T, V> getAnimation() {
        return this.f31689a;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public TargetState<T> getState() {
        return this.f31690b;
    }

    public void setState(@NotNull TargetState<T> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f31690b = value;
        this.f31692d = m58917a();
        setClockTime(0L);
    }
}
