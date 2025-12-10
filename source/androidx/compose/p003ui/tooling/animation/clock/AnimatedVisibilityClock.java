package androidx.compose.p003ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.p003ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.p003ui.tooling.animation.states.AnimatedVisibilityState;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R3\u0010*\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00038\u0016@VX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006+"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;)V", "", "par1", "par2", "", "setStateParameters", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "getMaxDurationPerIteration", "()J", "getMaxDuration", "animationTimeNanos", "setClockTime", "(J)V", "stepMillis", "", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(J)Ljava/util/List;", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "()Ljava/util/List;", "Lkotlin/Pair;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Lkotlin/Pair;", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "getAnimation", "()Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "value", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getState-jXw82LU", "()Ljava/lang/String;", "setState-7IW2chM", "(Ljava/lang/String;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedVisibilityClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibilityClock.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1549#2:87\n1620#2,3:88\n1045#2:91\n766#2:92\n857#2,2:93\n1603#2,9:95\n1855#2:104\n1856#2:106\n1612#2:107\n1045#2:108\n766#2:109\n857#2,2:110\n1#3:105\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibilityClock.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n*L\n68#1:87\n68#1:88,3\n70#1:91\n70#1:92\n70#1:93,2\n77#1:95,9\n77#1:104\n77#1:106\n77#1:107\n79#1:108\n79#1:109\n79#1:110,2\n77#1:105\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock */
/* loaded from: classes2.dex */
public final class AnimatedVisibilityClock implements ComposeAnimationClock<AnimatedVisibilityComposeAnimation, AnimatedVisibilityState> {

    /* renamed from: a */
    public final AnimatedVisibilityComposeAnimation f31694a;

    /* renamed from: b */
    public String f31695b;

    public AnimatedVisibilityClock(@NotNull AnimatedVisibilityComposeAnimation animation) {
        String m73613getEnterjXw82LU;
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f31694a = animation;
        if (getAnimation().m73602getAnimationObject().getCurrentState().booleanValue()) {
            m73613getEnterjXw82LU = AnimatedVisibilityState.Companion.m73614getExitjXw82LU();
        } else {
            m73613getEnterjXw82LU = AnimatedVisibilityState.Companion.m73613getEnterjXw82LU();
        }
        this.f31695b = m73613getEnterjXw82LU;
    }

    /* renamed from: a */
    public final Pair m58914a(String str) {
        Boolean bool;
        Boolean bool2;
        if (AnimatedVisibilityState.m73609equalsimpl0(str, AnimatedVisibilityState.Companion.m73613getEnterjXw82LU())) {
            bool = Boolean.FALSE;
            bool2 = Boolean.TRUE;
        } else {
            bool = Boolean.TRUE;
            bool2 = Boolean.FALSE;
        }
        return TuplesKt.m28844to(bool, bool2);
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        ComposeAnimatedProperty composeAnimatedProperty;
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = UtilsKt.allAnimations(childTransition).iterator();
            while (it.hasNext()) {
                Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) it.next();
                String label = transitionAnimationState.getLabel();
                Object value = transitionAnimationState.getValue();
                if (value == null) {
                    composeAnimatedProperty = null;
                } else {
                    composeAnimatedProperty = new ComposeAnimatedProperty(label, value);
                }
                if (composeAnimatedProperty != null) {
                    arrayList.add(composeAnimatedProperty);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getAnimatedProperties$lambda$8$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC16857uu.compareValues(((ComposeAnimatedProperty) t).getLabel(), ((ComposeAnimatedProperty) t2).getLabel());
                }
            })) {
                if (!UtilsKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return UtilsKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return UtilsKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ AnimatedVisibilityState getState() {
        return AnimatedVisibilityState.m73607boximpl(m73605getStatejXw82LU());
    }

    @NotNull
    /* renamed from: getState-jXw82LU  reason: not valid java name */
    public String m73605getStatejXw82LU() {
        return this.f31695b;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List<TransitionInfo> getTransitions(long j) {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations = UtilsKt.allAnimations(childTransition);
            ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(allAnimations, 10));
            Iterator<T> it = allAnimations.iterator();
            while (it.hasNext()) {
                arrayList.add(UtilsKt.createTransitionInfo((Transition.TransitionAnimationState) it.next(), j));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getTransitions$lambda$4$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC16857uu.compareValues(((TransitionInfo) t).getLabel(), ((TransitionInfo) t2).getLabel());
                }
            })) {
                if (!UtilsKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) obj).getLabel())) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j) {
        Transition<Boolean> m73602getAnimationObject = getAnimation().m73602getAnimationObject();
        Pair m58914a = m58914a(m73605getStatejXw82LU());
        Boolean bool = (Boolean) m58914a.component1();
        bool.booleanValue();
        Boolean bool2 = (Boolean) m58914a.component2();
        bool2.booleanValue();
        m73602getAnimationObject.seek(bool, bool2, j);
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ void setState(AnimatedVisibilityState animatedVisibilityState) {
        m73606setState7IW2chM(animatedVisibilityState.m73612unboximpl());
    }

    /* renamed from: setState-7IW2chM  reason: not valid java name */
    public void m73606setState7IW2chM(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f31695b = value;
        setClockTime(0L);
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@NotNull Object par1, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(par1, "par1");
        m73606setState7IW2chM(((AnimatedVisibilityState) par1).m73612unboximpl());
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public AnimatedVisibilityComposeAnimation getAnimation() {
        return this.f31694a;
    }
}
