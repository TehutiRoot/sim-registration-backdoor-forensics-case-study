package p000;

import com.google.android.gms.internal.measurement.zzee;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: Ci2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC17415Ci2 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f809a = Executors.defaultThreadFactory();

    public ThreadFactoryC17415Ci2(zzee zzeeVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f809a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
