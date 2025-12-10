package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
/* loaded from: classes3.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzbf();

    /* renamed from: a */
    public final String f46896a;

    /* renamed from: b */
    public final String f46897b;

    /* renamed from: c */
    public final String f46898c;

    /* renamed from: d */
    public final String f46899d;

    /* renamed from: e */
    public final String f46900e;

    /* renamed from: f */
    public final zzap f46901f;

    /* renamed from: g */
    public final zzap f46902g;

    @SafeParcelable.Constructor
    public zzaq(@Nullable @SafeParcelable.Param(m48385id = 1) String str, @Nullable @SafeParcelable.Param(m48385id = 2) String str2, @Nullable @SafeParcelable.Param(m48385id = 3) String str3, @Nullable @SafeParcelable.Param(m48385id = 4) String str4, @Nullable @SafeParcelable.Param(m48385id = 5) String str5, @Nullable @SafeParcelable.Param(m48385id = 6) zzap zzapVar, @Nullable @SafeParcelable.Param(m48385id = 7) zzap zzapVar2) {
        this.f46896a = str;
        this.f46897b = str2;
        this.f46898c = str3;
        this.f46899d = str4;
        this.f46900e = str5;
        this.f46901f = zzapVar;
        this.f46902g = zzapVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46896a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46897b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46898c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46899d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46900e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f46901f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f46902g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}