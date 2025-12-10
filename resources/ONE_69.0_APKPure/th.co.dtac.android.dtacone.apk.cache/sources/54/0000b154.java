package com.google.firebase.p015ml.vision.barcode.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzb;
import com.google.android.gms.internal.firebase_ml.zzd;
import com.google.android.gms.internal.firebase_ml.zzsj;

/* renamed from: com.google.firebase.ml.vision.barcode.internal.zzg */
/* loaded from: classes4.dex */
public final class zzg extends zzb implements IBarcodeDetector {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector");
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.IBarcodeDetector
    public final void start() throws RemoteException {
        zzb(1, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.IBarcodeDetector
    public final void stop() throws RemoteException {
        zzb(3, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.p015ml.vision.barcode.internal.IBarcodeDetector
    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, zzsj zzsjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzd.zza(obtainAndWriteInterfaceToken, zzsjVar);
        Parcel zza = zza(2, obtainAndWriteInterfaceToken);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }
}