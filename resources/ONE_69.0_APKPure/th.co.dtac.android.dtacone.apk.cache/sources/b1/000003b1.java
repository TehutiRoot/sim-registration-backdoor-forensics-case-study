package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: Ds2 */
/* loaded from: classes3.dex */
public final class Ds2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f1138a;

    /* renamed from: b */
    public final /* synthetic */ zzgq f1139b;

    public Ds2(zzgq zzgqVar, String str) {
        this.f1139b = zzgqVar;
        this.f1138a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f1139b.f48407a;
        zzkzVar.m46171a();
        zzkzVar2 = this.f1139b.f48407a;
        return zzkzVar2.zzi().m65722P(this.f1138a);
    }
}