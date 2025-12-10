package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
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
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u0083\u0001*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0083\u0001BD\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001e\u001a\u00020\u00102\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0016H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00028\u00002\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0012J\u0015\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005¢\u0006\u0004\b(\u0010)R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b+\u0010,R5\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R+\u00107\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b2\u00106R+\u00108\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u00103\u001a\u0004\b8\u00109\"\u0004\b-\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0014\u0010B\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=R\u001c\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00103RC\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bF\u00103\u001a\u0004\bG\u0010H\"\u0004\bI\u0010\u0019R&\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00160K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010U\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TRO\u0010`\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050Z2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050Z8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b[\u00103\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R+\u0010d\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010=\u001a\u0004\bb\u0010R\"\u0004\bc\u0010TR/\u0010k\u001a\u0004\u0018\u00010e2\b\u00101\u001a\u0004\u0018\u00010e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bf\u00103\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001a\u0010q\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010\u001f\u001a\u00028\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bs\u0010t\u001a\u0004\br\u00105R \u0010y\u001a\b\u0012\u0004\u0012\u00028\u00000u8FX\u0087\u0004¢\u0006\f\u0012\u0004\bx\u0010t\u001a\u0004\bv\u0010wR\u001a\u0010|\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b{\u0010t\u001a\u0004\bz\u0010RR\u0018\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050}8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0019\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050}8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u007f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0084\u0001"}, m28850d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "confirmStateChange", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", TypedValues.AttributesType.S_TARGET, "", "d", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "spec", PDPageLabelRange.STYLE_LETTERS_LOWER, "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newAnchors", "ensureInit$material_release", "(Ljava/util/Map;)V", "ensureInit", "oldAnchors", "processNewAnchors$material_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "targetValue", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anim", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "performFling", "delta", "performDrag", "(F)F", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getConfirmStateChange$material_release", "()Lkotlin/jvm/functions/Function1;", "<set-?>", OperatorName.CURVE_TO, "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "currentValue", "isAnimationRunning", "()Z", "(Z)V", "Landroidx/compose/runtime/MutableFloatState;", "e", "Landroidx/compose/runtime/MutableFloatState;", "offsetState", OperatorName.FILL_NON_ZERO, "overflowState", OperatorName.NON_STROKING_GRAY, "absoluteOffset", "Landroidx/compose/runtime/MutableState;", OperatorName.CLOSE_PATH, "animationTarget", "i", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "anchors", "Lkotlinx/coroutines/flow/Flow;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlinx/coroutines/flow/Flow;", "latestNonEmptyAnchorsFlow", OperatorName.NON_STROKING_CMYK, "F", "getMinBound$material_release", "()F", "setMinBound$material_release", "(F)V", "minBound", OperatorName.LINE_TO, "getMaxBound$material_release", "setMaxBound$material_release", "maxBound", "Lkotlin/Function2;", OperatorName.MOVE_TO, "getThresholds$material_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", OperatorName.ENDPATH, "getVelocityThreshold$material_release", "setVelocityThreshold$material_release", "velocityThreshold", "Landroidx/compose/material/ResistanceConfig;", "o", "getResistance$material_release", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material_release", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "p", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "getTargetValue", "getTargetValue$annotations", "()V", "Landroidx/compose/material/SwipeProgress;", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", "progress", "getDirection", "getDirection$annotations", "direction", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", TypedValues.CycleType.S_WAVE_OFFSET, "getOverflow", "overflow", "Companion", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n20#2:891\n22#2:895\n50#3:892\n55#3:894\n106#4:893\n81#5:896\n107#5,2:897\n81#5:899\n107#5,2:900\n81#5:902\n107#5,2:903\n81#5:933\n107#5,2:934\n81#5:939\n107#5,2:940\n2333#6,14:905\n2333#6,14:919\n75#7:936\n108#7,2:937\n1#8:942\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n128#1:891\n128#1:895\n128#1:892\n128#1:894\n128#1:893\n91#1:896\n91#1:897,2\n97#1:899\n97#1:900,2\n124#1:902\n124#1:903,2\n195#1:933\n195#1:934,2\n199#1:939\n199#1:940,2\n174#1:905,14\n180#1:919,14\n197#1:936\n197#1:937,2\n*E\n"})
/* loaded from: classes.dex */
public class SwipeableState<T> {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final AnimationSpec f14637a;

    /* renamed from: b */
    public final Function1 f14638b;

    /* renamed from: c */
    public final MutableState f14639c;

    /* renamed from: d */
    public final MutableState f14640d;

    /* renamed from: e */
    public final MutableFloatState f14641e;

    /* renamed from: f */
    public final MutableFloatState f14642f;

    /* renamed from: g */
    public final MutableFloatState f14643g;

    /* renamed from: h */
    public final MutableState f14644h;

    /* renamed from: i */
    public final MutableState f14645i;

    /* renamed from: j */
    public final Flow f14646j;

    /* renamed from: k */
    public float f14647k;

    /* renamed from: l */
    public float f14648l;

    /* renamed from: m */
    public final MutableState f14649m;

    /* renamed from: n */
    public final MutableFloatState f14650n;

    /* renamed from: o */
    public final MutableState f14651o;

    /* renamed from: p */
    public final DraggableState f14652p;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material.SwipeableState$1 */
    /* loaded from: classes.dex */
    public static final class C31881 extends Lambda implements Function1<T, Boolean> {
        public static final C31881 INSTANCE = new C31881();

        public C31881() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(T t) {
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((C31881) obj);
        }
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m28850d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Saver<SwipeableState<T>, T> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(SwipeableState$Companion$Saver$1.INSTANCE, new SwipeableState$Companion$Saver$2(animationSpec, confirmStateChange));
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.material.SwipeableState$a */
    /* loaded from: classes.dex */
    public static final class C3189a implements FlowCollector {

        /* renamed from: b */
        public final /* synthetic */ float f14654b;

        public C3189a(float f) {
            this.f14654b = f;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Map map, Continuation continuation) {
            Float m60800c;
            float m60802a;
            m60800c = SwipeableKt.m60800c(map, SwipeableState.this.getCurrentValue());
            Intrinsics.checkNotNull(m60800c);
            float floatValue = m60800c.floatValue();
            m60802a = SwipeableKt.m60802a(SwipeableState.this.getOffset().getValue().floatValue(), floatValue, map.keySet(), SwipeableState.this.getThresholds$material_release(), this.f14654b, SwipeableState.this.getVelocityThreshold$material_release());
            Object obj = map.get(Boxing.boxFloat(m60802a));
            if (obj != null && SwipeableState.this.getConfirmStateChange$material_release().invoke(obj).booleanValue()) {
                Object animateTo$default = SwipeableState.animateTo$default(SwipeableState.this, obj, null, continuation, 2, null);
                if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                    return animateTo$default;
                }
                return Unit.INSTANCE;
            }
            SwipeableState swipeableState = SwipeableState.this;
            Object m60797a = swipeableState.m60797a(floatValue, swipeableState.getAnimationSpec$material_release(), continuation);
            if (m60797a == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return m60797a;
            }
            return Unit.INSTANCE;
        }
    }

    public SwipeableState(T t, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmStateChange) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        MutableState m31891g5;
        MutableState m31891g6;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.f14637a = animationSpec;
        this.f14638b = confirmStateChange;
        m31891g = AbstractC19508dK1.m31891g(t, null, 2, null);
        this.f14639c = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f14640d = m31891g2;
        this.f14641e = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f14642f = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f14643g = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        m31891g3 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14644h = m31891g3;
        m31891g4 = AbstractC19508dK1.m31891g(AbstractC11687a.emptyMap(), null, 2, null);
        this.f14645i = m31891g4;
        final Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new SwipeableState$latestNonEmptyAnchorsFlow$1(this));
        this.f14646j = FlowKt.take(new Flow<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n1#1,222:1\n21#2:223\n22#2:225\n128#3:224\n*E\n"})
            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2 */
            /* loaded from: classes.dex */
            public static final class C31902<T> implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f14656a;

                @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
                @DebugMetadata(m28801c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", m28800f = "Swipeable.kt", m28799i = {}, m28798l = {223}, m28797m = "emit", m28796n = {}, m28795s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 */
                /* loaded from: classes.dex */
                public static final class C31911 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public C31911(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C31902.this.emit(null, this);
                    }
                }

                public C31902(FlowCollector flowCollector) {
                    this.f14656a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.C31902.C31911
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.C31902.C31911) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f14656a
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L49
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.C31902.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object collect = Flow.this.collect(new C31902(flowCollector), continuation);
                if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, 1);
        this.f14647k = Float.NEGATIVE_INFINITY;
        this.f14648l = Float.POSITIVE_INFINITY;
        m31891g5 = AbstractC19508dK1.m31891g(SwipeableState$thresholds$2.INSTANCE, null, 2, null);
        this.f14649m = m31891g5;
        this.f14650n = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        m31891g6 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f14651o = m31891g6;
        this.f14652p = DraggableKt.DraggableState(new SwipeableState$draggableState$1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                animationSpec = swipeableState.f14637a;
            }
            return swipeableState.animateTo(obj, animationSpec, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getDirection$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* renamed from: a */
    public final Object m60797a(float f, AnimationSpec animationSpec, Continuation continuation) {
        Object m31148a = AbstractC10295gK.m31148a(this.f14652p, null, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation, 1, null);
        if (m31148a == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m31148a;
        }
        return Unit.INSTANCE;
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(T t, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object collect = this.f14646j.collect(new SwipeableState$animateTo$2(t, this, animationSpec), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final void m60796b(boolean z) {
        this.f14640d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void m60795c(Object obj) {
        this.f14639c.setValue(obj);
    }

    /* renamed from: d */
    public final Object m60794d(float f, Continuation continuation) {
        Object m31148a = AbstractC10295gK.m31148a(this.f14652p, null, new SwipeableState$snapInternalToOffset$2(f, this, null), continuation, 1, null);
        if (m31148a == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m31148a;
        }
        return Unit.INSTANCE;
    }

    public final void ensureInit$material_release(@NotNull Map<Float, ? extends T> newAnchors) {
        Float m60800c;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (getAnchors$material_release().isEmpty()) {
            m60800c = SwipeableKt.m60800c(newAnchors, getCurrentValue());
            if (m60800c != null) {
                this.f14641e.setFloatValue(m60800c.floatValue());
                this.f14643g.setFloatValue(m60800c.floatValue());
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    @NotNull
    public final Map<Float, T> getAnchors$material_release() {
        return (Map) this.f14645i.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.f14637a;
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmStateChange$material_release() {
        return this.f14638b;
    }

    public final T getCurrentValue() {
        return this.f14639c.getValue();
    }

    public final float getDirection() {
        Float m60800c;
        m60800c = SwipeableKt.m60800c(getAnchors$material_release(), getCurrentValue());
        if (m60800c != null) {
            return Math.signum(getOffset().getValue().floatValue() - m60800c.floatValue());
        }
        return 0.0f;
    }

    @NotNull
    public final DraggableState getDraggableState$material_release() {
        return this.f14652p;
    }

    public final float getMaxBound$material_release() {
        return this.f14648l;
    }

    public final float getMinBound$material_release() {
        return this.f14647k;
    }

    @NotNull
    public final State<Float> getOffset() {
        return this.f14641e;
    }

    @NotNull
    public final State<Float> getOverflow() {
        return this.f14642f;
    }

    @NotNull
    public final SwipeProgress<T> getProgress() {
        List m60801b;
        Object currentValue;
        Object obj;
        float f;
        Object obj2;
        Pair m28844to;
        m60801b = SwipeableKt.m60801b(getOffset().getValue().floatValue(), getAnchors$material_release().keySet());
        int size = m60801b.size();
        if (size != 0) {
            if (size != 1) {
                if (getDirection() > 0.0f) {
                    m28844to = TuplesKt.m28844to(m60801b.get(0), m60801b.get(1));
                } else {
                    m28844to = TuplesKt.m28844to(m60801b.get(1), m60801b.get(0));
                }
                float floatValue = ((Number) m28844to.component1()).floatValue();
                float floatValue2 = ((Number) m28844to.component2()).floatValue();
                Object value = AbstractC11687a.getValue(getAnchors$material_release(), Float.valueOf(floatValue));
                currentValue = AbstractC11687a.getValue(getAnchors$material_release(), Float.valueOf(floatValue2));
                f = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
                obj2 = value;
                return new SwipeProgress<>(obj2, currentValue, f);
            }
            Object value2 = AbstractC11687a.getValue(getAnchors$material_release(), m60801b.get(0));
            currentValue = AbstractC11687a.getValue(getAnchors$material_release(), m60801b.get(0));
            obj = value2;
        } else {
            Object currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
        }
        f = 1.0f;
        obj2 = obj;
        return new SwipeProgress<>(obj2, currentValue, f);
    }

    @Nullable
    public final ResistanceConfig getResistance$material_release() {
        return (ResistanceConfig) this.f14651o.getValue();
    }

    public final T getTargetValue() {
        Float m60800c;
        float floatValue;
        float m60802a;
        Float f = (Float) this.f14644h.getValue();
        if (f != null) {
            m60802a = f.floatValue();
        } else {
            float floatValue2 = getOffset().getValue().floatValue();
            m60800c = SwipeableKt.m60800c(getAnchors$material_release(), getCurrentValue());
            if (m60800c != null) {
                floatValue = m60800c.floatValue();
            } else {
                floatValue = getOffset().getValue().floatValue();
            }
            m60802a = SwipeableKt.m60802a(floatValue2, floatValue, getAnchors$material_release().keySet(), getThresholds$material_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$material_release().get(Float.valueOf(m60802a));
        if (t == null) {
            return getCurrentValue();
        }
        return t;
    }

    @NotNull
    public final Function2<Float, Float, Float> getThresholds$material_release() {
        return (Function2) this.f14649m.getValue();
    }

    public final float getVelocityThreshold$material_release() {
        return this.f14650n.getFloatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.f14640d.getValue()).booleanValue();
    }

    public final float performDrag(float f) {
        float coerceIn = AbstractC11719c.coerceIn(this.f14643g.getFloatValue() + f, this.f14647k, this.f14648l) - this.f14643g.getFloatValue();
        if (Math.abs(coerceIn) > 0.0f) {
            this.f14652p.dispatchRawDelta(coerceIn);
        }
        return coerceIn;
    }

    @Nullable
    public final Object performFling(float f, @NotNull Continuation<? super Unit> continuation) {
        Object collect = this.f14646j.collect(new C3189a(f), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v76, types: [float] */
    /* JADX WARN: Type inference failed for: r10v78, types: [float] */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processNewAnchors$material_release(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r10, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.processNewAnchors$material_release(java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setAnchors$material_release(@NotNull Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f14645i.setValue(map);
    }

    public final void setMaxBound$material_release(float f) {
        this.f14648l = f;
    }

    public final void setMinBound$material_release(float f) {
        this.f14647k = f;
    }

    public final void setResistance$material_release(@Nullable ResistanceConfig resistanceConfig) {
        this.f14651o.setValue(resistanceConfig);
    }

    public final void setThresholds$material_release(@NotNull Function2<? super Float, ? super Float, Float> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f14649m.setValue(function2);
    }

    public final void setVelocityThreshold$material_release(float f) {
        this.f14650n.setFloatValue(f);
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object snapTo(T t, @NotNull Continuation<? super Unit> continuation) {
        Object collect = this.f14646j.collect(new SwipeableState$snapTo$2(t, this), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? C31881.INSTANCE : function1);
    }
}
