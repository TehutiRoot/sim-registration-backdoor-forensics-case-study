package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: Os2 */
/* loaded from: classes3.dex */
public final class Os2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4600a;

    /* renamed from: b */
    public final /* synthetic */ String f4601b;

    /* renamed from: c */
    public final /* synthetic */ String f4602c;

    /* renamed from: d */
    public final /* synthetic */ long f4603d;

    /* renamed from: e */
    public final /* synthetic */ zzgq f4604e;

    public Os2(zzgq zzgqVar, String str, String str2, String str3, long j) {
        this.f4604e = zzgqVar;
        this.f4600a = str;
        this.f4601b = str2;
        this.f4602c = str3;
        this.f4603d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        String str = this.f4600a;
        if (str == null) {
            zzkzVar2 = this.f4604e.f48407a;
            zzkzVar2.zzR(this.f4601b, null);
            return;
        }
        zzik zzikVar = new zzik(this.f4602c, str, this.f4603d);
        zzkzVar = this.f4604e.f48407a;
        zzkzVar.zzR(this.f4601b, zzikVar);
    }
}