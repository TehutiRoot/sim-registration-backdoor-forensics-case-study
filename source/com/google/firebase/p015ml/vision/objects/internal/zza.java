package com.google.firebase.p015ml.vision.objects.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzb;
import com.google.android.gms.internal.firebase_ml.zzd;
import com.google.android.gms.internal.firebase_ml.zzsj;

/* renamed from: com.google.firebase.ml.vision.objects.internal.zza */
/* loaded from: classes4.dex */
public final class zza extends zzb implements IObjectDetector {
    public zza(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.objects.internal.IObjectDetector");
    }

    @Override // com.google.firebase.p015ml.vision.objects.internal.IObjectDetector
    public final void start() throws RemoteException {
        zzb(2, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.p015ml.vision.objects.internal.IObjectDetector
    public final void stop() throws RemoteException {
        zzb(3, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.firebase.p015ml.vision.objects.internal.IObjectDetector
    public final zzj[] zzc(IObjectWrapper iObjectWrapper, zzsj zzsjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzd.zza(obtainAndWriteInterfaceToken, zzsjVar);
        Parcel zza = zza(1, obtainAndWriteInterfaceToken);
        zzj[] zzjVarArr = (zzj[]) zza.createTypedArray(zzj.CREATOR);
        zza.recycle();
        return zzjVarArr;
    }
}
