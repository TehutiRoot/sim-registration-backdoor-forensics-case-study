package p046rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p046rx.internal.util.unsafe.Pow2;

/* renamed from: rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue */
/* loaded from: classes7.dex */
public final class SpscUnboundedAtomicArrayQueue<T> implements Queue<T> {

    /* renamed from: i */
    public static final int f79466i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f79467j = new Object();

    /* renamed from: a */
    public final AtomicLong f79468a;

    /* renamed from: b */
    public int f79469b;

    /* renamed from: c */
    public long f79470c;

    /* renamed from: d */
    public int f79471d;

    /* renamed from: e */
    public AtomicReferenceArray f79472e;

    /* renamed from: f */
    public int f79473f;

    /* renamed from: g */
    public AtomicReferenceArray f79474g;

    /* renamed from: h */
    public final AtomicLong f79475h;

    public SpscUnboundedAtomicArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i));
        int i2 = roundToPowerOfTwo - 1;
        this.f79468a = new AtomicLong();
        this.f79475h = new AtomicLong();
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(roundToPowerOfTwo + 1);
        this.f79472e = atomicReferenceArray;
        this.f79471d = i2;
        m23033a(roundToPowerOfTwo);
        this.f79474g = atomicReferenceArray;
        this.f79473f = i2;
        this.f79470c = roundToPowerOfTwo - 2;
        m23018p(0L);
    }

    /* renamed from: b */
    public static int m23032b(int i) {
        return i;
    }

    /* renamed from: c */
    public static int m23031c(long j, int i) {
        return m23032b(((int) j) & i);
    }

    /* renamed from: g */
    public static Object m23027g(AtomicReferenceArray atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: n */
    public static void m23020n(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    public final void m23033a(int i) {
        this.f79469b = Math.min(i / 4, f79466i);
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
    public final long m23030d() {
        return this.f79475h.get();
    }

    /* renamed from: e */
    public final long m23029e() {
        return this.f79468a.get();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final long m23028f() {
        return this.f79475h.get();
    }

    /* renamed from: h */
    public final AtomicReferenceArray m23026h(AtomicReferenceArray atomicReferenceArray) {
        return (AtomicReferenceArray) m23027g(atomicReferenceArray, m23032b(atomicReferenceArray.length() - 1));
    }

    /* renamed from: i */
    public final long m23025i() {
        return this.f79468a.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (m23025i() == m23028f()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public final Object m23024j(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f79474g = atomicReferenceArray;
        return m23027g(atomicReferenceArray, m23031c(j, i));
    }

    /* renamed from: k */
    public final Object m23023k(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f79474g = atomicReferenceArray;
        int m23031c = m23031c(j, i);
        Object m23027g = m23027g(atomicReferenceArray, m23031c);
        if (m23027g == null) {
            return null;
        }
        m23021m(j + 1);
        m23020n(atomicReferenceArray, m23031c, null);
        return m23027g;
    }

    /* renamed from: l */
    public final void m23022l(AtomicReferenceArray atomicReferenceArray, long j, int i, Object obj, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f79472e = atomicReferenceArray2;
        this.f79470c = (j2 + j) - 1;
        m23018p(j + 1);
        m23020n(atomicReferenceArray2, i, obj);
        m23019o(atomicReferenceArray, atomicReferenceArray2);
        m23020n(atomicReferenceArray, i, f79467j);
    }

    /* renamed from: m */
    public final void m23021m(long j) {
        this.f79475h.lazySet(j);
    }

    /* renamed from: o */
    public final void m23019o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m23020n(atomicReferenceArray, m23032b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        t.getClass();
        AtomicReferenceArray atomicReferenceArray = this.f79472e;
        long m23029e = m23029e();
        int i = this.f79471d;
        int m23031c = m23031c(m23029e, i);
        if (m23029e < this.f79470c) {
            return m23017q(atomicReferenceArray, t, m23029e, m23031c);
        }
        long j = this.f79469b + m23029e;
        if (m23027g(atomicReferenceArray, m23031c(j, i)) == null) {
            this.f79470c = j - 1;
            return m23017q(atomicReferenceArray, t, m23029e, m23031c);
        } else if (m23027g(atomicReferenceArray, m23031c(1 + m23029e, i)) != null) {
            return m23017q(atomicReferenceArray, t, m23029e, m23031c);
        } else {
            m23022l(atomicReferenceArray, m23029e, m23031c, t, i);
            return true;
        }
    }

    /* renamed from: p */
    public final void m23018p(long j) {
        this.f79468a.lazySet(j);
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray atomicReferenceArray = this.f79474g;
        long m23030d = m23030d();
        int i = this.f79473f;
        T t = (T) m23027g(atomicReferenceArray, m23031c(m23030d, i));
        if (t == f79467j) {
            return (T) m23024j(m23026h(atomicReferenceArray), m23030d, i);
        }
        return t;
    }

    @Override // java.util.Queue
    public T poll() {
        boolean z;
        AtomicReferenceArray atomicReferenceArray = this.f79474g;
        long m23030d = m23030d();
        int i = this.f79473f;
        int m23031c = m23031c(m23030d, i);
        T t = (T) m23027g(atomicReferenceArray, m23031c);
        if (t == f79467j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            m23021m(m23030d + 1);
            m23020n(atomicReferenceArray, m23031c, null);
            return t;
        } else if (!z) {
            return null;
        } else {
            return (T) m23023k(m23026h(atomicReferenceArray), m23030d, i);
        }
    }

    /* renamed from: q */
    public final boolean m23017q(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        m23018p(j + 1);
        m23020n(atomicReferenceArray, i, obj);
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
        long m23028f = m23028f();
        while (true) {
            long m23025i = m23025i();
            long m23028f2 = m23028f();
            if (m23028f == m23028f2) {
                return (int) (m23025i - m23028f2);
            }
            m23028f = m23028f2;
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
}