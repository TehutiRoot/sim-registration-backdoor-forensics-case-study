package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.internal.location.zzao;
import com.google.android.gms.internal.location.zzbe;

/* renamed from: Oc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC18165Oc2 extends zzah {

    /* renamed from: a */
    public final /* synthetic */ zzao f4441a;

    public BinderC18165Oc2(zzbe zzbeVar, zzao zzaoVar) {
        this.f4441a = zzaoVar;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        if (!zzaaVar.getStatus().isSuccess()) {
            this.f4441a.zzb(zzaaVar.getStatus(), null);
        }
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
        this.f4441a.zzb(Status.RESULT_SUCCESS, null);
    }
}
