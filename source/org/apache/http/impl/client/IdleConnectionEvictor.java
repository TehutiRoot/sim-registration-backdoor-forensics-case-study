package org.apache.http.impl.client;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public final class IdleConnectionEvictor {

    /* renamed from: a */
    public final HttpClientConnectionManager f74155a;

    /* renamed from: b */
    public final ThreadFactory f74156b;

    /* renamed from: c */
    public final Thread f74157c;

    /* renamed from: d */
    public final long f74158d;

    /* renamed from: e */
    public final long f74159e;

    /* renamed from: f */
    public volatile Exception f74160f;

    /* renamed from: org.apache.http.impl.client.IdleConnectionEvictor$a */
    /* loaded from: classes6.dex */
    public class RunnableC12585a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ HttpClientConnectionManager f74161a;

        public RunnableC12585a(HttpClientConnectionManager httpClientConnectionManager) {
            this.f74161a = httpClientConnectionManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(IdleConnectionEvictor.this.f74158d);
                    this.f74161a.closeExpiredConnections();
                    if (IdleConnectionEvictor.this.f74159e > 0) {
                        this.f74161a.closeIdleConnections(IdleConnectionEvictor.this.f74159e, TimeUnit.MILLISECONDS);
                    }
                } catch (Exception e) {
                    IdleConnectionEvictor.this.f74160f = e;
                    return;
                }
            }
        }
    }

    /* renamed from: org.apache.http.impl.client.IdleConnectionEvictor$b */
    /* loaded from: classes6.dex */
    public static class ThreadFactoryC12586b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Connection evictor");
            thread.setDaemon(true);
            return thread;
        }
    }

    public IdleConnectionEvictor(HttpClientConnectionManager httpClientConnectionManager, ThreadFactory threadFactory, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        this.f74155a = (HttpClientConnectionManager) Args.notNull(httpClientConnectionManager, "Connection manager");
        threadFactory = threadFactory == null ? new ThreadFactoryC12586b() : threadFactory;
        this.f74156b = threadFactory;
        this.f74158d = timeUnit != null ? timeUnit.toMillis(j) : j;
        this.f74159e = timeUnit2 != null ? timeUnit2.toMillis(j2) : j2;
        this.f74157c = threadFactory.newThread(new RunnableC12585a(httpClientConnectionManager));
    }

    public void awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        Thread thread = this.f74157c;
        if (timeUnit == null) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        thread.join(timeUnit.toMillis(j));
    }

    public boolean isRunning() {
        return this.f74157c.isAlive();
    }

    public void shutdown() {
        this.f74157c.interrupt();
    }

    public void start() {
        this.f74157c.start();
    }

    public IdleConnectionEvictor(HttpClientConnectionManager httpClientConnectionManager, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        this(httpClientConnectionManager, null, j, timeUnit, j2, timeUnit2);
    }

    public IdleConnectionEvictor(HttpClientConnectionManager httpClientConnectionManager, long j, TimeUnit timeUnit) {
        this(httpClientConnectionManager, null, j > 0 ? j : 5L, timeUnit != null ? timeUnit : TimeUnit.SECONDS, j, timeUnit);
    }
}
