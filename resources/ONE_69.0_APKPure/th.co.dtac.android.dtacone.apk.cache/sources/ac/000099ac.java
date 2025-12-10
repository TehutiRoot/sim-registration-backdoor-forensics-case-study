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
    public final int f47259a;

    /* renamed from: b */
    public final Rect f47260b;

    /* renamed from: c */
    public final float f47261c;

    /* renamed from: d */
    public final float f47262d;

    /* renamed from: e */
    public final float f47263e;

    /* renamed from: f */
    public final float f47264f;

    /* renamed from: g */
    public final float f47265g;

    /* renamed from: h */
    public final float f47266h;

    /* renamed from: i */
    public final float f47267i;

    /* renamed from: j */
    public final List f47268j;

    /* renamed from: k */
    public final List f47269k;

    @SafeParcelable.Constructor
    public zzow(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) Rect rect, @SafeParcelable.Param(m48385id = 3) float f, @SafeParcelable.Param(m48385id = 4) float f2, @SafeParcelable.Param(m48385id = 5) float f3, @SafeParcelable.Param(m48385id = 6) float f4, @SafeParcelable.Param(m48385id = 7) float f5, @SafeParcelable.Param(m48385id = 8) float f6, @SafeParcelable.Param(m48385id = 9) float f7, @SafeParcelable.Param(m48385id = 10) List list, @SafeParcelable.Param(m48385id = 11) List list2) {
        this.f47259a = i;
        this.f47260b = rect;
        this.f47261c = f;
        this.f47262d = f2;
        this.f47263e = f3;
        this.f47264f = f4;
        this.f47265g = f5;
        this.f47266h = f6;
        this.f47267i = f7;
        this.f47268j = list;
        this.f47269k = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47259a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47260b, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f47261c);
        SafeParcelWriter.writeFloat(parcel, 4, this.f47262d);
        SafeParcelWriter.writeFloat(parcel, 5, this.f47263e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f47264f);
        SafeParcelWriter.writeFloat(parcel, 7, this.f47265g);
        SafeParcelWriter.writeFloat(parcel, 8, this.f47266h);
        SafeParcelWriter.writeFloat(parcel, 9, this.f47267i);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f47268j, false);
        SafeParcelWriter.writeTypedList(parcel, 11, this.f47269k, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.f47264f;
    }

    public final float zzb() {
        return this.f47262d;
    }

    public final float zzc() {
        return this.f47265g;
    }

    public final float zzd() {
        return this.f47261c;
    }

    public final float zze() {
        return this.f47266h;
    }

    public final float zzf() {
        return this.f47263e;
    }

    public final int zzg() {
        return this.f47259a;
    }

    public final Rect zzh() {
        return this.f47260b;
    }

    public final List zzi() {
        return this.f47269k;
    }

    public final List zzj() {
        return this.f47268j;
    }
}