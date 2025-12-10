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
    public final String f47444a;

    /* renamed from: b */
    public final Rect f47445b;

    /* renamed from: c */
    public final List f47446c;

    /* renamed from: d */
    public final String f47447d;

    /* renamed from: e */
    public final float f47448e;

    /* renamed from: f */
    public final float f47449f;

    /* renamed from: g */
    public final List f47450g;

    @SafeParcelable.Constructor
    public zzvb(@SafeParcelable.Param(m48385id = 1) String str, @SafeParcelable.Param(m48385id = 2) Rect rect, @SafeParcelable.Param(m48385id = 3) List list, @SafeParcelable.Param(m48385id = 4) String str2, @SafeParcelable.Param(m48385id = 5) float f, @SafeParcelable.Param(m48385id = 6) float f2, @SafeParcelable.Param(m48385id = 7) List list2) {
        this.f47444a = str;
        this.f47445b = rect;
        this.f47446c = list;
        this.f47447d = str2;
        this.f47448e = f;
        this.f47449f = f2;
        this.f47450g = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47444a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47445b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f47446c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47447d, false);
        SafeParcelWriter.writeFloat(parcel, 5, this.f47448e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f47449f);
        SafeParcelWriter.writeTypedList(parcel, 7, this.f47450g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.f47449f;
    }

    public final float zzb() {
        return this.f47448e;
    }

    public final Rect zzc() {
        return this.f47445b;
    }

    public final String zzd() {
        return this.f47447d;
    }

    public final String zze() {
        return this.f47444a;
    }

    public final List zzf() {
        return this.f47446c;
    }

    public final List zzg() {
        return this.f47450g;
    }
}