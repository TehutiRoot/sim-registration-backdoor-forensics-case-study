package p000;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzan;
import com.google.android.gms.internal.location.zzz;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: LI2 */
/* loaded from: classes3.dex */
public final class LI2 extends zzan {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f3435a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f3436b;

    public LI2(zzz zzzVar, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f3435a = atomicReference;
        this.f3436b = countDownLatch;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(Status status, Location location) {
        if (status.isSuccess()) {
            this.f3435a.set(location);
        }
        this.f3436b.countDown();
    }
}
