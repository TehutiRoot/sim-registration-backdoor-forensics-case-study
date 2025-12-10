package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.clearcut.zzge;

@SafeParcelable.Class(creator = "PlayLoggerContextCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* renamed from: a */
    public final String f45643a;

    /* renamed from: b */
    public final int f45644b;

    /* renamed from: c */
    public final String f45645c;

    /* renamed from: d */
    public final String f45646d;

    /* renamed from: e */
    public final boolean f45647e;

    /* renamed from: f */
    public final boolean f45648f;

    /* renamed from: g */
    public final int f45649g;
    @SafeParcelable.Field(m48389id = 8)
    public final String zzj;
    @SafeParcelable.Field(m48389id = 4)
    public final int zzk;

    public zzr(String str, int i, int i2, String str2, String str3, String str4, boolean z, zzge.zzv.zzb zzbVar) {
        this.f45643a = (String) Preconditions.checkNotNull(str);
        this.f45644b = i;
        this.zzk = i2;
        this.zzj = str2;
        this.f45645c = str3;
        this.f45646d = str4;
        this.f45647e = !z;
        this.f45648f = z;
        this.f45649g = zzbVar.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            if (Objects.equal(this.f45643a, zzrVar.f45643a) && this.f45644b == zzrVar.f45644b && this.zzk == zzrVar.zzk && Objects.equal(this.zzj, zzrVar.zzj) && Objects.equal(this.f45645c, zzrVar.f45645c) && Objects.equal(this.f45646d, zzrVar.f45646d) && this.f45647e == zzrVar.f45647e && this.f45648f == zzrVar.f45648f && this.f45649g == zzrVar.f45649g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45643a, Integer.valueOf(this.f45644b), Integer.valueOf(this.zzk), this.zzj, this.f45645c, this.f45646d, Boolean.valueOf(this.f45647e), Boolean.valueOf(this.f45648f), Integer.valueOf(this.f45649g));
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f45643a + ",packageVersionCode=" + this.f45644b + ",logSource=" + this.zzk + ",logSourceName=" + this.zzj + ",uploadAccount=" + this.f45645c + ",loggingId=" + this.f45646d + ",logAndroidId=" + this.f45647e + ",isAnonymous=" + this.f45648f + ",qosTier=" + this.f45649g + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f45643a, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f45644b);
        SafeParcelWriter.writeInt(parcel, 4, this.zzk);
        SafeParcelWriter.writeString(parcel, 5, this.f45645c, false);
        SafeParcelWriter.writeString(parcel, 6, this.f45646d, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f45647e);
        SafeParcelWriter.writeString(parcel, 8, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f45648f);
        SafeParcelWriter.writeInt(parcel, 10, this.f45649g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(m48388id = 2) String str, @SafeParcelable.Param(m48388id = 3) int i, @SafeParcelable.Param(m48388id = 4) int i2, @SafeParcelable.Param(m48388id = 5) String str2, @SafeParcelable.Param(m48388id = 6) String str3, @SafeParcelable.Param(m48388id = 7) boolean z, @SafeParcelable.Param(m48388id = 8) String str4, @SafeParcelable.Param(m48388id = 9) boolean z2, @SafeParcelable.Param(m48388id = 10) int i3) {
        this.f45643a = str;
        this.f45644b = i;
        this.zzk = i2;
        this.f45645c = str2;
        this.f45646d = str3;
        this.f45647e = z;
        this.zzj = str4;
        this.f45648f = z2;
        this.f45649g = i3;
    }
}
