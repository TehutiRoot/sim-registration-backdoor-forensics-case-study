package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes3.dex */
public final class zzwc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwc> CREATOR = new zzwd();

    /* renamed from: a */
    public final int f46836a;

    /* renamed from: b */
    public final int f46837b;

    /* renamed from: c */
    public final int f46838c;

    /* renamed from: d */
    public final int f46839d;

    /* renamed from: e */
    public final long f46840e;

    @SafeParcelable.Constructor
    public zzwc(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) int i2, @SafeParcelable.Param(m48388id = 3) int i3, @SafeParcelable.Param(m48388id = 4) int i4, @SafeParcelable.Param(m48388id = 5) long j) {
        this.f46836a = i;
        this.f46837b = i2;
        this.f46838c = i3;
        this.f46839d = i4;
        this.f46840e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46836a);
        SafeParcelWriter.writeInt(parcel, 2, this.f46837b);
        SafeParcelWriter.writeInt(parcel, 3, this.f46838c);
        SafeParcelWriter.writeInt(parcel, 4, this.f46839d);
        SafeParcelWriter.writeLong(parcel, 5, this.f46840e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
