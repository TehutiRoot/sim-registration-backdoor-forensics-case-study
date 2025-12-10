package p000;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* renamed from: Xi0 */
/* loaded from: classes4.dex */
public class ExecutorC18803Xi0 implements Executor {

    /* renamed from: a */
    public final Executor f7633a;

    /* renamed from: b */
    public final Semaphore f7634b;

    /* renamed from: c */
    public final LinkedBlockingQueue f7635c = new LinkedBlockingQueue();

    public ExecutorC18803Xi0(Executor executor, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "concurrency must be positive.");
        this.f7633a = executor;
        this.f7634b = new Semaphore(i, true);
    }

    /* renamed from: a */
    public static /* synthetic */ void m65580a(ExecutorC18803Xi0 executorC18803Xi0, Runnable runnable) {
        executorC18803Xi0.m65578d(runnable);
    }

    /* renamed from: c */
    public final Runnable m65579c(final Runnable runnable) {
        return new Runnable() { // from class: Wi0
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC18803Xi0.m65580a(ExecutorC18803Xi0.this, runnable);
            }
        };
    }

    /* renamed from: d */
    public final /* synthetic */ void m65578d(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f7634b.release();
            m65577e();
        }
    }

    /* renamed from: e */
    public final void m65577e() {
        while (this.f7634b.tryAcquire()) {
            Runnable runnable = (Runnable) this.f7635c.poll();
            if (runnable != null) {
                this.f7633a.execute(m65579c(runnable));
            } else {
                this.f7634b.release();
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f7635c.offer(runnable);
        m65577e();
    }
}