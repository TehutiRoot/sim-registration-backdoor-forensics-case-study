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
    public final String f46884a;

    /* renamed from: b */
    public final String f46885b;

    /* renamed from: c */
    public final String f46886c;

    /* renamed from: d */
    public final String f46887d;

    /* renamed from: e */
    public final String f46888e;

    /* renamed from: f */
    public final zzap f46889f;

    /* renamed from: g */
    public final zzap f46890g;

    @SafeParcelable.Constructor
    public zzaq(@Nullable @SafeParcelable.Param(m48388id = 1) String str, @Nullable @SafeParcelable.Param(m48388id = 2) String str2, @Nullable @SafeParcelable.Param(m48388id = 3) String str3, @Nullable @SafeParcelable.Param(m48388id = 4) String str4, @Nullable @SafeParcelable.Param(m48388id = 5) String str5, @Nullable @SafeParcelable.Param(m48388id = 6) zzap zzapVar, @Nullable @SafeParcelable.Param(m48388id = 7) zzap zzapVar2) {
        this.f46884a = str;
        this.f46885b = str2;
        this.f46886c = str3;
        this.f46887d = str4;
        this.f46888e = str5;
        this.f46889f = zzapVar;
        this.f46890g = zzapVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46884a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46885b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46886c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46887d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46888e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f46889f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f46890g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
