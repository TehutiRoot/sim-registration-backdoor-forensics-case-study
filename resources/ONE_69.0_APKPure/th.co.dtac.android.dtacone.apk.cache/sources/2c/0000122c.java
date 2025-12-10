package p000;

import java.util.NoSuchElementException;
import kotlin.collections.FloatIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T6 */
/* loaded from: classes5.dex */
public final class C1347T6 extends FloatIterator {

    /* renamed from: a */
    public final float[] f6254a;

    /* renamed from: b */
    public int f6255b;

    public C1347T6(float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f6254a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f6255b < this.f6254a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.FloatIterator
    public float nextFloat() {
        try {
            float[] fArr = this.f6254a;
            int i = this.f6255b;
            this.f6255b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f6255b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}