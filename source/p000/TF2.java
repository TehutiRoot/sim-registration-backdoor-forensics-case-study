package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzh;

/* renamed from: TF2 */
/* loaded from: classes3.dex */
public final class TF2 extends KH2 {

    /* renamed from: a */
    public final /* synthetic */ MD2 f5974a;

    public TF2(MD2 md2) {
        this.f5974a = md2;
    }

    @Override // p000.KH2, com.google.android.gms.auth.account.zza
    public final void zza(boolean z) {
        Status status;
        MD2 md2 = this.f5974a;
        if (!z) {
            status = zzh.f45438a;
        } else {
            status = Status.RESULT_SUCCESS;
        }
        md2.setResult((MD2) new JI2(status));
    }
}
