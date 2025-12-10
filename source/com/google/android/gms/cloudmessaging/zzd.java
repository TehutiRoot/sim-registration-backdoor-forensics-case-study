package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C22820wd2();

    /* renamed from: a */
    public Messenger f44614a;

    /* renamed from: b */
    public IMessengerCompat f44615b;

    public zzd(IBinder iBinder) {
        this.f44614a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return zza().equals(((zzd) obj).zza());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f44614a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f44615b.asBinder());
        }
    }

    public final IBinder zza() {
        Messenger messenger = this.f44614a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return this.f44615b.asBinder();
    }

    public final void zzb(Message message) throws RemoteException {
        Messenger messenger = this.f44614a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f44615b.send(message);
        }
    }
}
