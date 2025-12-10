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
    public final zzav f46903a;

    /* renamed from: b */
    public final String f46904b;

    /* renamed from: c */
    public final String f46905c;

    /* renamed from: d */
    public final zzaw[] f46906d;

    /* renamed from: e */
    public final zzat[] f46907e;

    /* renamed from: f */
    public final String[] f46908f;

    /* renamed from: g */
    public final zzao[] f46909g;

    @SafeParcelable.Constructor
    public zzar(@Nullable @SafeParcelable.Param(m48385id = 1) zzav zzavVar, @Nullable @SafeParcelable.Param(m48385id = 2) String str, @Nullable @SafeParcelable.Param(m48385id = 3) String str2, @Nullable @SafeParcelable.Param(m48385id = 4) zzaw[] zzawVarArr, @Nullable @SafeParcelable.Param(m48385id = 5) zzat[] zzatVarArr, @Nullable @SafeParcelable.Param(m48385id = 6) String[] strArr, @Nullable @SafeParcelable.Param(m48385id = 7) zzao[] zzaoVarArr) {
        this.f46903a = zzavVar;
        this.f46904b = str;
        this.f46905c = str2;
        this.f46906d = zzawVarArr;
        this.f46907e = zzatVarArr;
        this.f46908f = strArr;
        this.f46909g = zzaoVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f46903a, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46904b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46905c, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f46906d, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f46907e, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f46908f, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.f46909g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}