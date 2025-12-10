package p000;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R6 */
/* loaded from: classes5.dex */
public final class C1221R6 extends CharIterator {

    /* renamed from: a */
    public final char[] f5265a;

    /* renamed from: b */
    public int f5266b;

    public C1221R6(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5265a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f5266b < this.f5265a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        try {
            char[] cArr = this.f5265a;
            int i = this.f5266b;
            this.f5266b = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5266b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
