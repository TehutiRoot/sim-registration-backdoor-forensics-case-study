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
    public final String f47451a;

    /* renamed from: b */
    public final Rect f47452b;

    /* renamed from: c */
    public final List f47453c;

    /* renamed from: d */
    public final String f47454d;

    /* renamed from: e */
    public final List f47455e;

    /* renamed from: f */
    public final float f47456f;

    /* renamed from: g */
    public final float f47457g;

    @SafeParcelable.Constructor
    public zzvd(@SafeParcelable.Param(m48385id = 1) String str, @SafeParcelable.Param(m48385id = 2) Rect rect, @SafeParcelable.Param(m48385id = 3) List list, @SafeParcelable.Param(m48385id = 4) String str2, @SafeParcelable.Param(m48385id = 5) List list2, @SafeParcelable.Param(m48385id = 6) float f, @SafeParcelable.Param(m48385id = 7) float f2) {
        this.f47451a = str;
        this.f47452b = rect;
        this.f47453c = list;
        this.f47454d = str2;
        this.f47455e = list2;
        this.f47456f = f;
        this.f47457g = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47451a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47452b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f47453c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47454d, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f47455e, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f47456f);
        SafeParcelWriter.writeFloat(parcel, 7, this.f47457g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.f47457g;
    }

    public final float zzb() {
        return this.f47456f;
    }

    public final Rect zzc() {
        return this.f47452b;
    }

    public final String zzd() {
        return this.f47454d;
    }

    public final String zze() {
        return this.f47451a;
    }

    public final List zzf() {
        return this.f47453c;
    }

    public final List zzg() {
        return this.f47455e;
    }
}