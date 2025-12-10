package p000;

import com.google.android.gms.tasks.zzac;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: kc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20810kc2 implements InterfaceC22021rc2 {

    /* renamed from: a */
    public final CountDownLatch f68003a = new CountDownLatch(1);

    public /* synthetic */ C20810kc2(zzac zzacVar) {
    }

    /* renamed from: a */
    public final void m29182a() {
        this.f68003a.await();
    }

    /* renamed from: b */
    public final boolean m29181b(long j, TimeUnit timeUnit) {
        return this.f68003a.await(j, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f68003a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f68003a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f68003a.countDown();
    }
}