package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ProxyCardCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes4.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();

    /* renamed from: a */
    public final String f48922a;

    /* renamed from: b */
    public final String f48923b;

    /* renamed from: c */
    public final int f48924c;

    /* renamed from: d */
    public final int f48925d;

    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(m48388id = 2) String str, @SafeParcelable.Param(m48388id = 3) String str2, @SafeParcelable.Param(m48388id = 4) int i, @SafeParcelable.Param(m48388id = 5) int i2) {
        this.f48922a = str;
        this.f48923b = str2;
        this.f48924c = i;
        this.f48925d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48922a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48923b, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f48924c);
        SafeParcelWriter.writeInt(parcel, 5, this.f48925d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
