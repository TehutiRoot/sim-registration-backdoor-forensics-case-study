package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b-\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R+\u0010-\u001a\u00028\u00002\u0006\u0010'\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010 \"\u0004\b+\u0010,R*\u00104\u001a\u00028\u00012\u0006\u0010'\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010$\"\u0004\b7\u00108R*\u0010<\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$\"\u0004\b;\u00108R+\u0010\u000e\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010)\u001a\u0004\b\u000e\u0010>\"\u0004\b?\u0010@R\u0011\u0010B\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bA\u0010 ¨\u0006C"}, m28850d2 = {"Landroidx/compose/animation/core/AnimationScope;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialVelocityVector", "", "lastFrameTimeNanos", "targetValue", "startTimeNanos", "", "isRunning", "Lkotlin/Function0;", "", "onCancel", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationVector;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V", "cancelAnimation", "()V", "Landroidx/compose/animation/core/AnimationState;", "toAnimationState", "()Landroidx/compose/animation/core/AnimationState;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getTargetValue", "()Ljava/lang/Object;", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getStartTimeNanos", "()J", "d", "Lkotlin/jvm/functions/Function0;", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core_release", "(Ljava/lang/Object;)V", "value", OperatorName.FILL_NON_ZERO, "Landroidx/compose/animation/core/AnimationVector;", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core_release", "(Landroidx/compose/animation/core/AnimationVector;)V", "velocityVector", OperatorName.NON_STROKING_GRAY, "getLastFrameTimeNanos", "setLastFrameTimeNanos$animation_core_release", "(J)V", OperatorName.CLOSE_PATH, "getFinishedTimeNanos", "setFinishedTimeNanos$animation_core_release", "finishedTimeNanos", "i", "()Z", "setRunning$animation_core_release", "(Z)V", "getVelocity", "velocity", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
/* loaded from: classes.dex */
public final class AnimationScope<T, V extends AnimationVector> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final TwoWayConverter f12431a;

    /* renamed from: b */
    public final Object f12432b;

    /* renamed from: c */
    public final long f12433c;

    /* renamed from: d */
    public final Function0 f12434d;

    /* renamed from: e */
    public final MutableState f12435e;

    /* renamed from: f */
    public AnimationVector f12436f;

    /* renamed from: g */
    public long f12437g;

    /* renamed from: h */
    public long f12438h;

    /* renamed from: i */
    public final MutableState f12439i;

    public AnimationScope(T t, @NotNull TwoWayConverter<T, V> typeConverter, @NotNull V initialVelocityVector, long j, T t2, long j2, boolean z, @NotNull Function0<Unit> onCancel) {
        MutableState m31891g;
        MutableState m31891g2;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.f12431a = typeConverter;
        this.f12432b = t2;
        this.f12433c = j2;
        this.f12434d = onCancel;
        m31891g = AbstractC19508dK1.m31891g(t, null, 2, null);
        this.f12435e = m31891g;
        this.f12436f = AnimationVectorsKt.copy(initialVelocityVector);
        this.f12437g = j;
        this.f12438h = Long.MIN_VALUE;
        m31891g2 = AbstractC19508dK1.m31891g(Boolean.valueOf(z), null, 2, null);
        this.f12439i = m31891g2;
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.f12434d.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.f12438h;
    }

    public final long getLastFrameTimeNanos() {
        return this.f12437g;
    }

    public final long getStartTimeNanos() {
        return this.f12433c;
    }

    public final T getTargetValue() {
        return (T) this.f12432b;
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.f12431a;
    }

    public final T getValue() {
        return this.f12435e.getValue();
    }

    public final T getVelocity() {
        return this.f12431a.getConvertFromVector().invoke((V) this.f12436f);
    }

    @NotNull
    public final V getVelocityVector() {
        return (V) this.f12436f;
    }

    public final boolean isRunning() {
        return ((Boolean) this.f12439i.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core_release(long j) {
        this.f12438h = j;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j) {
        this.f12437g = j;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.f12439i.setValue(Boolean.valueOf(z));
    }

    public final void setValue$animation_core_release(T t) {
        this.f12435e.setValue(t);
    }

    public final void setVelocityVector$animation_core_release(@NotNull V v) {
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        this.f12436f = v;
    }

    @NotNull
    public final AnimationState<T, V> toAnimationState() {
        return new AnimationState<>(this.f12431a, getValue(), this.f12436f, this.f12437g, this.f12438h, isRunning());
    }
}
