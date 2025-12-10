package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f45676a;

    /* renamed from: b */
    public final String f45677b;

    public zza(IBinder iBinder, String str) {
        this.f45676a = iBinder;
        this.f45677b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45676a;
    }

    public final Parcel zzB(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f45676a.transact(i, parcel, obtain, 0);
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

    public final void zzC(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45676a.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void zzD(int i, Parcel parcel) throws RemoteException {
        try {
            this.f45676a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45677b);
        return obtain;
    }
}