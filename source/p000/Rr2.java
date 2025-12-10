package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: Rr2 */
/* loaded from: classes3.dex */
public final class Rr2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5443a;

    /* renamed from: b */
    public final /* synthetic */ String f5444b;

    /* renamed from: c */
    public final /* synthetic */ String f5445c;

    /* renamed from: d */
    public final /* synthetic */ long f5446d;

    /* renamed from: e */
    public final /* synthetic */ zzgq f5447e;

    public Rr2(zzgq zzgqVar, String str, String str2, String str3, long j) {
        this.f5447e = zzgqVar;
        this.f5443a = str;
        this.f5444b = str2;
        this.f5445c = str3;
        this.f5446d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        String str = this.f5443a;
        if (str == null) {
            zzkzVar2 = this.f5447e.f48395a;
            zzkzVar2.zzR(this.f5444b, null);
            return;
        }
        zzik zzikVar = new zzik(this.f5445c, str, this.f5446d);
        zzkzVar = this.f5447e.f48395a;
        zzkzVar.zzR(this.f5444b, zzikVar);
    }
}
