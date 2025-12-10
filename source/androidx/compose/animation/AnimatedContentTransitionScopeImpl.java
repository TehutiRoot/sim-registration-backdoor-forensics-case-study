package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.ParentDataModifier;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\\]B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0004¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00160\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010#\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00160\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020\u000bH\u0001¢\u0006\u0004\b&\u0010'J%\u0010,\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R4\u0010D\u001a\u00020)2\u0006\u0010=\u001a\u00020)8@@@X\u0080\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR/\u0010K\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0F0E8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR-\u0010R\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010F8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0014\u0010U\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010TR\u001b\u0010Z\u001a\u00020X*\u00020\u00108BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010YR\u001b\u0010[\u001a\u00020X*\u00020\u00108BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bL\u0010YR\u001d\u0010+\u001a\u00020)8BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b>\u0010A\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006_²\u0006\u0014\u0010^\u001a\u00020X\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, m28850d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/animation/SizeTransform;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "contentTransform", "Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "currentSize", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JJ)J", "Landroidx/compose/animation/core/Transition;", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/Alignment;", "getContentAlignment$animation_release", "()Landroidx/compose/ui/Alignment;", "setContentAlignment$animation_release", "(Landroidx/compose/ui/Alignment;)V", OperatorName.CURVE_TO, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getMeasuredSize-YbymL2g$animation_release", "()J", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize", "", "Landroidx/compose/runtime/State;", "e", "Ljava/util/Map;", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "targetSizeMap", OperatorName.FILL_NON_ZERO, "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "animatedSize", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState", "targetState", "", "(I)Z", "isLeft", "isRight", "ChildData", "SizeModifier", "shouldAnimateSize", "animation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,862:1\n81#2:863\n107#2,2:864\n81#2:880\n107#2,2:881\n36#3:866\n36#3:873\n1097#4,6:867\n1097#4,6:874\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n544#1:863\n544#1:864,2\n558#1:880\n558#1:881,2\n558#1:866\n570#1:873\n558#1:867,6\n570#1:874,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {

    /* renamed from: a */
    public final Transition f12339a;

    /* renamed from: b */
    public Alignment f12340b;

    /* renamed from: c */
    public LayoutDirection f12341c;

    /* renamed from: d */
    public final MutableState f12342d;

    /* renamed from: e */
    public final Map f12343e;

    /* renamed from: f */
    public State f12344f;

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0003\u0010\f\"\u0004\b\u001a\u0010\u0005¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "", "isTarget", "<init>", "(Z)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "component1", "()Z", "copy", "(Z)Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "setTarget", "animation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class ChildData implements ParentDataModifier {

        /* renamed from: a */
        public boolean f12345a;

        public ChildData(boolean z) {
            this.f12345a = z;
        }

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = childData.f12345a;
            }
            return childData.copy(z);
        }

        @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
        public /* synthetic */ boolean all(Function1 function1) {
            return AbstractC20114gt0.m30962a(this, function1);
        }

        @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
        public /* synthetic */ boolean any(Function1 function1) {
            return AbstractC20114gt0.m30961b(this, function1);
        }

        public final boolean component1() {
            return this.f12345a;
        }

        @NotNull
        public final ChildData copy(boolean z) {
            return new ChildData(z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChildData) && this.f12345a == ((ChildData) obj).f12345a;
        }

        @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
        public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
            return AbstractC20114gt0.m30960c(this, obj, function2);
        }

        @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
        public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
            return AbstractC20114gt0.m30959d(this, obj, function2);
        }

        public int hashCode() {
            boolean z = this.f12345a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isTarget() {
            return this.f12345a;
        }

        @Override // androidx.compose.p003ui.layout.ParentDataModifier
        @NotNull
        public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return this;
        }

        public final void setTarget(boolean z) {
            this.f12345a = z;
        }

        @Override // androidx.compose.p003ui.Modifier
        public /* synthetic */ Modifier then(Modifier modifier) {
            return AbstractC19942ft0.m31254a(this, modifier);
        }

        @NotNull
        public String toString() {
            return "ChildData(isTarget=" + this.f12345a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {

        /* renamed from: a */
        public final Transition.DeferredAnimation f12346a;

        /* renamed from: b */
        public final State f12347b;

        /* renamed from: c */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl f12348c;

        public SizeModifier(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, Transition.DeferredAnimation sizeAnimation, State sizeTransform) {
            Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
            Intrinsics.checkNotNullParameter(sizeTransform, "sizeTransform");
            this.f12348c = animatedContentTransitionScopeImpl;
            this.f12346a = sizeAnimation;
            this.f12347b = sizeTransform;
        }

        /* renamed from: c */
        public final State m61750c() {
            return this.f12347b;
        }

        @Override // androidx.compose.p003ui.layout.LayoutModifier
        /* renamed from: measure-3p2s80s */
        public MeasureResult mo69160measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
            State<IntSize> animate = this.f12346a.animate(new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1(this.f12348c, this), new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2(this.f12348c));
            this.f12348c.setAnimatedSize$animation_release(animate);
            return MeasureScope.CC.m59532q(measure, IntSize.m73818getWidthimpl(animate.getValue().m73822unboximpl()), IntSize.m73817getHeightimpl(animate.getValue().m73822unboximpl()), null, new AnimatedContentTransitionScopeImpl$SizeModifier$measure$1(mo72811measureBRTryo0, this.f12348c.getContentAlignment$animation_release().mo71407alignKFBX0sM(IntSizeKt.IntSize(mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight()), animate.getValue().m73822unboximpl(), LayoutDirection.Ltr)), 4, null);
        }
    }

    public AnimatedContentTransitionScopeImpl(@NotNull Transition<S> transition, @NotNull Alignment contentAlignment, @NotNull LayoutDirection layoutDirection) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f12339a = transition;
        this.f12340b = contentAlignment;
        this.f12341c = layoutDirection;
        m31891g = AbstractC19508dK1.m31891g(IntSize.m73810boximpl(IntSize.Companion.m73823getZeroYbymL2g()), null, 2, null);
        this.f12342d = m31891g;
        this.f12343e = new LinkedHashMap();
    }

    /* renamed from: b */
    public static final boolean m61755b(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static final void m61754c(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final long m61756a(long j, long j2) {
        return this.f12340b.mo71407alignKFBX0sM(j, j2, LayoutDirection.Ltr);
    }

    @Composable
    @NotNull
    public final Modifier createSizeAnimationModifier$animation_release(@NotNull ContentTransform contentTransform, @Nullable Composer composer, int i) {
        Modifier modifier;
        Modifier clipToBounds;
        Intrinsics.checkNotNullParameter(contentTransform, "contentTransform");
        composer.startReplaceableGroup(93755870);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:554)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (Intrinsics.areEqual(this.f12339a.getCurrentState(), this.f12339a.getTargetState())) {
            m61754c(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            m61754c(mutableState, true);
        }
        if (m61755b(mutableState)) {
            Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.f12339a, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(createDeferredAnimation);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) rememberUpdatedState.getValue();
                if (sizeTransform != null && !sizeTransform.getClip()) {
                    clipToBounds = Modifier.Companion;
                } else {
                    clipToBounds = ClipKt.clipToBounds(Modifier.Companion);
                }
                rememberedValue2 = clipToBounds.then(new SizeModifier(this, createDeferredAnimation, rememberUpdatedState));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            modifier = (Modifier) rememberedValue2;
        } else {
            this.f12344f = null;
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    /* renamed from: d */
    public final long m61753d() {
        State state = this.f12344f;
        if (state != null) {
            return ((IntSize) state.getValue()).m73822unboximpl();
        }
        return m69212getMeasuredSizeYbymL2g$animation_release();
    }

    /* renamed from: e */
    public final boolean m61752e(int i) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (!AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69206getLeftDKzdypw()) && ((!AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69208getStartDKzdypw()) || this.f12341c != LayoutDirection.Ltr) && (!AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69205getEndDKzdypw()) || this.f12341c != LayoutDirection.Rtl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m61751f(int i) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (!AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69207getRightDKzdypw()) && ((!AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69208getStartDKzdypw()) || this.f12341c != LayoutDirection.Rtl) && (!AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69205getEndDKzdypw()) || this.f12341c != LayoutDirection.Ltr))) {
            return false;
        }
        return true;
    }

    @Nullable
    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.f12344f;
    }

    @NotNull
    public final Alignment getContentAlignment$animation_release() {
        return this.f12340b;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.f12339a.getSegment().getInitialState();
    }

    @NotNull
    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.f12341c;
    }

    /* renamed from: getMeasuredSize-YbymL2g$animation_release  reason: not valid java name */
    public final long m69212getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.f12342d.getValue()).m73822unboximpl();
    }

    @NotNull
    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.f12343e;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.f12339a.getSegment().getTargetState();
    }

    @NotNull
    public final Transition<S> getTransition$animation_release() {
        return this.f12339a;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
        return AbstractC20392iV1.m30637a(this, obj, obj2);
    }

    public final void setAnimatedSize$animation_release(@Nullable State<IntSize> state) {
        this.f12344f = state;
    }

    public final void setContentAlignment$animation_release(@NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.f12340b = alignment;
    }

    public final void setLayoutDirection$animation_release(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.f12341c = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release  reason: not valid java name */
    public final void m69213setMeasuredSizeozmzZPI$animation_release(long j) {
        this.f12342d.setValue(IntSize.m73810boximpl(j));
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo69195slideIntoContainermOhB8PU(int i, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        if (m61752e(i)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$1(initialOffset, this));
        }
        if (m61751f(i)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$2(initialOffset, this));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69209getUpDKzdypw())) {
            return EnterExitTransitionKt.slideInVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$3(initialOffset, this));
        }
        if (AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69204getDownDKzdypw())) {
            return EnterExitTransitionKt.slideInVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$4(initialOffset, this));
        }
        return EnterTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo69196slideOutOfContainermOhB8PU(int i, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        if (m61752e(i)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(this, targetOffset));
        }
        if (m61751f(i)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(this, targetOffset));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69209getUpDKzdypw())) {
            return EnterExitTransitionKt.slideOutVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(this, targetOffset));
        }
        if (AnimatedContentTransitionScope.SlideDirection.m69200equalsimpl0(i, companion.m69204getDownDKzdypw())) {
            return EnterExitTransitionKt.slideOutVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(this, targetOffset));
        }
        return ExitTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    public ContentTransform using(@NotNull ContentTransform contentTransform, @Nullable SizeTransform sizeTransform) {
        Intrinsics.checkNotNullParameter(contentTransform, "<this>");
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }
}
