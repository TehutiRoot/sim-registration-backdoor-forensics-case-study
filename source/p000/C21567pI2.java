package p000;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Status;

/* renamed from: pI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21567pI2 implements WorkAccountApi.AddAccountResult {

    /* renamed from: a */
    public final Status f76552a;

    /* renamed from: b */
    public final Account f76553b;

    public C21567pI2(Status status, Account account) {
        this.f76552a = status;
        this.f76553b = account;
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    public final Account getAccount() {
        return this.f76553b;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f76552a;
    }
}
