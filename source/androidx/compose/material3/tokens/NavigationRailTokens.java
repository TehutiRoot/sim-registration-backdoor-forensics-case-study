package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u001a\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR \u0010\u001e\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR \u00106\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001dR\u0017\u00109\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#R \u0010<\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\u001b\u001a\u0004\b;\u0010\u001dR \u0010?\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u001b\u001a\u0004\b>\u0010\u001dR\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010]\u001a\u00020X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR \u0010i\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bg\u0010\u001b\u001a\u0004\bh\u0010\u001dR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR \u0010n\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001b\u001a\u0004\bm\u0010\u001dR\u0017\u0010q\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bo\u0010!\u001a\u0004\bp\u0010#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, m28850d2 = {"Landroidx/compose/material3/tokens/NavigationRailTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveFocusIconColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusIconColor", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", OperatorName.CURVE_TO, "getActiveHoverIconColor", "ActiveHoverIconColor", "d", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", "e", "getActiveIconColor", "ActiveIconColor", OperatorName.FILL_NON_ZERO, "getActiveIndicatorColor", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.NON_STROKING_GRAY, "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CLOSE_PATH, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveIndicatorShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorShape", "i", "getActiveIndicatorWidth-D9Ej5fM", "ActiveIndicatorWidth", OperatorName.SET_LINE_JOINSTYLE, "getActiveLabelTextColor", "ActiveLabelTextColor", OperatorName.NON_STROKING_CMYK, "getActivePressedIconColor", "ActivePressedIconColor", OperatorName.LINE_TO, "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", OperatorName.MOVE_TO, "getContainerColor", "ContainerColor", OperatorName.ENDPATH, "getContainerElevation-D9Ej5fM", "ContainerElevation", "o", "getContainerShape", "ContainerShape", "p", "getContainerWidth-D9Ej5fM", "ContainerWidth", OperatorName.SAVE, "getIconSize-D9Ej5fM", "IconSize", PDPageLabelRange.STYLE_ROMAN_LOWER, "getInactiveFocusIconColor", "InactiveFocusIconColor", OperatorName.CLOSE_AND_STROKE, "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", "t", "getInactiveHoverIconColor", "InactiveHoverIconColor", "u", "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getInactiveIconColor", "InactiveIconColor", OperatorName.SET_LINE_WIDTH, "getInactiveLabelTextColor", "InactiveLabelTextColor", "x", "getInactivePressedIconColor", "InactivePressedIconColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "z", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "A", "getMenuFocusIconColor", "MenuFocusIconColor", "B", "getMenuHoverIconColor", "MenuHoverIconColor", "C", "getMenuIconColor", "MenuIconColor", "D", "getMenuIconSize-D9Ej5fM", "MenuIconSize", ExifInterface.LONGITUDE_EAST, "getMenuPressedIconColor", "MenuPressedIconColor", "getNoLabelActiveIndicatorHeight-D9Ej5fM", "NoLabelActiveIndicatorHeight", OperatorName.STROKING_COLOR_GRAY, "getNoLabelActiveIndicatorShape", "NoLabelActiveIndicatorShape", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationRailTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRailTokens.kt\nandroidx/compose/material3/tokens/NavigationRailTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,57:1\n164#2:58\n164#2:59\n164#2:60\n164#2:61\n164#2:62\n164#2:63\n*S KotlinDebug\n*F\n+ 1 NavigationRailTokens.kt\nandroidx/compose/material3/tokens/NavigationRailTokens\n*L\n30#1:58\n32#1:59\n39#1:60\n40#1:61\n53#1:62\n55#1:63\n*E\n"})
/* loaded from: classes2.dex */
public final class NavigationRailTokens {

    /* renamed from: A */
    public static final ColorSchemeKeyTokens f27408A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27409B;

    /* renamed from: C */
    public static final ColorSchemeKeyTokens f27410C;

    /* renamed from: D */
    public static final float f27411D;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f27412E;

    /* renamed from: F */
    public static final float f27413F;

    /* renamed from: G */
    public static final ShapeKeyTokens f27414G;
    @NotNull
    public static final NavigationRailTokens INSTANCE = new NavigationRailTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27415a;

    /* renamed from: b */
    public static final ColorSchemeKeyTokens f27416b;

    /* renamed from: c */
    public static final ColorSchemeKeyTokens f27417c;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27418d;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f27419e;

    /* renamed from: f */
    public static final ColorSchemeKeyTokens f27420f;

    /* renamed from: g */
    public static final float f27421g;

    /* renamed from: h */
    public static final ShapeKeyTokens f27422h;

    /* renamed from: i */
    public static final float f27423i;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f27424j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f27425k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27426l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f27427m;

    /* renamed from: n */
    public static final float f27428n;

    /* renamed from: o */
    public static final ShapeKeyTokens f27429o;

    /* renamed from: p */
    public static final float f27430p;

    /* renamed from: q */
    public static final float f27431q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27432r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f27433s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f27434t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f27435u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f27436v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27437w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f27438x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f27439y;

    /* renamed from: z */
    public static final TypographyKeyTokens f27440z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        f27415a = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f27416b = colorSchemeKeyTokens2;
        f27417c = colorSchemeKeyTokens;
        f27418d = colorSchemeKeyTokens2;
        f27419e = colorSchemeKeyTokens;
        f27420f = ColorSchemeKeyTokens.SecondaryContainer;
        f27421g = C3641Dp.m73658constructorimpl((float) 32.0d);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        f27422h = shapeKeyTokens;
        float f = (float) 56.0d;
        f27423i = C3641Dp.m73658constructorimpl(f);
        f27424j = colorSchemeKeyTokens2;
        f27425k = colorSchemeKeyTokens;
        f27426l = colorSchemeKeyTokens2;
        f27427m = ColorSchemeKeyTokens.Surface;
        f27428n = ElevationTokens.INSTANCE.m70955getLevel0D9Ej5fM();
        f27429o = ShapeKeyTokens.CornerNone;
        f27430p = C3641Dp.m73658constructorimpl((float) 80.0d);
        float f2 = (float) 24.0d;
        f27431q = C3641Dp.m73658constructorimpl(f2);
        f27432r = colorSchemeKeyTokens2;
        f27433s = colorSchemeKeyTokens2;
        f27434t = colorSchemeKeyTokens2;
        f27435u = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27436v = colorSchemeKeyTokens3;
        f27437w = colorSchemeKeyTokens3;
        f27438x = colorSchemeKeyTokens2;
        f27439y = colorSchemeKeyTokens2;
        f27440z = TypographyKeyTokens.LabelMedium;
        f27408A = colorSchemeKeyTokens2;
        f27409B = colorSchemeKeyTokens2;
        f27410C = colorSchemeKeyTokens3;
        f27411D = C3641Dp.m73658constructorimpl(f2);
        f27412E = colorSchemeKeyTokens2;
        f27413F = C3641Dp.m73658constructorimpl(f);
        f27414G = shapeKeyTokens;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return f27415a;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return f27416b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return f27417c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return f27418d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIconColor() {
        return f27419e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return f27420f;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71114getActiveIndicatorHeightD9Ej5fM() {
        return f27421g;
    }

    @NotNull
    public final ShapeKeyTokens getActiveIndicatorShape() {
        return f27422h;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM  reason: not valid java name */
    public final float m71115getActiveIndicatorWidthD9Ej5fM() {
        return f27423i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return f27424j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return f27425k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return f27426l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return f27427m;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71116getContainerElevationD9Ej5fM() {
        return f27428n;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f27429o;
    }

    /* renamed from: getContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m71117getContainerWidthD9Ej5fM() {
        return f27430p;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71118getIconSizeD9Ej5fM() {
        return f27431q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return f27432r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return f27433s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return f27434t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return f27435u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return f27436v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return f27437w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return f27438x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return f27439y;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return f27440z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuFocusIconColor() {
        return f27408A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuHoverIconColor() {
        return f27409B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuIconColor() {
        return f27410C;
    }

    /* renamed from: getMenuIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71119getMenuIconSizeD9Ej5fM() {
        return f27411D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuPressedIconColor() {
        return f27412E;
    }

    /* renamed from: getNoLabelActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71120getNoLabelActiveIndicatorHeightD9Ej5fM() {
        return f27413F;
    }

    @NotNull
    public final ShapeKeyTokens getNoLabelActiveIndicatorShape() {
        return f27414G;
    }
}
