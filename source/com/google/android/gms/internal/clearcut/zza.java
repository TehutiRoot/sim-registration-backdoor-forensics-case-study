package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f45500a;

    /* renamed from: b */
    public final String f45501b;

    public zza(IBinder iBinder, String str) {
        this.f45500a = iBinder;
        this.f45501b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f45500a;
    }

    public final Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45501b);
        return obtain;
    }

    public final void transactOneway(int i, Parcel parcel) throws RemoteException {
        try {
            this.f45500a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
