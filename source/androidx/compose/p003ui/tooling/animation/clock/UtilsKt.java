package androidx.compose.p003ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.tooling.animation.states.TargetState;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000^\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a-\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u00030\bR\u0006\u0012\u0002\b\u00030\u00060\u0007*\u0006\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f\"\u0004\b\u0002\u0010\u000e*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bR\b\u0012\u0004\u0012\u00028\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\b\u0002\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0018\u001aE\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019R\u00020\u001a2\b\b\u0002\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u001c\u001a7\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b\"\u0010#\" \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006,²\u0006\u001c\u0010)\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f8\nX\u008a\u0084\u0002²\u0006(\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f8\nX\u008a\u0084\u0002²\u0006(\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f8\nX\u008a\u0084\u0002"}, m28850d2 = {"", "timeNs", "nanosToMillis", "(J)J", "timeMs", "millisToNanos", "Landroidx/compose/animation/core/Transition;", "", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "allAnimations", "(Landroidx/compose/animation/core/Transition;)Ljava/util/List;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "S", "stepMs", "Landroidx/compose/animation/tooling/TransitionInfo;", "createTransitionInfo", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;J)Landroidx/compose/animation/tooling/TransitionInfo;", "Landroidx/compose/animation/core/Animation;", "", "label", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "(Landroidx/compose/animation/core/Animation;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;J)Landroidx/compose/animation/tooling/TransitionInfo;", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "Landroidx/compose/animation/core/InfiniteTransition;", "endTimeMs", "(Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;JJ)Landroidx/compose/animation/tooling/TransitionInfo;", "currentValue", "", "par1", "par2", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "parseParametersToValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getIGNORE_TRANSITIONS", "()Ljava/util/List;", "IGNORE_TRANSITIONS", "startTimeMs", "", "values", "ui-tooling_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nandroidx/compose/ui/tooling/animation/clock/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,280:1\n1360#2:281\n1446#2,5:282\n1#3:287\n174#4:288\n164#4:289\n154#4:290\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nandroidx/compose/ui/tooling/animation/clock/UtilsKt\n*L\n60#1:281\n60#1:282,5\n183#1:288\n183#1:289\n183#1:290\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.clock.UtilsKt */
/* loaded from: classes2.dex */
public final class UtilsKt {

    /* renamed from: a */
    public static final List f31701a = AbstractC10108ds.listOf("TransformOriginInterruptionHandling");

    /* renamed from: a */
    public static final long m58912a(Lazy lazy) {
        return ((Number) lazy.getValue()).longValue();
    }

    @NotNull
    public static final List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations(@NotNull Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = transition.getTransitions().iterator();
        while (it.hasNext()) {
            AbstractC10410hs.addAll(arrayList, allAnimations((Transition) it.next()));
        }
        return CollectionsKt___CollectionsKt.plus((Collection) transition.getAnimations(), (Iterable) arrayList);
    }

    /* renamed from: b */
    public static final Map m58911b(Lazy lazy) {
        return (Map) lazy.getValue();
    }

    /* renamed from: c */
    public static final Map m58910c(Lazy lazy) {
        return (Map) lazy.getValue();
    }

    @NotNull
    public static final <T, V extends AnimationVector, S> TransitionInfo createTransitionInfo(@NotNull Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, long j) {
        Intrinsics.checkNotNullParameter(transitionAnimationState, "<this>");
        return createTransitionInfo(transitionAnimationState.getAnimation(), transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec(), j);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Transition.TransitionAnimationState transitionAnimationState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(transitionAnimationState, j);
    }

    /* renamed from: d */
    public static final C3641Dp m58909d(Object obj) {
        C3641Dp c3641Dp;
        Float f;
        Double d;
        Integer num;
        if (obj instanceof C3641Dp) {
            c3641Dp = (C3641Dp) obj;
        } else {
            c3641Dp = null;
        }
        if (c3641Dp == null) {
            if (obj instanceof Float) {
                f = (Float) obj;
            } else {
                f = null;
            }
            if (f != null) {
                c3641Dp = C3641Dp.m73656boximpl(C3641Dp.m73658constructorimpl(f.floatValue()));
            } else {
                c3641Dp = null;
            }
            if (c3641Dp == null) {
                if (obj instanceof Double) {
                    d = (Double) obj;
                } else {
                    d = null;
                }
                if (d != null) {
                    c3641Dp = C3641Dp.m73656boximpl(C3641Dp.m73658constructorimpl((float) d.doubleValue()));
                } else {
                    c3641Dp = null;
                }
                if (c3641Dp == null) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        return null;
                    }
                    return C3641Dp.m73656boximpl(C3641Dp.m73658constructorimpl(num.intValue()));
                }
            }
        }
        return c3641Dp;
    }

    /* renamed from: e */
    public static final boolean m58908e(Object obj, Object obj2) {
        if (obj != null && obj2 != null && obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m58907f(Object obj, Object obj2, Object obj3) {
        if (obj.getClass() == obj2.getClass() && obj.getClass() == obj3.getClass()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final TargetState m58906g(Object obj, Object obj2, Object obj3) {
        if (!(obj instanceof C3641Dp) || obj3 == null) {
            return null;
        }
        if ((obj2 instanceof C3641Dp) && (obj3 instanceof C3641Dp)) {
            return new TargetState(obj2, obj3);
        }
        C3641Dp m58909d = m58909d(obj2);
        C3641Dp m58909d2 = m58909d(obj3);
        if (m58909d == null || m58909d2 == null) {
            return null;
        }
        return new TargetState(m58909d, m58909d2);
    }

    @NotNull
    public static final List<String> getIGNORE_TRANSITIONS() {
        return f31701a;
    }

    public static final long millisToNanos(long j) {
        return j * 1000000;
    }

    public static final long nanosToMillis(long j) {
        return (j + 999999) / ((long) DurationKt.NANOS_IN_MILLIS);
    }

    @Nullable
    public static final <T> TargetState<T> parseParametersToValue(T t, @NotNull Object par1, @Nullable Object obj) {
        TargetState<T> targetState;
        Intrinsics.checkNotNullParameter(par1, "par1");
        if (t == null) {
            return null;
        }
        TargetState<T> m58906g = m58906g(t, par1, obj);
        if (m58906g != null) {
            return m58906g;
        }
        if (!m58908e(par1, obj)) {
            return null;
        }
        Intrinsics.checkNotNull(obj);
        if (m58907f(t, par1, obj)) {
            return new TargetState<>(par1, obj);
        }
        if ((par1 instanceof List) && (obj instanceof List)) {
            try {
                if (t instanceof IntSize) {
                    Object obj2 = ((List) par1).get(0);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) obj2).intValue();
                    Object obj3 = ((List) par1).get(1);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                    IntSize m73810boximpl = IntSize.m73810boximpl(IntSizeKt.IntSize(intValue, ((Integer) obj3).intValue()));
                    Object obj4 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int intValue2 = ((Integer) obj4).intValue();
                    Object obj5 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                    targetState = new TargetState<>(m73810boximpl, IntSize.m73810boximpl(IntSizeKt.IntSize(intValue2, ((Integer) obj5).intValue())));
                } else if (t instanceof IntOffset) {
                    Object obj6 = ((List) par1).get(0);
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
                    int intValue3 = ((Integer) obj6).intValue();
                    Object obj7 = ((List) par1).get(1);
                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
                    IntOffset m73767boximpl = IntOffset.m73767boximpl(IntOffsetKt.IntOffset(intValue3, ((Integer) obj7).intValue()));
                    Object obj8 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
                    int intValue4 = ((Integer) obj8).intValue();
                    Object obj9 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Int");
                    targetState = new TargetState<>(m73767boximpl, IntOffset.m73767boximpl(IntOffsetKt.IntOffset(intValue4, ((Integer) obj9).intValue())));
                } else if (t instanceof Size) {
                    Object obj10 = ((List) par1).get(0);
                    Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue = ((Float) obj10).floatValue();
                    Object obj11 = ((List) par1).get(1);
                    Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Float");
                    Size m71559boximpl = Size.m71559boximpl(SizeKt.Size(floatValue, ((Float) obj11).floatValue()));
                    Object obj12 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue2 = ((Float) obj12).floatValue();
                    Object obj13 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(m71559boximpl, Size.m71559boximpl(SizeKt.Size(floatValue2, ((Float) obj13).floatValue())));
                } else if (t instanceof Offset) {
                    Object obj14 = ((List) par1).get(0);
                    Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue3 = ((Float) obj14).floatValue();
                    Object obj15 = ((List) par1).get(1);
                    Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Float");
                    Offset m71491boximpl = Offset.m71491boximpl(OffsetKt.Offset(floatValue3, ((Float) obj15).floatValue()));
                    Object obj16 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue4 = ((Float) obj16).floatValue();
                    Object obj17 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(m71491boximpl, Offset.m71491boximpl(OffsetKt.Offset(floatValue4, ((Float) obj17).floatValue())));
                } else if (t instanceof Rect) {
                    Object obj18 = ((List) par1).get(0);
                    Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue5 = ((Float) obj18).floatValue();
                    Object obj19 = ((List) par1).get(1);
                    Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue6 = ((Float) obj19).floatValue();
                    Object obj20 = ((List) par1).get(2);
                    Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue7 = ((Float) obj20).floatValue();
                    Object obj21 = ((List) par1).get(3);
                    Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type kotlin.Float");
                    Rect rect = new Rect(floatValue5, floatValue6, floatValue7, ((Float) obj21).floatValue());
                    Object obj22 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue8 = ((Float) obj22).floatValue();
                    Object obj23 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue9 = ((Float) obj23).floatValue();
                    Object obj24 = ((List) obj).get(2);
                    Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue10 = ((Float) obj24).floatValue();
                    Object obj25 = ((List) obj).get(3);
                    Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(rect, new Rect(floatValue8, floatValue9, floatValue10, ((Float) obj25).floatValue()));
                } else if (t instanceof Color) {
                    Object obj26 = ((List) par1).get(0);
                    Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue11 = ((Float) obj26).floatValue();
                    Object obj27 = ((List) par1).get(1);
                    Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue12 = ((Float) obj27).floatValue();
                    Object obj28 = ((List) par1).get(2);
                    Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue13 = ((Float) obj28).floatValue();
                    Object obj29 = ((List) par1).get(3);
                    Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.Float");
                    Color m71725boximpl = Color.m71725boximpl(ColorKt.Color$default(floatValue11, floatValue12, floatValue13, ((Float) obj29).floatValue(), null, 16, null));
                    Object obj30 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue14 = ((Float) obj30).floatValue();
                    Object obj31 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue15 = ((Float) obj31).floatValue();
                    Object obj32 = ((List) obj).get(2);
                    Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue16 = ((Float) obj32).floatValue();
                    Object obj33 = ((List) obj).get(3);
                    Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(m71725boximpl, Color.m71725boximpl(ColorKt.Color$default(floatValue14, floatValue15, floatValue16, ((Float) obj33).floatValue(), null, 16, null)));
                } else if (t instanceof C3641Dp) {
                    Object obj34 = ((List) par1).get(0);
                    Intrinsics.checkNotNull(obj34);
                    Object obj35 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj35);
                    targetState = m58906g(t, obj34, obj35);
                } else if (m58908e(((List) par1).get(0), ((List) obj).get(0))) {
                    Object obj36 = ((List) par1).get(0);
                    Intrinsics.checkNotNull(obj36);
                    Object obj37 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj37);
                    if (m58907f(t, obj36, obj37)) {
                        targetState = new TargetState<>(((List) par1).get(0), ((List) obj).get(0));
                    }
                }
                Intrinsics.checkNotNull(targetState, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.UtilsKt.parseParametersToValue>");
                return targetState;
            } catch (ClassCastException | IllegalArgumentException | IndexOutOfBoundsException | NullPointerException unused) {
            }
        }
        return null;
    }

    @NotNull
    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(@NotNull Animation<T, V> animation, @NotNull String label, @NotNull AnimationSpec<T> animationSpec, long j) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        long nanosToMillis = nanosToMillis(animation.getDurationNanos());
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new UtilsKt$createTransitionInfo$startTimeMs$2(animationSpec));
        Lazy lazy2 = LazyKt__LazyJVMKt.lazy(new UtilsKt$createTransitionInfo$values$2(animation, nanosToMillis, j, lazy));
        String name = animationSpec.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "animationSpec.javaClass.name");
        return new TransitionInfo(label, name, m58912a(lazy), nanosToMillis, m58911b(lazy2));
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Animation animation, String str, AnimationSpec animationSpec, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 1;
        }
        return createTransitionInfo(animation, str, animationSpec, j);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(InfiniteTransition.TransitionAnimationState transitionAnimationState, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(transitionAnimationState, j, j2);
    }

    @NotNull
    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(@NotNull InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, long j, long j2) {
        Intrinsics.checkNotNullParameter(transitionAnimationState, "<this>");
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new UtilsKt$createTransitionInfo$values$4(0L, transitionAnimationState, j2, j));
        String label = transitionAnimationState.getLabel();
        String name = transitionAnimationState.getAnimationSpec().getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "animationSpec.javaClass.name");
        return new TransitionInfo(label, name, 0L, j2, m58910c(lazy));
    }
}
