package kotlin.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\b\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\t\u001a'\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\b\u001a'\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\r\u0010\t¨\u0006\u000e"}, m29142d2 = {"", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "(II)I", "", "d", "(JJ)J", "(III)I", "(JJJ)J", "start", "end", "step", "getProgressionLastElement", "kotlin-stdlib"}, m29141k = 2, m29140mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProgressionUtilKt {
    /* renamed from: a */
    public static final int m29082a(int i, int i2, int i3) {
        return m29080c(m29080c(i, i3) - m29080c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final long m29081b(long j, long j2, long j3) {
        return m29079d(m29079d(j, j3) - m29079d(j2, j3), j3);
    }

    /* renamed from: c */
    public static final int m29080c(int i, int i2) {
        int i3 = i % i2;
        if (i3 < 0) {
            return i3 + i2;
        }
        return i3;
    }

    /* renamed from: d */
    public static final long m29079d(long j, long j2) {
        long j3 = j % j2;
        if (j3 < 0) {
            return j3 + j2;
        }
        return j3;
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m29082a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m29082a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            return j >= j2 ? j2 : j2 - m29081b(j2, j, j3);
        } else if (i < 0) {
            return j <= j2 ? j2 : j2 + m29081b(j, j2, -j3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}