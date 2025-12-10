package p000;

import android.net.Uri;
import com.google.android.gms.analytics.zzh;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.analytics.zzs;
import com.google.android.gms.analytics.zzt;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.List;

/* renamed from: RE2 */
/* loaded from: classes3.dex */
public final class RE2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzh f5448a;

    /* renamed from: b */
    public final /* synthetic */ zzr f5449b;

    public RE2(zzr zzrVar, zzh zzhVar) {
        this.f5449b = zzrVar;
        this.f5448a = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<zzs> list;
        zzh zzhVar = this.f5448a;
        zzhVar.m48732a().zze(zzhVar);
        list = this.f5449b.f44432b;
        for (zzs zzsVar : list) {
            zzsVar.zza();
        }
        zzh zzhVar2 = this.f5448a;
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        Preconditions.checkArgument(zzhVar2.zzm(), "Measurement must be submitted");
        List<zzt> zzf = zzhVar2.zzf();
        if (!zzf.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (zzt zztVar : zzf) {
                Uri zzb = zztVar.zzb();
                if (!hashSet.contains(zzb)) {
                    hashSet.add(zzb);
                    zztVar.zze(zzhVar2);
                }
            }
        }
    }
}