package androidx.compose.material3.tokens;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/material3/tokens/PlainTooltipTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", OperatorName.CURVE_TO, "getSupportingTextColor", "SupportingTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "d", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getSupportingTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "SupportingTextFont", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlainTooltipTokens {
    @NotNull
    public static final PlainTooltipTokens INSTANCE = new PlainTooltipTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27700a = ColorSchemeKeyTokens.InverseSurface;

    /* renamed from: b */
    public static final ShapeKeyTokens f27701b = ShapeKeyTokens.CornerExtraSmall;

    /* renamed from: c */
    public static final ColorSchemeKeyTokens f27702c = ColorSchemeKeyTokens.InverseOnSurface;

    /* renamed from: d */
    public static final TypographyKeyTokens f27703d = TypographyKeyTokens.BodySmall;

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return f27700a;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f27701b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSupportingTextColor() {
        return f27702c;
    }

    @NotNull
    public final TypographyKeyTokens getSupportingTextFont() {
        return f27703d;
    }
}
