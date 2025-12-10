package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
/* loaded from: classes3.dex */
public final class zzuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuz> CREATOR = new zzvo();

    /* renamed from: a */
    public final String f46769a;

    /* renamed from: b */
    public final String f46770b;

    /* renamed from: c */
    public final String f46771c;

    /* renamed from: d */
    public final String f46772d;

    /* renamed from: e */
    public final String f46773e;

    /* renamed from: f */
    public final zzuy f46774f;

    /* renamed from: g */
    public final zzuy f46775g;

    @SafeParcelable.Constructor
    public zzuz(@Nullable @SafeParcelable.Param(m48388id = 1) String str, @Nullable @SafeParcelable.Param(m48388id = 2) String str2, @Nullable @SafeParcelable.Param(m48388id = 3) String str3, @Nullable @SafeParcelable.Param(m48388id = 4) String str4, @Nullable @SafeParcelable.Param(m48388id = 5) String str5, @Nullable @SafeParcelable.Param(m48388id = 6) zzuy zzuyVar, @Nullable @SafeParcelable.Param(m48388id = 7) zzuy zzuyVar2) {
        this.f46769a = str;
        this.f46770b = str2;
        this.f46771c = str3;
        this.f46772d = str4;
        this.f46773e = str5;
        this.f46774f = zzuyVar;
        this.f46775g = zzuyVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46769a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46770b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46771c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46772d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46773e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f46774f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f46775g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final zzuy zza() {
        return this.f46775g;
    }

    @Nullable
    public final zzuy zzb() {
        return this.f46774f;
    }

    @Nullable
    public final String zzc() {
        return this.f46770b;
    }

    @Nullable
    public final String zzd() {
        return this.f46771c;
    }

    @Nullable
    public final String zze() {
        return this.f46772d;
    }

    @Nullable
    public final String zzf() {
        return this.f46773e;
    }

    @Nullable
    public final String zzg() {
        return this.f46769a;
    }
}
