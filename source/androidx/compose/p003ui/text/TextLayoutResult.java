package androidx.compose.p003ui.text;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\rJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b%\u0010$J\u001b\u0010*\u001a\u00020\n2\u0006\u0010'\u001a\u00020&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u001e\u00101\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b2\u0010-J\u001d\u00106\u001a\u0002052\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\n¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010S\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010V\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bT\u0010P\u001a\u0004\bU\u0010RR\u001f\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0011\u0010_\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b`\u0010^R\u0011\u0010c\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bb\u0010^R\u0011\u0010e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bd\u0010?\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, m28850d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "layoutInput", "Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "Landroidx/compose/ui/unit/IntSize;", "size", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "lineIndex", "getLineStart", "(I)I", "", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "", "getLineTop", "(I)F", "getLineBottom", "getLineLeft", "getLineRight", TypedValues.CycleType.S_WAVE_OFFSET, "getLineForOffset", "vertical", "getLineForVerticalPosition", "(F)I", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "copy-O0kMr_c", "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/TextLayoutInput;", "getLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/MultiParagraph;", "getMultiParagraph", "()Landroidx/compose/ui/text/MultiParagraph;", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getSize-YbymL2g", "()J", "d", "F", "getFirstBaseline", "()F", "firstBaseline", "e", "getLastBaseline", "lastBaseline", "", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "getDidOverflowHeight", "()Z", "didOverflowHeight", "getDidOverflowWidth", "didOverflowWidth", "getHasVisualOverflow", "hasVisualOverflow", "getLineCount", "lineCount", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.TextLayoutResult */
/* loaded from: classes2.dex */
public final class TextLayoutResult {
    public static final int $stable = 8;

    /* renamed from: a */
    public final TextLayoutInput f31096a;

    /* renamed from: b */
    public final MultiParagraph f31097b;

    /* renamed from: c */
    public final long f31098c;

    /* renamed from: d */
    public final float f31099d;

    /* renamed from: e */
    public final float f31100e;

    /* renamed from: f */
    public final List f31101f;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, multiParagraph, j);
    }

    /* renamed from: copy-O0kMr_c$default */
    public static /* synthetic */ TextLayoutResult m73187copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            textLayoutInput = textLayoutResult.f31096a;
        }
        if ((i & 2) != 0) {
            j = textLayoutResult.f31098c;
        }
        return textLayoutResult.m73188copyO0kMr_c(textLayoutInput, j);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResult.getLineEnd(i, z);
    }

    @NotNull
    /* renamed from: copy-O0kMr_c */
    public final TextLayoutResult m73188copyO0kMr_c(@NotNull TextLayoutInput layoutInput, long j) {
        Intrinsics.checkNotNullParameter(layoutInput, "layoutInput");
        return new TextLayoutResult(layoutInput, this.f31097b, j, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        if (Intrinsics.areEqual(this.f31096a, textLayoutResult.f31096a) && Intrinsics.areEqual(this.f31097b, textLayoutResult.f31097b) && IntSize.m73816equalsimpl0(this.f31098c, textLayoutResult.f31098c) && this.f31099d == textLayoutResult.f31099d && this.f31100e == textLayoutResult.f31100e && Intrinsics.areEqual(this.f31101f, textLayoutResult.f31101f)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int i) {
        return this.f31097b.getBidiRunDirection(i);
    }

    @NotNull
    public final Rect getBoundingBox(int i) {
        return this.f31097b.getBoundingBox(i);
    }

    @NotNull
    public final Rect getCursorRect(int i) {
        return this.f31097b.getCursorRect(i);
    }

    public final boolean getDidOverflowHeight() {
        if (!this.f31097b.getDidExceedMaxLines() && IntSize.m73817getHeightimpl(this.f31098c) >= this.f31097b.getHeight()) {
            return false;
        }
        return true;
    }

    public final boolean getDidOverflowWidth() {
        if (IntSize.m73818getWidthimpl(this.f31098c) < this.f31097b.getWidth()) {
            return true;
        }
        return false;
    }

    public final float getFirstBaseline() {
        return this.f31099d;
    }

    public final boolean getHasVisualOverflow() {
        if (!getDidOverflowWidth() && !getDidOverflowHeight()) {
            return false;
        }
        return true;
    }

    public final float getHorizontalPosition(int i, boolean z) {
        return this.f31097b.getHorizontalPosition(i, z);
    }

    public final float getLastBaseline() {
        return this.f31100e;
    }

    @NotNull
    public final TextLayoutInput getLayoutInput() {
        return this.f31096a;
    }

    public final float getLineBottom(int i) {
        return this.f31097b.getLineBottom(i);
    }

    public final int getLineCount() {
        return this.f31097b.getLineCount();
    }

    public final int getLineEnd(int i, boolean z) {
        return this.f31097b.getLineEnd(i, z);
    }

    public final int getLineForOffset(int i) {
        return this.f31097b.getLineForOffset(i);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.f31097b.getLineForVerticalPosition(f);
    }

    public final float getLineLeft(int i) {
        return this.f31097b.getLineLeft(i);
    }

    public final float getLineRight(int i) {
        return this.f31097b.getLineRight(i);
    }

    public final int getLineStart(int i) {
        return this.f31097b.getLineStart(i);
    }

    public final float getLineTop(int i) {
        return this.f31097b.getLineTop(i);
    }

    @NotNull
    public final MultiParagraph getMultiParagraph() {
        return this.f31097b;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M */
    public final int m73189getOffsetForPositionk4lQ0M(long j) {
        return this.f31097b.m73108getOffsetForPositionk4lQ0M(j);
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int i) {
        return this.f31097b.getParagraphDirection(i);
    }

    @NotNull
    public final Path getPathForRange(int i, int i2) {
        return this.f31097b.getPathForRange(i, i2);
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.f31101f;
    }

    /* renamed from: getSize-YbymL2g */
    public final long m73190getSizeYbymL2g() {
        return this.f31098c;
    }

    /* renamed from: getWordBoundary--jx7JFs */
    public final long m73191getWordBoundaryjx7JFs(int i) {
        return this.f31097b.m73109getWordBoundaryjx7JFs(i);
    }

    public int hashCode() {
        return (((((((((this.f31096a.hashCode() * 31) + this.f31097b.hashCode()) * 31) + IntSize.m73819hashCodeimpl(this.f31098c)) * 31) + Float.floatToIntBits(this.f31099d)) * 31) + Float.floatToIntBits(this.f31100e)) * 31) + this.f31101f.hashCode();
    }

    public final boolean isLineEllipsized(int i) {
        return this.f31097b.isLineEllipsized(i);
    }

    @NotNull
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f31096a + ", multiParagraph=" + this.f31097b + ", size=" + ((Object) IntSize.m73821toStringimpl(this.f31098c)) + ", firstBaseline=" + this.f31099d + ", lastBaseline=" + this.f31100e + ", placeholderRects=" + this.f31101f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TextLayoutResult(TextLayoutInput layoutInput, MultiParagraph multiParagraph, long j) {
        Intrinsics.checkNotNullParameter(layoutInput, "layoutInput");
        Intrinsics.checkNotNullParameter(multiParagraph, "multiParagraph");
        this.f31096a = layoutInput;
        this.f31097b = multiParagraph;
        this.f31098c = j;
        this.f31099d = multiParagraph.getFirstBaseline();
        this.f31100e = multiParagraph.getLastBaseline();
        this.f31101f = multiParagraph.getPlaceholderRects();
    }
}
