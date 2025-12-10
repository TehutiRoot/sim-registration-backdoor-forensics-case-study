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
    public final String f46783a;

    /* renamed from: b */
    public final String f46784b;

    /* renamed from: c */
    public final String f46785c;

    /* renamed from: d */
    public final String f46786d;

    /* renamed from: e */
    public final String f46787e;

    /* renamed from: f */
    public final String f46788f;

    /* renamed from: g */
    public final String f46789g;

    /* renamed from: h */
    public final String f46790h;

    /* renamed from: i */
    public final String f46791i;

    /* renamed from: j */
    public final String f46792j;

    /* renamed from: k */
    public final String f46793k;

    /* renamed from: l */
    public final String f46794l;

    /* renamed from: m */
    public final String f46795m;

    /* renamed from: n */
    public final String f46796n;

    @SafeParcelable.Constructor
    public zzvb(@Nullable @SafeParcelable.Param(m48388id = 1) String str, @Nullable @SafeParcelable.Param(m48388id = 2) String str2, @Nullable @SafeParcelable.Param(m48388id = 3) String str3, @Nullable @SafeParcelable.Param(m48388id = 4) String str4, @Nullable @SafeParcelable.Param(m48388id = 5) String str5, @Nullable @SafeParcelable.Param(m48388id = 6) String str6, @Nullable @SafeParcelable.Param(m48388id = 7) String str7, @Nullable @SafeParcelable.Param(m48388id = 8) String str8, @Nullable @SafeParcelable.Param(m48388id = 9) String str9, @Nullable @SafeParcelable.Param(m48388id = 10) String str10, @Nullable @SafeParcelable.Param(m48388id = 11) String str11, @Nullable @SafeParcelable.Param(m48388id = 12) String str12, @Nullable @SafeParcelable.Param(m48388id = 13) String str13, @Nullable @SafeParcelable.Param(m48388id = 14) String str14) {
        this.f46783a = str;
        this.f46784b = str2;
        this.f46785c = str3;
        this.f46786d = str4;
        this.f46787e = str5;
        this.f46788f = str6;
        this.f46789g = str7;
        this.f46790h = str8;
        this.f46791i = str9;
        this.f46792j = str10;
        this.f46793k = str11;
        this.f46794l = str12;
        this.f46795m = str13;
        this.f46796n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46783a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46784b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46785c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46786d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46787e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f46788f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f46789g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f46790h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f46791i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f46792j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f46793k, false);
        SafeParcelWriter.writeString(parcel, 12, this.f46794l, false);
        SafeParcelWriter.writeString(parcel, 13, this.f46795m, false);
        SafeParcelWriter.writeString(parcel, 14, this.f46796n, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.f46789g;
    }

    @Nullable
    public final String zzb() {
        return this.f46790h;
    }

    @Nullable
    public final String zzc() {
        return this.f46788f;
    }

    @Nullable
    public final String zzd() {
        return this.f46791i;
    }

    @Nullable
    public final String zze() {
        return this.f46795m;
    }

    @Nullable
    public final String zzf() {
        return this.f46783a;
    }

    @Nullable
    public final String zzg() {
        return this.f46794l;
    }

    @Nullable
    public final String zzh() {
        return this.f46784b;
    }

    @Nullable
    public final String zzi() {
        return this.f46787e;
    }

    @Nullable
    public final String zzj() {
        return this.f46793k;
    }

    @Nullable
    public final String zzk() {
        return this.f46796n;
    }

    @Nullable
    public final String zzl() {
        return this.f46786d;
    }

    @Nullable
    public final String zzm() {
        return this.f46792j;
    }

    @Nullable
    public final String zzn() {
        return this.f46785c;
    }
}
