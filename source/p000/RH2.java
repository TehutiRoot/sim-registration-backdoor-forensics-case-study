package p000;

import com.google.android.gms.analytics.zzr;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: RH2 */
/* loaded from: classes3.dex */
public final class RH2 extends ThreadPoolExecutor {

    /* renamed from: a */
    public final /* synthetic */ zzr f5316a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RH2(zzr zzrVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f5316a = zzrVar;
        setThreadFactory(new GI2(null));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C19153bG2(this, runnable, obj);
    }
}
