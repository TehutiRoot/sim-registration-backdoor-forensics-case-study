package p000;

import com.google.android.gms.analytics.zzo;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: GI2 */
/* loaded from: classes3.dex */
public final class GI2 implements ThreadFactory {

    /* renamed from: a */
    public static final AtomicInteger f1880a = new AtomicInteger();

    public /* synthetic */ GI2(zzo zzoVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = f1880a.incrementAndGet();
        return new RI2(runnable, "measurement-" + incrementAndGet);
    }
}
