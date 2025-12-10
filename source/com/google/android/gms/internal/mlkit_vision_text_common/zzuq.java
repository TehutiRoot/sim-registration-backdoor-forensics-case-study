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
    public final int f47421a;

    /* renamed from: b */
    public final int f47422b;

    /* renamed from: c */
    public final int f47423c;

    /* renamed from: d */
    public final int f47424d;

    /* renamed from: e */
    public final long f47425e;

    @SafeParcelable.Constructor
    public zzuq(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) int i2, @SafeParcelable.Param(m48388id = 3) int i3, @SafeParcelable.Param(m48388id = 4) int i4, @SafeParcelable.Param(m48388id = 5) long j) {
        this.f47421a = i;
        this.f47422b = i2;
        this.f47423c = i3;
        this.f47424d = i4;
        this.f47425e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f47421a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f47422b);
        SafeParcelWriter.writeInt(parcel, 3, this.f47423c);
        SafeParcelWriter.writeInt(parcel, 4, this.f47424d);
        SafeParcelWriter.writeLong(parcel, 5, this.f47425e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
