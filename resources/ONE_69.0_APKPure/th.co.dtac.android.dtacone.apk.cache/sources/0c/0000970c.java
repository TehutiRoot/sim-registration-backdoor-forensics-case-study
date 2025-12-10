package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WiFiParcelCreator")
/* loaded from: classes3.dex */
public final class zzvi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvi> CREATOR = new zzwb();

    /* renamed from: a */
    public final String f46828a;

    /* renamed from: b */
    public final String f46829b;

    /* renamed from: c */
    public final int f46830c;

    @SafeParcelable.Constructor
    public zzvi(@Nullable @SafeParcelable.Param(m48385id = 1) String str, @Nullable @SafeParcelable.Param(m48385id = 2) String str2, @SafeParcelable.Param(m48385id = 3) int i) {
        this.f46828a = str;
        this.f46829b = str2;
        this.f46830c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46828a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46829b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f46830c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f46830c;
    }

    @Nullable
    public final String zzb() {
        return this.f46829b;
    }

    @Nullable
    public final String zzc() {
        return this.f46828a;
    }
}