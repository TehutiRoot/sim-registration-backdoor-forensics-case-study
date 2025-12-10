package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {

    /* renamed from: i */
    public static final int f66068i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f66069j = new Object();

    /* renamed from: b */
    public int f66071b;

    /* renamed from: c */
    public long f66072c;

    /* renamed from: d */
    public final int f66073d;

    /* renamed from: e */
    public AtomicReferenceArray f66074e;

    /* renamed from: f */
    public final int f66075f;

    /* renamed from: g */
    public AtomicReferenceArray f66076g;

    /* renamed from: a */
    public final AtomicLong f66070a = new AtomicLong();

    /* renamed from: h */
    public final AtomicLong f66077h = new AtomicLong();

    public SpscLinkedArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i));
        int i2 = roundToPowerOfTwo - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(roundToPowerOfTwo + 1);
        this.f66074e = atomicReferenceArray;
        this.f66073d = i2;
        m30260a(roundToPowerOfTwo);
        this.f66076g = atomicReferenceArray;
        this.f66075f = i2;
        this.f66072c = roundToPowerOfTwo - 2;
        m30245p(0L);
    }

    /* renamed from: b */
    public static int m30259b(int i) {
        return i;
    }

    /* renamed from: c */
    public static int m30258c(long j, int i) {
        return m30259b(((int) j) & i);
    }

    /* renamed from: g */
    public static Object m30254g(AtomicReferenceArray atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: m */
    private void m30248m(long j) {
        this.f66077h.lazySet(j);
    }

    /* renamed from: n */
    public static void m30247n(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: p */
    private void m30245p(long j) {
        this.f66070a.lazySet(j);
    }

    /* renamed from: a */
    public final void m30260a(int i) {
        this.f66071b = Math.min(i / 4, f66068i);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    public final long m30257d() {
        return this.f66077h.get();
    }

    /* renamed from: e */
    public final long m30256e() {
        return this.f66070a.get();
    }

    /* renamed from: f */
    public final long m30255f() {
        return this.f66077h.get();
    }

    /* renamed from: h */
    public final AtomicReferenceArray m30253h(AtomicReferenceArray atomicReferenceArray, int i) {
        int m30259b = m30259b(i);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) m30254g(atomicReferenceArray, m30259b);
        m30247n(atomicReferenceArray, m30259b, null);
        return atomicReferenceArray2;
    }

    /* renamed from: i */
    public final long m30252i() {
        return this.f66070a.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        if (m30252i() == m30255f()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final Object m30251j(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f66076g = atomicReferenceArray;
        return m30254g(atomicReferenceArray, m30258c(j, i));
    }

    /* renamed from: k */
    public final Object m30250k(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f66076g = atomicReferenceArray;
        int m30258c = m30258c(j, i);
        Object m30254g = m30254g(atomicReferenceArray, m30258c);
        if (m30254g != null) {
            m30247n(atomicReferenceArray, m30258c, null);
            m30248m(j + 1);
        }
        return m30254g;
    }

    /* renamed from: l */
    public final void m30249l(AtomicReferenceArray atomicReferenceArray, long j, int i, Object obj, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f66074e = atomicReferenceArray2;
        this.f66072c = (j2 + j) - 1;
        m30247n(atomicReferenceArray2, i, obj);
        m30246o(atomicReferenceArray, atomicReferenceArray2);
        m30247n(atomicReferenceArray, i, f66069j);
        m30245p(j + 1);
    }

    /* renamed from: o */
    public final void m30246o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m30247n(atomicReferenceArray, m30259b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray atomicReferenceArray = this.f66074e;
            long m30256e = m30256e();
            int i = this.f66073d;
            int m30258c = m30258c(m30256e, i);
            if (m30256e < this.f66072c) {
                return m30244q(atomicReferenceArray, t, m30256e, m30258c);
            }
            long j = this.f66071b + m30256e;
            if (m30254g(atomicReferenceArray, m30258c(j, i)) == null) {
                this.f66072c = j - 1;
                return m30244q(atomicReferenceArray, t, m30256e, m30258c);
            } else if (m30254g(atomicReferenceArray, m30258c(1 + m30256e, i)) == null) {
                return m30244q(atomicReferenceArray, t, m30256e, m30258c);
            } else {
                m30249l(atomicReferenceArray, m30256e, m30258c, t, i);
                return true;
            }
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T peek() {
        AtomicReferenceArray atomicReferenceArray = this.f66076g;
        long m30257d = m30257d();
        int i = this.f66075f;
        T t = (T) m30254g(atomicReferenceArray, m30258c(m30257d, i));
        if (t == f66069j) {
            return (T) m30251j(m30253h(atomicReferenceArray, i + 1), m30257d, i);
        }
        return t;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        boolean z;
        AtomicReferenceArray atomicReferenceArray = this.f66076g;
        long m30257d = m30257d();
        int i = this.f66075f;
        int m30258c = m30258c(m30257d, i);
        T t = (T) m30254g(atomicReferenceArray, m30258c);
        if (t == f66069j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            m30247n(atomicReferenceArray, m30258c, null);
            m30248m(m30257d + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            return (T) m30250k(m30253h(atomicReferenceArray, i + 1), m30257d, i);
        }
    }

    /* renamed from: q */
    public final boolean m30244q(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        m30247n(atomicReferenceArray, i, obj);
        m30245p(j + 1);
        return true;
    }

    public int size() {
        long m30255f = m30255f();
        while (true) {
            long m30252i = m30252i();
            long m30255f2 = m30255f();
            if (m30255f == m30255f2) {
                return (int) (m30252i - m30255f2);
            }
            m30255f = m30255f2;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t, T t2) {
        AtomicReferenceArray atomicReferenceArray = this.f66074e;
        long m30252i = m30252i();
        int i = this.f66073d;
        long j = 2 + m30252i;
        if (m30254g(atomicReferenceArray, m30258c(j, i)) == null) {
            int m30258c = m30258c(m30252i, i);
            m30247n(atomicReferenceArray, m30258c + 1, t2);
            m30247n(atomicReferenceArray, m30258c, t);
            m30245p(j);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f66074e = atomicReferenceArray2;
        int m30258c2 = m30258c(m30252i, i);
        m30247n(atomicReferenceArray2, m30258c2 + 1, t2);
        m30247n(atomicReferenceArray2, m30258c2, t);
        m30246o(atomicReferenceArray, atomicReferenceArray2);
        m30247n(atomicReferenceArray, m30258c2, f66069j);
        m30245p(j);
        return true;
    }
}