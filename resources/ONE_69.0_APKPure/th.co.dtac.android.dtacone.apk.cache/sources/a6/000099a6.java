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
    public final int f47246a;

    /* renamed from: b */
    public final int f47247b;

    /* renamed from: c */
    public final int f47248c;

    /* renamed from: d */
    public final int f47249d;

    /* renamed from: e */
    public final long f47250e;

    @SafeParcelable.Constructor
    public zzoq(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) int i2, @SafeParcelable.Param(m48385id = 3) int i3, @SafeParcelable.Param(m48385id = 4) int i4, @SafeParcelable.Param(m48385id = 5) long j) {
        this.f47246a = i;
        this.f47247b = i2;
        this.f47248c = i3;
        this.f47249d = i4;
        this.f47250e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47246a);
        SafeParcelWriter.writeInt(parcel, 2, this.f47247b);
        SafeParcelWriter.writeInt(parcel, 3, this.f47248c);
        SafeParcelWriter.writeInt(parcel, 4, this.f47249d);
        SafeParcelWriter.writeLong(parcel, 5, this.f47250e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}