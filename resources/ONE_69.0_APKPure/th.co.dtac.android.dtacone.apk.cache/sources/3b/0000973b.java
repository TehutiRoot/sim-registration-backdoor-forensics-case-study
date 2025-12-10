package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarDateTimeParcelCreator")
/* loaded from: classes3.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new zzbe();

    /* renamed from: a */
    public final int f46888a;

    /* renamed from: b */
    public final int f46889b;

    /* renamed from: c */
    public final int f46890c;

    /* renamed from: d */
    public final int f46891d;

    /* renamed from: e */
    public final int f46892e;

    /* renamed from: f */
    public final int f46893f;

    /* renamed from: g */
    public final boolean f46894g;

    /* renamed from: h */
    public final String f46895h;

    @SafeParcelable.Constructor
    public zzap(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) int i2, @SafeParcelable.Param(m48385id = 3) int i3, @SafeParcelable.Param(m48385id = 4) int i4, @SafeParcelable.Param(m48385id = 5) int i5, @SafeParcelable.Param(m48385id = 6) int i6, @SafeParcelable.Param(m48385id = 7) boolean z, @Nullable @SafeParcelable.Param(m48385id = 8) String str) {
        this.f46888a = i;
        this.f46889b = i2;
        this.f46890c = i3;
        this.f46891d = i4;
        this.f46892e = i5;
        this.f46893f = i6;
        this.f46894g = z;
        this.f46895h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46888a);
        SafeParcelWriter.writeInt(parcel, 2, this.f46889b);
        SafeParcelWriter.writeInt(parcel, 3, this.f46890c);
        SafeParcelWriter.writeInt(parcel, 4, this.f46891d);
        SafeParcelWriter.writeInt(parcel, 5, this.f46892e);
        SafeParcelWriter.writeInt(parcel, 6, this.f46893f);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f46894g);
        SafeParcelWriter.writeString(parcel, 8, this.f46895h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}