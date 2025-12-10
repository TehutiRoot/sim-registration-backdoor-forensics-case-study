package p000;

import com.google.firebase.concurrent.PausableExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: Dj1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17481Dj1 implements PausableExecutor {

    /* renamed from: a */
    public volatile boolean f1084a;

    /* renamed from: b */
    public final Executor f1085b;

    /* renamed from: c */
    public final LinkedBlockingQueue f1086c = new LinkedBlockingQueue();

    public C17481Dj1(boolean z, Executor executor) {
        this.f1084a = z;
        this.f1085b = executor;
    }

    /* renamed from: a */
    public final void m68594a() {
        if (this.f1084a) {
            return;
        }
        Runnable runnable = (Runnable) this.f1086c.poll();
        while (runnable != null) {
            this.f1085b.execute(runnable);
            if (!this.f1084a) {
                runnable = (Runnable) this.f1086c.poll();
            } else {
                runnable = null;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f1086c.offer(runnable);
        m68594a();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.f1084a;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.f1084a = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.f1084a = false;
        m68594a();
    }
}
