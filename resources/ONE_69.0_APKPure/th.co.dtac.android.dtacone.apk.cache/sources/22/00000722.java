package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: HX1 */
/* loaded from: classes5.dex */
public final class HX1 implements Iterator, KMappedMarker {

    /* renamed from: a */
    public final long f2402a;

    /* renamed from: b */
    public boolean f2403b;

    /* renamed from: c */
    public final long f2404c;

    /* renamed from: d */
    public long f2405d;

    public /* synthetic */ HX1(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* renamed from: a */
    public long m68108a() {
        long j = this.f2405d;
        if (j == this.f2402a) {
            if (this.f2403b) {
                this.f2403b = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f2405d = ULong.m74330constructorimpl(this.f2404c + j);
        }
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2403b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return ULong.m74329boximpl(m68108a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public HX1(long j, long j2, long j3) {
        int compare;
        this.f2402a = j2;
        boolean z = false;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        if (i <= 0 ? compare >= 0 : compare <= 0) {
            z = true;
        }
        this.f2403b = z;
        this.f2404c = ULong.m74330constructorimpl(j3);
        this.f2405d = this.f2403b ? j : j2;
    }
}