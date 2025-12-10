package p000;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;

/* renamed from: iD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ExecutorC20347iD1 implements Executor {

    /* renamed from: a */
    public final Executor f62738a;

    /* renamed from: iD1$a */
    /* loaded from: classes3.dex */
    public static class RunnableC10451a implements Runnable {

        /* renamed from: a */
        public final Runnable f62739a;

        public RunnableC10451a(Runnable runnable) {
            this.f62739a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f62739a.run();
            } catch (Exception e) {
                Logging.m49113e("Executor", "Background execution failure.", e);
            }
        }
    }

    public ExecutorC20347iD1(Executor executor) {
        this.f62738a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f62738a.execute(new RunnableC10451a(runnable));
    }
}
