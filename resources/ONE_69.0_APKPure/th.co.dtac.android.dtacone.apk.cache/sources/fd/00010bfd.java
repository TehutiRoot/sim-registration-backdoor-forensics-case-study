package p046rx.internal.util;

import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p046rx.Subscription;
import p046rx.functions.Func1;

/* renamed from: rx.internal.util.IndexedRingBuffer */
/* loaded from: classes7.dex */
public final class IndexedRingBuffer<E> implements Subscription {

    /* renamed from: e */
    public static final int f79377e;

    /* renamed from: a */
    public final C13756a f79378a = new C13756a();

    /* renamed from: b */
    public final C13757b f79379b = new C13757b();

    /* renamed from: c */
    public final AtomicInteger f79380c = new AtomicInteger();

    /* renamed from: d */
    public final AtomicInteger f79381d = new AtomicInteger();

    /* renamed from: rx.internal.util.IndexedRingBuffer$a */
    /* loaded from: classes7.dex */
    public static final class C13756a {

        /* renamed from: a */
        public final AtomicReferenceArray f79382a = new AtomicReferenceArray(IndexedRingBuffer.f79377e);

        /* renamed from: b */
        public final AtomicReference f79383b = new AtomicReference();

        /* renamed from: a */
        public C13756a m23090a() {
            if (this.f79383b.get() != null) {
                return (C13756a) this.f79383b.get();
            }
            C13756a c13756a = new C13756a();
            if (AbstractC23094xo1.m479a(this.f79383b, null, c13756a)) {
                return c13756a;
            }
            return (C13756a) this.f79383b.get();
        }
    }

    /* renamed from: rx.internal.util.IndexedRingBuffer$b */
    /* loaded from: classes7.dex */
    public static class C13757b {

        /* renamed from: a */
        public final AtomicIntegerArray f79384a = new AtomicIntegerArray(IndexedRingBuffer.f79377e);

        /* renamed from: b */
        public final AtomicReference f79385b = new AtomicReference();

        /* renamed from: a */
        public int m23089a(int i, int i2) {
            return this.f79384a.getAndSet(i, i2);
        }

        /* renamed from: b */
        public C13757b m23088b() {
            if (this.f79385b.get() != null) {
                return (C13757b) this.f79385b.get();
            }
            C13757b c13757b = new C13757b();
            if (AbstractC23094xo1.m479a(this.f79385b, null, c13757b)) {
                return c13757b;
            }
            return (C13757b) this.f79385b.get();
        }

        /* renamed from: c */
        public void m23087c(int i, int i2) {
            this.f79384a.set(i, i2);
        }
    }

    static {
        int i;
        if (PlatformDependent.isAndroid()) {
            i = 8;
        } else {
            i = 128;
        }
        String property = System.getProperty("rx.indexed-ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to set 'rx.indexed-ring-buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        f79377e = i;
    }

    public static <T> IndexedRingBuffer<T> getInstance() {
        return new IndexedRingBuffer<>();
    }

    /* renamed from: a */
    public final int m23096a(Func1 func1, int i, int i2) {
        C13756a c13756a;
        int i3;
        int i4 = this.f79380c.get();
        C13756a c13756a2 = this.f79378a;
        int i5 = f79377e;
        if (i >= i5) {
            C13756a m23095b = m23095b(i);
            i3 = i;
            i %= i5;
            c13756a = m23095b;
        } else {
            c13756a = c13756a2;
            i3 = i;
        }
        loop0: while (c13756a != null) {
            while (i < f79377e) {
                if (i3 >= i4 || i3 >= i2) {
                    break loop0;
                }
                Object obj = c13756a.f79382a.get(i);
                if (obj != null && !((Boolean) func1.call(obj)).booleanValue()) {
                    return i3;
                }
                i++;
                i3++;
            }
            c13756a = (C13756a) c13756a.f79383b.get();
            i = 0;
        }
        return i3;
    }

    public int add(E e) {
        int m23094c = m23094c();
        int i = f79377e;
        if (m23094c < i) {
            this.f79378a.f79382a.set(m23094c, e);
            return m23094c;
        }
        m23095b(m23094c).f79382a.set(m23094c % i, e);
        return m23094c;
    }

    /* renamed from: b */
    public final C13756a m23095b(int i) {
        int i2 = f79377e;
        if (i < i2) {
            return this.f79378a;
        }
        int i3 = i / i2;
        C13756a c13756a = this.f79378a;
        for (int i4 = 0; i4 < i3; i4++) {
            c13756a = c13756a.m23090a();
        }
        return c13756a;
    }

    /* renamed from: c */
    public final synchronized int m23094c() {
        int andIncrement;
        try {
            int m23093d = m23093d();
            if (m23093d >= 0) {
                int i = f79377e;
                if (m23093d < i) {
                    andIncrement = this.f79379b.m23089a(m23093d, -1);
                } else {
                    andIncrement = m23092e(m23093d).m23089a(m23093d % i, -1);
                }
                if (andIncrement == this.f79380c.get()) {
                    this.f79380c.getAndIncrement();
                }
            } else {
                andIncrement = this.f79380c.getAndIncrement();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return andIncrement;
    }

    /* renamed from: d */
    public final synchronized int m23093d() {
        int i;
        int i2;
        do {
            i = this.f79381d.get();
            if (i > 0) {
                i2 = i - 1;
            } else {
                return -1;
            }
        } while (!this.f79381d.compareAndSet(i, i2));
        return i2;
    }

    /* renamed from: e */
    public final C13757b m23092e(int i) {
        int i2 = f79377e;
        if (i < i2) {
            return this.f79379b;
        }
        int i3 = i / i2;
        C13757b c13757b = this.f79379b;
        for (int i4 = 0; i4 < i3; i4++) {
            c13757b = c13757b.m23088b();
        }
        return c13757b;
    }

    /* renamed from: f */
    public final synchronized void m23091f(int i) {
        try {
            int andIncrement = this.f79381d.getAndIncrement();
            int i2 = f79377e;
            if (andIncrement < i2) {
                this.f79379b.m23087c(andIncrement, i);
            } else {
                m23092e(andIncrement).m23087c(andIncrement % i2, i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int forEach(Func1<? super E, Boolean> func1) {
        return forEach(func1, 0);
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return false;
    }

    public void releaseToPool() {
        int i = this.f79380c.get();
        int i2 = 0;
        loop0: for (C13756a c13756a = this.f79378a; c13756a != null; c13756a = (C13756a) c13756a.f79383b.get()) {
            int i3 = 0;
            while (i3 < f79377e) {
                if (i2 >= i) {
                    break loop0;
                }
                c13756a.f79382a.set(i3, null);
                i3++;
                i2++;
            }
        }
        this.f79380c.set(0);
        this.f79381d.set(0);
    }

    public E remove(int i) {
        E e;
        int i2 = f79377e;
        if (i < i2) {
            e = (E) this.f79378a.f79382a.getAndSet(i, null);
        } else {
            e = (E) m23095b(i).f79382a.getAndSet(i % i2, null);
        }
        m23091f(i);
        return e;
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        releaseToPool();
    }

    public int forEach(Func1<? super E, Boolean> func1, int i) {
        int m23096a = m23096a(func1, i, this.f79380c.get());
        if (i > 0 && m23096a == this.f79380c.get()) {
            return m23096a(func1, 0, i);
        }
        if (m23096a == this.f79380c.get()) {
            return 0;
        }
        return m23096a;
    }
}