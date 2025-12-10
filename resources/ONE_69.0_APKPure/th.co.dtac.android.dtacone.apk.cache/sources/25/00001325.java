package p000;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: U6 */
/* loaded from: classes5.dex */
public final class C1422U6 extends IntIterator {

    /* renamed from: a */
    public final int[] f6538a;

    /* renamed from: b */
    public int f6539b;

    public C1422U6(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f6538a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f6539b < this.f6538a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        try {
            int[] iArr = this.f6538a;
            int i = this.f6539b;
            this.f6539b = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f6539b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}