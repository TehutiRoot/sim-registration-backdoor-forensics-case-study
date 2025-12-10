package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR \u0010\u001b\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR \u0010\u001e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR \u0010*\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u000eR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR \u00109\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b8\u0010\u000eR \u0010<\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b;\u0010\u000eR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\bR\u0017\u0010f\u001a\u00020a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, m28850d2 = {"Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveIndicatorColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "Landroidx/compose/foundation/shape/RoundedCornerShape;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getActiveIndicatorShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ActiveIndicatorShape", "d", "getContainerColor", "ContainerColor", "e", "getContainerElevation-D9Ej5fM", "ContainerElevation", OperatorName.FILL_NON_ZERO, "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", OperatorName.CLOSE_PATH, "getDividerColor", "DividerColor", "i", "getDividerHeight-D9Ej5fM", "DividerHeight", OperatorName.SET_LINE_JOINSTYLE, "getActiveFocusIconColor", "ActiveFocusIconColor", OperatorName.NON_STROKING_CMYK, "getActiveHoverIconColor", "ActiveHoverIconColor", OperatorName.LINE_TO, "getActiveIconColor", "ActiveIconColor", OperatorName.MOVE_TO, "getActivePressedIconColor", "ActivePressedIconColor", OperatorName.ENDPATH, "getIconAndLabelTextContainerHeight-D9Ej5fM", "IconAndLabelTextContainerHeight", "o", "getIconSize-D9Ej5fM", "IconSize", "p", "getInactiveFocusIconColor", "InactiveFocusIconColor", OperatorName.SAVE, "getInactiveHoverIconColor", "InactiveHoverIconColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getInactiveIconColor", "InactiveIconColor", OperatorName.CLOSE_AND_STROKE, "getInactivePressedIconColor", "InactivePressedIconColor", "t", "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", "u", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getActiveLabelTextColor", "ActiveLabelTextColor", OperatorName.SET_LINE_WIDTH, "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", "x", "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", "z", "getInactiveLabelTextColor", "InactiveLabelTextColor", "A", "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "B", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrimaryNavigationTabTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryNavigationTabTokens.kt\nandroidx/compose/material3/tokens/PrimaryNavigationTabTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,53:1\n164#2:54\n164#2:55\n164#2:56\n164#2:57\n164#2:58\n164#2:59\n*S KotlinDebug\n*F\n+ 1 PrimaryNavigationTabTokens.kt\nandroidx/compose/material3/tokens/PrimaryNavigationTabTokens\n*L\n26#1:54\n27#1:55\n30#1:56\n33#1:57\n38#1:58\n39#1:59\n*E\n"})
/* loaded from: classes2.dex */
public final class PrimaryNavigationTabTokens {

    /* renamed from: A */
    public static final ColorSchemeKeyTokens f27704A;

    /* renamed from: B */
    public static final TypographyKeyTokens f27705B;
    @NotNull
    public static final PrimaryNavigationTabTokens INSTANCE = new PrimaryNavigationTabTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27706a;

    /* renamed from: b */
    public static final float f27707b;

    /* renamed from: c */
    public static final RoundedCornerShape f27708c;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27709d;

    /* renamed from: e */
    public static final float f27710e;

    /* renamed from: f */
    public static final float f27711f;

    /* renamed from: g */
    public static final ShapeKeyTokens f27712g;

    /* renamed from: h */
    public static final ColorSchemeKeyTokens f27713h;

    /* renamed from: i */
    public static final float f27714i;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f27715j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f27716k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27717l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f27718m;

    /* renamed from: n */
    public static final float f27719n;

    /* renamed from: o */
    public static final float f27720o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f27721p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f27722q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27723r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f27724s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f27725t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f27726u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f27727v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27728w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f27729x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f27730y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f27731z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f27706a = colorSchemeKeyTokens;
        float f = (float) 3.0d;
        f27707b = C3641Dp.m73658constructorimpl(f);
        f27708c = RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(f));
        f27709d = ColorSchemeKeyTokens.Surface;
        f27710e = ElevationTokens.INSTANCE.m70955getLevel0D9Ej5fM();
        f27711f = C3641Dp.m73658constructorimpl((float) 48.0d);
        f27712g = ShapeKeyTokens.CornerNone;
        f27713h = ColorSchemeKeyTokens.SurfaceVariant;
        f27714i = C3641Dp.m73658constructorimpl((float) 1.0d);
        f27715j = colorSchemeKeyTokens;
        f27716k = colorSchemeKeyTokens;
        f27717l = colorSchemeKeyTokens;
        f27718m = colorSchemeKeyTokens;
        f27719n = C3641Dp.m73658constructorimpl((float) 64.0d);
        f27720o = C3641Dp.m73658constructorimpl((float) 24.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f27721p = colorSchemeKeyTokens2;
        f27722q = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27723r = colorSchemeKeyTokens3;
        f27724s = colorSchemeKeyTokens2;
        f27725t = colorSchemeKeyTokens;
        f27726u = colorSchemeKeyTokens;
        f27727v = colorSchemeKeyTokens;
        f27728w = colorSchemeKeyTokens;
        f27729x = colorSchemeKeyTokens2;
        f27730y = colorSchemeKeyTokens2;
        f27731z = colorSchemeKeyTokens3;
        f27704A = colorSchemeKeyTokens2;
        f27705B = TypographyKeyTokens.TitleSmall;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return f27715j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return f27725t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return f27716k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return f27726u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIconColor() {
        return f27717l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return f27706a;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71232getActiveIndicatorHeightD9Ej5fM() {
        return f27707b;
    }

    @NotNull
    public final RoundedCornerShape getActiveIndicatorShape() {
        return f27708c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return f27727v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return f27718m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return f27728w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return f27709d;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71233getContainerElevationD9Ej5fM() {
        return f27710e;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71234getContainerHeightD9Ej5fM() {
        return f27711f;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f27712g;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDividerColor() {
        return f27713h;
    }

    /* renamed from: getDividerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71235getDividerHeightD9Ej5fM() {
        return f27714i;
    }

    /* renamed from: getIconAndLabelTextContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71236getIconAndLabelTextContainerHeightD9Ej5fM() {
        return f27719n;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71237getIconSizeD9Ej5fM() {
        return f27720o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return f27721p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return f27729x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return f27722q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return f27730y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return f27723r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return f27731z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return f27724s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return f27704A;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return f27705B;
    }
}
