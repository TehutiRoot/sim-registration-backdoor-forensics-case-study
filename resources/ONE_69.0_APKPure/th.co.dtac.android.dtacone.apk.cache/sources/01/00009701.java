package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarDateTimeParcelCreator")
/* loaded from: classes3.dex */
public final class zzuy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuy> CREATOR = new zzvn();

    /* renamed from: a */
    public final int f46773a;

    /* renamed from: b */
    public final int f46774b;

    /* renamed from: c */
    public final int f46775c;

    /* renamed from: d */
    public final int f46776d;

    /* renamed from: e */
    public final int f46777e;

    /* renamed from: f */
    public final int f46778f;

    /* renamed from: g */
    public final boolean f46779g;

    /* renamed from: h */
    public final String f46780h;

    @SafeParcelable.Constructor
    public zzuy(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) int i2, @SafeParcelable.Param(m48385id = 3) int i3, @SafeParcelable.Param(m48385id = 4) int i4, @SafeParcelable.Param(m48385id = 5) int i5, @SafeParcelable.Param(m48385id = 6) int i6, @SafeParcelable.Param(m48385id = 7) boolean z, @Nullable @SafeParcelable.Param(m48385id = 8) String str) {
        this.f46773a = i;
        this.f46774b = i2;
        this.f46775c = i3;
        this.f46776d = i4;
        this.f46777e = i5;
        this.f46778f = i6;
        this.f46779g = z;
        this.f46780h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46773a);
        SafeParcelWriter.writeInt(parcel, 2, this.f46774b);
        SafeParcelWriter.writeInt(parcel, 3, this.f46775c);
        SafeParcelWriter.writeInt(parcel, 4, this.f46776d);
        SafeParcelWriter.writeInt(parcel, 5, this.f46777e);
        SafeParcelWriter.writeInt(parcel, 6, this.f46778f);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f46779g);
        SafeParcelWriter.writeString(parcel, 8, this.f46780h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f46775c;
    }

    public final int zzb() {
        return this.f46776d;
    }

    public final int zzc() {
        return this.f46777e;
    }

    public final int zzd() {
        return this.f46774b;
    }

    public final int zze() {
        return this.f46778f;
    }

    public final int zzf() {
        return this.f46773a;
    }

    @Nullable
    public final String zzg() {
        return this.f46780h;
    }

    public final boolean zzh() {
        return this.f46779g;
    }
}