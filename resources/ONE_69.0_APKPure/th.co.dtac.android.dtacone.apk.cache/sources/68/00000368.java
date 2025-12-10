package p000;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzlc;
import java.util.List;
import java.util.Map;

/* renamed from: Da2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17481Da2 extends AbstractC17570Ei2 {

    /* renamed from: a */
    public final zzfy f1051a;

    /* renamed from: b */
    public final zzid f1052b;

    public C17481Da2(zzfy zzfyVar) {
        super(null);
        Preconditions.checkNotNull(zzfyVar);
        this.f1051a = zzfyVar;
        this.f1052b = zzfyVar.zzq();
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: a */
    public final Boolean mo68591a() {
        return this.f1052b.zzi();
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: b */
    public final Double mo68590b() {
        return this.f1052b.zzj();
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: c */
    public final Integer mo68589c() {
        return this.f1052b.zzl();
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: d */
    public final Long mo68588d() {
        return this.f1052b.zzm();
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: e */
    public final String mo68587e() {
        return this.f1052b.zzr();
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: f */
    public final Map mo68586f(boolean z) {
        List<zzlc> zzt = this.f1052b.zzt(z);
        ArrayMap arrayMap = new ArrayMap(zzt.size());
        for (zzlc zzlcVar : zzt) {
            Object zza = zzlcVar.zza();
            if (zza != null) {
                arrayMap.put(zzlcVar.zzb, zza);
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final int zza(String str) {
        this.f1052b.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final long zzb() {
        return this.f1051a.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Object zzg(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return this.f1052b.zzi();
                    }
                    return this.f1052b.zzl();
                }
                return this.f1052b.zzj();
            }
            return this.f1052b.zzm();
        }
        return this.f1052b.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzh() {
        return this.f1052b.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzi() {
        return this.f1052b.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzj() {
        return this.f1052b.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzk() {
        return this.f1052b.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final List zzm(String str, String str2) {
        return this.f1052b.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Map zzo(String str, String str2, boolean z) {
        return this.f1052b.zzu(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzp(String str) {
        this.f1051a.zzd().zzd(str, this.f1051a.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzq(String str, String str2, Bundle bundle) {
        this.f1051a.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzr(String str) {
        this.f1051a.zzd().zze(str, this.f1051a.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzs(String str, String str2, Bundle bundle) {
        this.f1052b.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzt(String str, String str2, Bundle bundle, long j) {
        this.f1052b.zzE(str, str2, bundle, true, false, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzu(zzgz zzgzVar) {
        this.f1052b.zzJ(zzgzVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzv(Bundle bundle) {
        this.f1052b.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzw(zzgy zzgyVar) {
        this.f1052b.zzT(zzgyVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzx(zzgz zzgzVar) {
        this.f1052b.zzZ(zzgzVar);
    }
}