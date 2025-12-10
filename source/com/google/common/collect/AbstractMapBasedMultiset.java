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
public abstract class AbstractMapBasedMultiset<E> extends AbstractC7951b implements Serializable {
    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    transient C7979j backingMap;
    transient long size;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$a */
    /* loaded from: classes4.dex */
    public class C7561a extends AbstractC7563c {
        public C7561a() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.AbstractC7563c
        /* renamed from: b */
        public Object mo41087b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.m40250i(i);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$b */
    /* loaded from: classes4.dex */
    public class C7562b extends AbstractC7563c {
        public C7562b() {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.AbstractC7563c
        /* renamed from: c */
        public Multiset.Entry mo41087b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.m40252g(i);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$c */
    /* loaded from: classes4.dex */
    public abstract class AbstractC7563c implements Iterator {

        /* renamed from: a */
        public int f53027a;

        /* renamed from: b */
        public int f53028b = -1;

        /* renamed from: c */
        public int f53029c;

        public AbstractC7563c() {
            this.f53027a = AbstractMapBasedMultiset.this.backingMap.mo40254e();
            this.f53029c = AbstractMapBasedMultiset.this.backingMap.f53711d;
        }

        /* renamed from: a */
        public final void m41088a() {
            if (AbstractMapBasedMultiset.this.backingMap.f53711d == this.f53029c) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public abstract Object mo41087b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            m41088a();
            if (this.f53027a >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object mo41087b = mo41087b(this.f53027a);
                int i = this.f53027a;
                this.f53028b = i;
                this.f53027a = AbstractMapBasedMultiset.this.backingMap.mo40240s(i);
                return mo41087b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            AbstractMapBasedMultiset abstractMapBasedMultiset;
            m41088a();
            if (this.f53028b != -1) {
                z = true;
            } else {
                z = false;
            }
            AbstractC5406bs.m51811e(z);
            AbstractMapBasedMultiset.this.size -= abstractMapBasedMultiset.backingMap.m40235x(this.f53028b);
            this.f53027a = AbstractMapBasedMultiset.this.backingMap.mo40239t(this.f53027a, this.f53028b);
            this.f53028b = -1;
            this.f53029c = AbstractMapBasedMultiset.this.backingMap.f53711d;
        }
    }

    public AbstractMapBasedMultiset(int i) {
        this.backingMap = newBackingMap(i);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int m40214h = AbstractC7983m.m40214h(objectInputStream);
        this.backingMap = newBackingMap(3);
        AbstractC7983m.m40215g(this, objectInputStream, m40214h);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC7983m.m40211k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
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
        int m40246m = this.backingMap.m40246m(e);
        if (m40246m == -1) {
            this.backingMap.m40238u(e, i);
            this.size += i;
            return 0;
        }
        int m40248k = this.backingMap.m40248k(m40246m);
        long j = i;
        long j2 = m40248k + j;
        if (j2 > 2147483647L) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "too many occurrences: %s", j2);
        this.backingMap.m40261B(m40246m, (int) j2);
        this.size += j;
        return m40248k;
    }

    public void addTo(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int mo40254e = this.backingMap.mo40254e();
        while (mo40254e >= 0) {
            multiset.add(this.backingMap.m40250i(mo40254e), this.backingMap.m40248k(mo40254e));
            mo40254e = this.backingMap.mo40240s(mo40254e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.mo40258a();
        this.size = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@CheckForNull Object obj) {
        return this.backingMap.m40253f(obj);
    }

    @Override // com.google.common.collect.AbstractC7951b
    public final int distinctElements() {
        return this.backingMap.m40260C();
    }

    @Override // com.google.common.collect.AbstractC7951b
    public final Iterator<E> elementIterator() {
        return new C7561a();
    }

    @Override // com.google.common.collect.AbstractC7951b
    public final Iterator<Multiset.Entry<E>> entryIterator() {
        return new C7562b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.m40576h(this);
    }

    public abstract C7979j newBackingMap(int i);

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
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
        int m40246m = this.backingMap.m40246m(obj);
        if (m40246m == -1) {
            return 0;
        }
        int m40248k = this.backingMap.m40248k(m40246m);
        if (m40248k > i) {
            this.backingMap.m40261B(m40246m, m40248k - i);
        } else {
            this.backingMap.m40235x(m40246m);
            i = m40248k;
        }
        this.size -= i;
        return m40248k;
    }

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(E e, int i) {
        AbstractC5406bs.m51814b(i, "count");
        C7979j c7979j = this.backingMap;
        int m40237v = i == 0 ? c7979j.m40237v(e) : c7979j.m40238u(e, i);
        this.size += i - m40237v;
        return m40237v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.size);
    }

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
    public final boolean setCount(E e, int i, int i2) {
        AbstractC5406bs.m51814b(i, "oldCount");
        AbstractC5406bs.m51814b(i2, "newCount");
        int m40246m = this.backingMap.m40246m(e);
        if (m40246m == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.m40238u(e, i2);
                this.size += i2;
            }
            return true;
        } else if (this.backingMap.m40248k(m40246m) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.backingMap.m40235x(m40246m);
                this.size -= i;
            } else {
                this.backingMap.m40261B(m40246m, i2);
                this.size += i2 - i;
            }
            return true;
        }
    }
}
