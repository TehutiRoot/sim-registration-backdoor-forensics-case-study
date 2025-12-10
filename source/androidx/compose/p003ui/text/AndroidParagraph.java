package androidx.compose.p003ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.text.android.TextLayout;
import androidx.compose.p003ui.text.android.selection.WordBoundary;
import androidx.compose.p003ui.text.android.style.PlaceholderSpan;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.p003ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.p003ui.text.platform.AndroidTextPaint;
import androidx.compose.p003ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bBl\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u001aJ\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$JQ\u0010-\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00107\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010;J+\u0010C\u001a\u00020\"2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001f\u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u0002092\u0006\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\bI\u0010;J \u0010L\u001a\u00020<2\u0006\u00108\u001a\u00020\u0004H\u0016ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010OJ\u0017\u0010Q\u001a\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010OJ\u0017\u0010S\u001a\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0000¢\u0006\u0004\bR\u0010OJ\u0017\u0010U\u001a\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0000¢\u0006\u0004\bT\u0010OJ\u0017\u0010W\u001a\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0000¢\u0006\u0004\bV\u0010OJ\u0017\u0010X\u001a\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bX\u0010OJ\u0017\u0010Y\u001a\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bY\u0010OJ\u0017\u0010Z\u001a\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bZ\u0010OJ\u0017\u0010[\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010^\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\bb\u0010\\J\u001f\u0010d\u001a\u00020/2\u0006\u00108\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u0006H\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020f2\u0006\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020f2\u0006\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\bi\u0010hJ9\u0010r\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010k\u001a\u00020j2\b\u0010m\u001a\u0004\u0018\u00010l2\b\u0010o\u001a\u0004\u0018\u00010nH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bp\u0010qJK\u0010r\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010k\u001a\u00020j2\b\u0010m\u001a\u0004\u0018\u00010l2\b\u0010o\u001a\u0004\u0018\u00010n2\b\u0010t\u001a\u0004\u0018\u00010s2\u0006\u0010v\u001a\u00020uH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010xJS\u0010r\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010z\u001a\u00020y2\u0006\u0010{\u001a\u00020/2\b\u0010m\u001a\u0004\u0018\u00010l2\b\u0010o\u001a\u0004\u0018\u00010n2\b\u0010t\u001a\u0004\u0018\u00010s2\u0006\u0010v\u001a\u00020uH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b|\u0010}R\u0018\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b-\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000f\n\u0005\b\u001e\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R#\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000f\n\u0005\b#\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R(\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u0012\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R'\u0010\u009a\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00108\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R!\u0010\u009f\u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u0084\u0001\u0010\u009e\u0001R \u0010¤\u0001\u001a\u00030 \u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b£\u0001\u0010\u0094\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R \u0010©\u0001\u001a\u00030¥\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b¨\u0001\u0010\u0094\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010¬\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0017\u0010®\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010«\u0001R\u0017\u0010°\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010«\u0001R\u0017\u0010²\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010«\u0001R\u0017\u0010´\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010«\u0001R\u0017\u0010¶\u0001\u001a\u00020/8VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010«\u0001R\u0017\u0010¸\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010\u0087\u0001R\u0017\u0010º\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010\u0083\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006»\u0001"}, m28850d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "paragraphIntrinsics", "", "maxLines", "", "ellipsis", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "density", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/android/TextLayout;", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "", "d", "(Landroidx/compose/ui/graphics/Canvas;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", PDPageLabelRange.STYLE_LETTERS_LOWER, "(IILandroid/text/TextUtils$TruncateAt;IIIII)Landroidx/compose/ui/text/android/TextLayout;", "", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextRange;", "range", "", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "getCursorRect", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineAscent$ui_text_release", "getLineAscent", "getLineBaseline$ui_text_release", "getLineBaseline", "getLineDescent$ui_text_release", "getLineDescent", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "I", "getMaxLines", "()I", OperatorName.CURVE_TO, "Z", "getEllipsis", "()Z", OperatorName.SET_LINE_CAPSTYLE, "getConstraints-msEJaDk", "()J", "e", "Landroidx/compose/ui/text/android/TextLayout;", "layout", "", OperatorName.FILL_NON_ZERO, "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "charSequence", OperatorName.NON_STROKING_GRAY, "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/android/selection/WordBoundary;", OperatorName.CLOSE_PATH, "Lkotlin/Lazy;", "()Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary", "Ljava/util/Locale;", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "textLocale", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "textPaint", "getWidth", "()F", "width", "getHeight", "height", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "didExceedMaxLines", "getLineCount", "lineCount", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,619:1\n1#2:620\n13579#3,2:621\n11335#3:623\n11670#3,3:624\n26#4:627\n26#4:628\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n204#1:621,2\n244#1:623\n244#1:624,3\n439#1:627\n443#1:628\n*E\n"})
/* renamed from: androidx.compose.ui.text.AndroidParagraph */
/* loaded from: classes2.dex */
public final class AndroidParagraph implements Paragraph {

    /* renamed from: a */
    public final AndroidParagraphIntrinsics f30957a;

    /* renamed from: b */
    public final int f30958b;

    /* renamed from: c */
    public final boolean f30959c;

    /* renamed from: d */
    public final long f30960d;

    /* renamed from: e */
    public final TextLayout f30961e;

    /* renamed from: f */
    public final CharSequence f30962f;

    /* renamed from: g */
    public final List f30963g;

    /* renamed from: h */
    public final Lazy f30964h;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.AndroidParagraph$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, z, j);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    /* renamed from: a */
    public final TextLayout m59131a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return new TextLayout(this.f30962f, getWidth(), getTextPaint$ui_text_release(), i, truncateAt, this.f30957a.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.f30957a.getStyle()), true, i3, i5, i6, i7, i4, i2, null, null, this.f30957a.getLayoutIntrinsics$ui_text_release(), 196736, null);
    }

    /* renamed from: b */
    public final ShaderBrushSpan[] m59130b(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return new ShaderBrushSpan[0];
        }
        CharSequence text = textLayout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        ShaderBrushSpan[] brushSpans = (ShaderBrushSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
        Intrinsics.checkNotNullExpressionValue(brushSpans, "brushSpans");
        if (brushSpans.length == 0) {
            return new ShaderBrushSpan[0];
        }
        return brushSpans;
    }

    /* renamed from: c */
    public final WordBoundary m59129c() {
        return (WordBoundary) this.f30964h.getValue();
    }

    /* renamed from: d */
    public final void m59128d(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f30961e.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q  reason: not valid java name */
    public final void m73084fillBoundingBoxes8ffj60Q(long j, @NotNull float[] array, int i) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f30961e.fillBoundingBoxes(TextRange.m73214getMinimpl(j), TextRange.m73213getMaximpl(j), array, i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getBidiRunDirection(int i) {
        if (this.f30961e.isRtlCharAt(i)) {
            return ResolvedTextDirection.Rtl;
        }
        return ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    @NotNull
    public Rect getBoundingBox(int i) {
        RectF boundingBox = this.f30961e.getBoundingBox(i);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    @NotNull
    public final CharSequence getCharSequence$ui_text_release() {
        return this.f30962f;
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m73085getConstraintsmsEJaDk() {
        return this.f30960d;
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    @NotNull
    public Rect getCursorRect(int i) {
        if (i >= 0 && i <= this.f30962f.length()) {
            float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.f30961e, i, false, 2, null);
            int lineForOffset = this.f30961e.getLineForOffset(i);
            return new Rect(primaryHorizontal$default, this.f30961e.getLineTop(lineForOffset), primaryHorizontal$default, this.f30961e.getLineBottom(lineForOffset));
        }
        throw new AssertionError("offset(" + i + ") is out of bounds (0," + this.f30962f.length());
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.f30961e.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.f30959c;
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getHeight() {
        return this.f30961e.getHeight();
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getHorizontalPosition(int i, boolean z) {
        if (z) {
            return TextLayout.getPrimaryHorizontal$default(this.f30961e, i, false, 2, null);
        }
        return TextLayout.getSecondaryHorizontal$default(this.f30961e, i, false, 2, null);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int i) {
        return this.f30961e.getLineAscent(i);
    }

    public final float getLineBaseline$ui_text_release(int i) {
        return this.f30961e.getLineBaseline(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getLineBottom(int i) {
        return this.f30961e.getLineBottom(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public int getLineCount() {
        return this.f30961e.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int i) {
        return this.f30961e.getLineDescent(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public int getLineEnd(int i, boolean z) {
        if (z) {
            return this.f30961e.getLineVisibleEnd(i);
        }
        return this.f30961e.getLineEnd(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public int getLineForOffset(int i) {
        return this.f30961e.getLineForOffset(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public int getLineForVerticalPosition(float f) {
        return this.f30961e.getLineForVertical((int) f);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getLineHeight(int i) {
        return this.f30961e.getLineHeight(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getLineLeft(int i) {
        return this.f30961e.getLineLeft(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getLineRight(int i) {
        return this.f30961e.getLineRight(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public int getLineStart(int i) {
        return this.f30961e.getLineStart(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getLineTop(int i) {
        return this.f30961e.getLineTop(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getLineWidth(int i) {
        return this.f30961e.getLineWidth(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.f30957a.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.f30958b;
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.f30957a.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public int mo73086getOffsetForPositionk4lQ0M(long j) {
        return this.f30961e.getOffsetForHorizontal(this.f30961e.getLineForVertical((int) Offset.m71503getYimpl(j)), Offset.m71502getXimpl(j));
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getParagraphDirection(int i) {
        if (this.f30961e.getParagraphDirection(this.f30961e.getLineForOffset(i)) == 1) {
            return ResolvedTextDirection.Ltr;
        }
        return ResolvedTextDirection.Rtl;
    }

    @NotNull
    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.f30957a;
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    @NotNull
    public Path getPathForRange(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= this.f30962f.length()) {
            android.graphics.Path path = new android.graphics.Path();
            this.f30961e.getSelectionPath(i, i2, path);
            return AndroidPath_androidKt.asComposePath(path);
        }
        throw new AssertionError("Start(" + i + ") or End(" + i2 + ") is out of Range(0.." + this.f30962f.length() + "), or start > end!");
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    @NotNull
    public List<Rect> getPlaceholderRects() {
        return this.f30963g;
    }

    @NotNull
    public final Locale getTextLocale$ui_text_release() {
        Locale textLocale = this.f30957a.getTextPaint$ui_text_release().getTextLocale();
        Intrinsics.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    @NotNull
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.f30957a.getTextPaint$ui_text_release();
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public float getWidth() {
        return Constraints.m73626getMaxWidthimpl(this.f30960d);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public long mo73087getWordBoundaryjx7JFs(int i) {
        return TextRangeKt.TextRange(m59129c().getWordStart(i), m59129c().getWordEnd(i));
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    public boolean isLineEllipsized(int i) {
        return this.f30961e.isLineEllipsized(i);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    /* renamed from: paint-LG529CI  reason: not valid java name */
    public void mo73088paintLG529CI(@NotNull Canvas canvas, long j, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int m73437getBlendMode0nO6VwU = getTextPaint$ui_text_release().m73437getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m73440setColor8_81llA(j);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m73438setBlendModes9anfk8(i);
        m59128d(canvas);
        getTextPaint$ui_text_release().m73438setBlendModes9anfk8(m73437getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    /* renamed from: paint-RPmYEkk  reason: not valid java name */
    public void mo73089paintRPmYEkk(@NotNull Canvas canvas, long j, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m73440setColor8_81llA(j);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        m59128d(canvas);
    }

    @Override // androidx.compose.p003ui.text.Paragraph
    /* renamed from: paint-hn5TExg  reason: not valid java name */
    public void mo73090painthn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float f, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        int m73437getBlendMode0nO6VwU = getTextPaint$ui_text_release().m73437getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m73439setBrush12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), f);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m73438setBlendModes9anfk8(i);
        m59128d(canvas);
        getTextPaint$ui_text_release().m73438setBlendModes9anfk8(m73437getBlendMode0nO6VwU);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i, boolean z, long j, FontFamily.Resolver resolver, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, list, list2, i, z, j, resolver, density);
    }

    public AndroidParagraph(AndroidParagraphIntrinsics paragraphIntrinsics, int i, boolean z, long j) {
        boolean m59125c;
        CharSequence charSequence$ui_text_release;
        int m59124d;
        int m59122f;
        int m59123e;
        int m59121g;
        int m59120h;
        List list;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float f;
        float lineBaseline2;
        int m59126b;
        Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        this.f30957a = paragraphIntrinsics;
        this.f30958b = i;
        this.f30959c = z;
        this.f30960d = j;
        if (Constraints.m73627getMinHeightimpl(j) != 0 || Constraints.m73628getMinWidthimpl(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i >= 1) {
            TextStyle style = paragraphIntrinsics.getStyle();
            m59125c = AndroidParagraph_androidKt.m59125c(style, z);
            if (m59125c) {
                charSequence$ui_text_release = AndroidParagraph_androidKt.m59127a(paragraphIntrinsics.getCharSequence$ui_text_release());
            } else {
                charSequence$ui_text_release = paragraphIntrinsics.getCharSequence$ui_text_release();
            }
            this.f30962f = charSequence$ui_text_release;
            m59124d = AndroidParagraph_androidKt.m59124d(style.m73245getTextAlignbuA522U());
            TextAlign m73245getTextAlignbuA522U = style.m73245getTextAlignbuA522U();
            int i2 = m73245getTextAlignbuA522U == null ? 0 : TextAlign.m73544equalsimpl0(m73245getTextAlignbuA522U.m73547unboximpl(), TextAlign.Companion.m73550getJustifye0LSkKk()) ? 1 : 0;
            m59122f = AndroidParagraph_androidKt.m59122f(style.getParagraphStyle$ui_text_release().m73127getHyphensEaSxIns());
            LineBreak m73243getLineBreakLgCVezo = style.m73243getLineBreakLgCVezo();
            m59123e = AndroidParagraph_androidKt.m59123e(m73243getLineBreakLgCVezo != null ? LineBreak.Strategy.m73486boximpl(LineBreak.m73477getStrategyfcGXIks(m73243getLineBreakLgCVezo.m73482unboximpl())) : null);
            LineBreak m73243getLineBreakLgCVezo2 = style.m73243getLineBreakLgCVezo();
            m59121g = AndroidParagraph_androidKt.m59121g(m73243getLineBreakLgCVezo2 != null ? LineBreak.Strictness.m73496boximpl(LineBreak.m73478getStrictnessusljTpc(m73243getLineBreakLgCVezo2.m73482unboximpl())) : null);
            LineBreak m73243getLineBreakLgCVezo3 = style.m73243getLineBreakLgCVezo();
            m59120h = AndroidParagraph_androidKt.m59120h(m73243getLineBreakLgCVezo3 != null ? LineBreak.WordBreak.m73507boximpl(LineBreak.m73479getWordBreakjp8hJ3c(m73243getLineBreakLgCVezo3.m73482unboximpl())) : null);
            TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
            TextLayout m59131a = m59131a(m59124d, i2, truncateAt, i, m59122f, m59123e, m59121g, m59120h);
            if (z && m59131a.getHeight() > Constraints.m73625getMaxHeightimpl(j) && i > 1) {
                m59126b = AndroidParagraph_androidKt.m59126b(m59131a, Constraints.m73625getMaxHeightimpl(j));
                if (m59126b >= 0 && m59126b != i) {
                    m59131a = m59131a(m59124d, i2, truncateAt, AbstractC11719c.coerceAtLeast(m59126b, 1), m59122f, m59123e, m59121g, m59120h);
                }
                this.f30961e = m59131a;
            } else {
                this.f30961e = m59131a;
            }
            getTextPaint$ui_text_release().m73439setBrush12SF9DM(style.getBrush(), SizeKt.Size(getWidth(), getHeight()), style.getAlpha());
            for (ShaderBrushSpan shaderBrushSpan : m59130b(this.f30961e)) {
                shaderBrushSpan.m73448setSizeuvyYCjk(SizeKt.Size(getWidth(), getHeight()));
            }
            CharSequence charSequence = this.f30962f;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                Object[] spans = spanned.getSpans(0, charSequence.length(), PlaceholderSpan.class);
                Intrinsics.checkNotNullExpressionValue(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                    int spanStart = spanned.getSpanStart(placeholderSpan);
                    int spanEnd = spanned.getSpanEnd(placeholderSpan);
                    int lineForOffset = this.f30961e.getLineForOffset(spanStart);
                    boolean z2 = lineForOffset >= this.f30958b;
                    boolean z3 = this.f30961e.getLineEllipsisCount(lineForOffset) > 0 && spanEnd > this.f30961e.getLineEllipsisOffset(lineForOffset);
                    boolean z4 = spanEnd > this.f30961e.getLineEnd(lineForOffset);
                    if (z3 || z4 || z2) {
                        rect = null;
                    } else {
                        int i3 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                        if (i3 == 1) {
                            horizontalPosition = getHorizontalPosition(spanStart, true);
                        } else if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            horizontalPosition = getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                        }
                        float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                        TextLayout textLayout = this.f30961e;
                        switch (placeholderSpan.getVerticalAlign()) {
                            case 0:
                                lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                break;
                            case 1:
                                lineTop = textLayout.getLineTop(lineForOffset);
                                break;
                            case 2:
                                lineBaseline = textLayout.getLineBottom(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                break;
                            case 3:
                                lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                                break;
                            case 4:
                                f = placeholderSpan.getFontMetrics().ascent;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = f + lineBaseline2;
                                break;
                            case 5:
                                lineTop = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                f = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = f + lineBaseline2;
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                        rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                    }
                    arrayList.add(rect);
                }
                list = arrayList;
            } else {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            this.f30963g = list;
            this.f30964h = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new AndroidParagraph$wordBoundary$2(this));
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph(String text, TextStyle style, List spanStyles, List placeholders, int i, boolean z, long j, FontFamily.Resolver fontFamilyResolver, Density density) {
        this(new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density), i, z, j, null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(density, "density");
    }
}
