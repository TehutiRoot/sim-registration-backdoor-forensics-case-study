package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p003ui.graphics.TransformOrigin;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u0004HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000bR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m28850d2 = {"Landroidx/compose/animation/Scale;", "", "", "scale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "<init>", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()F", "component2-SzJe1aQ", "()J", "component2", "component3", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "copy-bnNdC4k", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Scale;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getScale", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getTransformOrigin-SzJe1aQ", OperatorName.CURVE_TO, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "animation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Scale {

    /* renamed from: a */
    public final float f12385a;

    /* renamed from: b */
    public final long f12386b;

    /* renamed from: c */
    public final FiniteAnimationSpec f12387c;

    public /* synthetic */ Scale(float f, long j, FiniteAnimationSpec finiteAnimationSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, finiteAnimationSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-bnNdC4k$default  reason: not valid java name */
    public static /* synthetic */ Scale m69236copybnNdC4k$default(Scale scale, float f, long j, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            f = scale.f12385a;
        }
        if ((i & 2) != 0) {
            j = scale.f12386b;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = scale.f12387c;
        }
        return scale.m69238copybnNdC4k(f, j, finiteAnimationSpec);
    }

    public final float component1() {
        return this.f12385a;
    }

    /* renamed from: component2-SzJe1aQ  reason: not valid java name */
    public final long m69237component2SzJe1aQ() {
        return this.f12386b;
    }

    @NotNull
    public final FiniteAnimationSpec<Float> component3() {
        return this.f12387c;
    }

    @NotNull
    /* renamed from: copy-bnNdC4k  reason: not valid java name */
    public final Scale m69238copybnNdC4k(float f, long j, @NotNull FiniteAnimationSpec<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new Scale(f, j, animationSpec, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scale) {
            Scale scale = (Scale) obj;
            return Float.compare(this.f12385a, scale.f12385a) == 0 && TransformOrigin.m72074equalsimpl0(this.f12386b, scale.f12386b) && Intrinsics.areEqual(this.f12387c, scale.f12387c);
        }
        return false;
    }

    @NotNull
    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.f12387c;
    }

    public final float getScale() {
        return this.f12385a;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ  reason: not valid java name */
    public final long m69239getTransformOriginSzJe1aQ() {
        return this.f12386b;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f12385a) * 31) + TransformOrigin.m72077hashCodeimpl(this.f12386b)) * 31) + this.f12387c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Scale(scale=" + this.f12385a + ", transformOrigin=" + ((Object) TransformOrigin.m72078toStringimpl(this.f12386b)) + ", animationSpec=" + this.f12387c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Scale(float f, long j, FiniteAnimationSpec animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f12385a = f;
        this.f12386b = j;
        this.f12387c = animationSpec;
    }
}
