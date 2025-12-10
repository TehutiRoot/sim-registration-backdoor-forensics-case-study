package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: KW1 */
/* loaded from: classes5.dex */
public final class KW1 implements Iterator, KMappedMarker {

    /* renamed from: a */
    public final long f3206a;

    /* renamed from: b */
    public boolean f3207b;

    /* renamed from: c */
    public final long f3208c;

    /* renamed from: d */
    public long f3209d;

    public /* synthetic */ KW1(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* renamed from: a */
    public long m67610a() {
        long j = this.f3209d;
        if (j == this.f3206a) {
            if (this.f3207b) {
                this.f3207b = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f3209d = ULong.m74146constructorimpl(this.f3208c + j);
        }
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3207b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return ULong.m74145boximpl(m67610a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public KW1(long j, long j2, long j3) {
        int compare;
        this.f3206a = j2;
        boolean z = false;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        if (i <= 0 ? compare >= 0 : compare <= 0) {
            z = true;
        }
        this.f3207b = z;
        this.f3208c = ULong.m74146constructorimpl(j3);
        this.f3209d = this.f3207b ? j : j2;
    }
}
