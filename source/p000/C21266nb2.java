package p000;

import com.google.android.gms.tasks.zzac;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: nb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C21266nb2 implements InterfaceC22470ub2 {

    /* renamed from: a */
    public final CountDownLatch f72254a = new CountDownLatch(1);

    public /* synthetic */ C21266nb2(zzac zzacVar) {
    }

    /* renamed from: a */
    public final void m26119a() {
        this.f72254a.await();
    }

    /* renamed from: b */
    public final boolean m26118b(long j, TimeUnit timeUnit) {
        return this.f72254a.await(j, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f72254a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f72254a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f72254a.countDown();
    }
}
