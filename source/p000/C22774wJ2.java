package p000;

import com.google.android.gms.internal.firebase_ml.zzgx;
import com.google.android.gms.internal.firebase_ml.zzkg;
import com.google.android.gms.internal.firebase_ml.zzkj;
import com.google.android.gms.internal.firebase_ml.zzsb;

/* renamed from: wJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22774wJ2 extends zzkj {

    /* renamed from: c */
    public final /* synthetic */ zzsb f107977c;

    public C22774wJ2(zzsb zzsbVar) {
        this.f107977c = zzsbVar;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzkj
    public final void zza(zzkg zzkgVar) {
        String str;
        super.zza((zzkg<?>) zzkgVar);
        zzgx zzfr = zzkgVar.zzfr();
        str = this.f107977c.f46013a;
        zzfr.put("X-Goog-Spatula", str);
    }
}
