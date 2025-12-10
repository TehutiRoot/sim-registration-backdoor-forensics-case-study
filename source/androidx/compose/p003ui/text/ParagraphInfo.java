package androidx.compose.p003ui.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.Path;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u0016*\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001b\u001a\u00020\u001a*\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001b\u001a\u00020\u001d*\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001eJ\u0017\u0010\u001b\u001a\u00020\u001f*\u00020\u001fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b*\u0010)JV\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010$J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010$R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00109\u001a\u0004\b>\u0010$\"\u0004\b?\u0010@R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00109\u001a\u0004\bB\u0010$\"\u0004\bC\u0010@R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010)\"\u0004\bG\u0010HR\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010HR\u0011\u0010M\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bL\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006N"}, m28850d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "Landroidx/compose/ui/text/Paragraph;", "paragraph", "", "startIndex", "endIndex", "startLineIndex", "endLineIndex", "", "top", "bottom", "<init>", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)V", "toLocalIndex", "(I)I", "toGlobalIndex", "toLocalLineIndex", "toGlobalLineIndex", "toGlobalYPosition", "(F)F", "toLocalYPosition", "Landroidx/compose/ui/geometry/Offset;", "toLocal-MK-Hz9U", "(J)J", "toLocal", "Landroidx/compose/ui/geometry/Rect;", "toGlobal", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextRange;", "toGlobal-GEjPoXI", "component1", "()Landroidx/compose/ui/text/Paragraph;", "component2", "()I", "component3", "component4", "component5", "component6", "()F", "component7", "copy", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)Landroidx/compose/ui/text/ParagraphInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/Paragraph;", "getParagraph", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getStartIndex", OperatorName.CURVE_TO, "getEndIndex", "d", "getStartLineIndex", "setStartLineIndex", "(I)V", "e", "getEndLineIndex", "setEndLineIndex", OperatorName.FILL_NON_ZERO, "F", "getTop", "setTop", "(F)V", OperatorName.NON_STROKING_GRAY, "getBottom", "setBottom", "getLength", "length", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.ParagraphInfo */
/* loaded from: classes2.dex */
public final class ParagraphInfo {

    /* renamed from: a */
    public final Paragraph f31004a;

    /* renamed from: b */
    public final int f31005b;

    /* renamed from: c */
    public final int f31006c;

    /* renamed from: d */
    public int f31007d;

    /* renamed from: e */
    public int f31008e;

    /* renamed from: f */
    public float f31009f;

    /* renamed from: g */
    public float f31010g;

    public ParagraphInfo(@NotNull Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        this.f31004a = paragraph;
        this.f31005b = i;
        this.f31006c = i2;
        this.f31007d = i3;
        this.f31008e = i4;
        this.f31009f = f;
        this.f31010g = f2;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            paragraph = paragraphInfo.f31004a;
        }
        if ((i5 & 2) != 0) {
            i = paragraphInfo.f31005b;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = paragraphInfo.f31006c;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = paragraphInfo.f31007d;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = paragraphInfo.f31008e;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            f = paragraphInfo.f31009f;
        }
        float f3 = f;
        if ((i5 & 64) != 0) {
            f2 = paragraphInfo.f31010g;
        }
        return paragraphInfo.copy(paragraph, i6, i7, i8, i9, f3, f2);
    }

    @NotNull
    public final Paragraph component1() {
        return this.f31004a;
    }

    public final int component2() {
        return this.f31005b;
    }

    public final int component3() {
        return this.f31006c;
    }

    public final int component4() {
        return this.f31007d;
    }

    public final int component5() {
        return this.f31008e;
    }

    public final float component6() {
        return this.f31009f;
    }

    public final float component7() {
        return this.f31010g;
    }

    @NotNull
    public final ParagraphInfo copy(@NotNull Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        return new ParagraphInfo(paragraph, i, i2, i3, i4, f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphInfo) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
            return Intrinsics.areEqual(this.f31004a, paragraphInfo.f31004a) && this.f31005b == paragraphInfo.f31005b && this.f31006c == paragraphInfo.f31006c && this.f31007d == paragraphInfo.f31007d && this.f31008e == paragraphInfo.f31008e && Float.compare(this.f31009f, paragraphInfo.f31009f) == 0 && Float.compare(this.f31010g, paragraphInfo.f31010g) == 0;
        }
        return false;
    }

    public final float getBottom() {
        return this.f31010g;
    }

    public final int getEndIndex() {
        return this.f31006c;
    }

    public final int getEndLineIndex() {
        return this.f31008e;
    }

    public final int getLength() {
        return this.f31006c - this.f31005b;
    }

    @NotNull
    public final Paragraph getParagraph() {
        return this.f31004a;
    }

    public final int getStartIndex() {
        return this.f31005b;
    }

    public final int getStartLineIndex() {
        return this.f31007d;
    }

    public final float getTop() {
        return this.f31009f;
    }

    public int hashCode() {
        return (((((((((((this.f31004a.hashCode() * 31) + this.f31005b) * 31) + this.f31006c) * 31) + this.f31007d) * 31) + this.f31008e) * 31) + Float.floatToIntBits(this.f31009f)) * 31) + Float.floatToIntBits(this.f31010g);
    }

    public final void setBottom(float f) {
        this.f31010g = f;
    }

    public final void setEndLineIndex(int i) {
        this.f31008e = i;
    }

    public final void setStartLineIndex(int i) {
        this.f31007d = i;
    }

    public final void setTop(float f) {
        this.f31009f = f;
    }

    @NotNull
    public final Rect toGlobal(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.m71539translatek4lQ0M(OffsetKt.Offset(0.0f, this.f31009f));
    }

    /* renamed from: toGlobal-GEjPoXI  reason: not valid java name */
    public final long m73113toGlobalGEjPoXI(long j) {
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m73216getStartimpl(j)), toGlobalIndex(TextRange.m73211getEndimpl(j)));
    }

    public final int toGlobalIndex(int i) {
        return i + this.f31005b;
    }

    public final int toGlobalLineIndex(int i) {
        return i + this.f31007d;
    }

    public final float toGlobalYPosition(float f) {
        return f + this.f31009f;
    }

    /* renamed from: toLocal-MK-Hz9U  reason: not valid java name */
    public final long m73114toLocalMKHz9U(long j) {
        return OffsetKt.Offset(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j) - this.f31009f);
    }

    public final int toLocalIndex(int i) {
        return AbstractC11719c.coerceIn(i, this.f31005b, this.f31006c) - this.f31005b;
    }

    public final int toLocalLineIndex(int i) {
        return i - this.f31007d;
    }

    public final float toLocalYPosition(float f) {
        return f - this.f31009f;
    }

    @NotNull
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f31004a + ", startIndex=" + this.f31005b + ", endIndex=" + this.f31006c + ", startLineIndex=" + this.f31007d + ", endLineIndex=" + this.f31008e + ", top=" + this.f31009f + ", bottom=" + this.f31010g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @NotNull
    public final Path toGlobal(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        path.mo71639translatek4lQ0M(OffsetKt.Offset(0.0f, this.f31009f));
        return path;
    }

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i, int i2, int i3, int i4, float f, float f2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(paragraph, i, i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? -1.0f : f, (i5 & 64) != 0 ? -1.0f : f2);
    }
}
