package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.SwipeableV2State;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\u001aO\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0084\u0001\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f28\u0010\u0018\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\\\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u00002\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d2#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00060\u001fH\u0001¢\u0006\u0004\b\"\u0010#\u001aC\u0010+\u001a(\u0012\u0004\u0012\u00020&\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\u0002\b(2\u0006\u0010%\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a=\u0010-\u001a(\u0012\u0004\u0012\u00020&\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\u0002\b(2\u0006\u0010,\u001a\u00020\u0017H\u0001¢\u0006\u0004\b-\u0010*\u001a9\u00101\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170.2\b\b\u0002\u0010/\u001a\u00020\u00172\b\b\u0002\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102\u001a'\u00103\u001a\u0004\u0018\u00010\u0017\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170.H\u0002¢\u0006\u0004\b3\u00104\u001a'\u00105\u001a\u0004\u0018\u00010\u0017\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170.H\u0002¢\u0006\u0004\b5\u00104\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, m28850d2 = {"T", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/SwipeableV2State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "swipeableV2", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SwipeableV2State;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "", "possibleValues", "Landroidx/compose/material3/AnchorChangeHandler;", "anchorChangeHandler", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Landroidx/compose/ui/unit/IntSize;", "layoutSize", "", "calculateAnchor", "swipeAnchors", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SwipeableV2State;Ljava/util/Set;Landroidx/compose/material3/AnchorChangeHandler;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "newValue", "confirmValueChange", "rememberSwipeableV2State", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SwipeableV2State;", "Landroidx/compose/ui/unit/Dp;", "threshold", "Landroidx/compose/ui/unit/Density;", "distance", "Lkotlin/ExtensionFunctionType;", "fixedPositionalThreshold-0680j_4", "(F)Lkotlin/jvm/functions/Function2;", "fixedPositionalThreshold", "fraction", "fractionalPositionalThreshold", "", TypedValues.CycleType.S_WAVE_OFFSET, "searchUpwards", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/Map;FZ)Ljava/lang/Object;", "d", "(Ljava/util/Map;)Ljava/lang/Float;", OperatorName.CURVE_TO, "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,692:1\n135#2:693\n1#3:694\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt\n*L\n136#1:693\n*E\n"})
/* loaded from: classes2.dex */
public final class SwipeableV2Kt {
    /* renamed from: a */
    public static final Object m60497a(Map map, float f, boolean z) {
        float f2;
        float f3;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z) {
                        f2 = floatValue - f;
                    } else {
                        f2 = f - floatValue;
                    }
                    if (f2 < 0.0f) {
                        f2 = Float.POSITIVE_INFINITY;
                    }
                    do {
                        Object next2 = it.next();
                        float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                        if (z) {
                            f3 = floatValue2 - f;
                        } else {
                            f3 = f - floatValue2;
                        }
                        if (f3 < 0.0f) {
                            f3 = Float.POSITIVE_INFINITY;
                        }
                        if (Float.compare(f2, f3) > 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it.hasNext());
                    return ((Map.Entry) next).getKey();
                }
                return ((Map.Entry) next).getKey();
            }
            throw new NoSuchElementException();
        }
        throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
    }

    /* renamed from: b */
    public static /* synthetic */ Object m60496b(Map map, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m60497a(map, f, z);
    }

    /* renamed from: c */
    public static final Float m60495c(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: d */
    public static final Float m60494d(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: fixedPositionalThreshold-0680j_4 */
    public static final Function2<Density, Float, Float> m70642fixedPositionalThreshold0680j_4(float f) {
        return new SwipeableV2Kt$fixedPositionalThreshold$1(f);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final Function2<Density, Float, Float> fractionalPositionalThreshold(float f) {
        return new SwipeableV2Kt$fractionalPositionalThreshold$1(f);
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final <T> SwipeableV2State<T> rememberSwipeableV2State(@NotNull T initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super T, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(856267266);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableV2Defaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = SwipeableV2Kt$rememberSwipeableV2State$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(856267266, i, -1, "androidx.compose.material3.rememberSwipeableV2State (SwipeableV2.kt:517)");
        }
        SwipeableV2State.Companion companion = SwipeableV2State.Companion;
        SwipeableV2Defaults swipeableV2Defaults = SwipeableV2Defaults.INSTANCE;
        SwipeableV2State<T> swipeableV2State = (SwipeableV2State) RememberSaveableKt.m71406rememberSaveable(new Object[]{initialValue, animationSpec, function1}, companion.m70645SavereqLRuRQ(animationSpec, function1, swipeableV2Defaults.getPositionalThreshold(), swipeableV2Defaults.m70641getVelocityThresholdD9Ej5fM()), (String) null, (Function0<? extends Object>) new SwipeableV2Kt$rememberSwipeableV2State$2(initialValue, animationSpec, function1), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableV2State;
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final <T> Modifier swipeAnchors(@NotNull Modifier modifier, @NotNull SwipeableV2State<T> state, @NotNull Set<? extends T> possibleValues, @Nullable AnchorChangeHandler<T> anchorChangeHandler, @NotNull Function2<? super T, ? super IntSize, Float> calculateAnchor) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(possibleValues, "possibleValues");
        Intrinsics.checkNotNullParameter(calculateAnchor, "calculateAnchor");
        SwipeableV2Kt$swipeAnchors$1 swipeableV2Kt$swipeAnchors$1 = new SwipeableV2Kt$swipeAnchors$1(state);
        SwipeableV2Kt$swipeAnchors$2 swipeableV2Kt$swipeAnchors$2 = new SwipeableV2Kt$swipeAnchors$2(state, possibleValues, anchorChangeHandler, calculateAnchor);
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1(state, possibleValues, anchorChangeHandler, calculateAnchor);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SwipeAnchorsModifier(swipeableV2Kt$swipeAnchors$1, swipeableV2Kt$swipeAnchors$2, noInspectorInfo));
    }

    public static /* synthetic */ Modifier swipeAnchors$default(Modifier modifier, SwipeableV2State swipeableV2State, Set set, AnchorChangeHandler anchorChangeHandler, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            anchorChangeHandler = null;
        }
        return swipeAnchors(modifier, swipeableV2State, set, anchorChangeHandler, function2);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final <T> Modifier swipeableV2(@NotNull Modifier modifier, @NotNull SwipeableV2State<T> state, @NotNull Orientation orientation, boolean z, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return DraggableKt.draggable$default(modifier, state.getSwipeDraggableState$material3_release(), orientation, z, mutableInteractionSource, state.isAnimationRunning(), null, new SwipeableV2Kt$swipeableV2$1(state, null), z2, 32, null);
    }

    public static /* synthetic */ Modifier swipeableV2$default(Modifier modifier, SwipeableV2State swipeableV2State, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        boolean z3;
        boolean z4;
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 8) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & 16) != 0) {
            mutableInteractionSource = null;
        }
        return swipeableV2(modifier, swipeableV2State, orientation, z3, z4, mutableInteractionSource);
    }
}
