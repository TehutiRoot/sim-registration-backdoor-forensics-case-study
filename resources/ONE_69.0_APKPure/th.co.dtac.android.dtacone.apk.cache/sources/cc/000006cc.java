package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zacs;
import com.google.android.gms.common.api.internal.zact;

/* renamed from: H92 */
/* loaded from: classes3.dex */
public final class H92 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zact f2299a;

    public H92(zact zactVar) {
        this.f2299a = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zacs zacsVar;
        zacsVar = this.f2299a.f44944g;
        zacsVar.zae(new ConnectionResult(4));
    }
}