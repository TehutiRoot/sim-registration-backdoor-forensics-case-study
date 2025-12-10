package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarDateTimeParcelCreator")
/* loaded from: classes3.dex */
public final class zzuy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuy> CREATOR = new zzvn();

    /* renamed from: a */
    public final int f46761a;

    /* renamed from: b */
    public final int f46762b;

    /* renamed from: c */
    public final int f46763c;

    /* renamed from: d */
    public final int f46764d;

    /* renamed from: e */
    public final int f46765e;

    /* renamed from: f */
    public final int f46766f;

    /* renamed from: g */
    public final boolean f46767g;

    /* renamed from: h */
    public final String f46768h;

    @SafeParcelable.Constructor
    public zzuy(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) int i2, @SafeParcelable.Param(m48388id = 3) int i3, @SafeParcelable.Param(m48388id = 4) int i4, @SafeParcelable.Param(m48388id = 5) int i5, @SafeParcelable.Param(m48388id = 6) int i6, @SafeParcelable.Param(m48388id = 7) boolean z, @Nullable @SafeParcelable.Param(m48388id = 8) String str) {
        this.f46761a = i;
        this.f46762b = i2;
        this.f46763c = i3;
        this.f46764d = i4;
        this.f46765e = i5;
        this.f46766f = i6;
        this.f46767g = z;
        this.f46768h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46761a);
        SafeParcelWriter.writeInt(parcel, 2, this.f46762b);
        SafeParcelWriter.writeInt(parcel, 3, this.f46763c);
        SafeParcelWriter.writeInt(parcel, 4, this.f46764d);
        SafeParcelWriter.writeInt(parcel, 5, this.f46765e);
        SafeParcelWriter.writeInt(parcel, 6, this.f46766f);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f46767g);
        SafeParcelWriter.writeString(parcel, 8, this.f46768h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f46763c;
    }

    public final int zzb() {
        return this.f46764d;
    }

    public final int zzc() {
        return this.f46765e;
    }

    public final int zzd() {
        return this.f46762b;
    }

    public final int zze() {
        return this.f46766f;
    }

    public final int zzf() {
        return this.f46761a;
    }

    @Nullable
    public final String zzg() {
        return this.f46768h;
    }

    public final boolean zzh() {
        return this.f46767g;
    }
}
