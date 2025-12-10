package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.e */
/* loaded from: classes3.dex */
public final class BinderC6328e extends AccountTransferClient.BinderC6321a {

    /* renamed from: b */
    public final /* synthetic */ C6327d f44470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC6328e(C6327d c6327d, AccountTransferClient.AbstractC6322b abstractC6322b) {
        super(abstractC6322b);
        this.f44470b = c6327d;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zza(DeviceMetaData deviceMetaData) {
        this.f44470b.m48722a(deviceMetaData);
    }
}
