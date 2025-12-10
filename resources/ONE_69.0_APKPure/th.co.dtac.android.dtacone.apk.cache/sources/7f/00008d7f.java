package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class zaa implements IInterface {

    /* renamed from: a */
    public final IBinder f45454a;

    /* renamed from: b */
    public final String f45455b;

    public zaa(IBinder iBinder, String str) {
        this.f45454a = iBinder;
        this.f45455b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45454a;
    }

    public final Parcel zaa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45455b);
        return obtain;
    }

    public final Parcel zab(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f45454a.transact(2, parcel, obtain, 0);
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

    public final void zac(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45454a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void zad(int i, Parcel parcel) throws RemoteException {
        try {
            this.f45454a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}