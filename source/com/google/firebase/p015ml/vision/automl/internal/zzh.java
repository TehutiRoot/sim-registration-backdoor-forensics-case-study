package com.google.firebase.p015ml.vision.automl.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzb;
import com.google.android.gms.internal.firebase_ml.zzd;
import com.google.android.gms.internal.firebase_ml.zzsj;

/* renamed from: com.google.firebase.ml.vision.automl.internal.zzh */
/* loaded from: classes4.dex */
public final class zzh extends zzb implements IOnDeviceAutoMLImageLabeler {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler");
    }

    @Override // com.google.firebase.p015ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler
    public final void close() throws RemoteException {
        zzb(3, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.p015ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler
    public final zzl[] zza(IObjectWrapper iObjectWrapper, zzsj zzsjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzd.zza(obtainAndWriteInterfaceToken, zzsjVar);
        Parcel zza = zza(1, obtainAndWriteInterfaceToken);
        zzl[] zzlVarArr = (zzl[]) zza.createTypedArray(zzl.CREATOR);
        zza.recycle();
        return zzlVarArr;
    }

    @Override // com.google.firebase.p015ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler
    public final void zzow() throws RemoteException {
        zzb(2, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.p015ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler
    public final boolean zzpf() throws RemoteException {
        Parcel zza = zza(4, obtainAndWriteInterfaceToken());
        boolean zza2 = zzd.zza(zza);
        zza.recycle();
        return zza2;
    }
}
