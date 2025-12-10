package kotlin.ranges;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, m28850d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "", "first", "last", "step", "<init>", "(III)V", "", "hasNext", "()Z", "nextInt", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getStep", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "finalElement", OperatorName.CURVE_TO, "Z", "d", "next", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IntProgressionIterator extends IntIterator {

    /* renamed from: a */
    public final int f68315a;

    /* renamed from: b */
    public final int f68316b;

    /* renamed from: c */
    public boolean f68317c;

    /* renamed from: d */
    public int f68318d;

    public IntProgressionIterator(int i, int i2, int i3) {
        this.f68315a = i3;
        this.f68316b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f68317c = z;
        this.f68318d = z ? i : i2;
    }

    public final int getStep() {
        return this.f68315a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68317c;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i = this.f68318d;
        if (i == this.f68316b) {
            if (this.f68317c) {
                this.f68317c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f68318d = this.f68315a + i;
        }
        return i;
    }
}
