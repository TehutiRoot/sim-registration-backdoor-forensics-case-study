package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.concurrent.Callable;

/* renamed from: yq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC23203yq2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f108880a;

    /* renamed from: b */
    public final /* synthetic */ String f108881b;

    /* renamed from: c */
    public final /* synthetic */ String f108882c;

    /* renamed from: d */
    public final /* synthetic */ zzgq f108883d;

    public CallableC23203yq2(zzgq zzgqVar, String str, String str2, String str3) {
        this.f108883d = zzgqVar;
        this.f108880a = str;
        this.f108881b = str2;
        this.f108882c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f108883d.f48395a;
        zzkzVar.m46186a();
        zzkzVar2 = this.f108883d.f48395a;
        return zzkzVar2.zzi().m65196Q(this.f108880a, this.f108881b, this.f108882c);
    }
}
