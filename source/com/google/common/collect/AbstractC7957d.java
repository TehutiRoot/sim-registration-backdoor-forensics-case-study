package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractC7986n;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* renamed from: com.google.common.collect.d */
/* loaded from: classes4.dex */
public abstract class AbstractC7957d extends AbstractC7951b implements SortedMultiset {
    final Comparator<Object> comparator;
    @CheckForNull
    @LazyInit
    private transient SortedMultiset<Object> descendingMultiset;

    /* renamed from: com.google.common.collect.d$a */
    /* loaded from: classes4.dex */
    public class C7958a extends AbstractC7967g {
        public C7958a() {
        }

        @Override // com.google.common.collect.AbstractC7967g
        public Iterator entryIterator() {
            return AbstractC7957d.this.descendingEntryIterator();
        }

        @Override // com.google.common.collect.AbstractC7967g
        /* renamed from: f */
        public SortedMultiset mo40281f() {
            return AbstractC7957d.this;
        }

        @Override // com.google.common.collect.AbstractC7967g, com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return AbstractC7957d.this.descendingIterator();
        }
    }

    public AbstractC7957d() {
        this(Ordering.natural());
    }

    public Comparator comparator() {
        return this.comparator;
    }

    public SortedMultiset<Object> createDescendingMultiset() {
        return new C7958a();
    }

    public abstract Iterator descendingEntryIterator();

    public Iterator<Object> descendingIterator() {
        return Multisets.m40576h(descendingMultiset());
    }

    public SortedMultiset descendingMultiset() {
        SortedMultiset<Object> sortedMultiset = this.descendingMultiset;
        if (sortedMultiset == null) {
            SortedMultiset<Object> createDescendingMultiset = createDescendingMultiset();
            this.descendingMultiset = createDescendingMultiset;
            return createDescendingMultiset;
        }
        return sortedMultiset;
    }

    public Multiset.Entry firstEntry() {
        Iterator entryIterator = entryIterator();
        if (entryIterator.hasNext()) {
            return (Multiset.Entry) entryIterator.next();
        }
        return null;
    }

    public Multiset.Entry lastEntry() {
        Iterator descendingEntryIterator = descendingEntryIterator();
        if (descendingEntryIterator.hasNext()) {
            return (Multiset.Entry) descendingEntryIterator.next();
        }
        return null;
    }

    public Multiset.Entry pollFirstEntry() {
        Iterator entryIterator = entryIterator();
        if (entryIterator.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) entryIterator.next();
            Multiset.Entry immutableEntry = Multisets.immutableEntry(entry.getElement(), entry.getCount());
            entryIterator.remove();
            return immutableEntry;
        }
        return null;
    }

    public Multiset.Entry pollLastEntry() {
        Iterator descendingEntryIterator = descendingEntryIterator();
        if (descendingEntryIterator.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) descendingEntryIterator.next();
            Multiset.Entry immutableEntry = Multisets.immutableEntry(entry.getElement(), entry.getCount());
            descendingEntryIterator.remove();
            return immutableEntry;
        }
        return null;
    }

    public SortedMultiset subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        Preconditions.checkNotNull(boundType);
        Preconditions.checkNotNull(boundType2);
        return tailMultiset(obj, boundType).headMultiset(obj2, boundType2);
    }

    public AbstractC7957d(Comparator comparator) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.AbstractC7951b
    public NavigableSet<Object> createElementSet() {
        return new AbstractC7986n.C7988b(this);
    }

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
    public NavigableSet elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
