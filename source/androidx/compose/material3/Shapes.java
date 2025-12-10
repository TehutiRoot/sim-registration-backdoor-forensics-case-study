package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
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
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ?\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, m28850d2 = {"Landroidx/compose/material3/Shapes;", "", "Landroidx/compose/foundation/shape/CornerBasedShape;", "extraSmall", "small", "medium", "large", "extraLarge", "<init>", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V", "copy", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/material3/Shapes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraSmall", "()Landroidx/compose/foundation/shape/CornerBasedShape;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSmall", OperatorName.CURVE_TO, "getMedium", "d", "getLarge", "e", "getExtraLarge", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Shapes {
    public static final int $stable = 0;

    /* renamed from: a */
    public final CornerBasedShape f26046a;

    /* renamed from: b */
    public final CornerBasedShape f26047b;

    /* renamed from: c */
    public final CornerBasedShape f26048c;

    /* renamed from: d */
    public final CornerBasedShape f26049d;

    /* renamed from: e */
    public final CornerBasedShape f26050e;

    public Shapes() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i, Object obj) {
        if ((i & 1) != 0) {
            cornerBasedShape = shapes.f26046a;
        }
        if ((i & 2) != 0) {
            cornerBasedShape2 = shapes.f26047b;
        }
        CornerBasedShape cornerBasedShape6 = cornerBasedShape2;
        if ((i & 4) != 0) {
            cornerBasedShape3 = shapes.f26048c;
        }
        CornerBasedShape cornerBasedShape7 = cornerBasedShape3;
        if ((i & 8) != 0) {
            cornerBasedShape4 = shapes.f26049d;
        }
        CornerBasedShape cornerBasedShape8 = cornerBasedShape4;
        if ((i & 16) != 0) {
            cornerBasedShape5 = shapes.f26050e;
        }
        return shapes.copy(cornerBasedShape, cornerBasedShape6, cornerBasedShape7, cornerBasedShape8, cornerBasedShape5);
    }

    @NotNull
    public final Shapes copy(@NotNull CornerBasedShape extraSmall, @NotNull CornerBasedShape small, @NotNull CornerBasedShape medium, @NotNull CornerBasedShape large, @NotNull CornerBasedShape extraLarge) {
        Intrinsics.checkNotNullParameter(extraSmall, "extraSmall");
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        Intrinsics.checkNotNullParameter(extraLarge, "extraLarge");
        return new Shapes(extraSmall, small, medium, large, extraLarge);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        if (Intrinsics.areEqual(this.f26046a, shapes.f26046a) && Intrinsics.areEqual(this.f26047b, shapes.f26047b) && Intrinsics.areEqual(this.f26048c, shapes.f26048c) && Intrinsics.areEqual(this.f26049d, shapes.f26049d) && Intrinsics.areEqual(this.f26050e, shapes.f26050e)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final CornerBasedShape getExtraLarge() {
        return this.f26050e;
    }

    @NotNull
    public final CornerBasedShape getExtraSmall() {
        return this.f26046a;
    }

    @NotNull
    public final CornerBasedShape getLarge() {
        return this.f26049d;
    }

    @NotNull
    public final CornerBasedShape getMedium() {
        return this.f26048c;
    }

    @NotNull
    public final CornerBasedShape getSmall() {
        return this.f26047b;
    }

    public int hashCode() {
        return (((((((this.f26046a.hashCode() * 31) + this.f26047b.hashCode()) * 31) + this.f26048c.hashCode()) * 31) + this.f26049d.hashCode()) * 31) + this.f26050e.hashCode();
    }

    @NotNull
    public String toString() {
        return "Shapes(extraSmall=" + this.f26046a + ", small=" + this.f26047b + ", medium=" + this.f26048c + ", large=" + this.f26049d + ", extraLarge=" + this.f26050e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Shapes(@NotNull CornerBasedShape extraSmall, @NotNull CornerBasedShape small, @NotNull CornerBasedShape medium, @NotNull CornerBasedShape large, @NotNull CornerBasedShape extraLarge) {
        Intrinsics.checkNotNullParameter(extraSmall, "extraSmall");
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        Intrinsics.checkNotNullParameter(extraLarge, "extraLarge");
        this.f26046a = extraSmall;
        this.f26047b = small;
        this.f26048c = medium;
        this.f26049d = large;
        this.f26050e = extraLarge;
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5);
    }
}
