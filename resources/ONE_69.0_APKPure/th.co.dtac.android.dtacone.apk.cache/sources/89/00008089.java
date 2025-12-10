package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.C5805e;
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
public final class C5776a {

    /* renamed from: a */
    public final boolean f41975a;

    /* renamed from: b */
    public final Executor f41976b;

    /* renamed from: c */
    public final Map f41977c;

    /* renamed from: d */
    public final ReferenceQueue f41978d;

    /* renamed from: e */
    public C5805e.InterfaceC5806a f41979e;

    /* renamed from: f */
    public volatile boolean f41980f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    /* loaded from: classes3.dex */
    public class ThreadFactoryC5777a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        /* loaded from: classes3.dex */
        public class RunnableC5778a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f41981a;

            public RunnableC5778a(Runnable runnable) {
                this.f41981a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f41981a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC5778a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    /* loaded from: classes3.dex */
    public class RunnableC5779b implements Runnable {
        public RunnableC5779b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5776a.this.m50430b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    /* loaded from: classes3.dex */
    public static final class C5780c extends WeakReference {

        /* renamed from: a */
        public final Key f41984a;

        /* renamed from: b */
        public final boolean f41985b;

        /* renamed from: c */
        public Resource f41986c;

        public C5780c(Key key, C5805e c5805e, ReferenceQueue referenceQueue, boolean z) {
            super(c5805e, referenceQueue);
            Resource resource;
            this.f41984a = (Key) Preconditions.checkNotNull(key);
            if (c5805e.m50326c() && z) {
                resource = (Resource) Preconditions.checkNotNull(c5805e.m50327b());
            } else {
                resource = null;
            }
            this.f41986c = resource;
            this.f41985b = c5805e.m50326c();
        }

        /* renamed from: a */
        public void m50424a() {
            this.f41986c = null;
            clear();
        }
    }

    public C5776a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC5777a()));
    }

    /* renamed from: a */
    public synchronized void m50431a(Key key, C5805e c5805e) {
        C5780c c5780c = (C5780c) this.f41977c.put(key, new C5780c(key, c5805e, this.f41978d, this.f41975a));
        if (c5780c != null) {
            c5780c.m50424a();
        }
    }

    /* renamed from: b */
    public void m50430b() {
        while (!this.f41980f) {
            try {
                m50429c((C5780c) this.f41978d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m50429c(C5780c c5780c) {
        Resource resource;
        synchronized (this) {
            this.f41977c.remove(c5780c.f41984a);
            if (c5780c.f41985b && (resource = c5780c.f41986c) != null) {
                this.f41979e.onResourceReleased(c5780c.f41984a, new C5805e(resource, true, false, c5780c.f41984a, this.f41979e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m50428d(Key key) {
        C5780c c5780c = (C5780c) this.f41977c.remove(key);
        if (c5780c != null) {
            c5780c.m50424a();
        }
    }

    /* renamed from: e */
    public synchronized C5805e m50427e(Key key) {
        C5780c c5780c = (C5780c) this.f41977c.get(key);
        if (c5780c == null) {
            return null;
        }
        C5805e c5805e = (C5805e) c5780c.get();
        if (c5805e == null) {
            m50429c(c5780c);
        }
        return c5805e;
    }

    /* renamed from: f */
    public void m50426f(C5805e.InterfaceC5806a interfaceC5806a) {
        synchronized (interfaceC5806a) {
            synchronized (this) {
                this.f41979e = interfaceC5806a;
            }
        }
    }

    /* renamed from: g */
    public void m50425g() {
        this.f41980f = true;
        Executor executor = this.f41976b;
        if (executor instanceof ExecutorService) {
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination((ExecutorService) executor);
        }
    }

    public C5776a(boolean z, Executor executor) {
        this.f41977c = new HashMap();
        this.f41978d = new ReferenceQueue();
        this.f41975a = z;
        this.f41976b = executor;
        executor.execute(new RunnableC5779b());
    }
}