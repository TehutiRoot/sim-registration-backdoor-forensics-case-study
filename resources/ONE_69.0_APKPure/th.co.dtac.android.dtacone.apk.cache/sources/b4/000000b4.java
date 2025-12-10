package p000;

import com.google.firebase.concurrent.PausableExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: Ak1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17315Ak1 implements PausableExecutor {

    /* renamed from: a */
    public volatile boolean f201a;

    /* renamed from: b */
    public final Executor f202b;

    /* renamed from: c */
    public final LinkedBlockingQueue f203c = new LinkedBlockingQueue();

    public C17315Ak1(boolean z, Executor executor) {
        this.f201a = z;
        this.f202b = executor;
    }

    /* renamed from: a */
    public final void m69196a() {
        if (this.f201a) {
            return;
        }
        Runnable runnable = (Runnable) this.f203c.poll();
        while (runnable != null) {
            this.f202b.execute(runnable);
            if (!this.f201a) {
                runnable = (Runnable) this.f203c.poll();
            } else {
                runnable = null;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f203c.offer(runnable);
        m69196a();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.f201a;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.f201a = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.f201a = false;
        m69196a();
    }
}