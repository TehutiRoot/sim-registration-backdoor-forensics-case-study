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
    public final int f45161a;

    /* renamed from: b */
    public final IBinder f45162b;

    /* renamed from: c */
    public final ConnectionResult f45163c;

    /* renamed from: d */
    public final boolean f45164d;

    /* renamed from: e */
    public final boolean f45165e;

    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f45161a = i;
        this.f45162b = iBinder;
        this.f45163c = connectionResult;
        this.f45164d = z;
        this.f45165e = z2;
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
        if (!this.f45163c.equals(zavVar.f45163c) || !Objects.equal(zab(), zavVar.zab())) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45161a);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f45162b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45163c, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f45164d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f45165e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f45163c;
    }

    @Nullable
    public final IAccountAccessor zab() {
        IBinder iBinder = this.f45162b;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.f45164d;
    }

    public final boolean zad() {
        return this.f45165e;
    }
}
