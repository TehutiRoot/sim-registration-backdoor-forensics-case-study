package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzz;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.b */
/* loaded from: classes3.dex */
public final class C6325b extends AccountTransferClient.AbstractC6322b {

    /* renamed from: e */
    public final /* synthetic */ zzad f44467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6325b(AccountTransferClient accountTransferClient, zzad zzadVar) {
        super(null);
        this.f44467e = zzadVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.AbstractC6322b
    /* renamed from: c */
    public final void mo48720c(zzz zzzVar) {
        zzzVar.zza(new BinderC6326c(this, this), this.f44467e);
    }
}
