package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DurationBasedAnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.RepeatMode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/Timestamp;", "T", "", "", "timeMillis", "durationMillis", "repeatCount", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;", "holder", "<init>", "(IIILandroidx/compose/animation/core/RepeatMode;Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;)V", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "asAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getTimeMillis", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDurationMillis", OperatorName.CURVE_TO, "getRepeatCount", "d", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "e", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;", "getHolder", "()Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Timestamp<T> {

    /* renamed from: a */
    public final int f12735a;

    /* renamed from: b */
    public final int f12736b;

    /* renamed from: c */
    public final int f12737c;

    /* renamed from: d */
    public final RepeatMode f12738d;

    /* renamed from: e */
    public final PropertyValuesHolder f12739e;

    public Timestamp(int i, int i2, int i3, @NotNull RepeatMode repeatMode, @NotNull PropertyValuesHolder<T> holder) {
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f12735a = i;
        this.f12736b = i2;
        this.f12737c = i3;
        this.f12738d = repeatMode;
        this.f12739e = holder;
    }

    @NotNull
    public final FiniteAnimationSpec<T> asAnimationSpec() {
        DurationBasedAnimationSpec asKeyframeSpec;
        int i;
        PropertyValuesHolder propertyValuesHolder = this.f12739e;
        if (propertyValuesHolder instanceof PropertyValuesHolderFloat) {
            asKeyframeSpec = ((PropertyValuesHolderFloat) propertyValuesHolder).asKeyframeSpec(this.f12736b);
        } else if (propertyValuesHolder instanceof PropertyValuesHolderColor) {
            asKeyframeSpec = ((PropertyValuesHolderColor) propertyValuesHolder).asKeyframeSpec(this.f12736b);
        } else {
            throw new RuntimeException("Unexpected value type: " + this.f12739e);
        }
        DurationBasedAnimationSpec durationBasedAnimationSpec = asKeyframeSpec;
        Intrinsics.checkNotNull(durationBasedAnimationSpec, "null cannot be cast to non-null type androidx.compose.animation.core.KeyframesSpec<T of androidx.compose.animation.graphics.vector.Timestamp>");
        int i2 = this.f12737c;
        if (i2 != 0) {
            if (i2 == -1) {
                i = Integer.MAX_VALUE;
            } else {
                i = i2 + 1;
            }
            return AnimationSpecKt.m69264repeatable91I0pcU$default(i, durationBasedAnimationSpec, this.f12738d, 0L, 8, null);
        }
        return durationBasedAnimationSpec;
    }

    public final int getDurationMillis() {
        return this.f12736b;
    }

    @NotNull
    public final PropertyValuesHolder<T> getHolder() {
        return this.f12739e;
    }

    public final int getRepeatCount() {
        return this.f12737c;
    }

    @NotNull
    public final RepeatMode getRepeatMode() {
        return this.f12738d;
    }

    public final int getTimeMillis() {
        return this.f12735a;
    }
}
