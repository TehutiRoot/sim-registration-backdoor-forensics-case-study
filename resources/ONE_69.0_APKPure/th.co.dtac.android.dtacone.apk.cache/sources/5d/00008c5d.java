package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
/* loaded from: classes3.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    /* renamed from: a */
    public final int f45173a;

    /* renamed from: b */
    public final IBinder f45174b;

    /* renamed from: c */
    public final ConnectionResult f45175c;

    /* renamed from: d */
    public final boolean f45176d;

    /* renamed from: e */
    public final boolean f45177e;

    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f45173a = i;
        this.f45174b = iBinder;
        this.f45175c = connectionResult;
        this.f45176d = z;
        this.f45177e = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (!this.f45175c.equals(zavVar.f45175c) || !Objects.equal(zab(), zavVar.zab())) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45173a);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f45174b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45175c, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f45176d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f45177e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f45175c;
    }

    @Nullable
    public final IAccountAccessor zab() {
        IBinder iBinder = this.f45174b;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.f45176d;
    }

    public final boolean zad() {
        return this.f45177e;
    }
}