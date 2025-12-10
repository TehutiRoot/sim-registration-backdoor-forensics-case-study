package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class SerialExecutorImpl implements SerialExecutor {

    /* renamed from: b */
    public final Executor f38722b;

    /* renamed from: c */
    public Runnable f38723c;

    /* renamed from: a */
    public final ArrayDeque f38721a = new ArrayDeque();

    /* renamed from: d */
    public final Object f38724d = new Object();

    /* renamed from: androidx.work.impl.utils.SerialExecutorImpl$a */
    /* loaded from: classes.dex */
    public static class RunnableC5302a implements Runnable {

        /* renamed from: a */
        public final SerialExecutorImpl f38725a;

        /* renamed from: b */
        public final Runnable f38726b;

        public RunnableC5302a(SerialExecutorImpl serialExecutorImpl, Runnable runnable) {
            this.f38725a = serialExecutorImpl;
            this.f38726b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38726b.run();
                synchronized (this.f38725a.f38724d) {
                    this.f38725a.m52159a();
                }
            } catch (Throwable th2) {
                synchronized (this.f38725a.f38724d) {
                    this.f38725a.m52159a();
                    throw th2;
                }
            }
        }
    }

    public SerialExecutorImpl(@NonNull Executor executor) {
        this.f38722b = executor;
    }

    /* renamed from: a */
    public void m52159a() {
        Runnable runnable = (Runnable) this.f38721a.poll();
        this.f38723c = runnable;
        if (runnable != null) {
            this.f38722b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        synchronized (this.f38724d) {
            try {
                this.f38721a.add(new RunnableC5302a(this, runnable));
                if (this.f38723c == null) {
                    m52159a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @VisibleForTesting
    public Executor getDelegatedExecutor() {
        return this.f38722b;
    }

    @Override // androidx.work.impl.utils.taskexecutor.SerialExecutor
    public boolean hasPendingTasks() {
        boolean z;
        synchronized (this.f38724d) {
            z = !this.f38721a.isEmpty();
        }
        return z;
    }
}
