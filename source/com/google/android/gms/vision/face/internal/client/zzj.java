package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzs;

/* loaded from: classes4.dex */
public final class zzj extends com.google.android.gms.internal.vision.zzb implements zzh {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final FaceParcel[] zza(IObjectWrapper iObjectWrapper, zzs zzsVar) throws RemoteException {
        Parcel m46562a_ = m46562a_();
        com.google.android.gms.internal.vision.zzd.zza(m46562a_, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(m46562a_, zzsVar);
        Parcel zza = zza(1, m46562a_);
        FaceParcel[] faceParcelArr = (FaceParcel[]) zza.createTypedArray(FaceParcel.CREATOR);
        zza.recycle();
        return faceParcelArr;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final FaceParcel[] zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i, int i2, int i3, int i4, int i5, int i6, zzs zzsVar) throws RemoteException {
        Parcel m46562a_ = m46562a_();
        com.google.android.gms.internal.vision.zzd.zza(m46562a_, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(m46562a_, iObjectWrapper2);
        com.google.android.gms.internal.vision.zzd.zza(m46562a_, iObjectWrapper3);
        m46562a_.writeInt(i);
        m46562a_.writeInt(i2);
        m46562a_.writeInt(i3);
        m46562a_.writeInt(i4);
        m46562a_.writeInt(i5);
        m46562a_.writeInt(i6);
        com.google.android.gms.internal.vision.zzd.zza(m46562a_, zzsVar);
        Parcel zza = zza(4, m46562a_);
        FaceParcel[] faceParcelArr = (FaceParcel[]) zza.createTypedArray(FaceParcel.CREATOR);
        zza.recycle();
        return faceParcelArr;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final boolean zza(int i) throws RemoteException {
        Parcel m46562a_ = m46562a_();
        m46562a_.writeInt(i);
        Parcel zza = zza(2, m46562a_);
        boolean zza2 = com.google.android.gms.internal.vision.zzd.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final void zza() throws RemoteException {
        zzb(3, m46562a_());
    }
}
