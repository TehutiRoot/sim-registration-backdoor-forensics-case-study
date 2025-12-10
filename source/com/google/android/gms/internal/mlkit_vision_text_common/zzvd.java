package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "TextLineParcelCreator")
/* loaded from: classes3.dex */
public final class zzvd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvd> CREATOR = new zzve();

    /* renamed from: a */
    public final String f47439a;

    /* renamed from: b */
    public final Rect f47440b;

    /* renamed from: c */
    public final List f47441c;

    /* renamed from: d */
    public final String f47442d;

    /* renamed from: e */
    public final List f47443e;

    /* renamed from: f */
    public final float f47444f;

    /* renamed from: g */
    public final float f47445g;

    @SafeParcelable.Constructor
    public zzvd(@SafeParcelable.Param(m48388id = 1) String str, @SafeParcelable.Param(m48388id = 2) Rect rect, @SafeParcelable.Param(m48388id = 3) List list, @SafeParcelable.Param(m48388id = 4) String str2, @SafeParcelable.Param(m48388id = 5) List list2, @SafeParcelable.Param(m48388id = 6) float f, @SafeParcelable.Param(m48388id = 7) float f2) {
        this.f47439a = str;
        this.f47440b = rect;
        this.f47441c = list;
        this.f47442d = str2;
        this.f47443e = list2;
        this.f47444f = f;
        this.f47445g = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47439a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47440b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f47441c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47442d, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f47443e, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f47444f);
        SafeParcelWriter.writeFloat(parcel, 7, this.f47445g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.f47445g;
    }

    public final float zzb() {
        return this.f47444f;
    }

    public final Rect zzc() {
        return this.f47440b;
    }

    public final String zzd() {
        return this.f47442d;
    }

    public final String zze() {
        return this.f47439a;
    }

    public final List zzf() {
        return this.f47441c;
    }

    public final List zzg() {
        return this.f47443e;
    }
}
