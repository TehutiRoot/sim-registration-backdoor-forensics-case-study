package org.apache.http.impl.conn.tsccm;

@Deprecated
/* loaded from: classes6.dex */
public class WaitingThreadAborter {

    /* renamed from: a */
    public WaitingThread f74416a;

    /* renamed from: b */
    public boolean f74417b;

    public void abort() {
        this.f74417b = true;
        WaitingThread waitingThread = this.f74416a;
        if (waitingThread != null) {
            waitingThread.interrupt();
        }
    }

    public void setWaitingThread(WaitingThread waitingThread) {
        this.f74416a = waitingThread;
        if (this.f74417b) {
            waitingThread.interrupt();
        }
    }
}