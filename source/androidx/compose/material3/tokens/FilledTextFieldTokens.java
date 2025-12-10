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

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b~\n\u0002\u0018\u0002\n\u0002\b'\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR \u0010\u0018\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR \u0010$\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u0014\u0010&\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\fR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0014\u0010*\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\fR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0014\u0010.\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\fR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0014\u00102\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\fR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0014\u00106\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\fR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0014\u0010:\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\fR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0014\u0010>\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\fR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010V\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010\\\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b[\u0010\bR\u0017\u0010_\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u0017\u0010b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\ba\u0010\bR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u0017\u0010h\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\u0006\u001a\u0004\bg\u0010\bR\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u0017\u0010n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\bm\u0010\bR\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u0017\u0010s\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\br\u0010\bR\u0017\u0010v\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bt\u0010\u0006\u001a\u0004\bu\u0010\bR\u0017\u0010y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bw\u0010\u0006\u001a\u0004\bx\u0010\bR \u0010|\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bz\u0010\f\u001a\u0004\b{\u0010\u000eR\u0017\u0010\u007f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b}\u0010\u0006\u001a\u0004\b~\u0010\bR\u001a\u0010\u0082\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0006\u001a\u0005\b\u0081\u0001\u0010\bR\u001a\u0010\u0085\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0005\b\u0084\u0001\u0010\bR\u001a\u0010\u0088\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0006\u001a\u0005\b\u0087\u0001\u0010\bR\u001a\u0010\u008b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0006\u001a\u0005\b\u008a\u0001\u0010\bR\u001a\u0010\u008e\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0006\u001a\u0005\b\u008d\u0001\u0010\bR#\u0010\u0091\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\f\u001a\u0005\b\u0090\u0001\u0010\u000eR\u001a\u0010\u0094\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0006\u001a\u0005\b\u0093\u0001\u0010\bR\u001a\u0010\u0097\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0005\b\u0096\u0001\u0010\bR\u001a\u0010\u009a\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u0006\u001a\u0005\b\u0099\u0001\u0010\bR\u001a\u0010\u009d\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0005\b\u009c\u0001\u0010\bR\u001a\u0010 \u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0006\u001a\u0005\b\u009f\u0001\u0010\bR\u001a\u0010£\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0006\u001a\u0005\b¢\u0001\u0010\bR\u001d\u0010©\u0001\u001a\u00030¤\u00018\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010¬\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bª\u0001\u0010\u0006\u001a\u0005\b«\u0001\u0010\bR\u001a\u0010¯\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0006\u001a\u0005\b®\u0001\u0010\bR\u001a\u0010²\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b°\u0001\u0010\u0006\u001a\u0005\b±\u0001\u0010\bR\u001a\u0010µ\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0006\u001a\u0005\b´\u0001\u0010\bR\u001d\u0010¸\u0001\u001a\u00030¤\u00018\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010¦\u0001\u001a\u0006\b·\u0001\u0010¨\u0001R\u001a\u0010»\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0006\u001a\u0005\bº\u0001\u0010\bR#\u0010¾\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¼\u0001\u0010\f\u001a\u0005\b½\u0001\u0010\u000eR\u001a\u0010Á\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0006\u001a\u0005\bÀ\u0001\u0010\bR\u001d\u0010Ä\u0001\u001a\u00030¤\u00018\u0006¢\u0006\u0010\n\u0006\bÂ\u0001\u0010¦\u0001\u001a\u0006\bÃ\u0001\u0010¨\u0001R\u001a\u0010Ç\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0006\u001a\u0005\bÆ\u0001\u0010\bR#\u0010Ê\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÈ\u0001\u0010\f\u001a\u0005\bÉ\u0001\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ë\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/FilledTextFieldTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveIndicatorColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", OperatorName.CURVE_TO, "getCaretColor", "CaretColor", "d", "getContainerColor", "ContainerColor", "e", "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", OperatorName.NON_STROKING_GRAY, "getDisabledActiveIndicatorColor", "DisabledActiveIndicatorColor", OperatorName.CLOSE_PATH, "getDisabledActiveIndicatorHeight-D9Ej5fM", "DisabledActiveIndicatorHeight", "", "DisabledActiveIndicatorOpacity", "i", "getDisabledContainerColor", "DisabledContainerColor", "DisabledContainerOpacity", OperatorName.SET_LINE_JOINSTYLE, "getDisabledInputColor", "DisabledInputColor", "DisabledInputOpacity", OperatorName.NON_STROKING_CMYK, "getDisabledLabelColor", "DisabledLabelColor", "DisabledLabelOpacity", OperatorName.LINE_TO, "getDisabledLeadingIconColor", "DisabledLeadingIconColor", "DisabledLeadingIconOpacity", OperatorName.MOVE_TO, "getDisabledSupportingColor", "DisabledSupportingColor", "DisabledSupportingOpacity", OperatorName.ENDPATH, "getDisabledTrailingIconColor", "DisabledTrailingIconColor", "DisabledTrailingIconOpacity", "o", "getErrorActiveIndicatorColor", "ErrorActiveIndicatorColor", "p", "getErrorFocusActiveIndicatorColor", "ErrorFocusActiveIndicatorColor", OperatorName.SAVE, "getErrorFocusCaretColor", "ErrorFocusCaretColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getErrorFocusInputColor", "ErrorFocusInputColor", OperatorName.CLOSE_AND_STROKE, "getErrorFocusLabelColor", "ErrorFocusLabelColor", "t", "getErrorFocusLeadingIconColor", "ErrorFocusLeadingIconColor", "u", "getErrorFocusSupportingColor", "ErrorFocusSupportingColor", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getErrorFocusTrailingIconColor", "ErrorFocusTrailingIconColor", OperatorName.SET_LINE_WIDTH, "getErrorHoverActiveIndicatorColor", "ErrorHoverActiveIndicatorColor", "x", "getErrorHoverInputColor", "ErrorHoverInputColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getErrorHoverLabelColor", "ErrorHoverLabelColor", "z", "getErrorHoverLeadingIconColor", "ErrorHoverLeadingIconColor", "A", "getErrorHoverSupportingColor", "ErrorHoverSupportingColor", "B", "getErrorHoverTrailingIconColor", "ErrorHoverTrailingIconColor", "C", "getErrorInputColor", "ErrorInputColor", "D", "getErrorLabelColor", "ErrorLabelColor", ExifInterface.LONGITUDE_EAST, "getErrorLeadingIconColor", "ErrorLeadingIconColor", "getErrorSupportingColor", "ErrorSupportingColor", OperatorName.STROKING_COLOR_GRAY, "getErrorTrailingIconColor", "ErrorTrailingIconColor", "H", "getFocusActiveIndicatorColor", "FocusActiveIndicatorColor", "I", "getFocusActiveIndicatorHeight-D9Ej5fM", "FocusActiveIndicatorHeight", OperatorName.SET_LINE_CAPSTYLE, "getFocusInputColor", "FocusInputColor", "K", "getFocusLabelColor", "FocusLabelColor", "L", "getFocusLeadingIconColor", "FocusLeadingIconColor", "M", "getFocusSupportingColor", "FocusSupportingColor", "N", "getFocusTrailingIconColor", "FocusTrailingIconColor", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getHoverActiveIndicatorColor", "HoverActiveIndicatorColor", "P", "getHoverActiveIndicatorHeight-D9Ej5fM", "HoverActiveIndicatorHeight", OperatorName.RESTORE, "getHoverInputColor", "HoverInputColor", "R", "getHoverLabelColor", "HoverLabelColor", "S", "getHoverLeadingIconColor", "HoverLeadingIconColor", "T", "getHoverSupportingColor", "HoverSupportingColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getHoverTrailingIconColor", "HoverTrailingIconColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getInputColor", "InputColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "W", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getInputFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputFont", "X", "getInputPlaceholderColor", "InputPlaceholderColor", "Y", "getInputPrefixColor", "InputPrefixColor", "Z", "getInputSuffixColor", "InputSuffixColor", "a0", "getLabelColor", "LabelColor", "b0", "getLabelFont", "LabelFont", "c0", "getLeadingIconColor", "LeadingIconColor", OperatorName.TYPE3_D0, "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "e0", "getSupportingColor", "SupportingColor", "f0", "getSupportingFont", "SupportingFont", "g0", "getTrailingIconColor", "TrailingIconColor", "h0", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFilledTextFieldTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilledTextFieldTokens.kt\nandroidx/compose/material3/tokens/FilledTextFieldTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,91:1\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n164#2:96\n164#2:97\n164#2:98\n*S KotlinDebug\n*F\n+ 1 FilledTextFieldTokens.kt\nandroidx/compose/material3/tokens/FilledTextFieldTokens\n*L\n25#1:92\n28#1:93\n31#1:94\n65#1:95\n72#1:96\n86#1:97\n90#1:98\n*E\n"})
/* loaded from: classes2.dex */
public final class FilledTextFieldTokens {

    /* renamed from: A */
    public static final ColorSchemeKeyTokens f27030A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27031B;

    /* renamed from: C */
    public static final ColorSchemeKeyTokens f27032C;

    /* renamed from: D */
    public static final ColorSchemeKeyTokens f27033D;
    public static final float DisabledActiveIndicatorOpacity = 0.38f;
    public static final float DisabledContainerOpacity = 0.04f;
    public static final float DisabledInputOpacity = 0.38f;
    public static final float DisabledLabelOpacity = 0.38f;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    public static final float DisabledSupportingOpacity = 0.38f;
    public static final float DisabledTrailingIconOpacity = 0.38f;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f27034E;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f27035F;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f27036G;

    /* renamed from: H */
    public static final ColorSchemeKeyTokens f27037H;

    /* renamed from: I */
    public static final float f27038I;
    @NotNull
    public static final FilledTextFieldTokens INSTANCE = new FilledTextFieldTokens();

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f27039J;

    /* renamed from: K */
    public static final ColorSchemeKeyTokens f27040K;

    /* renamed from: L */
    public static final ColorSchemeKeyTokens f27041L;

    /* renamed from: M */
    public static final ColorSchemeKeyTokens f27042M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f27043N;

    /* renamed from: O */
    public static final ColorSchemeKeyTokens f27044O;

    /* renamed from: P */
    public static final float f27045P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f27046Q;

    /* renamed from: R */
    public static final ColorSchemeKeyTokens f27047R;

    /* renamed from: S */
    public static final ColorSchemeKeyTokens f27048S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f27049T;

    /* renamed from: U */
    public static final ColorSchemeKeyTokens f27050U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f27051V;

    /* renamed from: W */
    public static final TypographyKeyTokens f27052W;

    /* renamed from: X */
    public static final ColorSchemeKeyTokens f27053X;

    /* renamed from: Y */
    public static final ColorSchemeKeyTokens f27054Y;

    /* renamed from: Z */
    public static final ColorSchemeKeyTokens f27055Z;

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27056a;

    /* renamed from: a0 */
    public static final ColorSchemeKeyTokens f27057a0;

    /* renamed from: b */
    public static final float f27058b;

    /* renamed from: b0 */
    public static final TypographyKeyTokens f27059b0;

    /* renamed from: c */
    public static final ColorSchemeKeyTokens f27060c;

    /* renamed from: c0 */
    public static final ColorSchemeKeyTokens f27061c0;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27062d;

    /* renamed from: d0 */
    public static final float f27063d0;

    /* renamed from: e */
    public static final float f27064e;

    /* renamed from: e0 */
    public static final ColorSchemeKeyTokens f27065e0;

    /* renamed from: f */
    public static final ShapeKeyTokens f27066f;

    /* renamed from: f0 */
    public static final TypographyKeyTokens f27067f0;

    /* renamed from: g */
    public static final ColorSchemeKeyTokens f27068g;

    /* renamed from: g0 */
    public static final ColorSchemeKeyTokens f27069g0;

    /* renamed from: h */
    public static final float f27070h;

    /* renamed from: h0 */
    public static final float f27071h0;

    /* renamed from: i */
    public static final ColorSchemeKeyTokens f27072i;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f27073j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f27074k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27075l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f27076m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f27077n;

    /* renamed from: o */
    public static final ColorSchemeKeyTokens f27078o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f27079p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f27080q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27081r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f27082s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f27083t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f27084u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f27085v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27086w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f27087x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f27088y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f27089z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27056a = colorSchemeKeyTokens;
        float f = (float) 1.0d;
        f27058b = C3641Dp.m73658constructorimpl(f);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        f27060c = colorSchemeKeyTokens2;
        f27062d = ColorSchemeKeyTokens.SurfaceVariant;
        f27064e = C3641Dp.m73658constructorimpl((float) 56.0d);
        f27066f = ShapeKeyTokens.CornerExtraSmallTop;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        f27068g = colorSchemeKeyTokens3;
        f27070h = C3641Dp.m73658constructorimpl(f);
        f27072i = colorSchemeKeyTokens3;
        f27073j = colorSchemeKeyTokens3;
        f27074k = colorSchemeKeyTokens3;
        f27075l = colorSchemeKeyTokens3;
        f27076m = colorSchemeKeyTokens3;
        f27077n = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Error;
        f27078o = colorSchemeKeyTokens4;
        f27079p = colorSchemeKeyTokens4;
        f27080q = colorSchemeKeyTokens4;
        f27081r = colorSchemeKeyTokens3;
        f27082s = colorSchemeKeyTokens4;
        f27083t = colorSchemeKeyTokens;
        f27084u = colorSchemeKeyTokens4;
        f27085v = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnErrorContainer;
        f27086w = colorSchemeKeyTokens5;
        f27087x = colorSchemeKeyTokens3;
        f27088y = colorSchemeKeyTokens5;
        f27089z = colorSchemeKeyTokens;
        f27030A = colorSchemeKeyTokens4;
        f27031B = colorSchemeKeyTokens5;
        f27032C = colorSchemeKeyTokens3;
        f27033D = colorSchemeKeyTokens4;
        f27034E = colorSchemeKeyTokens;
        f27035F = colorSchemeKeyTokens4;
        f27036G = colorSchemeKeyTokens4;
        f27037H = colorSchemeKeyTokens2;
        f27038I = C3641Dp.m73658constructorimpl((float) 2.0d);
        f27039J = colorSchemeKeyTokens3;
        f27040K = colorSchemeKeyTokens2;
        f27041L = colorSchemeKeyTokens;
        f27042M = colorSchemeKeyTokens;
        f27043N = colorSchemeKeyTokens;
        f27044O = colorSchemeKeyTokens3;
        f27045P = C3641Dp.m73658constructorimpl(f);
        f27046Q = colorSchemeKeyTokens3;
        f27047R = colorSchemeKeyTokens;
        f27048S = colorSchemeKeyTokens;
        f27049T = colorSchemeKeyTokens;
        f27050U = colorSchemeKeyTokens;
        f27051V = colorSchemeKeyTokens3;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        f27052W = typographyKeyTokens;
        f27053X = colorSchemeKeyTokens;
        f27054Y = colorSchemeKeyTokens;
        f27055Z = colorSchemeKeyTokens;
        f27057a0 = colorSchemeKeyTokens;
        f27059b0 = typographyKeyTokens;
        f27061c0 = colorSchemeKeyTokens;
        f27063d0 = C3641Dp.m73658constructorimpl((float) 20.0d);
        f27065e0 = colorSchemeKeyTokens;
        f27067f0 = TypographyKeyTokens.BodySmall;
        f27069g0 = colorSchemeKeyTokens;
        f27071h0 = C3641Dp.m73658constructorimpl((float) 24.0d);
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return f27056a;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71041getActiveIndicatorHeightD9Ej5fM() {
        return f27058b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getCaretColor() {
        return f27060c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return f27062d;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71042getContainerHeightD9Ej5fM() {
        return f27064e;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f27066f;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledActiveIndicatorColor() {
        return f27068g;
    }

    /* renamed from: getDisabledActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71043getDisabledActiveIndicatorHeightD9Ej5fM() {
        return f27070h;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return f27072i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledInputColor() {
        return f27073j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelColor() {
        return f27074k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return f27075l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSupportingColor() {
        return f27076m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return f27077n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorActiveIndicatorColor() {
        return f27078o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusActiveIndicatorColor() {
        return f27079p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusCaretColor() {
        return f27080q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusInputColor() {
        return f27081r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusLabelColor() {
        return f27082s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusLeadingIconColor() {
        return f27083t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusSupportingColor() {
        return f27084u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusTrailingIconColor() {
        return f27085v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverActiveIndicatorColor() {
        return f27086w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverInputColor() {
        return f27087x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverLabelColor() {
        return f27088y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverLeadingIconColor() {
        return f27089z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverSupportingColor() {
        return f27030A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverTrailingIconColor() {
        return f27031B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorInputColor() {
        return f27032C;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorLabelColor() {
        return f27033D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorLeadingIconColor() {
        return f27034E;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorSupportingColor() {
        return f27035F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorTrailingIconColor() {
        return f27036G;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusActiveIndicatorColor() {
        return f27037H;
    }

    /* renamed from: getFocusActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71044getFocusActiveIndicatorHeightD9Ej5fM() {
        return f27038I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusInputColor() {
        return f27039J;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLabelColor() {
        return f27040K;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLeadingIconColor() {
        return f27041L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusSupportingColor() {
        return f27042M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusTrailingIconColor() {
        return f27043N;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverActiveIndicatorColor() {
        return f27044O;
    }

    /* renamed from: getHoverActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71045getHoverActiveIndicatorHeightD9Ej5fM() {
        return f27045P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverInputColor() {
        return f27046Q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverLabelColor() {
        return f27047R;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverLeadingIconColor() {
        return f27048S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverSupportingColor() {
        return f27049T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverTrailingIconColor() {
        return f27050U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputColor() {
        return f27051V;
    }

    @NotNull
    public final TypographyKeyTokens getInputFont() {
        return f27052W;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputPlaceholderColor() {
        return f27053X;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputPrefixColor() {
        return f27054Y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputSuffixColor() {
        return f27055Z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLabelColor() {
        return f27057a0;
    }

    @NotNull
    public final TypographyKeyTokens getLabelFont() {
        return f27059b0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return f27061c0;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71046getLeadingIconSizeD9Ej5fM() {
        return f27063d0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSupportingColor() {
        return f27065e0;
    }

    @NotNull
    public final TypographyKeyTokens getSupportingFont() {
        return f27067f0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return f27069g0;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71047getTrailingIconSizeD9Ej5fM() {
        return f27071h0;
    }
}
