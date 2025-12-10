package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b\r\u00101\"\u0004\b2\u00103R\u0011\u00105\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b4\u0010\u001b¨\u00066"}, m28850d2 = {"Landroidx/compose/animation/core/AnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)V", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue$animation_core_release", "(Ljava/lang/Object;)V", "value", OperatorName.CURVE_TO, "Landroidx/compose/animation/core/AnimationVector;", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core_release", "(Landroidx/compose/animation/core/AnimationVector;)V", "velocityVector", "d", OperatorName.SET_LINE_CAPSTYLE, "getLastFrameTimeNanos", "()J", "setLastFrameTimeNanos$animation_core_release", "(J)V", "e", "getFinishedTimeNanos", "setFinishedTimeNanos$animation_core_release", OperatorName.FILL_NON_ZERO, "Z", "()Z", "setRunning$animation_core_release", "(Z)V", "getVelocity", "velocity", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n53#1:344\n53#1:345,2\n*E\n"})
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final TwoWayConverter f12440a;

    /* renamed from: b */
    public final MutableState f12441b;

    /* renamed from: c */
    public AnimationVector f12442c;

    /* renamed from: d */
    public long f12443d;

    /* renamed from: e */
    public long f12444e;

    /* renamed from: f */
    public boolean f12445f;

    public AnimationState(@NotNull TwoWayConverter<T, V> typeConverter, T t, @Nullable V v, long j, long j2, boolean z) {
        MutableState m31891g;
        AnimationVector createZeroVectorFrom;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.f12440a = typeConverter;
        m31891g = AbstractC19508dK1.m31891g(t, null, 2, null);
        this.f12441b = m31891g;
        this.f12442c = (v == null || (createZeroVectorFrom = AnimationVectorsKt.copy(v)) == null) ? AnimationStateKt.createZeroVectorFrom(typeConverter, t) : createZeroVectorFrom;
        this.f12443d = j;
        this.f12444e = j2;
        this.f12445f = z;
    }

    public final long getFinishedTimeNanos() {
        return this.f12444e;
    }

    public final long getLastFrameTimeNanos() {
        return this.f12443d;
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.f12440a;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.f12441b.getValue();
    }

    public final T getVelocity() {
        return this.f12440a.getConvertFromVector().invoke((V) this.f12442c);
    }

    @NotNull
    public final V getVelocityVector() {
        return (V) this.f12442c;
    }

    public final boolean isRunning() {
        return this.f12445f;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j) {
        this.f12444e = j;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j) {
        this.f12443d = j;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.f12445f = z;
    }

    public void setValue$animation_core_release(T t) {
        this.f12441b.setValue(t);
    }

    public final void setVelocityVector$animation_core_release(@NotNull V v) {
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        this.f12442c = v;
    }

    @NotNull
    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.f12445f + ", lastFrameTimeNanos=" + this.f12443d + ", finishedTimeNanos=" + this.f12444e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(twoWayConverter, obj, (i & 4) != 0 ? null : animationVector, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
