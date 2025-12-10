package androidx.compose.p003ui.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p003ui.text.font.Font;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.platform.AndroidMultiParagraphDrawKt;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\n\u0010\u0018B[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u001bB.\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u001eB^\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010#J?\u00101\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100JS\u00101\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\b\b\u0002\u00105\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107J[\u00101\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\u0006\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u00020\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\b\b\u0002\u00105\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\b¢\u0006\u0004\bC\u0010DJ\u001b\u0010I\u001a\u00020\u00042\u0006\u0010F\u001a\u00020Eø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0015\u0010K\u001a\u00020J2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\bK\u0010LJ\u001d\u0010N\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0006¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020P2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020P2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\bS\u0010RJ\u001e\u0010W\u001a\u00020T2\u0006\u0010 \u001a\u00020\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\u0015\u0010X\u001a\u00020J2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\bX\u0010LJ\u0015\u0010Y\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b[\u0010\\J\u0015\u0010]\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b]\u0010\\J\u0015\u0010^\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b^\u0010\\J\u0015\u0010_\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b_\u0010\\J\u0015\u0010`\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b`\u0010\\J\u0015\u0010a\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\ba\u0010\\J\u0015\u0010b\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\bb\u0010ZJ\u001f\u0010d\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010c\u001a\u00020\u0006¢\u0006\u0004\bd\u0010eJ\u0015\u0010f\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\bf\u0010gR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010o\u001a\u0004\bp\u0010qR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010s\u001a\u0004\bt\u0010uR\u0017\u0010x\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bv\u0010s\u001a\u0004\bw\u0010uR\u0017\u0010{\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\by\u0010l\u001a\u0004\bz\u0010nR \u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0\u00108\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR$\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\u00108\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010}\u001a\u0005\b\u0083\u0001\u0010\u007fR\u0015\u0010\r\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bh\u0010\u0085\u0001R\u0013\u0010\u0087\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010uR\u0013\u0010\u0089\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010uR\u0013\u0010\u008b\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010uR\u0013\u0010\u008d\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010u\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008e\u0001"}, m28850d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "", "maxLines", "", "ellipsis", "", "width", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", TypedValues.CycleType.S_WAVE_OFFSET, "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)V", OperatorName.CURVE_TO, "lineIndex", "d", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "(I)I", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "I", "getMaxLines", "()I", "Z", "getDidExceedMaxLines", "()Z", "didExceedMaxLines", "F", "getWidth", "()F", "e", "getHeight", "height", OperatorName.FILL_NON_ZERO, "getLineCount", "lineCount", OperatorName.NON_STROKING_GRAY, "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/ParagraphInfo;", OperatorName.CLOSE_PATH, "getParagraphInfoList$ui_text_release", "paragraphInfoList", "()Landroidx/compose/ui/text/AnnotatedString;", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,982:1\n127#2,3:983\n130#2:990\n131#2,2:1002\n133#2:1005\n33#3,4:986\n151#3,3:991\n33#3,4:994\n154#3,2:998\n38#3:1000\n156#3:1001\n38#3:1004\n33#3,6:1007\n33#3,6:1013\n1#4:1006\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n371#1:983,3\n371#1:990\n371#1:1002,2\n371#1:1005\n371#1:986,4\n373#1:991,3\n373#1:994,4\n373#1:998,2\n373#1:1000\n373#1:1001\n371#1:1004\n399#1:1007,6\n416#1:1013,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.MultiParagraph */
/* loaded from: classes2.dex */
public final class MultiParagraph {
    public static final int $stable = 8;

    /* renamed from: a */
    public final MultiParagraphIntrinsics f30991a;

    /* renamed from: b */
    public final int f30992b;

    /* renamed from: c */
    public final boolean f30993c;

    /* renamed from: d */
    public final float f30994d;

    /* renamed from: e */
    public final float f30995e;

    /* renamed from: f */
    public final int f30996f;

    /* renamed from: g */
    public final List f30997g;

    /* renamed from: h */
    public final List f30998h;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, list, i, z);
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return multiParagraph.getLineEnd(i, z);
    }

    /* renamed from: paint-LG529CI$default  reason: not valid java name */
    public static /* synthetic */ void m73105paintLG529CI$default(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        long j2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i3;
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j2 = j;
        }
        DrawStyle drawStyle2 = null;
        if ((i2 & 4) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i2 & 8) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i2 & 16) == 0) {
            drawStyle2 = drawStyle;
        }
        if ((i2 & 32) != 0) {
            i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        multiParagraph.m73110paintLG529CI(canvas, j2, shadow2, textDecoration2, drawStyle2, i3);
    }

    /* renamed from: paint-RPmYEkk$default  reason: not valid java name */
    public static /* synthetic */ void m73106paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        if ((i & 2) != 0) {
            j = Color.Companion.m71771getUnspecified0d7_KjU();
        }
        long j2 = j;
        if ((i & 4) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i & 8) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        multiParagraph.m73111paintRPmYEkk(canvas, j2, shadow2, textDecoration2);
    }

    /* renamed from: paint-hn5TExg$default  reason: not valid java name */
    public static /* synthetic */ void m73107painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        float f2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i2 & 16) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i2 & 32) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i2 & 64) != 0) {
            i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        multiParagraph.m73112painthn5TExg(canvas, brush, f2, shadow2, textDecoration2, drawStyle2, i3);
    }

    /* renamed from: a */
    public final AnnotatedString m59107a() {
        return this.f30991a.getAnnotatedString();
    }

    /* renamed from: b */
    public final void m59106b(int i) {
        if (i >= 0 && i < m59107a().getText().length()) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + m59107a().length() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* renamed from: c */
    public final void m59105c(int i) {
        if (i >= 0 && i <= m59107a().getText().length()) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + m59107a().length() + AbstractJsonLexerKt.END_LIST).toString());
    }

    /* renamed from: d */
    public final void m59104d(int i) {
        if (i >= 0 && i < this.f30996f) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + this.f30996f + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int i) {
        int findParagraphByIndex;
        m59105c(i);
        if (i == m59107a().length()) {
            findParagraphByIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f30998h);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.f30998h, i);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i));
    }

    @NotNull
    public final Rect getBoundingBox(int i) {
        m59106b(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByIndex(this.f30998h, i));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i)));
    }

    @NotNull
    public final Rect getCursorRect(int i) {
        int findParagraphByIndex;
        m59105c(i);
        if (i == m59107a().length()) {
            findParagraphByIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f30998h);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.f30998h, i);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(findParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.f30993c;
    }

    public final float getFirstBaseline() {
        if (this.f30998h.isEmpty()) {
            return 0.0f;
        }
        return ((ParagraphInfo) this.f30998h.get(0)).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.f30995e;
    }

    public final float getHorizontalPosition(int i, boolean z) {
        int findParagraphByIndex;
        m59105c(i);
        if (i == m59107a().length()) {
            findParagraphByIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f30998h);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.f30998h, i);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i), z);
    }

    @NotNull
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.f30991a;
    }

    public final float getLastBaseline() {
        if (this.f30998h.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f30998h);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int i) {
        m59104d(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByLineIndex(this.f30998h, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i)));
    }

    public final int getLineCount() {
        return this.f30996f;
    }

    public final int getLineEnd(int i, boolean z) {
        m59104d(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByLineIndex(this.f30998h, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i), z));
    }

    public final int getLineForOffset(int i) {
        int findParagraphByIndex;
        if (i >= m59107a().length()) {
            findParagraphByIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f30998h);
        } else if (i < 0) {
            findParagraphByIndex = 0;
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.f30998h, i);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(findParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i)));
    }

    public final int getLineForVerticalPosition(float f) {
        int findParagraphByY;
        if (f <= 0.0f) {
            findParagraphByY = 0;
        } else if (f >= this.f30995e) {
            findParagraphByY = CollectionsKt__CollectionsKt.getLastIndex(this.f30998h);
        } else {
            findParagraphByY = MultiParagraphKt.findParagraphByY(this.f30998h, f);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(findParagraphByY);
        if (paragraphInfo.getLength() == 0) {
            return Math.max(0, paragraphInfo.getStartIndex() - 1);
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f)));
    }

    public final float getLineHeight(int i) {
        m59104d(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByLineIndex(this.f30998h, i));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineLeft(int i) {
        m59104d(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByLineIndex(this.f30998h, i));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineRight(int i) {
        m59104d(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByLineIndex(this.f30998h, i));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i));
    }

    public final int getLineStart(int i) {
        m59104d(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByLineIndex(this.f30998h, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineTop(int i) {
        m59104d(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByLineIndex(this.f30998h, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineWidth(int i) {
        m59104d(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByLineIndex(this.f30998h, i));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getMaxIntrinsicWidth() {
        return this.f30991a.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.f30992b;
    }

    public final float getMinIntrinsicWidth() {
        return this.f30991a.getMinIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public final int m73108getOffsetForPositionk4lQ0M(long j) {
        int findParagraphByY;
        if (Offset.m71503getYimpl(j) <= 0.0f) {
            findParagraphByY = 0;
        } else if (Offset.m71503getYimpl(j) >= this.f30995e) {
            findParagraphByY = CollectionsKt__CollectionsKt.getLastIndex(this.f30998h);
        } else {
            findParagraphByY = MultiParagraphKt.findParagraphByY(this.f30998h, Offset.m71503getYimpl(j));
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(findParagraphByY);
        if (paragraphInfo.getLength() == 0) {
            return Math.max(0, paragraphInfo.getStartIndex() - 1);
        }
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo73086getOffsetForPositionk4lQ0M(paragraphInfo.m73114toLocalMKHz9U(j)));
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int i) {
        int findParagraphByIndex;
        m59105c(i);
        if (i == m59107a().length()) {
            findParagraphByIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f30998h);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.f30998h, i);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i));
    }

    @NotNull
    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.f30998h;
    }

    @NotNull
    public final Path getPathForRange(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= m59107a().getText().length()) {
            if (i == i2) {
                return AndroidPath_androidKt.Path();
            }
            Path Path = AndroidPath_androidKt.Path();
            int size = this.f30998h.size();
            for (int findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.f30998h, i); findParagraphByIndex < size; findParagraphByIndex++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(findParagraphByIndex);
                if (paragraphInfo.getStartIndex() >= i2) {
                    break;
                }
                if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                    AbstractC18371Rh1.m66425g(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i2))), 0L, 2, null);
                }
            }
            return Path;
        }
        throw new IllegalArgumentException(("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + m59107a().getText().length() + "), or start > end!").toString());
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.f30997g;
    }

    public final float getWidth() {
        return this.f30994d;
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public final long m73109getWordBoundaryjx7JFs(int i) {
        int findParagraphByIndex;
        m59105c(i);
        if (i == m59107a().length()) {
            findParagraphByIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f30998h);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.f30998h, i);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f30998h.get(findParagraphByIndex);
        return paragraphInfo.m73113toGlobalGEjPoXI(paragraphInfo.getParagraph().mo73087getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i)));
    }

    public final boolean isLineEllipsized(int i) {
        m59104d(i);
        return ((ParagraphInfo) this.f30998h.get(MultiParagraphKt.findParagraphByLineIndex(this.f30998h, i))).getParagraph().isLineEllipsized(i);
    }

    /* renamed from: paint-LG529CI  reason: not valid java name */
    public final void m73110paintLG529CI(@NotNull Canvas canvas, long j, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        List list = this.f30998h;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i2);
            paragraphInfo.getParagraph().mo73088paintLG529CI(canvas, j, shadow, textDecoration, drawStyle, i);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* renamed from: paint-RPmYEkk  reason: not valid java name */
    public final /* synthetic */ void m73111paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        List list = this.f30998h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i);
            paragraphInfo.getParagraph().mo73089paintRPmYEkk(canvas, j, shadow, textDecoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg  reason: not valid java name */
    public final void m73112painthn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float f, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        AndroidMultiParagraphDrawKt.m73429drawMultiParagraph7AXcY_I(this, canvas, brush, f, shadow, textDecoration, drawStyle, i);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    public MultiParagraph(MultiParagraphIntrinsics intrinsics, long j, int i, boolean z) {
        boolean z2;
        int m73625getMaxHeightimpl;
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
        this.f30991a = intrinsics;
        this.f30992b = i;
        if (Constraints.m73628getMinWidthimpl(j) == 0 && Constraints.m73627getMinHeightimpl(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = intrinsics.getInfoList$ui_text_release();
            int size = infoList$ui_text_release.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            while (i3 < size) {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i3);
                ParagraphIntrinsics intrinsics2 = paragraphIntrinsicInfo.getIntrinsics();
                int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
                if (Constraints.m73621getHasBoundedHeightimpl(j)) {
                    m73625getMaxHeightimpl = AbstractC11719c.coerceAtLeast(Constraints.m73625getMaxHeightimpl(j) - ParagraphKt.ceilToInt(f), i2);
                } else {
                    m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
                }
                Paragraph m73117Paragraph_EkL_Y = ParagraphKt.m73117Paragraph_EkL_Y(intrinsics2, ConstraintsKt.Constraints$default(0, m73626getMaxWidthimpl, 0, m73625getMaxHeightimpl, 5, null), this.f30992b - i4, z);
                float height = f + m73117Paragraph_EkL_Y.getHeight();
                int lineCount = i4 + m73117Paragraph_EkL_Y.getLineCount();
                List<ParagraphIntrinsicInfo> list = infoList$ui_text_release;
                arrayList.add(new ParagraphInfo(m73117Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i4, lineCount, f, height));
                if (m73117Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.f30992b && i3 != CollectionsKt__CollectionsKt.getLastIndex(this.f30991a.getInfoList$ui_text_release()))) {
                    z2 = true;
                    i4 = lineCount;
                    f = height;
                    break;
                }
                i3++;
                i4 = lineCount;
                f = height;
                i2 = 0;
                infoList$ui_text_release = list;
            }
            z2 = false;
            this.f30995e = f;
            this.f30996f = i4;
            this.f30993c = z2;
            this.f30998h = arrayList;
            this.f30994d = Constraints.m73626getMaxWidthimpl(j);
            List arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i5);
                List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
                ArrayList arrayList3 = new ArrayList(placeholderRects.size());
                int size3 = placeholderRects.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    Rect rect = placeholderRects.get(i6);
                    arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
                }
                AbstractC10410hs.addAll(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f30991a.getPlaceholders().size()) {
                int size4 = this.f30991a.getPlaceholders().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i7 = 0; i7 < size4; i7++) {
                    arrayList4.add(null);
                }
                arrayList2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
            }
            this.f30997g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? false : z, null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@NotNull MultiParagraphIntrinsics intrinsics, int i, boolean z, float f) {
        this(intrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z, null);
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? false : z, f, density, resourceLoader);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i, boolean z, float f, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader)), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list), (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, float f, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i, boolean z) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiParagraph(AnnotatedString annotatedString, TextStyle style, long j, Density density, FontFamily.Resolver fontFamilyResolver, List placeholders, int i, boolean z) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver), j, i, z, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
    }
}
