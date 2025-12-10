package p000;

import java.util.NoSuchElementException;
import kotlin.collections.DoubleIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: S6 */
/* loaded from: classes5.dex */
public final class C1270S6 extends DoubleIterator {

    /* renamed from: a */
    public final double[] f5732a;

    /* renamed from: b */
    public int f5733b;

    public C1270S6(double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5732a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f5733b < this.f5732a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.DoubleIterator
    public double nextDouble() {
        try {
            double[] dArr = this.f5732a;
            int i = this.f5733b;
            this.f5733b = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5733b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}