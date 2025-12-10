package p000;

import com.google.android.gms.analytics.zzo;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: DJ2 */
/* loaded from: classes3.dex */
public final class DJ2 implements ThreadFactory {

    /* renamed from: a */
    public static final AtomicInteger f985a = new AtomicInteger();

    public /* synthetic */ DJ2(zzo zzoVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = f985a.incrementAndGet();
        return new OJ2(runnable, "measurement-" + incrementAndGet);
    }
}