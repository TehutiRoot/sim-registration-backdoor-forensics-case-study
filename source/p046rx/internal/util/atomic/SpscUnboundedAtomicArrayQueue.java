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
    public static final int f79260i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f79261j = new Object();

    /* renamed from: a */
    public final AtomicLong f79262a;

    /* renamed from: b */
    public int f79263b;

    /* renamed from: c */
    public long f79264c;

    /* renamed from: d */
    public int f79265d;

    /* renamed from: e */
    public AtomicReferenceArray f79266e;

    /* renamed from: f */
    public int f79267f;

    /* renamed from: g */
    public AtomicReferenceArray f79268g;

    /* renamed from: h */
    public final AtomicLong f79269h;

    public SpscUnboundedAtomicArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i));
        int i2 = roundToPowerOfTwo - 1;
        this.f79262a = new AtomicLong();
        this.f79269h = new AtomicLong();
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(roundToPowerOfTwo + 1);
        this.f79266e = atomicReferenceArray;
        this.f79265d = i2;
        m22845a(roundToPowerOfTwo);
        this.f79268g = atomicReferenceArray;
        this.f79267f = i2;
        this.f79264c = roundToPowerOfTwo - 2;
        m22830p(0L);
    }

    /* renamed from: b */
    public static int m22844b(int i) {
        return i;
    }

    /* renamed from: c */
    public static int m22843c(long j, int i) {
        return m22844b(((int) j) & i);
    }

    /* renamed from: g */
    public static Object m22839g(AtomicReferenceArray atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: n */
    public static void m22832n(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    public final void m22845a(int i) {
        this.f79263b = Math.min(i / 4, f79260i);
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
    public final long m22842d() {
        return this.f79269h.get();
    }

    /* renamed from: e */
    public final long m22841e() {
        return this.f79262a.get();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final long m22840f() {
        return this.f79269h.get();
    }

    /* renamed from: h */
    public final AtomicReferenceArray m22838h(AtomicReferenceArray atomicReferenceArray) {
        return (AtomicReferenceArray) m22839g(atomicReferenceArray, m22844b(atomicReferenceArray.length() - 1));
    }

    /* renamed from: i */
    public final long m22837i() {
        return this.f79262a.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (m22837i() == m22840f()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public final Object m22836j(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f79268g = atomicReferenceArray;
        return m22839g(atomicReferenceArray, m22843c(j, i));
    }

    /* renamed from: k */
    public final Object m22835k(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f79268g = atomicReferenceArray;
        int m22843c = m22843c(j, i);
        Object m22839g = m22839g(atomicReferenceArray, m22843c);
        if (m22839g == null) {
            return null;
        }
        m22833m(j + 1);
        m22832n(atomicReferenceArray, m22843c, null);
        return m22839g;
    }

    /* renamed from: l */
    public final void m22834l(AtomicReferenceArray atomicReferenceArray, long j, int i, Object obj, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f79266e = atomicReferenceArray2;
        this.f79264c = (j2 + j) - 1;
        m22830p(j + 1);
        m22832n(atomicReferenceArray2, i, obj);
        m22831o(atomicReferenceArray, atomicReferenceArray2);
        m22832n(atomicReferenceArray, i, f79261j);
    }

    /* renamed from: m */
    public final void m22833m(long j) {
        this.f79269h.lazySet(j);
    }

    /* renamed from: o */
    public final void m22831o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m22832n(atomicReferenceArray, m22844b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        t.getClass();
        AtomicReferenceArray atomicReferenceArray = this.f79266e;
        long m22841e = m22841e();
        int i = this.f79265d;
        int m22843c = m22843c(m22841e, i);
        if (m22841e < this.f79264c) {
            return m22829q(atomicReferenceArray, t, m22841e, m22843c);
        }
        long j = this.f79263b + m22841e;
        if (m22839g(atomicReferenceArray, m22843c(j, i)) == null) {
            this.f79264c = j - 1;
            return m22829q(atomicReferenceArray, t, m22841e, m22843c);
        } else if (m22839g(atomicReferenceArray, m22843c(1 + m22841e, i)) != null) {
            return m22829q(atomicReferenceArray, t, m22841e, m22843c);
        } else {
            m22834l(atomicReferenceArray, m22841e, m22843c, t, i);
            return true;
        }
    }

    /* renamed from: p */
    public final void m22830p(long j) {
        this.f79262a.lazySet(j);
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray atomicReferenceArray = this.f79268g;
        long m22842d = m22842d();
        int i = this.f79267f;
        T t = (T) m22839g(atomicReferenceArray, m22843c(m22842d, i));
        if (t == f79261j) {
            return (T) m22836j(m22838h(atomicReferenceArray), m22842d, i);
        }
        return t;
    }

    @Override // java.util.Queue
    public T poll() {
        boolean z;
        AtomicReferenceArray atomicReferenceArray = this.f79268g;
        long m22842d = m22842d();
        int i = this.f79267f;
        int m22843c = m22843c(m22842d, i);
        T t = (T) m22839g(atomicReferenceArray, m22843c);
        if (t == f79261j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            m22833m(m22842d + 1);
            m22832n(atomicReferenceArray, m22843c, null);
            return t;
        } else if (!z) {
            return null;
        } else {
            return (T) m22835k(m22838h(atomicReferenceArray), m22842d, i);
        }
    }

    /* renamed from: q */
    public final boolean m22829q(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        m22830p(j + 1);
        m22832n(atomicReferenceArray, i, obj);
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
        long m22840f = m22840f();
        while (true) {
            long m22837i = m22837i();
            long m22840f2 = m22840f();
            if (m22840f == m22840f2) {
                return (int) (m22837i - m22840f2);
            }
            m22840f = m22840f2;
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
