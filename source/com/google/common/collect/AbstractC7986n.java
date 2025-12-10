package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* renamed from: com.google.common.collect.n */
/* loaded from: classes4.dex */
public abstract class AbstractC7986n {

    /* renamed from: com.google.common.collect.n$a */
    /* loaded from: classes4.dex */
    public static class C7987a extends Multisets.AbstractC7822h implements SortedSet {

        /* renamed from: a */
        public final SortedMultiset f53722a;

        public C7987a(SortedMultiset sortedMultiset) {
            this.f53722a = sortedMultiset;
        }

        @Override // com.google.common.collect.Multisets.AbstractC7822h
        /* renamed from: b */
        public final SortedMultiset mo40204a() {
            return this.f53722a;
        }

        @Override // java.util.SortedSet
        public Comparator<Object> comparator() {
            return mo40204a().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return AbstractC7986n.m40205d(mo40204a().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<Object> headSet(Object obj) {
            return mo40204a().headMultiset(obj, BoundType.OPEN).elementSet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return Multisets.m40579e(mo40204a().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public Object last() {
            return AbstractC7986n.m40205d(mo40204a().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return mo40204a().subMultiset(obj, BoundType.CLOSED, obj2, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<Object> tailSet(Object obj) {
            return mo40204a().tailMultiset(obj, BoundType.CLOSED).elementSet();
        }
    }

    /* renamed from: com.google.common.collect.n$b */
    /* loaded from: classes4.dex */
    public static class C7988b extends C7987a implements NavigableSet {
        public C7988b(SortedMultiset sortedMultiset) {
            super(sortedMultiset);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object ceiling(Object obj) {
            return AbstractC7986n.m40206c(mo40204a().tailMultiset(obj, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<Object> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            return new C7988b(mo40204a().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object floor(Object obj) {
            return AbstractC7986n.m40206c(mo40204a().headMultiset(obj, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z) {
            return new C7988b(mo40204a().headMultiset(obj, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object higher(Object obj) {
            return AbstractC7986n.m40206c(mo40204a().tailMultiset(obj, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object lower(Object obj) {
            return AbstractC7986n.m40206c(mo40204a().headMultiset(obj, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object pollFirst() {
            return AbstractC7986n.m40206c(mo40204a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object pollLast() {
            return AbstractC7986n.m40206c(mo40204a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new C7988b(mo40204a().subMultiset(obj, BoundType.forBoolean(z), obj2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z) {
            return new C7988b(mo40204a().tailMultiset(obj, BoundType.forBoolean(z)));
        }
    }

    /* renamed from: c */
    public static Object m40206c(Multiset.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }

    /* renamed from: d */
    public static Object m40205d(Multiset.Entry entry) {
        if (entry != null) {
            return entry.getElement();
        }
        throw new NoSuchElementException();
    }
}
