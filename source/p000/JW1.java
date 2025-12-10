package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: JW1 */
/* loaded from: classes5.dex */
public final class JW1 implements Iterator, KMappedMarker {

    /* renamed from: a */
    public final int f2821a;

    /* renamed from: b */
    public boolean f2822b;

    /* renamed from: c */
    public final int f2823c;

    /* renamed from: d */
    public int f2824d;

    public /* synthetic */ JW1(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    /* renamed from: a */
    public int m67744a() {
        int i = this.f2824d;
        if (i == this.f2821a) {
            if (this.f2822b) {
                this.f2822b = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f2824d = UInt.m74122constructorimpl(this.f2823c + i);
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2822b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return UInt.m74121boximpl(m67744a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public JW1(int i, int i2, int i3) {
        int compare;
        this.f2821a = i2;
        boolean z = false;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        if (i3 <= 0 ? compare >= 0 : compare <= 0) {
            z = true;
        }
        this.f2822b = z;
        this.f2823c = UInt.m74122constructorimpl(i3);
        this.f2824d = this.f2822b ? i : i2;
    }
}
