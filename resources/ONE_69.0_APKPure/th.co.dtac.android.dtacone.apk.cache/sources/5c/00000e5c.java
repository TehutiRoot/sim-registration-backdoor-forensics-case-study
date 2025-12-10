package p000;

import java.util.NoSuchElementException;
import kotlin.collections.BooleanIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: P6 */
/* loaded from: classes5.dex */
public final class C1063P6 extends BooleanIterator {

    /* renamed from: a */
    public final boolean[] f4673a;

    /* renamed from: b */
    public int f4674b;

    public C1063P6(boolean[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f4673a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f4674b < this.f4673a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.BooleanIterator
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.f4673a;
            int i = this.f4674b;
            this.f4674b = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f4674b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}