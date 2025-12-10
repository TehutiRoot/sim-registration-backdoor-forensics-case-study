package p000;

import android.net.Uri;
import com.google.android.gms.analytics.zzh;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.analytics.zzs;
import com.google.android.gms.analytics.zzt;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.List;

/* renamed from: UD2 */
/* loaded from: classes3.dex */
public final class UD2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzh f6253a;

    /* renamed from: b */
    public final /* synthetic */ zzr f6254b;

    public UD2(zzr zzrVar, zzh zzhVar) {
        this.f6254b = zzrVar;
        this.f6253a = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<zzs> list;
        zzh zzhVar = this.f6253a;
        zzhVar.m48735a().zze(zzhVar);
        list = this.f6254b.f44420b;
        for (zzs zzsVar : list) {
            zzsVar.zza();
        }
        zzh zzhVar2 = this.f6253a;
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
