package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
/* loaded from: classes3.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* renamed from: a */
    public final boolean f45351a;

    /* renamed from: b */
    public final String f45352b;

    /* renamed from: c */
    public final int f45353c;

    /* renamed from: d */
    public final int f45354d;

    public zzq(boolean z, String str, int i, int i2) {
        this.f45351a = z;
        this.f45352b = str;
        this.f45353c = AbstractC20372iL2.m30643a(i) - 1;
        this.f45354d = zzd.m48321a(i2) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f45351a);
        SafeParcelWriter.writeString(parcel, 2, this.f45352b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f45353c);
        SafeParcelWriter.writeInt(parcel, 4, this.f45354d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.f45352b;
    }

    public final boolean zzb() {
        return this.f45351a;
    }

    public final int zzc() {
        return zzd.m48321a(this.f45354d);
    }

    public final int zzd() {
        return AbstractC20372iL2.m30643a(this.f45353c);
    }
}
