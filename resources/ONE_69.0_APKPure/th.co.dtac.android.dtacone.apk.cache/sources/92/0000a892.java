package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public abstract class AbstractMapBasedMultiset<E> extends AbstractC7940b implements Serializable {
    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    transient C7968j backingMap;
    transient long size;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$a */
    /* loaded from: classes4.dex */
    public class C7550a extends AbstractC7552c {
        public C7550a() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.AbstractC7552c
        /* renamed from: b */
        public Object mo41076b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.m40241i(i);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$b */
    /* loaded from: classes4.dex */
    public class C7551b extends AbstractC7552c {
        public C7551b() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.AbstractC7552c
        /* renamed from: c */
        public Multiset.Entry mo41076b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.m40243g(i);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$c */
    /* loaded from: classes4.dex */
    public abstract class AbstractC7552c implements Iterator {

        /* renamed from: a */
        public int f53039a;

        /* renamed from: b */
        public int f53040b = -1;

        /* renamed from: c */
        public int f53041c;

        public AbstractC7552c() {
            this.f53039a = AbstractMapBasedMultiset.this.backingMap.mo40245e();
            this.f53041c = AbstractMapBasedMultiset.this.backingMap.f53723d;
        }

        /* renamed from: a */
        public final void m41077a() {
            if (AbstractMapBasedMultiset.this.backingMap.f53723d == this.f53041c) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public abstract Object mo41076b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            m41077a();
            if (this.f53039a >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object mo41076b = mo41076b(this.f53039a);
                int i = this.f53039a;
                this.f53040b = i;
                this.f53039a = AbstractMapBasedMultiset.this.backingMap.mo40231s(i);
                return mo41076b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            AbstractMapBasedMultiset abstractMapBasedMultiset;
            m41077a();
            if (this.f53040b != -1) {
                z = true;
            } else {
                z = false;
            }
            AbstractC5383bs.m51874e(z);
            AbstractMapBasedMultiset.this.size -= abstractMapBasedMultiset.backingMap.m40226x(this.f53040b);
            this.f53039a = AbstractMapBasedMultiset.this.backingMap.mo40230t(this.f53039a, this.f53040b);
            this.f53040b = -1;
            this.f53041c = AbstractMapBasedMultiset.this.backingMap.f53723d;
        }
    }

    public AbstractMapBasedMultiset(int i) {
        this.backingMap = newBackingMap(i);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int m40205h = AbstractC7972m.m40205h(objectInputStream);
        this.backingMap = newBackingMap(3);
        AbstractC7972m.m40206g(this, objectInputStream, m40205h);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC7972m.m40202k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(E e, int i) {
        boolean z;
        if (i == 0) {
            return count(e);
        }
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "occurrences cannot be negative: %s", i);
        int m40237m = this.backingMap.m40237m(e);
        if (m40237m == -1) {
            this.backingMap.m40229u(e, i);
            this.size += i;
            return 0;
        }
        int m40239k = this.backingMap.m40239k(m40237m);
        long j = i;
        long j2 = m40239k + j;
        if (j2 > 2147483647L) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "too many occurrences: %s", j2);
        this.backingMap.m40252B(m40237m, (int) j2);
        this.size += j;
        return m40239k;
    }

    public void addTo(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int mo40245e = this.backingMap.mo40245e();
        while (mo40245e >= 0) {
            multiset.add(this.backingMap.m40241i(mo40245e), this.backingMap.m40239k(mo40245e));
            mo40245e = this.backingMap.mo40231s(mo40245e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.mo40249a();
        this.size = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@CheckForNull Object obj) {
        return this.backingMap.m40244f(obj);
    }

    @Override // com.google.common.collect.AbstractC7940b
    public final int distinctElements() {
        return this.backingMap.m40251C();
    }

    @Override // com.google.common.collect.AbstractC7940b
    public final Iterator<E> elementIterator() {
        return new C7550a();
    }

    @Override // com.google.common.collect.AbstractC7940b
    public final Iterator<Multiset.Entry<E>> entryIterator() {
        return new C7551b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.m40565h(this);
    }

    public abstract C7968j newBackingMap(int i);

    @Override // com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(@CheckForNull Object obj, int i) {
        boolean z;
        if (i == 0) {
            return count(obj);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "occurrences cannot be negative: %s", i);
        int m40237m = this.backingMap.m40237m(obj);
        if (m40237m == -1) {
            return 0;
        }
        int m40239k = this.backingMap.m40239k(m40237m);
        if (m40239k > i) {
            this.backingMap.m40252B(m40237m, m40239k - i);
        } else {
            this.backingMap.m40226x(m40237m);
            i = m40239k;
        }
        this.size -= i;
        return m40239k;
    }

    @Override // com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(E e, int i) {
        AbstractC5383bs.m51877b(i, "count");
        C7968j c7968j = this.backingMap;
        int m40228v = i == 0 ? c7968j.m40228v(e) : c7968j.m40229u(e, i);
        this.size += i - m40228v;
        return m40228v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.size);
    }

    @Override // com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    public final boolean setCount(E e, int i, int i2) {
        AbstractC5383bs.m51877b(i, "oldCount");
        AbstractC5383bs.m51877b(i2, "newCount");
        int m40237m = this.backingMap.m40237m(e);
        if (m40237m == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.m40229u(e, i2);
                this.size += i2;
            }
            return true;
        } else if (this.backingMap.m40239k(m40237m) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.backingMap.m40226x(m40237m);
                this.size -= i;
            } else {
                this.backingMap.m40252B(m40237m, i2);
                this.size += i2 - i;
            }
            return true;
        }
    }
}