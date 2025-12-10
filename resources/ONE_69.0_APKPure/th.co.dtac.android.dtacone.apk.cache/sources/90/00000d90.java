package p000;

import com.google.android.gms.analytics.zzr;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: OI2 */
/* loaded from: classes3.dex */
public final class OI2 extends ThreadPoolExecutor {

    /* renamed from: a */
    public final /* synthetic */ zzr f4424a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OI2(zzr zzrVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f4424a = zzrVar;
        setThreadFactory(new DJ2(null));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new YG2(this, runnable, obj);
    }
}