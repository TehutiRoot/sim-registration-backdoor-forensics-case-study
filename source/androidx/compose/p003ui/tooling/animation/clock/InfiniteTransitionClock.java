package androidx.compose.p003ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.p003ui.tooling.animation.InfiniteTransitionComposeAnimation;
import androidx.compose.p003ui.tooling.animation.states.TargetState;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010#\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001e\"\b\b\u0001\u0010 *\u00020\u001f*\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!R\u00020\"H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R(\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "", "animation", "Lkotlin/Function0;", "", "maxDuration", "<init>", "(Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;Lkotlin/jvm/functions/Function0;)V", "par1", "par2", "", "setStateParameters", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "()Ljava/util/List;", "getMaxDurationPerIteration", "()J", "getMaxDuration", "stepMillis", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(J)Ljava/util/List;", "animationTimeNanos", "setClockTime", "(J)V", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "Landroidx/compose/animation/core/InfiniteTransition;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;)J", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "getAnimation", "()Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function0;", OperatorName.CURVE_TO, "Landroidx/compose/ui/tooling/animation/states/TargetState;", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInfiniteTransitionClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionClock.kt\nandroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1603#2,9:86\n1855#2:95\n1856#2:97\n1612#2:98\n766#2:99\n857#2,2:100\n1549#2:102\n1620#2,3:103\n766#2:106\n857#2,2:107\n1#3:96\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionClock.kt\nandroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock\n*L\n47#1:86,9\n47#1:95\n47#1:97\n47#1:98\n51#1:99\n51#1:100,2\n68#1:102\n68#1:103,3\n70#1:106\n70#1:107,2\n47#1:96\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock */
/* loaded from: classes2.dex */
public final class InfiniteTransitionClock implements ComposeAnimationClock<InfiniteTransitionComposeAnimation, TargetState<Object>> {

    /* renamed from: a */
    public final InfiniteTransitionComposeAnimation f31696a;

    /* renamed from: b */
    public final Function0 f31697b;

    /* renamed from: c */
    public TargetState f31698c;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock$1 */
    /* loaded from: classes2.dex */
    public static final class C36371 extends Lambda implements Function0<Long> {
        public static final C36371 INSTANCE = new C36371();

        public C36371() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 0L;
        }
    }

    public InfiniteTransitionClock(@NotNull InfiniteTransitionComposeAnimation animation, @NotNull Function0<Long> maxDuration) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(maxDuration, "maxDuration");
        this.f31696a = animation;
        this.f31697b = maxDuration;
        this.f31698c = new TargetState(0, 0);
    }

    /* renamed from: a */
    public final long m58913a(InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        int i;
        AnimationSpec animationSpec = transitionAnimationState.getAnimationSpec();
        Intrinsics.checkNotNull(animationSpec, "null cannot be cast to non-null type androidx.compose.animation.core.InfiniteRepeatableSpec<T of androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.getIterationDuration>");
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) animationSpec;
        if (infiniteRepeatableSpec.getRepeatMode() == RepeatMode.Reverse) {
            i = 2;
        } else {
            i = 1;
        }
        VectorizedDurationBasedAnimationSpec vectorize = infiniteRepeatableSpec.getAnimation().vectorize(transitionAnimationState.getTypeConverter());
        return UtilsKt.millisToNanos(vectorize.getDelayMillis() + (vectorize.getDurationMillis() * i));
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        ComposeAnimatedProperty composeAnimatedProperty;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getAnimation().m73603getAnimationObject().getAnimations().iterator();
        while (it.hasNext()) {
            InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) it.next();
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
        for (Object obj : arrayList) {
            if (!UtilsKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Math.max(getMaxDurationPerIteration(), ((Number) this.f31697b.invoke()).longValue());
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Long l;
        long j;
        Iterator<T> it = getAnimation().m73603getAnimationObject().getAnimations().iterator();
        if (!it.hasNext()) {
            l = null;
        } else {
            Long valueOf = Long.valueOf(m58913a((InfiniteTransition.TransitionAnimationState) it.next()));
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(m58913a((InfiniteTransition.TransitionAnimationState) it.next()));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        }
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return UtilsKt.nanosToMillis(j);
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public List<TransitionInfo> getTransitions(long j) {
        List<InfiniteTransition.TransitionAnimationState<?, ?>> animations = getAnimation().m73603getAnimationObject().getAnimations();
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(animations, 10));
        Iterator<T> it = animations.iterator();
        while (it.hasNext()) {
            arrayList.add(UtilsKt.createTransitionInfo((InfiniteTransition.TransitionAnimationState) it.next(), j, getMaxDuration()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!UtilsKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList2);
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j) {
        getAnimation().setTimeNanos(j);
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@NotNull Object par1, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(par1, "par1");
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public InfiniteTransitionComposeAnimation getAnimation() {
        return this.f31696a;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    @NotNull
    public TargetState<Object> getState() {
        return this.f31698c;
    }

    @Override // androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(@NotNull TargetState<Object> targetState) {
        Intrinsics.checkNotNullParameter(targetState, "<set-?>");
        this.f31698c = targetState;
    }

    public /* synthetic */ InfiniteTransitionClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(infiniteTransitionComposeAnimation, (i & 2) != 0 ? C36371.INSTANCE : function0);
    }
}
