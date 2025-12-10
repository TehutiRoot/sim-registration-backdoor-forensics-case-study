package android.support.p001v4.p002os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.IResultReceiver2 */
/* loaded from: classes.dex */
public interface IResultReceiver2 extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    /* renamed from: android.support.v4.os.IResultReceiver2$Default */
    /* loaded from: classes.dex */
    public static class Default implements IResultReceiver2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.p001v4.p002os.IResultReceiver2
        public void send(int i, Bundle bundle) throws RemoteException {
        }
    }

    /* renamed from: android.support.v4.os.IResultReceiver2$Stub */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IResultReceiver2 {

        /* renamed from: android.support.v4.os.IResultReceiver2$Stub$a */
        /* loaded from: classes.dex */
        public static class C1987a implements IResultReceiver2 {

            /* renamed from: a */
            public IBinder f8719a;

            public C1987a(IBinder iBinder) {
                this.f8719a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8719a;
            }

            @Override // android.support.p001v4.p002os.IResultReceiver2
            public void send(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IResultReceiver2.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.m64753d(obtain, bundle, 0);
                    this.f8719a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IResultReceiver2.DESCRIPTOR);
        }

        public static IResultReceiver2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IResultReceiver2.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IResultReceiver2)) {
                return (IResultReceiver2) queryLocalInterface;
            }
            return new C1987a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IResultReceiver2.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                send(parcel.readInt(), (Bundle) _Parcel.m64754c(parcel, Bundle.CREATOR));
                return true;
            }
            parcel2.writeString(str);
            return true;
        }
    }

    /* renamed from: android.support.v4.os.IResultReceiver2$_Parcel */
    /* loaded from: classes.dex */
    public static class _Parcel {
        /* renamed from: c */
        public static Object m64754c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static void m64753d(Parcel parcel, Parcelable parcelable, int i) {
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