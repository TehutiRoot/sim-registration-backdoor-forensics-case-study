package p000;

import java.util.NoSuchElementException;
import kotlin.collections.ByteIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q6 */
/* loaded from: classes5.dex */
public final class C1137Q6 extends ByteIterator {

    /* renamed from: a */
    public final byte[] f5123a;

    /* renamed from: b */
    public int f5124b;

    public C1137Q6(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5123a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f5124b < this.f5123a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.ByteIterator
    public byte nextByte() {
        try {
            byte[] bArr = this.f5123a;
            int i = this.f5124b;
            this.f5124b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5124b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}