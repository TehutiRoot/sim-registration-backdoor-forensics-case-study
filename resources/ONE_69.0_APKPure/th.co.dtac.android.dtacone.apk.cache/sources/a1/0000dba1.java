package kotlin.ranges;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, m29142d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "", "first", "last", "step", "<init>", "(JJJ)V", "", "hasNext", "()Z", "nextLong", "()J", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getStep", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "finalElement", OperatorName.CURVE_TO, "Z", "d", "next", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LongProgressionIterator extends LongIterator {

    /* renamed from: a */
    public final long f68357a;

    /* renamed from: b */
    public final long f68358b;

    /* renamed from: c */
    public boolean f68359c;

    /* renamed from: d */
    public long f68360d;

    public LongProgressionIterator(long j, long j2, long j3) {
        this.f68357a = j3;
        this.f68358b = j2;
        boolean z = false;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 >= 0 : i2 <= 0) {
            z = true;
        }
        this.f68359c = z;
        this.f68360d = z ? j : j2;
    }

    public final long getStep() {
        return this.f68357a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68359c;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j = this.f68360d;
        if (j == this.f68358b) {
            if (this.f68359c) {
                this.f68359c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f68360d = this.f68357a + j;
        }
        return j;
    }
}