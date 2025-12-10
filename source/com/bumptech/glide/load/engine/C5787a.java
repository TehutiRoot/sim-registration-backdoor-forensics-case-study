package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.C5816e;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes3.dex */
public final class C5787a {

    /* renamed from: a */
    public final boolean f41963a;

    /* renamed from: b */
    public final Executor f41964b;

    /* renamed from: c */
    public final Map f41965c;

    /* renamed from: d */
    public final ReferenceQueue f41966d;

    /* renamed from: e */
    public C5816e.InterfaceC5817a f41967e;

    /* renamed from: f */
    public volatile boolean f41968f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    /* loaded from: classes3.dex */
    public class ThreadFactoryC5788a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        /* loaded from: classes3.dex */
        public class RunnableC5789a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f41969a;

            public RunnableC5789a(Runnable runnable) {
                this.f41969a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f41969a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC5789a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    /* loaded from: classes3.dex */
    public class RunnableC5790b implements Runnable {
        public RunnableC5790b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5787a.this.m50433b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    /* loaded from: classes3.dex */
    public static final class C5791c extends WeakReference {

        /* renamed from: a */
        public final Key f41972a;

        /* renamed from: b */
        public final boolean f41973b;

        /* renamed from: c */
        public Resource f41974c;

        public C5791c(Key key, C5816e c5816e, ReferenceQueue referenceQueue, boolean z) {
            super(c5816e, referenceQueue);
            Resource resource;
            this.f41972a = (Key) Preconditions.checkNotNull(key);
            if (c5816e.m50329c() && z) {
                resource = (Resource) Preconditions.checkNotNull(c5816e.m50330b());
            } else {
                resource = null;
            }
            this.f41974c = resource;
            this.f41973b = c5816e.m50329c();
        }

        /* renamed from: a */
        public void m50427a() {
            this.f41974c = null;
            clear();
        }
    }

    public C5787a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC5788a()));
    }

    /* renamed from: a */
    public synchronized void m50434a(Key key, C5816e c5816e) {
        C5791c c5791c = (C5791c) this.f41965c.put(key, new C5791c(key, c5816e, this.f41966d, this.f41963a));
        if (c5791c != null) {
            c5791c.m50427a();
        }
    }

    /* renamed from: b */
    public void m50433b() {
        while (!this.f41968f) {
            try {
                m50432c((C5791c) this.f41966d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m50432c(C5791c c5791c) {
        Resource resource;
        synchronized (this) {
            this.f41965c.remove(c5791c.f41972a);
            if (c5791c.f41973b && (resource = c5791c.f41974c) != null) {
                this.f41967e.onResourceReleased(c5791c.f41972a, new C5816e(resource, true, false, c5791c.f41972a, this.f41967e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m50431d(Key key) {
        C5791c c5791c = (C5791c) this.f41965c.remove(key);
        if (c5791c != null) {
            c5791c.m50427a();
        }
    }

    /* renamed from: e */
    public synchronized C5816e m50430e(Key key) {
        C5791c c5791c = (C5791c) this.f41965c.get(key);
        if (c5791c == null) {
            return null;
        }
        C5816e c5816e = (C5816e) c5791c.get();
        if (c5816e == null) {
            m50432c(c5791c);
        }
        return c5816e;
    }

    /* renamed from: f */
    public void m50429f(C5816e.InterfaceC5817a interfaceC5817a) {
        synchronized (interfaceC5817a) {
            synchronized (this) {
                this.f41967e = interfaceC5817a;
            }
        }
    }

    /* renamed from: g */
    public void m50428g() {
        this.f41968f = true;
        Executor executor = this.f41964b;
        if (executor instanceof ExecutorService) {
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination((ExecutorService) executor);
        }
    }

    public C5787a(boolean z, Executor executor) {
        this.f41965c = new HashMap();
        this.f41966d = new ReferenceQueue();
        this.f41963a = z;
        this.f41964b = executor;
        executor.execute(new RunnableC5790b());
    }
}
