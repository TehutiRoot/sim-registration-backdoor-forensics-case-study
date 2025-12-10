package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f45512a;

    /* renamed from: b */
    public final String f45513b;

    public zza(IBinder iBinder, String str) {
        this.f45512a = iBinder;
        this.f45513b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f45512a;
    }

    public final Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45513b);
        return obtain;
    }

    public final void transactOneway(int i, Parcel parcel) throws RemoteException {
        try {
            this.f45512a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}