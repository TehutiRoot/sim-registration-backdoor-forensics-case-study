package com.google.common.collect;

import com.google.common.collect.AbstractC7986n;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.common.collect.g */
/* loaded from: classes4.dex */
public abstract class AbstractC7967g extends ForwardingMultiset implements SortedMultiset {

    /* renamed from: a */
    public transient Comparator f53692a;

    /* renamed from: b */
    public transient NavigableSet f53693b;

    /* renamed from: c */
    public transient Set f53694c;

    /* renamed from: com.google.common.collect.g$a */
    /* loaded from: classes4.dex */
    public class C7968a extends Multisets.AbstractC7823i {
        public C7968a() {
        }

        @Override // com.google.common.collect.Multisets.AbstractC7823i
        /* renamed from: a */
        public Multiset mo40266a() {
            return AbstractC7967g.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return AbstractC7967g.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC7967g.this.mo40281f().entrySet().size();
        }
    }

    @Override // com.google.common.collect.SortedMultiset, p000.InterfaceC21400oK1
    public Comparator<Object> comparator() {
        Comparator<Object> comparator = this.f53692a;
        if (comparator == null) {
            Ordering reverse = Ordering.from(mo40281f().comparator()).reverse();
            this.f53692a = reverse;
            return reverse;
        }
        return comparator;
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<Object> descendingMultiset() {
        return mo40281f();
    }

    /* renamed from: e */
    public Set m40282e() {
        return new C7968a();
    }

    public abstract Iterator entryIterator();

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public Set<Multiset.Entry<Object>> entrySet() {
        Set<Multiset.Entry<Object>> set = this.f53694c;
        if (set == null) {
            Set<Multiset.Entry<Object>> m40282e = m40282e();
            this.f53694c = m40282e;
            return m40282e;
        }
        return set;
    }

    /* renamed from: f */
    public abstract SortedMultiset mo40281f();

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<Object> firstEntry() {
        return mo40281f().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<Object> headMultiset(Object obj, BoundType boundType) {
        return mo40281f().tailMultiset(obj, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return Multisets.m40576h(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<Object> lastEntry() {
        return mo40281f().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<Object> pollFirstEntry() {
        return mo40281f().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<Object> pollLastEntry() {
        return mo40281f().pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<Object> subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return mo40281f().subMultiset(obj2, boundType2, obj, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<Object> tailMultiset(Object obj, BoundType boundType) {
        return mo40281f().headMultiset(obj, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return standardToArray();
    }

    @Override // com.google.common.collect.ForwardingObject
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public Multiset<Object> delegate() {
        return mo40281f();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public NavigableSet<Object> elementSet() {
        NavigableSet<Object> navigableSet = this.f53693b;
        if (navigableSet == null) {
            AbstractC7986n.C7988b c7988b = new AbstractC7986n.C7988b(this);
            this.f53693b = c7988b;
            return c7988b;
        }
        return navigableSet;
    }
}
