package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: Gr2 */
/* loaded from: classes3.dex */
public final class Gr2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f2031a;

    /* renamed from: b */
    public final /* synthetic */ zzgq f2032b;

    public Gr2(zzgq zzgqVar, String str) {
        this.f2032b = zzgqVar;
        this.f2031a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f2032b.f48395a;
        zzkzVar.m46186a();
        zzkzVar2 = this.f2032b.f48395a;
        return zzkzVar2.zzi().m65197P(this.f2031a);
    }
}
