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
    public static final int f79171e;

    /* renamed from: a */
    public final C13755a f79172a = new C13755a();

    /* renamed from: b */
    public final C13756b f79173b = new C13756b();

    /* renamed from: c */
    public final AtomicInteger f79174c = new AtomicInteger();

    /* renamed from: d */
    public final AtomicInteger f79175d = new AtomicInteger();

    /* renamed from: rx.internal.util.IndexedRingBuffer$a */
    /* loaded from: classes7.dex */
    public static final class C13755a {

        /* renamed from: a */
        public final AtomicReferenceArray f79176a = new AtomicReferenceArray(IndexedRingBuffer.f79171e);

        /* renamed from: b */
        public final AtomicReference f79177b = new AtomicReference();

        /* renamed from: a */
        public C13755a m22902a() {
            if (this.f79177b.get() != null) {
                return (C13755a) this.f79177b.get();
            }
            C13755a c13755a = new C13755a();
            if (AbstractC17300An1.m69050a(this.f79177b, null, c13755a)) {
                return c13755a;
            }
            return (C13755a) this.f79177b.get();
        }
    }

    /* renamed from: rx.internal.util.IndexedRingBuffer$b */
    /* loaded from: classes7.dex */
    public static class C13756b {

        /* renamed from: a */
        public final AtomicIntegerArray f79178a = new AtomicIntegerArray(IndexedRingBuffer.f79171e);

        /* renamed from: b */
        public final AtomicReference f79179b = new AtomicReference();

        /* renamed from: a */
        public int m22901a(int i, int i2) {
            return this.f79178a.getAndSet(i, i2);
        }

        /* renamed from: b */
        public C13756b m22900b() {
            if (this.f79179b.get() != null) {
                return (C13756b) this.f79179b.get();
            }
            C13756b c13756b = new C13756b();
            if (AbstractC17300An1.m69050a(this.f79179b, null, c13756b)) {
                return c13756b;
            }
            return (C13756b) this.f79179b.get();
        }

        /* renamed from: c */
        public void m22899c(int i, int i2) {
            this.f79178a.set(i, i2);
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
        f79171e = i;
    }

    public static <T> IndexedRingBuffer<T> getInstance() {
        return new IndexedRingBuffer<>();
    }

    /* renamed from: a */
    public final int m22908a(Func1 func1, int i, int i2) {
        C13755a c13755a;
        int i3;
        int i4 = this.f79174c.get();
        C13755a c13755a2 = this.f79172a;
        int i5 = f79171e;
        if (i >= i5) {
            C13755a m22907b = m22907b(i);
            i3 = i;
            i %= i5;
            c13755a = m22907b;
        } else {
            c13755a = c13755a2;
            i3 = i;
        }
        loop0: while (c13755a != null) {
            while (i < f79171e) {
                if (i3 >= i4 || i3 >= i2) {
                    break loop0;
                }
                Object obj = c13755a.f79176a.get(i);
                if (obj != null && !((Boolean) func1.call(obj)).booleanValue()) {
                    return i3;
                }
                i++;
                i3++;
            }
            c13755a = (C13755a) c13755a.f79177b.get();
            i = 0;
        }
        return i3;
    }

    public int add(E e) {
        int m22906c = m22906c();
        int i = f79171e;
        if (m22906c < i) {
            this.f79172a.f79176a.set(m22906c, e);
            return m22906c;
        }
        m22907b(m22906c).f79176a.set(m22906c % i, e);
        return m22906c;
    }

    /* renamed from: b */
    public final C13755a m22907b(int i) {
        int i2 = f79171e;
        if (i < i2) {
            return this.f79172a;
        }
        int i3 = i / i2;
        C13755a c13755a = this.f79172a;
        for (int i4 = 0; i4 < i3; i4++) {
            c13755a = c13755a.m22902a();
        }
        return c13755a;
    }

    /* renamed from: c */
    public final synchronized int m22906c() {
        int andIncrement;
        try {
            int m22905d = m22905d();
            if (m22905d >= 0) {
                int i = f79171e;
                if (m22905d < i) {
                    andIncrement = this.f79173b.m22901a(m22905d, -1);
                } else {
                    andIncrement = m22904e(m22905d).m22901a(m22905d % i, -1);
                }
                if (andIncrement == this.f79174c.get()) {
                    this.f79174c.getAndIncrement();
                }
            } else {
                andIncrement = this.f79174c.getAndIncrement();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return andIncrement;
    }

    /* renamed from: d */
    public final synchronized int m22905d() {
        int i;
        int i2;
        do {
            i = this.f79175d.get();
            if (i > 0) {
                i2 = i - 1;
            } else {
                return -1;
            }
        } while (!this.f79175d.compareAndSet(i, i2));
        return i2;
    }

    /* renamed from: e */
    public final C13756b m22904e(int i) {
        int i2 = f79171e;
        if (i < i2) {
            return this.f79173b;
        }
        int i3 = i / i2;
        C13756b c13756b = this.f79173b;
        for (int i4 = 0; i4 < i3; i4++) {
            c13756b = c13756b.m22900b();
        }
        return c13756b;
    }

    /* renamed from: f */
    public final synchronized void m22903f(int i) {
        try {
            int andIncrement = this.f79175d.getAndIncrement();
            int i2 = f79171e;
            if (andIncrement < i2) {
                this.f79173b.m22899c(andIncrement, i);
            } else {
                m22904e(andIncrement).m22899c(andIncrement % i2, i);
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
        int i = this.f79174c.get();
        int i2 = 0;
        loop0: for (C13755a c13755a = this.f79172a; c13755a != null; c13755a = (C13755a) c13755a.f79177b.get()) {
            int i3 = 0;
            while (i3 < f79171e) {
                if (i2 >= i) {
                    break loop0;
                }
                c13755a.f79176a.set(i3, null);
                i3++;
                i2++;
            }
        }
        this.f79174c.set(0);
        this.f79175d.set(0);
    }

    public E remove(int i) {
        E e;
        int i2 = f79171e;
        if (i < i2) {
            e = (E) this.f79172a.f79176a.getAndSet(i, null);
        } else {
            e = (E) m22907b(i).f79176a.getAndSet(i % i2, null);
        }
        m22903f(i);
        return e;
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        releaseToPool();
    }

    public int forEach(Func1<? super E, Boolean> func1, int i) {
        int m22908a = m22908a(func1, i, this.f79174c.get());
        if (i > 0 && m22908a == this.f79174c.get()) {
            return m22908a(func1, 0, i);
        }
        if (m22908a == this.f79174c.get()) {
            return 0;
        }
        return m22908a;
    }
}
