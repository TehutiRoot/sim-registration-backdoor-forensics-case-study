package androidx.compose.p003ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.p003ui.tooling.animation.TransitionBasedAnimation;
import androidx.compose.p003ui.tooling.animation.states.ComposeAnimationState;
import androidx.compose.p003ui.tooling.animation.states.TargetState;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R6\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "T", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;)V", "", "par1", "par2", "", "setStateParameters", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "()Ljava/util/List;", "", "getMaxDurationPerIteration", "()J", "getMaxDuration", "stepMillis", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(J)Ljava/util/List;", "animationTimeNanos", "setClockTime", "(J)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "getAnimation", "()Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "value", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/tooling/animation/states/TargetState;", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransitionClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionClock.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1603#2,9:88\n1855#2:97\n1856#2:99\n1612#2:100\n766#2:101\n857#2,2:102\n1549#2:104\n1620#2,3:105\n766#2:108\n857#2,2:109\n1#3:98\n*S KotlinDebug\n*F\n+ 1 TransitionClock.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n*L\n60#1:88,9\n60#1:97\n60#1:99\n60#1:100\n64#1:101\n64#1:102,2\n77#1:104\n77#1:105,3\n79#1:108\n79#1:109,2\n60#1:98\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.clock.TransitionClock */
/* loaded from: classes2.dex */
public final class TransitionClock<T> implements ComposeAnimationClock<TransitionBasedAnimation<T>, TargetState<T>> {

    /* renamed from: a */
    public final TransitionBasedAnimation f31699a;

    /* renamed from: b */
    public TargetState f31700b;

    public TransitionClock(@NotNull TransitionBasedAnimation<T> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f31699a = animation;
        this.f31700b = new TargetState(getAnimation().getAnimationObject().getCurrentState(), getAnimation().getAnimationObject().getTargetState());
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        ComposeAnimatedProperty composeAnimatedProperty;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = UtilsKt.allAnimations(getAnimation().getAnimationObject()).iterator();
        while (it.hasNext()) {
            Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) it.next();
            Object value = transitionAnimationState.getValue();
            if (value == null) {
                composeAnimatedProperty = null;
            } else {
                composeAnimatedProperty = new ComposeAnimatedProperty(transitionAnimationState.getLabel(), value);
            }
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t : arrayList) {
            if (!UtilsKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) t).getLabel())) {
                arrayList2.add(t);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return UtilsKt.nanosToMillis(getAnimation().getAnimationObject().getTotalDurationNanos());
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return UtilsKt.nanosToMillis(getAnimation().getAnimationObject().getTotalDurationNanos());
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List<TransitionInfo> getTransitions(long j) {
        List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations = UtilsKt.allAnimations(getAnimation().getAnimationObject());
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(allAnimations, 10));
        Iterator<T> it = allAnimations.iterator();
        while (it.hasNext()) {
            arrayList.add(UtilsKt.createTransitionInfo((Transition.TransitionAnimationState) it.next(), j));
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t : arrayList) {
            if (!UtilsKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) t).getLabel())) {
                arrayList2.add(t);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j) {
        getAnimation().getAnimationObject().seek(getState().getInitial(), getState().getTarget(), j);
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ void setState(ComposeAnimationState composeAnimationState) {
        setState((TargetState) ((TargetState) composeAnimationState));
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@NotNull Object par1, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(par1, "par1");
        TargetState<T> parseParametersToValue = UtilsKt.parseParametersToValue(getState().getInitial(), par1, obj);
        if (parseParametersToValue != null) {
            setState((TargetState) parseParametersToValue);
        }
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public TransitionBasedAnimation<T> getAnimation() {
        return this.f31699a;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public TargetState<T> getState() {
        return this.f31700b;
    }

    public void setState(@NotNull TargetState<T> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f31700b = value;
        setClockTime(0L);
    }
}
