package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PersonNameParcelCreator")
/* loaded from: classes3.dex */
public final class zzve extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzve> CREATOR = new zzvx();

    /* renamed from: a */
    public final String f46803a;

    /* renamed from: b */
    public final String f46804b;

    /* renamed from: c */
    public final String f46805c;

    /* renamed from: d */
    public final String f46806d;

    /* renamed from: e */
    public final String f46807e;

    /* renamed from: f */
    public final String f46808f;

    /* renamed from: g */
    public final String f46809g;

    @SafeParcelable.Constructor
    public zzve(@Nullable @SafeParcelable.Param(m48388id = 1) String str, @Nullable @SafeParcelable.Param(m48388id = 2) String str2, @Nullable @SafeParcelable.Param(m48388id = 3) String str3, @Nullable @SafeParcelable.Param(m48388id = 4) String str4, @Nullable @SafeParcelable.Param(m48388id = 5) String str5, @Nullable @SafeParcelable.Param(m48388id = 6) String str6, @Nullable @SafeParcelable.Param(m48388id = 7) String str7) {
        this.f46803a = str;
        this.f46804b = str2;
        this.f46805c = str3;
        this.f46806d = str4;
        this.f46807e = str5;
        this.f46808f = str6;
        this.f46809g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46803a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46804b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46805c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46806d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46807e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f46808f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f46809g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.f46806d;
    }

    @Nullable
    public final String zzb() {
        return this.f46803a;
    }

    @Nullable
    public final String zzc() {
        return this.f46808f;
    }

    @Nullable
    public final String zzd() {
        return this.f46807e;
    }

    @Nullable
    public final String zze() {
        return this.f46805c;
    }

    @Nullable
    public final String zzf() {
        return this.f46804b;
    }

    @Nullable
    public final String zzg() {
        return this.f46809g;
    }
}
