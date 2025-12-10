package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {

    /* renamed from: i */
    public static final int f66005i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f66006j = new Object();

    /* renamed from: b */
    public int f66008b;

    /* renamed from: c */
    public long f66009c;

    /* renamed from: d */
    public final int f66010d;

    /* renamed from: e */
    public AtomicReferenceArray f66011e;

    /* renamed from: f */
    public final int f66012f;

    /* renamed from: g */
    public AtomicReferenceArray f66013g;

    /* renamed from: a */
    public final AtomicLong f66007a = new AtomicLong();

    /* renamed from: h */
    public final AtomicLong f66014h = new AtomicLong();

    public SpscLinkedArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i));
        int i2 = roundToPowerOfTwo - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(roundToPowerOfTwo + 1);
        this.f66011e = atomicReferenceArray;
        this.f66010d = i2;
        m29920a(roundToPowerOfTwo);
        this.f66013g = atomicReferenceArray;
        this.f66012f = i2;
        this.f66009c = roundToPowerOfTwo - 2;
        m29905p(0L);
    }

    /* renamed from: b */
    public static int m29919b(int i) {
        return i;
    }

    /* renamed from: c */
    public static int m29918c(long j, int i) {
        return m29919b(((int) j) & i);
    }

    /* renamed from: g */
    public static Object m29914g(AtomicReferenceArray atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: m */
    private void m29908m(long j) {
        this.f66014h.lazySet(j);
    }

    /* renamed from: n */
    public static void m29907n(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: p */
    private void m29905p(long j) {
        this.f66007a.lazySet(j);
    }

    /* renamed from: a */
    public final void m29920a(int i) {
        this.f66008b = Math.min(i / 4, f66005i);
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
    public final long m29917d() {
        return this.f66014h.get();
    }

    /* renamed from: e */
    public final long m29916e() {
        return this.f66007a.get();
    }

    /* renamed from: f */
    public final long m29915f() {
        return this.f66014h.get();
    }

    /* renamed from: h */
    public final AtomicReferenceArray m29913h(AtomicReferenceArray atomicReferenceArray, int i) {
        int m29919b = m29919b(i);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) m29914g(atomicReferenceArray, m29919b);
        m29907n(atomicReferenceArray, m29919b, null);
        return atomicReferenceArray2;
    }

    /* renamed from: i */
    public final long m29912i() {
        return this.f66007a.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        if (m29912i() == m29915f()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final Object m29911j(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f66013g = atomicReferenceArray;
        return m29914g(atomicReferenceArray, m29918c(j, i));
    }

    /* renamed from: k */
    public final Object m29910k(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f66013g = atomicReferenceArray;
        int m29918c = m29918c(j, i);
        Object m29914g = m29914g(atomicReferenceArray, m29918c);
        if (m29914g != null) {
            m29907n(atomicReferenceArray, m29918c, null);
            m29908m(j + 1);
        }
        return m29914g;
    }

    /* renamed from: l */
    public final void m29909l(AtomicReferenceArray atomicReferenceArray, long j, int i, Object obj, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f66011e = atomicReferenceArray2;
        this.f66009c = (j2 + j) - 1;
        m29907n(atomicReferenceArray2, i, obj);
        m29906o(atomicReferenceArray, atomicReferenceArray2);
        m29907n(atomicReferenceArray, i, f66006j);
        m29905p(j + 1);
    }

    /* renamed from: o */
    public final void m29906o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m29907n(atomicReferenceArray, m29919b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray atomicReferenceArray = this.f66011e;
            long m29916e = m29916e();
            int i = this.f66010d;
            int m29918c = m29918c(m29916e, i);
            if (m29916e < this.f66009c) {
                return m29904q(atomicReferenceArray, t, m29916e, m29918c);
            }
            long j = this.f66008b + m29916e;
            if (m29914g(atomicReferenceArray, m29918c(j, i)) == null) {
                this.f66009c = j - 1;
                return m29904q(atomicReferenceArray, t, m29916e, m29918c);
            } else if (m29914g(atomicReferenceArray, m29918c(1 + m29916e, i)) == null) {
                return m29904q(atomicReferenceArray, t, m29916e, m29918c);
            } else {
                m29909l(atomicReferenceArray, m29916e, m29918c, t, i);
                return true;
            }
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T peek() {
        AtomicReferenceArray atomicReferenceArray = this.f66013g;
        long m29917d = m29917d();
        int i = this.f66012f;
        T t = (T) m29914g(atomicReferenceArray, m29918c(m29917d, i));
        if (t == f66006j) {
            return (T) m29911j(m29913h(atomicReferenceArray, i + 1), m29917d, i);
        }
        return t;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        boolean z;
        AtomicReferenceArray atomicReferenceArray = this.f66013g;
        long m29917d = m29917d();
        int i = this.f66012f;
        int m29918c = m29918c(m29917d, i);
        T t = (T) m29914g(atomicReferenceArray, m29918c);
        if (t == f66006j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            m29907n(atomicReferenceArray, m29918c, null);
            m29908m(m29917d + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            return (T) m29910k(m29913h(atomicReferenceArray, i + 1), m29917d, i);
        }
    }

    /* renamed from: q */
    public final boolean m29904q(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        m29907n(atomicReferenceArray, i, obj);
        m29905p(j + 1);
        return true;
    }

    public int size() {
        long m29915f = m29915f();
        while (true) {
            long m29912i = m29912i();
            long m29915f2 = m29915f();
            if (m29915f == m29915f2) {
                return (int) (m29912i - m29915f2);
            }
            m29915f = m29915f2;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t, T t2) {
        AtomicReferenceArray atomicReferenceArray = this.f66011e;
        long m29912i = m29912i();
        int i = this.f66010d;
        long j = 2 + m29912i;
        if (m29914g(atomicReferenceArray, m29918c(j, i)) == null) {
            int m29918c = m29918c(m29912i, i);
            m29907n(atomicReferenceArray, m29918c + 1, t2);
            m29907n(atomicReferenceArray, m29918c, t);
            m29905p(j);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f66011e = atomicReferenceArray2;
        int m29918c2 = m29918c(m29912i, i);
        m29907n(atomicReferenceArray2, m29918c2 + 1, t2);
        m29907n(atomicReferenceArray2, m29918c2, t);
        m29906o(atomicReferenceArray, atomicReferenceArray2);
        m29907n(atomicReferenceArray, m29918c2, f66006j);
        m29905p(j);
        return true;
    }
}
