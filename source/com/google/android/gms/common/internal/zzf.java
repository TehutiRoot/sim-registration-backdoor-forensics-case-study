package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes3.dex */
public final class zzf extends AbstractC20919la2 {

    /* renamed from: e */
    public final /* synthetic */ BaseGmsClient f45183e;
    @Nullable
    public final IBinder zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzf(BaseGmsClient baseGmsClient, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.f45183e = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // p000.AbstractC20919la2
    public final void zzb(ConnectionResult connectionResult) {
        if (this.f45183e.f45043u != null) {
            this.f45183e.f45043u.onConnectionFailed(connectionResult);
        }
        this.f45183e.onConnectionFailed(connectionResult);
    }

    @Override // p000.AbstractC20919la2
    public final boolean zzd() {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f45183e.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.f45183e.getServiceDescriptor();
                Log.w("GmsClient", "service descriptor mismatch: " + serviceDescriptor + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = this.f45183e.createServiceInterface(this.zze);
            if (createServiceInterface != null && (BaseGmsClient.m48414l(this.f45183e, 2, 4, createServiceInterface) || BaseGmsClient.m48414l(this.f45183e, 3, 4, createServiceInterface))) {
                this.f45183e.f45047y = null;
                BaseGmsClient baseGmsClient = this.f45183e;
                Bundle connectionHint = baseGmsClient.getConnectionHint();
                baseConnectionCallbacks = baseGmsClient.f45042t;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = this.f45183e.f45042t;
                    baseConnectionCallbacks2.onConnected(connectionHint);
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
