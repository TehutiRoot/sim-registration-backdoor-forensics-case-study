package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class zzb implements IInterface {

    /* renamed from: a */
    public final IBinder f47563a;

    /* renamed from: b */
    public final String f47564b;

    public zzb(IBinder iBinder, String str) {
        this.f47563a = iBinder;
        this.f47564b = str;
    }

    /* renamed from: a_ */
    public final Parcel m46562a_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f47564b);
        return obtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f47563a;
    }

    public final Parcel zza(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f47563a.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void zzb(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f47563a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
