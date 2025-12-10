package androidx.compose.foundation.shape;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011JE\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m28850d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/foundation/shape/CornerSize;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "copy", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;", "all", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/shape/CornerSize;", "getTopStart", "()Landroidx/compose/foundation/shape/CornerSize;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTopEnd", OperatorName.CURVE_TO, "getBottomEnd", "d", "getBottomStart", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;

    /* renamed from: a */
    public final CornerSize f13943a;

    /* renamed from: b */
    public final CornerSize f13944b;

    /* renamed from: c */
    public final CornerSize f13945c;

    /* renamed from: d */
    public final CornerSize f13946d;

    public CornerBasedShape(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        this.f13943a = topStart;
        this.f13944b = topEnd;
        this.f13945c = bottomEnd;
        this.f13946d = bottomStart;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                cornerSize = cornerBasedShape.f13943a;
            }
            if ((i & 2) != 0) {
                cornerSize2 = cornerBasedShape.f13944b;
            }
            if ((i & 4) != 0) {
                cornerSize3 = cornerBasedShape.f13945c;
            }
            if ((i & 8) != 0) {
                cornerSize4 = cornerBasedShape.f13946d;
            }
            return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @NotNull
    public final CornerBasedShape copy(@NotNull CornerSize all) {
        Intrinsics.checkNotNullParameter(all, "all");
        return copy(all, all, all, all);
    }

    @NotNull
    public abstract CornerBasedShape copy(@NotNull CornerSize cornerSize, @NotNull CornerSize cornerSize2, @NotNull CornerSize cornerSize3, @NotNull CornerSize cornerSize4);

    @NotNull
    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo69700createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @NotNull LayoutDirection layoutDirection);

    @Override // androidx.compose.p003ui.graphics.Shape
    @NotNull
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo69357createOutlinePq9zytI(long j, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float mo69184toPxTmRCtEA = this.f13943a.mo69184toPxTmRCtEA(j, density);
        float mo69184toPxTmRCtEA2 = this.f13944b.mo69184toPxTmRCtEA(j, density);
        float mo69184toPxTmRCtEA3 = this.f13945c.mo69184toPxTmRCtEA(j, density);
        float mo69184toPxTmRCtEA4 = this.f13946d.mo69184toPxTmRCtEA(j, density);
        float m71570getMinDimensionimpl = Size.m71570getMinDimensionimpl(j);
        float f = mo69184toPxTmRCtEA + mo69184toPxTmRCtEA4;
        if (f > m71570getMinDimensionimpl) {
            float f2 = m71570getMinDimensionimpl / f;
            mo69184toPxTmRCtEA *= f2;
            mo69184toPxTmRCtEA4 *= f2;
        }
        float f3 = mo69184toPxTmRCtEA4;
        float f4 = mo69184toPxTmRCtEA2 + mo69184toPxTmRCtEA3;
        if (f4 > m71570getMinDimensionimpl) {
            float f5 = m71570getMinDimensionimpl / f4;
            mo69184toPxTmRCtEA2 *= f5;
            mo69184toPxTmRCtEA3 *= f5;
        }
        if (mo69184toPxTmRCtEA >= 0.0f && mo69184toPxTmRCtEA2 >= 0.0f && mo69184toPxTmRCtEA3 >= 0.0f && f3 >= 0.0f) {
            return mo69700createOutlineLjSzlW0(j, mo69184toPxTmRCtEA, mo69184toPxTmRCtEA2, mo69184toPxTmRCtEA3, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + mo69184toPxTmRCtEA + ", topEnd = " + mo69184toPxTmRCtEA2 + ", bottomEnd = " + mo69184toPxTmRCtEA3 + ", bottomStart = " + f3 + ")!").toString());
    }

    @NotNull
    public final CornerSize getBottomEnd() {
        return this.f13945c;
    }

    @NotNull
    public final CornerSize getBottomStart() {
        return this.f13946d;
    }

    @NotNull
    public final CornerSize getTopEnd() {
        return this.f13944b;
    }

    @NotNull
    public final CornerSize getTopStart() {
        return this.f13943a;
    }
}
