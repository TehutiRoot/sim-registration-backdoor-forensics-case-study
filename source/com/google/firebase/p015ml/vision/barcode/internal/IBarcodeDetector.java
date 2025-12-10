package com.google.firebase.p015ml.vision.barcode.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzd;
import com.google.android.gms.internal.firebase_ml.zzsj;

/* renamed from: com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector */
/* loaded from: classes4.dex */
public interface IBarcodeDetector extends IInterface {

    /* renamed from: com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector$zza */
    /* loaded from: classes4.dex */
    public static abstract class zza extends com.google.android.gms.internal.firebase_ml.zza implements IBarcodeDetector {
        public zza() {
            super("com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector");
        }

        @Override // com.google.android.gms.internal.firebase_ml.zza
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    stop();
                    parcel2.writeNoException();
                } else {
                    IObjectWrapper zzb = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzsj) zzd.zza(parcel, zzsj.CREATOR));
                    parcel2.writeNoException();
                    zzd.zza(parcel2, zzb);
                }
            } else {
                start();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void start() throws RemoteException;

    void stop() throws RemoteException;

    IObjectWrapper zzb(IObjectWrapper iObjectWrapper, zzsj zzsjVar) throws RemoteException;
}
