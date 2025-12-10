package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u0010\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011Jb\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0014\u001a\u00028\u00002%\u0010\u0018\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\"\u001a\u00020\u00162\n\b\u0002\u0010 \u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010!\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\"\u0010#Jj\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010$\u001a\u00028\u00002\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\b\b\u0002\u0010\u0014\u001a\u00028\u00002'\b\u0002\u0010\u0018\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J^\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000)2'\b\u0002\u0010\u0018\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u00162\u0006\u0010$\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000¢\u0006\u0004\b1\u00102R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\b4\u00105R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b8\u00109R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010;\u001a\u0004\b<\u0010=R+\u0010C\u001a\u00020?2\u0006\u0010@\u001a\u00020?8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bA\u0010ER+\u0010$\u001a\u00028\u00002\u0006\u0010@\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010B\u001a\u0004\bG\u0010H\"\u0004\bF\u0010IR(\u0010 \u001a\u0004\u0018\u00018\u00002\b\u0010@\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\bK\u0010HR(\u0010!\u001a\u0004\u0018\u00018\u00002\b\u0010@\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u00106\u001a\u0004\bM\u0010HR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010^\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010YR\u0016\u0010`\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010YR\u0011\u0010\u000f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\ba\u0010HR\u0011\u0010d\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\be\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, m28850d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "", "value", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/Object;F)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "animation", "initialVelocity", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/animation/core/AnimationResult;", "d", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Object;)Ljava/lang/Object;", OperatorName.CURVE_TO, "()V", "lowerBound", "upperBound", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/Object;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "internalState", "", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "(Z)V", OperatorName.FILL_NON_ZERO, "getTargetValue", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", OperatorName.NON_STROKING_GRAY, "getLowerBound", OperatorName.CLOSE_PATH, "getUpperBound", "Landroidx/compose/animation/core/MutatorMutex;", "i", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/SpringSpec;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/animation/core/AnimationVector;", "negativeInfinityBounds", OperatorName.LINE_TO, "positiveInfinityBounds", OperatorName.MOVE_TO, "lowerBoundVector", OperatorName.ENDPATH, "upperBoundVector", "getValue", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n81#2:478\n107#2,2:479\n81#2:481\n107#2,2:482\n1#3:484\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n96#1:478\n96#1:479,2\n103#1:481\n103#1:482,2\n*E\n"})
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final TwoWayConverter f12407a;

    /* renamed from: b */
    public final Object f12408b;

    /* renamed from: c */
    public final String f12409c;

    /* renamed from: d */
    public final AnimationState f12410d;

    /* renamed from: e */
    public final MutableState f12411e;

    /* renamed from: f */
    public final MutableState f12412f;

    /* renamed from: g */
    public Object f12413g;

    /* renamed from: h */
    public Object f12414h;

    /* renamed from: i */
    public final MutatorMutex f12415i;

    /* renamed from: j */
    public final SpringSpec f12416j;

    /* renamed from: k */
    public final AnimationVector f12417k;

    /* renamed from: l */
    public final AnimationVector f12418l;

    /* renamed from: m */
    public AnimationVector f12419m;

    /* renamed from: n */
    public AnimationVector f12420n;

    public Animatable(T t, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable T t2, @NotNull String label) {
        MutableState m31891g;
        MutableState m31891g2;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f12407a = typeConverter;
        this.f12408b = t2;
        this.f12409c = label;
        this.f12410d = new AnimationState(typeConverter, t, null, 0L, 0L, false, 60, null);
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f12411e = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(t, null, 2, null);
        this.f12412f = m31891g2;
        this.f12415i = new MutatorMutex();
        this.f12416j = new SpringSpec(0.0f, 0.0f, t2, 3, null);
        AnimationVector m61709b = m61709b(t, Float.NEGATIVE_INFINITY);
        this.f12417k = m61709b;
        AnimationVector m61709b2 = m61709b(t, Float.POSITIVE_INFINITY);
        this.f12418l = m61709b2;
        this.f12419m = m61709b;
        this.f12420n = m61709b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, Function1 function1, Continuation continuation, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i, Object obj3) {
        SpringSpec springSpec = animationSpec;
        if ((i & 2) != 0) {
            springSpec = animatable.f12416j;
        }
        AnimationSpec animationSpec2 = springSpec;
        T t = obj2;
        if ((i & 4) != 0) {
            t = animatable.getVelocity();
        }
        T t2 = t;
        Function1<? super Animatable<T, V>, Unit> function12 = function1;
        if ((i & 8) != 0) {
            function12 = null;
        }
        return animatable.animateTo(obj, animationSpec2, t2, function12, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = animatable.f12413g;
        }
        if ((i & 2) != 0) {
            obj2 = animatable.f12414h;
        }
        animatable.updateBounds(obj, obj2);
    }

    /* renamed from: a */
    public final Object m61710a(Object obj) {
        if (Intrinsics.areEqual(this.f12419m, this.f12417k) && Intrinsics.areEqual(this.f12420n, this.f12418l)) {
            return obj;
        }
        V invoke = this.f12407a.getConvertToVector().invoke(obj);
        int size$animation_core_release = invoke.getSize$animation_core_release();
        boolean z = false;
        for (int i = 0; i < size$animation_core_release; i++) {
            if (invoke.get$animation_core_release(i) < this.f12419m.get$animation_core_release(i) || invoke.get$animation_core_release(i) > this.f12420n.get$animation_core_release(i)) {
                invoke.set$animation_core_release(i, AbstractC11719c.coerceIn(invoke.get$animation_core_release(i), this.f12419m.get$animation_core_release(i), this.f12420n.get$animation_core_release(i)));
                z = true;
            }
        }
        if (z) {
            return this.f12407a.getConvertFromVector().invoke(invoke);
        }
        return obj;
    }

    @Nullable
    public final Object animateDecay(T t, @NotNull DecayAnimationSpec<T> decayAnimationSpec, @Nullable Function1<? super Animatable<T, V>, Unit> function1, @NotNull Continuation<? super AnimationResult<T, V>> continuation) {
        return m61707d(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, this.f12407a, (Object) getValue(), (AnimationVector) this.f12407a.getConvertToVector().invoke(t)), t, function1, continuation);
    }

    @Nullable
    public final Object animateTo(T t, @NotNull AnimationSpec<T> animationSpec, T t2, @Nullable Function1<? super Animatable<T, V>, Unit> function1, @NotNull Continuation<? super AnimationResult<T, V>> continuation) {
        return m61707d(AnimationKt.TargetBasedAnimation(animationSpec, this.f12407a, getValue(), t, t2), t2, function1, continuation);
    }

    @NotNull
    public final State<T> asState() {
        return this.f12410d;
    }

    /* renamed from: b */
    public final AnimationVector m61709b(Object obj, float f) {
        V invoke = this.f12407a.getConvertToVector().invoke(obj);
        int size$animation_core_release = invoke.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            invoke.set$animation_core_release(i, f);
        }
        return invoke;
    }

    /* renamed from: c */
    public final void m61708c() {
        AnimationState animationState = this.f12410d;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        m61706e(false);
    }

    /* renamed from: d */
    public final Object m61707d(Animation animation, Object obj, Function1 function1, Continuation continuation) {
        return MutatorMutex.mutate$default(this.f12415i, null, new Animatable$runAnimation$2(this, obj, animation, this.f12410d.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* renamed from: e */
    public final void m61706e(boolean z) {
        this.f12411e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void m61705f(Object obj) {
        this.f12412f.setValue(obj);
    }

    @NotNull
    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.f12416j;
    }

    @NotNull
    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.f12410d;
    }

    @NotNull
    public final String getLabel() {
        return this.f12409c;
    }

    @Nullable
    public final T getLowerBound() {
        return (T) this.f12413g;
    }

    public final T getTargetValue() {
        return this.f12412f.getValue();
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.f12407a;
    }

    @Nullable
    public final T getUpperBound() {
        return (T) this.f12414h;
    }

    public final T getValue() {
        return (T) this.f12410d.getValue();
    }

    public final T getVelocity() {
        return this.f12407a.getConvertFromVector().invoke(getVelocityVector());
    }

    @NotNull
    public final V getVelocityVector() {
        return (V) this.f12410d.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.f12411e.getValue()).booleanValue();
    }

    @Nullable
    public final Object snapTo(T t, @NotNull Continuation<? super Unit> continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.f12415i, null, new Animatable$snapTo$2(this, t, null), continuation, 1, null);
        if (mutate$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return mutate$default;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object stop(@NotNull Continuation<? super Unit> continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.f12415i, null, new Animatable$stop$2(this, null), continuation, 1, null);
        if (mutate$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return mutate$default;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateBounds(@Nullable T t, @Nullable T t2) {
        V v;
        V v2;
        if (t == null || (v = this.f12407a.getConvertToVector().invoke(t)) == null) {
            v = this.f12417k;
        }
        if (t2 == null || (v2 = this.f12407a.getConvertToVector().invoke(t2)) == null) {
            v2 = this.f12418l;
        }
        int size$animation_core_release = v.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            if (v.get$animation_core_release(i) > v2.get$animation_core_release(i)) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v + " is greater than upper bound " + v2 + " on index " + i).toString());
            }
        }
        this.f12419m = v;
        this.f12420n = v2;
        this.f12414h = t2;
        this.f12413g = t;
        if (!isRunning()) {
            Object m61710a = m61710a(getValue());
            if (!Intrinsics.areEqual(m61710a, getValue())) {
                this.f12410d.setValue$animation_core_release(m61710a);
            }
        }
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @ReplaceWith(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(Object obj, TwoWayConverter typeConverter, Object obj2) {
        this(obj, typeConverter, obj2, "Animatable");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
