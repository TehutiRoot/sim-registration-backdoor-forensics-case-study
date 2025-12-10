package androidx.compose.foundation.layout;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "", "", "crossAxisSize", "mainAxisSize", "startIndex", "endIndex", "beforeCrossAxisAlignmentLine", "", "mainAxisPositions", "<init>", "(IIIII[I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getCrossAxisSize", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMainAxisSize", OperatorName.CURVE_TO, "getStartIndex", "d", "getEndIndex", "e", "getBeforeCrossAxisAlignmentLine", OperatorName.FILL_NON_ZERO, "[I", "getMainAxisPositions", "()[I", "foundation-layout_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RowColumnMeasureHelperResult {

    /* renamed from: a */
    public final int f13311a;

    /* renamed from: b */
    public final int f13312b;

    /* renamed from: c */
    public final int f13313c;

    /* renamed from: d */
    public final int f13314d;

    /* renamed from: e */
    public final int f13315e;

    /* renamed from: f */
    public final int[] f13316f;

    public RowColumnMeasureHelperResult(int i, int i2, int i3, int i4, int i5, @NotNull int[] mainAxisPositions) {
        Intrinsics.checkNotNullParameter(mainAxisPositions, "mainAxisPositions");
        this.f13311a = i;
        this.f13312b = i2;
        this.f13313c = i3;
        this.f13314d = i4;
        this.f13315e = i5;
        this.f13316f = mainAxisPositions;
    }

    public final int getBeforeCrossAxisAlignmentLine() {
        return this.f13315e;
    }

    public final int getCrossAxisSize() {
        return this.f13311a;
    }

    public final int getEndIndex() {
        return this.f13314d;
    }

    @NotNull
    public final int[] getMainAxisPositions() {
        return this.f13316f;
    }

    public final int getMainAxisSize() {
        return this.f13312b;
    }

    public final int getStartIndex() {
        return this.f13313c;
    }
}