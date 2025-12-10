package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes3.dex */
public final class zzg extends AbstractC20461ib2 {

    /* renamed from: e */
    public final /* synthetic */ BaseGmsClient f45196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzg(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle) {
        super(baseGmsClient, i, null);
        this.f45196e = baseGmsClient;
    }

    @Override // p000.AbstractC20461ib2
    public final void zzb(ConnectionResult connectionResult) {
        if (this.f45196e.enableLocalFallback() && BaseGmsClient.m48410m(this.f45196e)) {
            BaseGmsClient.m48413j(this.f45196e, 16);
            return;
        }
        this.f45196e.zzc.onReportServiceBinding(connectionResult);
        this.f45196e.onConnectionFailed(connectionResult);
    }

    @Override // p000.AbstractC20461ib2
    public final boolean zzd() {
        this.f45196e.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}