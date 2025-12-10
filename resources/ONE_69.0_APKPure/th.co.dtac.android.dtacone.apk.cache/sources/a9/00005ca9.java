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

@Metadata(m29143d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0003\b×\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0015\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR \u0010!\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR \u0010$\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR \u0010'\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000eR\u0017\u0010*\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000eR \u00103\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000eR \u00106\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u000eR\u0017\u00109\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b7\u0010\u0018\u001a\u0004\b8\u0010\u001aR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\f\u001a\u0004\b>\u0010\u000eR \u0010B\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\bA\u0010\u000eR \u0010E\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\f\u001a\u0004\bD\u0010\u000eR\u0017\u0010H\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bF\u0010\u0018\u001a\u0004\bG\u0010\u001aR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR \u0010N\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bM\u0010\u000eR \u0010Q\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\bP\u0010\u000eR \u0010T\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\f\u001a\u0004\bS\u0010\u000eR\u0017\u0010W\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bU\u0010\u0018\u001a\u0004\bV\u0010\u001aR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR \u0010]\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\f\u001a\u0004\b\\\u0010\u000eR \u0010`\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b^\u0010\f\u001a\u0004\b_\u0010\u000eR \u0010c\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010\f\u001a\u0004\bb\u0010\u000eR\u0017\u0010f\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bd\u0010\u0018\u001a\u0004\be\u0010\u001aR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR \u0010l\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bj\u0010\f\u001a\u0004\bk\u0010\u000eR \u0010o\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bm\u0010\f\u001a\u0004\bn\u0010\u000eR \u0010r\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010\f\u001a\u0004\bq\u0010\u000eR\u0017\u0010u\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bs\u0010\u0018\u001a\u0004\bt\u0010\u001aR\u0017\u0010w\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bv\u0010\bR \u0010z\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bx\u0010\f\u001a\u0004\by\u0010\u000eR \u0010}\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b{\u0010\f\u001a\u0004\b|\u0010\u000eR!\u0010\u0080\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\f\u001a\u0004\b\u007f\u0010\u000eR\u001a\u0010\u0083\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0018\u001a\u0005\b\u0082\u0001\u0010\u001aR\u001a\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0005\b\u0085\u0001\u0010\bR#\u0010\u0089\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\f\u001a\u0005\b\u0088\u0001\u0010\u000eR#\u0010\u008c\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\f\u001a\u0005\b\u008b\u0001\u0010\u000eR#\u0010\u008f\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\f\u001a\u0005\b\u008e\u0001\u0010\u000eR\u001a\u0010\u0092\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0018\u001a\u0005\b\u0091\u0001\u0010\u001aR\u001a\u0010\u0095\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR#\u0010\u0098\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\f\u001a\u0005\b\u0097\u0001\u0010\u000eR#\u0010\u009b\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\f\u001a\u0005\b\u009a\u0001\u0010\u000eR#\u0010\u009e\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\f\u001a\u0005\b\u009d\u0001\u0010\u000eR\u001a\u0010¡\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0018\u001a\u0005\b \u0001\u0010\u001aR\u001a\u0010¤\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0006\u001a\u0005\b£\u0001\u0010\bR#\u0010§\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¥\u0001\u0010\f\u001a\u0005\b¦\u0001\u0010\u000eR#\u0010ª\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¨\u0001\u0010\f\u001a\u0005\b©\u0001\u0010\u000eR#\u0010\u00ad\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b«\u0001\u0010\f\u001a\u0005\b¬\u0001\u0010\u000eR\u001a\u0010°\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b®\u0001\u0010\u0018\u001a\u0005\b¯\u0001\u0010\u001aR\u001a\u0010³\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0006\u001a\u0005\b²\u0001\u0010\bR#\u0010¶\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b´\u0001\u0010\f\u001a\u0005\bµ\u0001\u0010\u000eR#\u0010¹\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b·\u0001\u0010\f\u001a\u0005\b¸\u0001\u0010\u000eR#\u0010¼\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bº\u0001\u0010\f\u001a\u0005\b»\u0001\u0010\u000eR\u001a\u0010¿\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0018\u001a\u0005\b¾\u0001\u0010\u001aR\u001a\u0010Â\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÀ\u0001\u0010\u0006\u001a\u0005\bÁ\u0001\u0010\bR#\u0010Å\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\f\u001a\u0005\bÄ\u0001\u0010\u000eR#\u0010È\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÆ\u0001\u0010\f\u001a\u0005\bÇ\u0001\u0010\u000eR#\u0010Ë\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\f\u001a\u0005\bÊ\u0001\u0010\u000eR\u001a\u0010Î\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\bÌ\u0001\u0010\u0018\u001a\u0005\bÍ\u0001\u0010\u001aR\u001a\u0010Ñ\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\u0006\u001a\u0005\bÐ\u0001\u0010\bR#\u0010Ô\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÒ\u0001\u0010\f\u001a\u0005\bÓ\u0001\u0010\u000eR#\u0010×\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÕ\u0001\u0010\f\u001a\u0005\bÖ\u0001\u0010\u000eR#\u0010Ú\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bØ\u0001\u0010\f\u001a\u0005\bÙ\u0001\u0010\u000eR\u001a\u0010Ý\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\bÛ\u0001\u0010\u0018\u001a\u0005\bÜ\u0001\u0010\u001aR\u001a\u0010à\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÞ\u0001\u0010\u0006\u001a\u0005\bß\u0001\u0010\bR#\u0010ã\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bá\u0001\u0010\f\u001a\u0005\bâ\u0001\u0010\u000eR#\u0010æ\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bä\u0001\u0010\f\u001a\u0005\bå\u0001\u0010\u000eR#\u0010é\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bç\u0001\u0010\f\u001a\u0005\bè\u0001\u0010\u000eR\u001a\u0010ì\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\bê\u0001\u0010\u0018\u001a\u0005\bë\u0001\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006í\u0001"}, m29142d2 = {"Landroidx/compose/material3/tokens/TypeScaleTokens;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/GenericFontFamily;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/font/GenericFontFamily;", "getBodyLargeFont", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "BodyLargeFont", "Landroidx/compose/ui/unit/TextUnit;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getBodyLargeLineHeight-XSAIIZE", "()J", "BodyLargeLineHeight", OperatorName.CURVE_TO, "getBodyLargeSize-XSAIIZE", "BodyLargeSize", "d", "getBodyLargeTracking-XSAIIZE", "BodyLargeTracking", "Landroidx/compose/ui/text/font/FontWeight;", "e", "Landroidx/compose/ui/text/font/FontWeight;", "getBodyLargeWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "BodyLargeWeight", OperatorName.FILL_NON_ZERO, "getBodyMediumFont", "BodyMediumFont", OperatorName.NON_STROKING_GRAY, "getBodyMediumLineHeight-XSAIIZE", "BodyMediumLineHeight", OperatorName.CLOSE_PATH, "getBodyMediumSize-XSAIIZE", "BodyMediumSize", "i", "getBodyMediumTracking-XSAIIZE", "BodyMediumTracking", OperatorName.SET_LINE_JOINSTYLE, "getBodyMediumWeight", "BodyMediumWeight", OperatorName.NON_STROKING_CMYK, "getBodySmallFont", "BodySmallFont", OperatorName.LINE_TO, "getBodySmallLineHeight-XSAIIZE", "BodySmallLineHeight", OperatorName.MOVE_TO, "getBodySmallSize-XSAIIZE", "BodySmallSize", OperatorName.ENDPATH, "getBodySmallTracking-XSAIIZE", "BodySmallTracking", "o", "getBodySmallWeight", "BodySmallWeight", "p", "getDisplayLargeFont", "DisplayLargeFont", OperatorName.SAVE, "getDisplayLargeLineHeight-XSAIIZE", "DisplayLargeLineHeight", PDPageLabelRange.STYLE_ROMAN_LOWER, "getDisplayLargeSize-XSAIIZE", "DisplayLargeSize", OperatorName.CLOSE_AND_STROKE, "getDisplayLargeTracking-XSAIIZE", "DisplayLargeTracking", "t", "getDisplayLargeWeight", "DisplayLargeWeight", "u", "getDisplayMediumFont", "DisplayMediumFont", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getDisplayMediumLineHeight-XSAIIZE", "DisplayMediumLineHeight", OperatorName.SET_LINE_WIDTH, "getDisplayMediumSize-XSAIIZE", "DisplayMediumSize", "x", "getDisplayMediumTracking-XSAIIZE", "DisplayMediumTracking", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getDisplayMediumWeight", "DisplayMediumWeight", "z", "getDisplaySmallFont", "DisplaySmallFont", "A", "getDisplaySmallLineHeight-XSAIIZE", "DisplaySmallLineHeight", "B", "getDisplaySmallSize-XSAIIZE", "DisplaySmallSize", "C", "getDisplaySmallTracking-XSAIIZE", "DisplaySmallTracking", "D", "getDisplaySmallWeight", "DisplaySmallWeight", ExifInterface.LONGITUDE_EAST, "getHeadlineLargeFont", "HeadlineLargeFont", "F", "getHeadlineLargeLineHeight-XSAIIZE", "HeadlineLargeLineHeight", OperatorName.STROKING_COLOR_GRAY, "getHeadlineLargeSize-XSAIIZE", "HeadlineLargeSize", "H", "getHeadlineLargeTracking-XSAIIZE", "HeadlineLargeTracking", "I", "getHeadlineLargeWeight", "HeadlineLargeWeight", "getHeadlineMediumFont", "HeadlineMediumFont", "K", "getHeadlineMediumLineHeight-XSAIIZE", "HeadlineMediumLineHeight", "L", "getHeadlineMediumSize-XSAIIZE", "HeadlineMediumSize", "M", "getHeadlineMediumTracking-XSAIIZE", "HeadlineMediumTracking", "N", "getHeadlineMediumWeight", "HeadlineMediumWeight", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getHeadlineSmallFont", "HeadlineSmallFont", "P", "getHeadlineSmallLineHeight-XSAIIZE", "HeadlineSmallLineHeight", OperatorName.RESTORE, "getHeadlineSmallSize-XSAIIZE", "HeadlineSmallSize", "R", "getHeadlineSmallTracking-XSAIIZE", "HeadlineSmallTracking", "S", "getHeadlineSmallWeight", "HeadlineSmallWeight", "T", "getLabelLargeFont", "LabelLargeFont", PDBorderStyleDictionary.STYLE_UNDERLINE, "getLabelLargeLineHeight-XSAIIZE", "LabelLargeLineHeight", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getLabelLargeSize-XSAIIZE", "LabelLargeSize", "W", "getLabelLargeTracking-XSAIIZE", "LabelLargeTracking", "X", "getLabelLargeWeight", "LabelLargeWeight", "Y", "getLabelMediumFont", "LabelMediumFont", "Z", "getLabelMediumLineHeight-XSAIIZE", "LabelMediumLineHeight", "a0", "getLabelMediumSize-XSAIIZE", "LabelMediumSize", "b0", "getLabelMediumTracking-XSAIIZE", "LabelMediumTracking", "c0", "getLabelMediumWeight", "LabelMediumWeight", OperatorName.TYPE3_D0, "getLabelSmallFont", "LabelSmallFont", "e0", "getLabelSmallLineHeight-XSAIIZE", "LabelSmallLineHeight", "f0", "getLabelSmallSize-XSAIIZE", "LabelSmallSize", "g0", "getLabelSmallTracking-XSAIIZE", "LabelSmallTracking", "h0", "getLabelSmallWeight", "LabelSmallWeight", "i0", "getTitleLargeFont", "TitleLargeFont", "j0", "getTitleLargeLineHeight-XSAIIZE", "TitleLargeLineHeight", "k0", "getTitleLargeSize-XSAIIZE", "TitleLargeSize", "l0", "getTitleLargeTracking-XSAIIZE", "TitleLargeTracking", "m0", "getTitleLargeWeight", "TitleLargeWeight", "n0", "getTitleMediumFont", "TitleMediumFont", "o0", "getTitleMediumLineHeight-XSAIIZE", "TitleMediumLineHeight", "p0", "getTitleMediumSize-XSAIIZE", "TitleMediumSize", "q0", "getTitleMediumTracking-XSAIIZE", "TitleMediumTracking", "r0", "getTitleMediumWeight", "TitleMediumWeight", "s0", "getTitleSmallFont", "TitleSmallFont", "t0", "getTitleSmallLineHeight-XSAIIZE", "TitleSmallLineHeight", "u0", "getTitleSmallSize-XSAIIZE", "TitleSmallSize", "v0", "getTitleSmallTracking-XSAIIZE", "TitleSmallTracking", "w0", "getTitleSmallWeight", "TitleSmallWeight", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTypeScaleTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeScaleTokens.kt\nandroidx/compose/material3/tokens/TypeScaleTokens\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,100:1\n94#2,2:101\n*S KotlinDebug\n*F\n+ 1 TypeScaleTokens.kt\nandroidx/compose/material3/tokens/TypeScaleTokens\n*L\n42#1:101,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TypeScaleTokens {

    /* renamed from: A */
    public static final long f28178A;

    /* renamed from: B */
    public static final long f28179B;

    /* renamed from: C */
    public static final long f28180C;

    /* renamed from: D */
    public static final FontWeight f28181D;

    /* renamed from: E */
    public static final GenericFontFamily f28182E;

    /* renamed from: F */
    public static final long f28183F;

    /* renamed from: G */
    public static final long f28184G;

    /* renamed from: H */
    public static final long f28185H;

    /* renamed from: I */
    public static final FontWeight f28186I;
    @NotNull
    public static final TypeScaleTokens INSTANCE = new TypeScaleTokens();

    /* renamed from: J */
    public static final GenericFontFamily f28187J;

    /* renamed from: K */
    public static final long f28188K;

    /* renamed from: L */
    public static final long f28189L;

    /* renamed from: M */
    public static final long f28190M;

    /* renamed from: N */
    public static final FontWeight f28191N;

    /* renamed from: O */
    public static final GenericFontFamily f28192O;

    /* renamed from: P */
    public static final long f28193P;

    /* renamed from: Q */
    public static final long f28194Q;

    /* renamed from: R */
    public static final long f28195R;

    /* renamed from: S */
    public static final FontWeight f28196S;

    /* renamed from: T */
    public static final GenericFontFamily f28197T;

    /* renamed from: U */
    public static final long f28198U;

    /* renamed from: V */
    public static final long f28199V;

    /* renamed from: W */
    public static final long f28200W;

    /* renamed from: X */
    public static final FontWeight f28201X;

    /* renamed from: Y */
    public static final GenericFontFamily f28202Y;

    /* renamed from: Z */
    public static final long f28203Z;

    /* renamed from: a */
    public static final GenericFontFamily f28204a;

    /* renamed from: a0 */
    public static final long f28205a0;

    /* renamed from: b */
    public static final long f28206b;

    /* renamed from: b0 */
    public static final long f28207b0;

    /* renamed from: c */
    public static final long f28208c;

    /* renamed from: c0 */
    public static final FontWeight f28209c0;

    /* renamed from: d */
    public static final long f28210d;

    /* renamed from: d0 */
    public static final GenericFontFamily f28211d0;

    /* renamed from: e */
    public static final FontWeight f28212e;

    /* renamed from: e0 */
    public static final long f28213e0;

    /* renamed from: f */
    public static final GenericFontFamily f28214f;

    /* renamed from: f0 */
    public static final long f28215f0;

    /* renamed from: g */
    public static final long f28216g;

    /* renamed from: g0 */
    public static final long f28217g0;

    /* renamed from: h */
    public static final long f28218h;

    /* renamed from: h0 */
    public static final FontWeight f28219h0;

    /* renamed from: i */
    public static final long f28220i;

    /* renamed from: i0 */
    public static final GenericFontFamily f28221i0;

    /* renamed from: j */
    public static final FontWeight f28222j;

    /* renamed from: j0 */
    public static final long f28223j0;

    /* renamed from: k */
    public static final GenericFontFamily f28224k;

    /* renamed from: k0 */
    public static final long f28225k0;

    /* renamed from: l */
    public static final long f28226l;

    /* renamed from: l0 */
    public static final long f28227l0;

    /* renamed from: m */
    public static final long f28228m;

    /* renamed from: m0 */
    public static final FontWeight f28229m0;

    /* renamed from: n */
    public static final long f28230n;

    /* renamed from: n0 */
    public static final GenericFontFamily f28231n0;

    /* renamed from: o */
    public static final FontWeight f28232o;

    /* renamed from: o0 */
    public static final long f28233o0;

    /* renamed from: p */
    public static final GenericFontFamily f28234p;

    /* renamed from: p0 */
    public static final long f28235p0;

    /* renamed from: q */
    public static final long f28236q;

    /* renamed from: q0 */
    public static final long f28237q0;

    /* renamed from: r */
    public static final long f28238r;

    /* renamed from: r0 */
    public static final FontWeight f28239r0;

    /* renamed from: s */
    public static final long f28240s;

    /* renamed from: s0 */
    public static final GenericFontFamily f28241s0;

    /* renamed from: t */
    public static final FontWeight f28242t;

    /* renamed from: t0 */
    public static final long f28243t0;

    /* renamed from: u */
    public static final GenericFontFamily f28244u;

    /* renamed from: u0 */
    public static final long f28245u0;

    /* renamed from: v */
    public static final long f28246v;

    /* renamed from: v0 */
    public static final long f28247v0;

    /* renamed from: w */
    public static final long f28248w;

    /* renamed from: w0 */
    public static final FontWeight f28249w0;

    /* renamed from: x */
    public static final long f28250x;

    /* renamed from: y */
    public static final FontWeight f28251y;

    /* renamed from: z */
    public static final GenericFontFamily f28252z;

    static {
        TypefaceTokens typefaceTokens = TypefaceTokens.INSTANCE;
        f28204a = typefaceTokens.getPlain();
        f28206b = TextUnitKt.getSp(24.0d);
        f28208c = TextUnitKt.getSp(16);
        f28210d = TextUnitKt.getSp(0.5d);
        f28212e = typefaceTokens.getWeightRegular();
        f28214f = typefaceTokens.getPlain();
        f28216g = TextUnitKt.getSp(20.0d);
        f28218h = TextUnitKt.getSp(14);
        f28220i = TextUnitKt.getSp(0.2d);
        f28222j = typefaceTokens.getWeightRegular();
        f28224k = typefaceTokens.getPlain();
        f28226l = TextUnitKt.getSp(16.0d);
        f28228m = TextUnitKt.getSp(12);
        f28230n = TextUnitKt.getSp(0.4d);
        f28232o = typefaceTokens.getWeightRegular();
        f28234p = typefaceTokens.getBrand();
        f28236q = TextUnitKt.getSp(64.0d);
        f28238r = TextUnitKt.getSp(57);
        long sp = TextUnitKt.getSp(0.2d);
        TextUnitKt.m74036checkArithmeticR2X_6o(sp);
        f28240s = TextUnitKt.pack(TextUnit.m74021getRawTypeimpl(sp), -TextUnit.m74023getValueimpl(sp));
        f28242t = typefaceTokens.getWeightRegular();
        f28244u = typefaceTokens.getBrand();
        f28246v = TextUnitKt.getSp(52.0d);
        f28248w = TextUnitKt.getSp(45);
        f28250x = TextUnitKt.getSp(0.0d);
        f28251y = typefaceTokens.getWeightRegular();
        f28252z = typefaceTokens.getBrand();
        f28178A = TextUnitKt.getSp(44.0d);
        f28179B = TextUnitKt.getSp(36);
        f28180C = TextUnitKt.getSp(0.0d);
        f28181D = typefaceTokens.getWeightRegular();
        f28182E = typefaceTokens.getBrand();
        f28183F = TextUnitKt.getSp(40.0d);
        f28184G = TextUnitKt.getSp(32);
        f28185H = TextUnitKt.getSp(0.0d);
        f28186I = typefaceTokens.getWeightRegular();
        f28187J = typefaceTokens.getBrand();
        f28188K = TextUnitKt.getSp(36.0d);
        f28189L = TextUnitKt.getSp(28);
        f28190M = TextUnitKt.getSp(0.0d);
        f28191N = typefaceTokens.getWeightRegular();
        f28192O = typefaceTokens.getBrand();
        f28193P = TextUnitKt.getSp(32.0d);
        f28194Q = TextUnitKt.getSp(24);
        f28195R = TextUnitKt.getSp(0.0d);
        f28196S = typefaceTokens.getWeightRegular();
        f28197T = typefaceTokens.getPlain();
        f28198U = TextUnitKt.getSp(20.0d);
        f28199V = TextUnitKt.getSp(14);
        f28200W = TextUnitKt.getSp(0.1d);
        f28201X = typefaceTokens.getWeightMedium();
        f28202Y = typefaceTokens.getPlain();
        f28203Z = TextUnitKt.getSp(16.0d);
        f28205a0 = TextUnitKt.getSp(12);
        f28207b0 = TextUnitKt.getSp(0.5d);
        f28209c0 = typefaceTokens.getWeightMedium();
        f28211d0 = typefaceTokens.getPlain();
        f28213e0 = TextUnitKt.getSp(16.0d);
        f28215f0 = TextUnitKt.getSp(11);
        f28217g0 = TextUnitKt.getSp(0.5d);
        f28219h0 = typefaceTokens.getWeightMedium();
        f28221i0 = typefaceTokens.getBrand();
        f28223j0 = TextUnitKt.getSp(28.0d);
        f28225k0 = TextUnitKt.getSp(22);
        f28227l0 = TextUnitKt.getSp(0.0d);
        f28229m0 = typefaceTokens.getWeightRegular();
        f28231n0 = typefaceTokens.getPlain();
        f28233o0 = TextUnitKt.getSp(24.0d);
        f28235p0 = TextUnitKt.getSp(16);
        f28237q0 = TextUnitKt.getSp(0.2d);
        f28239r0 = typefaceTokens.getWeightMedium();
        f28241s0 = typefaceTokens.getPlain();
        f28243t0 = TextUnitKt.getSp(20.0d);
        f28245u0 = TextUnitKt.getSp(14);
        f28247v0 = TextUnitKt.getSp(0.1d);
        f28249w0 = typefaceTokens.getWeightMedium();
    }

    @NotNull
    public final GenericFontFamily getBodyLargeFont() {
        return f28204a;
    }

    /* renamed from: getBodyLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71516getBodyLargeLineHeightXSAIIZE() {
        return f28206b;
    }

    /* renamed from: getBodyLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71517getBodyLargeSizeXSAIIZE() {
        return f28208c;
    }

    /* renamed from: getBodyLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71518getBodyLargeTrackingXSAIIZE() {
        return f28210d;
    }

    @NotNull
    public final FontWeight getBodyLargeWeight() {
        return f28212e;
    }

    @NotNull
    public final GenericFontFamily getBodyMediumFont() {
        return f28214f;
    }

    /* renamed from: getBodyMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71519getBodyMediumLineHeightXSAIIZE() {
        return f28216g;
    }

    /* renamed from: getBodyMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71520getBodyMediumSizeXSAIIZE() {
        return f28218h;
    }

    /* renamed from: getBodyMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71521getBodyMediumTrackingXSAIIZE() {
        return f28220i;
    }

    @NotNull
    public final FontWeight getBodyMediumWeight() {
        return f28222j;
    }

    @NotNull
    public final GenericFontFamily getBodySmallFont() {
        return f28224k;
    }

    /* renamed from: getBodySmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71522getBodySmallLineHeightXSAIIZE() {
        return f28226l;
    }

    /* renamed from: getBodySmallSize-XSAIIZE  reason: not valid java name */
    public final long m71523getBodySmallSizeXSAIIZE() {
        return f28228m;
    }

    /* renamed from: getBodySmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71524getBodySmallTrackingXSAIIZE() {
        return f28230n;
    }

    @NotNull
    public final FontWeight getBodySmallWeight() {
        return f28232o;
    }

    @NotNull
    public final GenericFontFamily getDisplayLargeFont() {
        return f28234p;
    }

    /* renamed from: getDisplayLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71525getDisplayLargeLineHeightXSAIIZE() {
        return f28236q;
    }

    /* renamed from: getDisplayLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71526getDisplayLargeSizeXSAIIZE() {
        return f28238r;
    }

    /* renamed from: getDisplayLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71527getDisplayLargeTrackingXSAIIZE() {
        return f28240s;
    }

    @NotNull
    public final FontWeight getDisplayLargeWeight() {
        return f28242t;
    }

    @NotNull
    public final GenericFontFamily getDisplayMediumFont() {
        return f28244u;
    }

    /* renamed from: getDisplayMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71528getDisplayMediumLineHeightXSAIIZE() {
        return f28246v;
    }

    /* renamed from: getDisplayMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71529getDisplayMediumSizeXSAIIZE() {
        return f28248w;
    }

    /* renamed from: getDisplayMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71530getDisplayMediumTrackingXSAIIZE() {
        return f28250x;
    }

    @NotNull
    public final FontWeight getDisplayMediumWeight() {
        return f28251y;
    }

    @NotNull
    public final GenericFontFamily getDisplaySmallFont() {
        return f28252z;
    }

    /* renamed from: getDisplaySmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71531getDisplaySmallLineHeightXSAIIZE() {
        return f28178A;
    }

    /* renamed from: getDisplaySmallSize-XSAIIZE  reason: not valid java name */
    public final long m71532getDisplaySmallSizeXSAIIZE() {
        return f28179B;
    }

    /* renamed from: getDisplaySmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71533getDisplaySmallTrackingXSAIIZE() {
        return f28180C;
    }

    @NotNull
    public final FontWeight getDisplaySmallWeight() {
        return f28181D;
    }

    @NotNull
    public final GenericFontFamily getHeadlineLargeFont() {
        return f28182E;
    }

    /* renamed from: getHeadlineLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71534getHeadlineLargeLineHeightXSAIIZE() {
        return f28183F;
    }

    /* renamed from: getHeadlineLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71535getHeadlineLargeSizeXSAIIZE() {
        return f28184G;
    }

    /* renamed from: getHeadlineLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71536getHeadlineLargeTrackingXSAIIZE() {
        return f28185H;
    }

    @NotNull
    public final FontWeight getHeadlineLargeWeight() {
        return f28186I;
    }

    @NotNull
    public final GenericFontFamily getHeadlineMediumFont() {
        return f28187J;
    }

    /* renamed from: getHeadlineMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71537getHeadlineMediumLineHeightXSAIIZE() {
        return f28188K;
    }

    /* renamed from: getHeadlineMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71538getHeadlineMediumSizeXSAIIZE() {
        return f28189L;
    }

    /* renamed from: getHeadlineMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71539getHeadlineMediumTrackingXSAIIZE() {
        return f28190M;
    }

    @NotNull
    public final FontWeight getHeadlineMediumWeight() {
        return f28191N;
    }

    @NotNull
    public final GenericFontFamily getHeadlineSmallFont() {
        return f28192O;
    }

    /* renamed from: getHeadlineSmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71540getHeadlineSmallLineHeightXSAIIZE() {
        return f28193P;
    }

    /* renamed from: getHeadlineSmallSize-XSAIIZE  reason: not valid java name */
    public final long m71541getHeadlineSmallSizeXSAIIZE() {
        return f28194Q;
    }

    /* renamed from: getHeadlineSmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71542getHeadlineSmallTrackingXSAIIZE() {
        return f28195R;
    }

    @NotNull
    public final FontWeight getHeadlineSmallWeight() {
        return f28196S;
    }

    @NotNull
    public final GenericFontFamily getLabelLargeFont() {
        return f28197T;
    }

    /* renamed from: getLabelLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71543getLabelLargeLineHeightXSAIIZE() {
        return f28198U;
    }

    /* renamed from: getLabelLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71544getLabelLargeSizeXSAIIZE() {
        return f28199V;
    }

    /* renamed from: getLabelLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71545getLabelLargeTrackingXSAIIZE() {
        return f28200W;
    }

    @NotNull
    public final FontWeight getLabelLargeWeight() {
        return f28201X;
    }

    @NotNull
    public final GenericFontFamily getLabelMediumFont() {
        return f28202Y;
    }

    /* renamed from: getLabelMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71546getLabelMediumLineHeightXSAIIZE() {
        return f28203Z;
    }

    /* renamed from: getLabelMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71547getLabelMediumSizeXSAIIZE() {
        return f28205a0;
    }

    /* renamed from: getLabelMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71548getLabelMediumTrackingXSAIIZE() {
        return f28207b0;
    }

    @NotNull
    public final FontWeight getLabelMediumWeight() {
        return f28209c0;
    }

    @NotNull
    public final GenericFontFamily getLabelSmallFont() {
        return f28211d0;
    }

    /* renamed from: getLabelSmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71549getLabelSmallLineHeightXSAIIZE() {
        return f28213e0;
    }

    /* renamed from: getLabelSmallSize-XSAIIZE  reason: not valid java name */
    public final long m71550getLabelSmallSizeXSAIIZE() {
        return f28215f0;
    }

    /* renamed from: getLabelSmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71551getLabelSmallTrackingXSAIIZE() {
        return f28217g0;
    }

    @NotNull
    public final FontWeight getLabelSmallWeight() {
        return f28219h0;
    }

    @NotNull
    public final GenericFontFamily getTitleLargeFont() {
        return f28221i0;
    }

    /* renamed from: getTitleLargeLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71552getTitleLargeLineHeightXSAIIZE() {
        return f28223j0;
    }

    /* renamed from: getTitleLargeSize-XSAIIZE  reason: not valid java name */
    public final long m71553getTitleLargeSizeXSAIIZE() {
        return f28225k0;
    }

    /* renamed from: getTitleLargeTracking-XSAIIZE  reason: not valid java name */
    public final long m71554getTitleLargeTrackingXSAIIZE() {
        return f28227l0;
    }

    @NotNull
    public final FontWeight getTitleLargeWeight() {
        return f28229m0;
    }

    @NotNull
    public final GenericFontFamily getTitleMediumFont() {
        return f28231n0;
    }

    /* renamed from: getTitleMediumLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71555getTitleMediumLineHeightXSAIIZE() {
        return f28233o0;
    }

    /* renamed from: getTitleMediumSize-XSAIIZE  reason: not valid java name */
    public final long m71556getTitleMediumSizeXSAIIZE() {
        return f28235p0;
    }

    /* renamed from: getTitleMediumTracking-XSAIIZE  reason: not valid java name */
    public final long m71557getTitleMediumTrackingXSAIIZE() {
        return f28237q0;
    }

    @NotNull
    public final FontWeight getTitleMediumWeight() {
        return f28239r0;
    }

    @NotNull
    public final GenericFontFamily getTitleSmallFont() {
        return f28241s0;
    }

    /* renamed from: getTitleSmallLineHeight-XSAIIZE  reason: not valid java name */
    public final long m71558getTitleSmallLineHeightXSAIIZE() {
        return f28243t0;
    }

    /* renamed from: getTitleSmallSize-XSAIIZE  reason: not valid java name */
    public final long m71559getTitleSmallSizeXSAIIZE() {
        return f28245u0;
    }

    /* renamed from: getTitleSmallTracking-XSAIIZE  reason: not valid java name */
    public final long m71560getTitleSmallTrackingXSAIIZE() {
        return f28247v0;
    }

    @NotNull
    public final FontWeight getTitleSmallWeight() {
        return f28249w0;
    }
}