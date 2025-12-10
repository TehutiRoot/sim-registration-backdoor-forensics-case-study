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

@Metadata(m28851d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0003\b\u009f\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR \u0010\u001e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR \u0010!\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR \u00106\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u000eR\u0017\u00109\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b7\u0010\u0012\u001a\u0004\b8\u0010\u0014R\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR\u0014\u0010>\u001a\u00020=8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\fR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0014\u0010B\u001a\u00020=8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\fR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0014\u0010F\u001a\u00020=8\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\fR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0014\u0010J\u001a\u00020=8\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010\fR \u0010M\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010\f\u001a\u0004\bL\u0010\u000eR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0014\u0010Q\u001a\u00020=8\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010\fR\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0014\u0010U\u001a\u00020=8\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010\fR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\bW\u0010\bR\u0017\u0010[\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0017\u0010^\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b]\u0010\bR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u0017\u0010d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\u0006\u001a\u0004\bc\u0010\bR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u0017\u0010j\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\u0006\u001a\u0004\bi\u0010\bR\u0017\u0010m\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u0017\u0010p\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bn\u0010\u0006\u001a\u0004\bo\u0010\bR\u0017\u0010s\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\br\u0010\bR\u0017\u0010u\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bt\u0010\bR\u0017\u0010x\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bv\u0010\u0006\u001a\u0004\bw\u0010\bR\u0017\u0010{\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bz\u0010\bR\u0017\u0010~\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b|\u0010\u0006\u001a\u0004\b}\u0010\bR\u0019\u0010\u0081\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR\u001a\u0010\u0084\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0006\u001a\u0005\b\u0083\u0001\u0010\bR\u001a\u0010\u0087\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR\u001a\u0010\u008a\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0006\u001a\u0005\b\u0089\u0001\u0010\bR\u001a\u0010\u008d\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0006\u001a\u0005\b\u008c\u0001\u0010\bR\u001a\u0010\u0090\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0006\u001a\u0005\b\u008f\u0001\u0010\bR\u001a\u0010\u0093\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0005\b\u0092\u0001\u0010\bR\u001a\u0010\u0096\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0006\u001a\u0005\b\u0095\u0001\u0010\bR\u001a\u0010\u0099\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0005\b\u0098\u0001\u0010\bR#\u0010\u009c\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\f\u001a\u0005\b\u009b\u0001\u0010\u000eR\u001a\u0010\u009f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0005\b\u009e\u0001\u0010\bR\u001a\u0010¢\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010\u0006\u001a\u0005\b¡\u0001\u0010\bR\u001a\u0010¥\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0006\u001a\u0005\b¤\u0001\u0010\bR\u001a\u0010¨\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0006\u001a\u0005\b§\u0001\u0010\bR\u001a\u0010«\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0006\u001a\u0005\bª\u0001\u0010\bR\u001a\u0010®\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¬\u0001\u0010\u0006\u001a\u0005\b\u00ad\u0001\u0010\bR#\u0010±\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¯\u0001\u0010\f\u001a\u0005\b°\u0001\u0010\u000eR\u001a\u0010´\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010\u0006\u001a\u0005\b³\u0001\u0010\bR\u001a\u0010·\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0006\u001a\u0005\b¶\u0001\u0010\bR\u001a\u0010º\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¸\u0001\u0010\u0006\u001a\u0005\b¹\u0001\u0010\bR\u001a\u0010½\u0001\u001a\u00020%8\u0006¢\u0006\u000e\n\u0005\b»\u0001\u0010'\u001a\u0005\b¼\u0001\u0010)R\u001a\u0010À\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¾\u0001\u0010\u0006\u001a\u0005\b¿\u0001\u0010\bR\u001a\u0010Ã\u0001\u001a\u00020%8\u0006¢\u0006\u000e\n\u0005\bÁ\u0001\u0010'\u001a\u0005\bÂ\u0001\u0010)R\u001a\u0010Æ\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÄ\u0001\u0010\u0006\u001a\u0005\bÅ\u0001\u0010\bR#\u0010É\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\f\u001a\u0005\bÈ\u0001\u0010\u000eR\u001a\u0010Ì\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÊ\u0001\u0010\u0006\u001a\u0005\bË\u0001\u0010\bR#\u0010Ï\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\f\u001a\u0005\bÎ\u0001\u0010\u000eR\u001a\u0010Ò\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÐ\u0001\u0010\u0006\u001a\u0005\bÑ\u0001\u0010\bR\u001a\u0010Õ\u0001\u001a\u00020%8\u0006¢\u0006\u000e\n\u0005\bÓ\u0001\u0010'\u001a\u0005\bÔ\u0001\u0010)R\u001a\u0010Ø\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÖ\u0001\u0010\u0006\u001a\u0005\b×\u0001\u0010\bR#\u0010Û\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÙ\u0001\u0010\f\u001a\u0005\bÚ\u0001\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ü\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/OutlinedAutocompleteTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getMenuContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "MenuContainerColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getMenuContainerElevation-D9Ej5fM", "()F", "MenuContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CURVE_TO, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getMenuContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "MenuContainerShape", "d", "getMenuContainerSurfaceTintLayerColor", "MenuContainerSurfaceTintLayerColor", "e", "getMenuDividerColor", "MenuDividerColor", OperatorName.FILL_NON_ZERO, "getMenuDividerHeight-D9Ej5fM", "MenuDividerHeight", OperatorName.NON_STROKING_GRAY, "getMenuListItemContainerHeight-D9Ej5fM", "MenuListItemContainerHeight", OperatorName.CLOSE_PATH, "getMenuListItemLabelTextColor", "MenuListItemLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "i", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getMenuListItemLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MenuListItemLabelTextFont", OperatorName.SET_LINE_JOINSTYLE, "getMenuListItemSelectedContainerColor", "MenuListItemSelectedContainerColor", OperatorName.NON_STROKING_CMYK, "getTextFieldCaretColor", "TextFieldCaretColor", OperatorName.LINE_TO, "getTextFieldContainerColor", "TextFieldContainerColor", OperatorName.MOVE_TO, "getTextFieldContainerHeight-D9Ej5fM", "TextFieldContainerHeight", OperatorName.ENDPATH, "getTextFieldContainerShape", "TextFieldContainerShape", "o", "getFieldDisabledInputTextColor", "FieldDisabledInputTextColor", "", "FieldDisabledInputTextOpacity", "p", "getFieldDisabledLabelTextColor", "FieldDisabledLabelTextColor", "FieldDisabledLabelTextOpacity", OperatorName.SAVE, "getTextFieldDisabledLeadingIconColor", "TextFieldDisabledLeadingIconColor", "TextFieldDisabledLeadingIconOpacity", PDPageLabelRange.STYLE_ROMAN_LOWER, "getTextFieldDisabledOutlineColor", "TextFieldDisabledOutlineColor", "TextFieldDisabledOutlineOpacity", OperatorName.CLOSE_AND_STROKE, "getTextFieldDisabledOutlineWidth-D9Ej5fM", "TextFieldDisabledOutlineWidth", "t", "getFieldDisabledSupportingTextColor", "FieldDisabledSupportingTextColor", "FieldDisabledSupportingTextOpacity", "u", "getTextFieldDisabledTrailingIconColor", "TextFieldDisabledTrailingIconColor", "TextFieldDisabledTrailingIconOpacity", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getTextFieldErrorFocusCaretColor", "TextFieldErrorFocusCaretColor", OperatorName.SET_LINE_WIDTH, "getFieldErrorFocusInputTextColor", "FieldErrorFocusInputTextColor", "x", "getFieldErrorFocusLabelTextColor", "FieldErrorFocusLabelTextColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getTextFieldErrorFocusLeadingIconColor", "TextFieldErrorFocusLeadingIconColor", "z", "getTextFieldErrorFocusOutlineColor", "TextFieldErrorFocusOutlineColor", "A", "getFieldErrorFocusSupportingTextColor", "FieldErrorFocusSupportingTextColor", "B", "getTextFieldErrorFocusTrailingIconColor", "TextFieldErrorFocusTrailingIconColor", "C", "getFieldErrorHoverInputTextColor", "FieldErrorHoverInputTextColor", "D", "getFieldErrorHoverLabelTextColor", "FieldErrorHoverLabelTextColor", ExifInterface.LONGITUDE_EAST, "getTextFieldErrorHoverLeadingIconColor", "TextFieldErrorHoverLeadingIconColor", "getTextFieldErrorHoverOutlineColor", "TextFieldErrorHoverOutlineColor", OperatorName.STROKING_COLOR_GRAY, "getFieldErrorHoverSupportingTextColor", "FieldErrorHoverSupportingTextColor", "H", "getTextFieldErrorHoverTrailingIconColor", "TextFieldErrorHoverTrailingIconColor", "I", "getFieldErrorInputTextColor", "FieldErrorInputTextColor", OperatorName.SET_LINE_CAPSTYLE, "getFieldErrorLabelTextColor", "FieldErrorLabelTextColor", "K", "getTextFieldErrorLeadingIconColor", "TextFieldErrorLeadingIconColor", "L", "getTextFieldErrorOutlineColor", "TextFieldErrorOutlineColor", "M", "getFieldErrorSupportingTextColor", "FieldErrorSupportingTextColor", "N", "getTextFieldErrorTrailingIconColor", "TextFieldErrorTrailingIconColor", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getFieldFocusInputTextColor", "FieldFocusInputTextColor", "P", "getFieldFocusLabelTextColor", "FieldFocusLabelTextColor", OperatorName.RESTORE, "getTextFieldFocusLeadingIconColor", "TextFieldFocusLeadingIconColor", "R", "getTextFieldFocusOutlineColor", "TextFieldFocusOutlineColor", "S", "getTextFieldFocusOutlineWidth-D9Ej5fM", "TextFieldFocusOutlineWidth", "T", "getFieldFocusSupportingTextColor", "FieldFocusSupportingTextColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getTextFieldFocusTrailingIconColor", "TextFieldFocusTrailingIconColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getFieldHoverInputTextColor", "FieldHoverInputTextColor", "W", "getFieldHoverLabelTextColor", "FieldHoverLabelTextColor", "X", "getTextFieldHoverLeadingIconColor", "TextFieldHoverLeadingIconColor", "Y", "getTextFieldHoverOutlineColor", "TextFieldHoverOutlineColor", "Z", "getTextFieldHoverOutlineWidth-D9Ej5fM", "TextFieldHoverOutlineWidth", "a0", "getFieldHoverSupportingTextColor", "FieldHoverSupportingTextColor", "b0", "getTextFieldHoverTrailingIconColor", "TextFieldHoverTrailingIconColor", "c0", "getFieldInputTextColor", "FieldInputTextColor", OperatorName.TYPE3_D0, "getFieldInputTextFont", "FieldInputTextFont", "e0", "getFieldLabelTextColor", "FieldLabelTextColor", "f0", "getFieldLabelTextFont", "FieldLabelTextFont", "g0", "getTextFieldLeadingIconColor", "TextFieldLeadingIconColor", "h0", "getTextFieldLeadingIconSize-D9Ej5fM", "TextFieldLeadingIconSize", "i0", "getTextFieldOutlineColor", "TextFieldOutlineColor", "j0", "getTextFieldOutlineWidth-D9Ej5fM", "TextFieldOutlineWidth", "k0", "getFieldSupportingTextColor", "FieldSupportingTextColor", "l0", "getFieldSupportingTextFont", "FieldSupportingTextFont", "m0", "getTextFieldTrailingIconColor", "TextFieldTrailingIconColor", "n0", "getTextFieldTrailingIconSize-D9Ej5fM", "TextFieldTrailingIconSize", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlinedAutocompleteTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedAutocompleteTokens.kt\nandroidx/compose/material3/tokens/OutlinedAutocompleteTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,96:1\n164#2:97\n164#2:98\n164#2:99\n164#2:100\n164#2:101\n164#2:102\n164#2:103\n164#2:104\n164#2:105\n*S KotlinDebug\n*F\n+ 1 OutlinedAutocompleteTokens.kt\nandroidx/compose/material3/tokens/OutlinedAutocompleteTokens\n*L\n29#1:97\n30#1:98\n36#1:99\n46#1:100\n74#1:101\n81#1:102\n89#1:103\n91#1:104\n95#1:105\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlinedAutocompleteTokens {

    /* renamed from: A */
    public static final ColorSchemeKeyTokens f27441A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27442B;

    /* renamed from: C */
    public static final ColorSchemeKeyTokens f27443C;

    /* renamed from: D */
    public static final ColorSchemeKeyTokens f27444D;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f27445E;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f27446F;
    public static final float FieldDisabledInputTextOpacity = 0.38f;
    public static final float FieldDisabledLabelTextOpacity = 0.38f;
    public static final float FieldDisabledSupportingTextOpacity = 0.38f;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f27447G;

    /* renamed from: H */
    public static final ColorSchemeKeyTokens f27448H;

    /* renamed from: I */
    public static final ColorSchemeKeyTokens f27449I;

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f27450J;

    /* renamed from: K */
    public static final ColorSchemeKeyTokens f27451K;

    /* renamed from: L */
    public static final ColorSchemeKeyTokens f27452L;

    /* renamed from: M */
    public static final ColorSchemeKeyTokens f27453M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f27454N;

    /* renamed from: O */
    public static final ColorSchemeKeyTokens f27455O;

    /* renamed from: P */
    public static final ColorSchemeKeyTokens f27456P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f27457Q;

    /* renamed from: R */
    public static final ColorSchemeKeyTokens f27458R;

    /* renamed from: S */
    public static final float f27459S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f27460T;
    public static final float TextFieldDisabledLeadingIconOpacity = 0.38f;
    public static final float TextFieldDisabledOutlineOpacity = 0.12f;
    public static final float TextFieldDisabledTrailingIconOpacity = 0.38f;

    /* renamed from: U */
    public static final ColorSchemeKeyTokens f27461U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f27462V;

    /* renamed from: W */
    public static final ColorSchemeKeyTokens f27463W;

    /* renamed from: X */
    public static final ColorSchemeKeyTokens f27464X;

    /* renamed from: Y */
    public static final ColorSchemeKeyTokens f27465Y;

    /* renamed from: Z */
    public static final float f27466Z;

    /* renamed from: a0 */
    public static final ColorSchemeKeyTokens f27468a0;

    /* renamed from: b0 */
    public static final ColorSchemeKeyTokens f27470b0;

    /* renamed from: c */
    public static final ShapeKeyTokens f27471c;

    /* renamed from: c0 */
    public static final ColorSchemeKeyTokens f27472c0;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27473d;

    /* renamed from: d0 */
    public static final TypographyKeyTokens f27474d0;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f27475e;

    /* renamed from: e0 */
    public static final ColorSchemeKeyTokens f27476e0;

    /* renamed from: f */
    public static final float f27477f;

    /* renamed from: f0 */
    public static final TypographyKeyTokens f27478f0;

    /* renamed from: g */
    public static final float f27479g;

    /* renamed from: g0 */
    public static final ColorSchemeKeyTokens f27480g0;

    /* renamed from: h */
    public static final ColorSchemeKeyTokens f27481h;

    /* renamed from: h0 */
    public static final float f27482h0;

    /* renamed from: i */
    public static final TypographyKeyTokens f27483i;

    /* renamed from: i0 */
    public static final ColorSchemeKeyTokens f27484i0;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f27485j;

    /* renamed from: j0 */
    public static final float f27486j0;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f27487k;

    /* renamed from: k0 */
    public static final ColorSchemeKeyTokens f27488k0;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27489l;

    /* renamed from: l0 */
    public static final TypographyKeyTokens f27490l0;

    /* renamed from: m */
    public static final float f27491m;

    /* renamed from: m0 */
    public static final ColorSchemeKeyTokens f27492m0;

    /* renamed from: n */
    public static final ShapeKeyTokens f27493n;

    /* renamed from: n0 */
    public static final float f27494n0;

    /* renamed from: o */
    public static final ColorSchemeKeyTokens f27495o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f27496p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f27497q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27498r;

    /* renamed from: s */
    public static final float f27499s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f27500t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f27501u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f27502v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27503w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f27504x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f27505y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f27506z;
    @NotNull
    public static final OutlinedAutocompleteTokens INSTANCE = new OutlinedAutocompleteTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27467a = ColorSchemeKeyTokens.Surface;

    /* renamed from: b */
    public static final float f27469b = ElevationTokens.INSTANCE.m70957getLevel2D9Ej5fM();

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerExtraSmall;
        f27471c = shapeKeyTokens;
        f27473d = ColorSchemeKeyTokens.SurfaceTint;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        f27475e = colorSchemeKeyTokens;
        float f = (float) 1.0d;
        f27477f = C3641Dp.m73658constructorimpl(f);
        f27479g = C3641Dp.m73658constructorimpl((float) 48.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f27481h = colorSchemeKeyTokens2;
        f27483i = TypographyKeyTokens.LabelLarge;
        f27485j = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Primary;
        f27487k = colorSchemeKeyTokens3;
        f27489l = colorSchemeKeyTokens;
        f27491m = C3641Dp.m73658constructorimpl((float) 56.0d);
        f27493n = shapeKeyTokens;
        f27495o = colorSchemeKeyTokens2;
        f27496p = colorSchemeKeyTokens2;
        f27497q = colorSchemeKeyTokens2;
        f27498r = colorSchemeKeyTokens2;
        f27499s = C3641Dp.m73658constructorimpl(f);
        f27500t = colorSchemeKeyTokens2;
        f27501u = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Error;
        f27502v = colorSchemeKeyTokens4;
        f27503w = colorSchemeKeyTokens2;
        f27504x = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27505y = colorSchemeKeyTokens5;
        f27506z = colorSchemeKeyTokens4;
        f27441A = colorSchemeKeyTokens4;
        f27442B = colorSchemeKeyTokens4;
        f27443C = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnErrorContainer;
        f27444D = colorSchemeKeyTokens6;
        f27445E = colorSchemeKeyTokens5;
        f27446F = colorSchemeKeyTokens6;
        f27447G = colorSchemeKeyTokens4;
        f27448H = colorSchemeKeyTokens6;
        f27449I = colorSchemeKeyTokens2;
        f27450J = colorSchemeKeyTokens4;
        f27451K = colorSchemeKeyTokens5;
        f27452L = colorSchemeKeyTokens4;
        f27453M = colorSchemeKeyTokens4;
        f27454N = colorSchemeKeyTokens4;
        f27455O = colorSchemeKeyTokens2;
        f27456P = colorSchemeKeyTokens3;
        f27457Q = colorSchemeKeyTokens5;
        f27458R = colorSchemeKeyTokens3;
        f27459S = C3641Dp.m73658constructorimpl((float) 2.0d);
        f27460T = colorSchemeKeyTokens5;
        f27461U = colorSchemeKeyTokens5;
        f27462V = colorSchemeKeyTokens2;
        f27463W = colorSchemeKeyTokens5;
        f27464X = colorSchemeKeyTokens5;
        f27465Y = colorSchemeKeyTokens2;
        f27466Z = C3641Dp.m73658constructorimpl(f);
        f27468a0 = colorSchemeKeyTokens5;
        f27470b0 = colorSchemeKeyTokens5;
        f27472c0 = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        f27474d0 = typographyKeyTokens;
        f27476e0 = colorSchemeKeyTokens5;
        f27478f0 = typographyKeyTokens;
        f27480g0 = colorSchemeKeyTokens5;
        float f2 = (float) 24.0d;
        f27482h0 = C3641Dp.m73658constructorimpl(f2);
        f27484i0 = ColorSchemeKeyTokens.Outline;
        f27486j0 = C3641Dp.m73658constructorimpl(f);
        f27488k0 = colorSchemeKeyTokens5;
        f27490l0 = TypographyKeyTokens.BodySmall;
        f27492m0 = colorSchemeKeyTokens5;
        f27494n0 = C3641Dp.m73658constructorimpl(f2);
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldDisabledInputTextColor() {
        return f27495o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldDisabledLabelTextColor() {
        return f27496p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldDisabledSupportingTextColor() {
        return f27500t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorFocusInputTextColor() {
        return f27503w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorFocusLabelTextColor() {
        return f27504x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorFocusSupportingTextColor() {
        return f27441A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorHoverInputTextColor() {
        return f27443C;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorHoverLabelTextColor() {
        return f27444D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorHoverSupportingTextColor() {
        return f27447G;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorInputTextColor() {
        return f27449I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorLabelTextColor() {
        return f27450J;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorSupportingTextColor() {
        return f27453M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldFocusInputTextColor() {
        return f27455O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldFocusLabelTextColor() {
        return f27456P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldFocusSupportingTextColor() {
        return f27460T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldHoverInputTextColor() {
        return f27462V;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldHoverLabelTextColor() {
        return f27463W;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldHoverSupportingTextColor() {
        return f27468a0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldInputTextColor() {
        return f27472c0;
    }

    @NotNull
    public final TypographyKeyTokens getFieldInputTextFont() {
        return f27474d0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldLabelTextColor() {
        return f27476e0;
    }

    @NotNull
    public final TypographyKeyTokens getFieldLabelTextFont() {
        return f27478f0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldSupportingTextColor() {
        return f27488k0;
    }

    @NotNull
    public final TypographyKeyTokens getFieldSupportingTextFont() {
        return f27490l0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuContainerColor() {
        return f27467a;
    }

    /* renamed from: getMenuContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71121getMenuContainerElevationD9Ej5fM() {
        return f27469b;
    }

    @NotNull
    public final ShapeKeyTokens getMenuContainerShape() {
        return f27471c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuContainerSurfaceTintLayerColor() {
        return f27473d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuDividerColor() {
        return f27475e;
    }

    /* renamed from: getMenuDividerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71122getMenuDividerHeightD9Ej5fM() {
        return f27477f;
    }

    /* renamed from: getMenuListItemContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71123getMenuListItemContainerHeightD9Ej5fM() {
        return f27479g;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuListItemLabelTextColor() {
        return f27481h;
    }

    @NotNull
    public final TypographyKeyTokens getMenuListItemLabelTextFont() {
        return f27483i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuListItemSelectedContainerColor() {
        return f27485j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldCaretColor() {
        return f27487k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldContainerColor() {
        return f27489l;
    }

    /* renamed from: getTextFieldContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71124getTextFieldContainerHeightD9Ej5fM() {
        return f27491m;
    }

    @NotNull
    public final ShapeKeyTokens getTextFieldContainerShape() {
        return f27493n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledLeadingIconColor() {
        return f27497q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledOutlineColor() {
        return f27498r;
    }

    /* renamed from: getTextFieldDisabledOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71125getTextFieldDisabledOutlineWidthD9Ej5fM() {
        return f27499s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledTrailingIconColor() {
        return f27501u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusCaretColor() {
        return f27502v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusLeadingIconColor() {
        return f27505y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusOutlineColor() {
        return f27506z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusTrailingIconColor() {
        return f27442B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverLeadingIconColor() {
        return f27445E;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverOutlineColor() {
        return f27446F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverTrailingIconColor() {
        return f27448H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorLeadingIconColor() {
        return f27451K;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorOutlineColor() {
        return f27452L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorTrailingIconColor() {
        return f27454N;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusLeadingIconColor() {
        return f27457Q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusOutlineColor() {
        return f27458R;
    }

    /* renamed from: getTextFieldFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71126getTextFieldFocusOutlineWidthD9Ej5fM() {
        return f27459S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusTrailingIconColor() {
        return f27461U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverLeadingIconColor() {
        return f27464X;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverOutlineColor() {
        return f27465Y;
    }

    /* renamed from: getTextFieldHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71127getTextFieldHoverOutlineWidthD9Ej5fM() {
        return f27466Z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverTrailingIconColor() {
        return f27470b0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldLeadingIconColor() {
        return f27480g0;
    }

    /* renamed from: getTextFieldLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71128getTextFieldLeadingIconSizeD9Ej5fM() {
        return f27482h0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldOutlineColor() {
        return f27484i0;
    }

    /* renamed from: getTextFieldOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71129getTextFieldOutlineWidthD9Ej5fM() {
        return f27486j0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldTrailingIconColor() {
        return f27492m0;
    }

    /* renamed from: getTextFieldTrailingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71130getTextFieldTrailingIconSizeD9Ej5fM() {
        return f27494n0;
    }
}
