package p000;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;

/* renamed from: RK2 */
/* loaded from: classes3.dex */
public final class RK2 extends zzah {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder f5327a;

    public RK2(BaseImplementation.ResultHolder resultHolder) {
        this.f5327a = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        this.f5327a.setResult(zzaaVar.getStatus());
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
