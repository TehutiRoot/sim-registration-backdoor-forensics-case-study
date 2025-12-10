package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.OpenEndRange;

/* renamed from: kotlin.ranges.a */
/* loaded from: classes5.dex */
public class C11717a implements OpenEndRange {

    /* renamed from: a */
    public final Comparable f68336a;

    /* renamed from: b */
    public final Comparable f68337b;

    public C11717a(Comparable start, Comparable endExclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
        this.f68336a = start;
        this.f68337b = endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean contains(Comparable comparable) {
        return OpenEndRange.DefaultImpls.contains(this, comparable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11717a) {
            if (!isEmpty() || !((C11717a) obj).isEmpty()) {
                C11717a c11717a = (C11717a) obj;
                if (!Intrinsics.areEqual(getStart(), c11717a.getStart()) || !Intrinsics.areEqual(getEndExclusive(), c11717a.getEndExclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public Comparable getEndExclusive() {
        return this.f68337b;
    }

    @Override // kotlin.ranges.OpenEndRange
    public Comparable getStart() {
        return this.f68336a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndExclusive().hashCode();
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return OpenEndRange.DefaultImpls.isEmpty(this);
    }

    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
