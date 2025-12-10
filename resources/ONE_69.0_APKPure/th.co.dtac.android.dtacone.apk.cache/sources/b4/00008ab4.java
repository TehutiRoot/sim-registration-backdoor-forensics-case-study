package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.h */
/* loaded from: classes3.dex */
public final class BinderC6320h extends com.google.android.gms.internal.auth.zzs {

    /* renamed from: a */
    public final /* synthetic */ AccountTransferClient.AbstractC6312c f44485a;

    public BinderC6320h(AccountTransferClient.AbstractC6312c abstractC6312c) {
        this.f44485a = abstractC6312c;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void onFailure(Status status) {
        this.f44485a.m48718b(status);
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zzd() {
        this.f44485a.m48719a(null);
    }
}