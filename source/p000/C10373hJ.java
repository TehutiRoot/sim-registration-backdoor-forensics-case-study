package p000;

import com.bumptech.glide.util.Preconditions;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: hJ */
/* loaded from: classes3.dex */
public final class C10373hJ {

    /* renamed from: a */
    public final Map f62466a = new HashMap();

    /* renamed from: b */
    public final C10375b f62467b = new C10375b();

    /* renamed from: hJ$a */
    /* loaded from: classes3.dex */
    public static class C10374a {

        /* renamed from: a */
        public final Lock f62468a = new ReentrantLock();

        /* renamed from: b */
        public int f62469b;
    }

    /* renamed from: hJ$b */
    /* loaded from: classes3.dex */
    public static class C10375b {

        /* renamed from: a */
        public final Queue f62470a = new ArrayDeque();

        /* renamed from: a */
        public C10374a m30896a() {
            C10374a c10374a;
            synchronized (this.f62470a) {
                c10374a = (C10374a) this.f62470a.poll();
            }
            if (c10374a == null) {
                return new C10374a();
            }
            return c10374a;
        }

        /* renamed from: b */
        public void m30895b(C10374a c10374a) {
            synchronized (this.f62470a) {
                try {
                    if (this.f62470a.size() < 10) {
                        this.f62470a.offer(c10374a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a */
    public void m30898a(String str) {
        C10374a c10374a;
        synchronized (this) {
            try {
                c10374a = (C10374a) this.f62466a.get(str);
                if (c10374a == null) {
                    c10374a = this.f62467b.m30896a();
                    this.f62466a.put(str, c10374a);
                }
                c10374a.f62469b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c10374a.f62468a.lock();
    }

    /* renamed from: b */
    public void m30897b(String str) {
        C10374a c10374a;
        synchronized (this) {
            try {
                c10374a = (C10374a) Preconditions.checkNotNull(this.f62466a.get(str));
                int i = c10374a.f62469b;
                if (i >= 1) {
                    int i2 = i - 1;
                    c10374a.f62469b = i2;
                    if (i2 == 0) {
                        C10374a c10374a2 = (C10374a) this.f62466a.remove(str);
                        if (c10374a2.equals(c10374a)) {
                            this.f62467b.m30895b(c10374a2);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c10374a + ", but actually removed: " + c10374a2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c10374a.f62469b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c10374a.f62468a.unlock();
    }
}
