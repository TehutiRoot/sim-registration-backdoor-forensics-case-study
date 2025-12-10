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
    public static final int f79456i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f79457j = new Object();

    /* renamed from: a */
    public final AtomicLong f79458a;

    /* renamed from: b */
    public int f79459b;

    /* renamed from: c */
    public long f79460c;

    /* renamed from: d */
    public int f79461d;

    /* renamed from: e */
    public AtomicReferenceArray f79462e;

    /* renamed from: f */
    public int f79463f;

    /* renamed from: g */
    public AtomicReferenceArray f79464g;

    /* renamed from: h */
    public final AtomicLong f79465h;

    public SpscLinkedArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        int i2 = roundToPowerOfTwo - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(roundToPowerOfTwo + 1);
        this.f79462e = atomicReferenceArray;
        this.f79461d = i2;
        m23050a(roundToPowerOfTwo);
        this.f79464g = atomicReferenceArray;
        this.f79463f = i2;
        this.f79460c = roundToPowerOfTwo - 2;
        this.f79458a = new AtomicLong();
        this.f79465h = new AtomicLong();
    }

    /* renamed from: b */
    public static int m23049b(int i) {
        return i;
    }

    /* renamed from: c */
    public static int m23048c(long j, int i) {
        return m23049b(((int) j) & i);
    }

    /* renamed from: g */
    public static Object m23044g(AtomicReferenceArray atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: n */
    public static void m23037n(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    public final void m23050a(int i) {
        this.f79459b = Math.min(i / 4, f79456i);
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
    public final long m23047d() {
        return this.f79465h.get();
    }

    /* renamed from: e */
    public final long m23046e() {
        return this.f79458a.get();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final long m23045f() {
        return this.f79465h.get();
    }

    /* renamed from: h */
    public final AtomicReferenceArray m23043h(AtomicReferenceArray atomicReferenceArray) {
        return (AtomicReferenceArray) m23044g(atomicReferenceArray, m23049b(atomicReferenceArray.length() - 1));
    }

    /* renamed from: i */
    public final long m23042i() {
        return this.f79458a.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (m23042i() == m23045f()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public final Object m23041j(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f79464g = atomicReferenceArray;
        return m23044g(atomicReferenceArray, m23048c(j, i));
    }

    /* renamed from: k */
    public final Object m23040k(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f79464g = atomicReferenceArray;
        int m23048c = m23048c(j, i);
        Object m23044g = m23044g(atomicReferenceArray, m23048c);
        if (m23044g == null) {
            return null;
        }
        m23037n(atomicReferenceArray, m23048c, null);
        m23038m(j + 1);
        return m23044g;
    }

    /* renamed from: l */
    public final void m23039l(AtomicReferenceArray atomicReferenceArray, long j, int i, Object obj, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f79462e = atomicReferenceArray2;
        this.f79460c = (j2 + j) - 1;
        m23037n(atomicReferenceArray2, i, obj);
        m23036o(atomicReferenceArray, atomicReferenceArray2);
        m23037n(atomicReferenceArray, i, f79457j);
        m23035p(j + 1);
    }

    /* renamed from: m */
    public final void m23038m(long j) {
        this.f79465h.lazySet(j);
    }

    /* renamed from: o */
    public final void m23036o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m23037n(atomicReferenceArray, m23049b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        AtomicReferenceArray atomicReferenceArray = this.f79462e;
        long m23046e = m23046e();
        int i = this.f79461d;
        int m23048c = m23048c(m23046e, i);
        if (m23046e < this.f79460c) {
            return m23034q(atomicReferenceArray, t, m23046e, m23048c);
        }
        long j = this.f79459b + m23046e;
        if (m23044g(atomicReferenceArray, m23048c(j, i)) == null) {
            this.f79460c = j - 1;
            return m23034q(atomicReferenceArray, t, m23046e, m23048c);
        } else if (m23044g(atomicReferenceArray, m23048c(1 + m23046e, i)) == null) {
            return m23034q(atomicReferenceArray, t, m23046e, m23048c);
        } else {
            m23039l(atomicReferenceArray, m23046e, m23048c, t, i);
            return true;
        }
    }

    /* renamed from: p */
    public final void m23035p(long j) {
        this.f79458a.lazySet(j);
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray atomicReferenceArray = this.f79464g;
        long m23047d = m23047d();
        int i = this.f79463f;
        T t = (T) m23044g(atomicReferenceArray, m23048c(m23047d, i));
        if (t == f79457j) {
            return (T) m23041j(m23043h(atomicReferenceArray), m23047d, i);
        }
        return t;
    }

    @Override // java.util.Queue
    public T poll() {
        boolean z;
        AtomicReferenceArray atomicReferenceArray = this.f79464g;
        long m23047d = m23047d();
        int i = this.f79463f;
        int m23048c = m23048c(m23047d, i);
        T t = (T) m23044g(atomicReferenceArray, m23048c);
        if (t == f79457j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            m23037n(atomicReferenceArray, m23048c, null);
            m23038m(m23047d + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            return (T) m23040k(m23043h(atomicReferenceArray), m23047d, i);
        }
    }

    /* renamed from: q */
    public final boolean m23034q(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        m23037n(atomicReferenceArray, i, obj);
        m23035p(j + 1);
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
        long m23045f = m23045f();
        while (true) {
            long m23042i = m23042i();
            long m23045f2 = m23045f();
            if (m23045f == m23045f2) {
                return (int) (m23042i - m23045f2);
            }
            m23045f = m23045f2;
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
        AtomicReferenceArray atomicReferenceArray = this.f79462e;
        long m23042i = m23042i();
        int i = this.f79461d;
        long j = 2 + m23042i;
        if (m23044g(atomicReferenceArray, m23048c(j, i)) == null) {
            int m23048c = m23048c(m23042i, i);
            m23037n(atomicReferenceArray, m23048c + 1, t2);
            m23037n(atomicReferenceArray, m23048c, t);
            m23035p(j);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f79462e = atomicReferenceArray2;
        int m23048c2 = m23048c(m23042i, i);
        m23037n(atomicReferenceArray2, m23048c2 + 1, t2);
        m23037n(atomicReferenceArray2, m23048c2, t);
        m23036o(atomicReferenceArray, atomicReferenceArray2);
        m23037n(atomicReferenceArray, m23048c2, f79457j);
        m23035p(j);
        return true;
    }
}