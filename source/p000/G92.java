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

/* renamed from: G92 */
/* loaded from: classes3.dex */
public final class G92 extends AbstractC17732Hh2 {

    /* renamed from: a */
    public final zzfy f1828a;

    /* renamed from: b */
    public final zzid f1829b;

    public G92(zzfy zzfyVar) {
        super(null);
        Preconditions.checkNotNull(zzfyVar);
        this.f1828a = zzfyVar;
        this.f1829b = zzfyVar.zzq();
    }

    @Override // p000.AbstractC17732Hh2
    /* renamed from: a */
    public final Boolean mo68054a() {
        return this.f1829b.zzi();
    }

    @Override // p000.AbstractC17732Hh2
    /* renamed from: b */
    public final Double mo68053b() {
        return this.f1829b.zzj();
    }

    @Override // p000.AbstractC17732Hh2
    /* renamed from: c */
    public final Integer mo68052c() {
        return this.f1829b.zzl();
    }

    @Override // p000.AbstractC17732Hh2
    /* renamed from: d */
    public final Long mo68051d() {
        return this.f1829b.zzm();
    }

    @Override // p000.AbstractC17732Hh2
    /* renamed from: e */
    public final String mo68050e() {
        return this.f1829b.zzr();
    }

    @Override // p000.AbstractC17732Hh2
    /* renamed from: f */
    public final Map mo68049f(boolean z) {
        List<zzlc> zzt = this.f1829b.zzt(z);
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
        this.f1829b.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final long zzb() {
        return this.f1828a.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Object zzg(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return this.f1829b.zzi();
                    }
                    return this.f1829b.zzl();
                }
                return this.f1829b.zzj();
            }
            return this.f1829b.zzm();
        }
        return this.f1829b.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzh() {
        return this.f1829b.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzi() {
        return this.f1829b.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzj() {
        return this.f1829b.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzk() {
        return this.f1829b.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final List zzm(String str, String str2) {
        return this.f1829b.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Map zzo(String str, String str2, boolean z) {
        return this.f1829b.zzu(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzp(String str) {
        this.f1828a.zzd().zzd(str, this.f1828a.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzq(String str, String str2, Bundle bundle) {
        this.f1828a.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzr(String str) {
        this.f1828a.zzd().zze(str, this.f1828a.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzs(String str, String str2, Bundle bundle) {
        this.f1829b.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzt(String str, String str2, Bundle bundle, long j) {
        this.f1829b.zzE(str, str2, bundle, true, false, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzu(zzgz zzgzVar) {
        this.f1829b.zzJ(zzgzVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzv(Bundle bundle) {
        this.f1829b.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzw(zzgy zzgyVar) {
        this.f1829b.zzT(zzgyVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzx(zzgz zzgzVar) {
        this.f1829b.zzZ(zzgzVar);
    }
}
