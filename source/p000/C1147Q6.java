package p000;

import java.util.NoSuchElementException;
import kotlin.collections.ByteIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q6 */
/* loaded from: classes5.dex */
public final class C1147Q6 extends ByteIterator {

    /* renamed from: a */
    public final byte[] f4956a;

    /* renamed from: b */
    public int f4957b;

    public C1147Q6(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f4956a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f4957b < this.f4956a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.ByteIterator
    public byte nextByte() {
        try {
            byte[] bArr = this.f4956a;
            int i = this.f4957b;
            this.f4957b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f4957b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
