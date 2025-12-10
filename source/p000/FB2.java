package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzh;

/* renamed from: FB2 */
/* loaded from: classes3.dex */
public final class FB2 extends KH2 {

    /* renamed from: a */
    public final /* synthetic */ C21166mz2 f1528a;

    public FB2(C21166mz2 c21166mz2) {
        this.f1528a = c21166mz2;
    }

    @Override // p000.KH2, com.google.android.gms.auth.account.zza
    public final void zzc(Account account) {
        Status status;
        C21166mz2 c21166mz2 = this.f1528a;
        if (account == null) {
            status = zzh.f45438a;
        } else {
            status = Status.RESULT_SUCCESS;
        }
        c21166mz2.setResult((C21166mz2) new C21567pI2(status, account));
    }
}
