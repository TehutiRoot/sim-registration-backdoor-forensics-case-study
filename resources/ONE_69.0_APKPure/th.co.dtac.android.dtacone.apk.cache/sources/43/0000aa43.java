package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {

    /* renamed from: a */
    public final C7775b f53422a;

    /* renamed from: b */
    public final C7775b f53423b;

    /* renamed from: c */
    public final int f53424c;

    /* renamed from: d */
    public Object[] f53425d;

    /* renamed from: e */
    public int f53426e;

    /* renamed from: f */
    public int f53427f;

    /* loaded from: classes4.dex */
    public static final class Builder<B> {

        /* renamed from: a */
        public final Comparator f53428a;

        /* renamed from: b */
        public int f53429b;

        /* renamed from: c */
        public int f53430c;

        /* renamed from: c */
        public final Ordering m40621c() {
            return Ordering.from(this.f53428a);
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
            return create(Collections.emptySet());
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f53429b = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i) {
            boolean z;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f53430c = i;
            return this;
        }

        public Builder(Comparator comparator) {
            this.f53429b = -1;
            this.f53430c = Integer.MAX_VALUE;
            this.f53428a = (Comparator) Preconditions.checkNotNull(comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.m40627k(this.f53429b, this.f53430c, iterable));
            for (T t : iterable) {
                minMaxPriorityQueue.offer(t);
            }
            return minMaxPriorityQueue;
        }
    }

    /* renamed from: com.google.common.collect.MinMaxPriorityQueue$b */
    /* loaded from: classes4.dex */
    public class C7775b {

        /* renamed from: a */
        public final Ordering f53431a;

        /* renamed from: b */
        public C7775b f53432b;

        public C7775b(Ordering ordering) {
            this.f53431a = ordering;
        }

        /* renamed from: a */
        public void m40620a(int i, Object obj) {
            C7775b c7775b;
            int m40616e = m40616e(i, obj);
            if (m40616e == i) {
                m40616e = i;
                c7775b = this;
            } else {
                c7775b = this.f53432b;
            }
            c7775b.m40619b(m40616e, obj);
        }

        /* renamed from: b */
        public int m40619b(int i, Object obj) {
            while (i > 2) {
                int m40611j = m40611j(i);
                Object m40632f = MinMaxPriorityQueue.this.m40632f(m40611j);
                if (this.f53431a.compare(m40632f, obj) <= 0) {
                    break;
                }
                MinMaxPriorityQueue.this.f53425d[i] = m40632f;
                i = m40611j;
            }
            MinMaxPriorityQueue.this.f53425d[i] = obj;
            return i;
        }

        /* renamed from: c */
        public int m40618c(int i, int i2) {
            return this.f53431a.compare(MinMaxPriorityQueue.this.m40632f(i), MinMaxPriorityQueue.this.m40632f(i2));
        }

        /* renamed from: d */
        public int m40617d(int i, Object obj) {
            int m40613h = m40613h(i);
            if (m40613h > 0 && this.f53431a.compare(MinMaxPriorityQueue.this.m40632f(m40613h), obj) < 0) {
                MinMaxPriorityQueue.this.f53425d[i] = MinMaxPriorityQueue.this.m40632f(m40613h);
                MinMaxPriorityQueue.this.f53425d[m40613h] = obj;
                return m40613h;
            }
            return m40616e(i, obj);
        }

        /* renamed from: e */
        public int m40616e(int i, Object obj) {
            int m40608m;
            if (i == 0) {
                MinMaxPriorityQueue.this.f53425d[0] = obj;
                return 0;
            }
            int m40609l = m40609l(i);
            Object m40632f = MinMaxPriorityQueue.this.m40632f(m40609l);
            if (m40609l != 0 && (m40608m = m40608m(m40609l(m40609l))) != m40609l && m40610k(m40608m) >= MinMaxPriorityQueue.this.f53426e) {
                Object m40632f2 = MinMaxPriorityQueue.this.m40632f(m40608m);
                if (this.f53431a.compare(m40632f2, m40632f) < 0) {
                    m40609l = m40608m;
                    m40632f = m40632f2;
                }
            }
            if (this.f53431a.compare(m40632f, obj) < 0) {
                MinMaxPriorityQueue.this.f53425d[i] = m40632f;
                MinMaxPriorityQueue.this.f53425d[m40609l] = obj;
                return m40609l;
            }
            MinMaxPriorityQueue.this.f53425d[i] = obj;
            return i;
        }

        /* renamed from: f */
        public int m40615f(int i) {
            while (true) {
                int m40612i = m40612i(i);
                if (m40612i > 0) {
                    MinMaxPriorityQueue.this.f53425d[i] = MinMaxPriorityQueue.this.m40632f(m40612i);
                    i = m40612i;
                } else {
                    return i;
                }
            }
        }

        /* renamed from: g */
        public int m40614g(int i, int i2) {
            boolean z;
            if (i >= MinMaxPriorityQueue.this.f53426e) {
                return -1;
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            int min = Math.min(i, MinMaxPriorityQueue.this.f53426e - i2) + i2;
            for (int i3 = i + 1; i3 < min; i3++) {
                if (m40618c(i3, i) < 0) {
                    i = i3;
                }
            }
            return i;
        }

        /* renamed from: h */
        public int m40613h(int i) {
            return m40614g(m40610k(i), 2);
        }

        /* renamed from: i */
        public int m40612i(int i) {
            int m40610k = m40610k(i);
            if (m40610k < 0) {
                return -1;
            }
            return m40614g(m40610k(m40610k), 4);
        }

        /* renamed from: j */
        public final int m40611j(int i) {
            return m40609l(m40609l(i));
        }

        /* renamed from: k */
        public final int m40610k(int i) {
            return (i * 2) + 1;
        }

        /* renamed from: l */
        public final int m40609l(int i) {
            return (i - 1) / 2;
        }

        /* renamed from: m */
        public final int m40608m(int i) {
            return (i * 2) + 2;
        }

        /* renamed from: n */
        public int m40607n(Object obj) {
            int m40608m;
            int m40609l = m40609l(MinMaxPriorityQueue.this.f53426e);
            if (m40609l != 0 && (m40608m = m40608m(m40609l(m40609l))) != m40609l && m40610k(m40608m) >= MinMaxPriorityQueue.this.f53426e) {
                Object m40632f = MinMaxPriorityQueue.this.m40632f(m40608m);
                if (this.f53431a.compare(m40632f, obj) < 0) {
                    MinMaxPriorityQueue.this.f53425d[m40608m] = obj;
                    MinMaxPriorityQueue.this.f53425d[MinMaxPriorityQueue.this.f53426e] = m40632f;
                    return m40608m;
                }
            }
            return MinMaxPriorityQueue.this.f53426e;
        }

        /* renamed from: o */
        public C7776c m40606o(int i, int i2, Object obj) {
            Object m40632f;
            int m40617d = m40617d(i2, obj);
            if (m40617d == i2) {
                return null;
            }
            if (m40617d < i) {
                m40632f = MinMaxPriorityQueue.this.m40632f(i);
            } else {
                m40632f = MinMaxPriorityQueue.this.m40632f(m40609l(i));
            }
            if (this.f53432b.m40619b(m40617d, obj) >= i) {
                return null;
            }
            return new C7776c(obj, m40632f);
        }
    }

    /* renamed from: com.google.common.collect.MinMaxPriorityQueue$c */
    /* loaded from: classes4.dex */
    public static class C7776c {

        /* renamed from: a */
        public final Object f53434a;

        /* renamed from: b */
        public final Object f53435b;

        public C7776c(Object obj, Object obj2) {
            this.f53434a = obj;
            this.f53435b = obj2;
        }
    }

    /* renamed from: com.google.common.collect.MinMaxPriorityQueue$d */
    /* loaded from: classes4.dex */
    public class C7777d implements Iterator {

        /* renamed from: a */
        public int f53436a;

        /* renamed from: b */
        public int f53437b;

        /* renamed from: c */
        public int f53438c;

        /* renamed from: d */
        public Queue f53439d;

        /* renamed from: e */
        public List f53440e;

        /* renamed from: f */
        public Object f53441f;

        /* renamed from: g */
        public boolean f53442g;

        public C7777d() {
            this.f53436a = -1;
            this.f53437b = -1;
            this.f53438c = MinMaxPriorityQueue.this.f53427f;
        }

        /* renamed from: a */
        public final void m40605a() {
            if (MinMaxPriorityQueue.this.f53427f == this.f53438c) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public final boolean m40604b(Iterable iterable, Object obj) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == obj) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public final void m40603c(int i) {
            if (this.f53437b < i) {
                if (this.f53440e != null) {
                    while (i < MinMaxPriorityQueue.this.size() && m40604b(this.f53440e, MinMaxPriorityQueue.this.m40632f(i))) {
                        i++;
                    }
                }
                this.f53437b = i;
            }
        }

        /* renamed from: d */
        public final boolean m40602d(Object obj) {
            for (int i = 0; i < MinMaxPriorityQueue.this.f53426e; i++) {
                if (MinMaxPriorityQueue.this.f53425d[i] == obj) {
                    MinMaxPriorityQueue.this.m40624n(i);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m40605a();
            m40603c(this.f53436a + 1);
            if (this.f53437b < MinMaxPriorityQueue.this.size()) {
                return true;
            }
            Queue queue = this.f53439d;
            if (queue != null && !queue.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            m40605a();
            m40603c(this.f53436a + 1);
            if (this.f53437b < MinMaxPriorityQueue.this.size()) {
                int i = this.f53437b;
                this.f53436a = i;
                this.f53442g = true;
                return MinMaxPriorityQueue.this.m40632f(i);
            }
            if (this.f53439d != null) {
                this.f53436a = MinMaxPriorityQueue.this.size();
                Object poll = this.f53439d.poll();
                this.f53441f = poll;
                if (poll != null) {
                    this.f53442g = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            AbstractC5383bs.m51874e(this.f53442g);
            m40605a();
            this.f53442g = false;
            this.f53438c++;
            if (this.f53436a < MinMaxPriorityQueue.this.size()) {
                C7776c m40624n = MinMaxPriorityQueue.this.m40624n(this.f53436a);
                if (m40624n != null) {
                    if (this.f53439d == null || this.f53440e == null) {
                        this.f53439d = new ArrayDeque();
                        this.f53440e = new ArrayList(3);
                    }
                    if (!m40604b(this.f53440e, m40624n.f53434a)) {
                        this.f53439d.add(m40624n.f53434a);
                    }
                    if (!m40604b(this.f53439d, m40624n.f53435b)) {
                        this.f53440e.add(m40624n.f53435b);
                    }
                }
                this.f53436a--;
                this.f53437b--;
                return;
            }
            Object obj = this.f53441f;
            Objects.requireNonNull(obj);
            Preconditions.checkState(m40602d(obj));
            this.f53441f = null;
        }
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    /* renamed from: e */
    public static int m40633e(int i, int i2) {
        return Math.min(i - 1, i2) + 1;
    }

    public static Builder<Comparable> expectedSize(int i) {
        return new Builder(Ordering.natural()).expectedSize(i);
    }

    /* renamed from: k */
    public static int m40627k(int i, int i2, Iterable iterable) {
        if (i == -1) {
            i = 11;
        }
        if (iterable instanceof Collection) {
            i = Math.max(i, ((Collection) iterable).size());
        }
        return m40633e(i, i2);
    }

    /* renamed from: l */
    public static boolean m40626l(int i) {
        boolean z;
        int i2 = ~(~(i + 1));
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "negative index");
        if ((1431655765 & i2) > (i2 & (-1431655766))) {
            return true;
        }
        return false;
    }

    public static Builder<Comparable> maximumSize(int i) {
        return new Builder(Ordering.natural()).maximumSize(i);
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
        return new Builder<>(comparator);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e) {
        offer(e);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        boolean z = false;
        for (E e : collection) {
            offer(e);
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i = 0; i < this.f53426e; i++) {
            this.f53425d[i] = null;
        }
        this.f53426e = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f53422a.f53431a;
    }

    /* renamed from: d */
    public final int m40634d() {
        int checkedMultiply;
        int length = this.f53425d.length;
        if (length < 64) {
            checkedMultiply = (length + 1) * 2;
        } else {
            checkedMultiply = IntMath.checkedMultiply(length / 2, 3);
        }
        return m40633e(checkedMultiply, this.f53424c);
    }

    /* renamed from: f */
    public Object m40632f(int i) {
        Object obj = this.f53425d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: g */
    public final C7776c m40631g(int i, Object obj) {
        C7775b m40628j = m40628j(i);
        int m40615f = m40628j.m40615f(i);
        int m40619b = m40628j.m40619b(m40615f, obj);
        if (m40619b == m40615f) {
            return m40628j.m40606o(i, m40615f, obj);
        }
        if (m40619b < i) {
            return new C7776c(obj, m40632f(i));
        }
        return null;
    }

    /* renamed from: h */
    public final int m40630h() {
        int i = this.f53426e;
        if (i != 1) {
            if (i == 2 || this.f53423b.m40618c(1, 2) <= 0) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: i */
    public final void m40629i() {
        if (this.f53426e > this.f53425d.length) {
            Object[] objArr = new Object[m40634d()];
            Object[] objArr2 = this.f53425d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f53425d = objArr;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new C7777d();
    }

    /* renamed from: j */
    public final C7775b m40628j(int i) {
        if (m40626l(i)) {
            return this.f53422a;
        }
        return this.f53423b;
    }

    /* renamed from: m */
    public final Object m40625m(int i) {
        Object m40632f = m40632f(i);
        m40624n(i);
        return m40632f;
    }

    /* renamed from: n */
    public C7776c m40624n(int i) {
        Preconditions.checkPositionIndex(i, this.f53426e);
        this.f53427f++;
        int i2 = this.f53426e - 1;
        this.f53426e = i2;
        if (i2 == i) {
            this.f53425d[i2] = null;
            return null;
        }
        Object m40632f = m40632f(i2);
        int m40607n = m40628j(this.f53426e).m40607n(m40632f);
        if (m40607n == i) {
            this.f53425d[this.f53426e] = null;
            return null;
        }
        Object m40632f2 = m40632f(this.f53426e);
        this.f53425d[this.f53426e] = null;
        C7776c m40631g = m40631g(i, m40632f2);
        if (m40607n < i) {
            if (m40631g == null) {
                return new C7776c(m40632f, m40632f2);
            }
            return new C7776c(m40632f, m40631g.f53435b);
        }
        return m40631g;
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e) {
        Preconditions.checkNotNull(e);
        this.f53427f++;
        int i = this.f53426e;
        this.f53426e = i + 1;
        m40629i();
        m40628j(i).m40620a(i, e);
        if (this.f53426e <= this.f53424c || pollLast() != e) {
            return true;
        }
        return false;
    }

    @Override // java.util.Queue
    @CheckForNull
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) m40632f(0);
    }

    @CheckForNull
    public E peekFirst() {
        return peek();
    }

    @CheckForNull
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return (E) m40632f(m40630h());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    @CheckForNull
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return (E) m40625m(0);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public E pollFirst() {
        return poll();
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return (E) m40625m(m40630h());
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (!isEmpty()) {
            return (E) m40625m(m40630h());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f53426e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @J2ktIncompatible
    public Object[] toArray() {
        int i = this.f53426e;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f53425d, 0, objArr, 0, i);
        return objArr;
    }

    public MinMaxPriorityQueue(Builder builder, int i) {
        Ordering m40621c = builder.m40621c();
        C7775b c7775b = new C7775b(m40621c);
        this.f53422a = c7775b;
        C7775b c7775b2 = new C7775b(m40621c.reverse());
        this.f53423b = c7775b2;
        c7775b.f53432b = c7775b2;
        c7775b2.f53432b = c7775b;
        this.f53424c = builder.f53430c;
        this.f53425d = new Object[i];
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }
}