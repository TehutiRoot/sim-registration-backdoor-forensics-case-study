package p000;

import com.google.android.gms.internal.firebase_ml.zzgx;
import com.google.android.gms.internal.firebase_ml.zzkg;
import com.google.android.gms.internal.firebase_ml.zzkj;
import com.google.android.gms.internal.firebase_ml.zzsb;

/* renamed from: tK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22326tK2 extends zzkj {

    /* renamed from: c */
    public final /* synthetic */ zzsb f80154c;

    public C22326tK2(zzsb zzsbVar) {
        this.f80154c = zzsbVar;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzkj
    public final void zza(zzkg zzkgVar) {
        String str;
        super.zza((zzkg<?>) zzkgVar);
        zzgx zzfr = zzkgVar.zzfr();
        str = this.f80154c.f46025a;
        zzfr.put("X-Goog-Spatula", str);
    }
}