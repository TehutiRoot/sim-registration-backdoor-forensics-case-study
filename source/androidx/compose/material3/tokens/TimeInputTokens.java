package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bb\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010$\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014R \u0010'\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000eR\u0017\u0010*\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000eR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR \u0010T\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\f\u001a\u0004\bS\u0010\u000eR\u0017\u0010W\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bU\u0010\u0012\u001a\u0004\bV\u0010\u0014R \u0010Z\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010\f\u001a\u0004\bY\u0010\u000eR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR \u0010f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010\f\u001a\u0004\be\u0010\u000eR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u0017\u0010n\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\bm\u0010\u001dR\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u0017\u0010t\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\br\u0010\u001b\u001a\u0004\bs\u0010\u001dR\u0017\u0010w\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR\u0017\u0010z\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bx\u0010\u001b\u001a\u0004\by\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006{"}, m28850d2 = {"Landroidx/compose/material3/tokens/TimeInputTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CURVE_TO, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "d", "getHeadlineColor", "HeadlineColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "e", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getHeadlineFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "HeadlineFont", OperatorName.FILL_NON_ZERO, "getPeriodSelectorContainerHeight-D9Ej5fM", "PeriodSelectorContainerHeight", OperatorName.NON_STROKING_GRAY, "getPeriodSelectorContainerShape", "PeriodSelectorContainerShape", OperatorName.CLOSE_PATH, "getPeriodSelectorContainerWidth-D9Ej5fM", "PeriodSelectorContainerWidth", "i", "getPeriodSelectorLabelTextFont", "PeriodSelectorLabelTextFont", OperatorName.SET_LINE_JOINSTYLE, "getPeriodSelectorOutlineColor", "PeriodSelectorOutlineColor", OperatorName.NON_STROKING_CMYK, "getPeriodSelectorOutlineWidth-D9Ej5fM", "PeriodSelectorOutlineWidth", OperatorName.LINE_TO, "getPeriodSelectorSelectedContainerColor", "PeriodSelectorSelectedContainerColor", OperatorName.MOVE_TO, "getPeriodSelectorSelectedFocusLabelTextColor", "PeriodSelectorSelectedFocusLabelTextColor", OperatorName.ENDPATH, "getPeriodSelectorSelectedHoverLabelTextColor", "PeriodSelectorSelectedHoverLabelTextColor", "o", "getPeriodSelectorSelectedLabelTextColor", "PeriodSelectorSelectedLabelTextColor", "p", "getPeriodSelectorSelectedPressedLabelTextColor", "PeriodSelectorSelectedPressedLabelTextColor", OperatorName.SAVE, "getPeriodSelectorUnselectedFocusLabelTextColor", "PeriodSelectorUnselectedFocusLabelTextColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getPeriodSelectorUnselectedHoverLabelTextColor", "PeriodSelectorUnselectedHoverLabelTextColor", OperatorName.CLOSE_AND_STROKE, "getPeriodSelectorUnselectedLabelTextColor", "PeriodSelectorUnselectedLabelTextColor", "t", "getPeriodSelectorUnselectedPressedLabelTextColor", "PeriodSelectorUnselectedPressedLabelTextColor", "u", "getSurfaceTintLayerColor", "SurfaceTintLayerColor", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getTimeFieldContainerColor", "TimeFieldContainerColor", OperatorName.SET_LINE_WIDTH, "getTimeFieldContainerHeight-D9Ej5fM", "TimeFieldContainerHeight", "x", "getTimeFieldContainerShape", "TimeFieldContainerShape", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getTimeFieldContainerWidth-D9Ej5fM", "TimeFieldContainerWidth", "z", "getTimeFieldFocusContainerColor", "TimeFieldFocusContainerColor", "A", "getTimeFieldFocusLabelTextColor", "TimeFieldFocusLabelTextColor", "B", "getTimeFieldFocusOutlineColor", "TimeFieldFocusOutlineColor", "C", "getTimeFieldFocusOutlineWidth-D9Ej5fM", "TimeFieldFocusOutlineWidth", "D", "getTimeFieldHoverLabelTextColor", "TimeFieldHoverLabelTextColor", ExifInterface.LONGITUDE_EAST, "getTimeFieldLabelTextColor", "TimeFieldLabelTextColor", "getTimeFieldLabelTextFont", "TimeFieldLabelTextFont", OperatorName.STROKING_COLOR_GRAY, "getTimeFieldSeparatorColor", "TimeFieldSeparatorColor", "H", "getTimeFieldSeparatorFont", "TimeFieldSeparatorFont", "I", "getTimeFieldSupportingTextColor", "TimeFieldSupportingTextColor", OperatorName.SET_LINE_CAPSTYLE, "getTimeFieldSupportingTextFont", "TimeFieldSupportingTextFont", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimeInputTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeInputTokens.kt\nandroidx/compose/material3/tokens/TimeInputTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,61:1\n164#2:62\n164#2:63\n164#2:64\n164#2:65\n164#2:66\n164#2:67\n*S KotlinDebug\n*F\n+ 1 TimeInputTokens.kt\nandroidx/compose/material3/tokens/TimeInputTokens\n*L\n30#1:62\n32#1:63\n35#1:64\n47#1:65\n49#1:66\n53#1:67\n*E\n"})
/* loaded from: classes2.dex */
public final class TimeInputTokens {

    /* renamed from: A */
    public static final ColorSchemeKeyTokens f27952A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27953B;

    /* renamed from: C */
    public static final float f27954C;

    /* renamed from: D */
    public static final ColorSchemeKeyTokens f27955D;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f27956E;

    /* renamed from: F */
    public static final TypographyKeyTokens f27957F;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f27958G;

    /* renamed from: H */
    public static final TypographyKeyTokens f27959H;

    /* renamed from: I */
    public static final ColorSchemeKeyTokens f27960I;

    /* renamed from: J */
    public static final TypographyKeyTokens f27961J;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27965d;

    /* renamed from: e */
    public static final TypographyKeyTokens f27966e;

    /* renamed from: f */
    public static final float f27967f;

    /* renamed from: g */
    public static final ShapeKeyTokens f27968g;

    /* renamed from: h */
    public static final float f27969h;

    /* renamed from: i */
    public static final TypographyKeyTokens f27970i;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f27971j;

    /* renamed from: k */
    public static final float f27972k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27973l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f27974m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f27975n;

    /* renamed from: o */
    public static final ColorSchemeKeyTokens f27976o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f27977p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f27978q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27979r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f27980s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f27981t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f27982u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f27983v;

    /* renamed from: w */
    public static final float f27984w;

    /* renamed from: x */
    public static final ShapeKeyTokens f27985x;

    /* renamed from: y */
    public static final float f27986y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f27987z;
    @NotNull
    public static final TimeInputTokens INSTANCE = new TimeInputTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27962a = ColorSchemeKeyTokens.Surface;

    /* renamed from: b */
    public static final float f27963b = ElevationTokens.INSTANCE.m70958getLevel3D9Ej5fM();

    /* renamed from: c */
    public static final ShapeKeyTokens f27964c = ShapeKeyTokens.CornerExtraLarge;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27965d = colorSchemeKeyTokens;
        f27966e = TypographyKeyTokens.LabelMedium;
        float f = (float) 72.0d;
        f27967f = C3641Dp.m73658constructorimpl(f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerSmall;
        f27968g = shapeKeyTokens;
        f27969h = C3641Dp.m73658constructorimpl((float) 52.0d);
        f27970i = TypographyKeyTokens.TitleMedium;
        f27971j = ColorSchemeKeyTokens.Outline;
        f27972k = C3641Dp.m73658constructorimpl((float) 1.0d);
        f27973l = ColorSchemeKeyTokens.TertiaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnTertiaryContainer;
        f27974m = colorSchemeKeyTokens2;
        f27975n = colorSchemeKeyTokens2;
        f27976o = colorSchemeKeyTokens2;
        f27977p = colorSchemeKeyTokens2;
        f27978q = colorSchemeKeyTokens;
        f27979r = colorSchemeKeyTokens;
        f27980s = colorSchemeKeyTokens;
        f27981t = colorSchemeKeyTokens;
        f27982u = ColorSchemeKeyTokens.SurfaceTint;
        f27983v = ColorSchemeKeyTokens.SurfaceVariant;
        f27984w = C3641Dp.m73658constructorimpl(f);
        f27985x = shapeKeyTokens;
        f27986y = C3641Dp.m73658constructorimpl((float) 96.0d);
        f27987z = ColorSchemeKeyTokens.PrimaryContainer;
        f27952A = ColorSchemeKeyTokens.OnPrimaryContainer;
        f27953B = ColorSchemeKeyTokens.Primary;
        f27954C = C3641Dp.m73658constructorimpl((float) 2.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        f27955D = colorSchemeKeyTokens3;
        f27956E = colorSchemeKeyTokens3;
        f27957F = TypographyKeyTokens.DisplayMedium;
        f27958G = colorSchemeKeyTokens3;
        f27959H = TypographyKeyTokens.DisplayLarge;
        f27960I = colorSchemeKeyTokens;
        f27961J = TypographyKeyTokens.BodySmall;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return f27962a;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71293getContainerElevationD9Ej5fM() {
        return f27963b;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f27964c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHeadlineColor() {
        return f27965d;
    }

    @NotNull
    public final TypographyKeyTokens getHeadlineFont() {
        return f27966e;
    }

    /* renamed from: getPeriodSelectorContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71294getPeriodSelectorContainerHeightD9Ej5fM() {
        return f27967f;
    }

    @NotNull
    public final ShapeKeyTokens getPeriodSelectorContainerShape() {
        return f27968g;
    }

    /* renamed from: getPeriodSelectorContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m71295getPeriodSelectorContainerWidthD9Ej5fM() {
        return f27969h;
    }

    @NotNull
    public final TypographyKeyTokens getPeriodSelectorLabelTextFont() {
        return f27970i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorOutlineColor() {
        return f27971j;
    }

    /* renamed from: getPeriodSelectorOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71296getPeriodSelectorOutlineWidthD9Ej5fM() {
        return f27972k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedContainerColor() {
        return f27973l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedFocusLabelTextColor() {
        return f27974m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedHoverLabelTextColor() {
        return f27975n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedLabelTextColor() {
        return f27976o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedPressedLabelTextColor() {
        return f27977p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedFocusLabelTextColor() {
        return f27978q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedHoverLabelTextColor() {
        return f27979r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedLabelTextColor() {
        return f27980s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedPressedLabelTextColor() {
        return f27981t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSurfaceTintLayerColor() {
        return f27982u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldContainerColor() {
        return f27983v;
    }

    /* renamed from: getTimeFieldContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71297getTimeFieldContainerHeightD9Ej5fM() {
        return f27984w;
    }

    @NotNull
    public final ShapeKeyTokens getTimeFieldContainerShape() {
        return f27985x;
    }

    /* renamed from: getTimeFieldContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m71298getTimeFieldContainerWidthD9Ej5fM() {
        return f27986y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldFocusContainerColor() {
        return f27987z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldFocusLabelTextColor() {
        return f27952A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldFocusOutlineColor() {
        return f27953B;
    }

    /* renamed from: getTimeFieldFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71299getTimeFieldFocusOutlineWidthD9Ej5fM() {
        return f27954C;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldHoverLabelTextColor() {
        return f27955D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldLabelTextColor() {
        return f27956E;
    }

    @NotNull
    public final TypographyKeyTokens getTimeFieldLabelTextFont() {
        return f27957F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldSeparatorColor() {
        return f27958G;
    }

    @NotNull
    public final TypographyKeyTokens getTimeFieldSeparatorFont() {
        return f27959H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldSupportingTextColor() {
        return f27960I;
    }

    @NotNull
    public final TypographyKeyTokens getTimeFieldSupportingTextFont() {
        return f27961J;
    }
}
