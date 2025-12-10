package p000;

import android.os.Process;

/* renamed from: ma2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21091ma2 implements Runnable {

    /* renamed from: a */
    public final Runnable f71926a;

    public RunnableC21091ma2(Runnable runnable, int i) {
        this.f71926a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f71926a.run();
    }
}
