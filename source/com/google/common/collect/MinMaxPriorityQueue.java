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
    public final C7786b f53410a;

    /* renamed from: b */
    public final C7786b f53411b;

    /* renamed from: c */
    public final int f53412c;

    /* renamed from: d */
    public Object[] f53413d;

    /* renamed from: e */
    public int f53414e;

    /* renamed from: f */
    public int f53415f;

    /* loaded from: classes4.dex */
    public static final class Builder<B> {

        /* renamed from: a */
        public final Comparator f53416a;

        /* renamed from: b */
        public int f53417b;

        /* renamed from: c */
        public int f53418c;

        /* renamed from: c */
        public final Ordering m40632c() {
            return Ordering.from(this.f53416a);
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
            this.f53417b = i;
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
            this.f53418c = i;
            return this;
        }

        public Builder(Comparator comparator) {
            this.f53417b = -1;
            this.f53418c = Integer.MAX_VALUE;
            this.f53416a = (Comparator) Preconditions.checkNotNull(comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.m40638k(this.f53417b, this.f53418c, iterable));
            for (T t : iterable) {
                minMaxPriorityQueue.offer(t);
            }
            return minMaxPriorityQueue;
        }
    }

    /* renamed from: com.google.common.collect.MinMaxPriorityQueue$b */
    /* loaded from: classes4.dex */
    public class C7786b {

        /* renamed from: a */
        public final Ordering f53419a;

        /* renamed from: b */
        public C7786b f53420b;

        public C7786b(Ordering ordering) {
            this.f53419a = ordering;
        }

        /* renamed from: a */
        public void m40631a(int i, Object obj) {
            C7786b c7786b;
            int m40627e = m40627e(i, obj);
            if (m40627e == i) {
                m40627e = i;
                c7786b = this;
            } else {
                c7786b = this.f53420b;
            }
            c7786b.m40630b(m40627e, obj);
        }

        /* renamed from: b */
        public int m40630b(int i, Object obj) {
            while (i > 2) {
                int m40622j = m40622j(i);
                Object m40643f = MinMaxPriorityQueue.this.m40643f(m40622j);
                if (this.f53419a.compare(m40643f, obj) <= 0) {
                    break;
                }
                MinMaxPriorityQueue.this.f53413d[i] = m40643f;
                i = m40622j;
            }
            MinMaxPriorityQueue.this.f53413d[i] = obj;
            return i;
        }

        /* renamed from: c */
        public int m40629c(int i, int i2) {
            return this.f53419a.compare(MinMaxPriorityQueue.this.m40643f(i), MinMaxPriorityQueue.this.m40643f(i2));
        }

        /* renamed from: d */
        public int m40628d(int i, Object obj) {
            int m40624h = m40624h(i);
            if (m40624h > 0 && this.f53419a.compare(MinMaxPriorityQueue.this.m40643f(m40624h), obj) < 0) {
                MinMaxPriorityQueue.this.f53413d[i] = MinMaxPriorityQueue.this.m40643f(m40624h);
                MinMaxPriorityQueue.this.f53413d[m40624h] = obj;
                return m40624h;
            }
            return m40627e(i, obj);
        }

        /* renamed from: e */
        public int m40627e(int i, Object obj) {
            int m40619m;
            if (i == 0) {
                MinMaxPriorityQueue.this.f53413d[0] = obj;
                return 0;
            }
            int m40620l = m40620l(i);
            Object m40643f = MinMaxPriorityQueue.this.m40643f(m40620l);
            if (m40620l != 0 && (m40619m = m40619m(m40620l(m40620l))) != m40620l && m40621k(m40619m) >= MinMaxPriorityQueue.this.f53414e) {
                Object m40643f2 = MinMaxPriorityQueue.this.m40643f(m40619m);
                if (this.f53419a.compare(m40643f2, m40643f) < 0) {
                    m40620l = m40619m;
                    m40643f = m40643f2;
                }
            }
            if (this.f53419a.compare(m40643f, obj) < 0) {
                MinMaxPriorityQueue.this.f53413d[i] = m40643f;
                MinMaxPriorityQueue.this.f53413d[m40620l] = obj;
                return m40620l;
            }
            MinMaxPriorityQueue.this.f53413d[i] = obj;
            return i;
        }

        /* renamed from: f */
        public int m40626f(int i) {
            while (true) {
                int m40623i = m40623i(i);
                if (m40623i > 0) {
                    MinMaxPriorityQueue.this.f53413d[i] = MinMaxPriorityQueue.this.m40643f(m40623i);
                    i = m40623i;
                } else {
                    return i;
                }
            }
        }

        /* renamed from: g */
        public int m40625g(int i, int i2) {
            boolean z;
            if (i >= MinMaxPriorityQueue.this.f53414e) {
                return -1;
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            int min = Math.min(i, MinMaxPriorityQueue.this.f53414e - i2) + i2;
            for (int i3 = i + 1; i3 < min; i3++) {
                if (m40629c(i3, i) < 0) {
                    i = i3;
                }
            }
            return i;
        }

        /* renamed from: h */
        public int m40624h(int i) {
            return m40625g(m40621k(i), 2);
        }

        /* renamed from: i */
        public int m40623i(int i) {
            int m40621k = m40621k(i);
            if (m40621k < 0) {
                return -1;
            }
            return m40625g(m40621k(m40621k), 4);
        }

        /* renamed from: j */
        public final int m40622j(int i) {
            return m40620l(m40620l(i));
        }

        /* renamed from: k */
        public final int m40621k(int i) {
            return (i * 2) + 1;
        }

        /* renamed from: l */
        public final int m40620l(int i) {
            return (i - 1) / 2;
        }

        /* renamed from: m */
        public final int m40619m(int i) {
            return (i * 2) + 2;
        }

        /* renamed from: n */
        public int m40618n(Object obj) {
            int m40619m;
            int m40620l = m40620l(MinMaxPriorityQueue.this.f53414e);
            if (m40620l != 0 && (m40619m = m40619m(m40620l(m40620l))) != m40620l && m40621k(m40619m) >= MinMaxPriorityQueue.this.f53414e) {
                Object m40643f = MinMaxPriorityQueue.this.m40643f(m40619m);
                if (this.f53419a.compare(m40643f, obj) < 0) {
                    MinMaxPriorityQueue.this.f53413d[m40619m] = obj;
                    MinMaxPriorityQueue.this.f53413d[MinMaxPriorityQueue.this.f53414e] = m40643f;
                    return m40619m;
                }
            }
            return MinMaxPriorityQueue.this.f53414e;
        }

        /* renamed from: o */
        public C7787c m40617o(int i, int i2, Object obj) {
            Object m40643f;
            int m40628d = m40628d(i2, obj);
            if (m40628d == i2) {
                return null;
            }
            if (m40628d < i) {
                m40643f = MinMaxPriorityQueue.this.m40643f(i);
            } else {
                m40643f = MinMaxPriorityQueue.this.m40643f(m40620l(i));
            }
            if (this.f53420b.m40630b(m40628d, obj) >= i) {
                return null;
            }
            return new C7787c(obj, m40643f);
        }
    }

    /* renamed from: com.google.common.collect.MinMaxPriorityQueue$c */
    /* loaded from: classes4.dex */
    public static class C7787c {

        /* renamed from: a */
        public final Object f53422a;

        /* renamed from: b */
        public final Object f53423b;

        public C7787c(Object obj, Object obj2) {
            this.f53422a = obj;
            this.f53423b = obj2;
        }
    }

    /* renamed from: com.google.common.collect.MinMaxPriorityQueue$d */
    /* loaded from: classes4.dex */
    public class C7788d implements Iterator {

        /* renamed from: a */
        public int f53424a;

        /* renamed from: b */
        public int f53425b;

        /* renamed from: c */
        public int f53426c;

        /* renamed from: d */
        public Queue f53427d;

        /* renamed from: e */
        public List f53428e;

        /* renamed from: f */
        public Object f53429f;

        /* renamed from: g */
        public boolean f53430g;

        public C7788d() {
            this.f53424a = -1;
            this.f53425b = -1;
            this.f53426c = MinMaxPriorityQueue.this.f53415f;
        }

        /* renamed from: a */
        public final void m40616a() {
            if (MinMaxPriorityQueue.this.f53415f == this.f53426c) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public final boolean m40615b(Iterable iterable, Object obj) {
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
        public final void m40614c(int i) {
            if (this.f53425b < i) {
                if (this.f53428e != null) {
                    while (i < MinMaxPriorityQueue.this.size() && m40615b(this.f53428e, MinMaxPriorityQueue.this.m40643f(i))) {
                        i++;
                    }
                }
                this.f53425b = i;
            }
        }

        /* renamed from: d */
        public final boolean m40613d(Object obj) {
            for (int i = 0; i < MinMaxPriorityQueue.this.f53414e; i++) {
                if (MinMaxPriorityQueue.this.f53413d[i] == obj) {
                    MinMaxPriorityQueue.this.m40635n(i);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m40616a();
            m40614c(this.f53424a + 1);
            if (this.f53425b < MinMaxPriorityQueue.this.size()) {
                return true;
            }
            Queue queue = this.f53427d;
            if (queue != null && !queue.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            m40616a();
            m40614c(this.f53424a + 1);
            if (this.f53425b < MinMaxPriorityQueue.this.size()) {
                int i = this.f53425b;
                this.f53424a = i;
                this.f53430g = true;
                return MinMaxPriorityQueue.this.m40643f(i);
            }
            if (this.f53427d != null) {
                this.f53424a = MinMaxPriorityQueue.this.size();
                Object poll = this.f53427d.poll();
                this.f53429f = poll;
                if (poll != null) {
                    this.f53430g = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            AbstractC5406bs.m51811e(this.f53430g);
            m40616a();
            this.f53430g = false;
            this.f53426c++;
            if (this.f53424a < MinMaxPriorityQueue.this.size()) {
                C7787c m40635n = MinMaxPriorityQueue.this.m40635n(this.f53424a);
                if (m40635n != null) {
                    if (this.f53427d == null || this.f53428e == null) {
                        this.f53427d = new ArrayDeque();
                        this.f53428e = new ArrayList(3);
                    }
                    if (!m40615b(this.f53428e, m40635n.f53422a)) {
                        this.f53427d.add(m40635n.f53422a);
                    }
                    if (!m40615b(this.f53427d, m40635n.f53423b)) {
                        this.f53428e.add(m40635n.f53423b);
                    }
                }
                this.f53424a--;
                this.f53425b--;
                return;
            }
            Object obj = this.f53429f;
            Objects.requireNonNull(obj);
            Preconditions.checkState(m40613d(obj));
            this.f53429f = null;
        }
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    /* renamed from: e */
    public static int m40644e(int i, int i2) {
        return Math.min(i - 1, i2) + 1;
    }

    public static Builder<Comparable> expectedSize(int i) {
        return new Builder(Ordering.natural()).expectedSize(i);
    }

    /* renamed from: k */
    public static int m40638k(int i, int i2, Iterable iterable) {
        if (i == -1) {
            i = 11;
        }
        if (iterable instanceof Collection) {
            i = Math.max(i, ((Collection) iterable).size());
        }
        return m40644e(i, i2);
    }

    /* renamed from: l */
    public static boolean m40637l(int i) {
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
        for (int i = 0; i < this.f53414e; i++) {
            this.f53413d[i] = null;
        }
        this.f53414e = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f53410a.f53419a;
    }

    /* renamed from: d */
    public final int m40645d() {
        int checkedMultiply;
        int length = this.f53413d.length;
        if (length < 64) {
            checkedMultiply = (length + 1) * 2;
        } else {
            checkedMultiply = IntMath.checkedMultiply(length / 2, 3);
        }
        return m40644e(checkedMultiply, this.f53412c);
    }

    /* renamed from: f */
    public Object m40643f(int i) {
        Object obj = this.f53413d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: g */
    public final C7787c m40642g(int i, Object obj) {
        C7786b m40639j = m40639j(i);
        int m40626f = m40639j.m40626f(i);
        int m40630b = m40639j.m40630b(m40626f, obj);
        if (m40630b == m40626f) {
            return m40639j.m40617o(i, m40626f, obj);
        }
        if (m40630b < i) {
            return new C7787c(obj, m40643f(i));
        }
        return null;
    }

    /* renamed from: h */
    public final int m40641h() {
        int i = this.f53414e;
        if (i != 1) {
            if (i == 2 || this.f53411b.m40629c(1, 2) <= 0) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: i */
    public final void m40640i() {
        if (this.f53414e > this.f53413d.length) {
            Object[] objArr = new Object[m40645d()];
            Object[] objArr2 = this.f53413d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f53413d = objArr;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new C7788d();
    }

    /* renamed from: j */
    public final C7786b m40639j(int i) {
        if (m40637l(i)) {
            return this.f53410a;
        }
        return this.f53411b;
    }

    /* renamed from: m */
    public final Object m40636m(int i) {
        Object m40643f = m40643f(i);
        m40635n(i);
        return m40643f;
    }

    /* renamed from: n */
    public C7787c m40635n(int i) {
        Preconditions.checkPositionIndex(i, this.f53414e);
        this.f53415f++;
        int i2 = this.f53414e - 1;
        this.f53414e = i2;
        if (i2 == i) {
            this.f53413d[i2] = null;
            return null;
        }
        Object m40643f = m40643f(i2);
        int m40618n = m40639j(this.f53414e).m40618n(m40643f);
        if (m40618n == i) {
            this.f53413d[this.f53414e] = null;
            return null;
        }
        Object m40643f2 = m40643f(this.f53414e);
        this.f53413d[this.f53414e] = null;
        C7787c m40642g = m40642g(i, m40643f2);
        if (m40618n < i) {
            if (m40642g == null) {
                return new C7787c(m40643f, m40643f2);
            }
            return new C7787c(m40643f, m40642g.f53423b);
        }
        return m40642g;
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e) {
        Preconditions.checkNotNull(e);
        this.f53415f++;
        int i = this.f53414e;
        this.f53414e = i + 1;
        m40640i();
        m40639j(i).m40631a(i, e);
        if (this.f53414e <= this.f53412c || pollLast() != e) {
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
        return (E) m40643f(0);
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
        return (E) m40643f(m40641h());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    @CheckForNull
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return (E) m40636m(0);
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
        return (E) m40636m(m40641h());
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (!isEmpty()) {
            return (E) m40636m(m40641h());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f53414e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @J2ktIncompatible
    public Object[] toArray() {
        int i = this.f53414e;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f53413d, 0, objArr, 0, i);
        return objArr;
    }

    public MinMaxPriorityQueue(Builder builder, int i) {
        Ordering m40632c = builder.m40632c();
        C7786b c7786b = new C7786b(m40632c);
        this.f53410a = c7786b;
        C7786b c7786b2 = new C7786b(m40632c.reverse());
        this.f53411b = c7786b2;
        c7786b.f53420b = c7786b2;
        c7786b2.f53420b = c7786b;
        this.f53412c = builder.f53418c;
        this.f53413d = new Object[i];
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }
}
