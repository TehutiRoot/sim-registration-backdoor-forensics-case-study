package kotlin.ranges;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;

/* renamed from: kotlin.ranges.b */
/* loaded from: classes5.dex */
public class C11718b implements ClosedRange {

    /* renamed from: a */
    public final Comparable f68338a;

    /* renamed from: b */
    public final Comparable f68339b;

    public C11718b(Comparable start, Comparable endInclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
        this.f68338a = start;
        this.f68339b = endInclusive;
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean contains(Comparable comparable) {
        return ClosedRange.DefaultImpls.contains(this, comparable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11718b) {
            if (!isEmpty() || !((C11718b) obj).isEmpty()) {
                C11718b c11718b = (C11718b) obj;
                if (!Intrinsics.areEqual(getStart(), c11718b.getStart()) || !Intrinsics.areEqual(getEndInclusive(), c11718b.getEndInclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    public Comparable getEndInclusive() {
        return this.f68339b;
    }

    @Override // kotlin.ranges.ClosedRange
    public Comparable getStart() {
        return this.f68338a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return ClosedRange.DefaultImpls.isEmpty(this);
    }

    public String toString() {
        return getStart() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + getEndInclusive();
    }
}
