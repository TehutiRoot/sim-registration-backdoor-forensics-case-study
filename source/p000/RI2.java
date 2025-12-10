package p000;

import android.os.Process;

/* renamed from: RI2 */
/* loaded from: classes3.dex */
public final class RI2 extends Thread {
    public RI2(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
