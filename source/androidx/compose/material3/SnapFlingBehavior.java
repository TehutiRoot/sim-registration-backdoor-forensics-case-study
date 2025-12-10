package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p003ui.MotionDurationScale;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n*\u0001B\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J+\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J3\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001c\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u001e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 JM\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010!\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\"2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%JU\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\u0005*\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u0005*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0012J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010;R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010>R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010?R\u0014\u0010A\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010CR\u0014\u0010E\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010@R\u001d\u0010G\u001a\u00020F8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010@R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020.0H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010Q\u001a\u000208*\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, m28850d2 = {"Landroidx/compose/material3/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "LK4;", "Landroidx/compose/animation/core/AnimationVector1D;", OperatorName.NON_STROKING_CMYK, "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", OperatorName.SAVE, "o", "initialTargetOffset", "p", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "T", "Lkotlin/ranges/ClosedFloatingPointRange;", OperatorName.FILL_NON_ZERO, "(Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "(FLandroidx/compose/foundation/lazy/LazyListState;)F", "targetOffset", "Landroidx/compose/animation/core/AnimationState;", "animationState", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOffset", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TypedValues.AttributesType.S_TARGET, "e", "(FF)F", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "item", "d", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;Landroidx/compose/foundation/lazy/LazyListItemInfo;)F", "performFling", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/lazy/LazyListState;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Density;", "F", "velocityThreshold", "androidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1", "Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;", "motionScaleDuration", "DefaultScrollMotionDurationScaleFactor", "Landroidx/compose/ui/unit/Dp;", "MinFlingVelocityDp", "", OperatorName.ENDPATH, "()Ljava/util/List;", "visibleItemsInfo", OperatorName.LINE_TO, "()F", "itemSize", OperatorName.MOVE_TO, "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "singleAxisViewportSize", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,356:1\n1#2:357\n154#3:358\n132#4,3:359\n33#4,4:362\n135#4,2:366\n38#4:368\n137#4:369\n33#4,6:370\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n*L\n346#1:358\n71#1:359,3\n71#1:362,4\n71#1:366,2\n71#1:368\n71#1:369\n199#1:370,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapFlingBehavior implements FlingBehavior {

    /* renamed from: a */
    public final LazyListState f26121a;

    /* renamed from: b */
    public final DecayAnimationSpec f26122b;

    /* renamed from: c */
    public final AnimationSpec f26123c;

    /* renamed from: d */
    public final Density f26124d;

    /* renamed from: e */
    public final float f26125e;

    /* renamed from: f */
    public SnapFlingBehavior$motionScaleDuration$1 f26126f;

    /* renamed from: g */
    public final float f26127g;

    /* renamed from: h */
    public final float f26128h;

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1] */
    public SnapFlingBehavior(@NotNull LazyListState lazyListState, @NotNull DecayAnimationSpec<Float> decayAnimationSpec, @NotNull AnimationSpec<Float> snapAnimationSpec, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(snapAnimationSpec, "snapAnimationSpec");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f26121a = lazyListState;
        this.f26122b = decayAnimationSpec;
        this.f26123c = snapAnimationSpec;
        this.f26124d = density;
        this.f26125e = density.mo69438toPx0680j_4(this.f26128h);
        this.f26126f = new MotionDurationScale() { // from class: androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1
            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
                return (R) MotionDurationScale.DefaultImpls.fold(this, r, function2);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            @Nullable
            public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
                return (E) MotionDurationScale.DefaultImpls.get(this, key);
            }

            @Override // androidx.compose.p003ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element
            public /* synthetic */ CoroutineContext.Key getKey() {
                return AbstractC23382zt0.m20a(this);
            }

            @Override // androidx.compose.p003ui.MotionDurationScale
            public float getScaleFactor() {
                return SnapFlingBehavior.access$getDefaultScrollMotionDurationScaleFactor$p(SnapFlingBehavior.this);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            @NotNull
            public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
                return MotionDurationScale.DefaultImpls.minusKey(this, key);
            }

            @Override // kotlin.coroutines.CoroutineContext
            @NotNull
            public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
                return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
            }
        };
        this.f26127g = 1.0f;
        this.f26128h = C3641Dp.m73658constructorimpl(400);
    }

    public static final /* synthetic */ float access$getDefaultScrollMotionDurationScaleFactor$p(SnapFlingBehavior snapFlingBehavior) {
        return snapFlingBehavior.f26127g;
    }

    /* renamed from: b */
    public static final void m60530b(AnimationScope animationScope, ScrollScope scrollScope, float f) {
        if (Math.abs(f - scrollScope.scrollBy(f)) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* renamed from: i */
    public static final ClosedFloatingPointRange m60523i(LazyListState lazyListState, SnapFlingBehavior snapFlingBehavior) {
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            float m60528d = snapFlingBehavior.m60528d(layoutInfo, visibleItemsInfo.get(i));
            if (m60528d <= 0.0f && m60528d > f) {
                f = m60528d;
            }
            if (m60528d >= 0.0f && m60528d < f2) {
                f2 = m60528d;
            }
        }
        return AbstractC18012Lr1.rangeTo(f, f2);
    }

    /* renamed from: j */
    public static final boolean m60522j(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m60531a(androidx.compose.foundation.gestures.ScrollScope r6, float r7, androidx.compose.animation.core.AnimationState r8, androidx.compose.animation.core.DecayAnimationSpec r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.SnapFlingBehavior$animateDecay$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.SnapFlingBehavior$animateDecay$1 r0 = (androidx.compose.material3.SnapFlingBehavior$animateDecay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnapFlingBehavior$animateDecay$1 r0 = new androidx.compose.material3.SnapFlingBehavior$animateDecay$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r7 = r0.F$0
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.internal.Ref$FloatRef r6 = (kotlin.jvm.internal.Ref.FloatRef) r6
            java.lang.Object r8 = r0.L$0
            androidx.compose.animation.core.AnimationState r8 = (androidx.compose.animation.core.AnimationState) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Object r2 = r8.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = 1
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            androidx.compose.material3.SnapFlingBehavior$animateDecay$2 r4 = new androidx.compose.material3.SnapFlingBehavior$animateDecay$2
            r4.<init>(r7, r5, r10, r6)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.F$0 = r7
            r0.label = r3
            java.lang.Object r6 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r8, r9, r2, r4, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            r6 = r10
        L6b:
            K4 r9 = new K4
            float r6 = r6.element
            float r7 = r7 - r6
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r7)
            r9.<init>(r6, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.m60531a(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m60529c(androidx.compose.foundation.gestures.ScrollScope r14, float r15, float r16, androidx.compose.animation.core.AnimationState r17, androidx.compose.animation.core.AnimationSpec r18, kotlin.coroutines.Continuation r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof androidx.compose.material3.SnapFlingBehavior$animateSnap$1
            if (r2 == 0) goto L17
            r2 = r1
            androidx.compose.material3.SnapFlingBehavior$animateSnap$1 r2 = (androidx.compose.material3.SnapFlingBehavior$animateSnap$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
        L15:
            r8 = r2
            goto L1d
        L17:
            androidx.compose.material3.SnapFlingBehavior$animateSnap$1 r2 = new androidx.compose.material3.SnapFlingBehavior$animateSnap$1
            r2.<init>(r13, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r8.result
            java.lang.Object r2 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L48
            if (r3 != r4) goto L40
            float r2 = r8.F$1
            float r3 = r8.F$0
            java.lang.Object r4 = r8.L$2
            kotlin.jvm.internal.Ref$FloatRef r4 = (kotlin.jvm.internal.Ref.FloatRef) r4
            java.lang.Object r5 = r8.L$1
            androidx.compose.animation.core.AnimationState r5 = (androidx.compose.animation.core.AnimationState) r5
            java.lang.Object r6 = r8.L$0
            androidx.compose.material3.SnapFlingBehavior r6 = (androidx.compose.material3.SnapFlingBehavior) r6
            kotlin.ResultKt.throwOnFailure(r1)
            r11 = r3
            r1 = r5
            goto L99
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L48:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            java.lang.Object r3 = r17.getVelocity()
            java.lang.Number r3 = (java.lang.Number) r3
            float r9 = r3.floatValue()
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r15)
            java.lang.Object r3 = r17.getVelocity()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L6f
            r3 = 1
            goto L70
        L6f:
            r3 = 0
        L70:
            r6 = r3 ^ 1
            androidx.compose.material3.SnapFlingBehavior$animateSnap$2 r7 = new androidx.compose.material3.SnapFlingBehavior$animateSnap$2
            r3 = r14
            r10 = r16
            r7.<init>(r13, r10, r1, r14)
            r8.L$0 = r0
            r10 = r17
            r8.L$1 = r10
            r8.L$2 = r1
            r11 = r15
            r8.F$0 = r11
            r8.F$1 = r9
            r8.label = r4
            r3 = r17
            r4 = r5
            r5 = r18
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L95
            return r2
        L95:
            r6 = r0
            r4 = r1
            r2 = r9
            r1 = r10
        L99:
            java.lang.Object r3 = r1.getVelocity()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = r6.m60527e(r3, r2)
            K4 r12 = new K4
            float r2 = r4.element
            float r11 = r11 - r2
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11)
            r9 = 29
            r10 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            androidx.compose.animation.core.AnimationState r1 = androidx.compose.animation.core.AnimationStateKt.copy$default(r1, r2, r3, r4, r6, r8, r9, r10)
            r12.<init>(r11, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.m60529c(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: d */
    public final float m60528d(LazyListLayoutInfo lazyListLayoutInfo, LazyListItemInfo lazyListItemInfo) {
        float f = 2;
        return lazyListItemInfo.getOffset() - ((((m60519m(lazyListLayoutInfo) - lazyListLayoutInfo.getBeforeContentPadding()) - lazyListLayoutInfo.getAfterContentPadding()) / f) - (lazyListItemInfo.getSize() / f));
    }

    /* renamed from: e */
    public final float m60527e(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 > 0.0f) {
            return AbstractC11719c.coerceAtMost(f, f2);
        }
        return AbstractC11719c.coerceAtLeast(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!Intrinsics.areEqual(snapFlingBehavior.f26123c, this.f26123c) || !Intrinsics.areEqual(snapFlingBehavior.f26122b, this.f26122b) || !Intrinsics.areEqual(snapFlingBehavior.f26121a, this.f26121a) || !Intrinsics.areEqual(snapFlingBehavior.f26124d, this.f26124d)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Comparable] */
    /* renamed from: f */
    public final Comparable m60526f(ClosedFloatingPointRange closedFloatingPointRange) {
        Intrinsics.checkNotNullParameter(closedFloatingPointRange, "<this>");
        return closedFloatingPointRange.getStart();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Comparable] */
    /* renamed from: g */
    public final Comparable m60525g(ClosedFloatingPointRange closedFloatingPointRange) {
        Intrinsics.checkNotNullParameter(closedFloatingPointRange, "<this>");
        return closedFloatingPointRange.getEndInclusive();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
        if (java.lang.Math.abs(r5) <= java.lang.Math.abs(r0)) goto L11;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m60524h(float r4, androidx.compose.foundation.lazy.LazyListState r5) {
        /*
            r3 = this;
            kotlin.ranges.ClosedFloatingPointRange r5 = m60523i(r5, r3)
            java.lang.Comparable r0 = r3.m60526f(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r5 = r3.m60525g(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r4 = java.lang.Math.signum(r4)
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 != 0) goto L2e
            float r4 = java.lang.Math.abs(r5)
            float r2 = java.lang.Math.abs(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L3e
            goto L34
        L2e:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L36
        L34:
            r0 = r5
            goto L3e
        L36:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            boolean r4 = m60522j(r0)
            if (r4 == 0) goto L45
            r1 = r0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.m60524h(float, androidx.compose.foundation.lazy.LazyListState):float");
    }

    public int hashCode() {
        return (((((this.f26123c.hashCode() * 31) + this.f26122b.hashCode()) * 31) + this.f26121a.hashCode()) * 31) + this.f26124d.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m60521k(androidx.compose.foundation.gestures.ScrollScope r6, float r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material3.SnapFlingBehavior$fling$1 r0 = (androidx.compose.material3.SnapFlingBehavior$fling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnapFlingBehavior$fling$1 r0 = new androidx.compose.material3.SnapFlingBehavior$fling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1 r8 = r5.f26126f
            androidx.compose.material3.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.material3.SnapFlingBehavior$fling$result$1
            r4 = 0
            r2.<init>(r7, r5, r6, r4)
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            K4 r8 = (p000.C0715K4) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.m60521k(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: l */
    public final float m60520l() {
        if (!m60518n().isEmpty()) {
            List m60518n = m60518n();
            int size = m60518n.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((LazyListItemInfo) m60518n.get(i2)).getSize();
            }
            return i / m60518n().size();
        }
        return 0.0f;
    }

    /* renamed from: m */
    public final int m60519m(LazyListLayoutInfo lazyListLayoutInfo) {
        if (lazyListLayoutInfo.getOrientation() == Orientation.Vertical) {
            return IntSize.m73817getHeightimpl(lazyListLayoutInfo.mo69600getViewportSizeYbymL2g());
        }
        return IntSize.m73818getWidthimpl(lazyListLayoutInfo.mo69600getViewportSizeYbymL2g());
    }

    /* renamed from: n */
    public final List m60518n() {
        return this.f26121a.getLayoutInfo().getVisibleItemsInfo();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae A[PHI: r3 
      PHI: (r3v13 java.lang.Object) = (r3v12 java.lang.Object), (r3v1 java.lang.Object) binds: [B:55:0x00ab, B:42:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m60517o(androidx.compose.foundation.gestures.ScrollScope r23, float r24, kotlin.coroutines.Continuation r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            boolean r4 = r3 instanceof androidx.compose.material3.SnapFlingBehavior$longSnap$1
            if (r4 == 0) goto L1c
            r4 = r3
            androidx.compose.material3.SnapFlingBehavior$longSnap$1 r4 = (androidx.compose.material3.SnapFlingBehavior$longSnap$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1c
            int r5 = r5 - r6
            r4.label = r5
        L1a:
            r11 = r4
            goto L22
        L1c:
            androidx.compose.material3.SnapFlingBehavior$longSnap$1 r4 = new androidx.compose.material3.SnapFlingBehavior$longSnap$1
            r4.<init>(r0, r3)
            goto L1a
        L22:
            java.lang.Object r3 = r11.result
            java.lang.Object r4 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r5 = r11.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4c
            if (r5 == r7) goto L3f
            if (r5 != r6) goto L37
            kotlin.ResultKt.throwOnFailure(r3)
            goto Lae
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            java.lang.Object r1 = r11.L$1
            androidx.compose.foundation.gestures.ScrollScope r1 = (androidx.compose.foundation.gestures.ScrollScope) r1
            java.lang.Object r2 = r11.L$0
            androidx.compose.material3.SnapFlingBehavior r2 = (androidx.compose.material3.SnapFlingBehavior) r2
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r2
            goto L7c
        L4c:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.compose.animation.core.DecayAnimationSpec r3 = r0.f26122b
            r5 = 0
            float r3 = androidx.compose.animation.core.DecayAnimationSpecKt.calculateTargetValue(r3, r5, r2)
            float r3 = java.lang.Math.abs(r3)
            float r8 = r22.m60520l()
            float r3 = r3 - r8
            float r3 = kotlin.ranges.AbstractC11719c.coerceAtLeast(r3, r5)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L68
            goto L6e
        L68:
            float r5 = java.lang.Math.signum(r24)
            float r3 = r3 * r5
        L6e:
            r11.L$0 = r0
            r11.L$1 = r1
            r11.label = r7
            java.lang.Object r3 = r0.m60516p(r1, r3, r2, r11)
            if (r3 != r4) goto L7b
            return r4
        L7b:
            r5 = r0
        L7c:
            K4 r3 = (p000.C0715K4) r3
            java.lang.Object r2 = r3.m67649a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            androidx.compose.animation.core.AnimationState r12 = r3.m67648b()
            r20 = 30
            r21 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            androidx.compose.animation.core.AnimationState r9 = androidx.compose.animation.core.AnimationStateKt.copy$default(r12, r13, r14, r15, r17, r19, r20, r21)
            androidx.compose.animation.core.AnimationSpec r10 = r5.f26123c
            r2 = 0
            r11.L$0 = r2
            r11.L$1 = r2
            r11.label = r6
            r6 = r1
            r7 = r8
            java.lang.Object r3 = r5.m60529c(r6, r7, r8, r9, r10, r11)
            if (r3 != r4) goto Lae
            return r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.m60517o(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m60516p(androidx.compose.foundation.gestures.ScrollScope r18, float r19, float r20, kotlin.coroutines.Continuation r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r21
            boolean r1 = r0 instanceof androidx.compose.material3.SnapFlingBehavior$runApproach$1
            if (r1 == 0) goto L18
            r1 = r0
            androidx.compose.material3.SnapFlingBehavior$runApproach$1 r1 = (androidx.compose.material3.SnapFlingBehavior$runApproach$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.label = r2
        L16:
            r5 = r1
            goto L1e
        L18:
            androidx.compose.material3.SnapFlingBehavior$runApproach$1 r1 = new androidx.compose.material3.SnapFlingBehavior$runApproach$1
            r1.<init>(r6, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r5.result
            java.lang.Object r7 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r1 = r5.L$0
            androidx.compose.material3.SnapFlingBehavior r1 = (androidx.compose.material3.SnapFlingBehavior) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L62
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            kotlin.ResultKt.throwOnFailure(r0)
            r15 = 28
            r16 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r9 = r20
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r8, r9, r10, r12, r14, r15, r16)
            androidx.compose.animation.core.DecayAnimationSpec r4 = r6.f26122b
            r5.L$0 = r6
            r5.label = r2
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r0 = r0.m60531a(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L61
            return r7
        L61:
            r1 = r6
        L62:
            K4 r0 = (p000.C0715K4) r0
            androidx.compose.animation.core.AnimationState r0 = r0.m67648b()
            java.lang.Object r2 = r0.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.foundation.lazy.LazyListState r3 = r1.f26121a
            float r1 = r1.m60524h(r2, r3)
            K4 r2 = new K4
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.m60516p(androidx.compose.foundation.gestures.ScrollScope, float, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object performFling(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.ScrollScope r5, float r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.SnapFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.SnapFlingBehavior$performFling$1 r0 = (androidx.compose.material3.SnapFlingBehavior$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnapFlingBehavior$performFling$1 r0 = new androidx.compose.material3.SnapFlingBehavior$performFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.label = r3
            java.lang.Object r7 = r4.m60521k(r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            K4 r7 = (p000.C0715K4) r7
            java.lang.Object r5 = r7.m67649a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.AnimationState r6 = r7.m67648b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r5 = r6.getVelocity()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5d:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: q */
    public final Object m60515q(ScrollScope scrollScope, float f, Continuation continuation) {
        float m60524h = m60524h(0.0f, this.f26121a);
        return m60529c(scrollScope, m60524h, m60524h, AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null), this.f26123c, continuation);
    }
}
