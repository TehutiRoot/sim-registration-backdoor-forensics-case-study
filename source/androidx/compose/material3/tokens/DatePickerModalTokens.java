package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\bq\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR \u0010\u001e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR \u0010!\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010$\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R \u0010'\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000eR\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR \u00106\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u000eR\u0017\u00109\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b7\u0010\u0015\u001a\u0004\b8\u0010\u0017R \u0010<\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b;\u0010\u000eR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR \u0010B\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\bA\u0010\u000eR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR \u0010K\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\f\u001a\u0004\bJ\u0010\u000eR \u0010N\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bM\u0010\u000eR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010T\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bR\u0010*\u001a\u0004\bS\u0010,R\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010Z\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bX\u0010*\u001a\u0004\bY\u0010,R\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR \u0010`\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b^\u0010\f\u001a\u0004\b_\u0010\u000eR\u0017\u0010c\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\ba\u0010\u0015\u001a\u0004\bb\u0010\u0017R \u0010f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010\f\u001a\u0004\be\u0010\u000eR\u0017\u0010i\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bg\u0010\u0015\u001a\u0004\bh\u0010\u0017R\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR \u0010n\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\f\u001a\u0004\bm\u0010\u000eR\u0017\u0010q\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bo\u0010*\u001a\u0004\bp\u0010,R\u0017\u0010t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bs\u0010\bR\u0017\u0010w\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bu\u0010*\u001a\u0004\bv\u0010,R\u0017\u0010z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bx\u0010\u0006\u001a\u0004\by\u0010\bR\u0017\u0010}\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b{\u0010*\u001a\u0004\b|\u0010,R!\u0010\u0080\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\f\u001a\u0004\b\u007f\u0010\u000eR#\u0010\u0083\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\f\u001a\u0005\b\u0082\u0001\u0010\u000eR\u001a\u0010\u0086\u0001\u001a\u00020(8\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010*\u001a\u0005\b\u0085\u0001\u0010,R\u001a\u0010\u0089\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001a\u0010\u008c\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR#\u0010\u008f\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\f\u001a\u0005\b\u008e\u0001\u0010\u000eR\u001a\u0010\u0092\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0015\u001a\u0005\b\u0091\u0001\u0010\u0017R#\u0010\u0095\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\f\u001a\u0005\b\u0094\u0001\u0010\u000eR\u001a\u0010\u0098\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0005\b\u0097\u0001\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0099\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/DatePickerModalTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", OperatorName.CURVE_TO, "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "e", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", OperatorName.FILL_NON_ZERO, "getContainerWidth-D9Ej5fM", "ContainerWidth", OperatorName.NON_STROKING_GRAY, "getDateContainerHeight-D9Ej5fM", "DateContainerHeight", OperatorName.CLOSE_PATH, "getDateContainerShape", "DateContainerShape", "i", "getDateContainerWidth-D9Ej5fM", "DateContainerWidth", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getDateLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "DateLabelTextFont", OperatorName.NON_STROKING_CMYK, "getDateSelectedContainerColor", "DateSelectedContainerColor", OperatorName.LINE_TO, "getDateSelectedLabelTextColor", "DateSelectedLabelTextColor", OperatorName.MOVE_TO, "getDateStateLayerHeight-D9Ej5fM", "DateStateLayerHeight", OperatorName.ENDPATH, "getDateStateLayerShape", "DateStateLayerShape", "o", "getDateStateLayerWidth-D9Ej5fM", "DateStateLayerWidth", "p", "getDateTodayContainerOutlineColor", "DateTodayContainerOutlineColor", OperatorName.SAVE, "getDateTodayContainerOutlineWidth-D9Ej5fM", "DateTodayContainerOutlineWidth", PDPageLabelRange.STYLE_ROMAN_LOWER, "getDateTodayLabelTextColor", "DateTodayLabelTextColor", OperatorName.CLOSE_AND_STROKE, "getDateUnselectedLabelTextColor", "DateUnselectedLabelTextColor", "t", "getHeaderContainerHeight-D9Ej5fM", "HeaderContainerHeight", "u", "getHeaderContainerWidth-D9Ej5fM", "HeaderContainerWidth", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getHeaderHeadlineColor", "HeaderHeadlineColor", OperatorName.SET_LINE_WIDTH, "getHeaderHeadlineFont", "HeaderHeadlineFont", "x", "getHeaderSupportingTextColor", "HeaderSupportingTextColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getHeaderSupportingTextFont", "HeaderSupportingTextFont", "z", "getRangeSelectionActiveIndicatorContainerColor", "RangeSelectionActiveIndicatorContainerColor", "A", "getRangeSelectionActiveIndicatorContainerHeight-D9Ej5fM", "RangeSelectionActiveIndicatorContainerHeight", "B", "getRangeSelectionActiveIndicatorContainerShape", "RangeSelectionActiveIndicatorContainerShape", "C", "getRangeSelectionContainerElevation-D9Ej5fM", "RangeSelectionContainerElevation", "D", "getRangeSelectionContainerShape", "RangeSelectionContainerShape", ExifInterface.LONGITUDE_EAST, "getSelectionDateInRangeLabelTextColor", "SelectionDateInRangeLabelTextColor", "getRangeSelectionHeaderContainerHeight-D9Ej5fM", "RangeSelectionHeaderContainerHeight", OperatorName.STROKING_COLOR_GRAY, "getRangeSelectionHeaderHeadlineFont", "RangeSelectionHeaderHeadlineFont", "H", "getRangeSelectionMonthSubheadColor", "RangeSelectionMonthSubheadColor", "I", "getRangeSelectionMonthSubheadFont", "RangeSelectionMonthSubheadFont", OperatorName.SET_LINE_CAPSTYLE, "getWeekdaysLabelTextColor", "WeekdaysLabelTextColor", "K", "getWeekdaysLabelTextFont", "WeekdaysLabelTextFont", "L", "getSelectionYearContainerHeight-D9Ej5fM", "SelectionYearContainerHeight", "M", "getSelectionYearContainerWidth-D9Ej5fM", "SelectionYearContainerWidth", "N", "getSelectionYearLabelTextFont", "SelectionYearLabelTextFont", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getSelectionYearSelectedContainerColor", "SelectionYearSelectedContainerColor", "P", "getSelectionYearSelectedLabelTextColor", "SelectionYearSelectedLabelTextColor", OperatorName.RESTORE, "getSelectionYearStateLayerHeight-D9Ej5fM", "SelectionYearStateLayerHeight", "R", "getSelectionYearStateLayerShape", "SelectionYearStateLayerShape", "S", "getSelectionYearStateLayerWidth-D9Ej5fM", "SelectionYearStateLayerWidth", "T", "getSelectionYearUnselectedLabelTextColor", "SelectionYearUnselectedLabelTextColor", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDatePickerModalTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerModalTokens.kt\nandroidx/compose/material3/tokens/DatePickerModalTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,71:1\n164#2:72\n164#2:73\n164#2:74\n164#2:75\n164#2:76\n164#2:77\n164#2:78\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n164#2:86\n*S KotlinDebug\n*F\n+ 1 DatePickerModalTokens.kt\nandroidx/compose/material3/tokens/DatePickerModalTokens\n*L\n26#1:72\n29#1:73\n30#1:74\n32#1:75\n36#1:76\n38#1:77\n40#1:78\n43#1:79\n44#1:80\n50#1:81\n55#1:82\n61#1:83\n62#1:84\n66#1:85\n68#1:86\n*E\n"})
/* loaded from: classes2.dex */
public final class DatePickerModalTokens {

    /* renamed from: A */
    public static final float f26719A;

    /* renamed from: B */
    public static final ShapeKeyTokens f26720B;

    /* renamed from: C */
    public static final float f26721C;

    /* renamed from: D */
    public static final ShapeKeyTokens f26722D;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f26723E;

    /* renamed from: F */
    public static final float f26724F;

    /* renamed from: G */
    public static final TypographyKeyTokens f26725G;

    /* renamed from: H */
    public static final ColorSchemeKeyTokens f26726H;

    /* renamed from: I */
    public static final TypographyKeyTokens f26727I;

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f26728J;

    /* renamed from: K */
    public static final TypographyKeyTokens f26729K;

    /* renamed from: L */
    public static final float f26730L;

    /* renamed from: M */
    public static final float f26731M;

    /* renamed from: N */
    public static final TypographyKeyTokens f26732N;

    /* renamed from: O */
    public static final ColorSchemeKeyTokens f26733O;

    /* renamed from: P */
    public static final ColorSchemeKeyTokens f26734P;

    /* renamed from: Q */
    public static final float f26735Q;

    /* renamed from: R */
    public static final ShapeKeyTokens f26736R;

    /* renamed from: S */
    public static final float f26737S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f26738T;

    /* renamed from: b */
    public static final float f26740b;

    /* renamed from: c */
    public static final float f26741c;

    /* renamed from: d */
    public static final ShapeKeyTokens f26742d;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f26743e;

    /* renamed from: f */
    public static final float f26744f;

    /* renamed from: g */
    public static final float f26745g;

    /* renamed from: h */
    public static final ShapeKeyTokens f26746h;

    /* renamed from: i */
    public static final float f26747i;

    /* renamed from: j */
    public static final TypographyKeyTokens f26748j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f26749k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f26750l;

    /* renamed from: m */
    public static final float f26751m;

    /* renamed from: n */
    public static final ShapeKeyTokens f26752n;

    /* renamed from: o */
    public static final float f26753o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f26754p;

    /* renamed from: q */
    public static final float f26755q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f26756r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f26757s;

    /* renamed from: t */
    public static final float f26758t;

    /* renamed from: u */
    public static final float f26759u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f26760v;

    /* renamed from: w */
    public static final TypographyKeyTokens f26761w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f26762x;

    /* renamed from: y */
    public static final TypographyKeyTokens f26763y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f26764z;
    @NotNull
    public static final DatePickerModalTokens INSTANCE = new DatePickerModalTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f26739a = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        f26740b = elevationTokens.m70958getLevel3D9Ej5fM();
        f26741c = C3641Dp.m73658constructorimpl((float) 568.0d);
        f26742d = ShapeKeyTokens.CornerExtraLarge;
        f26743e = ColorSchemeKeyTokens.SurfaceTint;
        float f = (float) 360.0d;
        f26744f = C3641Dp.m73658constructorimpl(f);
        float f2 = (float) 40.0d;
        f26745g = C3641Dp.m73658constructorimpl(f2);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        f26746h = shapeKeyTokens;
        f26747i = C3641Dp.m73658constructorimpl(f2);
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        f26748j = typographyKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f26749k = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnPrimary;
        f26750l = colorSchemeKeyTokens2;
        f26751m = C3641Dp.m73658constructorimpl(f2);
        f26752n = shapeKeyTokens;
        f26753o = C3641Dp.m73658constructorimpl(f2);
        f26754p = colorSchemeKeyTokens;
        f26755q = C3641Dp.m73658constructorimpl((float) 1.0d);
        f26756r = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        f26757s = colorSchemeKeyTokens3;
        f26758t = C3641Dp.m73658constructorimpl((float) 120.0d);
        f26759u = C3641Dp.m73658constructorimpl(f);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f26760v = colorSchemeKeyTokens4;
        f26761w = TypographyKeyTokens.HeadlineLarge;
        f26762x = colorSchemeKeyTokens4;
        f26763y = TypographyKeyTokens.LabelLarge;
        f26764z = ColorSchemeKeyTokens.SecondaryContainer;
        f26719A = C3641Dp.m73658constructorimpl(f2);
        f26720B = shapeKeyTokens;
        f26721C = elevationTokens.m70955getLevel0D9Ej5fM();
        f26722D = ShapeKeyTokens.CornerNone;
        f26723E = ColorSchemeKeyTokens.OnSecondaryContainer;
        f26724F = C3641Dp.m73658constructorimpl((float) 128.0d);
        f26725G = TypographyKeyTokens.TitleLarge;
        f26726H = colorSchemeKeyTokens4;
        f26727I = TypographyKeyTokens.TitleSmall;
        f26728J = colorSchemeKeyTokens3;
        f26729K = typographyKeyTokens;
        float f3 = (float) 36.0d;
        f26730L = C3641Dp.m73658constructorimpl(f3);
        float f4 = (float) 72.0d;
        f26731M = C3641Dp.m73658constructorimpl(f4);
        f26732N = typographyKeyTokens;
        f26733O = colorSchemeKeyTokens;
        f26734P = colorSchemeKeyTokens2;
        f26735Q = C3641Dp.m73658constructorimpl(f3);
        f26736R = shapeKeyTokens;
        f26737S = C3641Dp.m73658constructorimpl(f4);
        f26738T = colorSchemeKeyTokens4;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return f26739a;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m70921getContainerElevationD9Ej5fM() {
        return f26740b;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70922getContainerHeightD9Ej5fM() {
        return f26741c;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f26742d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return f26743e;
    }

    /* renamed from: getContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m70923getContainerWidthD9Ej5fM() {
        return f26744f;
    }

    /* renamed from: getDateContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70924getDateContainerHeightD9Ej5fM() {
        return f26745g;
    }

    @NotNull
    public final ShapeKeyTokens getDateContainerShape() {
        return f26746h;
    }

    /* renamed from: getDateContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m70925getDateContainerWidthD9Ej5fM() {
        return f26747i;
    }

    @NotNull
    public final TypographyKeyTokens getDateLabelTextFont() {
        return f26748j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateSelectedContainerColor() {
        return f26749k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateSelectedLabelTextColor() {
        return f26750l;
    }

    /* renamed from: getDateStateLayerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70926getDateStateLayerHeightD9Ej5fM() {
        return f26751m;
    }

    @NotNull
    public final ShapeKeyTokens getDateStateLayerShape() {
        return f26752n;
    }

    /* renamed from: getDateStateLayerWidth-D9Ej5fM  reason: not valid java name */
    public final float m70927getDateStateLayerWidthD9Ej5fM() {
        return f26753o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateTodayContainerOutlineColor() {
        return f26754p;
    }

    /* renamed from: getDateTodayContainerOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70928getDateTodayContainerOutlineWidthD9Ej5fM() {
        return f26755q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateTodayLabelTextColor() {
        return f26756r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateUnselectedLabelTextColor() {
        return f26757s;
    }

    /* renamed from: getHeaderContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70929getHeaderContainerHeightD9Ej5fM() {
        return f26758t;
    }

    /* renamed from: getHeaderContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m70930getHeaderContainerWidthD9Ej5fM() {
        return f26759u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHeaderHeadlineColor() {
        return f26760v;
    }

    @NotNull
    public final TypographyKeyTokens getHeaderHeadlineFont() {
        return f26761w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHeaderSupportingTextColor() {
        return f26762x;
    }

    @NotNull
    public final TypographyKeyTokens getHeaderSupportingTextFont() {
        return f26763y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getRangeSelectionActiveIndicatorContainerColor() {
        return f26764z;
    }

    /* renamed from: getRangeSelectionActiveIndicatorContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70931getRangeSelectionActiveIndicatorContainerHeightD9Ej5fM() {
        return f26719A;
    }

    @NotNull
    public final ShapeKeyTokens getRangeSelectionActiveIndicatorContainerShape() {
        return f26720B;
    }

    /* renamed from: getRangeSelectionContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m70932getRangeSelectionContainerElevationD9Ej5fM() {
        return f26721C;
    }

    @NotNull
    public final ShapeKeyTokens getRangeSelectionContainerShape() {
        return f26722D;
    }

    /* renamed from: getRangeSelectionHeaderContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70933getRangeSelectionHeaderContainerHeightD9Ej5fM() {
        return f26724F;
    }

    @NotNull
    public final TypographyKeyTokens getRangeSelectionHeaderHeadlineFont() {
        return f26725G;
    }

    @NotNull
    public final ColorSchemeKeyTokens getRangeSelectionMonthSubheadColor() {
        return f26726H;
    }

    @NotNull
    public final TypographyKeyTokens getRangeSelectionMonthSubheadFont() {
        return f26727I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectionDateInRangeLabelTextColor() {
        return f26723E;
    }

    /* renamed from: getSelectionYearContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70934getSelectionYearContainerHeightD9Ej5fM() {
        return f26730L;
    }

    /* renamed from: getSelectionYearContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m70935getSelectionYearContainerWidthD9Ej5fM() {
        return f26731M;
    }

    @NotNull
    public final TypographyKeyTokens getSelectionYearLabelTextFont() {
        return f26732N;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectionYearSelectedContainerColor() {
        return f26733O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectionYearSelectedLabelTextColor() {
        return f26734P;
    }

    /* renamed from: getSelectionYearStateLayerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70936getSelectionYearStateLayerHeightD9Ej5fM() {
        return f26735Q;
    }

    @NotNull
    public final ShapeKeyTokens getSelectionYearStateLayerShape() {
        return f26736R;
    }

    /* renamed from: getSelectionYearStateLayerWidth-D9Ej5fM  reason: not valid java name */
    public final float m70937getSelectionYearStateLayerWidthD9Ej5fM() {
        return f26737S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectionYearUnselectedLabelTextColor() {
        return f26738T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getWeekdaysLabelTextColor() {
        return f26728J;
    }

    @NotNull
    public final TypographyKeyTokens getWeekdaysLabelTextFont() {
        return f26729K;
    }
}
