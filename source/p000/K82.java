package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zacs;
import com.google.android.gms.common.api.internal.zact;

/* renamed from: K82 */
/* loaded from: classes3.dex */
public final class K82 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zact f3125a;

    public K82(zact zactVar) {
        this.f3125a = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zacs zacsVar;
        zacsVar = this.f3125a.f44932g;
        zacsVar.zae(new ConnectionResult(4));
    }
}
