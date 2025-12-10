package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbk;
import com.google.android.gms.internal.gtm.zzbx;
import java.util.ListIterator;

@VisibleForTesting
/* loaded from: classes3.dex */
public class zza extends zzk {

    /* renamed from: c */
    public final zzbx f44397c;

    /* renamed from: d */
    public boolean f44398d;

    @VisibleForTesting
    public zza(zzbx zzbxVar) {
        super(zzbxVar.zzd(), zzbxVar.zzr());
        this.f44397c = zzbxVar;
    }

    /* renamed from: a */
    public final zzbx m48741a() {
        return this.f44397c;
    }

    public final zzh zza() {
        zzh zzhVar = new zzh(this.zza);
        zzhVar.zzg(this.f44397c.zzh().zza());
        zzhVar.zzg(this.f44397c.zzk().zza());
        zzn(zzhVar);
        return zzhVar;
    }

    public final void zzc(String str) {
        Preconditions.checkNotEmpty(str);
        zzh zzhVar = this.zza;
        Uri m48740b = zzb.m48740b(str);
        ListIterator listIterator = zzhVar.zzf().listIterator();
        while (listIterator.hasNext()) {
            if (m48740b.equals(((zzt) listIterator.next()).zzb())) {
                listIterator.remove();
            }
        }
        this.zza.zzf().add(new zzb(this.f44397c, str));
    }

    public final void zzd(boolean z) {
        this.f44398d = z;
    }

    @Override // com.google.android.gms.analytics.zzk
    public final void zze(zzh zzhVar) {
        zzbg zzbgVar = (zzbg) zzhVar.zzb(zzbg.class);
        if (TextUtils.isEmpty(zzbgVar.zze())) {
            zzbgVar.zzj(this.f44397c.zzi().zzb());
        }
        if (this.f44398d && TextUtils.isEmpty(zzbgVar.zzd())) {
            zzbk zze = this.f44397c.zze();
            zzbgVar.zzi(zze.zza());
            zzbgVar.zzh(zze.zzb());
        }
    }
}
