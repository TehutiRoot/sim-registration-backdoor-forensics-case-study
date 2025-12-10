package p000;

import android.util.Log;
import com.google.android.gms.measurement.internal.zzei;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzhb;

/* renamed from: hu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20345hu2 implements zzei {

    /* renamed from: a */
    public final /* synthetic */ zzfy f62710a;

    public C20345hu2(zzhb zzhbVar, zzfy zzfyVar) {
        this.f62710a = zzfyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzei
    public final boolean zza() {
        if (this.f62710a.zzL() && Log.isLoggable(this.f62710a.zzay().zzq(), 3)) {
            return true;
        }
        return false;
    }
}