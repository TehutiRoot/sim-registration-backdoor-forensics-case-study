package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
/* loaded from: classes3.dex */
public final class zzva extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzva> CREATOR = new zzvp();

    /* renamed from: a */
    public final zzve f46788a;

    /* renamed from: b */
    public final String f46789b;

    /* renamed from: c */
    public final String f46790c;

    /* renamed from: d */
    public final zzvf[] f46791d;

    /* renamed from: e */
    public final zzvc[] f46792e;

    /* renamed from: f */
    public final String[] f46793f;

    /* renamed from: g */
    public final zzux[] f46794g;

    @SafeParcelable.Constructor
    public zzva(@Nullable @SafeParcelable.Param(m48385id = 1) zzve zzveVar, @Nullable @SafeParcelable.Param(m48385id = 2) String str, @Nullable @SafeParcelable.Param(m48385id = 3) String str2, @Nullable @SafeParcelable.Param(m48385id = 4) zzvf[] zzvfVarArr, @Nullable @SafeParcelable.Param(m48385id = 5) zzvc[] zzvcVarArr, @Nullable @SafeParcelable.Param(m48385id = 6) String[] strArr, @Nullable @SafeParcelable.Param(m48385id = 7) zzux[] zzuxVarArr) {
        this.f46788a = zzveVar;
        this.f46789b = str;
        this.f46790c = str2;
        this.f46791d = zzvfVarArr;
        this.f46792e = zzvcVarArr;
        this.f46793f = strArr;
        this.f46794g = zzuxVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f46788a, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46789b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46790c, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f46791d, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f46792e, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f46793f, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.f46794g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final zzve zza() {
        return this.f46788a;
    }

    @Nullable
    public final String zzb() {
        return this.f46789b;
    }

    @Nullable
    public final String zzc() {
        return this.f46790c;
    }

    @Nullable
    public final zzux[] zzd() {
        return this.f46794g;
    }

    @Nullable
    public final zzvc[] zze() {
        return this.f46792e;
    }

    @Nullable
    public final zzvf[] zzf() {
        return this.f46791d;
    }

    @Nullable
    public final String[] zzg() {
        return this.f46793f;
    }
}