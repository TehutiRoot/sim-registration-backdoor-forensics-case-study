package io.realm.internal.async;

import android.os.Process;

/* loaded from: classes5.dex */
public class BgPriorityRunnable implements Runnable {

    /* renamed from: a */
    public final Runnable f66867a;

    public BgPriorityRunnable(Runnable runnable) {
        this.f66867a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        this.f66867a.run();
    }
}