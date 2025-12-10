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
    public final zzve f46776a;

    /* renamed from: b */
    public final String f46777b;

    /* renamed from: c */
    public final String f46778c;

    /* renamed from: d */
    public final zzvf[] f46779d;

    /* renamed from: e */
    public final zzvc[] f46780e;

    /* renamed from: f */
    public final String[] f46781f;

    /* renamed from: g */
    public final zzux[] f46782g;

    @SafeParcelable.Constructor
    public zzva(@Nullable @SafeParcelable.Param(m48388id = 1) zzve zzveVar, @Nullable @SafeParcelable.Param(m48388id = 2) String str, @Nullable @SafeParcelable.Param(m48388id = 3) String str2, @Nullable @SafeParcelable.Param(m48388id = 4) zzvf[] zzvfVarArr, @Nullable @SafeParcelable.Param(m48388id = 5) zzvc[] zzvcVarArr, @Nullable @SafeParcelable.Param(m48388id = 6) String[] strArr, @Nullable @SafeParcelable.Param(m48388id = 7) zzux[] zzuxVarArr) {
        this.f46776a = zzveVar;
        this.f46777b = str;
        this.f46778c = str2;
        this.f46779d = zzvfVarArr;
        this.f46780e = zzvcVarArr;
        this.f46781f = strArr;
        this.f46782g = zzuxVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f46776a, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46777b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46778c, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f46779d, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f46780e, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f46781f, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.f46782g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final zzve zza() {
        return this.f46776a;
    }

    @Nullable
    public final String zzb() {
        return this.f46777b;
    }

    @Nullable
    public final String zzc() {
        return this.f46778c;
    }

    @Nullable
    public final zzux[] zzd() {
        return this.f46782g;
    }

    @Nullable
    public final zzvc[] zze() {
        return this.f46780e;
    }

    @Nullable
    public final zzvf[] zzf() {
        return this.f46779d;
    }

    @Nullable
    public final String[] zzg() {
        return this.f46781f;
    }
}
