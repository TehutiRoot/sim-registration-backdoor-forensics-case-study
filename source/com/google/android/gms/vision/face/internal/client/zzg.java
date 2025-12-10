package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzs;

/* loaded from: classes4.dex */
public abstract class zzg extends com.google.android.gms.internal.vision.zza implements zzh {
    public zzg() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override // com.google.android.gms.internal.vision.zza
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    FaceParcel[] zza = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (zzs) com.google.android.gms.internal.vision.zzd.zza(parcel, zzs.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(zza, 1);
                } else {
                    zza();
                    parcel2.writeNoException();
                }
            } else {
                boolean zza2 = zza(parcel.readInt());
                parcel2.writeNoException();
                com.google.android.gms.internal.vision.zzd.zza(parcel2, zza2);
            }
        } else {
            FaceParcel[] zza3 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzs) com.google.android.gms.internal.vision.zzd.zza(parcel, zzs.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedArray(zza3, 1);
        }
        return true;
    }
}
