package org.apache.http.pool;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.pool.PoolEntry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes6.dex */
public abstract class AbstractConnPool<T, C, E extends PoolEntry<T, C>> implements ConnPool<T, E>, ConnPoolControl<T> {

    /* renamed from: a */
    public final Lock f74563a;

    /* renamed from: b */
    public final Condition f74564b;

    /* renamed from: c */
    public final ConnFactory f74565c;

    /* renamed from: d */
    public final Map f74566d;

    /* renamed from: e */
    public final Set f74567e;

    /* renamed from: f */
    public final LinkedList f74568f;

    /* renamed from: g */
    public final LinkedList f74569g;

    /* renamed from: h */
    public final Map f74570h;

    /* renamed from: i */
    public volatile boolean f74571i;

    /* renamed from: j */
    public volatile int f74572j;

    /* renamed from: k */
    public volatile int f74573k;

    /* renamed from: l */
    public volatile int f74574l;

    /* renamed from: org.apache.http.pool.AbstractConnPool$a */
    /* loaded from: classes6.dex */
    public class C12610a extends AbstractC17706Gy1 {

        /* renamed from: e */
        public final /* synthetic */ Object f74575e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12610a(Object obj, Object obj2) {
            super(obj);
            this.f74575e = obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC17706Gy1
        /* renamed from: b */
        public PoolEntry mo24554b(Object obj) {
            return AbstractConnPool.this.createEntry(this.f74575e, obj);
        }
    }

    /* renamed from: org.apache.http.pool.AbstractConnPool$b */
    /* loaded from: classes6.dex */
    public class FutureC12611b implements Future {

        /* renamed from: a */
        public final AtomicBoolean f74577a = new AtomicBoolean(false);

        /* renamed from: b */
        public final AtomicBoolean f74578b = new AtomicBoolean(false);

        /* renamed from: c */
        public final AtomicReference f74579c = new AtomicReference(null);

        /* renamed from: d */
        public final /* synthetic */ FutureCallback f74580d;

        /* renamed from: e */
        public final /* synthetic */ Object f74581e;

        /* renamed from: f */
        public final /* synthetic */ Object f74582f;

        public FutureC12611b(FutureCallback futureCallback, Object obj, Object obj2) {
            this.f74580d = futureCallback;
            this.f74581e = obj;
            this.f74582f = obj2;
        }

        @Override // java.util.concurrent.Future
        /* renamed from: a */
        public PoolEntry get() {
            try {
                return get(0L, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e) {
                throw new ExecutionException(e);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
            if (r10.f74578b.compareAndSet(false, true) == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
            r10.f74579c.set(r2);
            r10.f74578b.set(true);
            r10.f74583g.onLease(r2);
            r11 = r10.f74580d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
            if (r11 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
            r11.completed(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
            r10.f74583g.release((org.apache.http.pool.AbstractConnPool) r2, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
            throw new java.util.concurrent.ExecutionException(org.apache.http.pool.AbstractConnPool.m24556i());
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Future
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public org.apache.http.pool.PoolEntry get(long r11, java.util.concurrent.TimeUnit r13) {
            /*
                r10 = this;
            L0:
                monitor-enter(r10)
                r0 = 0
                r1 = 1
                java.util.concurrent.atomic.AtomicReference r2 = r10.f74579c     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                org.apache.http.pool.PoolEntry r2 = (org.apache.http.pool.PoolEntry) r2     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                if (r2 == 0) goto L12
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
                return r2
            Lf:
                r11 = move-exception
                goto La5
            L12:
                java.util.concurrent.atomic.AtomicBoolean r2 = r10.f74578b     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                boolean r2 = r2.get()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                if (r2 != 0) goto L86
                org.apache.http.pool.AbstractConnPool r3 = org.apache.http.pool.AbstractConnPool.this     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                java.lang.Object r4 = r10.f74581e     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                java.lang.Object r5 = r10.f74582f     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                r6 = r11
                r8 = r13
                r9 = r10
                org.apache.http.pool.PoolEntry r2 = org.apache.http.pool.AbstractConnPool.m24561d(r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                org.apache.http.pool.AbstractConnPool r3 = org.apache.http.pool.AbstractConnPool.this     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                int r3 = org.apache.http.pool.AbstractConnPool.m24560e(r3)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                if (r3 <= 0) goto L57
                long r3 = r2.getUpdated()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                org.apache.http.pool.AbstractConnPool r5 = org.apache.http.pool.AbstractConnPool.this     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                int r5 = org.apache.http.pool.AbstractConnPool.m24560e(r5)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                long r5 = (long) r5     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                long r3 = r3 + r5
                long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 > 0) goto L57
                org.apache.http.pool.AbstractConnPool r3 = org.apache.http.pool.AbstractConnPool.this     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                boolean r3 = r3.validate(r2)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                if (r3 != 0) goto L57
                r2.close()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                org.apache.http.pool.AbstractConnPool r3 = org.apache.http.pool.AbstractConnPool.this     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                r3.release(r2, r0)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
                goto L0
            L55:
                r11 = move-exception
                goto L90
            L57:
                java.util.concurrent.atomic.AtomicBoolean r11 = r10.f74578b     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                boolean r11 = r11.compareAndSet(r0, r1)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                if (r11 == 0) goto L77
                java.util.concurrent.atomic.AtomicReference r11 = r10.f74579c     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                r11.set(r2)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                java.util.concurrent.atomic.AtomicBoolean r11 = r10.f74578b     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                r11.set(r1)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                org.apache.http.pool.AbstractConnPool r11 = org.apache.http.pool.AbstractConnPool.this     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                r11.onLease(r2)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                org.apache.http.concurrent.FutureCallback r11 = r10.f74580d     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                if (r11 == 0) goto L75
                r11.completed(r2)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
            L75:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
                return r2
            L77:
                org.apache.http.pool.AbstractConnPool r11 = org.apache.http.pool.AbstractConnPool.this     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                r11.release(r2, r1)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                java.util.concurrent.ExecutionException r11 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                java.lang.Exception r12 = org.apache.http.pool.AbstractConnPool.m24562c()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                r11.<init>(r12)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                throw r11     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
            L86:
                java.util.concurrent.ExecutionException r11 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                java.lang.Exception r12 = org.apache.http.pool.AbstractConnPool.m24562c()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                r11.<init>(r12)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
                throw r11     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L55
            L90:
                java.util.concurrent.atomic.AtomicBoolean r12 = r10.f74578b     // Catch: java.lang.Throwable -> Lf
                boolean r12 = r12.compareAndSet(r0, r1)     // Catch: java.lang.Throwable -> Lf
                if (r12 == 0) goto L9f
                org.apache.http.concurrent.FutureCallback r12 = r10.f74580d     // Catch: java.lang.Throwable -> Lf
                if (r12 == 0) goto L9f
                r12.failed(r11)     // Catch: java.lang.Throwable -> Lf
            L9f:
                java.util.concurrent.ExecutionException r12 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> Lf
                r12.<init>(r11)     // Catch: java.lang.Throwable -> Lf
                throw r12     // Catch: java.lang.Throwable -> Lf
            La5:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.pool.AbstractConnPool.FutureC12611b.get(long, java.util.concurrent.TimeUnit):org.apache.http.pool.PoolEntry");
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (!this.f74578b.compareAndSet(false, true)) {
                return false;
            }
            this.f74577a.set(true);
            AbstractConnPool.this.f74563a.lock();
            try {
                AbstractConnPool.this.f74564b.signalAll();
                AbstractConnPool.this.f74563a.unlock();
                FutureCallback futureCallback = this.f74580d;
                if (futureCallback != null) {
                    futureCallback.cancelled();
                }
                return true;
            } catch (Throwable th2) {
                AbstractConnPool.this.f74563a.unlock();
                throw th2;
            }
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f74577a.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f74578b.get();
        }
    }

    /* renamed from: org.apache.http.pool.AbstractConnPool$c */
    /* loaded from: classes6.dex */
    public class C12612c implements PoolEntryCallback {

        /* renamed from: a */
        public final /* synthetic */ long f74584a;

        public C12612c(long j) {
            this.f74584a = j;
        }

        @Override // org.apache.http.pool.PoolEntryCallback
        public void process(PoolEntry poolEntry) {
            if (poolEntry.getUpdated() <= this.f74584a) {
                poolEntry.close();
            }
        }
    }

    /* renamed from: org.apache.http.pool.AbstractConnPool$d */
    /* loaded from: classes6.dex */
    public class C12613d implements PoolEntryCallback {

        /* renamed from: a */
        public final /* synthetic */ long f74586a;

        public C12613d(long j) {
            this.f74586a = j;
        }

        @Override // org.apache.http.pool.PoolEntryCallback
        public void process(PoolEntry poolEntry) {
            if (poolEntry.isExpired(this.f74586a)) {
                poolEntry.close();
            }
        }
    }

    public AbstractConnPool(ConnFactory<T, C> connFactory, int i, int i2) {
        this.f74565c = (ConnFactory) Args.notNull(connFactory, "Connection factory");
        this.f74572j = Args.positive(i, "Max per route value");
        this.f74573k = Args.positive(i2, "Max total value");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f74563a = reentrantLock;
        this.f74564b = reentrantLock.newCondition();
        this.f74566d = new HashMap();
        this.f74567e = new HashSet();
        this.f74568f = new LinkedList();
        this.f74569g = new LinkedList();
        this.f74570h = new HashMap();
    }

    /* renamed from: i */
    public static Exception m24556i() {
        return new CancellationException("Operation aborted");
    }

    public void closeExpired() {
        enumAvailable(new C12613d(System.currentTimeMillis()));
    }

    public void closeIdle(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j);
        if (millis < 0) {
            millis = 0;
        }
        enumAvailable(new C12612c(System.currentTimeMillis() - millis));
    }

    public abstract E createEntry(T t, C c);

    public void enumAvailable(PoolEntryCallback<T, C> poolEntryCallback) {
        this.f74563a.lock();
        try {
            Iterator it = this.f74568f.iterator();
            while (it.hasNext()) {
                PoolEntry<T, C> poolEntry = (PoolEntry) it.next();
                poolEntryCallback.process(poolEntry);
                if (poolEntry.isClosed()) {
                    m24558g(poolEntry.getRoute()).m68136l(poolEntry);
                    it.remove();
                }
            }
            m24555j();
            this.f74563a.unlock();
        } catch (Throwable th2) {
            this.f74563a.unlock();
            throw th2;
        }
    }

    public void enumLeased(PoolEntryCallback<T, C> poolEntryCallback) {
        this.f74563a.lock();
        try {
            for (PoolEntry<T, C> poolEntry : this.f74567e) {
                poolEntryCallback.process(poolEntry);
            }
        } finally {
            this.f74563a.unlock();
        }
    }

    /* renamed from: f */
    public final int m24559f(Object obj) {
        Integer num = (Integer) this.f74570h.get(obj);
        if (num != null) {
            return num.intValue();
        }
        return this.f74572j;
    }

    /* renamed from: g */
    public final AbstractC17706Gy1 m24558g(Object obj) {
        AbstractC17706Gy1 abstractC17706Gy1 = (AbstractC17706Gy1) this.f74566d.get(obj);
        if (abstractC17706Gy1 == null) {
            C12610a c12610a = new C12610a(obj, obj);
            this.f74566d.put(obj, c12610a);
            return c12610a;
        }
        return abstractC17706Gy1;
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        this.f74563a.lock();
        try {
            return this.f74572j;
        } finally {
            this.f74563a.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxPerRoute(T t) {
        Args.notNull(t, "Route");
        this.f74563a.lock();
        try {
            return m24559f(t);
        } finally {
            this.f74563a.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxTotal() {
        this.f74563a.lock();
        try {
            return this.f74573k;
        } finally {
            this.f74563a.unlock();
        }
    }

    public Set<T> getRoutes() {
        this.f74563a.lock();
        try {
            return new HashSet(this.f74566d.keySet());
        } finally {
            this.f74563a.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getStats(T t) {
        Args.notNull(t, "Route");
        this.f74563a.lock();
        try {
            AbstractC17706Gy1 m24558g = m24558g(t);
            return new PoolStats(m24558g.m68140h(), m24558g.m68139i(), m24558g.m68143e(), m24559f(t));
        } finally {
            this.f74563a.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        this.f74563a.lock();
        try {
            return new PoolStats(this.f74567e.size(), this.f74569g.size(), this.f74568f.size(), this.f74573k);
        } finally {
            this.f74563a.unlock();
        }
    }

    public int getValidateAfterInactivity() {
        return this.f74574l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final PoolEntry m24557h(Object obj, Object obj2, long j, TimeUnit timeUnit, Future future) {
        Date date;
        PoolEntry m68142f;
        if (j > 0) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(j));
        } else {
            date = null;
        }
        this.f74563a.lock();
        while (true) {
            try {
                boolean z = true;
                Asserts.check(!this.f74571i, "Connection pool shut down");
                if (!future.isCancelled()) {
                    AbstractC17706Gy1 m24558g = m24558g(obj);
                    while (true) {
                        m68142f = m24558g.m68142f(obj2);
                        if (m68142f == null) {
                            break;
                        }
                        if (m68142f.isExpired(System.currentTimeMillis())) {
                            m68142f.close();
                        }
                        if (!m68142f.isClosed()) {
                            break;
                        }
                        this.f74568f.remove(m68142f);
                        m24558g.m68145c(m68142f, false);
                    }
                    if (m68142f != null) {
                        this.f74568f.remove(m68142f);
                        this.f74567e.add(m68142f);
                        onReuse(m68142f);
                        this.f74563a.unlock();
                        return m68142f;
                    }
                    int m24559f = m24559f(obj);
                    int max = Math.max(0, (m24558g.m68144d() + 1) - m24559f);
                    if (max > 0) {
                        for (int i = 0; i < max; i++) {
                            PoolEntry m68141g = m24558g.m68141g();
                            if (m68141g == null) {
                                break;
                            }
                            m68141g.close();
                            this.f74568f.remove(m68141g);
                            m24558g.m68136l(m68141g);
                        }
                    }
                    if (m24558g.m68144d() < m24559f) {
                        int max2 = Math.max(this.f74573k - this.f74567e.size(), 0);
                        if (max2 > 0) {
                            if (this.f74568f.size() > max2 - 1) {
                                PoolEntry poolEntry = (PoolEntry) this.f74568f.removeLast();
                                poolEntry.close();
                                m24558g(poolEntry.getRoute()).m68136l(poolEntry);
                            }
                            PoolEntry m68146a = m24558g.m68146a(this.f74565c.create(obj));
                            this.f74567e.add(m68146a);
                            this.f74563a.unlock();
                            return m68146a;
                        }
                    }
                    m24558g.m68137k(future);
                    this.f74569g.add(future);
                    if (date != null) {
                        z = this.f74564b.awaitUntil(date);
                    } else {
                        this.f74564b.await();
                    }
                    if (!future.isCancelled()) {
                        m24558g.m68134n(future);
                        this.f74569g.remove(future);
                        if (!z && date != null && date.getTime() <= System.currentTimeMillis()) {
                            throw new TimeoutException("Timeout waiting for connection");
                        }
                    } else {
                        throw new ExecutionException(m24556i());
                    }
                } else {
                    throw new ExecutionException(m24556i());
                }
            } catch (Throwable th2) {
                this.f74563a.unlock();
                throw th2;
            }
        }
    }

    public boolean isShutdown() {
        return this.f74571i;
    }

    /* renamed from: j */
    public final void m24555j() {
        Iterator it = this.f74566d.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC17706Gy1 abstractC17706Gy1 = (AbstractC17706Gy1) ((Map.Entry) it.next()).getValue();
            if (abstractC17706Gy1.m68139i() + abstractC17706Gy1.m68144d() == 0) {
                it.remove();
            }
        }
    }

    @Override // org.apache.http.pool.ConnPool
    public Future<E> lease(T t, Object obj, FutureCallback<E> futureCallback) {
        Args.notNull(t, "Route");
        Asserts.check(!this.f74571i, "Connection pool shut down");
        return new FutureC12611b(futureCallback, t, obj);
    }

    public void onLease(E e) {
    }

    public void onRelease(E e) {
    }

    public void onReuse(E e) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.http.pool.ConnPool
    public /* bridge */ /* synthetic */ void release(Object obj, boolean z) {
        release((AbstractConnPool<T, C, E>) ((PoolEntry) obj), z);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i) {
        Args.positive(i, "Max per route value");
        this.f74563a.lock();
        try {
            this.f74572j = i;
        } finally {
            this.f74563a.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxPerRoute(T t, int i) {
        Args.notNull(t, "Route");
        this.f74563a.lock();
        try {
            if (i > -1) {
                this.f74570h.put(t, Integer.valueOf(i));
            } else {
                this.f74570h.remove(t);
            }
            this.f74563a.unlock();
        } catch (Throwable th2) {
            this.f74563a.unlock();
            throw th2;
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxTotal(int i) {
        Args.positive(i, "Max value");
        this.f74563a.lock();
        try {
            this.f74573k = i;
        } finally {
            this.f74563a.unlock();
        }
    }

    public void setValidateAfterInactivity(int i) {
        this.f74574l = i;
    }

    public void shutdown() throws IOException {
        if (this.f74571i) {
            return;
        }
        this.f74571i = true;
        this.f74563a.lock();
        try {
            Iterator it = this.f74568f.iterator();
            while (it.hasNext()) {
                ((PoolEntry) it.next()).close();
            }
            for (PoolEntry poolEntry : this.f74567e) {
                poolEntry.close();
            }
            for (AbstractC17706Gy1 abstractC17706Gy1 : this.f74566d.values()) {
                abstractC17706Gy1.m68135m();
            }
            this.f74566d.clear();
            this.f74567e.clear();
            this.f74568f.clear();
            this.f74563a.unlock();
        } catch (Throwable th2) {
            this.f74563a.unlock();
            throw th2;
        }
    }

    public String toString() {
        this.f74563a.lock();
        try {
            return "[leased: " + this.f74567e + "][available: " + this.f74568f + "][pending: " + this.f74569g + "]";
        } finally {
            this.f74563a.unlock();
        }
    }

    public boolean validate(E e) {
        return true;
    }

    public void release(E e, boolean z) {
        this.f74563a.lock();
        try {
            if (this.f74567e.remove(e)) {
                AbstractC17706Gy1 m24558g = m24558g(e.getRoute());
                m24558g.m68145c(e, z);
                if (z && !this.f74571i) {
                    this.f74568f.addFirst(e);
                } else {
                    e.close();
                }
                onRelease(e);
                Future m68138j = m24558g.m68138j();
                if (m68138j != null) {
                    this.f74569g.remove(m68138j);
                } else {
                    m68138j = (Future) this.f74569g.poll();
                }
                if (m68138j != null) {
                    this.f74564b.signalAll();
                }
            }
            this.f74563a.unlock();
        } catch (Throwable th2) {
            this.f74563a.unlock();
            throw th2;
        }
    }

    public Future<E> lease(T t, Object obj) {
        return lease(t, obj, null);
    }
}
