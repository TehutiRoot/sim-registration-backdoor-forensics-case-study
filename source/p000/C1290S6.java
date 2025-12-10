package p000;

import java.util.NoSuchElementException;
import kotlin.collections.DoubleIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: S6 */
/* loaded from: classes5.dex */
public final class C1290S6 extends DoubleIterator {

    /* renamed from: a */
    public final double[] f5514a;

    /* renamed from: b */
    public int f5515b;

    public C1290S6(double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5514a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f5515b < this.f5514a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.DoubleIterator
    public double nextDouble() {
        try {
            double[] dArr = this.f5514a;
            int i = this.f5515b;
            this.f5515b = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5515b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
