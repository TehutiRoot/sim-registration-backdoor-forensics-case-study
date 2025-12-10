package kotlin.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0004\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\u0006\u001a'\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\u0004\u001a'\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, m28850d2 = {"Lkotlin/UInt;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "(III)I", "Lkotlin/ULong;", "(JJJ)J", "start", "end", "", "step", "getProgressionLastElement-Nkh28Cs", "getProgressionLastElement", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m28849k = 2, m28848mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UProgressionUtilKt {
    /* renamed from: a */
    public static final int m28786a(int i, int i2, int i3) {
        int compare;
        int m67028a = OW1.m67028a(i, i3);
        int m67028a2 = OW1.m67028a(i2, i3);
        compare = Integer.compare(m67028a ^ Integer.MIN_VALUE, m67028a2 ^ Integer.MIN_VALUE);
        int m74122constructorimpl = UInt.m74122constructorimpl(m67028a - m67028a2);
        if (compare < 0) {
            return UInt.m74122constructorimpl(m74122constructorimpl + i3);
        }
        return m74122constructorimpl;
    }

    /* renamed from: b */
    public static final long m28785b(long j, long j2, long j3) {
        int compare;
        long m66792a = PW1.m66792a(j, j3);
        long m66792a2 = PW1.m66792a(j2, j3);
        compare = Long.compare(m66792a ^ Long.MIN_VALUE, m66792a2 ^ Long.MIN_VALUE);
        long m74146constructorimpl = ULong.m74146constructorimpl(m66792a - m66792a2);
        if (compare < 0) {
            return ULong.m74146constructorimpl(m74146constructorimpl + j3);
        }
        return m74146constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g  reason: not valid java name */
    public static final long m74450getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        int compare;
        int compare2;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return ULong.m74146constructorimpl(j2 - m28785b(j2, j, ULong.m74146constructorimpl(j3)));
            }
            return j2;
        } else if (i < 0) {
            compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare > 0) {
                return ULong.m74146constructorimpl(j2 + m28785b(j, j2, ULong.m74146constructorimpl(-j3)));
            }
            return j2;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs  reason: not valid java name */
    public static final int m74451getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        int compare;
        int compare2;
        if (i3 > 0) {
            compare2 = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return UInt.m74122constructorimpl(i2 - m28786a(i2, i, UInt.m74122constructorimpl(i3)));
            }
            return i2;
        } else if (i3 < 0) {
            compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                return UInt.m74122constructorimpl(i2 + m28786a(i, i2, UInt.m74122constructorimpl(-i3)));
            }
            return i2;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
