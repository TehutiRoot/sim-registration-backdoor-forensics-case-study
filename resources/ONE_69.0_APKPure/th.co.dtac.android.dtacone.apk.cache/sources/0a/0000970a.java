package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SmsParcelCreator")
/* loaded from: classes3.dex */
public final class zzvg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvg> CREATOR = new zzvz();

    /* renamed from: a */
    public final String f46824a;

    /* renamed from: b */
    public final String f46825b;

    @SafeParcelable.Constructor
    public zzvg(@Nullable @SafeParcelable.Param(m48385id = 1) String str, @Nullable @SafeParcelable.Param(m48385id = 2) String str2) {
        this.f46824a = str;
        this.f46825b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46824a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46825b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.f46824a;
    }

    @Nullable
    public final String zzb() {
        return this.f46825b;
    }
}