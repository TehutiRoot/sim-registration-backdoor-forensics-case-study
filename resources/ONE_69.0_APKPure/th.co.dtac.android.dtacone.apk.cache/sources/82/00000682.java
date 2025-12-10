package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: Gr2 */
/* loaded from: classes3.dex */
public final class Gr2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f2213a;

    /* renamed from: b */
    public final /* synthetic */ String f2214b;

    /* renamed from: c */
    public final /* synthetic */ String f2215c;

    /* renamed from: d */
    public final /* synthetic */ zzgq f2216d;

    public Gr2(zzgq zzgqVar, String str, String str2, String str3) {
        this.f2216d = zzgqVar;
        this.f2213a = str;
        this.f2214b = str2;
        this.f2215c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f2216d.f48407a;
        zzkzVar.m46171a();
        zzkzVar2 = this.f2216d.f48407a;
        return zzkzVar2.zzi().m65724N(this.f2213a, this.f2214b, this.f2215c);
    }
}