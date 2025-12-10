package p000;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W6 */
/* loaded from: classes5.dex */
public final class C1573W6 extends LongIterator {

    /* renamed from: a */
    public final long[] f7183a;

    /* renamed from: b */
    public int f7184b;

    public C1573W6(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f7183a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7184b < this.f7183a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        try {
            long[] jArr = this.f7183a;
            int i = this.f7184b;
            this.f7184b = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f7184b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}