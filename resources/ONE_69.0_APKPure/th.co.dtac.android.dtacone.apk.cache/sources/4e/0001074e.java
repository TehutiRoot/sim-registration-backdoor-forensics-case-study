package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: qr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC21893qr2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f77336a;

    /* renamed from: b */
    public final /* synthetic */ String f77337b;

    /* renamed from: c */
    public final /* synthetic */ String f77338c;

    /* renamed from: d */
    public final /* synthetic */ zzgq f77339d;

    public CallableC21893qr2(zzgq zzgqVar, String str, String str2, String str3) {
        this.f77339d = zzgqVar;
        this.f77336a = str;
        this.f77337b = str2;
        this.f77338c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f77339d.f48407a;
        zzkzVar.m46171a();
        zzkzVar2 = this.f77339d.f48407a;
        return zzkzVar2.zzi().m65721Q(this.f77336a, this.f77337b, this.f77338c);
    }
}