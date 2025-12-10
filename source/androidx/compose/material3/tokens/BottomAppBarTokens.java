package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m28850d2 = {"Landroidx/compose/material3/tokens/BottomAppBarTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", OperatorName.CURVE_TO, "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "e", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomAppBarTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomAppBarTokens.kt\nandroidx/compose/material3/tokens/BottomAppBarTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,29:1\n164#2:30\n*S KotlinDebug\n*F\n+ 1 BottomAppBarTokens.kt\nandroidx/compose/material3/tokens/BottomAppBarTokens\n*L\n26#1:30\n*E\n"})
/* loaded from: classes2.dex */
public final class BottomAppBarTokens {
    @NotNull
    public static final BottomAppBarTokens INSTANCE = new BottomAppBarTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f26587a = ColorSchemeKeyTokens.Surface;

    /* renamed from: b */
    public static final float f26588b = ElevationTokens.INSTANCE.m70957getLevel2D9Ej5fM();

    /* renamed from: c */
    public static final float f26589c = C3641Dp.m73658constructorimpl((float) 80.0d);

    /* renamed from: d */
    public static final ShapeKeyTokens f26590d = ShapeKeyTokens.CornerNone;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f26591e = ColorSchemeKeyTokens.SurfaceTint;

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return f26587a;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m70834getContainerElevationD9Ej5fM() {
        return f26588b;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70835getContainerHeightD9Ej5fM() {
        return f26589c;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f26590d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return f26591e;
    }
}
