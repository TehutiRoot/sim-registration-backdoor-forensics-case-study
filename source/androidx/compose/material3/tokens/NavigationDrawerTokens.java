package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b/\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR \u0010\u001e\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010#R\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0014\u00108\u001a\u0002078\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u001bR\u0017\u0010;\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b9\u0010!\u001a\u0004\b:\u0010#R\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\bR \u0010A\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b?\u0010\u001b\u001a\u0004\b@\u0010\u001dR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010M\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010\u001b\u001a\u0004\bL\u0010\u001dR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010V\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010\\\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b[\u0010\bR\u0017\u0010_\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u0017\u0010b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\ba\u0010\bR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u0017\u0010h\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bf\u0010G\u001a\u0004\bg\u0010IR\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u0017\u0010n\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bl\u0010G\u001a\u0004\bm\u0010IR \u0010p\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001b\u001a\u0004\bo\u0010\u001dR \u0010s\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bq\u0010\u001b\u001a\u0004\br\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, m28850d2 = {"Landroidx/compose/material3/tokens/NavigationDrawerTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveFocusIconColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusIconColor", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", OperatorName.CURVE_TO, "getActiveHoverIconColor", "ActiveHoverIconColor", "d", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", "e", "getActiveIconColor", "ActiveIconColor", OperatorName.FILL_NON_ZERO, "getActiveIndicatorColor", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.NON_STROKING_GRAY, "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CLOSE_PATH, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveIndicatorShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorShape", "i", "getActiveIndicatorWidth-D9Ej5fM", "ActiveIndicatorWidth", OperatorName.SET_LINE_JOINSTYLE, "getActiveLabelTextColor", "ActiveLabelTextColor", OperatorName.NON_STROKING_CMYK, "getActivePressedIconColor", "ActivePressedIconColor", OperatorName.LINE_TO, "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", OperatorName.MOVE_TO, "getBottomContainerShape", "BottomContainerShape", OperatorName.ENDPATH, "getContainerColor", "ContainerColor", "", "ContainerHeightPercent", "o", "getContainerShape", "ContainerShape", "p", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", OperatorName.SAVE, "getContainerWidth-D9Ej5fM", "ContainerWidth", PDPageLabelRange.STYLE_ROMAN_LOWER, "getHeadlineColor", "HeadlineColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getHeadlineFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "HeadlineFont", "t", "getIconSize-D9Ej5fM", "IconSize", "u", "getInactiveFocusIconColor", "InactiveFocusIconColor", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", OperatorName.SET_LINE_WIDTH, "getInactiveHoverIconColor", "InactiveHoverIconColor", "x", "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getInactiveIconColor", "InactiveIconColor", "z", "getInactiveLabelTextColor", "InactiveLabelTextColor", "A", "getInactivePressedIconColor", "InactivePressedIconColor", "B", "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "C", "getLabelTextFont", "LabelTextFont", "D", "getLargeBadgeLabelColor", "LargeBadgeLabelColor", ExifInterface.LONGITUDE_EAST, "getLargeBadgeLabelFont", "LargeBadgeLabelFont", "getModalContainerElevation-D9Ej5fM", "ModalContainerElevation", OperatorName.STROKING_COLOR_GRAY, "getStandardContainerElevation-D9Ej5fM", "StandardContainerElevation", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationDrawerTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerTokens.kt\nandroidx/compose/material3/tokens/NavigationDrawerTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,58:1\n164#2:59\n164#2:60\n164#2:61\n164#2:62\n*S KotlinDebug\n*F\n+ 1 NavigationDrawerTokens.kt\nandroidx/compose/material3/tokens/NavigationDrawerTokens\n*L\n30#1:59\n32#1:60\n41#1:61\n44#1:62\n*E\n"})
/* loaded from: classes2.dex */
public final class NavigationDrawerTokens {

    /* renamed from: A */
    public static final ColorSchemeKeyTokens f27375A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27376B;

    /* renamed from: C */
    public static final TypographyKeyTokens f27377C;
    public static final float ContainerHeightPercent = 100.0f;

    /* renamed from: D */
    public static final ColorSchemeKeyTokens f27378D;

    /* renamed from: E */
    public static final TypographyKeyTokens f27379E;

    /* renamed from: F */
    public static final float f27380F;

    /* renamed from: G */
    public static final float f27381G;
    @NotNull
    public static final NavigationDrawerTokens INSTANCE = new NavigationDrawerTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27382a;

    /* renamed from: b */
    public static final ColorSchemeKeyTokens f27383b;

    /* renamed from: c */
    public static final ColorSchemeKeyTokens f27384c;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27385d;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f27386e;

    /* renamed from: f */
    public static final ColorSchemeKeyTokens f27387f;

    /* renamed from: g */
    public static final float f27388g;

    /* renamed from: h */
    public static final ShapeKeyTokens f27389h;

    /* renamed from: i */
    public static final float f27390i;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f27391j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f27392k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27393l;

    /* renamed from: m */
    public static final ShapeKeyTokens f27394m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f27395n;

    /* renamed from: o */
    public static final ShapeKeyTokens f27396o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f27397p;

    /* renamed from: q */
    public static final float f27398q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27399r;

    /* renamed from: s */
    public static final TypographyKeyTokens f27400s;

    /* renamed from: t */
    public static final float f27401t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f27402u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f27403v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27404w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f27405x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f27406y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f27407z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        f27382a = colorSchemeKeyTokens;
        f27383b = colorSchemeKeyTokens;
        f27384c = colorSchemeKeyTokens;
        f27385d = colorSchemeKeyTokens;
        f27386e = colorSchemeKeyTokens;
        f27387f = ColorSchemeKeyTokens.SecondaryContainer;
        f27388g = C3641Dp.m73658constructorimpl((float) 56.0d);
        f27389h = ShapeKeyTokens.CornerFull;
        f27390i = C3641Dp.m73658constructorimpl((float) 336.0d);
        f27391j = colorSchemeKeyTokens;
        f27392k = colorSchemeKeyTokens;
        f27393l = colorSchemeKeyTokens;
        f27394m = ShapeKeyTokens.CornerLargeTop;
        f27395n = ColorSchemeKeyTokens.Surface;
        f27396o = ShapeKeyTokens.CornerLargeEnd;
        f27397p = ColorSchemeKeyTokens.SurfaceTint;
        f27398q = C3641Dp.m73658constructorimpl((float) 360.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27399r = colorSchemeKeyTokens2;
        f27400s = TypographyKeyTokens.TitleSmall;
        f27401t = C3641Dp.m73658constructorimpl((float) 24.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        f27402u = colorSchemeKeyTokens3;
        f27403v = colorSchemeKeyTokens3;
        f27404w = colorSchemeKeyTokens3;
        f27405x = colorSchemeKeyTokens3;
        f27406y = colorSchemeKeyTokens2;
        f27407z = colorSchemeKeyTokens2;
        f27375A = colorSchemeKeyTokens3;
        f27376B = colorSchemeKeyTokens3;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelLarge;
        f27377C = typographyKeyTokens;
        f27378D = colorSchemeKeyTokens2;
        f27379E = typographyKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        f27380F = elevationTokens.m70956getLevel1D9Ej5fM();
        f27381G = elevationTokens.m70955getLevel0D9Ej5fM();
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return f27382a;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return f27383b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return f27384c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return f27385d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIconColor() {
        return f27386e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return f27387f;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71108getActiveIndicatorHeightD9Ej5fM() {
        return f27388g;
    }

    @NotNull
    public final ShapeKeyTokens getActiveIndicatorShape() {
        return f27389h;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM  reason: not valid java name */
    public final float m71109getActiveIndicatorWidthD9Ej5fM() {
        return f27390i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return f27391j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return f27392k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return f27393l;
    }

    @NotNull
    public final ShapeKeyTokens getBottomContainerShape() {
        return f27394m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return f27395n;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f27396o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return f27397p;
    }

    /* renamed from: getContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m71110getContainerWidthD9Ej5fM() {
        return f27398q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHeadlineColor() {
        return f27399r;
    }

    @NotNull
    public final TypographyKeyTokens getHeadlineFont() {
        return f27400s;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71111getIconSizeD9Ej5fM() {
        return f27401t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return f27402u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return f27403v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return f27404w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return f27405x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return f27406y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return f27407z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return f27375A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return f27376B;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return f27377C;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLargeBadgeLabelColor() {
        return f27378D;
    }

    @NotNull
    public final TypographyKeyTokens getLargeBadgeLabelFont() {
        return f27379E;
    }

    /* renamed from: getModalContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71112getModalContainerElevationD9Ej5fM() {
        return f27380F;
    }

    /* renamed from: getStandardContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71113getStandardContainerElevationD9Ej5fM() {
        return f27381G;
    }
}
