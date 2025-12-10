package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
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

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u0000 \u0085\u0001*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0085\u0001BD\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001e\u001a\u00020\u00102\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0016H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00028\u0000H\u0081@ø\u0001\u0000¢\u0006\u0004\b \u0010!J+\u0010&\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00028\u00002\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0081@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010)\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0012J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0000¢\u0006\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b/\u00100R5\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R+\u0010;\u001a\u00028\u00002\u0006\u00105\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b6\u0010:R+\u0010<\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u00107\u001a\u0004\b<\u0010=\"\u0004\b1\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00107R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00107R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00107R\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00107RC\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bH\u00107\u001a\u0004\bI\u0010J\"\u0004\bK\u0010\u0019R&\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00160M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010W\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010R\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VRO\u0010b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\\2\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\\8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b]\u00107\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR+\u0010f\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bc\u00107\u001a\u0004\bd\u0010T\"\u0004\be\u0010VR/\u0010m\u001a\u0004\u0018\u00010g2\b\u00105\u001a\u0004\u0018\u00010g8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bh\u00107\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010s\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001a\u0010\u001f\u001a\u00028\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\bu\u0010v\u001a\u0004\bt\u00109R \u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000w8@X\u0081\u0004¢\u0006\f\u0012\u0004\bz\u0010v\u001a\u0004\bx\u0010yR\u001a\u0010~\u001a\u00020\u00058@X\u0081\u0004¢\u0006\f\u0012\u0004\b}\u0010v\u001a\u0004\b|\u0010TR\u001a\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u007f8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u007f8F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0086\u0001"}, m28850d2 = {"Landroidx/compose/material3/SwipeableState;", "T", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "confirmStateChange", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", TypedValues.AttributesType.S_TARGET, "", "d", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "spec", PDPageLabelRange.STYLE_LETTERS_LOWER, "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newAnchors", "ensureInit$material3_release", "(Ljava/util/Map;)V", "ensureInit", "oldAnchors", "processNewAnchors$material3_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "targetValue", "snapTo$material3_release", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "anim", "animateTo$material3_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "velocity", "performFling$material3_release", "performFling", "delta", "performDrag$material3_release", "(F)F", "performDrag", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material3_release", "()Landroidx/compose/animation/core/AnimationSpec;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getConfirmStateChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "<set-?>", OperatorName.CURVE_TO, "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "currentValue", "isAnimationRunning", "()Z", "(Z)V", "Landroidx/compose/runtime/MutableState;", "e", "offsetState", OperatorName.FILL_NON_ZERO, "overflowState", OperatorName.NON_STROKING_GRAY, "absoluteOffset", OperatorName.CLOSE_PATH, "animationTarget", "i", "getAnchors$material3_release", "()Ljava/util/Map;", "setAnchors$material3_release", "anchors", "Lkotlinx/coroutines/flow/Flow;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlinx/coroutines/flow/Flow;", "latestNonEmptyAnchorsFlow", OperatorName.NON_STROKING_CMYK, "F", "getMinBound$material3_release", "()F", "setMinBound$material3_release", "(F)V", "minBound", OperatorName.LINE_TO, "getMaxBound$material3_release", "setMaxBound$material3_release", "maxBound", "Lkotlin/Function2;", OperatorName.MOVE_TO, "getThresholds$material3_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material3_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", OperatorName.ENDPATH, "getVelocityThreshold$material3_release", "setVelocityThreshold$material3_release", "velocityThreshold", "Landroidx/compose/material3/ResistanceConfig;", "o", "getResistance$material3_release", "()Landroidx/compose/material3/ResistanceConfig;", "setResistance$material3_release", "(Landroidx/compose/material3/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "p", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "getTargetValue$material3_release", "getTargetValue$material3_release$annotations", "()V", "Landroidx/compose/material3/SwipeProgress;", "getProgress$material3_release", "()Landroidx/compose/material3/SwipeProgress;", "getProgress$material3_release$annotations", "progress", "getDirection$material3_release", "getDirection$material3_release$annotations", "direction", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", TypedValues.CycleType.S_WAVE_OFFSET, "getOverflow", "overflow", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,886:1\n20#2:887\n22#2:891\n50#3:888\n55#3:890\n106#4:889\n76#5:892\n102#5,2:893\n76#5:895\n102#5,2:896\n76#5:898\n102#5,2:899\n76#5:929\n102#5,2:930\n76#5:932\n102#5,2:933\n76#5:935\n102#5,2:936\n2333#6,14:901\n2333#6,14:915\n1#7:938\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableState\n*L\n128#1:887\n128#1:891\n128#1:888\n128#1:890\n128#1:889\n91#1:892\n91#1:893,2\n97#1:895\n97#1:896,2\n124#1:898\n124#1:899,2\n195#1:929\n195#1:930,2\n197#1:932\n197#1:933,2\n199#1:935\n199#1:936,2\n174#1:901,14\n180#1:915,14\n*E\n"})
/* loaded from: classes2.dex */
public class SwipeableState<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final AnimationSpec f26216a;

    /* renamed from: b */
    public final Function1 f26217b;

    /* renamed from: c */
    public final MutableState f26218c;

    /* renamed from: d */
    public final MutableState f26219d;

    /* renamed from: e */
    public final MutableState f26220e;

    /* renamed from: f */
    public final MutableState f26221f;

    /* renamed from: g */
    public final MutableState f26222g;

    /* renamed from: h */
    public final MutableState f26223h;

    /* renamed from: i */
    public final MutableState f26224i;

    /* renamed from: j */
    public final Flow f26225j;

    /* renamed from: k */
    public float f26226k;

    /* renamed from: l */
    public float f26227l;

    /* renamed from: m */
    public final MutableState f26228m;

    /* renamed from: n */
    public final MutableState f26229n;

    /* renamed from: o */
    public final MutableState f26230o;

    /* renamed from: p */
    public final DraggableState f26231p;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.SwipeableState$1 */
    /* loaded from: classes2.dex */
    public static final class C33841 extends Lambda implements Function1<T, Boolean> {
        public static final C33841 INSTANCE = new C33841();

        public C33841() {
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
            return invoke((C33841) obj);
        }
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m28850d2 = {"Landroidx/compose/material3/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SwipeableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
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

    /* renamed from: androidx.compose.material3.SwipeableState$a */
    /* loaded from: classes2.dex */
    public static final class C3385a implements FlowCollector {

        /* renamed from: b */
        public final /* synthetic */ float f26233b;

        public C3385a(float f) {
            this.f26233b = f;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Map map, Continuation continuation) {
            Float m60507c;
            float m60509a;
            m60507c = SwipeableKt.m60507c(map, SwipeableState.this.getCurrentValue());
            Intrinsics.checkNotNull(m60507c);
            float floatValue = m60507c.floatValue();
            m60509a = SwipeableKt.m60509a(SwipeableState.this.getOffset().getValue().floatValue(), floatValue, map.keySet(), SwipeableState.this.getThresholds$material3_release(), this.f26233b, SwipeableState.this.getVelocityThreshold$material3_release());
            Object obj = map.get(Boxing.boxFloat(m60509a));
            if (obj != null && SwipeableState.this.getConfirmStateChange$material3_release().invoke(obj).booleanValue()) {
                Object animateTo$material3_release$default = SwipeableState.animateTo$material3_release$default(SwipeableState.this, obj, null, continuation, 2, null);
                if (animateTo$material3_release$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                    return animateTo$material3_release$default;
                }
                return Unit.INSTANCE;
            }
            SwipeableState swipeableState = SwipeableState.this;
            Object m60504a = swipeableState.m60504a(floatValue, swipeableState.getAnimationSpec$material3_release(), continuation);
            if (m60504a == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return m60504a;
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
        MutableState m31891g7;
        MutableState m31891g8;
        MutableState m31891g9;
        MutableState m31891g10;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.f26216a = animationSpec;
        this.f26217b = confirmStateChange;
        m31891g = AbstractC19508dK1.m31891g(t, null, 2, null);
        this.f26218c = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f26219d = m31891g2;
        Float valueOf = Float.valueOf(0.0f);
        m31891g3 = AbstractC19508dK1.m31891g(valueOf, null, 2, null);
        this.f26220e = m31891g3;
        m31891g4 = AbstractC19508dK1.m31891g(valueOf, null, 2, null);
        this.f26221f = m31891g4;
        m31891g5 = AbstractC19508dK1.m31891g(valueOf, null, 2, null);
        this.f26222g = m31891g5;
        m31891g6 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f26223h = m31891g6;
        m31891g7 = AbstractC19508dK1.m31891g(AbstractC11687a.emptyMap(), null, 2, null);
        this.f26224i = m31891g7;
        final Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new SwipeableState$latestNonEmptyAnchorsFlow$1(this));
        this.f26225j = FlowKt.take(new Flow<Map<Float, ? extends T>>() { // from class: androidx.compose.material3.SwipeableState$special$$inlined$filter$1

            @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Swipeable.kt\nandroidx/compose/material3/SwipeableState\n*L\n1#1,222:1\n21#2:223\n22#2:225\n128#3:224\n*E\n"})
            /* renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2 */
            /* loaded from: classes2.dex */
            public static final class C33862<T> implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f26235a;

                @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
                @DebugMetadata(m28801c = "androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2", m28800f = "Swipeable.kt", m28799i = {}, m28798l = {223}, m28797m = "emit", m28796n = {}, m28795s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1 */
                /* loaded from: classes2.dex */
                public static final class C33871 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public C33871(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C33862.this.emit(null, this);
                    }
                }

                public C33862(FlowCollector flowCollector) {
                    this.f26235a = flowCollector;
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
                        boolean r0 = r6 instanceof androidx.compose.material3.SwipeableState$special$$inlined$filter$1.C33862.C33871
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material3.SwipeableState$special$$inlined$filter$1.C33862.C33871) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1
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
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f26235a
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState$special$$inlined$filter$1.C33862.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object collect = Flow.this.collect(new C33862(flowCollector), continuation);
                if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }, 1);
        this.f26226k = Float.NEGATIVE_INFINITY;
        this.f26227l = Float.POSITIVE_INFINITY;
        m31891g8 = AbstractC19508dK1.m31891g(SwipeableState$thresholds$2.INSTANCE, null, 2, null);
        this.f26228m = m31891g8;
        m31891g9 = AbstractC19508dK1.m31891g(valueOf, null, 2, null);
        this.f26229n = m31891g9;
        m31891g10 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f26230o = m31891g10;
        this.f26231p = DraggableKt.DraggableState(new SwipeableState$draggableState$1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$material3_release$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                animationSpec = swipeableState.f26216a;
            }
            return swipeableState.animateTo$material3_release(obj, animationSpec, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getDirection$material3_release$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getProgress$material3_release$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getTargetValue$material3_release$annotations() {
    }

    /* renamed from: a */
    public final Object m60504a(float f, AnimationSpec animationSpec, Continuation continuation) {
        Object m31148a = AbstractC10295gK.m31148a(this.f26231p, null, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation, 1, null);
        if (m31148a == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m31148a;
        }
        return Unit.INSTANCE;
    }

    @ExperimentalMaterial3Api
    @Nullable
    public final Object animateTo$material3_release(T t, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object collect = this.f26225j.collect(new SwipeableState$animateTo$2(t, this, animationSpec), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final void m60503b(boolean z) {
        this.f26219d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void m60502c(Object obj) {
        this.f26218c.setValue(obj);
    }

    /* renamed from: d */
    public final Object m60501d(float f, Continuation continuation) {
        Object m31148a = AbstractC10295gK.m31148a(this.f26231p, null, new SwipeableState$snapInternalToOffset$2(f, this, null), continuation, 1, null);
        if (m31148a == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m31148a;
        }
        return Unit.INSTANCE;
    }

    public final void ensureInit$material3_release(@NotNull Map<Float, ? extends T> newAnchors) {
        Float m60507c;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (getAnchors$material3_release().isEmpty()) {
            m60507c = SwipeableKt.m60507c(newAnchors, getCurrentValue());
            if (m60507c != null) {
                this.f26220e.setValue(m60507c);
                this.f26222g.setValue(m60507c);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    @NotNull
    public final Map<Float, T> getAnchors$material3_release() {
        return (Map) this.f26224i.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material3_release() {
        return this.f26216a;
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmStateChange$material3_release() {
        return this.f26217b;
    }

    public final T getCurrentValue() {
        return this.f26218c.getValue();
    }

    public final float getDirection$material3_release() {
        Float m60507c;
        m60507c = SwipeableKt.m60507c(getAnchors$material3_release(), getCurrentValue());
        if (m60507c != null) {
            return Math.signum(getOffset().getValue().floatValue() - m60507c.floatValue());
        }
        return 0.0f;
    }

    @NotNull
    public final DraggableState getDraggableState$material3_release() {
        return this.f26231p;
    }

    public final float getMaxBound$material3_release() {
        return this.f26227l;
    }

    public final float getMinBound$material3_release() {
        return this.f26226k;
    }

    @NotNull
    public final State<Float> getOffset() {
        return this.f26220e;
    }

    @NotNull
    public final State<Float> getOverflow() {
        return this.f26221f;
    }

    @NotNull
    public final SwipeProgress<T> getProgress$material3_release() {
        List m60508b;
        Object currentValue;
        Object obj;
        float f;
        Object obj2;
        Pair m28844to;
        m60508b = SwipeableKt.m60508b(getOffset().getValue().floatValue(), getAnchors$material3_release().keySet());
        int size = m60508b.size();
        if (size != 0) {
            if (size != 1) {
                if (getDirection$material3_release() > 0.0f) {
                    m28844to = TuplesKt.m28844to(m60508b.get(0), m60508b.get(1));
                } else {
                    m28844to = TuplesKt.m28844to(m60508b.get(1), m60508b.get(0));
                }
                float floatValue = ((Number) m28844to.component1()).floatValue();
                float floatValue2 = ((Number) m28844to.component2()).floatValue();
                Object value = AbstractC11687a.getValue(getAnchors$material3_release(), Float.valueOf(floatValue));
                currentValue = AbstractC11687a.getValue(getAnchors$material3_release(), Float.valueOf(floatValue2));
                f = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
                obj2 = value;
                return new SwipeProgress<>(obj2, currentValue, f);
            }
            Object value2 = AbstractC11687a.getValue(getAnchors$material3_release(), m60508b.get(0));
            currentValue = AbstractC11687a.getValue(getAnchors$material3_release(), m60508b.get(0));
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
    public final ResistanceConfig getResistance$material3_release() {
        return (ResistanceConfig) this.f26230o.getValue();
    }

    public final T getTargetValue$material3_release() {
        Float m60507c;
        float floatValue;
        float m60509a;
        Float f = (Float) this.f26223h.getValue();
        if (f != null) {
            m60509a = f.floatValue();
        } else {
            float floatValue2 = getOffset().getValue().floatValue();
            m60507c = SwipeableKt.m60507c(getAnchors$material3_release(), getCurrentValue());
            if (m60507c != null) {
                floatValue = m60507c.floatValue();
            } else {
                floatValue = getOffset().getValue().floatValue();
            }
            m60509a = SwipeableKt.m60509a(floatValue2, floatValue, getAnchors$material3_release().keySet(), getThresholds$material3_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$material3_release().get(Float.valueOf(m60509a));
        if (t == null) {
            return getCurrentValue();
        }
        return t;
    }

    @NotNull
    public final Function2<Float, Float, Float> getThresholds$material3_release() {
        return (Function2) this.f26228m.getValue();
    }

    public final float getVelocityThreshold$material3_release() {
        return ((Number) this.f26229n.getValue()).floatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.f26219d.getValue()).booleanValue();
    }

    public final float performDrag$material3_release(float f) {
        float coerceIn = AbstractC11719c.coerceIn(((Number) this.f26222g.getValue()).floatValue() + f, this.f26226k, this.f26227l) - ((Number) this.f26222g.getValue()).floatValue();
        if (Math.abs(coerceIn) > 0.0f) {
            this.f26231p.dispatchRawDelta(coerceIn);
        }
        return coerceIn;
    }

    @Nullable
    public final Object performFling$material3_release(float f, @NotNull Continuation<? super Unit> continuation) {
        Object collect = this.f26225j.collect(new C3385a(f), continuation);
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
    public final java.lang.Object processNewAnchors$material3_release(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r10, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState.processNewAnchors$material3_release(java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setAnchors$material3_release(@NotNull Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f26224i.setValue(map);
    }

    public final void setMaxBound$material3_release(float f) {
        this.f26227l = f;
    }

    public final void setMinBound$material3_release(float f) {
        this.f26226k = f;
    }

    public final void setResistance$material3_release(@Nullable ResistanceConfig resistanceConfig) {
        this.f26230o.setValue(resistanceConfig);
    }

    public final void setThresholds$material3_release(@NotNull Function2<? super Float, ? super Float, Float> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f26228m.setValue(function2);
    }

    public final void setVelocityThreshold$material3_release(float f) {
        this.f26229n.setValue(Float.valueOf(f));
    }

    @ExperimentalMaterial3Api
    @Nullable
    public final Object snapTo$material3_release(T t, @NotNull Continuation<? super Unit> continuation) {
        Object collect = this.f26225j.collect(new SwipeableState$snapTo$2(t, this), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec$material3_release() : animationSpec, (i & 4) != 0 ? C33841.INSTANCE : function1);
    }
}
