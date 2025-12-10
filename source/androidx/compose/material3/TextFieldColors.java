package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b2\b\u0007\u0018\u00002\u00020\u0001Bä\u0002\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100J0\u00109\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108J0\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\b:\u00108J0\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\b<\u00108J0\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\b>\u00108J0\u0010A\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\b@\u00108J0\u0010C\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\bB\u00108J0\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\bD\u00108J0\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\bF\u00108J0\u0010I\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\bH\u00108J0\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00105\u001a\u000204H\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u00108J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u0002062\u0006\u00103\u001a\u000201H\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001a\u0010O\u001a\u0002012\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SR\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bV\u0010UR\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bW\u0010UR\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bX\u0010UR\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bY\u0010UR\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bZ\u0010UR\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b[\u0010UR\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\\\u0010UR\u001d\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b]\u0010UR\u001d\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b^\u0010UR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001d\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\ba\u0010UR\u001d\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bb\u0010UR\u001d\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bc\u0010UR\u001d\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bd\u0010UR\u001d\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\be\u0010UR\u001d\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bf\u0010UR\u001d\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bg\u0010UR\u001d\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bh\u0010UR\u001d\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bi\u0010UR\u001d\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bj\u0010UR\u001d\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bk\u0010UR\u001d\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bl\u0010UR\u001d\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bm\u0010UR\u001d\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bn\u0010UR\u001d\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bo\u0010UR\u001d\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bp\u0010UR\u001d\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bq\u0010UR\u001d\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\br\u0010UR\u001d\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bs\u0010UR\u001d\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bt\u0010UR\u001d\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bu\u0010UR\u001d\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bv\u0010UR\u001d\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bw\u0010UR\u001d\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bx\u0010UR\u001d\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bU\u0010UR\u001d\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\by\u0010UR\u001d\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bz\u0010UR\u001d\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b{\u0010UR\u001d\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b|\u0010UR\u001d\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b}\u0010UR\u001d\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b~\u0010UR\u001d\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u007f\u0010UR\u0017\u0010\u0082\u0001\u001a\u00020\r8AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0083\u0001"}, m28850d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "leadingIconColor$material3_release", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "leadingIconColor", "trailingIconColor$material3_release", "trailingIconColor", "indicatorColor$material3_release", "indicatorColor", "containerColor$material3_release", "containerColor", "placeholderColor$material3_release", "placeholderColor", "labelColor$material3_release", "labelColor", "textColor$material3_release", "textColor", "supportingTextColor$material3_release", "supportingTextColor", "prefixColor$material3_release", "prefixColor", "suffixColor$material3_release", "suffixColor", "cursorColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, "Landroidx/compose/foundation/text/selection/TextSelectionColors;", OperatorName.LINE_TO, OperatorName.MOVE_TO, OperatorName.ENDPATH, "o", "p", OperatorName.SAVE, PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.CLOSE_AND_STROKE, "t", "u", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.SET_LINE_WIDTH, "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "z", "A", "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", OperatorName.STROKING_COLOR_GRAY, "H", "I", "K", "L", "M", "N", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "P", OperatorName.RESTORE, "getSelectionColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2124:1\n76#2:2125\n76#2:2126\n76#2:2127\n76#2:2128\n76#2:2129\n76#2:2130\n76#2:2131\n76#2:2132\n76#2:2133\n76#2:2134\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n*L\n1754#1:2125\n1780#1:2126\n1806#1:2127\n1835#1:2128\n1860#1:2129\n1885#1:2130\n1910#1:2131\n1927#1:2132\n1953#1:2133\n1978#1:2134\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldColors {
    public static final int $stable = 0;

    /* renamed from: A */
    public final long f26304A;

    /* renamed from: B */
    public final long f26305B;

    /* renamed from: C */
    public final long f26306C;

    /* renamed from: D */
    public final long f26307D;

    /* renamed from: E */
    public final long f26308E;

    /* renamed from: F */
    public final long f26309F;

    /* renamed from: G */
    public final long f26310G;

    /* renamed from: H */
    public final long f26311H;

    /* renamed from: I */
    public final long f26312I;

    /* renamed from: J */
    public final long f26313J;

    /* renamed from: K */
    public final long f26314K;

    /* renamed from: L */
    public final long f26315L;

    /* renamed from: M */
    public final long f26316M;

    /* renamed from: N */
    public final long f26317N;

    /* renamed from: O */
    public final long f26318O;

    /* renamed from: P */
    public final long f26319P;

    /* renamed from: Q */
    public final long f26320Q;

    /* renamed from: a */
    public final long f26321a;

    /* renamed from: b */
    public final long f26322b;

    /* renamed from: c */
    public final long f26323c;

    /* renamed from: d */
    public final long f26324d;

    /* renamed from: e */
    public final long f26325e;

    /* renamed from: f */
    public final long f26326f;

    /* renamed from: g */
    public final long f26327g;

    /* renamed from: h */
    public final long f26328h;

    /* renamed from: i */
    public final long f26329i;

    /* renamed from: j */
    public final long f26330j;

    /* renamed from: k */
    public final TextSelectionColors f26331k;

    /* renamed from: l */
    public final long f26332l;

    /* renamed from: m */
    public final long f26333m;

    /* renamed from: n */
    public final long f26334n;

    /* renamed from: o */
    public final long f26335o;

    /* renamed from: p */
    public final long f26336p;

    /* renamed from: q */
    public final long f26337q;

    /* renamed from: r */
    public final long f26338r;

    /* renamed from: s */
    public final long f26339s;

    /* renamed from: t */
    public final long f26340t;

    /* renamed from: u */
    public final long f26341u;

    /* renamed from: v */
    public final long f26342v;

    /* renamed from: w */
    public final long f26343w;

    /* renamed from: x */
    public final long f26344x;

    /* renamed from: y */
    public final long f26345y;

    /* renamed from: z */
    public final long f26346z;

    public /* synthetic */ TextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, textSelectionColors, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42);
    }

    /* renamed from: a */
    public static final boolean m60474a(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m60473b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static final boolean m60472c(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: d */
    public static final boolean m60471d(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: e */
    public static final boolean m60470e(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: f */
    public static final boolean m60469f(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: g */
    public static final boolean m60468g(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: h */
    public static final boolean m60467h(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: i */
    public static final boolean m60466i(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: j */
    public static final boolean m60465j(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1921164569);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1921164569, i, -1, "androidx.compose.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:1829)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26327g;
        } else if (z2) {
            j = this.f26328h;
        } else if (m60474a(collectIsFocusedAsState)) {
            j = this.f26325e;
        } else {
            j = this.f26326f;
        }
        State<Color> m69242animateColorAsStateeuL9pac = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69242animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> cursorColor$material3_release(boolean z, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1885422187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1885422187, i, -1, "androidx.compose.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:1994)");
        }
        if (z) {
            j = this.f26330j;
        } else {
            j = this.f26329i;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) obj;
        if (Color.m71736equalsimpl0(this.f26321a, textFieldColors.f26321a) && Color.m71736equalsimpl0(this.f26322b, textFieldColors.f26322b) && Color.m71736equalsimpl0(this.f26323c, textFieldColors.f26323c) && Color.m71736equalsimpl0(this.f26324d, textFieldColors.f26324d) && Color.m71736equalsimpl0(this.f26325e, textFieldColors.f26325e) && Color.m71736equalsimpl0(this.f26326f, textFieldColors.f26326f) && Color.m71736equalsimpl0(this.f26327g, textFieldColors.f26327g) && Color.m71736equalsimpl0(this.f26328h, textFieldColors.f26328h) && Color.m71736equalsimpl0(this.f26329i, textFieldColors.f26329i) && Color.m71736equalsimpl0(this.f26330j, textFieldColors.f26330j) && Intrinsics.areEqual(this.f26331k, textFieldColors.f26331k) && Color.m71736equalsimpl0(this.f26332l, textFieldColors.f26332l) && Color.m71736equalsimpl0(this.f26333m, textFieldColors.f26333m) && Color.m71736equalsimpl0(this.f26334n, textFieldColors.f26334n) && Color.m71736equalsimpl0(this.f26335o, textFieldColors.f26335o) && Color.m71736equalsimpl0(this.f26336p, textFieldColors.f26336p) && Color.m71736equalsimpl0(this.f26337q, textFieldColors.f26337q) && Color.m71736equalsimpl0(this.f26338r, textFieldColors.f26338r) && Color.m71736equalsimpl0(this.f26339s, textFieldColors.f26339s) && Color.m71736equalsimpl0(this.f26340t, textFieldColors.f26340t) && Color.m71736equalsimpl0(this.f26341u, textFieldColors.f26341u) && Color.m71736equalsimpl0(this.f26342v, textFieldColors.f26342v) && Color.m71736equalsimpl0(this.f26343w, textFieldColors.f26343w) && Color.m71736equalsimpl0(this.f26344x, textFieldColors.f26344x) && Color.m71736equalsimpl0(this.f26345y, textFieldColors.f26345y) && Color.m71736equalsimpl0(this.f26346z, textFieldColors.f26346z) && Color.m71736equalsimpl0(this.f26304A, textFieldColors.f26304A) && Color.m71736equalsimpl0(this.f26305B, textFieldColors.f26305B) && Color.m71736equalsimpl0(this.f26306C, textFieldColors.f26306C) && Color.m71736equalsimpl0(this.f26307D, textFieldColors.f26307D) && Color.m71736equalsimpl0(this.f26308E, textFieldColors.f26308E) && Color.m71736equalsimpl0(this.f26309F, textFieldColors.f26309F) && Color.m71736equalsimpl0(this.f26310G, textFieldColors.f26310G) && Color.m71736equalsimpl0(this.f26311H, textFieldColors.f26311H) && Color.m71736equalsimpl0(this.f26312I, textFieldColors.f26312I) && Color.m71736equalsimpl0(this.f26313J, textFieldColors.f26313J) && Color.m71736equalsimpl0(this.f26314K, textFieldColors.f26314K) && Color.m71736equalsimpl0(this.f26315L, textFieldColors.f26315L) && Color.m71736equalsimpl0(this.f26316M, textFieldColors.f26316M) && Color.m71736equalsimpl0(this.f26317N, textFieldColors.f26317N) && Color.m71736equalsimpl0(this.f26318O, textFieldColors.f26318O) && Color.m71736equalsimpl0(this.f26319P, textFieldColors.f26319P) && Color.m71736equalsimpl0(this.f26320Q, textFieldColors.f26320Q)) {
            return true;
        }
        return false;
    }

    @Composable
    @JvmName(name = "getSelectionColors")
    @NotNull
    public final TextSelectionColors getSelectionColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(997785083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(997785083, i, -1, "androidx.compose.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:2002)");
        }
        TextSelectionColors textSelectionColors = this.f26331k;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m71742hashCodeimpl(this.f26321a) * 31) + Color.m71742hashCodeimpl(this.f26322b)) * 31) + Color.m71742hashCodeimpl(this.f26323c)) * 31) + Color.m71742hashCodeimpl(this.f26324d)) * 31) + Color.m71742hashCodeimpl(this.f26325e)) * 31) + Color.m71742hashCodeimpl(this.f26326f)) * 31) + Color.m71742hashCodeimpl(this.f26327g)) * 31) + Color.m71742hashCodeimpl(this.f26328h)) * 31) + Color.m71742hashCodeimpl(this.f26329i)) * 31) + Color.m71742hashCodeimpl(this.f26330j)) * 31) + this.f26331k.hashCode()) * 31) + Color.m71742hashCodeimpl(this.f26332l)) * 31) + Color.m71742hashCodeimpl(this.f26333m)) * 31) + Color.m71742hashCodeimpl(this.f26334n)) * 31) + Color.m71742hashCodeimpl(this.f26335o)) * 31) + Color.m71742hashCodeimpl(this.f26336p)) * 31) + Color.m71742hashCodeimpl(this.f26337q)) * 31) + Color.m71742hashCodeimpl(this.f26338r)) * 31) + Color.m71742hashCodeimpl(this.f26339s)) * 31) + Color.m71742hashCodeimpl(this.f26340t)) * 31) + Color.m71742hashCodeimpl(this.f26341u)) * 31) + Color.m71742hashCodeimpl(this.f26342v)) * 31) + Color.m71742hashCodeimpl(this.f26343w)) * 31) + Color.m71742hashCodeimpl(this.f26344x)) * 31) + Color.m71742hashCodeimpl(this.f26345y)) * 31) + Color.m71742hashCodeimpl(this.f26346z)) * 31) + Color.m71742hashCodeimpl(this.f26304A)) * 31) + Color.m71742hashCodeimpl(this.f26305B)) * 31) + Color.m71742hashCodeimpl(this.f26306C)) * 31) + Color.m71742hashCodeimpl(this.f26307D)) * 31) + Color.m71742hashCodeimpl(this.f26308E)) * 31) + Color.m71742hashCodeimpl(this.f26309F)) * 31) + Color.m71742hashCodeimpl(this.f26310G)) * 31) + Color.m71742hashCodeimpl(this.f26311H)) * 31) + Color.m71742hashCodeimpl(this.f26312I)) * 31) + Color.m71742hashCodeimpl(this.f26313J)) * 31) + Color.m71742hashCodeimpl(this.f26314K)) * 31) + Color.m71742hashCodeimpl(this.f26315L)) * 31) + Color.m71742hashCodeimpl(this.f26316M)) * 31) + Color.m71742hashCodeimpl(this.f26317N)) * 31) + Color.m71742hashCodeimpl(this.f26318O)) * 31) + Color.m71742hashCodeimpl(this.f26319P)) * 31) + Color.m71742hashCodeimpl(this.f26320Q);
    }

    @Composable
    @NotNull
    public final State<Color> indicatorColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1877482635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877482635, i, -1, "androidx.compose.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:1800)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26334n;
        } else if (z2) {
            j = this.f26335o;
        } else if (m60473b(collectIsFocusedAsState)) {
            j = this.f26332l;
        } else {
            j = this.f26333m;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(715788864);
            rememberUpdatedState = SingleValueAnimationKt.m69242animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(715788969);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> labelColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1167161306);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1167161306, i, -1, "androidx.compose.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:1879)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26346z;
        } else if (z2) {
            j = this.f26304A;
        } else if (m60472c(collectIsFocusedAsState)) {
            j = this.f26344x;
        } else {
            j = this.f26345y;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> leadingIconColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(925127045);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(925127045, i, -1, "androidx.compose.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:1748)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26338r;
        } else if (z2) {
            j = this.f26339s;
        } else if (m60471d(collectIsFocusedAsState)) {
            j = this.f26336p;
        } else {
            j = this.f26337q;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> placeholderColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(653850713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(653850713, i, -1, "androidx.compose.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:1854)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26307D;
        } else if (z2) {
            j = this.f26308E;
        } else if (m60470e(collectIsFocusedAsState)) {
            j = this.f26305B;
        } else {
            j = this.f26306C;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> prefixColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(129569364);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(129569364, i, -1, "androidx.compose.material3.TextFieldColors.prefixColor (TextFieldDefaults.kt:1947)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26315L;
        } else if (z2) {
            j = this.f26316M;
        } else if (m60469f(collectIsFocusedAsState)) {
            j = this.f26313J;
        } else {
            j = this.f26314K;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> suffixColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1575329427);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575329427, i, -1, "androidx.compose.material3.TextFieldColors.suffixColor (TextFieldDefaults.kt:1972)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26319P;
        } else if (z2) {
            j = this.f26320Q;
        } else if (m60468g(collectIsFocusedAsState)) {
            j = this.f26317N;
        } else {
            j = this.f26318O;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> supportingTextColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1464709698);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1464709698, i, -1, "androidx.compose.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:1921)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26311H;
        } else if (z2) {
            j = this.f26312I;
        } else if (m60467h(collectIsFocusedAsState)) {
            j = this.f26309F;
        } else {
            j = this.f26310G;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> textColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(68412911);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(68412911, i, -1, "androidx.compose.material3.TextFieldColors.textColor (TextFieldDefaults.kt:1904)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26323c;
        } else if (z2) {
            j = this.f26324d;
        } else if (m60466i(collectIsFocusedAsState)) {
            j = this.f26321a;
        } else {
            j = this.f26322b;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> trailingIconColor$material3_release(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-109504137);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-109504137, i, -1, "androidx.compose.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:1774)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f26342v;
        } else if (z2) {
            j = this.f26343w;
        } else if (m60465j(collectIsFocusedAsState)) {
            j = this.f26340t;
        } else {
            j = this.f26341u;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public TextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        Intrinsics.checkNotNullParameter(textSelectionColors, "textSelectionColors");
        this.f26321a = j;
        this.f26322b = j2;
        this.f26323c = j3;
        this.f26324d = j4;
        this.f26325e = j5;
        this.f26326f = j6;
        this.f26327g = j7;
        this.f26328h = j8;
        this.f26329i = j9;
        this.f26330j = j10;
        this.f26331k = textSelectionColors;
        this.f26332l = j11;
        this.f26333m = j12;
        this.f26334n = j13;
        this.f26335o = j14;
        this.f26336p = j15;
        this.f26337q = j16;
        this.f26338r = j17;
        this.f26339s = j18;
        this.f26340t = j19;
        this.f26341u = j20;
        this.f26342v = j21;
        this.f26343w = j22;
        this.f26344x = j23;
        this.f26345y = j24;
        this.f26346z = j25;
        this.f26304A = j26;
        this.f26305B = j27;
        this.f26306C = j28;
        this.f26307D = j29;
        this.f26308E = j30;
        this.f26309F = j31;
        this.f26310G = j32;
        this.f26311H = j33;
        this.f26312I = j34;
        this.f26313J = j35;
        this.f26314K = j36;
        this.f26315L = j37;
        this.f26316M = j38;
        this.f26317N = j39;
        this.f26318O = j40;
        this.f26319P = j41;
        this.f26320Q = j42;
    }
}
