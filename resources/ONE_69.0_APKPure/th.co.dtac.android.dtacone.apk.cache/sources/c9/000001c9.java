package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: Br2 */
/* loaded from: classes3.dex */
public final class Br2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f561a;

    /* renamed from: b */
    public final /* synthetic */ String f562b;

    /* renamed from: c */
    public final /* synthetic */ String f563c;

    /* renamed from: d */
    public final /* synthetic */ zzgq f564d;

    public Br2(zzgq zzgqVar, String str, String str2, String str3) {
        this.f564d = zzgqVar;
        this.f561a = str;
        this.f562b = str2;
        this.f563c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f564d.f48407a;
        zzkzVar.m46171a();
        zzkzVar2 = this.f564d.f48407a;
        return zzkzVar2.zzi().m65724N(this.f561a, this.f562b, this.f563c);
    }
}