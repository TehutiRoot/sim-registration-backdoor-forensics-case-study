package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzh;

/* renamed from: CC2 */
/* loaded from: classes3.dex */
public final class CC2 extends HI2 {

    /* renamed from: a */
    public final /* synthetic */ C20566jA2 f677a;

    public CC2(C20566jA2 c20566jA2) {
        this.f677a = c20566jA2;
    }

    @Override // p000.HI2, com.google.android.gms.auth.account.zza
    public final void zzc(Account account) {
        Status status;
        C20566jA2 c20566jA2 = this.f677a;
        if (account == null) {
            status = zzh.f45450a;
        } else {
            status = Status.RESULT_SUCCESS;
        }
        c20566jA2.setResult((C20566jA2) new C21112mJ2(status, account));
    }
}