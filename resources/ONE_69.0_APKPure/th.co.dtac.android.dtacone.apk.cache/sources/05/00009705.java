package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DriverLicenseParcelCreator")
/* loaded from: classes3.dex */
public final class zzvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvb> CREATOR = new zzvq();

    /* renamed from: a */
    public final String f46795a;

    /* renamed from: b */
    public final String f46796b;

    /* renamed from: c */
    public final String f46797c;

    /* renamed from: d */
    public final String f46798d;

    /* renamed from: e */
    public final String f46799e;

    /* renamed from: f */
    public final String f46800f;

    /* renamed from: g */
    public final String f46801g;

    /* renamed from: h */
    public final String f46802h;

    /* renamed from: i */
    public final String f46803i;

    /* renamed from: j */
    public final String f46804j;

    /* renamed from: k */
    public final String f46805k;

    /* renamed from: l */
    public final String f46806l;

    /* renamed from: m */
    public final String f46807m;

    /* renamed from: n */
    public final String f46808n;

    @SafeParcelable.Constructor
    public zzvb(@Nullable @SafeParcelable.Param(m48385id = 1) String str, @Nullable @SafeParcelable.Param(m48385id = 2) String str2, @Nullable @SafeParcelable.Param(m48385id = 3) String str3, @Nullable @SafeParcelable.Param(m48385id = 4) String str4, @Nullable @SafeParcelable.Param(m48385id = 5) String str5, @Nullable @SafeParcelable.Param(m48385id = 6) String str6, @Nullable @SafeParcelable.Param(m48385id = 7) String str7, @Nullable @SafeParcelable.Param(m48385id = 8) String str8, @Nullable @SafeParcelable.Param(m48385id = 9) String str9, @Nullable @SafeParcelable.Param(m48385id = 10) String str10, @Nullable @SafeParcelable.Param(m48385id = 11) String str11, @Nullable @SafeParcelable.Param(m48385id = 12) String str12, @Nullable @SafeParcelable.Param(m48385id = 13) String str13, @Nullable @SafeParcelable.Param(m48385id = 14) String str14) {
        this.f46795a = str;
        this.f46796b = str2;
        this.f46797c = str3;
        this.f46798d = str4;
        this.f46799e = str5;
        this.f46800f = str6;
        this.f46801g = str7;
        this.f46802h = str8;
        this.f46803i = str9;
        this.f46804j = str10;
        this.f46805k = str11;
        this.f46806l = str12;
        this.f46807m = str13;
        this.f46808n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46795a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46796b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46797c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46798d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46799e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f46800f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f46801g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f46802h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f46803i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f46804j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f46805k, false);
        SafeParcelWriter.writeString(parcel, 12, this.f46806l, false);
        SafeParcelWriter.writeString(parcel, 13, this.f46807m, false);
        SafeParcelWriter.writeString(parcel, 14, this.f46808n, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.f46801g;
    }

    @Nullable
    public final String zzb() {
        return this.f46802h;
    }

    @Nullable
    public final String zzc() {
        return this.f46800f;
    }

    @Nullable
    public final String zzd() {
        return this.f46803i;
    }

    @Nullable
    public final String zze() {
        return this.f46807m;
    }

    @Nullable
    public final String zzf() {
        return this.f46795a;
    }

    @Nullable
    public final String zzg() {
        return this.f46806l;
    }

    @Nullable
    public final String zzh() {
        return this.f46796b;
    }

    @Nullable
    public final String zzi() {
        return this.f46799e;
    }

    @Nullable
    public final String zzj() {
        return this.f46805k;
    }

    @Nullable
    public final String zzk() {
        return this.f46808n;
    }

    @Nullable
    public final String zzl() {
        return this.f46798d;
    }

    @Nullable
    public final String zzm() {
        return this.f46804j;
    }

    @Nullable
    public final String zzn() {
        return this.f46797c;
    }
}