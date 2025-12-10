package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;

/* renamed from: gE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC20059gE2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzq f62115a;

    /* renamed from: b */
    public final /* synthetic */ zzkz f62116b;

    public CallableC20059gE2(zzkz zzkzVar, zzq zzqVar) {
        this.f62116b = zzkzVar;
        this.f62115a = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzai m46178M = this.f62116b.m46178M((String) Preconditions.checkNotNull(this.f62115a.zza));
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (m46178M.zzi(zzahVar) && zzai.zzb(this.f62115a.zzv).zzi(zzahVar)) {
            return this.f62116b.m46179L(this.f62115a).m65303e0();
        }
        this.f62116b.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}