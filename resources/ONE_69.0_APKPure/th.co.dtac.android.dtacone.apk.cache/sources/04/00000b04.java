package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.internal.location.zzao;
import com.google.android.gms.internal.location.zzbe;

/* renamed from: Ld2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC18010Ld2 extends zzah {

    /* renamed from: a */
    public final /* synthetic */ zzao f3648a;

    public BinderC18010Ld2(zzbe zzbeVar, zzao zzaoVar) {
        this.f3648a = zzaoVar;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        if (!zzaaVar.getStatus().isSuccess()) {
            this.f3648a.zzb(zzaaVar.getStatus(), null);
        }
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
        this.f3648a.zzb(Status.RESULT_SUCCESS, null);
    }
}