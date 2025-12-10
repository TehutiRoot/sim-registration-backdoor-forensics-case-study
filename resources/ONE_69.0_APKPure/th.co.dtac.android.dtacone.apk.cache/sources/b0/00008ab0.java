package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzz;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.d */
/* loaded from: classes3.dex */
public final class C6316d extends AccountTransferClient.AbstractC6311b {

    /* renamed from: e */
    public final /* synthetic */ com.google.android.gms.internal.auth.zzv f44481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6316d(AccountTransferClient accountTransferClient, com.google.android.gms.internal.auth.zzv zzvVar) {
        super(null);
        this.f44481e = zzvVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.AbstractC6311b
    /* renamed from: c */
    public final void mo48717c(zzz zzzVar) {
        zzzVar.zza(new BinderC6317e(this, this), this.f44481e);
    }
}