package p000;

import java.util.NoSuchElementException;
import kotlin.collections.ShortIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: X6 */
/* loaded from: classes5.dex */
public final class C1645X6 extends ShortIterator {

    /* renamed from: a */
    public final short[] f7467a;

    /* renamed from: b */
    public int f7468b;

    public C1645X6(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f7467a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7468b < this.f7467a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.ShortIterator
    public short nextShort() {
        try {
            short[] sArr = this.f7467a;
            int i = this.f7468b;
            this.f7468b = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f7468b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}