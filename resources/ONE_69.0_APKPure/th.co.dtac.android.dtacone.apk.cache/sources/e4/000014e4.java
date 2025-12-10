package p000;

import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.clearcut.zzfz;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzj;
import com.google.android.gms.internal.clearcut.zzn;

/* renamed from: Vt2 */
/* loaded from: classes3.dex */
public final class Vt2 extends BaseImplementation.ApiMethodImpl {

    /* renamed from: c */
    public final zze f7120c;

    public Vt2(zze zzeVar, GoogleApiClient googleApiClient) {
        super(ClearcutLogger.API, googleApiClient);
        this.f7120c = zzeVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzj zzjVar = (zzj) anyClient;
        BinderC20354hx2 binderC20354hx2 = new BinderC20354hx2(this);
        try {
            zze zzeVar = this.f7120c;
            ClearcutLogger.zzb zzbVar = zzeVar.zzt;
            if (zzbVar != null) {
                zzha zzhaVar = zzeVar.zzaa;
                if (zzhaVar.zzbjp.length == 0) {
                    zzhaVar.zzbjp = zzbVar.zza();
                }
            }
            ClearcutLogger.zzb zzbVar2 = zzeVar.zzan;
            if (zzbVar2 != null) {
                zzha zzhaVar2 = zzeVar.zzaa;
                if (zzhaVar2.zzbjw.length == 0) {
                    zzhaVar2.zzbjw = zzbVar2.zza();
                }
            }
            zzha zzhaVar3 = zzeVar.zzaa;
            int zzas = zzhaVar3.zzas();
            byte[] bArr = new byte[zzas];
            zzfz.zza(zzhaVar3, bArr, 0, zzas);
            zzeVar.zzah = bArr;
            ((zzn) zzjVar.getService()).zza(binderC20354hx2, this.f7120c);
        } catch (RuntimeException unused) {
            setFailedResult(new Status(10, "MessageProducer"));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}