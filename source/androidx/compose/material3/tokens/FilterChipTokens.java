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

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\bj\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R \u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR \u0010 \u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010#\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014R \u0010&\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u0014\u0010'\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R \u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR \u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b1\u0010\u0012\u001a\u0004\b2\u0010\u0014R\u0017\u00106\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b4\u0010\u0012\u001a\u0004\b5\u0010\u0014R \u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b:\u0010\u0012\u001a\u0004\b;\u0010\u0014R\u0014\u0010=\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0006R\u0017\u0010@\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b>\u0010\u0012\u001a\u0004\b?\u0010\u0014R\u0014\u0010A\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0006R\u0017\u0010D\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bB\u0010\u0012\u001a\u0004\bC\u0010\u0014R \u0010G\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR \u0010J\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR \u0010M\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR \u0010P\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR \u0010S\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010V\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bT\u0010\u0012\u001a\u0004\bU\u0010\u0014R \u0010Y\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010\\\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bZ\u0010\u0012\u001a\u0004\b[\u0010\u0014R \u0010_\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR \u0010b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\ba\u0010\bR\u0017\u0010h\u001a\u00020c8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010k\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bi\u0010\u0012\u001a\u0004\bj\u0010\u0014R\u0017\u0010n\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bl\u0010\u0012\u001a\u0004\bm\u0010\u0014R\u0017\u0010q\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bo\u0010\u0012\u001a\u0004\bp\u0010\u0014R\u0017\u0010s\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\br\u0010\u0014R\u0017\u0010v\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bt\u0010\u0012\u001a\u0004\bu\u0010\u0014R\u0017\u0010y\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bw\u0010\u0012\u001a\u0004\bx\u0010\u0014R\u0017\u0010|\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bz\u0010\u0012\u001a\u0004\b{\u0010\u0014R\u0017\u0010\u007f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b}\u0010\u0012\u001a\u0004\b~\u0010\u0014R\u001a\u0010\u0082\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0012\u001a\u0005\b\u0081\u0001\u0010\u0014R\u001a\u0010\u0085\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0012\u001a\u0005\b\u0084\u0001\u0010\u0014R#\u0010\u0088\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0006\u001a\u0005\b\u0087\u0001\u0010\bR\u001a\u0010\u008b\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0012\u001a\u0005\b\u008a\u0001\u0010\u0014R\u0016\u0010\u008c\u0001\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u0006R\u001a\u0010\u008f\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0012\u001a\u0005\b\u008e\u0001\u0010\u0014R\u001a\u0010\u0092\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0012\u001a\u0005\b\u0091\u0001\u0010\u0014R\u001a\u0010\u0095\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0012\u001a\u0005\b\u0094\u0001\u0010\u0014R\u001a\u0010\u0098\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0012\u001a\u0005\b\u0097\u0001\u0010\u0014R\u001a\u0010\u009b\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0012\u001a\u0005\b\u009a\u0001\u0010\u0014R\u001a\u0010\u009e\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0012\u001a\u0005\b\u009d\u0001\u0010\u0014R\u001a\u0010¡\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0012\u001a\u0005\b \u0001\u0010\u0014R\u001a\u0010¤\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0012\u001a\u0005\b£\u0001\u0010\u0014R\u001a\u0010§\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0012\u001a\u0005\b¦\u0001\u0010\u0014R\u001a\u0010ª\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010\u0012\u001a\u0005\b©\u0001\u0010\u0014R\u001a\u0010\u00ad\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0012\u001a\u0005\b¬\u0001\u0010\u0014R\u0016\u0010®\u0001\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0007\n\u0005\b®\u0001\u0010\u0006R\u001a\u0010±\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0012\u001a\u0005\b°\u0001\u0010\u0014R\u001a\u0010´\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010\u0012\u001a\u0005\b³\u0001\u0010\u0014R\u001a\u0010·\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0012\u001a\u0005\b¶\u0001\u0010\u0014R\u001a\u0010º\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b¸\u0001\u0010\u0012\u001a\u0005\b¹\u0001\u0010\u0014R\u001a\u0010½\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0012\u001a\u0005\b¼\u0001\u0010\u0014R\u001a\u0010À\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b¾\u0001\u0010\u0012\u001a\u0005\b¿\u0001\u0010\u0014R\u001a\u0010Ã\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0012\u001a\u0005\bÂ\u0001\u0010\u0014R\u001a\u0010Æ\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\bÄ\u0001\u0010\u0012\u001a\u0005\bÅ\u0001\u0010\u0014R\u001a\u0010É\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0012\u001a\u0005\bÈ\u0001\u0010\u0014R\u001a\u0010Ì\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\bÊ\u0001\u0010\u0012\u001a\u0005\bË\u0001\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Í\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/FilterChipTokens;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", OperatorName.CURVE_TO, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerSurfaceTintLayerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerSurfaceTintLayerColor", "d", "getDisabledLabelTextColor", "DisabledLabelTextColor", "", "DisabledLabelTextOpacity", "e", "getDraggedContainerElevation-D9Ej5fM", "DraggedContainerElevation", OperatorName.FILL_NON_ZERO, "getElevatedContainerElevation-D9Ej5fM", "ElevatedContainerElevation", OperatorName.NON_STROKING_GRAY, "getElevatedDisabledContainerColor", "ElevatedDisabledContainerColor", OperatorName.CLOSE_PATH, "getElevatedDisabledContainerElevation-D9Ej5fM", "ElevatedDisabledContainerElevation", "ElevatedDisabledContainerOpacity", "i", "getElevatedFocusContainerElevation-D9Ej5fM", "ElevatedFocusContainerElevation", OperatorName.SET_LINE_JOINSTYLE, "getElevatedHoverContainerElevation-D9Ej5fM", "ElevatedHoverContainerElevation", OperatorName.NON_STROKING_CMYK, "getElevatedPressedContainerElevation-D9Ej5fM", "ElevatedPressedContainerElevation", OperatorName.LINE_TO, "getElevatedSelectedContainerColor", "ElevatedSelectedContainerColor", OperatorName.MOVE_TO, "getElevatedUnselectedContainerColor", "ElevatedUnselectedContainerColor", OperatorName.ENDPATH, "getFlatContainerElevation-D9Ej5fM", "FlatContainerElevation", "o", "getFlatDisabledSelectedContainerColor", "FlatDisabledSelectedContainerColor", "FlatDisabledSelectedContainerOpacity", "p", "getFlatDisabledUnselectedOutlineColor", "FlatDisabledUnselectedOutlineColor", "FlatDisabledUnselectedOutlineOpacity", OperatorName.SAVE, "getFlatSelectedContainerColor", "FlatSelectedContainerColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getFlatSelectedFocusContainerElevation-D9Ej5fM", "FlatSelectedFocusContainerElevation", OperatorName.CLOSE_AND_STROKE, "getFlatSelectedHoverContainerElevation-D9Ej5fM", "FlatSelectedHoverContainerElevation", "t", "getFlatSelectedOutlineWidth-D9Ej5fM", "FlatSelectedOutlineWidth", "u", "getFlatSelectedPressedContainerElevation-D9Ej5fM", "FlatSelectedPressedContainerElevation", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getFlatUnselectedFocusContainerElevation-D9Ej5fM", "FlatUnselectedFocusContainerElevation", OperatorName.SET_LINE_WIDTH, "getFlatUnselectedFocusOutlineColor", "FlatUnselectedFocusOutlineColor", "x", "getFlatUnselectedHoverContainerElevation-D9Ej5fM", "FlatUnselectedHoverContainerElevation", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getFlatUnselectedOutlineColor", "FlatUnselectedOutlineColor", "z", "getFlatUnselectedOutlineWidth-D9Ej5fM", "FlatUnselectedOutlineWidth", "A", "getFlatUnselectedPressedContainerElevation-D9Ej5fM", "FlatUnselectedPressedContainerElevation", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "B", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "C", "getSelectedDraggedLabelTextColor", "SelectedDraggedLabelTextColor", "D", "getSelectedFocusLabelTextColor", "SelectedFocusLabelTextColor", ExifInterface.LONGITUDE_EAST, "getSelectedHoverLabelTextColor", "SelectedHoverLabelTextColor", "getSelectedLabelTextColor", "SelectedLabelTextColor", OperatorName.STROKING_COLOR_GRAY, "getSelectedPressedLabelTextColor", "SelectedPressedLabelTextColor", "H", "getUnselectedDraggedLabelTextColor", "UnselectedDraggedLabelTextColor", "I", "getUnselectedFocusLabelTextColor", "UnselectedFocusLabelTextColor", OperatorName.SET_LINE_CAPSTYLE, "getUnselectedHoverLabelTextColor", "UnselectedHoverLabelTextColor", "K", "getUnselectedLabelTextColor", "UnselectedLabelTextColor", "L", "getUnselectedPressedLabelTextColor", "UnselectedPressedLabelTextColor", "M", "getIconSize-D9Ej5fM", "IconSize", "N", "getDisabledLeadingIconColor", "DisabledLeadingIconColor", "DisabledLeadingIconOpacity", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getLeadingIconUnselectedColor", "LeadingIconUnselectedColor", "P", "getSelectedDraggedLeadingIconColor", "SelectedDraggedLeadingIconColor", OperatorName.RESTORE, "getSelectedFocusLeadingIconColor", "SelectedFocusLeadingIconColor", "R", "getSelectedHoverLeadingIconColor", "SelectedHoverLeadingIconColor", "S", "getSelectedLeadingIconColor", "SelectedLeadingIconColor", "T", "getSelectedPressedLeadingIconColor", "SelectedPressedLeadingIconColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getUnselectedDraggedLeadingIconColor", "UnselectedDraggedLeadingIconColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getUnselectedFocusLeadingIconColor", "UnselectedFocusLeadingIconColor", "W", "getUnselectedHoverLeadingIconColor", "UnselectedHoverLeadingIconColor", "X", "getUnselectedPressedLeadingIconColor", "UnselectedPressedLeadingIconColor", "Y", "getDisabledTrailingIconColor", "DisabledTrailingIconColor", "DisabledTrailingIconOpacity", "Z", "getSelectedDraggedTrailingIconColor", "SelectedDraggedTrailingIconColor", "a0", "getSelectedFocusTrailingIconColor", "SelectedFocusTrailingIconColor", "b0", "getSelectedHoverTrailingIconColor", "SelectedHoverTrailingIconColor", "c0", "getSelectedPressedTrailingIconColor", "SelectedPressedTrailingIconColor", OperatorName.TYPE3_D0, "getSelectedTrailingIconColor", "SelectedTrailingIconColor", "e0", "getTrailingIconUnselectedColor", "TrailingIconUnselectedColor", "f0", "getUnselectedDraggedTrailingIconColor", "UnselectedDraggedTrailingIconColor", "g0", "getUnselectedFocusTrailingIconColor", "UnselectedFocusTrailingIconColor", "h0", "getUnselectedHoverTrailingIconColor", "UnselectedHoverTrailingIconColor", "i0", "getUnselectedPressedTrailingIconColor", "UnselectedPressedTrailingIconColor", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFilterChipTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterChipTokens.kt\nandroidx/compose/material3/tokens/FilterChipTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,91:1\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n*S KotlinDebug\n*F\n+ 1 FilterChipTokens.kt\nandroidx/compose/material3/tokens/FilterChipTokens\n*L\n24#1:92\n47#1:93\n53#1:94\n66#1:95\n*E\n"})
/* loaded from: classes2.dex */
public final class FilterChipTokens {

    /* renamed from: A */
    public static final float f27131A;

    /* renamed from: B */
    public static final TypographyKeyTokens f27132B;

    /* renamed from: C */
    public static final ColorSchemeKeyTokens f27133C;

    /* renamed from: D */
    public static final ColorSchemeKeyTokens f27134D;
    public static final float DisabledLabelTextOpacity = 0.38f;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    public static final float DisabledTrailingIconOpacity = 0.38f;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f27135E;
    public static final float ElevatedDisabledContainerOpacity = 0.12f;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f27136F;
    public static final float FlatDisabledSelectedContainerOpacity = 0.12f;
    public static final float FlatDisabledUnselectedOutlineOpacity = 0.12f;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f27137G;

    /* renamed from: H */
    public static final ColorSchemeKeyTokens f27138H;

    /* renamed from: I */
    public static final ColorSchemeKeyTokens f27139I;

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f27140J;

    /* renamed from: K */
    public static final ColorSchemeKeyTokens f27141K;

    /* renamed from: L */
    public static final ColorSchemeKeyTokens f27142L;

    /* renamed from: M */
    public static final float f27143M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f27144N;

    /* renamed from: O */
    public static final ColorSchemeKeyTokens f27145O;

    /* renamed from: P */
    public static final ColorSchemeKeyTokens f27146P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f27147Q;

    /* renamed from: R */
    public static final ColorSchemeKeyTokens f27148R;

    /* renamed from: S */
    public static final ColorSchemeKeyTokens f27149S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f27150T;

    /* renamed from: U */
    public static final ColorSchemeKeyTokens f27151U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f27152V;

    /* renamed from: W */
    public static final ColorSchemeKeyTokens f27153W;

    /* renamed from: X */
    public static final ColorSchemeKeyTokens f27154X;

    /* renamed from: Y */
    public static final ColorSchemeKeyTokens f27155Y;

    /* renamed from: Z */
    public static final ColorSchemeKeyTokens f27156Z;

    /* renamed from: a0 */
    public static final ColorSchemeKeyTokens f27158a0;

    /* renamed from: b0 */
    public static final ColorSchemeKeyTokens f27160b0;

    /* renamed from: c0 */
    public static final ColorSchemeKeyTokens f27162c0;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27163d;

    /* renamed from: d0 */
    public static final ColorSchemeKeyTokens f27164d0;

    /* renamed from: e */
    public static final float f27165e;

    /* renamed from: e0 */
    public static final ColorSchemeKeyTokens f27166e0;

    /* renamed from: f */
    public static final float f27167f;

    /* renamed from: f0 */
    public static final ColorSchemeKeyTokens f27168f0;

    /* renamed from: g */
    public static final ColorSchemeKeyTokens f27169g;

    /* renamed from: g0 */
    public static final ColorSchemeKeyTokens f27170g0;

    /* renamed from: h */
    public static final float f27171h;

    /* renamed from: h0 */
    public static final ColorSchemeKeyTokens f27172h0;

    /* renamed from: i */
    public static final float f27173i;

    /* renamed from: i0 */
    public static final ColorSchemeKeyTokens f27174i0;

    /* renamed from: j */
    public static final float f27175j;

    /* renamed from: k */
    public static final float f27176k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27177l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f27178m;

    /* renamed from: n */
    public static final float f27179n;

    /* renamed from: o */
    public static final ColorSchemeKeyTokens f27180o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f27181p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f27182q;

    /* renamed from: r */
    public static final float f27183r;

    /* renamed from: s */
    public static final float f27184s;

    /* renamed from: t */
    public static final float f27185t;

    /* renamed from: u */
    public static final float f27186u;

    /* renamed from: v */
    public static final float f27187v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27188w;

    /* renamed from: x */
    public static final float f27189x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f27190y;

    /* renamed from: z */
    public static final float f27191z;
    @NotNull
    public static final FilterChipTokens INSTANCE = new FilterChipTokens();

    /* renamed from: a */
    public static final float f27157a = C3641Dp.m73658constructorimpl((float) 32.0d);

    /* renamed from: b */
    public static final ShapeKeyTokens f27159b = ShapeKeyTokens.CornerSmall;

    /* renamed from: c */
    public static final ColorSchemeKeyTokens f27161c = ColorSchemeKeyTokens.SurfaceTint;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f27163d = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        f27165e = elevationTokens.m70959getLevel4D9Ej5fM();
        f27167f = elevationTokens.m70956getLevel1D9Ej5fM();
        f27169g = colorSchemeKeyTokens;
        f27171h = elevationTokens.m70955getLevel0D9Ej5fM();
        f27173i = elevationTokens.m70956getLevel1D9Ej5fM();
        f27175j = elevationTokens.m70957getLevel2D9Ej5fM();
        f27176k = elevationTokens.m70956getLevel1D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SecondaryContainer;
        f27177l = colorSchemeKeyTokens2;
        f27178m = ColorSchemeKeyTokens.Surface;
        f27179n = elevationTokens.m70955getLevel0D9Ej5fM();
        f27180o = colorSchemeKeyTokens;
        f27181p = colorSchemeKeyTokens;
        f27182q = colorSchemeKeyTokens2;
        f27183r = elevationTokens.m70955getLevel0D9Ej5fM();
        f27184s = elevationTokens.m70956getLevel1D9Ej5fM();
        f27185t = C3641Dp.m73658constructorimpl((float) 0.0d);
        f27186u = elevationTokens.m70955getLevel0D9Ej5fM();
        f27187v = elevationTokens.m70955getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27188w = colorSchemeKeyTokens3;
        f27189x = elevationTokens.m70955getLevel0D9Ej5fM();
        f27190y = ColorSchemeKeyTokens.Outline;
        f27191z = C3641Dp.m73658constructorimpl((float) 1.0d);
        f27131A = elevationTokens.m70955getLevel0D9Ej5fM();
        f27132B = TypographyKeyTokens.LabelLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSecondaryContainer;
        f27133C = colorSchemeKeyTokens4;
        f27134D = colorSchemeKeyTokens4;
        f27135E = colorSchemeKeyTokens4;
        f27136F = colorSchemeKeyTokens4;
        f27137G = colorSchemeKeyTokens4;
        f27138H = colorSchemeKeyTokens3;
        f27139I = colorSchemeKeyTokens3;
        f27140J = colorSchemeKeyTokens3;
        f27141K = colorSchemeKeyTokens3;
        f27142L = colorSchemeKeyTokens3;
        f27143M = C3641Dp.m73658constructorimpl((float) 18.0d);
        f27144N = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Primary;
        f27145O = colorSchemeKeyTokens5;
        f27146P = colorSchemeKeyTokens4;
        f27147Q = colorSchemeKeyTokens4;
        f27148R = colorSchemeKeyTokens4;
        f27149S = colorSchemeKeyTokens4;
        f27150T = colorSchemeKeyTokens4;
        f27151U = colorSchemeKeyTokens5;
        f27152V = colorSchemeKeyTokens5;
        f27153W = colorSchemeKeyTokens5;
        f27154X = colorSchemeKeyTokens5;
        f27155Y = colorSchemeKeyTokens;
        f27156Z = colorSchemeKeyTokens4;
        f27158a0 = colorSchemeKeyTokens4;
        f27160b0 = colorSchemeKeyTokens4;
        f27162c0 = colorSchemeKeyTokens4;
        f27164d0 = colorSchemeKeyTokens4;
        f27166e0 = colorSchemeKeyTokens3;
        f27168f0 = colorSchemeKeyTokens3;
        f27170g0 = colorSchemeKeyTokens3;
        f27172h0 = colorSchemeKeyTokens3;
        f27174i0 = colorSchemeKeyTokens3;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71057getContainerHeightD9Ej5fM() {
        return f27157a;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f27159b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return f27161c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return f27163d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return f27144N;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return f27155Y;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71058getDraggedContainerElevationD9Ej5fM() {
        return f27165e;
    }

    /* renamed from: getElevatedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71059getElevatedContainerElevationD9Ej5fM() {
        return f27167f;
    }

    @NotNull
    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return f27169g;
    }

    /* renamed from: getElevatedDisabledContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71060getElevatedDisabledContainerElevationD9Ej5fM() {
        return f27171h;
    }

    /* renamed from: getElevatedFocusContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71061getElevatedFocusContainerElevationD9Ej5fM() {
        return f27173i;
    }

    /* renamed from: getElevatedHoverContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71062getElevatedHoverContainerElevationD9Ej5fM() {
        return f27175j;
    }

    /* renamed from: getElevatedPressedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71063getElevatedPressedContainerElevationD9Ej5fM() {
        return f27176k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getElevatedSelectedContainerColor() {
        return f27177l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getElevatedUnselectedContainerColor() {
        return f27178m;
    }

    /* renamed from: getFlatContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71064getFlatContainerElevationD9Ej5fM() {
        return f27179n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatDisabledSelectedContainerColor() {
        return f27180o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatDisabledUnselectedOutlineColor() {
        return f27181p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatSelectedContainerColor() {
        return f27182q;
    }

    /* renamed from: getFlatSelectedFocusContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71065getFlatSelectedFocusContainerElevationD9Ej5fM() {
        return f27183r;
    }

    /* renamed from: getFlatSelectedHoverContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71066getFlatSelectedHoverContainerElevationD9Ej5fM() {
        return f27184s;
    }

    /* renamed from: getFlatSelectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71067getFlatSelectedOutlineWidthD9Ej5fM() {
        return f27185t;
    }

    /* renamed from: getFlatSelectedPressedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71068getFlatSelectedPressedContainerElevationD9Ej5fM() {
        return f27186u;
    }

    /* renamed from: getFlatUnselectedFocusContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71069getFlatUnselectedFocusContainerElevationD9Ej5fM() {
        return f27187v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatUnselectedFocusOutlineColor() {
        return f27188w;
    }

    /* renamed from: getFlatUnselectedHoverContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71070getFlatUnselectedHoverContainerElevationD9Ej5fM() {
        return f27189x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatUnselectedOutlineColor() {
        return f27190y;
    }

    /* renamed from: getFlatUnselectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71071getFlatUnselectedOutlineWidthD9Ej5fM() {
        return f27191z;
    }

    /* renamed from: getFlatUnselectedPressedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71072getFlatUnselectedPressedContainerElevationD9Ej5fM() {
        return f27131A;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71073getIconSizeD9Ej5fM() {
        return f27143M;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return f27132B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLeadingIconUnselectedColor() {
        return f27145O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDraggedLabelTextColor() {
        return f27133C;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDraggedLeadingIconColor() {
        return f27146P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDraggedTrailingIconColor() {
        return f27156Z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusLabelTextColor() {
        return f27134D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusLeadingIconColor() {
        return f27147Q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusTrailingIconColor() {
        return f27158a0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverLabelTextColor() {
        return f27135E;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverLeadingIconColor() {
        return f27148R;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverTrailingIconColor() {
        return f27160b0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedLabelTextColor() {
        return f27136F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedLeadingIconColor() {
        return f27149S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return f27137G;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedLeadingIconColor() {
        return f27150T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedTrailingIconColor() {
        return f27162c0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedTrailingIconColor() {
        return f27164d0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTrailingIconUnselectedColor() {
        return f27166e0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDraggedLabelTextColor() {
        return f27138H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDraggedLeadingIconColor() {
        return f27151U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDraggedTrailingIconColor() {
        return f27168f0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusLabelTextColor() {
        return f27139I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusLeadingIconColor() {
        return f27152V;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusTrailingIconColor() {
        return f27170g0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverLabelTextColor() {
        return f27140J;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverLeadingIconColor() {
        return f27153W;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverTrailingIconColor() {
        return f27172h0;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedLabelTextColor() {
        return f27141K;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return f27142L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedLeadingIconColor() {
        return f27154X;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedTrailingIconColor() {
        return f27174i0;
    }
}
