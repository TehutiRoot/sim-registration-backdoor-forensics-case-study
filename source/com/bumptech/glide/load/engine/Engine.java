package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C5816e;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class Engine implements InterfaceC17126yS, MemoryCache.ResourceRemovedListener, C5816e.InterfaceC5817a {

    /* renamed from: i */
    public static final boolean f41931i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C18431Sg0 f41932a;

    /* renamed from: b */
    public final C0031AS f41933b;

    /* renamed from: c */
    public final MemoryCache f41934c;

    /* renamed from: d */
    public final C5783b f41935d;

    /* renamed from: e */
    public final C17576Ex1 f41936e;

    /* renamed from: f */
    public final C5785c f41937f;

    /* renamed from: g */
    public final C5781a f41938g;

    /* renamed from: h */
    public final C5787a f41939h;

    /* loaded from: classes3.dex */
    public class LoadStatus {

        /* renamed from: a */
        public final C5810d f41940a;

        /* renamed from: b */
        public final ResourceCallback f41941b;

        public LoadStatus(ResourceCallback resourceCallback, C5810d c5810d) {
            this.f41941b = resourceCallback;
            this.f41940a = c5810d;
        }

        public void cancel() {
            synchronized (Engine.this) {
                this.f41940a.m50339o(this.f41941b);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.Engine$a */
    /* loaded from: classes3.dex */
    public static class C5781a {

        /* renamed from: a */
        public final DecodeJob.InterfaceC5773e f41943a;

        /* renamed from: b */
        public final Pools.Pool f41944b = FactoryPools.threadSafe(150, new C5782a());

        /* renamed from: c */
        public int f41945c;

        /* renamed from: com.bumptech.glide.load.engine.Engine$a$a */
        /* loaded from: classes3.dex */
        public class C5782a implements FactoryPools.Factory {
            public C5782a() {
            }

            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            /* renamed from: a */
            public DecodeJob create() {
                C5781a c5781a = C5781a.this;
                return new DecodeJob(c5781a.f41943a, c5781a.f41944b);
            }
        }

        public C5781a(DecodeJob.InterfaceC5773e interfaceC5773e) {
            this.f41943a = interfaceC5773e;
        }

        /* renamed from: a */
        public DecodeJob m50442a(GlideContext glideContext, Object obj, C17195zS c17195zS, Key key, int i, int i2, Class cls, Class cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map map, boolean z, boolean z2, boolean z3, Options options, DecodeJob.InterfaceC5770b interfaceC5770b) {
            DecodeJob decodeJob = (DecodeJob) Preconditions.checkNotNull((DecodeJob) this.f41944b.acquire());
            int i3 = this.f41945c;
            this.f41945c = i3 + 1;
            return decodeJob.m50475l(glideContext, obj, c17195zS, key, i, i2, cls, cls2, priority, diskCacheStrategy, map, z, z2, z3, options, interfaceC5770b, i3);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.Engine$b */
    /* loaded from: classes3.dex */
    public static class C5783b {

        /* renamed from: a */
        public final GlideExecutor f41947a;

        /* renamed from: b */
        public final GlideExecutor f41948b;

        /* renamed from: c */
        public final GlideExecutor f41949c;

        /* renamed from: d */
        public final GlideExecutor f41950d;

        /* renamed from: e */
        public final InterfaceC17126yS f41951e;

        /* renamed from: f */
        public final C5816e.InterfaceC5817a f41952f;

        /* renamed from: g */
        public final Pools.Pool f41953g = FactoryPools.threadSafe(150, new C5784a());

        /* renamed from: com.bumptech.glide.load.engine.Engine$b$a */
        /* loaded from: classes3.dex */
        public class C5784a implements FactoryPools.Factory {
            public C5784a() {
            }

            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            /* renamed from: a */
            public C5810d create() {
                C5783b c5783b = C5783b.this;
                return new C5810d(c5783b.f41947a, c5783b.f41948b, c5783b.f41949c, c5783b.f41950d, c5783b.f41951e, c5783b.f41952f, c5783b.f41953g);
            }
        }

        public C5783b(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, InterfaceC17126yS interfaceC17126yS, C5816e.InterfaceC5817a interfaceC5817a) {
            this.f41947a = glideExecutor;
            this.f41948b = glideExecutor2;
            this.f41949c = glideExecutor3;
            this.f41950d = glideExecutor4;
            this.f41951e = interfaceC17126yS;
            this.f41952f = interfaceC5817a;
        }

        /* renamed from: a */
        public C5810d m50440a(Key key, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C5810d) Preconditions.checkNotNull((C5810d) this.f41953g.acquire())).m50345i(key, z, z2, z3, z4);
        }

        /* renamed from: b */
        public void m50439b() {
            Executors.shutdownAndAwaitTermination(this.f41947a);
            Executors.shutdownAndAwaitTermination(this.f41948b);
            Executors.shutdownAndAwaitTermination(this.f41949c);
            Executors.shutdownAndAwaitTermination(this.f41950d);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.Engine$c */
    /* loaded from: classes3.dex */
    public static class C5785c implements DecodeJob.InterfaceC5773e {

        /* renamed from: a */
        public final DiskCache.Factory f41955a;

        /* renamed from: b */
        public volatile DiskCache f41956b;

        public C5785c(DiskCache.Factory factory) {
            this.f41955a = factory;
        }

        /* renamed from: a */
        public synchronized void m50437a() {
            if (this.f41956b == null) {
                return;
            }
            this.f41956b.clear();
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5773e
        public DiskCache getDiskCache() {
            if (this.f41956b == null) {
                synchronized (this) {
                    try {
                        if (this.f41956b == null) {
                            this.f41956b = this.f41955a.build();
                        }
                        if (this.f41956b == null) {
                            this.f41956b = new DiskCacheAdapter();
                        }
                    } finally {
                    }
                }
            }
            return this.f41956b;
        }
    }

    public Engine(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, boolean z) {
        this(memoryCache, factory, glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, null, null, null, null, null, null, z);
    }

    /* renamed from: e */
    public static void m50444e(String str, long j, Key key) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(LogTime.getElapsedMillis(j));
        sb.append("ms, key: ");
        sb.append(key);
    }

    /* renamed from: a */
    public final C5816e m50448a(Key key) {
        Resource<?> remove = this.f41934c.remove(key);
        if (remove == null) {
            return null;
        }
        if (remove instanceof C5816e) {
            return (C5816e) remove;
        }
        return new C5816e(remove, true, true, key, this);
    }

    /* renamed from: b */
    public final C5816e m50447b(Key key) {
        C5816e m50430e = this.f41939h.m50430e(key);
        if (m50430e != null) {
            m50430e.m50331a();
        }
        return m50430e;
    }

    /* renamed from: c */
    public final C5816e m50446c(Key key) {
        C5816e m50448a = m50448a(key);
        if (m50448a != null) {
            m50448a.m50331a();
            this.f41939h.m50434a(key, m50448a);
        }
        return m50448a;
    }

    public void clearDiskCache() {
        this.f41937f.getDiskCache().clear();
    }

    /* renamed from: d */
    public final C5816e m50445d(C17195zS c17195zS, boolean z, long j) {
        if (!z) {
            return null;
        }
        C5816e m50447b = m50447b(c17195zS);
        if (m50447b != null) {
            if (f41931i) {
                m50444e("Loaded resource from active resources", j, c17195zS);
            }
            return m50447b;
        }
        C5816e m50446c = m50446c(c17195zS);
        if (m50446c == null) {
            return null;
        }
        if (f41931i) {
            m50444e("Loaded resource from cache", j, c17195zS);
        }
        return m50446c;
    }

    /* renamed from: f */
    public final LoadStatus m50443f(GlideContext glideContext, Object obj, Key key, int i, int i2, Class cls, Class cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map map, boolean z, boolean z2, Options options, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback, Executor executor, C17195zS c17195zS, long j) {
        C5810d m66308a = this.f41932a.m66308a(c17195zS, z6);
        if (m66308a != null) {
            m66308a.m50352b(resourceCallback, executor);
            if (f41931i) {
                m50444e("Added to existing load", j, c17195zS);
            }
            return new LoadStatus(resourceCallback, m66308a);
        }
        C5810d m50440a = this.f41935d.m50440a(c17195zS, z3, z4, z5, z6);
        DecodeJob m50442a = this.f41938g.m50442a(glideContext, obj, c17195zS, key, i, i2, cls, cls2, priority, diskCacheStrategy, map, z, z2, z6, options, m50440a);
        this.f41932a.m66306c(c17195zS, m50440a);
        m50440a.m50352b(resourceCallback, executor);
        m50440a.m50338p(m50442a);
        if (f41931i) {
            m50444e("Started new load", j, c17195zS);
        }
        return new LoadStatus(resourceCallback, m50440a);
    }

    public <R> LoadStatus load(GlideContext glideContext, Object obj, Key key, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, Options options, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback, Executor executor) {
        long logTime = f41931i ? LogTime.getLogTime() : 0L;
        C17195zS m69101a = this.f41933b.m69101a(obj, key, i, i2, map, cls, cls2, options);
        synchronized (this) {
            try {
                C5816e m50445d = m50445d(m69101a, z3, logTime);
                if (m50445d == null) {
                    return m50443f(glideContext, obj, key, i, i2, cls, cls2, priority, diskCacheStrategy, map, z, z2, options, z3, z4, z5, z6, resourceCallback, executor, m69101a, logTime);
                }
                resourceCallback.onResourceReady(m50445d, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC17126yS
    public synchronized void onEngineJobCancelled(C5810d c5810d, Key key) {
        this.f41932a.m66305d(key, c5810d);
    }

    @Override // p000.InterfaceC17126yS
    public synchronized void onEngineJobComplete(C5810d c5810d, Key key, C5816e c5816e) {
        if (c5816e != null) {
            try {
                if (c5816e.m50329c()) {
                    this.f41939h.m50434a(key, c5816e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f41932a.m66305d(key, c5810d);
    }

    @Override // com.bumptech.glide.load.engine.C5816e.InterfaceC5817a
    public void onResourceReleased(Key key, C5816e c5816e) {
        this.f41939h.m50431d(key);
        if (c5816e.m50329c()) {
            this.f41934c.put(key, c5816e);
        } else {
            this.f41936e.m68439a(c5816e, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener
    public void onResourceRemoved(@NonNull Resource<?> resource) {
        this.f41936e.m68439a(resource, true);
    }

    public void release(Resource<?> resource) {
        if (resource instanceof C5816e) {
            ((C5816e) resource).m50328d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @VisibleForTesting
    public void shutdown() {
        this.f41935d.m50439b();
        this.f41937f.m50437a();
        this.f41939h.m50428g();
    }

    public Engine(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, C18431Sg0 c18431Sg0, C0031AS c0031as, C5787a c5787a, C5783b c5783b, C5781a c5781a, C17576Ex1 c17576Ex1, boolean z) {
        this.f41934c = memoryCache;
        C5785c c5785c = new C5785c(factory);
        this.f41937f = c5785c;
        C5787a c5787a2 = c5787a == null ? new C5787a(z) : c5787a;
        this.f41939h = c5787a2;
        c5787a2.m50429f(this);
        this.f41933b = c0031as == null ? new C0031AS() : c0031as;
        this.f41932a = c18431Sg0 == null ? new C18431Sg0() : c18431Sg0;
        this.f41935d = c5783b == null ? new C5783b(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this, this) : c5783b;
        this.f41938g = c5781a == null ? new C5781a(c5785c) : c5781a;
        this.f41936e = c17576Ex1 == null ? new C17576Ex1() : c17576Ex1;
        memoryCache.setResourceRemovedListener(this);
    }
}
