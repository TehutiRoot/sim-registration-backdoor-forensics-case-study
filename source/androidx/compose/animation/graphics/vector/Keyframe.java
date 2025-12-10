package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.Easing;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000f¨\u0006%"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/Keyframe;", "T", "", "", "fraction", "value", "Landroidx/compose/animation/core/Easing;", "interpolator", "<init>", "(FLjava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "component1", "()F", "component2", "()Ljava/lang/Object;", "component3", "()Landroidx/compose/animation/core/Easing;", "copy", "(FLjava/lang/Object;Landroidx/compose/animation/core/Easing;)Landroidx/compose/animation/graphics/vector/Keyframe;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getFraction", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "getValue", OperatorName.CURVE_TO, "Landroidx/compose/animation/core/Easing;", "getInterpolator", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Keyframe<T> {

    /* renamed from: a */
    public final float f12700a;

    /* renamed from: b */
    public final Object f12701b;

    /* renamed from: c */
    public final Easing f12702c;

    public Keyframe(float f, T t, @NotNull Easing interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.f12700a = f;
        this.f12701b = t;
        this.f12702c = interpolator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Keyframe copy$default(Keyframe keyframe, float f, Object obj, Easing easing, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = keyframe.f12700a;
        }
        if ((i & 2) != 0) {
            obj = keyframe.f12701b;
        }
        if ((i & 4) != 0) {
            easing = keyframe.f12702c;
        }
        return keyframe.copy(f, obj, easing);
    }

    public final float component1() {
        return this.f12700a;
    }

    public final T component2() {
        return (T) this.f12701b;
    }

    @NotNull
    public final Easing component3() {
        return this.f12702c;
    }

    @NotNull
    public final Keyframe<T> copy(float f, T t, @NotNull Easing interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        return new Keyframe<>(f, t, interpolator);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Keyframe) {
            Keyframe keyframe = (Keyframe) obj;
            return Float.compare(this.f12700a, keyframe.f12700a) == 0 && Intrinsics.areEqual(this.f12701b, keyframe.f12701b) && Intrinsics.areEqual(this.f12702c, keyframe.f12702c);
        }
        return false;
    }

    public final float getFraction() {
        return this.f12700a;
    }

    @NotNull
    public final Easing getInterpolator() {
        return this.f12702c;
    }

    public final T getValue() {
        return (T) this.f12701b;
    }

    public int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.f12700a) * 31;
        Object obj = this.f12701b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((floatToIntBits + hashCode) * 31) + this.f12702c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Keyframe(fraction=" + this.f12700a + ", value=" + this.f12701b + ", interpolator=" + this.f12702c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
