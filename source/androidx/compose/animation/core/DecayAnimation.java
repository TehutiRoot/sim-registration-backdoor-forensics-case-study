package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u000eB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u001a\u0010+\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R\u001a\u00100\u001a\u00020\u00118VX\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00104\u001a\u0002018\u0016X\u0096D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, m28850d2 = {"Landroidx/compose/animation/core/DecayAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "initialVelocity", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)V", "", "playTimeNanos", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", OperatorName.CURVE_TO, "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "d", "Landroidx/compose/animation/core/AnimationVector;", "initialValueVector", "e", "getInitialVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", OperatorName.FILL_NON_ZERO, "endVelocity", OperatorName.NON_STROKING_GRAY, "getTargetValue", "targetValue", OperatorName.CLOSE_PATH, OperatorName.SET_LINE_CAPSTYLE, "getDurationNanos", "()J", "durationNanos", "", "i", "Z", "isInfinite", "()Z", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final VectorizedDecayAnimationSpec f12466a;

    /* renamed from: b */
    public final TwoWayConverter f12467b;

    /* renamed from: c */
    public final Object f12468c;

    /* renamed from: d */
    public final AnimationVector f12469d;

    /* renamed from: e */
    public final AnimationVector f12470e;

    /* renamed from: f */
    public final AnimationVector f12471f;

    /* renamed from: g */
    public final Object f12472g;

    /* renamed from: h */
    public final long f12473h;

    /* renamed from: i */
    public final boolean f12474i;

    public DecayAnimation(@NotNull VectorizedDecayAnimationSpec<V> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, T t, @NotNull V initialVelocityVector) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        this.f12466a = animationSpec;
        this.f12467b = typeConverter;
        this.f12468c = t;
        V invoke = getTypeConverter().getConvertToVector().invoke(t);
        this.f12469d = invoke;
        this.f12470e = AnimationVectorsKt.copy(initialVelocityVector);
        this.f12472g = getTypeConverter().getConvertFromVector().invoke(animationSpec.getTargetValue(invoke, initialVelocityVector));
        this.f12473h = animationSpec.getDurationNanos(invoke, initialVelocityVector);
        AnimationVector copy = AnimationVectorsKt.copy(animationSpec.getVelocityFromNanos(getDurationNanos(), invoke, initialVelocityVector));
        this.f12471f = copy;
        int size$animation_core_release = copy.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            AnimationVector animationVector = this.f12471f;
            animationVector.set$animation_core_release(i, AbstractC11719c.coerceIn(animationVector.get$animation_core_release(i), -this.f12466a.getAbsVelocityThreshold(), this.f12466a.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.f12473h;
    }

    public final T getInitialValue() {
        return (T) this.f12468c;
    }

    @NotNull
    public final V getInitialVelocityVector() {
        return (V) this.f12470e;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return (T) this.f12472g;
    }

    @Override // androidx.compose.animation.core.Animation
    @NotNull
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.f12467b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j) {
        if (!isFinishedFromNanos(j)) {
            return getTypeConverter().getConvertFromVector().invoke((V) this.f12466a.getValueFromNanos(j, this.f12469d, this.f12470e));
        }
        return getTargetValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.core.Animation
    @NotNull
    public V getVelocityVectorFromNanos(long j) {
        if (!isFinishedFromNanos(j)) {
            return (V) this.f12466a.getVelocityFromNanos(j, this.f12469d, this.f12470e);
        }
        return (V) this.f12471f;
    }

    @Override // androidx.compose.animation.core.Animation
    public /* synthetic */ boolean isFinishedFromNanos(long j) {
        return AbstractC0573I4.m68007a(this, j);
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.f12474i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecayAnimation(@NotNull DecayAnimationSpec<T> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, T t, @NotNull V initialVelocityVector) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t, initialVelocityVector);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecayAnimation(@NotNull DecayAnimationSpec<T> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, T t, T t2) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t, typeConverter.getConvertToVector().invoke(t2));
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
