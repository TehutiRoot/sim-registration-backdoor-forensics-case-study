package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.MutableState;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\b\u0001\u0018\u0000 z*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001zB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007\u0012.\b\u0002\u0010\u0011\u001a(\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\"\u001a\u00020 2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u001c\u0010!\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00028\u0000H\u0002¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J#\u0010-\u001a\u00020\u000b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050)H\u0000¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00028\u0000¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u00020 2\u0006\u0010$\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020 2\u0006\u0010$\u001a\u00028\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010$\u001a\u00028\u0000H\u0000¢\u0006\u0004\b:\u00100R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\b=\u0010>R5\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR@\u0010\u0011\u001a(\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010C\u001a\u0004\bD\u0010ER#\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010(R\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR+\u0010\u0017\u001a\u00028\u00002\u0006\u0010S\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bJ\u0010&R\u001b\u0010$\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010X\u001a\u0004\bY\u0010WR/\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010S\u001a\u0004\u0018\u00010\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010U\u001a\u0004\bZ\u0010[\"\u0004\bT\u0010\\R\u001b\u0010_\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010(R+\u0010c\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010U\u001a\u0004\ba\u0010(\"\u0004\bN\u0010bR\u001b\u0010f\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bd\u0010X\u001a\u0004\be\u0010(R\u001b\u0010i\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bg\u0010X\u001a\u0004\bh\u0010(R/\u0010k\u001a\u0004\u0018\u00018\u00002\b\u0010S\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010U\u001a\u0004\b?\u0010W\"\u0004\bF\u0010&RC\u0010q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050)2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050)8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bl\u0010U\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010w\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010\u001c\"\u0004\bu\u0010vR\u0011\u0010x\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006{"}, m28850d2 = {"Landroidx/compose/material3/SwipeableV2State;", "T", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "totalDistance", "Lkotlin/ExtensionFunctionType;", "positionalThreshold", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", TypedValues.CycleType.S_WAVE_OFFSET, "currentValue", "velocity", PDPageLabelRange.STYLE_LETTERS_LOWER, "(FLjava/lang/Object;F)Ljava/lang/Object;", OperatorName.CURVE_TO, "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/foundation/MutatePriority;", "swipePriority", "Lkotlin/coroutines/Continuation;", "", "action", "i", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", OperatorName.CLOSE_PATH, "(Ljava/lang/Object;)V", "requireOffset", "()F", "", "newAnchors", "updateAnchors$material3_release", "(Ljava/util/Map;)Z", "updateAnchors", "value", "hasAnchorForValue", "(Ljava/lang/Object;)Z", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "(Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)F", "trySnapTo$material3_release", "trySnapTo", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material3_release", "()Landroidx/compose/animation/core/AnimationSpec;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getConfirmValueChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "getPositionalThreshold$material3_release", "()Lkotlin/jvm/functions/Function2;", "d", "F", "getVelocityThreshold-D9Ej5fM$material3_release", "Landroidx/compose/material3/InternalMutatorMutex;", "e", "Landroidx/compose/material3/InternalMutatorMutex;", "swipeMutex", "Landroidx/compose/foundation/gestures/DraggableState;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/foundation/gestures/DraggableState;", "getSwipeDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "swipeDraggableState", "<set-?>", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "getTargetValue", "getOffset", "()Ljava/lang/Float;", "(Ljava/lang/Float;)V", OperatorName.SET_LINE_JOINSTYLE, "getProgress", "progress", OperatorName.NON_STROKING_CMYK, "getLastVelocity", "(F)V", "lastVelocity", OperatorName.LINE_TO, "getMinOffset", "minOffset", OperatorName.MOVE_TO, "getMaxOffset", "maxOffset", OperatorName.ENDPATH, "animationTarget", "o", "getAnchors$material3_release", "()Ljava/util/Map;", "setAnchors$material3_release", "(Ljava/util/Map;)V", "anchors", "p", "Landroidx/compose/ui/unit/Density;", "getDensity$material3_release", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "isAnimationRunning", "()Z", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2State\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,692:1\n76#2:693\n102#2,2:694\n76#2:696\n76#2:697\n102#2,2:698\n76#2:700\n76#2:701\n102#2,2:702\n76#2:704\n76#2:705\n76#2:706\n102#2,2:707\n76#2:709\n102#2,2:710\n288#3,2:712\n1#4:714\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2State\n*L\n199#1:693\n199#1:694,2\n207#1:696\n230#1:697\n230#1:698,2\n253#1:700\n270#1:701\n270#1:702,2\n277#1:704\n283#1:705\n285#1:706\n285#1:707,2\n287#1:709\n287#1:710,2\n369#1:712,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SwipeableV2State<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final AnimationSpec f26247a;

    /* renamed from: b */
    public final Function1 f26248b;

    /* renamed from: c */
    public final Function2 f26249c;

    /* renamed from: d */
    public final float f26250d;

    /* renamed from: e */
    public final InternalMutatorMutex f26251e;

    /* renamed from: f */
    public final DraggableState f26252f;

    /* renamed from: g */
    public final MutableState f26253g;

    /* renamed from: h */
    public final State f26254h;

    /* renamed from: i */
    public final MutableState f26255i;

    /* renamed from: j */
    public final State f26256j;

    /* renamed from: k */
    public final MutableState f26257k;

    /* renamed from: l */
    public final State f26258l;

    /* renamed from: m */
    public final State f26259m;

    /* renamed from: n */
    public final MutableState f26260n;

    /* renamed from: o */
    public final MutableState f26261o;

    /* renamed from: p */
    public Density f26262p;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.SwipeableV2State$1 */
    /* loaded from: classes2.dex */
    public static final class C33911 extends Lambda implements Function1<T, Boolean> {
        public static final C33911 INSTANCE = new C33911();

        public C33911() {
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
            return invoke((C33911) obj);
        }
    }

    @Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0089\u0001\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b2,\u0010\r\u001a(\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/material3/SwipeableV2State$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SwipeableV2State;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ParameterName;", "name", "distance", "Lkotlin/ExtensionFunctionType;", "velocityThreshold", "Landroidx/compose/ui/unit/Dp;", "Saver-eqLRuRQ", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;F)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalMaterial3Api
        @NotNull
        /* renamed from: Saver-eqLRuRQ  reason: not valid java name */
        public final <T> Saver<SwipeableV2State<T>, T> m70645SavereqLRuRQ(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmValueChange, @NotNull Function2<? super Density, ? super Float, Float> positionalThreshold, float f) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            return SaverKt.Saver(SwipeableV2State$Companion$Saver$1.INSTANCE, new SwipeableV2State$Companion$Saver$2(animationSpec, confirmValueChange, positionalThreshold, f));
        }

        public Companion() {
        }
    }

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec, Function1 function1, Function2 function2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, animationSpec, function1, function2, f);
    }

    public static /* synthetic */ Object animateTo$default(SwipeableV2State swipeableV2State, Object obj, float f, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = swipeableV2State.getLastVelocity();
        }
        return swipeableV2State.animateTo(obj, f, continuation);
    }

    /* renamed from: j */
    public static /* synthetic */ Object m60484j(SwipeableV2State swipeableV2State, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return swipeableV2State.m60485i(mutatePriority, function1, continuation);
    }

    /* renamed from: a */
    public final Object m60493a(float f, Object obj, float f2) {
        Object access$closestAnchor;
        Map<T, Float> anchors$material3_release = getAnchors$material3_release();
        Float f3 = anchors$material3_release.get(obj);
        Density m60491c = m60491c();
        float mo69438toPx0680j_4 = m60491c.mo69438toPx0680j_4(this.f26250d);
        if (!Intrinsics.areEqual(f3, f) && f3 != null) {
            if (f3.floatValue() < f) {
                if (f2 >= mo69438toPx0680j_4) {
                    return SwipeableV2Kt.access$closestAnchor(anchors$material3_release, f, true);
                }
                access$closestAnchor = SwipeableV2Kt.access$closestAnchor(anchors$material3_release, f, true);
                if (f < Math.abs(f3.floatValue() + Math.abs(((Number) this.f26249c.invoke(m60491c, Float.valueOf(Math.abs(((Number) AbstractC11687a.getValue(anchors$material3_release, access$closestAnchor)).floatValue() - f3.floatValue())))).floatValue()))) {
                    return obj;
                }
            } else if (f2 <= (-mo69438toPx0680j_4)) {
                return SwipeableV2Kt.access$closestAnchor(anchors$material3_release, f, false);
            } else {
                access$closestAnchor = SwipeableV2Kt.access$closestAnchor(anchors$material3_release, f, false);
                float abs = Math.abs(f3.floatValue() - Math.abs(((Number) this.f26249c.invoke(m60491c, Float.valueOf(Math.abs(f3.floatValue() - ((Number) AbstractC11687a.getValue(anchors$material3_release, access$closestAnchor)).floatValue())))).floatValue()));
                if (f < 0.0f) {
                    if (Math.abs(f) < abs) {
                        return obj;
                    }
                } else if (f > abs) {
                    return obj;
                }
            }
            return access$closestAnchor;
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef A[SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateTo(T r14, float r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableV2State.animateTo(java.lang.Object, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public final Object m60492b() {
        return this.f26260n.getValue();
    }

    /* renamed from: c */
    public final Density m60491c() {
        Density density = this.f26262p;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
    }

    /* renamed from: d */
    public final void m60490d(Object obj) {
        this.f26260n.setValue(obj);
    }

    public final float dispatchRawDelta(float f) {
        float f2;
        Float offset = getOffset();
        float f3 = 0.0f;
        if (offset != null) {
            f2 = offset.floatValue();
        } else {
            f2 = 0.0f;
        }
        float coerceIn = AbstractC11719c.coerceIn(f + f2, getMinOffset(), getMaxOffset()) - f2;
        if (Math.abs(coerceIn) >= 0.0f) {
            Float offset2 = getOffset();
            if (offset2 != null) {
                f3 = offset2.floatValue();
            }
            m60487g(Float.valueOf(AbstractC11719c.coerceIn(f3 + coerceIn, getMinOffset(), getMaxOffset())));
        }
        return coerceIn;
    }

    /* renamed from: e */
    public final void m60489e(Object obj) {
        this.f26253g.setValue(obj);
    }

    /* renamed from: f */
    public final void m60488f(float f) {
        this.f26257k.setValue(Float.valueOf(f));
    }

    /* renamed from: g */
    public final void m60487g(Float f) {
        this.f26255i.setValue(f);
    }

    @NotNull
    public final Map<T, Float> getAnchors$material3_release() {
        return (Map) this.f26261o.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material3_release() {
        return this.f26247a;
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmValueChange$material3_release() {
        return this.f26248b;
    }

    public final T getCurrentValue() {
        return this.f26253g.getValue();
    }

    @Nullable
    public final Density getDensity$material3_release() {
        return this.f26262p;
    }

    public final float getLastVelocity() {
        return ((Number) this.f26257k.getValue()).floatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.f26259m.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.f26258l.getValue()).floatValue();
    }

    @Nullable
    public final Float getOffset() {
        return (Float) this.f26255i.getValue();
    }

    @NotNull
    public final Function2<Density, Float, Float> getPositionalThreshold$material3_release() {
        return this.f26249c;
    }

    public final float getProgress() {
        return ((Number) this.f26256j.getValue()).floatValue();
    }

    @NotNull
    public final DraggableState getSwipeDraggableState$material3_release() {
        return this.f26252f;
    }

    public final T getTargetValue() {
        return (T) this.f26254h.getValue();
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM$material3_release  reason: not valid java name */
    public final float m70644getVelocityThresholdD9Ej5fM$material3_release() {
        return this.f26250d;
    }

    /* renamed from: h */
    public final void m60486h(Object obj) {
        float f;
        Float f2 = getAnchors$material3_release().get(obj);
        if (f2 != null) {
            float floatValue = f2.floatValue();
            Float offset = getOffset();
            if (offset != null) {
                f = offset.floatValue();
            } else {
                f = 0.0f;
            }
            dispatchRawDelta(floatValue - f);
            m60489e(obj);
            m60490d(null);
            return;
        }
        m60489e(obj);
    }

    public final boolean hasAnchorForValue(T t) {
        return getAnchors$material3_release().containsKey(t);
    }

    /* renamed from: i */
    public final Object m60485i(MutatePriority mutatePriority, Function1 function1, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new SwipeableV2State$swipe$2(this, mutatePriority, function1, null), continuation);
        if (coroutineScope == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }

    public final boolean isAnimationRunning() {
        if (m60492b() != null) {
            return true;
        }
        return false;
    }

    public final float requireOffset() {
        Float offset = getOffset();
        if (offset != null) {
            return offset.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void setAnchors$material3_release(@NotNull Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f26261o.setValue(map);
    }

    public final void setDensity$material3_release(@Nullable Density density) {
        this.f26262p = density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object settle(float f, @NotNull Continuation<? super Unit> continuation) {
        Object currentValue = getCurrentValue();
        Object m60493a = m60493a(requireOffset(), currentValue, f);
        if (((Boolean) this.f26248b.invoke(m60493a)).booleanValue()) {
            Object animateTo = animateTo(m60493a, f, continuation);
            if (animateTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return animateTo;
            }
            return Unit.INSTANCE;
        }
        Object animateTo2 = animateTo(currentValue, f, continuation);
        if (animateTo2 == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo2;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo(T t, @NotNull Continuation<? super Unit> continuation) {
        Object m60484j = m60484j(this, null, new SwipeableV2State$snapTo$2(this, t, null), continuation, 1, null);
        if (m60484j == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m60484j;
        }
        return Unit.INSTANCE;
    }

    public final boolean trySnapTo$material3_release(T t) {
        return this.f26251e.tryMutate(new SwipeableV2State$trySnapTo$1(this, t));
    }

    public final boolean updateAnchors$material3_release(@NotNull Map<T, Float> newAnchors) {
        boolean z;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        boolean isEmpty = getAnchors$material3_release().isEmpty();
        setAnchors$material3_release(newAnchors);
        if (isEmpty) {
            T currentValue = getCurrentValue();
            if (getAnchors$material3_release().get(currentValue) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                trySnapTo$material3_release(currentValue);
            }
        } else {
            z = true;
        }
        if (z && isEmpty) {
            return false;
        }
        return true;
    }

    public SwipeableV2State(Object obj, AnimationSpec animationSpec, Function1 confirmValueChange, Function2 positionalThreshold, float f) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        MutableState m31891g5;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        this.f26247a = animationSpec;
        this.f26248b = confirmValueChange;
        this.f26249c = positionalThreshold;
        this.f26250d = f;
        this.f26251e = new InternalMutatorMutex();
        this.f26252f = new SwipeableV2State$swipeDraggableState$1(this);
        m31891g = AbstractC19508dK1.m31891g(obj, null, 2, null);
        this.f26253g = m31891g;
        this.f26254h = SnapshotStateKt.derivedStateOf(new SwipeableV2State$targetValue$2(this));
        m31891g2 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f26255i = m31891g2;
        this.f26256j = SnapshotStateKt.derivedStateOf(new SwipeableV2State$progress$2(this));
        m31891g3 = AbstractC19508dK1.m31891g(Float.valueOf(0.0f), null, 2, null);
        this.f26257k = m31891g3;
        this.f26258l = SnapshotStateKt.derivedStateOf(new SwipeableV2State$minOffset$2(this));
        this.f26259m = SnapshotStateKt.derivedStateOf(new SwipeableV2State$maxOffset$2(this));
        m31891g4 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f26260n = m31891g4;
        m31891g5 = AbstractC19508dK1.m31891g(AbstractC11687a.emptyMap(), null, 2, null);
        this.f26261o = m31891g5;
    }

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec, Function1 function1, Function2<Density, Float, Float> function2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableV2Defaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? C33911.INSTANCE : function1, (i & 8) != 0 ? SwipeableV2Defaults.INSTANCE.getPositionalThreshold() : function2, (i & 16) != 0 ? SwipeableV2Defaults.INSTANCE.m70641getVelocityThresholdD9Ej5fM() : f, null);
    }
}
