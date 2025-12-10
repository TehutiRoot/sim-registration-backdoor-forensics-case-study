package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0003\b\u0095\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010$\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010*\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 R \u0010-\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000eR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR \u00103\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000eR\u0017\u00106\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 R\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\f\u001a\u0004\b>\u0010\u000eR\u0017\u0010B\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b@\u0010\u001e\u001a\u0004\bA\u0010 R\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bF\u0010\u0012\u001a\u0004\bG\u0010\u0014R\u0017\u0010K\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bI\u0010\u001e\u001a\u0004\bJ\u0010 R \u0010N\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bM\u0010\u000eR \u0010Q\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\bP\u0010\u000eR\u0017\u0010T\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bR\u0010\u0012\u001a\u0004\bS\u0010\u0014R\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR \u0010Z\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010\f\u001a\u0004\bY\u0010\u000eR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u0017\u0010n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bm\u0010\bR\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u0017\u0010t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bs\u0010\bR \u0010w\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bu\u0010\f\u001a\u0004\bv\u0010\u000eR \u0010z\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bx\u0010\f\u001a\u0004\by\u0010\u000eR\u0017\u0010}\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR!\u0010\u0080\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\f\u001a\u0004\b\u007f\u0010\u000eR#\u0010\u0083\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\f\u001a\u0005\b\u0082\u0001\u0010\u000eR\u001a\u0010\u0086\u0001\u001a\u00020\u001c8\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u001e\u001a\u0005\b\u0085\u0001\u0010 R#\u0010\u0089\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\f\u001a\u0005\b\u0088\u0001\u0010\u000eR\u001a\u0010\u008c\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0012\u001a\u0005\b\u008b\u0001\u0010\u0014R\u001a\u0010\u008f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u001a\u0010\u0092\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0005\b\u0091\u0001\u0010\bR\u001a\u0010\u0095\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR\u001a\u0010\u0098\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0005\b\u0097\u0001\u0010\bR\u001a\u0010\u009b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR\u001a\u0010\u009e\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0006\u001a\u0005\b\u009d\u0001\u0010\bR\u001a\u0010¡\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0012\u001a\u0005\b \u0001\u0010\u0014R\u001a\u0010¤\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0006\u001a\u0005\b£\u0001\u0010\bR\u001a\u0010§\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0006\u001a\u0005\b¦\u0001\u0010\bR\u001a\u0010ª\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010\u0006\u001a\u0005\b©\u0001\u0010\bR\u001a\u0010\u00ad\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0006\u001a\u0005\b¬\u0001\u0010\bR\u001a\u0010°\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b®\u0001\u0010\u0006\u001a\u0005\b¯\u0001\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006±\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/TimePickerTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getClockDialColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ClockDialColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getClockDialContainerSize-D9Ej5fM", "()F", "ClockDialContainerSize", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", OperatorName.CURVE_TO, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getClockDialLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ClockDialLabelTextFont", "d", "getClockDialSelectedLabelTextColor", "ClockDialSelectedLabelTextColor", "e", "getClockDialSelectorCenterContainerColor", "ClockDialSelectorCenterContainerColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getClockDialSelectorCenterContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ClockDialSelectorCenterContainerShape", OperatorName.NON_STROKING_GRAY, "getClockDialSelectorCenterContainerSize-D9Ej5fM", "ClockDialSelectorCenterContainerSize", OperatorName.CLOSE_PATH, "getClockDialSelectorHandleContainerColor", "ClockDialSelectorHandleContainerColor", "i", "getClockDialSelectorHandleContainerShape", "ClockDialSelectorHandleContainerShape", OperatorName.SET_LINE_JOINSTYLE, "getClockDialSelectorHandleContainerSize-D9Ej5fM", "ClockDialSelectorHandleContainerSize", OperatorName.NON_STROKING_CMYK, "getClockDialSelectorTrackContainerColor", "ClockDialSelectorTrackContainerColor", OperatorName.LINE_TO, "getClockDialSelectorTrackContainerWidth-D9Ej5fM", "ClockDialSelectorTrackContainerWidth", OperatorName.MOVE_TO, "getClockDialShape", "ClockDialShape", OperatorName.ENDPATH, "getClockDialUnselectedLabelTextColor", "ClockDialUnselectedLabelTextColor", "o", "getContainerColor", "ContainerColor", "p", "getContainerElevation-D9Ej5fM", "ContainerElevation", OperatorName.SAVE, "getContainerShape", "ContainerShape", PDPageLabelRange.STYLE_ROMAN_LOWER, "getHeadlineColor", "HeadlineColor", OperatorName.CLOSE_AND_STROKE, "getHeadlineFont", "HeadlineFont", "t", "getPeriodSelectorContainerShape", "PeriodSelectorContainerShape", "u", "getPeriodSelectorHorizontalContainerHeight-D9Ej5fM", "PeriodSelectorHorizontalContainerHeight", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getPeriodSelectorHorizontalContainerWidth-D9Ej5fM", "PeriodSelectorHorizontalContainerWidth", OperatorName.SET_LINE_WIDTH, "getPeriodSelectorLabelTextFont", "PeriodSelectorLabelTextFont", "x", "getPeriodSelectorOutlineColor", "PeriodSelectorOutlineColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getPeriodSelectorOutlineWidth-D9Ej5fM", "PeriodSelectorOutlineWidth", "z", "getPeriodSelectorSelectedContainerColor", "PeriodSelectorSelectedContainerColor", "A", "getPeriodSelectorSelectedFocusLabelTextColor", "PeriodSelectorSelectedFocusLabelTextColor", "B", "getPeriodSelectorSelectedHoverLabelTextColor", "PeriodSelectorSelectedHoverLabelTextColor", "C", "getPeriodSelectorSelectedLabelTextColor", "PeriodSelectorSelectedLabelTextColor", "D", "getPeriodSelectorSelectedPressedLabelTextColor", "PeriodSelectorSelectedPressedLabelTextColor", ExifInterface.LONGITUDE_EAST, "getPeriodSelectorUnselectedFocusLabelTextColor", "PeriodSelectorUnselectedFocusLabelTextColor", "getPeriodSelectorUnselectedHoverLabelTextColor", "PeriodSelectorUnselectedHoverLabelTextColor", OperatorName.STROKING_COLOR_GRAY, "getPeriodSelectorUnselectedLabelTextColor", "PeriodSelectorUnselectedLabelTextColor", "H", "getPeriodSelectorUnselectedPressedLabelTextColor", "PeriodSelectorUnselectedPressedLabelTextColor", "I", "getPeriodSelectorVerticalContainerHeight-D9Ej5fM", "PeriodSelectorVerticalContainerHeight", OperatorName.SET_LINE_CAPSTYLE, "getPeriodSelectorVerticalContainerWidth-D9Ej5fM", "PeriodSelectorVerticalContainerWidth", "K", "getSurfaceTintLayerColor", "SurfaceTintLayerColor", "L", "getTimeSelector24HVerticalContainerWidth-D9Ej5fM", "TimeSelector24HVerticalContainerWidth", "M", "getTimeSelectorContainerHeight-D9Ej5fM", "TimeSelectorContainerHeight", "N", "getTimeSelectorContainerShape", "TimeSelectorContainerShape", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getTimeSelectorContainerWidth-D9Ej5fM", "TimeSelectorContainerWidth", "P", "getTimeSelectorLabelTextFont", "TimeSelectorLabelTextFont", OperatorName.RESTORE, "getTimeSelectorSelectedContainerColor", "TimeSelectorSelectedContainerColor", "R", "getTimeSelectorSelectedFocusLabelTextColor", "TimeSelectorSelectedFocusLabelTextColor", "S", "getTimeSelectorSelectedHoverLabelTextColor", "TimeSelectorSelectedHoverLabelTextColor", "T", "getTimeSelectorSelectedLabelTextColor", "TimeSelectorSelectedLabelTextColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getTimeSelectorSelectedPressedLabelTextColor", "TimeSelectorSelectedPressedLabelTextColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getTimeSelectorSeparatorColor", "TimeSelectorSeparatorColor", "W", "getTimeSelectorSeparatorFont", "TimeSelectorSeparatorFont", "X", "getTimeSelectorUnselectedContainerColor", "TimeSelectorUnselectedContainerColor", "Y", "getTimeSelectorUnselectedFocusLabelTextColor", "TimeSelectorUnselectedFocusLabelTextColor", "Z", "getTimeSelectorUnselectedHoverLabelTextColor", "TimeSelectorUnselectedHoverLabelTextColor", "a0", "getTimeSelectorUnselectedLabelTextColor", "TimeSelectorUnselectedLabelTextColor", "b0", "getTimeSelectorUnselectedPressedLabelTextColor", "TimeSelectorUnselectedPressedLabelTextColor", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimePickerTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePickerTokens.kt\nandroidx/compose/material3/tokens/TimePickerTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,78:1\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n164#2:86\n164#2:87\n164#2:88\n164#2:89\n164#2:90\n*S KotlinDebug\n*F\n+ 1 TimePickerTokens.kt\nandroidx/compose/material3/tokens/TimePickerTokens\n*L\n25#1:79\n30#1:80\n33#1:81\n35#1:82\n44#1:83\n45#1:84\n48#1:85\n58#1:86\n59#1:87\n61#1:88\n62#1:89\n64#1:90\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerTokens {

    /* renamed from: A */
    public static final ColorSchemeKeyTokens f27988A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27989B;

    /* renamed from: C */
    public static final ColorSchemeKeyTokens f27990C;

    /* renamed from: D */
    public static final ColorSchemeKeyTokens f27991D;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f27992E;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f27993F;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f27994G;

    /* renamed from: H */
    public static final ColorSchemeKeyTokens f27995H;

    /* renamed from: I */
    public static final float f27996I;
    @NotNull
    public static final TimePickerTokens INSTANCE = new TimePickerTokens();

    /* renamed from: J */
    public static final float f27997J;

    /* renamed from: K */
    public static final ColorSchemeKeyTokens f27998K;

    /* renamed from: L */
    public static final float f27999L;

    /* renamed from: M */
    public static final float f28000M;

    /* renamed from: N */
    public static final ShapeKeyTokens f28001N;

    /* renamed from: O */
    public static final float f28002O;

    /* renamed from: P */
    public static final TypographyKeyTokens f28003P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f28004Q;

    /* renamed from: R */
    public static final ColorSchemeKeyTokens f28005R;

    /* renamed from: S */
    public static final ColorSchemeKeyTokens f28006S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f28007T;

    /* renamed from: U */
    public static final ColorSchemeKeyTokens f28008U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f28009V;

    /* renamed from: W */
    public static final TypographyKeyTokens f28010W;

    /* renamed from: X */
    public static final ColorSchemeKeyTokens f28011X;

    /* renamed from: Y */
    public static final ColorSchemeKeyTokens f28012Y;

    /* renamed from: Z */
    public static final ColorSchemeKeyTokens f28013Z;

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f28014a;

    /* renamed from: a0 */
    public static final ColorSchemeKeyTokens f28015a0;

    /* renamed from: b */
    public static final float f28016b;

    /* renamed from: b0 */
    public static final ColorSchemeKeyTokens f28017b0;

    /* renamed from: c */
    public static final TypographyKeyTokens f28018c;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f28019d;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f28020e;

    /* renamed from: f */
    public static final ShapeKeyTokens f28021f;

    /* renamed from: g */
    public static final float f28022g;

    /* renamed from: h */
    public static final ColorSchemeKeyTokens f28023h;

    /* renamed from: i */
    public static final ShapeKeyTokens f28024i;

    /* renamed from: j */
    public static final float f28025j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f28026k;

    /* renamed from: l */
    public static final float f28027l;

    /* renamed from: m */
    public static final ShapeKeyTokens f28028m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f28029n;

    /* renamed from: o */
    public static final ColorSchemeKeyTokens f28030o;

    /* renamed from: p */
    public static final float f28031p;

    /* renamed from: q */
    public static final ShapeKeyTokens f28032q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f28033r;

    /* renamed from: s */
    public static final TypographyKeyTokens f28034s;

    /* renamed from: t */
    public static final ShapeKeyTokens f28035t;

    /* renamed from: u */
    public static final float f28036u;

    /* renamed from: v */
    public static final float f28037v;

    /* renamed from: w */
    public static final TypographyKeyTokens f28038w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f28039x;

    /* renamed from: y */
    public static final float f28040y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f28041z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        f28014a = colorSchemeKeyTokens;
        f28016b = C3641Dp.m73658constructorimpl((float) 256.0d);
        f28018c = TypographyKeyTokens.BodyLarge;
        f28019d = ColorSchemeKeyTokens.OnPrimary;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        f28020e = colorSchemeKeyTokens2;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        f28021f = shapeKeyTokens;
        f28022g = C3641Dp.m73658constructorimpl((float) 8.0d);
        f28023h = colorSchemeKeyTokens2;
        f28024i = shapeKeyTokens;
        f28025j = C3641Dp.m73658constructorimpl((float) 48.0d);
        f28026k = colorSchemeKeyTokens2;
        f28027l = C3641Dp.m73658constructorimpl((float) 2.0d);
        f28028m = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        f28029n = colorSchemeKeyTokens3;
        f28030o = ColorSchemeKeyTokens.Surface;
        f28031p = ElevationTokens.INSTANCE.m70958getLevel3D9Ej5fM();
        f28032q = ShapeKeyTokens.CornerExtraLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f28033r = colorSchemeKeyTokens4;
        f28034s = TypographyKeyTokens.LabelMedium;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerSmall;
        f28035t = shapeKeyTokens2;
        f28036u = C3641Dp.m73658constructorimpl((float) 38.0d);
        f28037v = C3641Dp.m73658constructorimpl((float) 216.0d);
        f28038w = TypographyKeyTokens.TitleMedium;
        f28039x = ColorSchemeKeyTokens.Outline;
        f28040y = C3641Dp.m73658constructorimpl((float) 1.0d);
        f28041z = ColorSchemeKeyTokens.TertiaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnTertiaryContainer;
        f27988A = colorSchemeKeyTokens5;
        f27989B = colorSchemeKeyTokens5;
        f27990C = colorSchemeKeyTokens5;
        f27991D = colorSchemeKeyTokens5;
        f27992E = colorSchemeKeyTokens4;
        f27993F = colorSchemeKeyTokens4;
        f27994G = colorSchemeKeyTokens4;
        f27995H = colorSchemeKeyTokens4;
        float f = (float) 80.0d;
        f27996I = C3641Dp.m73658constructorimpl(f);
        f27997J = C3641Dp.m73658constructorimpl((float) 52.0d);
        f27998K = ColorSchemeKeyTokens.SurfaceTint;
        f27999L = C3641Dp.m73658constructorimpl((float) 114.0d);
        f28000M = C3641Dp.m73658constructorimpl(f);
        f28001N = shapeKeyTokens2;
        f28002O = C3641Dp.m73658constructorimpl((float) 96.0d);
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.DisplayLarge;
        f28003P = typographyKeyTokens;
        f28004Q = ColorSchemeKeyTokens.PrimaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnPrimaryContainer;
        f28005R = colorSchemeKeyTokens6;
        f28006S = colorSchemeKeyTokens6;
        f28007T = colorSchemeKeyTokens6;
        f28008U = colorSchemeKeyTokens6;
        f28009V = colorSchemeKeyTokens3;
        f28010W = typographyKeyTokens;
        f28011X = colorSchemeKeyTokens;
        f28012Y = colorSchemeKeyTokens3;
        f28013Z = colorSchemeKeyTokens3;
        f28015a0 = colorSchemeKeyTokens3;
        f28017b0 = colorSchemeKeyTokens3;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialColor() {
        return f28014a;
    }

    /* renamed from: getClockDialContainerSize-D9Ej5fM  reason: not valid java name */
    public final float m71300getClockDialContainerSizeD9Ej5fM() {
        return f28016b;
    }

    @NotNull
    public final TypographyKeyTokens getClockDialLabelTextFont() {
        return f28018c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialSelectedLabelTextColor() {
        return f28019d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialSelectorCenterContainerColor() {
        return f28020e;
    }

    @NotNull
    public final ShapeKeyTokens getClockDialSelectorCenterContainerShape() {
        return f28021f;
    }

    /* renamed from: getClockDialSelectorCenterContainerSize-D9Ej5fM  reason: not valid java name */
    public final float m71301getClockDialSelectorCenterContainerSizeD9Ej5fM() {
        return f28022g;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialSelectorHandleContainerColor() {
        return f28023h;
    }

    @NotNull
    public final ShapeKeyTokens getClockDialSelectorHandleContainerShape() {
        return f28024i;
    }

    /* renamed from: getClockDialSelectorHandleContainerSize-D9Ej5fM  reason: not valid java name */
    public final float m71302getClockDialSelectorHandleContainerSizeD9Ej5fM() {
        return f28025j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialSelectorTrackContainerColor() {
        return f28026k;
    }

    /* renamed from: getClockDialSelectorTrackContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m71303getClockDialSelectorTrackContainerWidthD9Ej5fM() {
        return f28027l;
    }

    @NotNull
    public final ShapeKeyTokens getClockDialShape() {
        return f28028m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialUnselectedLabelTextColor() {
        return f28029n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return f28030o;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71304getContainerElevationD9Ej5fM() {
        return f28031p;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f28032q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHeadlineColor() {
        return f28033r;
    }

    @NotNull
    public final TypographyKeyTokens getHeadlineFont() {
        return f28034s;
    }

    @NotNull
    public final ShapeKeyTokens getPeriodSelectorContainerShape() {
        return f28035t;
    }

    /* renamed from: getPeriodSelectorHorizontalContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71305getPeriodSelectorHorizontalContainerHeightD9Ej5fM() {
        return f28036u;
    }

    /* renamed from: getPeriodSelectorHorizontalContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m71306getPeriodSelectorHorizontalContainerWidthD9Ej5fM() {
        return f28037v;
    }

    @NotNull
    public final TypographyKeyTokens getPeriodSelectorLabelTextFont() {
        return f28038w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorOutlineColor() {
        return f28039x;
    }

    /* renamed from: getPeriodSelectorOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71307getPeriodSelectorOutlineWidthD9Ej5fM() {
        return f28040y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedContainerColor() {
        return f28041z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedFocusLabelTextColor() {
        return f27988A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedHoverLabelTextColor() {
        return f27989B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedLabelTextColor() {
        return f27990C;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedPressedLabelTextColor() {
        return f27991D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedFocusLabelTextColor() {
        return f27992E;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedHoverLabelTextColor() {
        return f27993F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedLabelTextColor() {
        return f27994G;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedPressedLabelTextColor() {
        return f27995H;
    }

    /* renamed from: getPeriodSelectorVerticalContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71308getPeriodSelectorVerticalContainerHeightD9Ej5fM() {
        return f27996I;
    }

    /* renamed from: getPeriodSelectorVerticalContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m71309getPeriodSelectorVerticalContainerWidthD9Ej5fM() {
        return f27997J;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSurfaceTintLayerColor() {
        return f27998K;
    }

    /* renamed from: getTimeSelector24HVerticalContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m71310getTimeSelector24HVerticalContainerWidthD9Ej5fM() {
        return f27999L;
    }

    /* renamed from: getTimeSelectorContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71311getTimeSelectorContainerHeightD9Ej5fM() {
        return f28000M;
    }

    @NotNull
    public final ShapeKeyTokens getTimeSelectorContainerShape() {
        return f28001N;
    }

    /* renamed from: getTimeSelectorContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m71312getTimeSelectorContainerWidthD9Ej5fM() {
        return f28002O;
    }

    @NotNull
    public final TypographyKeyTokens getTimeSelectorLabelTextFont() {
        return f28003P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedContainerColor() {
        return f28004Q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedFocusLabelTextColor() {
        return f28005R;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedHoverLabelTextColor() {
        return f28006S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedLabelTextColor() {
        return f28007T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedPressedLabelTextColor() {
        return f28008U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSeparatorColor() {
        return f28009V;
    }

    @NotNull
    public final TypographyKeyTokens getTimeSelectorSeparatorFont() {
        return f28010W;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedContainerColor() {
        return f28011X;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedFocusLabelTextColor() {
        return f28012Y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedHoverLabelTextColor() {
        return f28013Z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedLabelTextColor() {
        return f28015a0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedPressedLabelTextColor() {
        return f28017b0;
    }
}
