package p000;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzan;
import com.google.android.gms.internal.location.zzz;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: IJ2 */
/* loaded from: classes3.dex */
public final class IJ2 extends zzan {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f2661a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f2662b;

    public IJ2(zzz zzzVar, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f2661a = atomicReference;
        this.f2662b = countDownLatch;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(Status status, Location location) {
        if (status.isSuccess()) {
            this.f2661a.set(location);
        }
        this.f2662b.countDown();
    }
}