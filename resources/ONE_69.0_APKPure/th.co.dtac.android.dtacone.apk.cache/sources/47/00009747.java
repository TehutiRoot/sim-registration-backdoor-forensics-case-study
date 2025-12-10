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
    public final int f46946a;

    /* renamed from: b */
    public final String f46947b;

    /* renamed from: c */
    public final String f46948c;

    /* renamed from: d */
    public final byte[] f46949d;

    /* renamed from: e */
    public final Point[] f46950e;

    /* renamed from: f */
    public final int f46951f;

    /* renamed from: g */
    public final zzat f46952g;

    /* renamed from: h */
    public final zzaw f46953h;

    /* renamed from: i */
    public final zzax f46954i;

    /* renamed from: j */
    public final zzaz f46955j;

    /* renamed from: k */
    public final zzay f46956k;

    /* renamed from: l */
    public final zzau f46957l;

    /* renamed from: m */
    public final zzaq f46958m;

    /* renamed from: n */
    public final zzar f46959n;

    /* renamed from: o */
    public final zzas f46960o;

    @SafeParcelable.Constructor
    public zzba(@SafeParcelable.Param(m48385id = 1) int i, @Nullable @SafeParcelable.Param(m48385id = 2) String str, @Nullable @SafeParcelable.Param(m48385id = 3) String str2, @Nullable @SafeParcelable.Param(m48385id = 4) byte[] bArr, @Nullable @SafeParcelable.Param(m48385id = 5) Point[] pointArr, @SafeParcelable.Param(m48385id = 6) int i2, @Nullable @SafeParcelable.Param(m48385id = 7) zzat zzatVar, @Nullable @SafeParcelable.Param(m48385id = 8) zzaw zzawVar, @Nullable @SafeParcelable.Param(m48385id = 9) zzax zzaxVar, @Nullable @SafeParcelable.Param(m48385id = 10) zzaz zzazVar, @Nullable @SafeParcelable.Param(m48385id = 11) zzay zzayVar, @Nullable @SafeParcelable.Param(m48385id = 12) zzau zzauVar, @Nullable @SafeParcelable.Param(m48385id = 13) zzaq zzaqVar, @Nullable @SafeParcelable.Param(m48385id = 14) zzar zzarVar, @Nullable @SafeParcelable.Param(m48385id = 15) zzas zzasVar) {
        this.f46946a = i;
        this.f46947b = str;
        this.f46948c = str2;
        this.f46949d = bArr;
        this.f46950e = pointArr;
        this.f46951f = i2;
        this.f46952g = zzatVar;
        this.f46953h = zzawVar;
        this.f46954i = zzaxVar;
        this.f46955j = zzazVar;
        this.f46956k = zzayVar;
        this.f46957l = zzauVar;
        this.f46958m = zzaqVar;
        this.f46959n = zzarVar;
        this.f46960o = zzasVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46946a);
        SafeParcelWriter.writeString(parcel, 2, this.f46947b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46948c, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f46949d, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f46950e, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f46951f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f46952g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f46953h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f46954i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f46955j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f46956k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f46957l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f46958m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f46959n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f46960o, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}