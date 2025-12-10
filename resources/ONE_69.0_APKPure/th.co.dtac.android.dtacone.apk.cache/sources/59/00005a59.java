package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.tokens.ShapeTokens;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, m29142d2 = {"Landroidx/compose/material3/ShapeDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/shape/CornerBasedShape;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraSmall", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "ExtraSmall", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSmall", "Small", OperatorName.CURVE_TO, "getMedium", "Medium", "d", "getLarge", "Large", "e", "getExtraLarge", "ExtraLarge", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ShapeDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final ShapeDefaults INSTANCE = new ShapeDefaults();

    /* renamed from: a */
    public static final CornerBasedShape f26129a;

    /* renamed from: b */
    public static final CornerBasedShape f26130b;

    /* renamed from: c */
    public static final CornerBasedShape f26131c;

    /* renamed from: d */
    public static final CornerBasedShape f26132d;

    /* renamed from: e */
    public static final CornerBasedShape f26133e;

    static {
        ShapeTokens shapeTokens = ShapeTokens.INSTANCE;
        f26129a = shapeTokens.getCornerExtraSmall();
        f26130b = shapeTokens.getCornerSmall();
        f26131c = shapeTokens.getCornerMedium();
        f26132d = shapeTokens.getCornerLarge();
        f26133e = shapeTokens.getCornerExtraLarge();
    }

    @NotNull
    public final CornerBasedShape getExtraLarge() {
        return f26133e;
    }

    @NotNull
    public final CornerBasedShape getExtraSmall() {
        return f26129a;
    }

    @NotNull
    public final CornerBasedShape getLarge() {
        return f26132d;
    }

    @NotNull
    public final CornerBasedShape getMedium() {
        return f26131c;
    }

    @NotNull
    public final CornerBasedShape getSmall() {
        return f26130b;
    }
}