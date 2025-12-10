package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: GX1 */
/* loaded from: classes5.dex */
public final class GX1 implements Iterator, KMappedMarker {

    /* renamed from: a */
    public final int f1998a;

    /* renamed from: b */
    public boolean f1999b;

    /* renamed from: c */
    public final int f2000c;

    /* renamed from: d */
    public int f2001d;

    public /* synthetic */ GX1(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    /* renamed from: a */
    public int m68270a() {
        int i = this.f2001d;
        if (i == this.f1998a) {
            if (this.f1999b) {
                this.f1999b = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f2001d = UInt.m74306constructorimpl(this.f2000c + i);
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1999b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return UInt.m74305boximpl(m68270a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public GX1(int i, int i2, int i3) {
        int compare;
        this.f1998a = i2;
        boolean z = false;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        if (i3 <= 0 ? compare >= 0 : compare <= 0) {
            z = true;
        }
        this.f1999b = z;
        this.f2000c = UInt.m74306constructorimpl(i3);
        this.f2001d = this.f1999b ? i : i2;
    }
}