package android.support.p001v4.p002os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.IResultReceiver */
/* loaded from: classes.dex */
public interface IResultReceiver extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: android.support.v4.os.IResultReceiver$Default */
    /* loaded from: classes.dex */
    public static class Default implements IResultReceiver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.p001v4.p002os.IResultReceiver
        public void send(int i, Bundle bundle) throws RemoteException {
        }
    }

    /* renamed from: android.support.v4.os.IResultReceiver$Stub */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IResultReceiver {

        /* renamed from: android.support.v4.os.IResultReceiver$Stub$a */
        /* loaded from: classes.dex */
        public static class C1986a implements IResultReceiver {

            /* renamed from: a */
            public IBinder f8718a;

            public C1986a(IBinder iBinder) {
                this.f8718a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8718a;
            }

            @Override // android.support.p001v4.p002os.IResultReceiver
            public void send(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IResultReceiver.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.m64757d(obtain, bundle, 0);
                    this.f8718a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IResultReceiver.DESCRIPTOR);
        }

        public static IResultReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IResultReceiver.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IResultReceiver)) {
                return (IResultReceiver) queryLocalInterface;
            }
            return new C1986a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IResultReceiver.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                send(parcel.readInt(), (Bundle) _Parcel.m64758c(parcel, Bundle.CREATOR));
                return true;
            }
            parcel2.writeString(str);
            return true;
        }
    }

    /* renamed from: android.support.v4.os.IResultReceiver$_Parcel */
    /* loaded from: classes.dex */
    public static class _Parcel {
        /* renamed from: c */
        public static Object m64758c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static void m64757d(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void send(int i, Bundle bundle) throws RemoteException;
}