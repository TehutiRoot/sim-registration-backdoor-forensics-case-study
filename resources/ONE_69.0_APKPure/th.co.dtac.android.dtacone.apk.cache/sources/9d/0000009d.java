package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzie;
import java.util.List;
import java.util.Map;

/* renamed from: Ae2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17298Ae2 extends AbstractC17570Ei2 {

    /* renamed from: a */
    public final zzie f177a;

    public C17298Ae2(zzie zzieVar) {
        super(null);
        Preconditions.checkNotNull(zzieVar);
        this.f177a = zzieVar;
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: a */
    public final Boolean mo68591a() {
        return (Boolean) this.f177a.zzg(4);
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: b */
    public final Double mo68590b() {
        return (Double) this.f177a.zzg(2);
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: c */
    public final Integer mo68589c() {
        return (Integer) this.f177a.zzg(3);
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: d */
    public final Long mo68588d() {
        return (Long) this.f177a.zzg(1);
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: e */
    public final String mo68587e() {
        return (String) this.f177a.zzg(0);
    }

    @Override // p000.AbstractC17570Ei2
    /* renamed from: f */
    public final Map mo68586f(boolean z) {
        return this.f177a.zzo(null, null, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final int zza(String str) {
        return this.f177a.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final long zzb() {
        return this.f177a.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Object zzg(int i) {
        return this.f177a.zzg(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzh() {
        return this.f177a.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzi() {
        return this.f177a.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzj() {
        return this.f177a.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzk() {
        return this.f177a.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final List zzm(String str, String str2) {
        return this.f177a.zzm(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Map zzo(String str, String str2, boolean z) {
        return this.f177a.zzo(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzp(String str) {
        this.f177a.zzp(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzq(String str, String str2, Bundle bundle) {
        this.f177a.zzq(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzr(String str) {
        this.f177a.zzr(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzs(String str, String str2, Bundle bundle) {
        this.f177a.zzs(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzt(String str, String str2, Bundle bundle, long j) {
        this.f177a.zzt(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzu(zzgz zzgzVar) {
        this.f177a.zzu(zzgzVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzv(Bundle bundle) {
        this.f177a.zzv(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzw(zzgy zzgyVar) {
        this.f177a.zzw(zzgyVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzx(zzgz zzgzVar) {
        this.f177a.zzx(zzgzVar);
    }
}