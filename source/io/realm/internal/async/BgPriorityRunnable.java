package io.realm.internal.async;

import android.os.Process;

/* loaded from: classes5.dex */
public class BgPriorityRunnable implements Runnable {

    /* renamed from: a */
    public final Runnable f66804a;

    public BgPriorityRunnable(Runnable runnable) {
        this.f66804a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        this.f66804a.run();
    }
}
