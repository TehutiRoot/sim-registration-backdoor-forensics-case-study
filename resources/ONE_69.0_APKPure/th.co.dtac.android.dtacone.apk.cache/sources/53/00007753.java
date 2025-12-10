package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class SerialExecutorImpl implements SerialExecutor {

    /* renamed from: b */
    public final Executor f38810b;

    /* renamed from: c */
    public Runnable f38811c;

    /* renamed from: a */
    public final ArrayDeque f38809a = new ArrayDeque();

    /* renamed from: d */
    public final Object f38812d = new Object();

    /* renamed from: androidx.work.impl.utils.SerialExecutorImpl$a */
    /* loaded from: classes.dex */
    public static class RunnableC5284a implements Runnable {

        /* renamed from: a */
        public final SerialExecutorImpl f38813a;

        /* renamed from: b */
        public final Runnable f38814b;

        public RunnableC5284a(SerialExecutorImpl serialExecutorImpl, Runnable runnable) {
            this.f38813a = serialExecutorImpl;
            this.f38814b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38814b.run();
                synchronized (this.f38813a.f38812d) {
                    this.f38813a.m52111a();
                }
            } catch (Throwable th2) {
                synchronized (this.f38813a.f38812d) {
                    this.f38813a.m52111a();
                    throw th2;
                }
            }
        }
    }

    public SerialExecutorImpl(@NonNull Executor executor) {
        this.f38810b = executor;
    }

    /* renamed from: a */
    public void m52111a() {
        Runnable runnable = (Runnable) this.f38809a.poll();
        this.f38811c = runnable;
        if (runnable != null) {
            this.f38810b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        synchronized (this.f38812d) {
            try {
                this.f38809a.add(new RunnableC5284a(this, runnable));
                if (this.f38811c == null) {
                    m52111a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @VisibleForTesting
    public Executor getDelegatedExecutor() {
        return this.f38810b;
    }

    @Override // androidx.work.impl.utils.taskexecutor.SerialExecutor
    public boolean hasPendingTasks() {
        boolean z;
        synchronized (this.f38812d) {
            z = !this.f38809a.isEmpty();
        }
        return z;
    }
}