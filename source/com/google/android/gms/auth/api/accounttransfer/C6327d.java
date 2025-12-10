package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzz;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.d */
/* loaded from: classes3.dex */
public final class C6327d extends AccountTransferClient.AbstractC6322b {

    /* renamed from: e */
    public final /* synthetic */ com.google.android.gms.internal.auth.zzv f44469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6327d(AccountTransferClient accountTransferClient, com.google.android.gms.internal.auth.zzv zzvVar) {
        super(null);
        this.f44469e = zzvVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.AbstractC6322b
    /* renamed from: c */
    public final void mo48720c(zzz zzzVar) {
        zzzVar.zza(new BinderC6328e(this, this), this.f44469e);
    }
}
