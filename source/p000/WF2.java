package p000;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzo;
import java.util.List;

/* renamed from: WF2 */
/* loaded from: classes3.dex */
public final class WF2 extends zzai {

    /* renamed from: a */
    public final /* synthetic */ zzo f7175a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WF2(zzn zznVar, String str, zzo zzoVar) {
        super("getValue");
        this.f7175a = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh("getValue", 2, list);
        zzap zzb = zzgVar.zzb((zzap) list.get(0));
        zzap zzb2 = zzgVar.zzb((zzap) list.get(1));
        String zza = this.f7175a.zza(zzb.zzi());
        if (zza != null) {
            return new zzat(zza);
        }
        return zzb2;
    }
}
