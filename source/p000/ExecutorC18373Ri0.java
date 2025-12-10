package p000;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* renamed from: Ri0 */
/* loaded from: classes4.dex */
public class ExecutorC18373Ri0 implements Executor {

    /* renamed from: a */
    public final Executor f5404a;

    /* renamed from: b */
    public final Semaphore f5405b;

    /* renamed from: c */
    public final LinkedBlockingQueue f5406c = new LinkedBlockingQueue();

    public ExecutorC18373Ri0(Executor executor, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "concurrency must be positive.");
        this.f5404a = executor;
        this.f5405b = new Semaphore(i, true);
    }

    /* renamed from: a */
    public static /* synthetic */ void m66424a(ExecutorC18373Ri0 executorC18373Ri0, Runnable runnable) {
        executorC18373Ri0.m66422d(runnable);
    }

    /* renamed from: c */
    public final Runnable m66423c(final Runnable runnable) {
        return new Runnable() { // from class: Qi0
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC18373Ri0.m66424a(ExecutorC18373Ri0.this, runnable);
            }
        };
    }

    /* renamed from: d */
    public final /* synthetic */ void m66422d(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f5405b.release();
            m66421e();
        }
    }

    /* renamed from: e */
    public final void m66421e() {
        while (this.f5405b.tryAcquire()) {
            Runnable runnable = (Runnable) this.f5406c.poll();
            if (runnable != null) {
                this.f5404a.execute(m66423c(runnable));
            } else {
                this.f5405b.release();
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5406c.offer(runnable);
        m66421e();
    }
}
