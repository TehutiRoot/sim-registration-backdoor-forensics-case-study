package p046rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p046rx.internal.util.unsafe.Pow2;

/* renamed from: rx.internal.util.atomic.SpscLinkedArrayQueue */
/* loaded from: classes7.dex */
public final class SpscLinkedArrayQueue<T> implements Queue<T> {

    /* renamed from: i */
    public static final int f79250i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f79251j = new Object();

    /* renamed from: a */
    public final AtomicLong f79252a;

    /* renamed from: b */
    public int f79253b;

    /* renamed from: c */
    public long f79254c;

    /* renamed from: d */
    public int f79255d;

    /* renamed from: e */
    public AtomicReferenceArray f79256e;

    /* renamed from: f */
    public int f79257f;

    /* renamed from: g */
    public AtomicReferenceArray f79258g;

    /* renamed from: h */
    public final AtomicLong f79259h;

    public SpscLinkedArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        int i2 = roundToPowerOfTwo - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(roundToPowerOfTwo + 1);
        this.f79256e = atomicReferenceArray;
        this.f79255d = i2;
        m22862a(roundToPowerOfTwo);
        this.f79258g = atomicReferenceArray;
        this.f79257f = i2;
        this.f79254c = roundToPowerOfTwo - 2;
        this.f79252a = new AtomicLong();
        this.f79259h = new AtomicLong();
    }

    /* renamed from: b */
    public static int m22861b(int i) {
        return i;
    }

    /* renamed from: c */
    public static int m22860c(long j, int i) {
        return m22861b(((int) j) & i);
    }

    /* renamed from: g */
    public static Object m22856g(AtomicReferenceArray atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: n */
    public static void m22849n(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    public final void m22862a(int i) {
        this.f79253b = Math.min(i / 4, f79250i);
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final long m22859d() {
        return this.f79259h.get();
    }

    /* renamed from: e */
    public final long m22858e() {
        return this.f79252a.get();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final long m22857f() {
        return this.f79259h.get();
    }

    /* renamed from: h */
    public final AtomicReferenceArray m22855h(AtomicReferenceArray atomicReferenceArray) {
        return (AtomicReferenceArray) m22856g(atomicReferenceArray, m22861b(atomicReferenceArray.length() - 1));
    }

    /* renamed from: i */
    public final long m22854i() {
        return this.f79252a.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (m22854i() == m22857f()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public final Object m22853j(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f79258g = atomicReferenceArray;
        return m22856g(atomicReferenceArray, m22860c(j, i));
    }

    /* renamed from: k */
    public final Object m22852k(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f79258g = atomicReferenceArray;
        int m22860c = m22860c(j, i);
        Object m22856g = m22856g(atomicReferenceArray, m22860c);
        if (m22856g == null) {
            return null;
        }
        m22849n(atomicReferenceArray, m22860c, null);
        m22850m(j + 1);
        return m22856g;
    }

    /* renamed from: l */
    public final void m22851l(AtomicReferenceArray atomicReferenceArray, long j, int i, Object obj, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f79256e = atomicReferenceArray2;
        this.f79254c = (j2 + j) - 1;
        m22849n(atomicReferenceArray2, i, obj);
        m22848o(atomicReferenceArray, atomicReferenceArray2);
        m22849n(atomicReferenceArray, i, f79251j);
        m22847p(j + 1);
    }

    /* renamed from: m */
    public final void m22850m(long j) {
        this.f79259h.lazySet(j);
    }

    /* renamed from: o */
    public final void m22848o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m22849n(atomicReferenceArray, m22861b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        AtomicReferenceArray atomicReferenceArray = this.f79256e;
        long m22858e = m22858e();
        int i = this.f79255d;
        int m22860c = m22860c(m22858e, i);
        if (m22858e < this.f79254c) {
            return m22846q(atomicReferenceArray, t, m22858e, m22860c);
        }
        long j = this.f79253b + m22858e;
        if (m22856g(atomicReferenceArray, m22860c(j, i)) == null) {
            this.f79254c = j - 1;
            return m22846q(atomicReferenceArray, t, m22858e, m22860c);
        } else if (m22856g(atomicReferenceArray, m22860c(1 + m22858e, i)) == null) {
            return m22846q(atomicReferenceArray, t, m22858e, m22860c);
        } else {
            m22851l(atomicReferenceArray, m22858e, m22860c, t, i);
            return true;
        }
    }

    /* renamed from: p */
    public final void m22847p(long j) {
        this.f79252a.lazySet(j);
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray atomicReferenceArray = this.f79258g;
        long m22859d = m22859d();
        int i = this.f79257f;
        T t = (T) m22856g(atomicReferenceArray, m22860c(m22859d, i));
        if (t == f79251j) {
            return (T) m22853j(m22855h(atomicReferenceArray), m22859d, i);
        }
        return t;
    }

    @Override // java.util.Queue
    public T poll() {
        boolean z;
        AtomicReferenceArray atomicReferenceArray = this.f79258g;
        long m22859d = m22859d();
        int i = this.f79257f;
        int m22860c = m22860c(m22859d, i);
        T t = (T) m22856g(atomicReferenceArray, m22860c);
        if (t == f79251j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            m22849n(atomicReferenceArray, m22860c, null);
            m22850m(m22859d + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            return (T) m22852k(m22855h(atomicReferenceArray), m22859d, i);
        }
    }

    /* renamed from: q */
    public final boolean m22846q(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        m22849n(atomicReferenceArray, i, obj);
        m22847p(j + 1);
        return true;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public int size() {
        long m22857f = m22857f();
        while (true) {
            long m22854i = m22854i();
            long m22857f2 = m22857f();
            if (m22857f == m22857f2) {
                return (int) (m22854i - m22857f2);
            }
            m22857f = m22857f2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    public boolean offer(T t, T t2) {
        AtomicReferenceArray atomicReferenceArray = this.f79256e;
        long m22854i = m22854i();
        int i = this.f79255d;
        long j = 2 + m22854i;
        if (m22856g(atomicReferenceArray, m22860c(j, i)) == null) {
            int m22860c = m22860c(m22854i, i);
            m22849n(atomicReferenceArray, m22860c + 1, t2);
            m22849n(atomicReferenceArray, m22860c, t);
            m22847p(j);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f79256e = atomicReferenceArray2;
        int m22860c2 = m22860c(m22854i, i);
        m22849n(atomicReferenceArray2, m22860c2 + 1, t2);
        m22849n(atomicReferenceArray2, m22860c2, t);
        m22848o(atomicReferenceArray, atomicReferenceArray2);
        m22849n(atomicReferenceArray, m22860c2, f79251j);
        m22847p(j);
        return true;
    }
}
