package p000;

import android.os.Process;

/* renamed from: OJ2 */
/* loaded from: classes3.dex */
public final class OJ2 extends Thread {
    public OJ2(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}