package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

@SafeParcelable.Class(creator = "SignInResponseCreator")
/* loaded from: classes3.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();

    /* renamed from: a */
    public final int f48563a;

    /* renamed from: b */
    public final ConnectionResult f48564b;

    /* renamed from: c */
    public final zav f48565c;

    public zak(int i, ConnectionResult connectionResult, zav zavVar) {
        this.f48563a = i;
        this.f48564b = connectionResult;
        this.f48565c = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48563a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48564b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48565c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f48564b;
    }

    @Nullable
    public final zav zab() {
        return this.f48565c;
    }
}
