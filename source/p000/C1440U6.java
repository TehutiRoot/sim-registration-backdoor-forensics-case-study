package p000;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: U6 */
/* loaded from: classes5.dex */
public final class C1440U6 extends IntIterator {

    /* renamed from: a */
    public final int[] f6226a;

    /* renamed from: b */
    public int f6227b;

    public C1440U6(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f6226a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f6227b < this.f6226a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        try {
            int[] iArr = this.f6226a;
            int i = this.f6227b;
            this.f6227b = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f6227b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
