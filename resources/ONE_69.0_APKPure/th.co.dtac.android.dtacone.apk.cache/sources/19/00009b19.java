package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "TextSymbolParcelCreator")
/* loaded from: classes3.dex */
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvk();

    /* renamed from: a */
    public final String f47467a;

    /* renamed from: b */
    public final Rect f47468b;

    /* renamed from: c */
    public final List f47469c;

    /* renamed from: d */
    public final float f47470d;

    /* renamed from: e */
    public final float f47471e;

    @SafeParcelable.Constructor
    public zzvj(@SafeParcelable.Param(m48385id = 1) String str, @SafeParcelable.Param(m48385id = 2) Rect rect, @SafeParcelable.Param(m48385id = 3) List list, @SafeParcelable.Param(m48385id = 4) float f, @SafeParcelable.Param(m48385id = 5) float f2) {
        this.f47467a = str;
        this.f47468b = rect;
        this.f47469c = list;
        this.f47470d = f;
        this.f47471e = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47467a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47468b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f47469c, false);
        SafeParcelWriter.writeFloat(parcel, 4, this.f47470d);
        SafeParcelWriter.writeFloat(parcel, 5, this.f47471e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.f47471e;
    }

    public final float zzb() {
        return this.f47470d;
    }

    public final Rect zzc() {
        return this.f47468b;
    }

    public final String zzd() {
        return this.f47467a;
    }

    public final List zze() {
        return this.f47469c;
    }
}