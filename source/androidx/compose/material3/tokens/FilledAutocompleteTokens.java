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

@Metadata(m28851d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0007\n\u0003\b\u009a\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR \u0010\u001e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR \u0010!\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR \u00103\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000eR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR \u0010<\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b;\u0010\u000eR\u0017\u0010?\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u0010\u0012\u001a\u0004\b>\u0010\u0014R\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR \u0010E\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\f\u001a\u0004\bD\u0010\u000eR\u0014\u0010G\u001a\u00020F8\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010\fR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u0014\u0010K\u001a\u00020F8\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010\fR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR\u0014\u0010O\u001a\u00020F8\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010\fR\u0017\u0010R\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\bR\u0014\u0010S\u001a\u00020F8\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010\fR\u0017\u0010V\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u0014\u0010W\u001a\u00020F8\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010\fR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR\u0014\u0010[\u001a\u00020F8\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010\fR\u0017\u0010^\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b]\u0010\bR\u0014\u0010_\u001a\u00020F8\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010\fR\u0017\u0010b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\ba\u0010\bR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u0017\u0010h\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\u0006\u001a\u0004\bg\u0010\bR\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u0017\u0010n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\bm\u0010\bR\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u0017\u0010t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bs\u0010\bR\u0017\u0010v\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bu\u0010\bR\u0017\u0010y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bw\u0010\u0006\u001a\u0004\bx\u0010\bR\u0017\u0010|\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bz\u0010\u0006\u001a\u0004\b{\u0010\bR\u0017\u0010\u007f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b}\u0010\u0006\u001a\u0004\b~\u0010\bR\u001a\u0010\u0082\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0006\u001a\u0005\b\u0081\u0001\u0010\bR\u001a\u0010\u0085\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0005\b\u0084\u0001\u0010\bR\u001a\u0010\u0088\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0006\u001a\u0005\b\u0087\u0001\u0010\bR\u001a\u0010\u008b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0006\u001a\u0005\b\u008a\u0001\u0010\bR\u001a\u0010\u008e\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0006\u001a\u0005\b\u008d\u0001\u0010\bR\u001a\u0010\u0091\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u0090\u0001\u0010\bR\u001a\u0010\u0094\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0006\u001a\u0005\b\u0093\u0001\u0010\bR\u001a\u0010\u0097\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0005\b\u0096\u0001\u0010\bR\u001a\u0010\u009a\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u0006\u001a\u0005\b\u0099\u0001\u0010\bR#\u0010\u009d\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\f\u001a\u0005\b\u009c\u0001\u0010\u000eR\u001a\u0010 \u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0006\u001a\u0005\b\u009f\u0001\u0010\bR\u001a\u0010£\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0006\u001a\u0005\b¢\u0001\u0010\bR\u001a\u0010¦\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u0006\u001a\u0005\b¥\u0001\u0010\bR\u001a\u0010©\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0006\u001a\u0005\b¨\u0001\u0010\bR\u001a\u0010¬\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bª\u0001\u0010\u0006\u001a\u0005\b«\u0001\u0010\bR\u001a\u0010¯\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0006\u001a\u0005\b®\u0001\u0010\bR#\u0010²\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b°\u0001\u0010\f\u001a\u0005\b±\u0001\u0010\u000eR\u001a\u0010µ\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0006\u001a\u0005\b´\u0001\u0010\bR\u001a\u0010¸\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010\u0006\u001a\u0005\b·\u0001\u0010\bR\u001a\u0010»\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0006\u001a\u0005\bº\u0001\u0010\bR\u001a\u0010¾\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0006\u001a\u0005\b½\u0001\u0010\bR\u001a\u0010Á\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0006\u001a\u0005\bÀ\u0001\u0010\bR\u001a\u0010Ä\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u0006\u001a\u0005\bÃ\u0001\u0010\bR\u001a\u0010Ç\u0001\u001a\u00020%8\u0006¢\u0006\u000e\n\u0005\bÅ\u0001\u0010'\u001a\u0005\bÆ\u0001\u0010)R\u001a\u0010Ê\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÈ\u0001\u0010\u0006\u001a\u0005\bÉ\u0001\u0010\bR\u001a\u0010Í\u0001\u001a\u00020%8\u0006¢\u0006\u000e\n\u0005\bË\u0001\u0010'\u001a\u0005\bÌ\u0001\u0010)R\u001a\u0010Ð\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÎ\u0001\u0010\u0006\u001a\u0005\bÏ\u0001\u0010\bR#\u0010Ó\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\f\u001a\u0005\bÒ\u0001\u0010\u000eR\u001a\u0010Ö\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÔ\u0001\u0010\u0006\u001a\u0005\bÕ\u0001\u0010\bR\u001a\u0010Ù\u0001\u001a\u00020%8\u0006¢\u0006\u000e\n\u0005\b×\u0001\u0010'\u001a\u0005\bØ\u0001\u0010)R\u001a\u0010Ü\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÚ\u0001\u0010\u0006\u001a\u0005\bÛ\u0001\u0010\bR#\u0010ß\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\f\u001a\u0005\bÞ\u0001\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006à\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/FilledAutocompleteTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getMenuContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "MenuContainerColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getMenuContainerElevation-D9Ej5fM", "()F", "MenuContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CURVE_TO, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getMenuContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "MenuContainerShape", "d", "getMenuContainerSurfaceTintLayerColor", "MenuContainerSurfaceTintLayerColor", "e", "getMenuDividerColor", "MenuDividerColor", OperatorName.FILL_NON_ZERO, "getMenuDividerHeight-D9Ej5fM", "MenuDividerHeight", OperatorName.NON_STROKING_GRAY, "getMenuListItemContainerHeight-D9Ej5fM", "MenuListItemContainerHeight", OperatorName.CLOSE_PATH, "getMenuListItemLabelTextColor", "MenuListItemLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "i", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getMenuListItemLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MenuListItemLabelTextFont", OperatorName.SET_LINE_JOINSTYLE, "getMenuListItemSelectedContainerColor", "MenuListItemSelectedContainerColor", OperatorName.NON_STROKING_CMYK, "getTextFieldActiveIndicatorColor", "TextFieldActiveIndicatorColor", OperatorName.LINE_TO, "getTextFieldActiveIndicatorHeight-D9Ej5fM", "TextFieldActiveIndicatorHeight", OperatorName.MOVE_TO, "getTextFieldCaretColor", "TextFieldCaretColor", OperatorName.ENDPATH, "getTextFieldContainerColor", "TextFieldContainerColor", "o", "getTextFieldContainerHeight-D9Ej5fM", "TextFieldContainerHeight", "p", "getTextFieldContainerShape", "TextFieldContainerShape", OperatorName.SAVE, "getTextFieldDisabledActiveIndicatorColor", "TextFieldDisabledActiveIndicatorColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getTextFieldDisabledActiveIndicatorHeight-D9Ej5fM", "TextFieldDisabledActiveIndicatorHeight", "", "TextFieldDisabledActiveIndicatorOpacity", OperatorName.CLOSE_AND_STROKE, "getTextFieldDisabledContainerColor", "TextFieldDisabledContainerColor", "TextFieldDisabledContainerOpacity", "t", "getFieldDisabledInputTextColor", "FieldDisabledInputTextColor", "FieldDisabledInputTextOpacity", "u", "getFieldDisabledLabelTextColor", "FieldDisabledLabelTextColor", "FieldDisabledLabelTextOpacity", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getTextFieldDisabledLeadingIconColor", "TextFieldDisabledLeadingIconColor", "TextFieldDisabledLeadingIconOpacity", OperatorName.SET_LINE_WIDTH, "getFieldDisabledSupportingTextColor", "FieldDisabledSupportingTextColor", "FieldDisabledSupportingTextOpacity", "x", "getTextFieldDisabledTrailingIconColor", "TextFieldDisabledTrailingIconColor", "TextFieldDisabledTrailingIconOpacity", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getTextFieldErrorActiveIndicatorColor", "TextFieldErrorActiveIndicatorColor", "z", "getTextFieldErrorFocusActiveIndicatorColor", "TextFieldErrorFocusActiveIndicatorColor", "A", "getTextFieldErrorFocusCaretColor", "TextFieldErrorFocusCaretColor", "B", "getFieldErrorFocusInputTextColor", "FieldErrorFocusInputTextColor", "C", "getFieldErrorFocusLabelTextColor", "FieldErrorFocusLabelTextColor", "D", "getTextFieldErrorFocusLeadingIconColor", "TextFieldErrorFocusLeadingIconColor", ExifInterface.LONGITUDE_EAST, "getFieldErrorFocusSupportingTextColor", "FieldErrorFocusSupportingTextColor", "getTextFieldErrorFocusTrailingIconColor", "TextFieldErrorFocusTrailingIconColor", OperatorName.STROKING_COLOR_GRAY, "getTextFieldErrorHoverActiveIndicatorColor", "TextFieldErrorHoverActiveIndicatorColor", "H", "getFieldErrorHoverInputTextColor", "FieldErrorHoverInputTextColor", "I", "getFieldErrorHoverLabelTextColor", "FieldErrorHoverLabelTextColor", OperatorName.SET_LINE_CAPSTYLE, "getTextFieldErrorHoverLeadingIconColor", "TextFieldErrorHoverLeadingIconColor", "K", "getFieldErrorHoverSupportingTextColor", "FieldErrorHoverSupportingTextColor", "L", "getTextFieldErrorHoverTrailingIconColor", "TextFieldErrorHoverTrailingIconColor", "M", "getFieldErrorInputTextColor", "FieldErrorInputTextColor", "N", "getFieldErrorLabelTextColor", "FieldErrorLabelTextColor", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getTextFieldErrorLeadingIconColor", "TextFieldErrorLeadingIconColor", "P", "getFieldErrorSupportingTextColor", "FieldErrorSupportingTextColor", OperatorName.RESTORE, "getTextFieldErrorTrailingIconColor", "TextFieldErrorTrailingIconColor", "R", "getTextFieldFocusActiveIndicatorColor", "TextFieldFocusActiveIndicatorColor", "S", "getTextFieldFocusActiveIndicatorHeight-D9Ej5fM", "TextFieldFocusActiveIndicatorHeight", "T", "getFieldFocusInputTextColor", "FieldFocusInputTextColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getFieldFocusLabelTextColor", "FieldFocusLabelTextColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getTextFieldFocusLeadingIconColor", "TextFieldFocusLeadingIconColor", "W", "getFieldFocusSupportingTextColor", "FieldFocusSupportingTextColor", "X", "getTextFieldFocusTrailingIconColor", "TextFieldFocusTrailingIconColor", "Y", "getTextFieldHoverActiveIndicatorColor", "TextFieldHoverActiveIndicatorColor", "Z", "getTextFieldHoverActiveIndicatorHeight-D9Ej5fM", "TextFieldHoverActiveIndicatorHeight", "a0", "getFieldHoverInputTextColor", "FieldHoverInputTextColor", "b0", "getFieldHoverLabelTextColor", "FieldHoverLabelTextColor", "c0", "getTextFieldHoverLeadingIconColor", "TextFieldHoverLeadingIconColor", OperatorName.TYPE3_D0, "getFieldHoverSupportingTextColor", "FieldHoverSupportingTextColor", "e0", "getTextFieldHoverTrailingIconColor", "TextFieldHoverTrailingIconColor", "f0", "getFieldInputTextColor", "FieldInputTextColor", "g0", "getFieldInputTextFont", "FieldInputTextFont", "h0", "getFieldLabelTextColor", "FieldLabelTextColor", "i0", "getFieldLabelTextFont", "FieldLabelTextFont", "j0", "getTextFieldLeadingIconColor", "TextFieldLeadingIconColor", "k0", "getTextFieldLeadingIconSize-D9Ej5fM", "TextFieldLeadingIconSize", "l0", "getFieldSupportingTextColor", "FieldSupportingTextColor", "m0", "getFieldSupportingTextFont", "FieldSupportingTextFont", "n0", "getTextFieldTrailingIconColor", "TextFieldTrailingIconColor", "o0", "getTextFieldTrailingIconSize-D9Ej5fM", "TextFieldTrailingIconSize", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFilledAutocompleteTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilledAutocompleteTokens.kt\nandroidx/compose/material3/tokens/FilledAutocompleteTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,98:1\n164#2:99\n164#2:100\n164#2:101\n164#2:102\n164#2:103\n164#2:104\n164#2:105\n164#2:106\n164#2:107\n*S KotlinDebug\n*F\n+ 1 FilledAutocompleteTokens.kt\nandroidx/compose/material3/tokens/FilledAutocompleteTokens\n*L\n29#1:99\n30#1:100\n35#1:101\n38#1:102\n41#1:103\n75#1:104\n82#1:105\n93#1:106\n97#1:107\n*E\n"})
/* loaded from: classes2.dex */
public final class FilledAutocompleteTokens {

    /* renamed from: A */
    public static final ColorSchemeKeyTokens f26911A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f26912B;

    /* renamed from: C */
    public static final ColorSchemeKeyTokens f26913C;

    /* renamed from: D */
    public static final ColorSchemeKeyTokens f26914D;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f26915E;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f26916F;
    public static final float FieldDisabledInputTextOpacity = 0.38f;
    public static final float FieldDisabledLabelTextOpacity = 0.38f;
    public static final float FieldDisabledSupportingTextOpacity = 0.38f;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f26917G;

    /* renamed from: H */
    public static final ColorSchemeKeyTokens f26918H;

    /* renamed from: I */
    public static final ColorSchemeKeyTokens f26919I;

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f26920J;

    /* renamed from: K */
    public static final ColorSchemeKeyTokens f26921K;

    /* renamed from: L */
    public static final ColorSchemeKeyTokens f26922L;

    /* renamed from: M */
    public static final ColorSchemeKeyTokens f26923M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f26924N;

    /* renamed from: O */
    public static final ColorSchemeKeyTokens f26925O;

    /* renamed from: P */
    public static final ColorSchemeKeyTokens f26926P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f26927Q;

    /* renamed from: R */
    public static final ColorSchemeKeyTokens f26928R;

    /* renamed from: S */
    public static final float f26929S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f26930T;
    public static final float TextFieldDisabledActiveIndicatorOpacity = 0.38f;
    public static final float TextFieldDisabledContainerOpacity = 0.04f;
    public static final float TextFieldDisabledLeadingIconOpacity = 0.38f;
    public static final float TextFieldDisabledTrailingIconOpacity = 0.38f;

    /* renamed from: U */
    public static final ColorSchemeKeyTokens f26931U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f26932V;

    /* renamed from: W */
    public static final ColorSchemeKeyTokens f26933W;

    /* renamed from: X */
    public static final ColorSchemeKeyTokens f26934X;

    /* renamed from: Y */
    public static final ColorSchemeKeyTokens f26935Y;

    /* renamed from: Z */
    public static final float f26936Z;

    /* renamed from: a0 */
    public static final ColorSchemeKeyTokens f26938a0;

    /* renamed from: b0 */
    public static final ColorSchemeKeyTokens f26940b0;

    /* renamed from: c0 */
    public static final ColorSchemeKeyTokens f26942c0;

    /* renamed from: d0 */
    public static final ColorSchemeKeyTokens f26944d0;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f26945e;

    /* renamed from: e0 */
    public static final ColorSchemeKeyTokens f26946e0;

    /* renamed from: f */
    public static final float f26947f;

    /* renamed from: f0 */
    public static final ColorSchemeKeyTokens f26948f0;

    /* renamed from: g */
    public static final float f26949g;

    /* renamed from: g0 */
    public static final TypographyKeyTokens f26950g0;

    /* renamed from: h */
    public static final ColorSchemeKeyTokens f26951h;

    /* renamed from: h0 */
    public static final ColorSchemeKeyTokens f26952h0;

    /* renamed from: i */
    public static final TypographyKeyTokens f26953i;

    /* renamed from: i0 */
    public static final TypographyKeyTokens f26954i0;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f26955j;

    /* renamed from: j0 */
    public static final ColorSchemeKeyTokens f26956j0;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f26957k;

    /* renamed from: k0 */
    public static final float f26958k0;

    /* renamed from: l */
    public static final float f26959l;

    /* renamed from: l0 */
    public static final ColorSchemeKeyTokens f26960l0;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f26961m;

    /* renamed from: m0 */
    public static final TypographyKeyTokens f26962m0;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f26963n;

    /* renamed from: n0 */
    public static final ColorSchemeKeyTokens f26964n0;

    /* renamed from: o */
    public static final float f26965o;

    /* renamed from: o0 */
    public static final float f26966o0;

    /* renamed from: p */
    public static final ShapeKeyTokens f26967p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f26968q;

    /* renamed from: r */
    public static final float f26969r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f26970s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f26971t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f26972u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f26973v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f26974w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f26975x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f26976y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f26977z;
    @NotNull
    public static final FilledAutocompleteTokens INSTANCE = new FilledAutocompleteTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f26937a = ColorSchemeKeyTokens.Surface;

    /* renamed from: b */
    public static final float f26939b = ElevationTokens.INSTANCE.m70957getLevel2D9Ej5fM();

    /* renamed from: c */
    public static final ShapeKeyTokens f26941c = ShapeKeyTokens.CornerExtraSmall;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f26943d = ColorSchemeKeyTokens.SurfaceTint;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        f26945e = colorSchemeKeyTokens;
        float f = (float) 1.0d;
        f26947f = C3641Dp.m73658constructorimpl(f);
        f26949g = C3641Dp.m73658constructorimpl((float) 48.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f26951h = colorSchemeKeyTokens2;
        f26953i = TypographyKeyTokens.LabelLarge;
        f26955j = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f26957k = colorSchemeKeyTokens3;
        f26959l = C3641Dp.m73658constructorimpl(f);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Primary;
        f26961m = colorSchemeKeyTokens4;
        f26963n = colorSchemeKeyTokens;
        f26965o = C3641Dp.m73658constructorimpl((float) 56.0d);
        f26967p = ShapeKeyTokens.CornerExtraSmallTop;
        f26968q = colorSchemeKeyTokens2;
        f26969r = C3641Dp.m73658constructorimpl(f);
        f26970s = colorSchemeKeyTokens2;
        f26971t = colorSchemeKeyTokens2;
        f26972u = colorSchemeKeyTokens2;
        f26973v = colorSchemeKeyTokens2;
        f26974w = colorSchemeKeyTokens2;
        f26975x = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Error;
        f26976y = colorSchemeKeyTokens5;
        f26977z = colorSchemeKeyTokens5;
        f26911A = colorSchemeKeyTokens5;
        f26912B = colorSchemeKeyTokens2;
        f26913C = colorSchemeKeyTokens5;
        f26914D = colorSchemeKeyTokens3;
        f26915E = colorSchemeKeyTokens5;
        f26916F = colorSchemeKeyTokens5;
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnErrorContainer;
        f26917G = colorSchemeKeyTokens6;
        f26918H = colorSchemeKeyTokens2;
        f26919I = colorSchemeKeyTokens6;
        f26920J = colorSchemeKeyTokens3;
        f26921K = colorSchemeKeyTokens5;
        f26922L = colorSchemeKeyTokens6;
        f26923M = colorSchemeKeyTokens2;
        f26924N = colorSchemeKeyTokens5;
        f26925O = colorSchemeKeyTokens3;
        f26926P = colorSchemeKeyTokens5;
        f26927Q = colorSchemeKeyTokens5;
        f26928R = colorSchemeKeyTokens4;
        f26929S = C3641Dp.m73658constructorimpl((float) 2.0d);
        f26930T = colorSchemeKeyTokens2;
        f26931U = colorSchemeKeyTokens4;
        f26932V = colorSchemeKeyTokens3;
        f26933W = colorSchemeKeyTokens3;
        f26934X = colorSchemeKeyTokens3;
        f26935Y = colorSchemeKeyTokens2;
        f26936Z = C3641Dp.m73658constructorimpl(f);
        f26938a0 = colorSchemeKeyTokens2;
        f26940b0 = colorSchemeKeyTokens3;
        f26942c0 = colorSchemeKeyTokens3;
        f26944d0 = colorSchemeKeyTokens3;
        f26946e0 = colorSchemeKeyTokens3;
        f26948f0 = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        f26950g0 = typographyKeyTokens;
        f26952h0 = colorSchemeKeyTokens3;
        f26954i0 = typographyKeyTokens;
        f26956j0 = colorSchemeKeyTokens3;
        f26958k0 = C3641Dp.m73658constructorimpl((float) 20.0d);
        f26960l0 = colorSchemeKeyTokens3;
        f26962m0 = TypographyKeyTokens.BodySmall;
        f26964n0 = colorSchemeKeyTokens3;
        f26966o0 = C3641Dp.m73658constructorimpl((float) 24.0d);
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldDisabledInputTextColor() {
        return f26971t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldDisabledLabelTextColor() {
        return f26972u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldDisabledSupportingTextColor() {
        return f26974w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorFocusInputTextColor() {
        return f26912B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorFocusLabelTextColor() {
        return f26913C;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorFocusSupportingTextColor() {
        return f26915E;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorHoverInputTextColor() {
        return f26918H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorHoverLabelTextColor() {
        return f26919I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorHoverSupportingTextColor() {
        return f26921K;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorInputTextColor() {
        return f26923M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorLabelTextColor() {
        return f26924N;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorSupportingTextColor() {
        return f26926P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldFocusInputTextColor() {
        return f26930T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldFocusLabelTextColor() {
        return f26931U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldFocusSupportingTextColor() {
        return f26933W;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldHoverInputTextColor() {
        return f26938a0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldHoverLabelTextColor() {
        return f26940b0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldHoverSupportingTextColor() {
        return f26944d0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldInputTextColor() {
        return f26948f0;
    }

    @NotNull
    public final TypographyKeyTokens getFieldInputTextFont() {
        return f26950g0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldLabelTextColor() {
        return f26952h0;
    }

    @NotNull
    public final TypographyKeyTokens getFieldLabelTextFont() {
        return f26954i0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldSupportingTextColor() {
        return f26960l0;
    }

    @NotNull
    public final TypographyKeyTokens getFieldSupportingTextFont() {
        return f26962m0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuContainerColor() {
        return f26937a;
    }

    /* renamed from: getMenuContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71015getMenuContainerElevationD9Ej5fM() {
        return f26939b;
    }

    @NotNull
    public final ShapeKeyTokens getMenuContainerShape() {
        return f26941c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuContainerSurfaceTintLayerColor() {
        return f26943d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuDividerColor() {
        return f26945e;
    }

    /* renamed from: getMenuDividerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71016getMenuDividerHeightD9Ej5fM() {
        return f26947f;
    }

    /* renamed from: getMenuListItemContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71017getMenuListItemContainerHeightD9Ej5fM() {
        return f26949g;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuListItemLabelTextColor() {
        return f26951h;
    }

    @NotNull
    public final TypographyKeyTokens getMenuListItemLabelTextFont() {
        return f26953i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuListItemSelectedContainerColor() {
        return f26955j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldActiveIndicatorColor() {
        return f26957k;
    }

    /* renamed from: getTextFieldActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71018getTextFieldActiveIndicatorHeightD9Ej5fM() {
        return f26959l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldCaretColor() {
        return f26961m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldContainerColor() {
        return f26963n;
    }

    /* renamed from: getTextFieldContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71019getTextFieldContainerHeightD9Ej5fM() {
        return f26965o;
    }

    @NotNull
    public final ShapeKeyTokens getTextFieldContainerShape() {
        return f26967p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledActiveIndicatorColor() {
        return f26968q;
    }

    /* renamed from: getTextFieldDisabledActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71020getTextFieldDisabledActiveIndicatorHeightD9Ej5fM() {
        return f26969r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledContainerColor() {
        return f26970s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledLeadingIconColor() {
        return f26973v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledTrailingIconColor() {
        return f26975x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorActiveIndicatorColor() {
        return f26976y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusActiveIndicatorColor() {
        return f26977z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusCaretColor() {
        return f26911A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusLeadingIconColor() {
        return f26914D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusTrailingIconColor() {
        return f26916F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverActiveIndicatorColor() {
        return f26917G;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverLeadingIconColor() {
        return f26920J;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverTrailingIconColor() {
        return f26922L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorLeadingIconColor() {
        return f26925O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorTrailingIconColor() {
        return f26927Q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusActiveIndicatorColor() {
        return f26928R;
    }

    /* renamed from: getTextFieldFocusActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71021getTextFieldFocusActiveIndicatorHeightD9Ej5fM() {
        return f26929S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusLeadingIconColor() {
        return f26932V;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusTrailingIconColor() {
        return f26934X;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverActiveIndicatorColor() {
        return f26935Y;
    }

    /* renamed from: getTextFieldHoverActiveIndicatorHeight-D9Ej5fM  reason: not valid java name */
    public final float m71022getTextFieldHoverActiveIndicatorHeightD9Ej5fM() {
        return f26936Z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverLeadingIconColor() {
        return f26942c0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverTrailingIconColor() {
        return f26946e0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldLeadingIconColor() {
        return f26956j0;
    }

    /* renamed from: getTextFieldLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71023getTextFieldLeadingIconSizeD9Ej5fM() {
        return f26958k0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldTrailingIconColor() {
        return f26964n0;
    }

    /* renamed from: getTextFieldTrailingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71024getTextFieldTrailingIconSizeD9Ej5fM() {
        return f26966o0;
    }
}
