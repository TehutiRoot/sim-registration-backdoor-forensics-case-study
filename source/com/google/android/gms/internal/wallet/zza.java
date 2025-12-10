package com.google.android.gms.internal.wallet;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f47676a;

    /* renamed from: b */
    public final String f47677b = "com.google.android.gms.wallet.internal.IOwService";

    public zza(IBinder iBinder, String str) {
        this.f47676a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f47676a;
    }

    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f47677b);
        return obtain;
    }

    public final void zzb(int i, Parcel parcel) throws RemoteException {
        try {
            this.f47676a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
