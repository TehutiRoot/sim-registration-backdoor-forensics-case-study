package com.google.android.gms.location;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zza;

/* loaded from: classes3.dex */
public final class zzbg extends zza implements zzbi {
    public zzbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.zzbi
    public final void zzd(LocationAvailability locationAvailability) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.zzbi
    public final void zze(LocationResult locationResult) throws RemoteException {
        throw null;
    }
}