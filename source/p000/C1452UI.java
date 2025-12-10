package p000;

import com.google.common.util.concurrent.AbstractListeningExecutorService;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: UI */
/* loaded from: classes4.dex */
public final class C1452UI extends AbstractListeningExecutorService {

    /* renamed from: a */
    public final Object f6276a = new Object();

    /* renamed from: b */
    public int f6277b = 0;

    /* renamed from: c */
    public boolean f6278c = false;

    /* renamed from: a */
    public final void m66078a() {
        synchronized (this.f6276a) {
            try {
                int i = this.f6277b - 1;
                this.f6277b = i;
                if (i == 0) {
                    this.f6276a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.f6276a) {
            while (true) {
                try {
                    if (this.f6278c && this.f6277b == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f6276a, nanos);
                    nanos -= System.nanoTime() - nanoTime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m66077c() {
        synchronized (this.f6276a) {
            try {
                if (!this.f6278c) {
                    this.f6277b++;
                } else {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m66077c();
        try {
            runnable.run();
        } finally {
            m66078a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean z;
        synchronized (this.f6276a) {
            z = this.f6278c;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean z;
        synchronized (this.f6276a) {
            try {
                if (this.f6278c && this.f6277b == 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.f6276a) {
            try {
                this.f6278c = true;
                if (this.f6277b == 0) {
                    this.f6276a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
