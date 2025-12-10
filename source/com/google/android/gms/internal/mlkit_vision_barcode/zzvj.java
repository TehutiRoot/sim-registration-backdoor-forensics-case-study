package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeParcelCreator")
/* loaded from: classes3.dex */
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvk();

    /* renamed from: a */
    public final int f46819a;

    /* renamed from: b */
    public final String f46820b;

    /* renamed from: c */
    public final String f46821c;

    /* renamed from: d */
    public final byte[] f46822d;

    /* renamed from: e */
    public final Point[] f46823e;

    /* renamed from: f */
    public final int f46824f;

    /* renamed from: g */
    public final zzvc f46825g;

    /* renamed from: h */
    public final zzvf f46826h;

    /* renamed from: i */
    public final zzvg f46827i;

    /* renamed from: j */
    public final zzvi f46828j;

    /* renamed from: k */
    public final zzvh f46829k;

    /* renamed from: l */
    public final zzvd f46830l;

    /* renamed from: m */
    public final zzuz f46831m;

    /* renamed from: n */
    public final zzva f46832n;

    /* renamed from: o */
    public final zzvb f46833o;

    @SafeParcelable.Constructor
    public zzvj(@SafeParcelable.Param(m48388id = 1) int i, @Nullable @SafeParcelable.Param(m48388id = 2) String str, @Nullable @SafeParcelable.Param(m48388id = 3) String str2, @Nullable @SafeParcelable.Param(m48388id = 4) byte[] bArr, @Nullable @SafeParcelable.Param(m48388id = 5) Point[] pointArr, @SafeParcelable.Param(m48388id = 6) int i2, @Nullable @SafeParcelable.Param(m48388id = 7) zzvc zzvcVar, @Nullable @SafeParcelable.Param(m48388id = 8) zzvf zzvfVar, @Nullable @SafeParcelable.Param(m48388id = 9) zzvg zzvgVar, @Nullable @SafeParcelable.Param(m48388id = 10) zzvi zzviVar, @Nullable @SafeParcelable.Param(m48388id = 11) zzvh zzvhVar, @Nullable @SafeParcelable.Param(m48388id = 12) zzvd zzvdVar, @Nullable @SafeParcelable.Param(m48388id = 13) zzuz zzuzVar, @Nullable @SafeParcelable.Param(m48388id = 14) zzva zzvaVar, @Nullable @SafeParcelable.Param(m48388id = 15) zzvb zzvbVar) {
        this.f46819a = i;
        this.f46820b = str;
        this.f46821c = str2;
        this.f46822d = bArr;
        this.f46823e = pointArr;
        this.f46824f = i2;
        this.f46825g = zzvcVar;
        this.f46826h = zzvfVar;
        this.f46827i = zzvgVar;
        this.f46828j = zzviVar;
        this.f46829k = zzvhVar;
        this.f46830l = zzvdVar;
        this.f46831m = zzuzVar;
        this.f46832n = zzvaVar;
        this.f46833o = zzvbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46819a);
        SafeParcelWriter.writeString(parcel, 2, this.f46820b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46821c, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f46822d, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f46823e, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f46824f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f46825g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f46826h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f46827i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f46828j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f46829k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f46830l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f46831m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f46832n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f46833o, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f46819a;
    }

    public final int zzb() {
        return this.f46824f;
    }

    @Nullable
    public final zzuz zzc() {
        return this.f46831m;
    }

    @Nullable
    public final zzva zzd() {
        return this.f46832n;
    }

    @Nullable
    public final zzvb zze() {
        return this.f46833o;
    }

    @Nullable
    public final zzvc zzf() {
        return this.f46825g;
    }

    @Nullable
    public final zzvd zzg() {
        return this.f46830l;
    }

    @Nullable
    public final zzvf zzh() {
        return this.f46826h;
    }

    @Nullable
    public final zzvg zzi() {
        return this.f46827i;
    }

    @Nullable
    public final zzvh zzj() {
        return this.f46829k;
    }

    @Nullable
    public final zzvi zzk() {
        return this.f46828j;
    }

    @Nullable
    public final String zzl() {
        return this.f46820b;
    }

    @Nullable
    public final String zzm() {
        return this.f46821c;
    }

    @Nullable
    public final byte[] zzn() {
        return this.f46822d;
    }

    @Nullable
    public final Point[] zzo() {
        return this.f46823e;
    }
}
