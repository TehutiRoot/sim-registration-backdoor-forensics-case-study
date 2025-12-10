package com.google.firebase.p015ml.vision.automl.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzd;
import com.google.android.gms.internal.firebase_ml.zzsj;

/* renamed from: com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler */
/* loaded from: classes4.dex */
public interface IOnDeviceAutoMLImageLabeler extends IInterface {

    /* renamed from: com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler$zza */
    /* loaded from: classes4.dex */
    public static abstract class zza extends com.google.android.gms.internal.firebase_ml.zza implements IOnDeviceAutoMLImageLabeler {
        public zza() {
            super("com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler");
        }

        @Override // com.google.android.gms.internal.firebase_ml.zza
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        boolean zzpf = zzpf();
                        parcel2.writeNoException();
                        zzd.writeBoolean(parcel2, zzpf);
                    } else {
                        close();
                        parcel2.writeNoException();
                    }
                } else {
                    zzow();
                    parcel2.writeNoException();
                }
            } else {
                zzl[] zza = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzsj) zzd.zza(parcel, zzsj.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedArray(zza, 1);
            }
            return true;
        }
    }

    void close() throws RemoteException;

    zzl[] zza(IObjectWrapper iObjectWrapper, zzsj zzsjVar) throws RemoteException;

    void zzow() throws RemoteException;

    boolean zzpf() throws RemoteException;
}
