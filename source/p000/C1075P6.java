package p000;

import java.util.NoSuchElementException;
import kotlin.collections.BooleanIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: P6 */
/* loaded from: classes5.dex */
public final class C1075P6 extends BooleanIterator {

    /* renamed from: a */
    public final boolean[] f4642a;

    /* renamed from: b */
    public int f4643b;

    public C1075P6(boolean[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f4642a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f4643b < this.f4642a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.BooleanIterator
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.f4642a;
            int i = this.f4643b;
            this.f4643b = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f4643b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
