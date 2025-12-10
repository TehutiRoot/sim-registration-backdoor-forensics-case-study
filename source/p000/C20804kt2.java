package p000;

import android.util.Log;
import com.google.android.gms.measurement.internal.zzei;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzhb;

/* renamed from: kt2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20804kt2 implements zzei {

    /* renamed from: a */
    public final /* synthetic */ zzfy f71476a;

    public C20804kt2(zzhb zzhbVar, zzfy zzfyVar) {
        this.f71476a = zzfyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzei
    public final boolean zza() {
        if (this.f71476a.zzL() && Log.isLoggable(this.f71476a.zzay().zzq(), 3)) {
            return true;
        }
        return false;
    }
}
