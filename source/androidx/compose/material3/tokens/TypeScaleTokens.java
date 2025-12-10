package androidx.compose.material3.tokens;

import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.font.GenericFontFamily;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0003\b×\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0015\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR \u0010!\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR \u0010$\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR \u0010'\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000eR\u0017\u0010*\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000eR \u00103\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000eR \u00106\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u000eR\u0017\u00109\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b7\u0010\u0018\u001a\u0004\b8\u0010\u001aR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\f\u001a\u0004\b>\u0010\u000eR \u0010B\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\bA\u0010\u000eR \u0010E\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\f\u001a\u0004\bD\u0010\u000eR\u0017\u0010H\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bF\u0010\u0018\u001a\u0004\bG\u0010\u001aR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR \u0010N\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bM\u0010\u000eR \u0010Q\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\bP\u0010\u000eR \u0010T\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\f\u001a\u0004\bS\u0010\u000eR\u0017\u0010W\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bU\u0010\u0018\u001a\u0004\bV\u0010\u001aR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR \u0010]\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\f\u001a\u0004\b\\\u0010\u000eR \u0010`\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b^\u0010\f\u001a\u0004\b_\u0010\u000eR \u0010c\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010\f\u001a\u0004\bb\u0010\u000eR\u0017\u0010f\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bd\u0010\u0018\u001a\u0004\be\u0010\u001aR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR \u0010l\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bj\u0010\f\u001a\u0004\bk\u0010\u000eR \u0010o\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bm\u0010\f\u001a\u0004\bn\u0010\u000eR \u0010r\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010\f\u001a\u0004\bq\u0010\u000eR\u0017\u0010u\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bs\u0010\u0018\u001a\u0004\bt\u0010\u001aR\u0017\u0010w\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bv\u0010\bR \u0010z\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bx\u0010\f\u001a\u0004\by\u0010\u000eR \u0010}\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b{\u0010\f\u001a\u0004\b|\u0010\u000eR!\u0010\u0080\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\f\u001a\u0004\b\u007f\u0010\u000eR\u001a\u0010\u0083\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0018\u001a\u0005\b\u0082\u0001\u0010\u001aR\u001a\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0005\b\u0085\u0001\u0010\bR#\u0010\u0089\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\f\u001a\u0005\b\u0088\u0001\u0010\u000eR#\u0010\u008c\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\f\u001a\u0005\b\u008b\u0001\u0010\u000eR#\u0010\u008f\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\f\u001a\u0005\b\u008e\u0001\u0010\u000eR\u001a\u0010\u0092\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0018\u001a\u0005\b\u0091\u0001\u0010\u001aR\u001a\u0010\u0095\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR#\u0010\u0098\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\f\u001a\u0005\b\u0097\u0001\u0010\u000eR#\u0010\u009b\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\f\u001a\u0005\b\u009a\u0001\u0010\u000eR#\u0010\u009e\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\f\u001a\u0005\b\u009d\u0001\u0010\u000eR\u001a\u0010¡\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0018\u001a\u0005\b \u0001\u0010\u001aR\u001a\u0010¤\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0006\u001a\u0005\b£\u0001\u0010\bR#\u0010§\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¥\u0001\u0010\f\u001a\u0005\b¦\u0001\u0010\u000eR#\u0010ª\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¨\u0001\u0010\f\u001a\u0005\b©\u0001\u0010\u000eR#\u0010\u00ad\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b«\u0001\u0010\f\u001a\u0005\b¬\u0001\u0010\u000eR\u001a\u0010°\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b®\u0001\u0010\u0018\u001a\u0005\b¯\u0001\u0010\u001aR\u001a\u0010³\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0006\u001a\u0005\b²\u0001\u0010\bR#\u0010¶\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b´\u0001\u0010\f\u001a\u0005\bµ\u0001\u0010\u000eR#\u0010¹\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b·\u0001\u0010\f\u001a\u0005\b¸\u0001\u0010\u000eR#\u0010¼\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bº\u0001\u0010\f\u001a\u0005\b»\u0001\u0010\u000eR\u001a\u0010¿\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0018\u001a\u0005\b¾\u0001\u0010\u001aR\u001a\u0010Â\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÀ\u0001\u0010\u0006\u001a\u0005\bÁ\u0001\u0010\bR#\u0010Å\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\f\u001a\u0005\bÄ\u0001\u0010\u000eR#\u0010È\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÆ\u0001\u0010\f\u001a\u0005\bÇ\u0001\u0010\u000eR#\u0010Ë\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\f\u001a\u0005\bÊ\u0001\u0010\u000eR\u001a\u0010Î\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\bÌ\u0001\u0010\u0018\u001a\u0005\bÍ\u0001\u0010\u001aR\u001a\u0010Ñ\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\u0006\u001a\u0005\bÐ\u0001\u0010\bR#\u0010Ô\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÒ\u0001\u0010\f\u001a\u0005\bÓ\u0001\u0010\u000eR#\u0010×\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÕ\u0001\u0010\f\u001a\u0005\bÖ\u0001\u0010\u000eR#\u0010Ú\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bØ\u0001\u0010\f\u001a\u0005\bÙ\u0001\u0010\u000eR\u001a\u0010Ý\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\bÛ\u0001\u0010\u0018\u001a\u0005\bÜ\u0001\u0010\u001aR\u001a\u0010à\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÞ\u0001\u0010\u0006\u001a\u0005\bß\u0001\u0010\bR#\u0010ã\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bá\u0001\u0010\f\u001a\u0005\bâ\u0001\u0010\u000eR#\u0010æ\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bä\u0001\u0010\f\u001a\u0005\bå\u0001\u0010\u000eR#\u0010é\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bç\u0001\u0010\f\u001a\u0005\bè\u0001\u0010\u000eR\u001a\u0010ì\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\bê\u0001\u0010\u0018\u001a\u0005\bë\u0001\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006í\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/TypeScaleTokens;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/GenericFontFamily;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/font/GenericFontFamily;", "getBodyLargeFont", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "BodyLargeFont", "Landroidx/compose/ui/unit/TextUnit;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getBodyLargeLineHeight-XSAIIZE", "()J", "BodyLargeLineHeight", OperatorName.CURVE_TO, "getBodyLargeSize-XSAIIZE", "BodyLargeSize", "d", "getBodyLargeTracking-XSAIIZE", "BodyLargeTracking", "Landroidx/compose/ui/text/font/FontWeight;", "e", "Landroidx/compose/ui/text/font/FontWeight;", "getBodyLargeWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "BodyLargeWeight", OperatorName.FILL_NON_ZERO, "getBodyMediumFont", "BodyMediumFont", OperatorName.NON_STROKING_GRAY, "getBodyMediumLineHeight-XSAIIZE", "BodyMediumLineHeight", OperatorName.CLOSE_PATH, "getBodyMediumSize-XSAIIZE", "BodyMediumSize", "i", "getBodyMediumTracking-XSAIIZE", "BodyMediumTracking", OperatorName.SET_LINE_JOINSTYLE, "getBodyMediumWeight", "BodyMediumWeight", OperatorName.NON_STROKING_CMYK, "getBodySmallFont", "BodySmallFont", OperatorName.LINE_TO, "getBodySmallLineHeight-XSAIIZE", "BodySmallLineHeight", OperatorName.MOVE_TO, "getBodySmallSize-XSAIIZE", "BodySmallSize", OperatorName.ENDPATH, "getBodySmallTracking-XSAIIZE", "BodySmallTracking", "o", "getBodySmallWeight", "BodySmallWeight", "p", "getDisplayLargeFont", "DisplayLargeFont", OperatorName.SAVE, "getDisplayLargeLineHeight-XSAIIZE", "DisplayLargeLineHeight", PDPageLabelRange.STYLE_ROMAN_LOWER, "getDisplayLargeSize-XSAIIZE", "DisplayLargeSize", OperatorName.CLOSE_AND_STROKE, "getDisplayLargeTracking-XSAIIZE", "DisplayLargeTracking", "t", "getDisplayLargeWeight", "DisplayLargeWeight", "u", "getDisplayMediumFont", "DisplayMediumFont", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getDisplayMediumLineHeight-XSAIIZE", "DisplayMediumLineHeight", OperatorName.SET_LINE_WIDTH, "getDisplayMediumSize-XSAIIZE", "DisplayMediumSize", "x", "getDisplayMediumTracking-XSAIIZE", "DisplayMediumTracking", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getDisplayMediumWeight", "DisplayMediumWeight", "z", "getDisplaySmallFont", "DisplaySmallFont", "A", "getDisplaySmallLineHeight-XSAIIZE", "DisplaySmallLineHeight", "B", "getDisplaySmallSize-XSAIIZE", "DisplaySmallSize", "C", "getDisplaySmallTracking-XSAIIZE", "DisplaySmallTracking", "D", "getDisplaySmallWeight", "DisplaySmallWeight", ExifInterface.LONGITUDE_EAST, "getHeadlineLargeFont", "HeadlineLargeFont", "F", "getHeadlineLargeLineHeight-XSAIIZE", "HeadlineLargeLineHeight", OperatorName.STROKING_COLOR_GRAY, "getHeadlineLargeSize-XSAIIZE", "HeadlineLargeSize", "H", "getHeadlineLargeTracking-XSAIIZE", "HeadlineLargeTracking", "I", "getHeadlineLargeWeight", "HeadlineLargeWeight", "getHeadlineMediumFont", "HeadlineMediumFont", "K", "getHeadlineMediumLineHeight-XSAIIZE", "HeadlineMediumLineHeight", "L", "getHeadlineMediumSize-XSAIIZE", "HeadlineMediumSize", "M", "getHeadlineMediumTracking-XSAIIZE", "HeadlineMediumTracking", "N", "getHeadlineMediumWeight", "HeadlineMediumWeight", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getHeadlineSmallFont", "HeadlineSmallFont", "P", "getHeadlineSmallLineHeight-XSAIIZE", "HeadlineSmallLineHeight", OperatorName.RESTORE, "getHeadlineSmallSize-XSAIIZE", "HeadlineSmallSize", "R", "getHeadlineSmallTracking-XSAIIZE", "HeadlineSmallTracking", "S", "getHeadlineSmallWeight", "HeadlineSmallWeight", "T", "getLabelLargeFont", "LabelLargeFont", PDBorderStyleDictionary.STYLE_UNDERLINE, "getLabelLargeLineHeight-XSAIIZE", "LabelLargeLineHeight", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getLabelLargeSize-XSAIIZE", "LabelLargeSize", "W", "getLabelLargeTracking-XSAIIZE", "LabelLargeTracking", "X", "getLabelLargeWeight", "LabelLargeWeight", "Y", "getLabelMediumFont", "LabelMediumFont", "Z", "getLabelMediumLineHeight-XSAIIZE", "LabelMediumLineHeight", "a0", "getLabelMediumSize-XSAIIZE", "LabelMediumSize", "b0", "getLabelMediumTracking-XSAIIZE", "LabelMediumTracking", "c0", "getLabelMediumWeight", "LabelMediumWeight", OperatorName.TYPE3_D0, "getLabelSmallFont", "LabelSmallFont", "e0", "getLabelSmallLineHeight-XSAIIZE", "LabelSmallLineHeight", "f0", "getLabelSmallSize-XSAIIZE", "LabelSmallSize", "g0", "getLabelSmallTracking-XSAIIZE", "LabelSmallTracking", "h0", "getLabelSmallWeight", "LabelSmallWeight", "i0", "getTitleLargeFont", "TitleLargeFont", "j0", "getTitleLargeLineHeight-XSAIIZE", "TitleLargeLineHeight", "k0", "getTitleLargeSize-XSAIIZE", "TitleLargeSize", "l0", "getTitleLargeTracking-XSAIIZE", "TitleLargeTracking", "m0", "getTitleLargeWeight", "TitleLargeWeight", "n0", "getTitleMediumFont", "TitleMediumFont", "o0", "getTitleMediumLineHeight-XSAIIZE", "TitleMediumLineHeight", "p0", "getTitleMediumSize-XSAIIZE", "TitleMediumSize", "q0", "getTitleMediumTracking-XSAIIZE", "TitleMediumTracking", "r0", "getTitleMediumWeight", "TitleMediumWeight", "s0", "getTitleSmallFont", "TitleSmallFont", "t0", "getTitleSmallLineHeight-XSAIIZE", "TitleSmallLineHeight", "u0", "getTitleSmallSize-XSAIIZE", "TitleSmallSize", "v0", "getTitleSmallTracking-XSAIIZE", "TitleSmallTracking", "w0", "getTitleSmallWeight", "TitleSmallWeight", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTypeScaleTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeScaleTokens.kt\nandroidx/compose/material3/tokens/TypeScaleTokens\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,100:1\n94#2,2:101\n*S KotlinDebug\n*F\n+ 1 TypeScaleTokens.kt\nandroidx/compose/material3/tokens/TypeScaleTokens\n*L\n42#1:101,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TypeScaleTokens {

    /* renamed from: A */
    public static final long f28090A;

    /* renamed from: B */
    public static final long f28091B;

    /* renamed from: C */
    public static final long f28092C;

    /* renamed from: D */
    public static final FontWeight f28093D;

    /* renamed from: E */
    public static final GenericFontFamily f28094E;

    /* renamed from: F */
    public static final long f28095F;

    /* renamed from: G */
    public static final long f28096G;

    /* renamed from: H */
    public static final long f28097H;

    /* renamed from: I */
    public static final FontWeight f28098I;
    @NotNull
    public static final TypeScaleTokens INSTANCE = new TypeScaleTokens();

    /* renamed from: J */
    public static final GenericFontFamily f28099J;

    /* renamed from: K */
    public static final long f28100K;

    /* renamed from: L */
    public static final long f28101L;

    /* renamed from: M */
    public static final long f28102M;

    /* renamed from: N */
    public static final FontWeight f28103N;

    /* renamed from: O */
    public static final GenericFontFamily f28104O;

    /* renamed from: P */
    public static final long f28105P;

    /* renamed from: Q */
    public static final long f28106Q;

    /* renamed from: R */
    public static final long f28107R;

    /* renamed from: S */
    public static final FontWeight f28108S;

    /* renamed from: T */
    public static final GenericFontFamily f28109T;

    /* renamed from: U */
    public static final long f28110U;

    /* renamed from: V */
    public static final long f28111V;

    /* renamed from: W */
    public static final long f28112W;

    /* renamed from: X */
    public static final FontWeight f28113X;

    /* renamed from: Y */
    public static final GenericFontFamily f28114Y;

    /* renamed from: Z */
    public static final long f28115Z;

    /* renamed from: a */
    public static final GenericFontFamily f28116a;

    /* renamed from: a0 */
    public static final long f28117a0;

    /* renamed from: b */
    public static final long f28118b;

    /* renamed from: b0 */
    public static final long f28119b0;

    /* renamed from: c */
    public static final long f28120c;

    /* renamed from: c0 */
    public static final FontWeight f28121c0;

    /* renamed from: d */
    public static final long f28122d;

    /* renamed from: d0 */
    public static final GenericFontFamily f28123d0;

    /* renamed from: e */
    public static final FontWeight f28124e;

    /* renamed from: e0 */
    public static final long f28125e0;

    /* renamed from: f */
    public static final GenericFontFamily f28126f;

    /* renamed from: f0 */
    public static final long f28127f0;

    /* renamed from: g */
    public static final long f28128g;

    /* renamed from: g0 */
    public static final long f28129g0;

    /* renamed from: h */
    public static final long f28130h;

    /* renamed from: h0 */
    public static final FontWeight f28131h0;

    /* renamed from: i */
    public static final long f28132i;

    /* renamed from: i0 */
    public static final GenericFontFamily f28133i0;

    /* renamed from: j */
    public static final FontWeight f28134j;

    /* renamed from: j0 */
    public static final long f28135j0;

    /* renamed from: k */
    public static final GenericFontFamily f28136k;

    /* renamed from: k0 */
    public static final long f28137k0;

    /* renamed from: l */
    public static final long f28138l;

    /* renamed from: l0 */
    public static final long f28139l0;

    /* renamed from: m */
    public static final long f28140m;

    /* renamed from: m0 */
    public static final FontWeight f28141m0;

    /* renamed from: n */
    public static final long f28142n;

    /* renamed from: n0 */
    public static final GenericFontFamily f28143n0;

    /* renamed from: o */
    public static final FontWeight f28144o;

    /* renamed from: o0 */
    public static final long f28145o0;

    /* renamed from: p */
    public static final GenericFontFamily f28146p;

    /* renamed from: p0 */
    public static final long f28147p0;

    /* renamed from: q */
    public static final long f28148q;

    /* renamed from: q0 */
    public static final long f28149q0;

    /* renamed from: r */
    public static final long f28150r;

    /* renamed from: r0 */
    public static final FontWeight f28151r0;

    /* renamed from: s */
    public static final long f28152s;

    /* renamed from: s0 */
    public static final GenericFontFamily f28153s0;

    /* renamed from: t */
    public static final FontWeight f28154t;

    /* renamed from: t0 */
    public static final long f28155t0;

    /* renamed from: u */
    public static final GenericFontFamily f28156u;

    /* renamed from: u0 */
    public static final long f28157u0;

    /* renamed from: v */
    public static final long f28158v;

    /* renamed from: v0 */
    public static final long f28159v0;

    /* renamed from: w */
    public static final long f28160w;

    /* renamed from: w0 */
    public static final FontWeight f28161w0;

    /* renamed from: x */
    public static final long f28162x;

    /* renamed from: y */
    public static final FontWeight f28163y;

    /* renamed from: z */
    public static final GenericFontFamily f28164z;

    static {
        TypefaceTokens typefaceTokens = TypefaceTokens.INSTANCE;
        f28116a = typefaceTokens.getPlain();
        f28118b = TextUnitKt.getSp(24.0d);
        f28120c = TextUnitKt.getSp(16);
        f28122d = TextUnitKt.getSp(0.5d);
        f28124e = typefaceTokens.getWeightRegular();
        f28126f = typefaceTokens.getPlain();
        f28128g = TextUnitKt.getSp(20.0d);
        f28130h = TextUnitKt.getSp(14);
        f28132i = TextUnitKt.getSp(0.2d);
        f28134j = typefaceTokens.getWeightRegular();
        f28136k = typefaceTokens.getPlain();
        f28138l = TextUnitKt.getSp(16.0d);
        f28140m = TextUnitKt.getSp(12);
        f28142n = TextUnitKt.getSp(0.4d);
        f28144o = typefaceTokens.getWeightRegular();
        f28146p = typefaceTokens.getBrand();
        f28148q = TextUnitKt.getSp(64.0d);
        f28150r = TextUnitKt.getSp(57);
        long sp = TextUnitKt.getSp(0.2d);
        TextUnitKt.m73852checkArithmeticR2X_6o(sp);
        f28152s = TextUnitKt.pack(TextUnit.m73837getRawTypeimpl(sp), -TextUnit.m73839getValueimpl(sp));
        f28154t = typefaceTokens.getWeightRegular();
        f28156u = typefaceTokens.getBrand();
        f28158v = TextUnitKt.getSp(52.0d);
        f28160w = TextUnitKt.getSp(45);
        f28162x = TextUnitKt.getSp(0.0d);
        f28163y = typefaceTokens.getWeightRegular();
        f28164z = typefaceTokens.getBrand();
        f28090A = TextUnitKt.getSp(44.0d);
        f28091B = TextUnitKt.getSp(36);
        f28092C = TextUnitKt.getSp(0.0d);
        f28093D = typefaceTokens.getWeightRegular();
        f28094E = typefaceTokens.getBrand();
        f28095F = TextUnitKt.getSp(40.0d);
        f28096G = TextUnitKt.getSp(32);
        f28097H = TextUnitKt.getSp(0.0d);
        f28098I = typefaceTokens.getWeightRegular();
        f28099J = typefaceTokens.getBrand();
        f28100K = TextUnitKt.getSp(36.0d);
        f28101L = TextUnitKt.getSp(28);
        f28102M = TextUnitKt.getSp(0.0d);
        f28103N = typefaceTokens.getWeightRegular();
        f28104O = typefaceTokens.getBrand();
        f28105P = TextUnitKt.getSp(32.0d);
        f28106Q = TextUnitKt.getSp(24);
        f28107R = TextUnitKt.getSp(0.0d);
        f28108S = typefaceTokens.getWeightRegular();
        f28109T = typefaceTokens.getPlain();
        f28110U = TextUnitKt.getSp(20.0d);
        f28111V = TextUnitKt.getSp(14);
        f28112W = TextUnitKt.getSp(0.1d);
        f28113X = typefaceTokens.getWeightMedium();
        f28114Y = typefaceTokens.getPlain();
        f28115Z = TextUnitKt.getSp(16.0d);
        f28117a0 = TextUnitKt.getSp(12);
        f28119b0 = TextUnitKt.getSp(0.5d);
        f28121c0 = typefaceTokens.getWeightMedium();
        f28123d0 = typefaceTokens.getPlain();
        f28125e0 = TextUnitKt.getSp(16.0d);
        f28127f0 = TextUnitKt.getSp(11);
        f28129g0 = TextUnitKt.getSp(0.5d);
        f28131h0 = typefaceTokens.getWeightMedium();
        f28133i0 = typefaceTokens.getBrand();
        f28135j0 = TextUnitKt.getSp(28.0d);
        f28137k0 = TextUnitKt.getSp(22);
        f28139l0 = TextUnitKt.getSp(0.0d);
        f28141m0 = typefaceTokens.getWeightRegular();
        f28143n0 = typefaceTokens.getPlain();
        f28145o0 = TextUnitKt.getSp(24.0d);
        f28147p0 = TextUnitKt.getSp(16);
        f28149q0 = TextUnitKt.getSp(0.2d);
        f28151r0 = typefaceTokens.getWeightMedium();
        f28153s0 = typefaceTokens.getPlain();
        f28155t0 = TextUnitKt.getSp(20.0d);
        f28157u0 = TextUnitKt.getSp(14);
        f28159v0 = TextUnitKt.getSp(0.1d);
        f28161w0 = typefaceTokens.getWeightMedium();
    }

    @NotNull
    public final GenericFontFamily getBodyLargeFont() {
        return f28116a;
    }

    /* renamed from: getBodyLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71332getBodyLargeLineHeightXSAIIZE() {
        return f28118b;
    }

    /* renamed from: getBodyLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71333getBodyLargeSizeXSAIIZE() {
        return f28120c;
    }

    /* renamed from: getBodyLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71334getBodyLargeTrackingXSAIIZE() {
        return f28122d;
    }

    @NotNull
    public final FontWeight getBodyLargeWeight() {
        return f28124e;
    }

    @NotNull
    public final GenericFontFamily getBodyMediumFont() {
        return f28126f;
    }

    /* renamed from: getBodyMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71335getBodyMediumLineHeightXSAIIZE() {
        return f28128g;
    }

    /* renamed from: getBodyMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71336getBodyMediumSizeXSAIIZE() {
        return f28130h;
    }

    /* renamed from: getBodyMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71337getBodyMediumTrackingXSAIIZE() {
        return f28132i;
    }

    @NotNull
    public final FontWeight getBodyMediumWeight() {
        return f28134j;
    }

    @NotNull
    public final GenericFontFamily getBodySmallFont() {
        return f28136k;
    }

    /* renamed from: getBodySmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71338getBodySmallLineHeightXSAIIZE() {
        return f28138l;
    }

    /* renamed from: getBodySmallSize-XSAIIZE  reason: not valid java name */
    public final long m71339getBodySmallSizeXSAIIZE() {
        return f28140m;
    }

    /* renamed from: getBodySmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71340getBodySmallTrackingXSAIIZE() {
        return f28142n;
    }

    @NotNull
    public final FontWeight getBodySmallWeight() {
        return f28144o;
    }

    @NotNull
    public final GenericFontFamily getDisplayLargeFont() {
        return f28146p;
    }

    /* renamed from: getDisplayLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71341getDisplayLargeLineHeightXSAIIZE() {
        return f28148q;
    }

    /* renamed from: getDisplayLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71342getDisplayLargeSizeXSAIIZE() {
        return f28150r;
    }

    /* renamed from: getDisplayLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71343getDisplayLargeTrackingXSAIIZE() {
        return f28152s;
    }

    @NotNull
    public final FontWeight getDisplayLargeWeight() {
        return f28154t;
    }

    @NotNull
    public final GenericFontFamily getDisplayMediumFont() {
        return f28156u;
    }

    /* renamed from: getDisplayMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71344getDisplayMediumLineHeightXSAIIZE() {
        return f28158v;
    }

    /* renamed from: getDisplayMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71345getDisplayMediumSizeXSAIIZE() {
        return f28160w;
    }

    /* renamed from: getDisplayMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71346getDisplayMediumTrackingXSAIIZE() {
        return f28162x;
    }

    @NotNull
    public final FontWeight getDisplayMediumWeight() {
        return f28163y;
    }

    @NotNull
    public final GenericFontFamily getDisplaySmallFont() {
        return f28164z;
    }

    /* renamed from: getDisplaySmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71347getDisplaySmallLineHeightXSAIIZE() {
        return f28090A;
    }

    /* renamed from: getDisplaySmallSize-XSAIIZE  reason: not valid java name */
    public final long m71348getDisplaySmallSizeXSAIIZE() {
        return f28091B;
    }

    /* renamed from: getDisplaySmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71349getDisplaySmallTrackingXSAIIZE() {
        return f28092C;
    }

    @NotNull
    public final FontWeight getDisplaySmallWeight() {
        return f28093D;
    }

    @NotNull
    public final GenericFontFamily getHeadlineLargeFont() {
        return f28094E;
    }

    /* renamed from: getHeadlineLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71350getHeadlineLargeLineHeightXSAIIZE() {
        return f28095F;
    }

    /* renamed from: getHeadlineLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71351getHeadlineLargeSizeXSAIIZE() {
        return f28096G;
    }

    /* renamed from: getHeadlineLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71352getHeadlineLargeTrackingXSAIIZE() {
        return f28097H;
    }

    @NotNull
    public final FontWeight getHeadlineLargeWeight() {
        return f28098I;
    }

    @NotNull
    public final GenericFontFamily getHeadlineMediumFont() {
        return f28099J;
    }

    /* renamed from: getHeadlineMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71353getHeadlineMediumLineHeightXSAIIZE() {
        return f28100K;
    }

    /* renamed from: getHeadlineMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71354getHeadlineMediumSizeXSAIIZE() {
        return f28101L;
    }

    /* renamed from: getHeadlineMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71355getHeadlineMediumTrackingXSAIIZE() {
        return f28102M;
    }

    @NotNull
    public final FontWeight getHeadlineMediumWeight() {
        return f28103N;
    }

    @NotNull
    public final GenericFontFamily getHeadlineSmallFont() {
        return f28104O;
    }

    /* renamed from: getHeadlineSmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71356getHeadlineSmallLineHeightXSAIIZE() {
        return f28105P;
    }

    /* renamed from: getHeadlineSmallSize-XSAIIZE  reason: not valid java name */
    public final long m71357getHeadlineSmallSizeXSAIIZE() {
        return f28106Q;
    }

    /* renamed from: getHeadlineSmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71358getHeadlineSmallTrackingXSAIIZE() {
        return f28107R;
    }

    @NotNull
    public final FontWeight getHeadlineSmallWeight() {
        return f28108S;
    }

    @NotNull
    public final GenericFontFamily getLabelLargeFont() {
        return f28109T;
    }

    /* renamed from: getLabelLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71359getLabelLargeLineHeightXSAIIZE() {
        return f28110U;
    }

    /* renamed from: getLabelLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71360getLabelLargeSizeXSAIIZE() {
        return f28111V;
    }

    /* renamed from: getLabelLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71361getLabelLargeTrackingXSAIIZE() {
        return f28112W;
    }

    @NotNull
    public final FontWeight getLabelLargeWeight() {
        return f28113X;
    }

    @NotNull
    public final GenericFontFamily getLabelMediumFont() {
        return f28114Y;
    }

    /* renamed from: getLabelMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71362getLabelMediumLineHeightXSAIIZE() {
        return f28115Z;
    }

    /* renamed from: getLabelMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71363getLabelMediumSizeXSAIIZE() {
        return f28117a0;
    }

    /* renamed from: getLabelMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71364getLabelMediumTrackingXSAIIZE() {
        return f28119b0;
    }

    @NotNull
    public final FontWeight getLabelMediumWeight() {
        return f28121c0;
    }

    @NotNull
    public final GenericFontFamily getLabelSmallFont() {
        return f28123d0;
    }

    /* renamed from: getLabelSmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71365getLabelSmallLineHeightXSAIIZE() {
        return f28125e0;
    }

    /* renamed from: getLabelSmallSize-XSAIIZE  reason: not valid java name */
    public final long m71366getLabelSmallSizeXSAIIZE() {
        return f28127f0;
    }

    /* renamed from: getLabelSmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71367getLabelSmallTrackingXSAIIZE() {
        return f28129g0;
    }

    @NotNull
    public final FontWeight getLabelSmallWeight() {
        return f28131h0;
    }

    @NotNull
    public final GenericFontFamily getTitleLargeFont() {
        return f28133i0;
    }

    /* renamed from: getTitleLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71368getTitleLargeLineHeightXSAIIZE() {
        return f28135j0;
    }

    /* renamed from: getTitleLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71369getTitleLargeSizeXSAIIZE() {
        return f28137k0;
    }

    /* renamed from: getTitleLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71370getTitleLargeTrackingXSAIIZE() {
        return f28139l0;
    }

    @NotNull
    public final FontWeight getTitleLargeWeight() {
        return f28141m0;
    }

    @NotNull
    public final GenericFontFamily getTitleMediumFont() {
        return f28143n0;
    }

    /* renamed from: getTitleMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71371getTitleMediumLineHeightXSAIIZE() {
        return f28145o0;
    }

    /* renamed from: getTitleMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71372getTitleMediumSizeXSAIIZE() {
        return f28147p0;
    }

    /* renamed from: getTitleMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71373getTitleMediumTrackingXSAIIZE() {
        return f28149q0;
    }

    @NotNull
    public final FontWeight getTitleMediumWeight() {
        return f28151r0;
    }

    @NotNull
    public final GenericFontFamily getTitleSmallFont() {
        return f28153s0;
    }

    /* renamed from: getTitleSmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71374getTitleSmallLineHeightXSAIIZE() {
        return f28155t0;
    }

    /* renamed from: getTitleSmallSize-XSAIIZE  reason: not valid java name */
    public final long m71375getTitleSmallSizeXSAIIZE() {
        return f28157u0;
    }

    /* renamed from: getTitleSmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71376getTitleSmallTrackingXSAIIZE() {
        return f28159v0;
    }

    @NotNull
    public final FontWeight getTitleSmallWeight() {
        return f28161w0;
    }
}
