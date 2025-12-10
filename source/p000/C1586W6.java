package p000;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W6 */
/* loaded from: classes5.dex */
public final class C1586W6 extends LongIterator {

    /* renamed from: a */
    public final long[] f7125a;

    /* renamed from: b */
    public int f7126b;

    public C1586W6(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f7125a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7126b < this.f7125a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        try {
            long[] jArr = this.f7125a;
            int i = this.f7126b;
            this.f7126b = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f7126b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
