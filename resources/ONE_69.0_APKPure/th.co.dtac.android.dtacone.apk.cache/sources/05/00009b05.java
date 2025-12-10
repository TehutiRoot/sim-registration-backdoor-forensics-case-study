package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes3.dex */
public final class zzuq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuq> CREATOR = new zzur();

    /* renamed from: a */
    public final int f47433a;

    /* renamed from: b */
    public final int f47434b;

    /* renamed from: c */
    public final int f47435c;

    /* renamed from: d */
    public final int f47436d;

    /* renamed from: e */
    public final long f47437e;

    @SafeParcelable.Constructor
    public zzuq(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) int i2, @SafeParcelable.Param(m48385id = 3) int i3, @SafeParcelable.Param(m48385id = 4) int i4, @SafeParcelable.Param(m48385id = 5) long j) {
        this.f47433a = i;
        this.f47434b = i2;
        this.f47435c = i3;
        this.f47436d = i4;
        this.f47437e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f47433a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f47434b);
        SafeParcelWriter.writeInt(parcel, 3, this.f47435c);
        SafeParcelWriter.writeInt(parcel, 4, this.f47436d);
        SafeParcelWriter.writeLong(parcel, 5, this.f47437e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}