package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EmailParcelCreator")
/* loaded from: classes3.dex */
public final class zzvc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvc> CREATOR = new zzvr();

    /* renamed from: a */
    public final int f46797a;

    /* renamed from: b */
    public final String f46798b;

    /* renamed from: c */
    public final String f46799c;

    /* renamed from: d */
    public final String f46800d;

    @SafeParcelable.Constructor
    public zzvc(@SafeParcelable.Param(m48388id = 1) int i, @Nullable @SafeParcelable.Param(m48388id = 2) String str, @Nullable @SafeParcelable.Param(m48388id = 3) String str2, @Nullable @SafeParcelable.Param(m48388id = 4) String str3) {
        this.f46797a = i;
        this.f46798b = str;
        this.f46799c = str2;
        this.f46800d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46797a);
        SafeParcelWriter.writeString(parcel, 2, this.f46798b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46799c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46800d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f46797a;
    }

    @Nullable
    public final String zzb() {
        return this.f46798b;
    }

    @Nullable
    public final String zzc() {
        return this.f46800d;
    }

    @Nullable
    public final String zzd() {
        return this.f46799c;
    }
}
