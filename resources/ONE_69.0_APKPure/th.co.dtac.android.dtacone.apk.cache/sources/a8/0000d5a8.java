package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

/* renamed from: io.realm.internal.a */
/* loaded from: classes5.dex */
public class RunnableC11313a implements Runnable {

    /* renamed from: a */
    public final ReferenceQueue f66858a;

    public RunnableC11313a(ReferenceQueue referenceQueue) {
        this.f66858a = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.f66858a.remove()).m29894e();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.fatal("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}