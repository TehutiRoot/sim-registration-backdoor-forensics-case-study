package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "TextElementParcelCreator")
/* loaded from: classes3.dex */
public final class zzvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvb> CREATOR = new zzvc();

    /* renamed from: a */
    public final String f47432a;

    /* renamed from: b */
    public final Rect f47433b;

    /* renamed from: c */
    public final List f47434c;

    /* renamed from: d */
    public final String f47435d;

    /* renamed from: e */
    public final float f47436e;

    /* renamed from: f */
    public final float f47437f;

    /* renamed from: g */
    public final List f47438g;

    @SafeParcelable.Constructor
    public zzvb(@SafeParcelable.Param(m48388id = 1) String str, @SafeParcelable.Param(m48388id = 2) Rect rect, @SafeParcelable.Param(m48388id = 3) List list, @SafeParcelable.Param(m48388id = 4) String str2, @SafeParcelable.Param(m48388id = 5) float f, @SafeParcelable.Param(m48388id = 6) float f2, @SafeParcelable.Param(m48388id = 7) List list2) {
        this.f47432a = str;
        this.f47433b = rect;
        this.f47434c = list;
        this.f47435d = str2;
        this.f47436e = f;
        this.f47437f = f2;
        this.f47438g = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47432a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47433b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f47434c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47435d, false);
        SafeParcelWriter.writeFloat(parcel, 5, this.f47436e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f47437f);
        SafeParcelWriter.writeTypedList(parcel, 7, this.f47438g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.f47437f;
    }

    public final float zzb() {
        return this.f47436e;
    }

    public final Rect zzc() {
        return this.f47433b;
    }

    public final String zzd() {
        return this.f47435d;
    }

    public final String zze() {
        return this.f47432a;
    }

    public final List zzf() {
        return this.f47434c;
    }

    public final List zzg() {
        return this.f47438g;
    }
}
