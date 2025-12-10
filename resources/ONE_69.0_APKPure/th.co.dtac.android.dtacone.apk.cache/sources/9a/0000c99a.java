package p000;

import com.bumptech.glide.util.Preconditions;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: iJ */
/* loaded from: classes3.dex */
public final class C10442iJ {

    /* renamed from: a */
    public final Map f62809a = new HashMap();

    /* renamed from: b */
    public final C10444b f62810b = new C10444b();

    /* renamed from: iJ$a */
    /* loaded from: classes3.dex */
    public static class C10443a {

        /* renamed from: a */
        public final Lock f62811a = new ReentrantLock();

        /* renamed from: b */
        public int f62812b;
    }

    /* renamed from: iJ$b */
    /* loaded from: classes3.dex */
    public static class C10444b {

        /* renamed from: a */
        public final Queue f62813a = new ArrayDeque();

        /* renamed from: a */
        public C10443a m30996a() {
            C10443a c10443a;
            synchronized (this.f62813a) {
                c10443a = (C10443a) this.f62813a.poll();
            }
            if (c10443a == null) {
                return new C10443a();
            }
            return c10443a;
        }

        /* renamed from: b */
        public void m30995b(C10443a c10443a) {
            synchronized (this.f62813a) {
                try {
                    if (this.f62813a.size() < 10) {
                        this.f62813a.offer(c10443a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a */
    public void m30998a(String str) {
        C10443a c10443a;
        synchronized (this) {
            try {
                c10443a = (C10443a) this.f62809a.get(str);
                if (c10443a == null) {
                    c10443a = this.f62810b.m30996a();
                    this.f62809a.put(str, c10443a);
                }
                c10443a.f62812b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c10443a.f62811a.lock();
    }

    /* renamed from: b */
    public void m30997b(String str) {
        C10443a c10443a;
        synchronized (this) {
            try {
                c10443a = (C10443a) Preconditions.checkNotNull(this.f62809a.get(str));
                int i = c10443a.f62812b;
                if (i >= 1) {
                    int i2 = i - 1;
                    c10443a.f62812b = i2;
                    if (i2 == 0) {
                        C10443a c10443a2 = (C10443a) this.f62809a.remove(str);
                        if (c10443a2.equals(c10443a)) {
                            this.f62810b.m30995b(c10443a2);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c10443a + ", but actually removed: " + c10443a2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c10443a.f62812b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c10443a.f62811a.unlock();
    }
}