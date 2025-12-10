package p000;

import com.google.android.gms.internal.measurement.zzee;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: zj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC23426zj2 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f109472a = Executors.defaultThreadFactory();

    public ThreadFactoryC23426zj2(zzee zzeeVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f109472a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}