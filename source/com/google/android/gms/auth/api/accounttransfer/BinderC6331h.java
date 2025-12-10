package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.h */
/* loaded from: classes3.dex */
public final class BinderC6331h extends com.google.android.gms.internal.auth.zzs {

    /* renamed from: a */
    public final /* synthetic */ AccountTransferClient.AbstractC6323c f44473a;

    public BinderC6331h(AccountTransferClient.AbstractC6323c abstractC6323c) {
        this.f44473a = abstractC6323c;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void onFailure(Status status) {
        this.f44473a.m48721b(status);
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zzd() {
        this.f44473a.m48722a(null);
    }
}
