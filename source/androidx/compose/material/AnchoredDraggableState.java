package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\b\u0001\u0018\u0000 |*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002}|Bu\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jo\u0010%\u001a\u00020\"2\b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001c\u001a\u00020\u001b2H\u0010$\u001aD\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d¢\u0006\u0002\b#H\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J5\u0010.\u001a\u00020\"2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010*H\u0000¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00028\u0000¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b2\u00103Jg\u00104\u001a\u00020\"2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2H\u0010$\u001aD\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d¢\u0006\u0002\b#H\u0086@ø\u0001\u0000¢\u0006\u0004\b4\u00105Jo\u00104\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00028\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b2H\u0010$\u001aD\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d¢\u0006\u0002\b#H\u0086@ø\u0001\u0000¢\u0006\u0004\b4\u0010&J\u0017\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0000¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005¢\u0006\u0004\b:\u00108J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u0000H\u0000¢\u0006\u0004\b;\u00101R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\bD\u0010ER5\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\bG\u0010?R\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010Q\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR+\u0010\u0014\u001a\u00028\u00002\u0006\u0010R\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bM\u0010WR\u001b\u0010\u001a\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010VR\u001b\u0010]\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b[\u0010Y\u001a\u0004\b\\\u0010VR1\u0010\u0013\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0018\n\u0004\b^\u0010T\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010(\"\u0004\bX\u0010`R\u001b\u0010e\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bc\u0010Y\u001a\u0004\bd\u0010(R+\u0010i\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010(\"\u0004\bS\u0010`R\u001b\u0010l\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bj\u0010Y\u001a\u0004\bk\u0010(R\u001b\u0010o\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bm\u0010Y\u001a\u0004\bn\u0010(R/\u0010q\u001a\u0004\u0018\u00018\u00002\b\u0010R\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010T\u001a\u0004\bF\u0010V\"\u0004\bI\u0010WRC\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010T\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0011\u0010z\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bz\u0010{\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006~"}, m28850d2 = {"Landroidx/compose/material/AnchoredDraggableState;", "T", "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "newValue", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", TypedValues.CycleType.S_WAVE_OFFSET, "currentValue", "velocity", PDPageLabelRange.STYLE_LETTERS_LOWER, "(FLjava/lang/Object;F)Ljava/lang/Object;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/material/AnchoredDragScope;", "", "anchors", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", OperatorName.CURVE_TO, "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireOffset", "()F", "newAnchors", "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "onAnchorsChanged", "updateAnchors$material_release", "(Ljava/util/Map;Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;)V", "updateAnchors", "value", "hasAnchorForValue", "(Ljava/lang/Object;)Z", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "newOffsetForDelta$material_release", "(F)F", "newOffsetForDelta", "dispatchRawDelta", "trySnapTo$material_release", "trySnapTo", "Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$material_release", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$material_release", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "d", "getConfirmValueChange$material_release", "Landroidx/compose/material/InternalMutatorMutex;", "e", "Landroidx/compose/material/InternalMutatorMutex;", "dragMutex", "Landroidx/compose/foundation/gestures/DraggableState;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "<set-?>", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", OperatorName.CLOSE_PATH, "Landroidx/compose/runtime/State;", "getTargetValue", "i", "getClosestValue$material_release", "closestValue", OperatorName.SET_LINE_JOINSTYLE, "getOffset", "(F)V", "getOffset$annotations", "()V", OperatorName.NON_STROKING_CMYK, "getProgress", "progress", OperatorName.LINE_TO, "Landroidx/compose/runtime/MutableFloatState;", "getLastVelocity", "lastVelocity", OperatorName.MOVE_TO, "getMinOffset", "minOffset", OperatorName.ENDPATH, "getMaxOffset", "maxOffset", "o", "animationTarget", "p", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "(Ljava/util/Map;)V", OperatorName.SAVE, "Landroidx/compose/material/AnchoredDragScope;", "anchoredDragScope", "isAnimationRunning", "()Z", "Companion", "AnchorChangedCallback", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,710:1\n81#2:711\n107#2,2:712\n81#2:714\n81#2:715\n81#2:716\n107#2,2:717\n81#2:719\n81#2:723\n81#2:724\n81#2:725\n107#2,2:726\n81#2:728\n107#2,2:729\n75#3:720\n108#3,2:721\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n*L\n162#1:711\n162#1:712,2\n170#1:714\n184#1:715\n203#1:716\n203#1:717,2\n231#1:719\n255#1:723\n261#1:724\n263#1:725\n263#1:726,2\n265#1:728\n265#1:729,2\n248#1:720\n248#1:721,2\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Function1 f14326a;

    /* renamed from: b */
    public final Function0 f14327b;

    /* renamed from: c */
    public final AnimationSpec f14328c;

    /* renamed from: d */
    public final Function1 f14329d;

    /* renamed from: e */
    public final InternalMutatorMutex f14330e;

    /* renamed from: f */
    public final DraggableState f14331f;

    /* renamed from: g */
    public final MutableState f14332g;

    /* renamed from: h */
    public final State f14333h;

    /* renamed from: i */
    public final State f14334i;

    /* renamed from: j */
    public final MutableState f14335j;

    /* renamed from: k */
    public final State f14336k;

    /* renamed from: l */
    public final MutableFloatState f14337l;

    /* renamed from: m */
    public final State f14338m;

    /* renamed from: n */
    public final State f14339n;

    /* renamed from: o */
    public final MutableState f14340o;

    /* renamed from: p */
    public final MutableState f14341p;

    /* renamed from: q */
    public final AnchoredDragScope f14342q;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material.AnchoredDraggableState$1 */
    /* loaded from: classes.dex */
    public static final class C30591 extends Lambda implements Function1<T, Boolean> {
        public static final C30591 INSTANCE = new C30591();

        public C30591() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(T t) {
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((C30591) obj);
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m28850d2 = {"Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "T", "", "onAnchorsChanged", "", "previousTargetValue", "previousAnchors", "", "", "newAnchors", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)V", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @ExperimentalMaterialApi
    /* loaded from: classes.dex */
    public interface AnchorChangedCallback<T> {
        void onAnchorsChanged(T t, @NotNull Map<T, Float> map, @NotNull Map<T, Float> map2);
    }

    @Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jw\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0007¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/material/AnchoredDraggableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/AnchoredDraggableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/ParameterName;", "name", "distance", "velocityThreshold", "Lkotlin/Function0;", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalMaterialApi
        @NotNull
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmValueChange, @NotNull Function1<? super Float, Float> positionalThreshold, @NotNull Function0<Float> velocityThreshold) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
            return SaverKt.Saver(AnchoredDraggableState$Companion$Saver$1.INSTANCE, new AnchoredDraggableState$Companion$Saver$2(positionalThreshold, velocityThreshold, animationSpec, confirmValueChange));
        }

        public Companion() {
        }
    }

    public AnchoredDraggableState(T t, @NotNull Function1<? super Float, Float> positionalThreshold, @NotNull Function0<Float> velocityThreshold, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmValueChange) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        this.f14326a = positionalThreshold;
        this.f14327b = velocityThreshold;
        this.f14328c = animationSpec;
        this.f14329d = confirmValueChange;
        this.f14330e = new InternalMutatorMutex();
        this.f14331f = new AnchoredDraggableState$draggableState$1(this);
        m31891g = AbstractC19508dK1.m31891g(t, null, 2, null);
        this.f14332g = m31891g;
        this.f14333h = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$targetValue$2(this));
        this.f14334i = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$closestValue$2(this));
        m31891g2 = AbstractC19508dK1.m31891g(Float.valueOf(Float.NaN), null, 2, null);
        this.f14335j = m31891g2;
        this.f14336k = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new AnchoredDraggableState$progress$2(this));
        this.f14337l = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f14338m = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$minOffset$2(this));
        this.f14339n = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$maxOffset$2(this));
        m31891g3 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14340o = m31891g3;
        m31891g4 = AbstractC19508dK1.m31891g(AbstractC11687a.emptyMap(), null, 2, null);
        this.f14341p = m31891g4;
        this.f14342q = new AnchoredDragScope() { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1
            {
                AnchoredDraggableState.this = this;
            }

            @Override // androidx.compose.material.AnchoredDragScope
            public void dragTo(float f, float f2) {
                AnchoredDraggableState.access$setOffset(AnchoredDraggableState.this, f);
                AnchoredDraggableState.access$setLastVelocity(AnchoredDraggableState.this, f2);
            }
        };
    }

    public static final /* synthetic */ void access$setLastVelocity(AnchoredDraggableState anchoredDraggableState, float f) {
        anchoredDraggableState.m60956g(f);
    }

    public static final /* synthetic */ void access$setOffset(AnchoredDraggableState anchoredDraggableState, float f) {
        anchoredDraggableState.m60955h(f);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$material_release$default(AnchoredDraggableState anchoredDraggableState, Map map, AnchorChangedCallback anchorChangedCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            anchorChangedCallback = null;
        }
        anchoredDraggableState.updateAnchors$material_release(map, anchorChangedCallback);
    }

    /* renamed from: a */
    public final Object m60962a(float f, Object obj, float f2) {
        Object m60966a;
        Object m60966a2;
        Object m60966a3;
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        Float f3 = anchors$material_release.get(obj);
        float floatValue = ((Number) this.f14327b.invoke()).floatValue();
        if (!Intrinsics.areEqual(f3, f) && f3 != null) {
            if (f3.floatValue() < f) {
                if (f2 >= floatValue) {
                    m60966a3 = AnchoredDraggableKt.m60966a(anchors$material_release, f, true);
                    return m60966a3;
                }
                m60966a = AnchoredDraggableKt.m60966a(anchors$material_release, f, true);
                if (f < Math.abs(f3.floatValue() + Math.abs(((Number) this.f14326a.invoke(Float.valueOf(Math.abs(((Number) AbstractC11687a.getValue(anchors$material_release, m60966a)).floatValue() - f3.floatValue())))).floatValue()))) {
                    return obj;
                }
            } else if (f2 <= (-floatValue)) {
                m60966a2 = AnchoredDraggableKt.m60966a(anchors$material_release, f, false);
                return m60966a2;
            } else {
                m60966a = AnchoredDraggableKt.m60966a(anchors$material_release, f, false);
                float abs = Math.abs(f3.floatValue() - Math.abs(((Number) this.f14326a.invoke(Float.valueOf(Math.abs(f3.floatValue() - ((Number) AbstractC11687a.getValue(anchors$material_release, m60966a)).floatValue())))).floatValue()));
                if (f < 0.0f) {
                    if (Math.abs(f) < abs) {
                        return obj;
                    }
                } else if (f > abs) {
                    return obj;
                }
            }
            return m60966a;
        }
        return obj;
    }

    @Nullable
    public final Object anchoredDrag(@NotNull MutatePriority mutatePriority, @NotNull Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object m60960c = m60960c(null, mutatePriority, function3, continuation);
        return m60960c == AbstractC18812Yf0.getCOROUTINE_SUSPENDED() ? m60960c : Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Object m60961b(float f, Object obj) {
        Object m60966a;
        Object m60966a2;
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        Float f2 = anchors$material_release.get(obj);
        if (!Intrinsics.areEqual(f2, f) && f2 != null) {
            if (f2.floatValue() < f) {
                m60966a2 = AnchoredDraggableKt.m60966a(anchors$material_release, f, true);
                return m60966a2;
            }
            m60966a = AnchoredDraggableKt.m60966a(anchors$material_release, f, false);
            return m60966a;
        }
        return obj;
    }

    /* renamed from: c */
    public final Object m60960c(Object obj, MutatePriority mutatePriority, Function3 function3, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new AnchoredDraggableState$doAnchoredDrag$2(obj, this, mutatePriority, function3, null), continuation);
        if (coroutineScope == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public final Object m60959d() {
        return this.f14340o.getValue();
    }

    public final float dispatchRawDelta(float f) {
        float offset;
        float newOffsetForDelta$material_release = newOffsetForDelta$material_release(f);
        if (Float.isNaN(getOffset())) {
            offset = 0.0f;
        } else {
            offset = getOffset();
        }
        m60955h(newOffsetForDelta$material_release);
        return newOffsetForDelta$material_release - offset;
    }

    /* renamed from: e */
    public final void m60958e(Object obj) {
        this.f14340o.setValue(obj);
    }

    /* renamed from: f */
    public final void m60957f(Object obj) {
        this.f14332g.setValue(obj);
    }

    /* renamed from: g */
    public final void m60956g(float f) {
        this.f14337l.setFloatValue(f);
    }

    @NotNull
    public final Map<T, Float> getAnchors$material_release() {
        return (Map) this.f14341p.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec() {
        return this.f14328c;
    }

    public final T getClosestValue$material_release() {
        return (T) this.f14334i.getValue();
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmValueChange$material_release() {
        return this.f14329d;
    }

    public final T getCurrentValue() {
        return this.f14332g.getValue();
    }

    @NotNull
    public final DraggableState getDraggableState$material_release() {
        return this.f14331f;
    }

    public final float getLastVelocity() {
        return this.f14337l.getFloatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.f14339n.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.f14338m.getValue()).floatValue();
    }

    public final float getOffset() {
        return ((Number) this.f14335j.getValue()).floatValue();
    }

    @NotNull
    public final Function1<Float, Float> getPositionalThreshold$material_release() {
        return this.f14326a;
    }

    public final float getProgress() {
        return ((Number) this.f14336k.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.f14333h.getValue();
    }

    @NotNull
    public final Function0<Float> getVelocityThreshold$material_release() {
        return this.f14327b;
    }

    /* renamed from: h */
    public final void m60955h(float f) {
        this.f14335j.setValue(Float.valueOf(f));
    }

    public final boolean hasAnchorForValue(T t) {
        return getAnchors$material_release().containsKey(t);
    }

    public final boolean isAnimationRunning() {
        if (m60959d() != null) {
            return true;
        }
        return false;
    }

    public final float newOffsetForDelta$material_release(float f) {
        float offset;
        if (Float.isNaN(getOffset())) {
            offset = 0.0f;
        } else {
            offset = getOffset();
        }
        return AbstractC11719c.coerceIn(offset + f, getMinOffset(), getMaxOffset());
    }

    public final float requireOffset() {
        if (!Float.isNaN(getOffset())) {
            return getOffset();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void setAnchors$material_release(@NotNull Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f14341p.setValue(map);
    }

    @Nullable
    public final Object settle(float f, @NotNull Continuation<? super Unit> continuation) {
        T currentValue = getCurrentValue();
        Object m60962a = m60962a(requireOffset(), currentValue, f);
        if (((Boolean) this.f14329d.invoke(m60962a)).booleanValue()) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, m60962a, f, continuation);
            if (animateTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return animateTo;
            }
            return Unit.INSTANCE;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f, continuation);
        if (animateTo2 == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo2;
        }
        return Unit.INSTANCE;
    }

    public final boolean trySnapTo$material_release(T t) {
        return this.f14330e.tryMutate(new AnchoredDraggableState$trySnapTo$1(this, t));
    }

    public final void updateAnchors$material_release(@NotNull Map<T, Float> newAnchors, @Nullable AnchorChangedCallback<T> anchorChangedCallback) {
        boolean z;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (!Intrinsics.areEqual(getAnchors$material_release(), newAnchors)) {
            Map<T, Float> anchors$material_release = getAnchors$material_release();
            T targetValue = getTargetValue();
            boolean isEmpty = getAnchors$material_release().isEmpty();
            setAnchors$material_release(newAnchors);
            if (getAnchors$material_release().get(getCurrentValue()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (isEmpty && z) {
                trySnapTo$material_release(getCurrentValue());
            } else if (anchorChangedCallback != null) {
                anchorChangedCallback.onAnchorsChanged(targetValue, anchors$material_release, newAnchors);
            }
        }
    }

    @Nullable
    public final Object anchoredDrag(T t, @NotNull MutatePriority mutatePriority, @NotNull Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object m60960c = m60960c(t, mutatePriority, function3, continuation);
        return m60960c == AbstractC18812Yf0.getCOROUTINE_SUSPENDED() ? m60960c : Unit.INSTANCE;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function3, continuation);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, (i & 8) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 16) != 0 ? C30591.INSTANCE : function12);
    }
}
