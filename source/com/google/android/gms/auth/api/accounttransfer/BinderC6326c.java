package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.c */
/* loaded from: classes3.dex */
public final class BinderC6326c extends AccountTransferClient.BinderC6321a {

    /* renamed from: b */
    public final /* synthetic */ C6325b f44468b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC6326c(C6325b c6325b, AccountTransferClient.AbstractC6322b abstractC6322b) {
        super(abstractC6322b);
        this.f44468b = c6325b;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zza(byte[] bArr) {
        this.f44468b.m48722a(bArr);
    }
}
