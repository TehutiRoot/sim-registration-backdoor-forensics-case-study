package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.C5816e;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes3.dex */
public class C5810d implements DecodeJob.InterfaceC5770b, FactoryPools.Poolable {

    /* renamed from: z */
    public static final C5813c f42072z = new C5813c();

    /* renamed from: a */
    public final C5815e f42073a;

    /* renamed from: b */
    public final StateVerifier f42074b;

    /* renamed from: c */
    public final C5816e.InterfaceC5817a f42075c;

    /* renamed from: d */
    public final Pools.Pool f42076d;

    /* renamed from: e */
    public final C5813c f42077e;

    /* renamed from: f */
    public final InterfaceC17126yS f42078f;

    /* renamed from: g */
    public final GlideExecutor f42079g;

    /* renamed from: h */
    public final GlideExecutor f42080h;

    /* renamed from: i */
    public final GlideExecutor f42081i;

    /* renamed from: j */
    public final GlideExecutor f42082j;

    /* renamed from: k */
    public final AtomicInteger f42083k;

    /* renamed from: l */
    public Key f42084l;

    /* renamed from: m */
    public boolean f42085m;

    /* renamed from: n */
    public boolean f42086n;

    /* renamed from: o */
    public boolean f42087o;

    /* renamed from: p */
    public boolean f42088p;

    /* renamed from: q */
    public Resource f42089q;

    /* renamed from: r */
    public DataSource f42090r;

    /* renamed from: s */
    public boolean f42091s;

    /* renamed from: t */
    public GlideException f42092t;

    /* renamed from: u */
    public boolean f42093u;

    /* renamed from: v */
    public C5816e f42094v;

    /* renamed from: w */
    public DecodeJob f42095w;

    /* renamed from: x */
    public volatile boolean f42096x;

    /* renamed from: y */
    public boolean f42097y;

    /* renamed from: com.bumptech.glide.load.engine.d$a */
    /* loaded from: classes3.dex */
    public class RunnableC5811a implements Runnable {

        /* renamed from: a */
        public final ResourceCallback f42098a;

        public RunnableC5811a(ResourceCallback resourceCallback) {
            this.f42098a = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f42098a.getLock()) {
                synchronized (C5810d.this) {
                    if (C5810d.this.f42073a.m50335b(this.f42098a)) {
                        C5810d.this.m50351c(this.f42098a);
                    }
                    C5810d.this.m50348f();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.d$b */
    /* loaded from: classes3.dex */
    public class RunnableC5812b implements Runnable {

        /* renamed from: a */
        public final ResourceCallback f42100a;

        public RunnableC5812b(ResourceCallback resourceCallback) {
            this.f42100a = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f42100a.getLock()) {
                synchronized (C5810d.this) {
                    if (C5810d.this.f42073a.m50335b(this.f42100a)) {
                        C5810d.this.f42094v.m50331a();
                        C5810d.this.m50350d(this.f42100a);
                        C5810d.this.m50339o(this.f42100a);
                    }
                    C5810d.this.m50348f();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.d$c */
    /* loaded from: classes3.dex */
    public static class C5813c {
        /* renamed from: a */
        public C5816e m50337a(Resource resource, boolean z, Key key, C5816e.InterfaceC5817a interfaceC5817a) {
            return new C5816e(resource, z, true, key, interfaceC5817a);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.d$d */
    /* loaded from: classes3.dex */
    public static final class C5814d {

        /* renamed from: a */
        public final ResourceCallback f42102a;

        /* renamed from: b */
        public final Executor f42103b;

        public C5814d(ResourceCallback resourceCallback, Executor executor) {
            this.f42102a = resourceCallback;
            this.f42103b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5814d) {
                return this.f42102a.equals(((C5814d) obj).f42102a);
            }
            return false;
        }

        public int hashCode() {
            return this.f42102a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.d$e */
    /* loaded from: classes3.dex */
    public static final class C5815e implements Iterable {

        /* renamed from: a */
        public final List f42104a;

        public C5815e() {
            this(new ArrayList(2));
        }

        /* renamed from: d */
        public static C5814d m50333d(ResourceCallback resourceCallback) {
            return new C5814d(resourceCallback, Executors.directExecutor());
        }

        /* renamed from: a */
        public void m50336a(ResourceCallback resourceCallback, Executor executor) {
            this.f42104a.add(new C5814d(resourceCallback, executor));
        }

        /* renamed from: b */
        public boolean m50335b(ResourceCallback resourceCallback) {
            return this.f42104a.contains(m50333d(resourceCallback));
        }

        /* renamed from: c */
        public C5815e m50334c() {
            return new C5815e(new ArrayList(this.f42104a));
        }

        public void clear() {
            this.f42104a.clear();
        }

        /* renamed from: e */
        public void m50332e(ResourceCallback resourceCallback) {
            this.f42104a.remove(m50333d(resourceCallback));
        }

        public boolean isEmpty() {
            return this.f42104a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f42104a.iterator();
        }

        public int size() {
            return this.f42104a.size();
        }

        public C5815e(List list) {
            this.f42104a = list;
        }
    }

    public C5810d(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, InterfaceC17126yS interfaceC17126yS, C5816e.InterfaceC5817a interfaceC5817a, Pools.Pool pool) {
        this(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, interfaceC17126yS, interfaceC5817a, pool, f42072z);
    }

    /* renamed from: n */
    private synchronized void m50340n() {
        if (this.f42084l != null) {
            this.f42073a.clear();
            this.f42084l = null;
            this.f42094v = null;
            this.f42089q = null;
            this.f42093u = false;
            this.f42096x = false;
            this.f42091s = false;
            this.f42097y = false;
            this.f42095w.m50466u(false);
            this.f42095w = null;
            this.f42092t = null;
            this.f42090r = null;
            this.f42076d.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5770b
    /* renamed from: a */
    public void mo50353a(DecodeJob decodeJob) {
        m50347g().execute(decodeJob);
    }

    /* renamed from: b */
    public synchronized void m50352b(ResourceCallback resourceCallback, Executor executor) {
        try {
            this.f42074b.throwIfRecycled();
            this.f42073a.m50336a(resourceCallback, executor);
            if (this.f42091s) {
                m50346h(1);
                executor.execute(new RunnableC5812b(resourceCallback));
            } else if (this.f42093u) {
                m50346h(1);
                executor.execute(new RunnableC5811a(resourceCallback));
            } else {
                Preconditions.checkArgument(!this.f42096x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public void m50351c(ResourceCallback resourceCallback) {
        try {
            resourceCallback.onLoadFailed(this.f42092t);
        } catch (Throwable th2) {
            throw new CallbackException(th2);
        }
    }

    /* renamed from: d */
    public void m50350d(ResourceCallback resourceCallback) {
        try {
            resourceCallback.onResourceReady(this.f42094v, this.f42090r, this.f42097y);
        } catch (Throwable th2) {
            throw new CallbackException(th2);
        }
    }

    /* renamed from: e */
    public void m50349e() {
        if (m50344j()) {
            return;
        }
        this.f42096x = true;
        this.f42095w.m50484a();
        this.f42078f.onEngineJobCancelled(this, this.f42084l);
    }

    /* renamed from: f */
    public void m50348f() {
        boolean z;
        C5816e c5816e;
        synchronized (this) {
            try {
                this.f42074b.throwIfRecycled();
                Preconditions.checkArgument(m50344j(), "Not yet complete!");
                int decrementAndGet = this.f42083k.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    c5816e = this.f42094v;
                    m50340n();
                } else {
                    c5816e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c5816e != null) {
            c5816e.m50328d();
        }
    }

    /* renamed from: g */
    public final GlideExecutor m50347g() {
        if (this.f42086n) {
            return this.f42081i;
        }
        if (this.f42087o) {
            return this.f42082j;
        }
        return this.f42080h;
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public StateVerifier getVerifier() {
        return this.f42074b;
    }

    /* renamed from: h */
    public synchronized void m50346h(int i) {
        C5816e c5816e;
        Preconditions.checkArgument(m50344j(), "Not yet complete!");
        if (this.f42083k.getAndAdd(i) == 0 && (c5816e = this.f42094v) != null) {
            c5816e.m50331a();
        }
    }

    /* renamed from: i */
    public synchronized C5810d m50345i(Key key, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f42084l = key;
        this.f42085m = z;
        this.f42086n = z2;
        this.f42087o = z3;
        this.f42088p = z4;
        return this;
    }

    /* renamed from: j */
    public final boolean m50344j() {
        if (!this.f42093u && !this.f42091s && !this.f42096x) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void m50343k() {
        synchronized (this) {
            try {
                this.f42074b.throwIfRecycled();
                if (this.f42096x) {
                    m50340n();
                } else if (!this.f42073a.isEmpty()) {
                    if (!this.f42093u) {
                        this.f42093u = true;
                        Key key = this.f42084l;
                        C5815e m50334c = this.f42073a.m50334c();
                        m50346h(m50334c.size() + 1);
                        this.f42078f.onEngineJobComplete(this, key, null);
                        Iterator it = m50334c.iterator();
                        while (it.hasNext()) {
                            C5814d c5814d = (C5814d) it.next();
                            c5814d.f42103b.execute(new RunnableC5811a(c5814d.f42102a));
                        }
                        m50348f();
                        return;
                    }
                    throw new IllegalStateException("Already failed once");
                } else {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public void m50342l() {
        synchronized (this) {
            try {
                this.f42074b.throwIfRecycled();
                if (this.f42096x) {
                    this.f42089q.recycle();
                    m50340n();
                } else if (!this.f42073a.isEmpty()) {
                    if (!this.f42091s) {
                        this.f42094v = this.f42077e.m50337a(this.f42089q, this.f42085m, this.f42084l, this.f42075c);
                        this.f42091s = true;
                        C5815e m50334c = this.f42073a.m50334c();
                        m50346h(m50334c.size() + 1);
                        this.f42078f.onEngineJobComplete(this, this.f42084l, this.f42094v);
                        Iterator it = m50334c.iterator();
                        while (it.hasNext()) {
                            C5814d c5814d = (C5814d) it.next();
                            c5814d.f42103b.execute(new RunnableC5812b(c5814d.f42102a));
                        }
                        m50348f();
                        return;
                    }
                    throw new IllegalStateException("Already have resource");
                } else {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public boolean m50341m() {
        return this.f42088p;
    }

    /* renamed from: o */
    public synchronized void m50339o(ResourceCallback resourceCallback) {
        try {
            this.f42074b.throwIfRecycled();
            this.f42073a.m50332e(resourceCallback);
            if (this.f42073a.isEmpty()) {
                m50349e();
                if (!this.f42091s) {
                    if (this.f42093u) {
                    }
                }
                if (this.f42083k.get() == 0) {
                    m50340n();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5770b
    public void onLoadFailed(GlideException glideException) {
        synchronized (this) {
            this.f42092t = glideException;
        }
        m50343k();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5770b
    public void onResourceReady(Resource resource, DataSource dataSource, boolean z) {
        synchronized (this) {
            this.f42089q = resource;
            this.f42090r = dataSource;
            this.f42097y = z;
        }
        m50342l();
    }

    /* renamed from: p */
    public synchronized void m50338p(DecodeJob decodeJob) {
        GlideExecutor m50347g;
        try {
            this.f42095w = decodeJob;
            if (decodeJob.m50485B()) {
                m50347g = this.f42079g;
            } else {
                m50347g = m50347g();
            }
            m50347g.execute(decodeJob);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C5810d(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, InterfaceC17126yS interfaceC17126yS, C5816e.InterfaceC5817a interfaceC5817a, Pools.Pool pool, C5813c c5813c) {
        this.f42073a = new C5815e();
        this.f42074b = StateVerifier.newInstance();
        this.f42083k = new AtomicInteger();
        this.f42079g = glideExecutor;
        this.f42080h = glideExecutor2;
        this.f42081i = glideExecutor3;
        this.f42082j = glideExecutor4;
        this.f42078f = interfaceC17126yS;
        this.f42075c = interfaceC5817a;
        this.f42076d = pool;
        this.f42077e = c5813c;
    }
}
