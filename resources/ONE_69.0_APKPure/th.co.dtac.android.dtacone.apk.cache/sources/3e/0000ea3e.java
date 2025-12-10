package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: mL1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC21117mL1 {
    /* renamed from: a */
    public static Comparator m26668a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        if (comparator == null) {
            return Ordering.natural();
        }
        return comparator;
    }

    /* renamed from: b */
    public static boolean m26667b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m26668a((SortedSet) iterable);
        } else if (iterable instanceof InterfaceC20944lL1) {
            comparator2 = ((InterfaceC20944lL1) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}