package androidx.compose.material3;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b^\b\u0007\u0018\u00002\u00020\u0001Bò\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!Jµ\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R4\u0010\u0004\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R4\u0010\u0005\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R4\u0010\u0006\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R4\u0010\u0007\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R4\u0010\b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b;\u0010*\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R4\u0010\t\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b>\u0010*\u001a\u0004\b?\u0010,\"\u0004\b@\u0010.R4\u0010\n\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bA\u0010*\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.R4\u0010\u000b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bD\u0010*\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R4\u0010\f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bG\u0010*\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R4\u0010\r\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bJ\u0010*\u001a\u0004\bK\u0010,\"\u0004\bL\u0010.R4\u0010\u000e\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bM\u0010*\u001a\u0004\bN\u0010,\"\u0004\bO\u0010.R4\u0010\u000f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bP\u0010*\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010.R4\u0010\u0010\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bS\u0010*\u001a\u0004\bT\u0010,\"\u0004\bU\u0010.R4\u0010\u0011\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bV\u0010*\u001a\u0004\bW\u0010,\"\u0004\bX\u0010.R4\u0010\u0012\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bY\u0010*\u001a\u0004\bZ\u0010,\"\u0004\b[\u0010.R4\u0010\u0013\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\\\u0010*\u001a\u0004\b]\u0010,\"\u0004\b^\u0010.R4\u0010\u0014\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b_\u0010*\u001a\u0004\b`\u0010,\"\u0004\ba\u0010.R4\u0010\u0015\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bb\u0010*\u001a\u0004\bc\u0010,\"\u0004\bd\u0010.R4\u0010\u0016\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\be\u0010*\u001a\u0004\bf\u0010,\"\u0004\bg\u0010.R4\u0010\u0017\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bh\u0010*\u001a\u0004\bi\u0010,\"\u0004\bj\u0010.R4\u0010\u0018\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bk\u0010*\u001a\u0004\bl\u0010,\"\u0004\bm\u0010.R4\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bn\u0010*\u001a\u0004\bo\u0010,\"\u0004\bp\u0010.R4\u0010\u001a\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bq\u0010*\u001a\u0004\br\u0010,\"\u0004\bs\u0010.R4\u0010\u001b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bt\u0010*\u001a\u0004\bu\u0010,\"\u0004\bv\u0010.R4\u0010\u001c\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bw\u0010*\u001a\u0004\bx\u0010,\"\u0004\by\u0010.R4\u0010\u001d\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bz\u0010*\u001a\u0004\b{\u0010,\"\u0004\b|\u0010.R4\u0010\u001e\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b}\u0010*\u001a\u0004\b~\u0010,\"\u0004\b\u007f\u0010.R7\u0010\u001f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010*\u001a\u0005\b\u0081\u0001\u0010,\"\u0005\b\u0082\u0001\u0010.\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0083\u0001"}, m28850d2 = {"Landroidx/compose/material3/ColorScheme;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "copy", "", "toString", "()Ljava/lang/String;", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableState;", "getPrimary-0d7_KjU", "()J", "setPrimary-8_81llA$material3_release", "(J)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material3_release", OperatorName.CURVE_TO, "getPrimaryContainer-0d7_KjU", "setPrimaryContainer-8_81llA$material3_release", "d", "getOnPrimaryContainer-0d7_KjU", "setOnPrimaryContainer-8_81llA$material3_release", "e", "getInversePrimary-0d7_KjU", "setInversePrimary-8_81llA$material3_release", OperatorName.FILL_NON_ZERO, "getSecondary-0d7_KjU", "setSecondary-8_81llA$material3_release", OperatorName.NON_STROKING_GRAY, "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material3_release", OperatorName.CLOSE_PATH, "getSecondaryContainer-0d7_KjU", "setSecondaryContainer-8_81llA$material3_release", "i", "getOnSecondaryContainer-0d7_KjU", "setOnSecondaryContainer-8_81llA$material3_release", OperatorName.SET_LINE_JOINSTYLE, "getTertiary-0d7_KjU", "setTertiary-8_81llA$material3_release", OperatorName.NON_STROKING_CMYK, "getOnTertiary-0d7_KjU", "setOnTertiary-8_81llA$material3_release", OperatorName.LINE_TO, "getTertiaryContainer-0d7_KjU", "setTertiaryContainer-8_81llA$material3_release", OperatorName.MOVE_TO, "getOnTertiaryContainer-0d7_KjU", "setOnTertiaryContainer-8_81llA$material3_release", OperatorName.ENDPATH, "getBackground-0d7_KjU", "setBackground-8_81llA$material3_release", "o", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material3_release", "p", "getSurface-0d7_KjU", "setSurface-8_81llA$material3_release", OperatorName.SAVE, "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material3_release", PDPageLabelRange.STYLE_ROMAN_LOWER, "getSurfaceVariant-0d7_KjU", "setSurfaceVariant-8_81llA$material3_release", OperatorName.CLOSE_AND_STROKE, "getOnSurfaceVariant-0d7_KjU", "setOnSurfaceVariant-8_81llA$material3_release", "t", "getSurfaceTint-0d7_KjU", "setSurfaceTint-8_81llA$material3_release", "u", "getInverseSurface-0d7_KjU", "setInverseSurface-8_81llA$material3_release", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getInverseOnSurface-0d7_KjU", "setInverseOnSurface-8_81llA$material3_release", OperatorName.SET_LINE_WIDTH, "getError-0d7_KjU", "setError-8_81llA$material3_release", "x", "getOnError-0d7_KjU", "setOnError-8_81llA$material3_release", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getErrorContainer-0d7_KjU", "setErrorContainer-8_81llA$material3_release", "z", "getOnErrorContainer-0d7_KjU", "setOnErrorContainer-8_81llA$material3_release", "A", "getOutline-0d7_KjU", "setOutline-8_81llA$material3_release", "B", "getOutlineVariant-0d7_KjU", "setOutlineVariant-8_81llA$material3_release", "C", "getScrim-0d7_KjU", "setScrim-8_81llA$material3_release", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorScheme\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,615:1\n76#2:616\n102#2,2:617\n76#2:619\n102#2,2:620\n76#2:622\n102#2,2:623\n76#2:625\n102#2,2:626\n76#2:628\n102#2,2:629\n76#2:631\n102#2,2:632\n76#2:634\n102#2,2:635\n76#2:637\n102#2,2:638\n76#2:640\n102#2,2:641\n76#2:643\n102#2,2:644\n76#2:646\n102#2,2:647\n76#2:649\n102#2,2:650\n76#2:652\n102#2,2:653\n76#2:655\n102#2,2:656\n76#2:658\n102#2,2:659\n76#2:661\n102#2,2:662\n76#2:664\n102#2,2:665\n76#2:667\n102#2,2:668\n76#2:670\n102#2,2:671\n76#2:673\n102#2,2:674\n76#2:676\n102#2,2:677\n76#2:679\n102#2,2:680\n76#2:682\n102#2,2:683\n76#2:685\n102#2,2:686\n76#2:688\n102#2,2:689\n76#2:691\n102#2,2:692\n76#2:694\n102#2,2:695\n76#2:697\n102#2,2:698\n76#2:700\n102#2,2:701\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorScheme\n*L\n131#1:616\n131#1:617,2\n133#1:619\n133#1:620,2\n135#1:622\n135#1:623,2\n137#1:625\n137#1:626,2\n139#1:628\n139#1:629,2\n141#1:631\n141#1:632,2\n143#1:634\n143#1:635,2\n145#1:637\n145#1:638,2\n147#1:640\n147#1:641,2\n149#1:643\n149#1:644,2\n151#1:646\n151#1:647,2\n153#1:649\n153#1:650,2\n155#1:652\n155#1:653,2\n157#1:655\n157#1:656,2\n159#1:658\n159#1:659,2\n161#1:661\n161#1:662,2\n163#1:664\n163#1:665,2\n165#1:667\n165#1:668,2\n167#1:670\n167#1:671,2\n169#1:673\n169#1:674,2\n171#1:676\n171#1:677,2\n173#1:679\n173#1:680,2\n175#1:682\n175#1:683,2\n177#1:685\n177#1:686,2\n179#1:688\n179#1:689,2\n181#1:691\n181#1:692,2\n183#1:694\n183#1:695,2\n185#1:697\n185#1:698,2\n187#1:700\n187#1:701,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ColorScheme {
    public static final int $stable = 0;

    /* renamed from: A */
    public final MutableState f25649A;

    /* renamed from: B */
    public final MutableState f25650B;

    /* renamed from: C */
    public final MutableState f25651C;

    /* renamed from: a */
    public final MutableState f25652a;

    /* renamed from: b */
    public final MutableState f25653b;

    /* renamed from: c */
    public final MutableState f25654c;

    /* renamed from: d */
    public final MutableState f25655d;

    /* renamed from: e */
    public final MutableState f25656e;

    /* renamed from: f */
    public final MutableState f25657f;

    /* renamed from: g */
    public final MutableState f25658g;

    /* renamed from: h */
    public final MutableState f25659h;

    /* renamed from: i */
    public final MutableState f25660i;

    /* renamed from: j */
    public final MutableState f25661j;

    /* renamed from: k */
    public final MutableState f25662k;

    /* renamed from: l */
    public final MutableState f25663l;

    /* renamed from: m */
    public final MutableState f25664m;

    /* renamed from: n */
    public final MutableState f25665n;

    /* renamed from: o */
    public final MutableState f25666o;

    /* renamed from: p */
    public final MutableState f25667p;

    /* renamed from: q */
    public final MutableState f25668q;

    /* renamed from: r */
    public final MutableState f25669r;

    /* renamed from: s */
    public final MutableState f25670s;

    /* renamed from: t */
    public final MutableState f25671t;

    /* renamed from: u */
    public final MutableState f25672u;

    /* renamed from: v */
    public final MutableState f25673v;

    /* renamed from: w */
    public final MutableState f25674w;

    /* renamed from: x */
    public final MutableState f25675x;

    /* renamed from: y */
    public final MutableState f25676y;

    /* renamed from: z */
    public final MutableState f25677z;

    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
    }

    @NotNull
    /* renamed from: copy-G1PFc-w  reason: not valid java name */
    public final ColorScheme m70235copyG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, null);
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m70236getBackground0d7_KjU() {
        return ((Color) this.f25665n.getValue()).m71745unboximpl();
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m70237getError0d7_KjU() {
        return ((Color) this.f25674w.getValue()).m71745unboximpl();
    }

    /* renamed from: getErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m70238getErrorContainer0d7_KjU() {
        return ((Color) this.f25676y.getValue()).m71745unboximpl();
    }

    /* renamed from: getInverseOnSurface-0d7_KjU  reason: not valid java name */
    public final long m70239getInverseOnSurface0d7_KjU() {
        return ((Color) this.f25673v.getValue()).m71745unboximpl();
    }

    /* renamed from: getInversePrimary-0d7_KjU  reason: not valid java name */
    public final long m70240getInversePrimary0d7_KjU() {
        return ((Color) this.f25656e.getValue()).m71745unboximpl();
    }

    /* renamed from: getInverseSurface-0d7_KjU  reason: not valid java name */
    public final long m70241getInverseSurface0d7_KjU() {
        return ((Color) this.f25672u.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m70242getOnBackground0d7_KjU() {
        return ((Color) this.f25666o.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m70243getOnError0d7_KjU() {
        return ((Color) this.f25675x.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m70244getOnErrorContainer0d7_KjU() {
        return ((Color) this.f25677z.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m70245getOnPrimary0d7_KjU() {
        return ((Color) this.f25653b.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70246getOnPrimaryContainer0d7_KjU() {
        return ((Color) this.f25655d.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m70247getOnSecondary0d7_KjU() {
        return ((Color) this.f25658g.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70248getOnSecondaryContainer0d7_KjU() {
        return ((Color) this.f25660i.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m70249getOnSurface0d7_KjU() {
        return ((Color) this.f25668q.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m70250getOnSurfaceVariant0d7_KjU() {
        return ((Color) this.f25670s.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnTertiary-0d7_KjU  reason: not valid java name */
    public final long m70251getOnTertiary0d7_KjU() {
        return ((Color) this.f25662k.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70252getOnTertiaryContainer0d7_KjU() {
        return ((Color) this.f25664m.getValue()).m71745unboximpl();
    }

    /* renamed from: getOutline-0d7_KjU  reason: not valid java name */
    public final long m70253getOutline0d7_KjU() {
        return ((Color) this.f25649A.getValue()).m71745unboximpl();
    }

    /* renamed from: getOutlineVariant-0d7_KjU  reason: not valid java name */
    public final long m70254getOutlineVariant0d7_KjU() {
        return ((Color) this.f25650B.getValue()).m71745unboximpl();
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m70255getPrimary0d7_KjU() {
        return ((Color) this.f25652a.getValue()).m71745unboximpl();
    }

    /* renamed from: getPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70256getPrimaryContainer0d7_KjU() {
        return ((Color) this.f25654c.getValue()).m71745unboximpl();
    }

    /* renamed from: getScrim-0d7_KjU  reason: not valid java name */
    public final long m70257getScrim0d7_KjU() {
        return ((Color) this.f25651C.getValue()).m71745unboximpl();
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m70258getSecondary0d7_KjU() {
        return ((Color) this.f25657f.getValue()).m71745unboximpl();
    }

    /* renamed from: getSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70259getSecondaryContainer0d7_KjU() {
        return ((Color) this.f25659h.getValue()).m71745unboximpl();
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m70260getSurface0d7_KjU() {
        return ((Color) this.f25667p.getValue()).m71745unboximpl();
    }

    /* renamed from: getSurfaceTint-0d7_KjU  reason: not valid java name */
    public final long m70261getSurfaceTint0d7_KjU() {
        return ((Color) this.f25671t.getValue()).m71745unboximpl();
    }

    /* renamed from: getSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m70262getSurfaceVariant0d7_KjU() {
        return ((Color) this.f25669r.getValue()).m71745unboximpl();
    }

    /* renamed from: getTertiary-0d7_KjU  reason: not valid java name */
    public final long m70263getTertiary0d7_KjU() {
        return ((Color) this.f25661j.getValue()).m71745unboximpl();
    }

    /* renamed from: getTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m70264getTertiaryContainer0d7_KjU() {
        return ((Color) this.f25663l.getValue()).m71745unboximpl();
    }

    /* renamed from: setBackground-8_81llA$material3_release  reason: not valid java name */
    public final void m70265setBackground8_81llA$material3_release(long j) {
        this.f25665n.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setError-8_81llA$material3_release  reason: not valid java name */
    public final void m70266setError8_81llA$material3_release(long j) {
        this.f25674w.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setErrorContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m70267setErrorContainer8_81llA$material3_release(long j) {
        this.f25676y.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setInverseOnSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m70268setInverseOnSurface8_81llA$material3_release(long j) {
        this.f25673v.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setInversePrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m70269setInversePrimary8_81llA$material3_release(long j) {
        this.f25656e.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setInverseSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m70270setInverseSurface8_81llA$material3_release(long j) {
        this.f25672u.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnBackground-8_81llA$material3_release  reason: not valid java name */
    public final void m70271setOnBackground8_81llA$material3_release(long j) {
        this.f25666o.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnError-8_81llA$material3_release  reason: not valid java name */
    public final void m70272setOnError8_81llA$material3_release(long j) {
        this.f25675x.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnErrorContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m70273setOnErrorContainer8_81llA$material3_release(long j) {
        this.f25677z.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnPrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m70274setOnPrimary8_81llA$material3_release(long j) {
        this.f25653b.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnPrimaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m70275setOnPrimaryContainer8_81llA$material3_release(long j) {
        this.f25655d.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnSecondary-8_81llA$material3_release  reason: not valid java name */
    public final void m70276setOnSecondary8_81llA$material3_release(long j) {
        this.f25658g.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnSecondaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m70277setOnSecondaryContainer8_81llA$material3_release(long j) {
        this.f25660i.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m70278setOnSurface8_81llA$material3_release(long j) {
        this.f25668q.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnSurfaceVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m70279setOnSurfaceVariant8_81llA$material3_release(long j) {
        this.f25670s.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnTertiary-8_81llA$material3_release  reason: not valid java name */
    public final void m70280setOnTertiary8_81llA$material3_release(long j) {
        this.f25662k.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnTertiaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m70281setOnTertiaryContainer8_81llA$material3_release(long j) {
        this.f25664m.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOutline-8_81llA$material3_release  reason: not valid java name */
    public final void m70282setOutline8_81llA$material3_release(long j) {
        this.f25649A.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOutlineVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m70283setOutlineVariant8_81llA$material3_release(long j) {
        this.f25650B.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setPrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m70284setPrimary8_81llA$material3_release(long j) {
        this.f25652a.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setPrimaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m70285setPrimaryContainer8_81llA$material3_release(long j) {
        this.f25654c.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setScrim-8_81llA$material3_release  reason: not valid java name */
    public final void m70286setScrim8_81llA$material3_release(long j) {
        this.f25651C.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setSecondary-8_81llA$material3_release  reason: not valid java name */
    public final void m70287setSecondary8_81llA$material3_release(long j) {
        this.f25657f.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setSecondaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m70288setSecondaryContainer8_81llA$material3_release(long j) {
        this.f25659h.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m70289setSurface8_81llA$material3_release(long j) {
        this.f25667p.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setSurfaceTint-8_81llA$material3_release  reason: not valid java name */
    public final void m70290setSurfaceTint8_81llA$material3_release(long j) {
        this.f25671t.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setSurfaceVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m70291setSurfaceVariant8_81llA$material3_release(long j) {
        this.f25669r.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setTertiary-8_81llA$material3_release  reason: not valid java name */
    public final void m70292setTertiary8_81llA$material3_release(long j) {
        this.f25661j.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setTertiaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m70293setTertiaryContainer8_81llA$material3_release(long j) {
        this.f25663l.setValue(Color.m71725boximpl(j));
    }

    @NotNull
    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.m71743toStringimpl(m70255getPrimary0d7_KjU())) + "onPrimary=" + ((Object) Color.m71743toStringimpl(m70245getOnPrimary0d7_KjU())) + "primaryContainer=" + ((Object) Color.m71743toStringimpl(m70256getPrimaryContainer0d7_KjU())) + "onPrimaryContainer=" + ((Object) Color.m71743toStringimpl(m70246getOnPrimaryContainer0d7_KjU())) + "inversePrimary=" + ((Object) Color.m71743toStringimpl(m70240getInversePrimary0d7_KjU())) + "secondary=" + ((Object) Color.m71743toStringimpl(m70258getSecondary0d7_KjU())) + "onSecondary=" + ((Object) Color.m71743toStringimpl(m70247getOnSecondary0d7_KjU())) + "secondaryContainer=" + ((Object) Color.m71743toStringimpl(m70259getSecondaryContainer0d7_KjU())) + "onSecondaryContainer=" + ((Object) Color.m71743toStringimpl(m70248getOnSecondaryContainer0d7_KjU())) + "tertiary=" + ((Object) Color.m71743toStringimpl(m70263getTertiary0d7_KjU())) + "onTertiary=" + ((Object) Color.m71743toStringimpl(m70251getOnTertiary0d7_KjU())) + "tertiaryContainer=" + ((Object) Color.m71743toStringimpl(m70264getTertiaryContainer0d7_KjU())) + "onTertiaryContainer=" + ((Object) Color.m71743toStringimpl(m70252getOnTertiaryContainer0d7_KjU())) + "background=" + ((Object) Color.m71743toStringimpl(m70236getBackground0d7_KjU())) + "onBackground=" + ((Object) Color.m71743toStringimpl(m70242getOnBackground0d7_KjU())) + "surface=" + ((Object) Color.m71743toStringimpl(m70260getSurface0d7_KjU())) + "onSurface=" + ((Object) Color.m71743toStringimpl(m70249getOnSurface0d7_KjU())) + "surfaceVariant=" + ((Object) Color.m71743toStringimpl(m70262getSurfaceVariant0d7_KjU())) + "onSurfaceVariant=" + ((Object) Color.m71743toStringimpl(m70250getOnSurfaceVariant0d7_KjU())) + "surfaceTint=" + ((Object) Color.m71743toStringimpl(m70261getSurfaceTint0d7_KjU())) + "inverseSurface=" + ((Object) Color.m71743toStringimpl(m70241getInverseSurface0d7_KjU())) + "inverseOnSurface=" + ((Object) Color.m71743toStringimpl(m70239getInverseOnSurface0d7_KjU())) + "error=" + ((Object) Color.m71743toStringimpl(m70237getError0d7_KjU())) + "onError=" + ((Object) Color.m71743toStringimpl(m70243getOnError0d7_KjU())) + "errorContainer=" + ((Object) Color.m71743toStringimpl(m70238getErrorContainer0d7_KjU())) + "onErrorContainer=" + ((Object) Color.m71743toStringimpl(m70244getOnErrorContainer0d7_KjU())) + "outline=" + ((Object) Color.m71743toStringimpl(m70253getOutline0d7_KjU())) + "outlineVariant=" + ((Object) Color.m71743toStringimpl(m70254getOutlineVariant0d7_KjU())) + "scrim=" + ((Object) Color.m71743toStringimpl(m70257getScrim0d7_KjU())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        this.f25652a = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j), SnapshotStateKt.structuralEqualityPolicy());
        this.f25653b = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.f25654c = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.f25655d = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.f25656e = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.f25657f = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.f25658g = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.f25659h = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.f25660i = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.f25661j = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.f25662k = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.f25663l = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.f25664m = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.f25665n = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.f25666o = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.f25667p = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.f25668q = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.f25669r = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.f25670s = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.f25671t = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j20), SnapshotStateKt.structuralEqualityPolicy());
        this.f25672u = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j21), SnapshotStateKt.structuralEqualityPolicy());
        this.f25673v = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j22), SnapshotStateKt.structuralEqualityPolicy());
        this.f25674w = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j23), SnapshotStateKt.structuralEqualityPolicy());
        this.f25675x = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j24), SnapshotStateKt.structuralEqualityPolicy());
        this.f25676y = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j25), SnapshotStateKt.structuralEqualityPolicy());
        this.f25677z = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j26), SnapshotStateKt.structuralEqualityPolicy());
        this.f25649A = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j27), SnapshotStateKt.structuralEqualityPolicy());
        this.f25650B = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j28), SnapshotStateKt.structuralEqualityPolicy());
        this.f25651C = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j29), SnapshotStateKt.structuralEqualityPolicy());
    }
}
