package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeParcelCreator")
/* loaded from: classes3.dex */
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    /* renamed from: a */
    public final int f46934a;

    /* renamed from: b */
    public final String f46935b;

    /* renamed from: c */
    public final String f46936c;

    /* renamed from: d */
    public final byte[] f46937d;

    /* renamed from: e */
    public final Point[] f46938e;

    /* renamed from: f */
    public final int f46939f;

    /* renamed from: g */
    public final zzat f46940g;

    /* renamed from: h */
    public final zzaw f46941h;

    /* renamed from: i */
    public final zzax f46942i;

    /* renamed from: j */
    public final zzaz f46943j;

    /* renamed from: k */
    public final zzay f46944k;

    /* renamed from: l */
    public final zzau f46945l;

    /* renamed from: m */
    public final zzaq f46946m;

    /* renamed from: n */
    public final zzar f46947n;

    /* renamed from: o */
    public final zzas f46948o;

    @SafeParcelable.Constructor
    public zzba(@SafeParcelable.Param(m48388id = 1) int i, @Nullable @SafeParcelable.Param(m48388id = 2) String str, @Nullable @SafeParcelable.Param(m48388id = 3) String str2, @Nullable @SafeParcelable.Param(m48388id = 4) byte[] bArr, @Nullable @SafeParcelable.Param(m48388id = 5) Point[] pointArr, @SafeParcelable.Param(m48388id = 6) int i2, @Nullable @SafeParcelable.Param(m48388id = 7) zzat zzatVar, @Nullable @SafeParcelable.Param(m48388id = 8) zzaw zzawVar, @Nullable @SafeParcelable.Param(m48388id = 9) zzax zzaxVar, @Nullable @SafeParcelable.Param(m48388id = 10) zzaz zzazVar, @Nullable @SafeParcelable.Param(m48388id = 11) zzay zzayVar, @Nullable @SafeParcelable.Param(m48388id = 12) zzau zzauVar, @Nullable @SafeParcelable.Param(m48388id = 13) zzaq zzaqVar, @Nullable @SafeParcelable.Param(m48388id = 14) zzar zzarVar, @Nullable @SafeParcelable.Param(m48388id = 15) zzas zzasVar) {
        this.f46934a = i;
        this.f46935b = str;
        this.f46936c = str2;
        this.f46937d = bArr;
        this.f46938e = pointArr;
        this.f46939f = i2;
        this.f46940g = zzatVar;
        this.f46941h = zzawVar;
        this.f46942i = zzaxVar;
        this.f46943j = zzazVar;
        this.f46944k = zzayVar;
        this.f46945l = zzauVar;
        this.f46946m = zzaqVar;
        this.f46947n = zzarVar;
        this.f46948o = zzasVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46934a);
        SafeParcelWriter.writeString(parcel, 2, this.f46935b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46936c, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f46937d, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f46938e, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f46939f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f46940g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f46941h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f46942i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f46943j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f46944k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f46945l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f46946m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f46947n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f46948o, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
