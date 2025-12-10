package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes3.dex */
public final class zzg extends AbstractC20919la2 {

    /* renamed from: e */
    public final /* synthetic */ BaseGmsClient f45184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzg(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle) {
        super(baseGmsClient, i, null);
        this.f45184e = baseGmsClient;
    }

    @Override // p000.AbstractC20919la2
    public final void zzb(ConnectionResult connectionResult) {
        if (this.f45184e.enableLocalFallback() && BaseGmsClient.m48413m(this.f45184e)) {
            BaseGmsClient.m48416j(this.f45184e, 16);
            return;
        }
        this.f45184e.zzc.onReportServiceBinding(connectionResult);
        this.f45184e.onConnectionFailed(connectionResult);
    }

    @Override // p000.AbstractC20919la2
    public final boolean zzd() {
        this.f45184e.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}
