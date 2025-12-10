package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: Eq2 */
/* loaded from: classes3.dex */
public final class Eq2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f1429a;

    /* renamed from: b */
    public final /* synthetic */ String f1430b;

    /* renamed from: c */
    public final /* synthetic */ String f1431c;

    /* renamed from: d */
    public final /* synthetic */ zzgq f1432d;

    public Eq2(zzgq zzgqVar, String str, String str2, String str3) {
        this.f1432d = zzgqVar;
        this.f1429a = str;
        this.f1430b = str2;
        this.f1431c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f1432d.f48395a;
        zzkzVar.m46186a();
        zzkzVar2 = this.f1432d.f48395a;
        return zzkzVar2.zzi().m65199N(this.f1429a, this.f1430b, this.f1431c);
    }
}
