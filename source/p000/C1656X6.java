package p000;

import java.util.NoSuchElementException;
import kotlin.collections.ShortIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: X6 */
/* loaded from: classes5.dex */
public final class C1656X6 extends ShortIterator {

    /* renamed from: a */
    public final short[] f7383a;

    /* renamed from: b */
    public int f7384b;

    public C1656X6(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f7383a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7384b < this.f7383a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.ShortIterator
    public short nextShort() {
        try {
            short[] sArr = this.f7383a;
            int i = this.f7384b;
            this.f7384b = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f7384b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
