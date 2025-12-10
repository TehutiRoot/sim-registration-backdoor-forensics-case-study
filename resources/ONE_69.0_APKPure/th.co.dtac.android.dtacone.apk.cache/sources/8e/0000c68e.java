package p000;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;

/* renamed from: fE1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ExecutorC19885fE1 implements Executor {

    /* renamed from: a */
    public final Executor f61808a;

    /* renamed from: fE1$a */
    /* loaded from: classes3.dex */
    public static class RunnableC10207a implements Runnable {

        /* renamed from: a */
        public final Runnable f61809a;

        public RunnableC10207a(Runnable runnable) {
            this.f61809a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f61809a.run();
            } catch (Exception e) {
                Logging.m49110e("Executor", "Background execution failure.", e);
            }
        }
    }

    public ExecutorC19885fE1(Executor executor) {
        this.f61808a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f61808a.execute(new RunnableC10207a(runnable));
    }
}