package androidx.compose.p003ui.tooling.animation;

import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.p003ui.tooling.animation.AnimationSearch;
import androidx.compose.p003ui.tooling.animation.clock.AnimateXAsStateClock;
import androidx.compose.p003ui.tooling.animation.clock.AnimatedVisibilityClock;
import androidx.compose.p003ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.p003ui.tooling.animation.clock.InfiniteTransitionClock;
import androidx.compose.p003ui.tooling.animation.clock.TransitionClock;
import androidx.compose.p003ui.tooling.animation.clock.UtilsKt;
import androidx.compose.p003ui.tooling.animation.states.AnimatedVisibilityState;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030 ¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b&\u0010\u0017J\u0015\u0010(\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b,\u0010+J%\u00100\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0001¢\u0006\u0004\b3\u00104J\u001e\u00108\u001a\u0002052\u0006\u0010-\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b6\u00107J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u000209¢\u0006\u0004\b<\u0010;J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b?\u0010@J#\u0010C\u001a\b\u0012\u0004\u0012\u00020B0=2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010A\u001a\u000209¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\u00032\u0006\u0010E\u001a\u000209¢\u0006\u0004\bF\u0010GJ!\u0010I\u001a\u00020\u00032\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002090H¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u0003¢\u0006\u0004\bK\u0010LR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010MR\u0014\u0010P\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\bQ\u0010RR4\u0010[\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030U\u0012\b\u0012\u0006\u0012\u0002\b\u00030V0T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010W\u0012\u0004\bZ\u0010L\u001a\u0004\bX\u0010YR,\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020]0T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010W\u0012\u0004\b_\u0010L\u001a\u0004\b^\u0010YR<\u0010f\u001a\u001e\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030a\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030b0T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bc\u0010W\u0012\u0004\be\u0010L\u001a\u0004\bd\u0010YR,\u0010l\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020h0T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bi\u0010W\u0012\u0004\bk\u0010L\u001a\u0004\bj\u0010YR4\u0010q\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030m\u0012\b\u0012\u0006\u0012\u0002\b\u00030V0T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bn\u0010W\u0012\u0004\bp\u0010L\u001a\u0004\bo\u0010YR0\u0010z\u001a\u0012\u0012\u0004\u0012\u00020s0rj\b\u0012\u0004\u0012\u00020s`t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bu\u0010v\u0012\u0004\by\u0010L\u001a\u0004\bw\u0010xR$\u0010|\u001a\u0012\u0012\u0004\u0012\u00020\u00010rj\b\u0012\u0004\u0012\u00020\u0001`t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010vR\u0014\u0010\u007f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R$\u0010\u0081\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0=8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bQ\u0010\u0080\u0001R$\u0010\u0082\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0=8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bN\u0010\u0080\u0001\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0083\u0001"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "", "Lkotlin/Function0;", "", "setAnimationsTimeCallback", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/animation/tooling/ComposeAnimation;", "animation", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/animation/tooling/ComposeAnimation;)Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "", "label", "e", "(Ljava/lang/Object;Ljava/lang/String;)V", "Lkotlin/Function1;", "createClockAndSubscribe", "", "d", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/animation/core/Transition;", "trackTransition", "(Landroidx/compose/animation/core/Transition;)V", "onSeek", "trackAnimatedVisibility", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "trackAnimateXAsState", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;)V", "trackAnimateContentSize", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackTargetBasedAnimations", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "Landroidx/compose/animation/core/DecayAnimation;", "trackDecayAnimations", "(Landroidx/compose/animation/core/DecayAnimation;)V", "trackAnimatedContent", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "trackInfiniteTransition", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;)V", "notifySubscribe", "(Landroidx/compose/animation/tooling/ComposeAnimation;)V", "notifyUnsubscribe", "composeAnimation", "fromState", "toState", "updateFromAndToStates", "(Landroidx/compose/animation/tooling/ComposeAnimation;Ljava/lang/Object;Ljava/lang/Object;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "updateAnimatedVisibilityState", "(Landroidx/compose/animation/tooling/ComposeAnimation;Ljava/lang/Object;)V", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "getAnimatedVisibilityState-cc2g1to", "(Landroidx/compose/animation/tooling/ComposeAnimation;)Ljava/lang/String;", "getAnimatedVisibilityState", "", "getMaxDuration", "()J", "getMaxDurationPerIteration", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedProperties", "(Landroidx/compose/animation/tooling/ComposeAnimation;)Ljava/util/List;", "stepMillis", "Landroidx/compose/animation/tooling/TransitionInfo;", "getTransitions", "(Landroidx/compose/animation/tooling/ComposeAnimation;J)Ljava/util/List;", "animationTimeMillis", "setClockTime", "(J)V", "", "setClockTimes", "(Ljava/util/Map;)V", "dispose", "()V", "Lkotlin/jvm/functions/Function0;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "TAG", OperatorName.CURVE_TO, "Z", "DEBUG", "", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "Ljava/util/Map;", "getTransitionClocks$ui_tooling_release", "()Ljava/util/Map;", "getTransitionClocks$ui_tooling_release$annotations", "transitionClocks", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "getAnimatedVisibilityClocks$ui_tooling_release", "getAnimatedVisibilityClocks$ui_tooling_release$annotations", "animatedVisibilityClocks", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", OperatorName.FILL_NON_ZERO, "getAnimateXAsStateClocks$ui_tooling_release", "getAnimateXAsStateClocks$ui_tooling_release$annotations", "animateXAsStateClocks", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", OperatorName.NON_STROKING_GRAY, "getInfiniteTransitionClocks$ui_tooling_release", "getInfiniteTransitionClocks$ui_tooling_release$annotations", "infiniteTransitionClocks", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", OperatorName.CLOSE_PATH, "getAnimatedContentClocks$ui_tooling_release", "getAnimatedContentClocks$ui_tooling_release$annotations", "animatedContentClocks", "Ljava/util/LinkedHashSet;", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Lkotlin/collections/LinkedHashSet;", "i", "Ljava/util/LinkedHashSet;", "getTrackedUnsupportedAnimations", "()Ljava/util/LinkedHashSet;", "getTrackedUnsupportedAnimations$annotations", "trackedUnsupportedAnimations", OperatorName.SET_LINE_JOINSTYLE, "trackedAnimations", OperatorName.NON_STROKING_CMYK, "Ljava/lang/Object;", "lock", "()Ljava/util/List;", "allClocksExceptInfinite", "allClocks", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreviewAnimationClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewAnimationClock.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,338:1\n1#2:339\n1855#3,2:340\n1855#3,2:344\n1855#3,2:346\n215#4,2:342\n*S KotlinDebug\n*F\n+ 1 PreviewAnimationClock.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n*L\n310#1:340,2\n330#1:344,2\n331#1:346,2\n320#1:342,2\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.PreviewAnimationClock */
/* loaded from: classes2.dex */
public class PreviewAnimationClock {

    /* renamed from: a */
    public final Function0 f31668a;

    /* renamed from: b */
    public final String f31669b;

    /* renamed from: c */
    public final boolean f31670c;

    /* renamed from: d */
    public final Map f31671d;

    /* renamed from: e */
    public final Map f31672e;

    /* renamed from: f */
    public final Map f31673f;

    /* renamed from: g */
    public final Map f31674g;

    /* renamed from: h */
    public final Map f31675h;

    /* renamed from: i */
    public final LinkedHashSet f31676i;

    /* renamed from: j */
    public final LinkedHashSet f31677j;

    /* renamed from: k */
    public final Object f31678k;

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.PreviewAnimationClock$1 */
    /* loaded from: classes2.dex */
    public static final class C36341 extends Lambda implements Function0<Unit> {
        public static final C36341 INSTANCE = new C36341();

        public C36341() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public PreviewAnimationClock() {
        this(null, 1, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAnimateXAsStateClocks$ui_tooling_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getAnimatedContentClocks$ui_tooling_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getAnimatedVisibilityClocks$ui_tooling_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getInfiniteTransitionClocks$ui_tooling_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTrackedUnsupportedAnimations$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTransitionClocks$ui_tooling_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackAnimatedVisibility$default(PreviewAnimationClock previewAnimationClock, Transition transition, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = PreviewAnimationClock$trackAnimatedVisibility$1.INSTANCE;
            }
            previewAnimationClock.trackAnimatedVisibility(transition, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAnimatedVisibility");
    }

    /* renamed from: a */
    public final ComposeAnimationClock m58922a(ComposeAnimation composeAnimation) {
        TransitionClock transitionClock = (TransitionClock) this.f31671d.get(composeAnimation);
        if (transitionClock == null) {
            AnimatedVisibilityClock animatedVisibilityClock = (AnimatedVisibilityClock) this.f31672e.get(composeAnimation);
            if (animatedVisibilityClock == null) {
                AnimateXAsStateClock animateXAsStateClock = (AnimateXAsStateClock) this.f31673f.get(composeAnimation);
                if (animateXAsStateClock == null) {
                    InfiniteTransitionClock infiniteTransitionClock = (InfiniteTransitionClock) this.f31674g.get(composeAnimation);
                    if (infiniteTransitionClock == null) {
                        return (ComposeAnimationClock) this.f31675h.get(composeAnimation);
                    }
                    return infiniteTransitionClock;
                }
                return animateXAsStateClock;
            }
            return animatedVisibilityClock;
        }
        return transitionClock;
    }

    /* renamed from: b */
    public final List m58921b() {
        return CollectionsKt___CollectionsKt.plus((Collection) m58920c(), (Iterable) this.f31674g.values());
    }

    /* renamed from: c */
    public final List m58920c() {
        return CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus(this.f31671d.values(), (Iterable) this.f31672e.values()), (Iterable) this.f31673f.values()), (Iterable) this.f31675h.values());
    }

    /* renamed from: d */
    public final boolean m58919d(Object obj, Function1 function1) {
        synchronized (this.f31678k) {
            if (this.f31677j.contains(obj)) {
                if (this.f31670c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Animation ");
                    sb.append(obj);
                    sb.append(" is already being tracked");
                }
                return false;
            }
            this.f31677j.add(obj);
            function1.invoke(obj);
            if (this.f31670c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animation ");
                sb2.append(obj);
                sb2.append(" is now tracked");
                return true;
            }
            return true;
        }
    }

    public final void dispose() {
        for (ComposeAnimationClock composeAnimationClock : m58921b()) {
            notifyUnsubscribe(composeAnimationClock.getAnimation());
        }
        for (UnsupportedComposeAnimation unsupportedComposeAnimation : this.f31676i) {
            notifyUnsubscribe(unsupportedComposeAnimation);
        }
        this.f31676i.clear();
        this.f31671d.clear();
        this.f31672e.clear();
        this.f31677j.clear();
    }

    /* renamed from: e */
    public final void m58918e(Object obj, String str) {
        m58919d(obj, new PreviewAnimationClock$trackUnsupported$1(str, this));
    }

    @NotNull
    public final Map<AnimateXAsStateComposeAnimation<?, ?>, AnimateXAsStateClock<?, ?>> getAnimateXAsStateClocks$ui_tooling_release() {
        return this.f31673f;
    }

    @NotNull
    public final Map<AnimatedContentComposeAnimation<?>, TransitionClock<?>> getAnimatedContentClocks$ui_tooling_release() {
        return this.f31675h;
    }

    @NotNull
    public final List<ComposeAnimatedProperty> getAnimatedProperties(@NotNull ComposeAnimation animation) {
        List<ComposeAnimatedProperty> animatedProperties;
        Intrinsics.checkNotNullParameter(animation, "animation");
        ComposeAnimationClock m58922a = m58922a(animation);
        if (m58922a == null || (animatedProperties = m58922a.getAnimatedProperties()) == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return animatedProperties;
    }

    @NotNull
    public final Map<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> getAnimatedVisibilityClocks$ui_tooling_release() {
        return this.f31672e;
    }

    @NotNull
    /* renamed from: getAnimatedVisibilityState-cc2g1to  reason: not valid java name */
    public final String m73604getAnimatedVisibilityStatecc2g1to(@NotNull ComposeAnimation composeAnimation) {
        Intrinsics.checkNotNullParameter(composeAnimation, "composeAnimation");
        AnimatedVisibilityClock animatedVisibilityClock = (AnimatedVisibilityClock) this.f31672e.get(composeAnimation);
        if (animatedVisibilityClock != null) {
            return animatedVisibilityClock.m73605getStatejXw82LU();
        }
        return AnimatedVisibilityState.Companion.m73613getEnterjXw82LU();
    }

    @NotNull
    public final Map<InfiniteTransitionComposeAnimation, InfiniteTransitionClock> getInfiniteTransitionClocks$ui_tooling_release() {
        return this.f31674g;
    }

    public final long getMaxDuration() {
        Long l;
        Iterator it = m58921b().iterator();
        if (!it.hasNext()) {
            l = null;
        } else {
            Long valueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long getMaxDurationPerIteration() {
        Long l;
        Iterator it = m58921b().iterator();
        if (!it.hasNext()) {
            l = null;
        } else {
            Long valueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @NotNull
    public final LinkedHashSet<UnsupportedComposeAnimation> getTrackedUnsupportedAnimations() {
        return this.f31676i;
    }

    @NotNull
    public final Map<TransitionComposeAnimation<?>, TransitionClock<?>> getTransitionClocks$ui_tooling_release() {
        return this.f31671d;
    }

    @NotNull
    public final List<TransitionInfo> getTransitions(@NotNull ComposeAnimation animation, long j) {
        List<TransitionInfo> transitions;
        Intrinsics.checkNotNullParameter(animation, "animation");
        ComposeAnimationClock m58922a = m58922a(animation);
        if (m58922a == null || (transitions = m58922a.getTransitions(j)) == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return transitions;
    }

    @VisibleForTesting
    public void notifySubscribe(@NotNull ComposeAnimation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @VisibleForTesting
    public void notifyUnsubscribe(@NotNull ComposeAnimation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void setClockTime(long j) {
        long millisToNanos = UtilsKt.millisToNanos(j);
        for (ComposeAnimationClock composeAnimationClock : m58921b()) {
            composeAnimationClock.setClockTime(millisToNanos);
        }
        this.f31668a.invoke();
    }

    public final void setClockTimes(@NotNull Map<ComposeAnimation, Long> animationTimeMillis) {
        Intrinsics.checkNotNullParameter(animationTimeMillis, "animationTimeMillis");
        for (Map.Entry<ComposeAnimation, Long> entry : animationTimeMillis.entrySet()) {
            long longValue = entry.getValue().longValue();
            ComposeAnimationClock m58922a = m58922a(entry.getKey());
            if (m58922a != null) {
                m58922a.setClockTime(UtilsKt.millisToNanos(longValue));
            }
        }
        this.f31668a.invoke();
    }

    public final void trackAnimateContentSize(@NotNull Object animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        m58918e(animation, "animateContentSize");
    }

    public final void trackAnimateXAsState(@NotNull AnimationSearch.AnimateXAsStateSearchInfo<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        m58919d(animation.getAnimatable(), new PreviewAnimationClock$trackAnimateXAsState$1(animation, this));
    }

    public final void trackAnimatedContent(@NotNull Transition<?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        m58919d(animation, new PreviewAnimationClock$trackAnimatedContent$1(animation, this));
    }

    public final void trackAnimatedVisibility(@NotNull Transition<?> animation, @NotNull Function0<Unit> onSeek) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(onSeek, "onSeek");
        if (!(animation.getCurrentState() instanceof Boolean)) {
            return;
        }
        m58919d(animation, new PreviewAnimationClock$trackAnimatedVisibility$2(animation, onSeek, this));
    }

    public final void trackDecayAnimations(@NotNull DecayAnimation<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        m58918e(animation, "DecayAnimation");
    }

    public final void trackInfiniteTransition(@NotNull AnimationSearch.InfiniteTransitionSearchInfo animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        m58919d(animation.getInfiniteTransition(), new PreviewAnimationClock$trackInfiniteTransition$1(animation, this));
    }

    public final void trackTargetBasedAnimations(@NotNull TargetBasedAnimation<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        m58918e(animation, "TargetBasedAnimation");
    }

    public final void trackTransition(@NotNull Transition<?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        m58919d(animation, new PreviewAnimationClock$trackTransition$1(animation, this));
    }

    public final void updateAnimatedVisibilityState(@NotNull ComposeAnimation composeAnimation, @NotNull Object state) {
        Intrinsics.checkNotNullParameter(composeAnimation, "composeAnimation");
        Intrinsics.checkNotNullParameter(state, "state");
        AnimatedVisibilityClock animatedVisibilityClock = (AnimatedVisibilityClock) this.f31672e.get(composeAnimation);
        if (animatedVisibilityClock != null) {
            AbstractC10428hv.m30706a(animatedVisibilityClock, state, null, 2, null);
        }
    }

    public final void updateFromAndToStates(@NotNull ComposeAnimation composeAnimation, @NotNull Object fromState, @NotNull Object toState) {
        Intrinsics.checkNotNullParameter(composeAnimation, "composeAnimation");
        Intrinsics.checkNotNullParameter(fromState, "fromState");
        Intrinsics.checkNotNullParameter(toState, "toState");
        ComposeAnimationClock m58922a = m58922a(composeAnimation);
        if (m58922a != null) {
            m58922a.setStateParameters(fromState, toState);
        }
    }

    public PreviewAnimationClock(@NotNull Function0<Unit> setAnimationsTimeCallback) {
        Intrinsics.checkNotNullParameter(setAnimationsTimeCallback, "setAnimationsTimeCallback");
        this.f31668a = setAnimationsTimeCallback;
        this.f31669b = "PreviewAnimationClock";
        this.f31671d = new LinkedHashMap();
        this.f31672e = new LinkedHashMap();
        this.f31673f = new LinkedHashMap();
        this.f31674g = new LinkedHashMap();
        this.f31675h = new LinkedHashMap();
        this.f31676i = new LinkedHashSet();
        this.f31677j = new LinkedHashSet();
        this.f31678k = new Object();
    }

    public /* synthetic */ PreviewAnimationClock(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C36341.INSTANCE : function0);
    }
}
