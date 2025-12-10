package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.common.collect.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7951b extends AbstractCollection implements Multiset {
    @CheckForNull
    @LazyInit
    private transient Set<Object> elementSet;
    @CheckForNull
    @LazyInit
    private transient Set<Multiset.Entry<Object>> entrySet;

    /* renamed from: com.google.common.collect.b$a */
    /* loaded from: classes4.dex */
    public class C7952a extends Multisets.AbstractC7822h {
        public C7952a() {
        }

        @Override // com.google.common.collect.Multisets.AbstractC7822h
        /* renamed from: a */
        public Multiset mo40204a() {
            return AbstractC7951b.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return AbstractC7951b.this.elementIterator();
        }
    }

    /* renamed from: com.google.common.collect.b$b */
    /* loaded from: classes4.dex */
    public class C7953b extends Multisets.AbstractC7823i {
        public C7953b() {
        }

        @Override // com.google.common.collect.Multisets.AbstractC7823i
        /* renamed from: a */
        public Multiset mo40266a() {
            return AbstractC7951b.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return AbstractC7951b.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC7951b.this.distinctElements();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean add(Object obj) {
        add(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<Object> collection) {
        return Multisets.m40581c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(@CheckForNull Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    public Set<Object> createElementSet() {
        return new C7952a();
    }

    public Set<Multiset.Entry<Object>> createEntrySet() {
        return new C7953b();
    }

    public abstract int distinctElements();

    public abstract Iterator elementIterator();

    public Set<Object> elementSet() {
        Set<Object> set = this.elementSet;
        if (set == null) {
            Set<Object> createElementSet = createElementSet();
            this.elementSet = createElementSet;
            return createElementSet;
        }
        return set;
    }

    public abstract Iterator entryIterator();

    public Set<Multiset.Entry<Object>> entrySet() {
        Set<Multiset.Entry<Object>> set = this.entrySet;
        if (set == null) {
            Set<Multiset.Entry<Object>> createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
        }
        return set;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(@CheckForNull Object obj) {
        return Multisets.m40578f(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean remove(@CheckForNull Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.m40574j(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.m40573k(this, collection);
    }

    public int setCount(Object obj, int i) {
        return Multisets.m40571m(this, obj, i);
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final String toString() {
        return entrySet().toString();
    }

    public int add(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(Object obj, int i, int i2) {
        return Multisets.m40570n(this, obj, i, i2);
    }
}
