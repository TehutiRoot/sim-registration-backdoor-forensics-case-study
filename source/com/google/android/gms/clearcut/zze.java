package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

@SafeParcelable.Class(creator = "LogEventParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    /* renamed from: a */
    public int[] f44592a;

    /* renamed from: b */
    public String[] f44593b;

    /* renamed from: c */
    public int[] f44594c;

    /* renamed from: d */
    public byte[][] f44595d;

    /* renamed from: e */
    public ExperimentTokens[] f44596e;

    /* renamed from: f */
    public boolean f44597f;
    public final zzha zzaa;
    @SafeParcelable.Field(m48389id = 2)
    public zzr zzag;
    @SafeParcelable.Field(m48389id = 3)
    public byte[] zzah;
    public final ClearcutLogger.zzb zzan;
    public final ClearcutLogger.zzb zzt;

    public zze(zzr zzrVar, zzha zzhaVar, ClearcutLogger.zzb zzbVar, ClearcutLogger.zzb zzbVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, ExperimentTokens[] experimentTokensArr, boolean z) {
        this.zzag = zzrVar;
        this.zzaa = zzhaVar;
        this.zzt = zzbVar;
        this.zzan = null;
        this.f44592a = iArr;
        this.f44593b = null;
        this.f44594c = iArr2;
        this.f44595d = null;
        this.f44596e = null;
        this.f44597f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (Objects.equal(this.zzag, zzeVar.zzag) && Arrays.equals(this.zzah, zzeVar.zzah) && Arrays.equals(this.f44592a, zzeVar.f44592a) && Arrays.equals(this.f44593b, zzeVar.f44593b) && Objects.equal(this.zzaa, zzeVar.zzaa) && Objects.equal(this.zzt, zzeVar.zzt) && Objects.equal(this.zzan, zzeVar.zzan) && Arrays.equals(this.f44594c, zzeVar.f44594c) && Arrays.deepEquals(this.f44595d, zzeVar.f44595d) && Arrays.equals(this.f44596e, zzeVar.f44596e) && this.f44597f == zzeVar.f44597f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzag, this.zzah, this.f44592a, this.f44593b, this.zzaa, this.zzt, this.zzan, this.f44594c, this.f44595d, this.f44596e, Boolean.valueOf(this.f44597f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.zzag);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.zzah;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f44592a));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f44593b));
        sb.append(", LogEvent: ");
        sb.append(this.zzaa);
        sb.append(", ExtensionProducer: ");
        sb.append(this.zzt);
        sb.append(", VeProducer: ");
        sb.append(this.zzan);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f44594c));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f44595d));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f44596e));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f44597f);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzag, i, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzah, false);
        SafeParcelWriter.writeIntArray(parcel, 4, this.f44592a, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.f44593b, false);
        SafeParcelWriter.writeIntArray(parcel, 6, this.f44594c, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.f44595d, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f44597f);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.f44596e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zze(zzr zzrVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.zzag = zzrVar;
        this.zzah = bArr;
        this.f44592a = iArr;
        this.f44593b = strArr;
        this.zzaa = null;
        this.zzt = null;
        this.zzan = null;
        this.f44594c = iArr2;
        this.f44595d = bArr2;
        this.f44596e = experimentTokensArr;
        this.f44597f = z;
    }
}
