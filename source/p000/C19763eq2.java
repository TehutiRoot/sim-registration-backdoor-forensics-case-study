package p000;

import com.google.android.gms.internal.vision.zzf;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: eq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19763eq2 implements zzf {
    public C19763eq2() {
    }

    @Override // com.google.android.gms.internal.vision.zzf
    public final ExecutorService zza(int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
