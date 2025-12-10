package p000;

import android.os.Process;

/* renamed from: jb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC20634jb2 implements Runnable {

    /* renamed from: a */
    public final Runnable f67345a;

    public RunnableC20634jb2(Runnable runnable, int i) {
        this.f67345a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f67345a.run();
    }
}