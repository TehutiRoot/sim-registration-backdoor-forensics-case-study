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
    public final String f48934a;

    /* renamed from: b */
    public final String f48935b;

    /* renamed from: c */
    public final int f48936c;

    /* renamed from: d */
    public final int f48937d;

    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(m48385id = 2) String str, @SafeParcelable.Param(m48385id = 3) String str2, @SafeParcelable.Param(m48385id = 4) int i, @SafeParcelable.Param(m48385id = 5) int i2) {
        this.f48934a = str;
        this.f48935b = str2;
        this.f48936c = i;
        this.f48937d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48934a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48935b, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f48936c);
        SafeParcelWriter.writeInt(parcel, 5, this.f48937d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}