package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
/* loaded from: classes3.dex */
public final class zzar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzar> CREATOR = new zzbg();

    /* renamed from: a */
    public final zzav f46891a;

    /* renamed from: b */
    public final String f46892b;

    /* renamed from: c */
    public final String f46893c;

    /* renamed from: d */
    public final zzaw[] f46894d;

    /* renamed from: e */
    public final zzat[] f46895e;

    /* renamed from: f */
    public final String[] f46896f;

    /* renamed from: g */
    public final zzao[] f46897g;

    @SafeParcelable.Constructor
    public zzar(@Nullable @SafeParcelable.Param(m48388id = 1) zzav zzavVar, @Nullable @SafeParcelable.Param(m48388id = 2) String str, @Nullable @SafeParcelable.Param(m48388id = 3) String str2, @Nullable @SafeParcelable.Param(m48388id = 4) zzaw[] zzawVarArr, @Nullable @SafeParcelable.Param(m48388id = 5) zzat[] zzatVarArr, @Nullable @SafeParcelable.Param(m48388id = 6) String[] strArr, @Nullable @SafeParcelable.Param(m48388id = 7) zzao[] zzaoVarArr) {
        this.f46891a = zzavVar;
        this.f46892b = str;
        this.f46893c = str2;
        this.f46894d = zzawVarArr;
        this.f46895e = zzatVarArr;
        this.f46896f = strArr;
        this.f46897g = zzaoVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f46891a, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46892b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46893c, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f46894d, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f46895e, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f46896f, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.f46897g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
