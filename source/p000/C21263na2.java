package p000;

import android.os.Process;

/* renamed from: na2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21263na2 extends Thread {
    public C21263na2(ThreadGroup threadGroup, String str) {
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
