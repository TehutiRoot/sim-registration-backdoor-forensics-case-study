package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes3.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new zzor();

    /* renamed from: a */
    public final int f47234a;

    /* renamed from: b */
    public final int f47235b;

    /* renamed from: c */
    public final int f47236c;

    /* renamed from: d */
    public final int f47237d;

    /* renamed from: e */
    public final long f47238e;

    @SafeParcelable.Constructor
    public zzoq(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) int i2, @SafeParcelable.Param(m48388id = 3) int i3, @SafeParcelable.Param(m48388id = 4) int i4, @SafeParcelable.Param(m48388id = 5) long j) {
        this.f47234a = i;
        this.f47235b = i2;
        this.f47236c = i3;
        this.f47237d = i4;
        this.f47238e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47234a);
        SafeParcelWriter.writeInt(parcel, 2, this.f47235b);
        SafeParcelWriter.writeInt(parcel, 3, this.f47236c);
        SafeParcelWriter.writeInt(parcel, 4, this.f47237d);
        SafeParcelWriter.writeLong(parcel, 5, this.f47238e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
