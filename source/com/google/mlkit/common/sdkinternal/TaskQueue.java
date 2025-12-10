package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
/* loaded from: classes4.dex */
public class TaskQueue {

    /* renamed from: b */
    public boolean f56931b;

    /* renamed from: a */
    public final Object f56930a = new Object();

    /* renamed from: c */
    public final Queue f56932c = new ArrayDeque();

    /* renamed from: d */
    public final AtomicReference f56933d = new AtomicReference();

    /* renamed from: c */
    public final void m37230c() {
        synchronized (this.f56930a) {
            try {
                if (this.f56932c.isEmpty()) {
                    this.f56931b = false;
                    return;
                }
                C21057mK2 c21057mK2 = (C21057mK2) this.f56932c.remove();
                m37229d(c21057mK2.f71881a, c21057mK2.f71882b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @KeepForSdk
    public void checkIsRunningOnCurrentThread() {
        Preconditions.checkState(Thread.currentThread().equals(this.f56933d.get()));
    }

    /* renamed from: d */
    public final void m37229d(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzt
                @Override // java.lang.Runnable
                public final void run() {
                    TK2 tk2 = new TK2(TaskQueue.this, null);
                    try {
                        runnable.run();
                        tk2.close();
                    } catch (Throwable th2) {
                        try {
                            tk2.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            m37230c();
        }
    }

    @KeepForSdk
    public void submit(@NonNull Executor executor, @NonNull Runnable runnable) {
        synchronized (this.f56930a) {
            try {
                if (this.f56931b) {
                    this.f56932c.add(new C21057mK2(executor, runnable, null));
                    return;
                }
                this.f56931b = true;
                m37229d(executor, runnable);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
