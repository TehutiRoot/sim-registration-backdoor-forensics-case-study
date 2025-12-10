package p000;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R6 */
/* loaded from: classes5.dex */
public final class C1199R6 extends CharIterator {

    /* renamed from: a */
    public final char[] f5401a;

    /* renamed from: b */
    public int f5402b;

    public C1199R6(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f5401a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f5402b < this.f5401a.length) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        try {
            char[] cArr = this.f5401a;
            int i = this.f5402b;
            this.f5402b = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5402b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}