package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: Jq2 */
/* loaded from: classes3.dex */
public final class Jq2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f3039a;

    /* renamed from: b */
    public final /* synthetic */ String f3040b;

    /* renamed from: c */
    public final /* synthetic */ String f3041c;

    /* renamed from: d */
    public final /* synthetic */ zzgq f3042d;

    public Jq2(zzgq zzgqVar, String str, String str2, String str3) {
        this.f3042d = zzgqVar;
        this.f3039a = str;
        this.f3040b = str2;
        this.f3041c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f3042d.f48395a;
        zzkzVar.m46186a();
        zzkzVar2 = this.f3042d.f48395a;
        return zzkzVar2.zzi().m65199N(this.f3039a, this.f3040b, this.f3041c);
    }
}
