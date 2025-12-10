package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "FaceParcelCreator")
/* loaded from: classes3.dex */
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new zzox();

    /* renamed from: a */
    public final int f47247a;

    /* renamed from: b */
    public final Rect f47248b;

    /* renamed from: c */
    public final float f47249c;

    /* renamed from: d */
    public final float f47250d;

    /* renamed from: e */
    public final float f47251e;

    /* renamed from: f */
    public final float f47252f;

    /* renamed from: g */
    public final float f47253g;

    /* renamed from: h */
    public final float f47254h;

    /* renamed from: i */
    public final float f47255i;

    /* renamed from: j */
    public final List f47256j;

    /* renamed from: k */
    public final List f47257k;

    @SafeParcelable.Constructor
    public zzow(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) Rect rect, @SafeParcelable.Param(m48388id = 3) float f, @SafeParcelable.Param(m48388id = 4) float f2, @SafeParcelable.Param(m48388id = 5) float f3, @SafeParcelable.Param(m48388id = 6) float f4, @SafeParcelable.Param(m48388id = 7) float f5, @SafeParcelable.Param(m48388id = 8) float f6, @SafeParcelable.Param(m48388id = 9) float f7, @SafeParcelable.Param(m48388id = 10) List list, @SafeParcelable.Param(m48388id = 11) List list2) {
        this.f47247a = i;
        this.f47248b = rect;
        this.f47249c = f;
        this.f47250d = f2;
        this.f47251e = f3;
        this.f47252f = f4;
        this.f47253g = f5;
        this.f47254h = f6;
        this.f47255i = f7;
        this.f47256j = list;
        this.f47257k = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47247a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47248b, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f47249c);
        SafeParcelWriter.writeFloat(parcel, 4, this.f47250d);
        SafeParcelWriter.writeFloat(parcel, 5, this.f47251e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f47252f);
        SafeParcelWriter.writeFloat(parcel, 7, this.f47253g);
        SafeParcelWriter.writeFloat(parcel, 8, this.f47254h);
        SafeParcelWriter.writeFloat(parcel, 9, this.f47255i);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f47256j, false);
        SafeParcelWriter.writeTypedList(parcel, 11, this.f47257k, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.f47252f;
    }

    public final float zzb() {
        return this.f47250d;
    }

    public final float zzc() {
        return this.f47253g;
    }

    public final float zzd() {
        return this.f47249c;
    }

    public final float zze() {
        return this.f47254h;
    }

    public final float zzf() {
        return this.f47251e;
    }

    public final int zzg() {
        return this.f47247a;
    }

    public final Rect zzh() {
        return this.f47248b;
    }

    public final List zzi() {
        return this.f47257k;
    }

    public final List zzj() {
        return this.f47256j;
    }
}
