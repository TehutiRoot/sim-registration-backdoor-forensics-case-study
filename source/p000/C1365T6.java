package p000;

import java.util.NoSuchElementException;
import kotlin.collections.FloatIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T6 */
/* loaded from: classes5.dex */
public final class C1365T6 extends FloatIterator {

    /* renamed from: a */
    public final float[] f5925a;

    /* renamed from: b */
    public int f5926b;

    public C1365T6(float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5925a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f5926b < this.f5925a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.FloatIterator
    public float nextFloat() {
        try {
            float[] fArr = this.f5925a;
            int i = this.f5926b;
            this.f5926b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5926b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
