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

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b}\n\u0002\u0018\u0002\n\u0002\b-\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0014\u0010\u001e\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0014\u0010\"\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\fR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0014\u0010&\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\fR \u0010)\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010\u000eR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u0014\u0010-\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\fR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0014\u00101\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\fR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010@\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010L\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\bK\u0010\bR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010R\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\bW\u0010\bR\u0017\u0010[\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0017\u0010^\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b]\u0010\bR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u0017\u0010d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\u0006\u001a\u0004\bc\u0010\bR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u0017\u0010j\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\u0006\u001a\u0004\bi\u0010\bR\u0017\u0010m\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u0017\u0010p\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bn\u0010\u0006\u001a\u0004\bo\u0010\bR\u0017\u0010r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bq\u0010\bR\u0017\u0010u\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\bR \u0010x\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bv\u0010\f\u001a\u0004\bw\u0010\u000eR\u0017\u0010{\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bz\u0010\bR\u0017\u0010~\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b|\u0010\u0006\u001a\u0004\b}\u0010\bR\u0019\u0010\u0081\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR\u001a\u0010\u0084\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0006\u001a\u0005\b\u0083\u0001\u0010\bR\u001a\u0010\u0087\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR\u001a\u0010\u008a\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0006\u001a\u0005\b\u0089\u0001\u0010\bR#\u0010\u008d\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\f\u001a\u0005\b\u008c\u0001\u0010\u000eR\u001a\u0010\u0090\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0006\u001a\u0005\b\u008f\u0001\u0010\bR\u001a\u0010\u0093\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0005\b\u0092\u0001\u0010\bR\u001a\u0010\u0096\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0006\u001a\u0005\b\u0095\u0001\u0010\bR\u001d\u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0006¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010\u009f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0005\b\u009e\u0001\u0010\bR\u001a\u0010¢\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010\u0006\u001a\u0005\b¡\u0001\u0010\bR\u001a\u0010¥\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0006\u001a\u0005\b¤\u0001\u0010\bR\u001a\u0010¨\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0006\u001a\u0005\b§\u0001\u0010\bR\u001d\u0010«\u0001\u001a\u00030\u0097\u00018\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010\u0099\u0001\u001a\u0006\bª\u0001\u0010\u009b\u0001R\u001a\u0010®\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¬\u0001\u0010\u0006\u001a\u0005\b\u00ad\u0001\u0010\bR#\u0010±\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¯\u0001\u0010\f\u001a\u0005\b°\u0001\u0010\u000eR\u001a\u0010´\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010\u0006\u001a\u0005\b³\u0001\u0010\bR#\u0010·\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bµ\u0001\u0010\f\u001a\u0005\b¶\u0001\u0010\u000eR\u001a\u0010º\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¸\u0001\u0010\u0006\u001a\u0005\b¹\u0001\u0010\bR\u001d\u0010½\u0001\u001a\u00030\u0097\u00018\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010\u0099\u0001\u001a\u0006\b¼\u0001\u0010\u009b\u0001R\u001a\u0010À\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¾\u0001\u0010\u0006\u001a\u0005\b¿\u0001\u0010\bR#\u0010Ã\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\f\u001a\u0005\bÂ\u0001\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ä\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/OutlinedTextFieldTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getCaretColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "CaretColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CURVE_TO, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "d", "getDisabledInputColor", "DisabledInputColor", "", "DisabledInputOpacity", "e", "getDisabledLabelColor", "DisabledLabelColor", "DisabledLabelOpacity", OperatorName.FILL_NON_ZERO, "getDisabledLeadingIconColor", "DisabledLeadingIconColor", "DisabledLeadingIconOpacity", OperatorName.NON_STROKING_GRAY, "getDisabledOutlineColor", "DisabledOutlineColor", "DisabledOutlineOpacity", OperatorName.CLOSE_PATH, "getDisabledOutlineWidth-D9Ej5fM", "DisabledOutlineWidth", "i", "getDisabledSupportingColor", "DisabledSupportingColor", "DisabledSupportingOpacity", OperatorName.SET_LINE_JOINSTYLE, "getDisabledTrailingIconColor", "DisabledTrailingIconColor", "DisabledTrailingIconOpacity", OperatorName.NON_STROKING_CMYK, "getErrorFocusCaretColor", "ErrorFocusCaretColor", OperatorName.LINE_TO, "getErrorFocusInputColor", "ErrorFocusInputColor", OperatorName.MOVE_TO, "getErrorFocusLabelColor", "ErrorFocusLabelColor", OperatorName.ENDPATH, "getErrorFocusLeadingIconColor", "ErrorFocusLeadingIconColor", "o", "getErrorFocusOutlineColor", "ErrorFocusOutlineColor", "p", "getErrorFocusSupportingColor", "ErrorFocusSupportingColor", OperatorName.SAVE, "getErrorFocusTrailingIconColor", "ErrorFocusTrailingIconColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getErrorHoverInputColor", "ErrorHoverInputColor", OperatorName.CLOSE_AND_STROKE, "getErrorHoverLabelColor", "ErrorHoverLabelColor", "t", "getErrorHoverLeadingIconColor", "ErrorHoverLeadingIconColor", "u", "getErrorHoverOutlineColor", "ErrorHoverOutlineColor", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getErrorHoverSupportingColor", "ErrorHoverSupportingColor", OperatorName.SET_LINE_WIDTH, "getErrorHoverTrailingIconColor", "ErrorHoverTrailingIconColor", "x", "getErrorInputColor", "ErrorInputColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getErrorLabelColor", "ErrorLabelColor", "z", "getErrorLeadingIconColor", "ErrorLeadingIconColor", "A", "getErrorOutlineColor", "ErrorOutlineColor", "B", "getErrorSupportingColor", "ErrorSupportingColor", "C", "getErrorTrailingIconColor", "ErrorTrailingIconColor", "D", "getFocusInputColor", "FocusInputColor", ExifInterface.LONGITUDE_EAST, "getFocusLabelColor", "FocusLabelColor", "getFocusLeadingIconColor", "FocusLeadingIconColor", OperatorName.STROKING_COLOR_GRAY, "getFocusOutlineColor", "FocusOutlineColor", "H", "getFocusOutlineWidth-D9Ej5fM", "FocusOutlineWidth", "I", "getFocusSupportingColor", "FocusSupportingColor", OperatorName.SET_LINE_CAPSTYLE, "getFocusTrailingIconColor", "FocusTrailingIconColor", "K", "getHoverInputColor", "HoverInputColor", "L", "getHoverLabelColor", "HoverLabelColor", "M", "getHoverLeadingIconColor", "HoverLeadingIconColor", "N", "getHoverOutlineColor", "HoverOutlineColor", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getHoverOutlineWidth-D9Ej5fM", "HoverOutlineWidth", "P", "getHoverSupportingColor", "HoverSupportingColor", OperatorName.RESTORE, "getHoverTrailingIconColor", "HoverTrailingIconColor", "R", "getInputColor", "InputColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "S", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getInputFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputFont", "T", "getInputPlaceholderColor", "InputPlaceholderColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getInputPrefixColor", "InputPrefixColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getInputSuffixColor", "InputSuffixColor", "W", "getLabelColor", "LabelColor", "X", "getLabelFont", "LabelFont", "Y", "getLeadingIconColor", "LeadingIconColor", "Z", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "a0", "getOutlineColor", "OutlineColor", "b0", "getOutlineWidth-D9Ej5fM", "OutlineWidth", "c0", "getSupportingColor", "SupportingColor", OperatorName.TYPE3_D0, "getSupportingFont", "SupportingFont", "e0", "getTrailingIconColor", "TrailingIconColor", "f0", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlinedTextFieldTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextFieldTokens.kt\nandroidx/compose/material3/tokens/OutlinedTextFieldTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,89:1\n164#2:90\n164#2:91\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n164#2:96\n*S KotlinDebug\n*F\n+ 1 OutlinedTextFieldTokens.kt\nandroidx/compose/material3/tokens/OutlinedTextFieldTokens\n*L\n25#1:90\n35#1:91\n63#1:92\n70#1:93\n81#1:94\n83#1:95\n87#1:96\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlinedTextFieldTokens {

    /* renamed from: A */
    public static final ColorSchemeKeyTokens f27562A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27563B;

    /* renamed from: C */
    public static final ColorSchemeKeyTokens f27564C;

    /* renamed from: D */
    public static final ColorSchemeKeyTokens f27565D;
    public static final float DisabledInputOpacity = 0.38f;
    public static final float DisabledLabelOpacity = 0.38f;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    public static final float DisabledOutlineOpacity = 0.12f;
    public static final float DisabledSupportingOpacity = 0.38f;
    public static final float DisabledTrailingIconOpacity = 0.38f;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f27566E;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f27567F;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f27568G;

    /* renamed from: H */
    public static final float f27569H;

    /* renamed from: I */
    public static final ColorSchemeKeyTokens f27570I;
    @NotNull
    public static final OutlinedTextFieldTokens INSTANCE = new OutlinedTextFieldTokens();

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f27571J;

    /* renamed from: K */
    public static final ColorSchemeKeyTokens f27572K;

    /* renamed from: L */
    public static final ColorSchemeKeyTokens f27573L;

    /* renamed from: M */
    public static final ColorSchemeKeyTokens f27574M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f27575N;

    /* renamed from: O */
    public static final float f27576O;

    /* renamed from: P */
    public static final ColorSchemeKeyTokens f27577P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f27578Q;

    /* renamed from: R */
    public static final ColorSchemeKeyTokens f27579R;

    /* renamed from: S */
    public static final TypographyKeyTokens f27580S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f27581T;

    /* renamed from: U */
    public static final ColorSchemeKeyTokens f27582U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f27583V;

    /* renamed from: W */
    public static final ColorSchemeKeyTokens f27584W;

    /* renamed from: X */
    public static final TypographyKeyTokens f27585X;

    /* renamed from: Y */
    public static final ColorSchemeKeyTokens f27586Y;

    /* renamed from: Z */
    public static final float f27587Z;

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27588a;

    /* renamed from: a0 */
    public static final ColorSchemeKeyTokens f27589a0;

    /* renamed from: b */
    public static final float f27590b;

    /* renamed from: b0 */
    public static final float f27591b0;

    /* renamed from: c */
    public static final ShapeKeyTokens f27592c;

    /* renamed from: c0 */
    public static final ColorSchemeKeyTokens f27593c0;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27594d;

    /* renamed from: d0 */
    public static final TypographyKeyTokens f27595d0;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f27596e;

    /* renamed from: e0 */
    public static final ColorSchemeKeyTokens f27597e0;

    /* renamed from: f */
    public static final ColorSchemeKeyTokens f27598f;

    /* renamed from: f0 */
    public static final float f27599f0;

    /* renamed from: g */
    public static final ColorSchemeKeyTokens f27600g;

    /* renamed from: h */
    public static final float f27601h;

    /* renamed from: i */
    public static final ColorSchemeKeyTokens f27602i;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f27603j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f27604k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27605l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f27606m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f27607n;

    /* renamed from: o */
    public static final ColorSchemeKeyTokens f27608o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f27609p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f27610q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27611r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f27612s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f27613t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f27614u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f27615v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27616w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f27617x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f27618y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f27619z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f27588a = colorSchemeKeyTokens;
        f27590b = C3641Dp.m73658constructorimpl((float) 56.0d);
        f27592c = ShapeKeyTokens.CornerExtraSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f27594d = colorSchemeKeyTokens2;
        f27596e = colorSchemeKeyTokens2;
        f27598f = colorSchemeKeyTokens2;
        f27600g = colorSchemeKeyTokens2;
        float f = (float) 1.0d;
        f27601h = C3641Dp.m73658constructorimpl(f);
        f27602i = colorSchemeKeyTokens2;
        f27603j = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        f27604k = colorSchemeKeyTokens3;
        f27605l = colorSchemeKeyTokens2;
        f27606m = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27607n = colorSchemeKeyTokens4;
        f27608o = colorSchemeKeyTokens3;
        f27609p = colorSchemeKeyTokens3;
        f27610q = colorSchemeKeyTokens3;
        f27611r = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnErrorContainer;
        f27612s = colorSchemeKeyTokens5;
        f27613t = colorSchemeKeyTokens4;
        f27614u = colorSchemeKeyTokens5;
        f27615v = colorSchemeKeyTokens3;
        f27616w = colorSchemeKeyTokens5;
        f27617x = colorSchemeKeyTokens2;
        f27618y = colorSchemeKeyTokens3;
        f27619z = colorSchemeKeyTokens4;
        f27562A = colorSchemeKeyTokens3;
        f27563B = colorSchemeKeyTokens3;
        f27564C = colorSchemeKeyTokens3;
        f27565D = colorSchemeKeyTokens2;
        f27566E = colorSchemeKeyTokens;
        f27567F = colorSchemeKeyTokens4;
        f27568G = colorSchemeKeyTokens;
        f27569H = C3641Dp.m73658constructorimpl((float) 2.0d);
        f27570I = colorSchemeKeyTokens4;
        f27571J = colorSchemeKeyTokens4;
        f27572K = colorSchemeKeyTokens2;
        f27573L = colorSchemeKeyTokens2;
        f27574M = colorSchemeKeyTokens4;
        f27575N = colorSchemeKeyTokens2;
        f27576O = C3641Dp.m73658constructorimpl(f);
        f27577P = colorSchemeKeyTokens4;
        f27578Q = colorSchemeKeyTokens4;
        f27579R = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        f27580S = typographyKeyTokens;
        f27581T = colorSchemeKeyTokens4;
        f27582U = colorSchemeKeyTokens4;
        f27583V = colorSchemeKeyTokens4;
        f27584W = colorSchemeKeyTokens4;
        f27585X = typographyKeyTokens;
        f27586Y = colorSchemeKeyTokens4;
        float f2 = (float) 24.0d;
        f27587Z = C3641Dp.m73658constructorimpl(f2);
        f27589a0 = ColorSchemeKeyTokens.Outline;
        f27591b0 = C3641Dp.m73658constructorimpl(f);
        f27593c0 = colorSchemeKeyTokens4;
        f27595d0 = TypographyKeyTokens.BodySmall;
        f27597e0 = colorSchemeKeyTokens4;
        f27599f0 = C3641Dp.m73658constructorimpl(f2);
    }

    @NotNull
    public final ColorSchemeKeyTokens getCaretColor() {
        return f27588a;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71145getContainerHeightD9Ej5fM() {
        return f27590b;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f27592c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledInputColor() {
        return f27594d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelColor() {
        return f27596e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return f27598f;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledOutlineColor() {
        return f27600g;
    }

    /* renamed from: getDisabledOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71146getDisabledOutlineWidthD9Ej5fM() {
        return f27601h;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSupportingColor() {
        return f27602i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return f27603j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusCaretColor() {
        return f27604k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusInputColor() {
        return f27605l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusLabelColor() {
        return f27606m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusLeadingIconColor() {
        return f27607n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusOutlineColor() {
        return f27608o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusSupportingColor() {
        return f27609p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusTrailingIconColor() {
        return f27610q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverInputColor() {
        return f27611r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverLabelColor() {
        return f27612s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverLeadingIconColor() {
        return f27613t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverOutlineColor() {
        return f27614u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverSupportingColor() {
        return f27615v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverTrailingIconColor() {
        return f27616w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorInputColor() {
        return f27617x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorLabelColor() {
        return f27618y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorLeadingIconColor() {
        return f27619z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorOutlineColor() {
        return f27562A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorSupportingColor() {
        return f27563B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorTrailingIconColor() {
        return f27564C;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusInputColor() {
        return f27565D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLabelColor() {
        return f27566E;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLeadingIconColor() {
        return f27567F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusOutlineColor() {
        return f27568G;
    }

    /* renamed from: getFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71147getFocusOutlineWidthD9Ej5fM() {
        return f27569H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusSupportingColor() {
        return f27570I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusTrailingIconColor() {
        return f27571J;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverInputColor() {
        return f27572K;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverLabelColor() {
        return f27573L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverLeadingIconColor() {
        return f27574M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverOutlineColor() {
        return f27575N;
    }

    /* renamed from: getHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71148getHoverOutlineWidthD9Ej5fM() {
        return f27576O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverSupportingColor() {
        return f27577P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverTrailingIconColor() {
        return f27578Q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputColor() {
        return f27579R;
    }

    @NotNull
    public final TypographyKeyTokens getInputFont() {
        return f27580S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputPlaceholderColor() {
        return f27581T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputPrefixColor() {
        return f27582U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputSuffixColor() {
        return f27583V;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLabelColor() {
        return f27584W;
    }

    @NotNull
    public final TypographyKeyTokens getLabelFont() {
        return f27585X;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return f27586Y;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71149getLeadingIconSizeD9Ej5fM() {
        return f27587Z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getOutlineColor() {
        return f27589a0;
    }

    /* renamed from: getOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71150getOutlineWidthD9Ej5fM() {
        return f27591b0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSupportingColor() {
        return f27593c0;
    }

    @NotNull
    public final TypographyKeyTokens getSupportingFont() {
        return f27595d0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return f27597e0;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71151getTrailingIconSizeD9Ej5fM() {
        return f27599f0;
    }
}
