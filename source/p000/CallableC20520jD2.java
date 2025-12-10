package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;

/* renamed from: jD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC20520jD2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzq f67205a;

    /* renamed from: b */
    public final /* synthetic */ zzkz f67206b;

    public CallableC20520jD2(zzkz zzkzVar, zzq zzqVar) {
        this.f67206b = zzkzVar;
        this.f67205a = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzai m46193M = this.f67206b.m46193M((String) Preconditions.checkNotNull(this.f67205a.zza));
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (m46193M.zzi(zzahVar) && zzai.zzb(this.f67205a.zzv).zzi(zzahVar)) {
            return this.f67206b.m46194L(this.f67205a).m51765e0();
        }
        this.f67206b.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
