package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: tq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC22343tq2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f107223a;

    /* renamed from: b */
    public final /* synthetic */ String f107224b;

    /* renamed from: c */
    public final /* synthetic */ String f107225c;

    /* renamed from: d */
    public final /* synthetic */ zzgq f107226d;

    public CallableC22343tq2(zzgq zzgqVar, String str, String str2, String str3) {
        this.f107226d = zzgqVar;
        this.f107223a = str;
        this.f107224b = str2;
        this.f107225c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f107226d.f48395a;
        zzkzVar.m46186a();
        zzkzVar2 = this.f107226d.f48395a;
        return zzkzVar2.zzi().m65196Q(this.f107223a, this.f107224b, this.f107225c);
    }
}
