package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzus extends zza implements zzuu {
    public zzus(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuu
    public final zzuv zzd(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzvh zzvhVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, iObjectWrapper);
        zzuv zzuvVar = null;
        zzc.zzb(zza, null);
        zzc.zza(zza, zzvhVar);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            if (queryLocalInterface instanceof zzuv) {
                zzuvVar = (zzuv) queryLocalInterface;
            } else {
                zzuvVar = new zzuv(readStrongBinder);
            }
        }
        zzb.recycle();
        return zzuvVar;
    }
}