package p000;

import android.os.Process;

/* renamed from: kb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20807kb2 extends Thread {
    public C20807kb2(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}