package org.apache.http.impl.conn.tsccm;

@Deprecated
/* loaded from: classes6.dex */
public class WaitingThreadAborter {

    /* renamed from: a */
    public WaitingThread f74332a;

    /* renamed from: b */
    public boolean f74333b;

    public void abort() {
        this.f74333b = true;
        WaitingThread waitingThread = this.f74332a;
        if (waitingThread != null) {
            waitingThread.interrupt();
        }
    }

    public void setWaitingThread(WaitingThread waitingThread) {
        this.f74332a = waitingThread;
        if (this.f74333b) {
            waitingThread.interrupt();
        }
    }
}
