package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: vr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC22758vr2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f108241a;

    /* renamed from: b */
    public final /* synthetic */ String f108242b;

    /* renamed from: c */
    public final /* synthetic */ String f108243c;

    /* renamed from: d */
    public final /* synthetic */ zzgq f108244d;

    public CallableC22758vr2(zzgq zzgqVar, String str, String str2, String str3) {
        this.f108244d = zzgqVar;
        this.f108241a = str;
        this.f108242b = str2;
        this.f108243c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f108244d.f48407a;
        zzkzVar.m46171a();
        zzkzVar2 = this.f108244d.f48407a;
        return zzkzVar2.zzi().m65721Q(this.f108241a, this.f108242b, this.f108243c);
    }
}