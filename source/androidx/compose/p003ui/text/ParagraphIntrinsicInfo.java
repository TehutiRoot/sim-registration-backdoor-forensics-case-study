package androidx.compose.p003ui.text;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\f¨\u0006 "}, m28850d2 = {"Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "intrinsics", "", "startIndex", "endIndex", "<init>", "(Landroidx/compose/ui/text/ParagraphIntrinsics;II)V", "component1", "()Landroidx/compose/ui/text/ParagraphIntrinsics;", "component2", "()I", "component3", "copy", "(Landroidx/compose/ui/text/ParagraphIntrinsics;II)Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/ParagraphIntrinsics;", "getIntrinsics", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getStartIndex", OperatorName.CURVE_TO, "getEndIndex", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.ParagraphIntrinsicInfo */
/* loaded from: classes2.dex */
public final class ParagraphIntrinsicInfo {

    /* renamed from: a */
    public final ParagraphIntrinsics f31011a;

    /* renamed from: b */
    public final int f31012b;

    /* renamed from: c */
    public final int f31013c;

    public ParagraphIntrinsicInfo(@NotNull ParagraphIntrinsics intrinsics, int i, int i2) {
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
        this.f31011a = intrinsics;
        this.f31012b = i;
        this.f31013c = i2;
    }

    public static /* synthetic */ ParagraphIntrinsicInfo copy$default(ParagraphIntrinsicInfo paragraphIntrinsicInfo, ParagraphIntrinsics paragraphIntrinsics, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            paragraphIntrinsics = paragraphIntrinsicInfo.f31011a;
        }
        if ((i3 & 2) != 0) {
            i = paragraphIntrinsicInfo.f31012b;
        }
        if ((i3 & 4) != 0) {
            i2 = paragraphIntrinsicInfo.f31013c;
        }
        return paragraphIntrinsicInfo.copy(paragraphIntrinsics, i, i2);
    }

    @NotNull
    public final ParagraphIntrinsics component1() {
        return this.f31011a;
    }

    public final int component2() {
        return this.f31012b;
    }

    public final int component3() {
        return this.f31013c;
    }

    @NotNull
    public final ParagraphIntrinsicInfo copy(@NotNull ParagraphIntrinsics intrinsics, int i, int i2) {
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
        return new ParagraphIntrinsicInfo(intrinsics, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphIntrinsicInfo) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
            return Intrinsics.areEqual(this.f31011a, paragraphIntrinsicInfo.f31011a) && this.f31012b == paragraphIntrinsicInfo.f31012b && this.f31013c == paragraphIntrinsicInfo.f31013c;
        }
        return false;
    }

    public final int getEndIndex() {
        return this.f31013c;
    }

    @NotNull
    public final ParagraphIntrinsics getIntrinsics() {
        return this.f31011a;
    }

    public final int getStartIndex() {
        return this.f31012b;
    }

    public int hashCode() {
        return (((this.f31011a.hashCode() * 31) + this.f31012b) * 31) + this.f31013c;
    }

    @NotNull
    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f31011a + ", startIndex=" + this.f31012b + ", endIndex=" + this.f31013c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
