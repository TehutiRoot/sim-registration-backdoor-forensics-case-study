package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: pK1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC21572pK1 {
    /* renamed from: a */
    public static Comparator m23698a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        if (comparator == null) {
            return Ordering.natural();
        }
        return comparator;
    }

    /* renamed from: b */
    public static boolean m23697b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m23698a((SortedSet) iterable);
        } else if (iterable instanceof InterfaceC21400oK1) {
            comparator2 = ((InterfaceC21400oK1) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}
