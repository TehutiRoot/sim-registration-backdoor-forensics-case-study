package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

/* renamed from: io.realm.internal.a */
/* loaded from: classes5.dex */
public class RunnableC11326a implements Runnable {

    /* renamed from: a */
    public final ReferenceQueue f66795a;

    public RunnableC11326a(ReferenceQueue referenceQueue) {
        this.f66795a = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.f66795a.remove()).m29554e();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.fatal("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
