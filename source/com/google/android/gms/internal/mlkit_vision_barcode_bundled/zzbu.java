package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes3.dex */
public final class zzbu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbu> CREATOR = new zzbv();

    /* renamed from: a */
    public final int f46951a;

    /* renamed from: b */
    public final int f46952b;

    /* renamed from: c */
    public final int f46953c;

    /* renamed from: d */
    public final int f46954d;

    /* renamed from: e */
    public final long f46955e;

    @SafeParcelable.Constructor
    public zzbu(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) int i2, @SafeParcelable.Param(m48388id = 3) int i3, @SafeParcelable.Param(m48388id = 4) int i4, @SafeParcelable.Param(m48388id = 5) long j) {
        this.f46951a = i;
        this.f46952b = i2;
        this.f46953c = i3;
        this.f46954d = i4;
        this.f46955e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46951a);
        SafeParcelWriter.writeInt(parcel, 2, this.f46952b);
        SafeParcelWriter.writeInt(parcel, 3, this.f46953c);
        SafeParcelWriter.writeInt(parcel, 4, this.f46954d);
        SafeParcelWriter.writeLong(parcel, 5, this.f46955e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f46953c;
    }

    public final int zzb() {
        return this.f46951a;
    }

    public final int zzc() {
        return this.f46954d;
    }

    public final int zzd() {
        return this.f46952b;
    }
}
