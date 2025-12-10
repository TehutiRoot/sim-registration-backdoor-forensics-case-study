package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b&\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR \u0010 \u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000eR\u0014\u0010!\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\fR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0014\u0010%\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\fR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR \u0010.\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b-\u0010\u000eR \u00101\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b0\u0010\u000eR\u0017\u00104\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u0010\u0012\u001a\u0004\b3\u0010\u0014R \u00107\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\f\u001a\u0004\b6\u0010\u000eR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR \u0010@\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b?\u0010\u000eR\u0017\u0010C\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bA\u0010\u0012\u001a\u0004\bB\u0010\u0014R\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR \u0010I\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010\u000eR \u0010L\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\f\u001a\u0004\bK\u0010\u000eR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010U\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\bW\u0010\bR \u0010[\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bY\u0010\f\u001a\u0004\bZ\u0010\u000eR \u0010^\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\f\u001a\u0004\b]\u0010\u000eR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR \u0010d\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010\f\u001a\u0004\bc\u0010\u000eR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u0014\u0010h\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\bh\u0010\fR\u0017\u0010k\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bi\u0010\u0012\u001a\u0004\bj\u0010\u0014R \u0010n\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bl\u0010\f\u001a\u0004\bm\u0010\u000eR\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u0014\u0010r\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\br\u0010\fR\u0017\u0010t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bs\u0010\bR\u0014\u0010u\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\bu\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006v"}, m28850d2 = {"Landroidx/compose/material3/tokens/SliderTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveTrackColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveTrackColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getActiveTrackHeight-D9Ej5fM", "()F", "ActiveTrackHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CURVE_TO, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveTrackShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveTrackShape", "d", "getDisabledActiveTrackColor", "DisabledActiveTrackColor", "", "DisabledActiveTrackOpacity", "e", "getDisabledHandleColor", "DisabledHandleColor", OperatorName.FILL_NON_ZERO, "getDisabledHandleElevation-D9Ej5fM", "DisabledHandleElevation", "DisabledHandleOpacity", OperatorName.NON_STROKING_GRAY, "getDisabledInactiveTrackColor", "DisabledInactiveTrackColor", "DisabledInactiveTrackOpacity", OperatorName.CLOSE_PATH, "getFocusHandleColor", "FocusHandleColor", "i", "getHandleColor", "HandleColor", OperatorName.SET_LINE_JOINSTYLE, "getHandleElevation-D9Ej5fM", "HandleElevation", OperatorName.NON_STROKING_CMYK, "getHandleHeight-D9Ej5fM", "HandleHeight", OperatorName.LINE_TO, "getHandleShape", "HandleShape", OperatorName.MOVE_TO, "getHandleWidth-D9Ej5fM", "HandleWidth", OperatorName.ENDPATH, "getHoverHandleColor", "HoverHandleColor", "o", "getInactiveTrackColor", "InactiveTrackColor", "p", "getInactiveTrackHeight-D9Ej5fM", "InactiveTrackHeight", OperatorName.SAVE, "getInactiveTrackShape", "InactiveTrackShape", PDPageLabelRange.STYLE_ROMAN_LOWER, "getLabelContainerColor", "LabelContainerColor", OperatorName.CLOSE_AND_STROKE, "getLabelContainerElevation-D9Ej5fM", "LabelContainerElevation", "t", "getLabelContainerHeight-D9Ej5fM", "LabelContainerHeight", "u", "getLabelTextColor", "LabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", OperatorName.SET_LINE_WIDTH, "getPressedHandleColor", "PressedHandleColor", "x", "getStateLayerSize-D9Ej5fM", "StateLayerSize", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getTrackElevation-D9Ej5fM", "TrackElevation", "z", "getOverlapHandleOutlineColor", "OverlapHandleOutlineColor", "A", "getOverlapHandleOutlineWidth-D9Ej5fM", "OverlapHandleOutlineWidth", "B", "getTickMarksActiveContainerColor", "TickMarksActiveContainerColor", "TickMarksActiveContainerOpacity", "C", "getTickMarksContainerShape", "TickMarksContainerShape", "D", "getTickMarksContainerSize-D9Ej5fM", "TickMarksContainerSize", ExifInterface.LONGITUDE_EAST, "getTickMarksDisabledContainerColor", "TickMarksDisabledContainerColor", "TickMarksDisabledContainerOpacity", "getTickMarksInactiveContainerColor", "TickMarksInactiveContainerColor", "TickMarksInactiveContainerOpacity", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSliderTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SliderTokens.kt\nandroidx/compose/material3/tokens/SliderTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,62:1\n164#2:63\n164#2:64\n164#2:65\n164#2:66\n164#2:67\n164#2:68\n164#2:69\n164#2:70\n*S KotlinDebug\n*F\n+ 1 SliderTokens.kt\nandroidx/compose/material3/tokens/SliderTokens\n*L\n25#1:63\n37#1:64\n39#1:65\n42#1:66\n46#1:67\n50#1:68\n53#1:69\n57#1:70\n*E\n"})
/* loaded from: classes2.dex */
public final class SliderTokens {

    /* renamed from: A */
    public static final float f27807A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27808B;

    /* renamed from: C */
    public static final ShapeKeyTokens f27809C;

    /* renamed from: D */
    public static final float f27810D;
    public static final float DisabledActiveTrackOpacity = 0.38f;
    public static final float DisabledHandleOpacity = 0.38f;
    public static final float DisabledInactiveTrackOpacity = 0.12f;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f27811E;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f27812F;
    @NotNull
    public static final SliderTokens INSTANCE = new SliderTokens();
    public static final float TickMarksActiveContainerOpacity = 0.38f;
    public static final float TickMarksDisabledContainerOpacity = 0.38f;
    public static final float TickMarksInactiveContainerOpacity = 0.38f;

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27813a;

    /* renamed from: b */
    public static final float f27814b;

    /* renamed from: c */
    public static final ShapeKeyTokens f27815c;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27816d;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f27817e;

    /* renamed from: f */
    public static final float f27818f;

    /* renamed from: g */
    public static final ColorSchemeKeyTokens f27819g;

    /* renamed from: h */
    public static final ColorSchemeKeyTokens f27820h;

    /* renamed from: i */
    public static final ColorSchemeKeyTokens f27821i;

    /* renamed from: j */
    public static final float f27822j;

    /* renamed from: k */
    public static final float f27823k;

    /* renamed from: l */
    public static final ShapeKeyTokens f27824l;

    /* renamed from: m */
    public static final float f27825m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f27826n;

    /* renamed from: o */
    public static final ColorSchemeKeyTokens f27827o;

    /* renamed from: p */
    public static final float f27828p;

    /* renamed from: q */
    public static final ShapeKeyTokens f27829q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27830r;

    /* renamed from: s */
    public static final float f27831s;

    /* renamed from: t */
    public static final float f27832t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f27833u;

    /* renamed from: v */
    public static final TypographyKeyTokens f27834v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27835w;

    /* renamed from: x */
    public static final float f27836x;

    /* renamed from: y */
    public static final float f27837y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f27838z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f27813a = colorSchemeKeyTokens;
        float f = (float) 4.0d;
        f27814b = C3641Dp.m73658constructorimpl(f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        f27815c = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f27816d = colorSchemeKeyTokens2;
        f27817e = colorSchemeKeyTokens2;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        f27818f = elevationTokens.m70955getLevel0D9Ej5fM();
        f27819g = colorSchemeKeyTokens2;
        f27820h = colorSchemeKeyTokens;
        f27821i = colorSchemeKeyTokens;
        f27822j = elevationTokens.m70956getLevel1D9Ej5fM();
        float f2 = (float) 20.0d;
        f27823k = C3641Dp.m73658constructorimpl(f2);
        f27824l = shapeKeyTokens;
        f27825m = C3641Dp.m73658constructorimpl(f2);
        f27826n = colorSchemeKeyTokens;
        f27827o = ColorSchemeKeyTokens.SurfaceVariant;
        f27828p = C3641Dp.m73658constructorimpl(f);
        f27829q = shapeKeyTokens;
        f27830r = colorSchemeKeyTokens;
        f27831s = elevationTokens.m70955getLevel0D9Ej5fM();
        f27832t = C3641Dp.m73658constructorimpl((float) 28.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        f27833u = colorSchemeKeyTokens3;
        f27834v = TypographyKeyTokens.LabelMedium;
        f27835w = colorSchemeKeyTokens;
        f27836x = C3641Dp.m73658constructorimpl((float) 40.0d);
        f27837y = elevationTokens.m70955getLevel0D9Ej5fM();
        f27838z = colorSchemeKeyTokens3;
        f27807A = C3641Dp.m73658constructorimpl((float) 1.0d);
        f27808B = colorSchemeKeyTokens3;
        f27809C = shapeKeyTokens;
        f27810D = C3641Dp.m73658constructorimpl((float) 2.0d);
        f27811E = colorSchemeKeyTokens2;
        f27812F = ColorSchemeKeyTokens.OnSurfaceVariant;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveTrackColor() {
        return f27813a;
    }

    /* renamed from: getActiveTrackHeight-D9Ej5fM  reason: not valid java name */
    public final float m71251getActiveTrackHeightD9Ej5fM() {
        return f27814b;
    }

    @NotNull
    public final ShapeKeyTokens getActiveTrackShape() {
        return f27815c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledActiveTrackColor() {
        return f27816d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledHandleColor() {
        return f27817e;
    }

    /* renamed from: getDisabledHandleElevation-D9Ej5fM  reason: not valid java name */
    public final float m71252getDisabledHandleElevationD9Ej5fM() {
        return f27818f;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledInactiveTrackColor() {
        return f27819g;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusHandleColor() {
        return f27820h;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHandleColor() {
        return f27821i;
    }

    /* renamed from: getHandleElevation-D9Ej5fM  reason: not valid java name */
    public final float m71253getHandleElevationD9Ej5fM() {
        return f27822j;
    }

    /* renamed from: getHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m71254getHandleHeightD9Ej5fM() {
        return f27823k;
    }

    @NotNull
    public final ShapeKeyTokens getHandleShape() {
        return f27824l;
    }

    /* renamed from: getHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m71255getHandleWidthD9Ej5fM() {
        return f27825m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverHandleColor() {
        return f27826n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveTrackColor() {
        return f27827o;
    }

    /* renamed from: getInactiveTrackHeight-D9Ej5fM  reason: not valid java name */
    public final float m71256getInactiveTrackHeightD9Ej5fM() {
        return f27828p;
    }

    @NotNull
    public final ShapeKeyTokens getInactiveTrackShape() {
        return f27829q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLabelContainerColor() {
        return f27830r;
    }

    /* renamed from: getLabelContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71257getLabelContainerElevationD9Ej5fM() {
        return f27831s;
    }

    /* renamed from: getLabelContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71258getLabelContainerHeightD9Ej5fM() {
        return f27832t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLabelTextColor() {
        return f27833u;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return f27834v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getOverlapHandleOutlineColor() {
        return f27838z;
    }

    /* renamed from: getOverlapHandleOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71259getOverlapHandleOutlineWidthD9Ej5fM() {
        return f27807A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPressedHandleColor() {
        return f27835w;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM  reason: not valid java name */
    public final float m71260getStateLayerSizeD9Ej5fM() {
        return f27836x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTickMarksActiveContainerColor() {
        return f27808B;
    }

    @NotNull
    public final ShapeKeyTokens getTickMarksContainerShape() {
        return f27809C;
    }

    /* renamed from: getTickMarksContainerSize-D9Ej5fM  reason: not valid java name */
    public final float m71261getTickMarksContainerSizeD9Ej5fM() {
        return f27810D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTickMarksDisabledContainerColor() {
        return f27811E;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTickMarksInactiveContainerColor() {
        return f27812F;
    }

    /* renamed from: getTrackElevation-D9Ej5fM  reason: not valid java name */
    public final float m71262getTrackElevationD9Ej5fM() {
        return f27837y;
    }
}
