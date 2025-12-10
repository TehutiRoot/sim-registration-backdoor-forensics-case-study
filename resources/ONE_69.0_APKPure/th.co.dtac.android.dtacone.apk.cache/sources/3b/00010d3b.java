package p000;

import android.content.Context;
import com.google.android.gms.internal.firebase_ml.zzkg;
import com.google.android.gms.internal.firebase_ml.zzkj;
import com.google.android.gms.internal.firebase_ml.zzsb;
import com.google.firebase.FirebaseApp;

/* renamed from: sK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22153sK2 extends zzkj {

    /* renamed from: c */
    public final /* synthetic */ FirebaseApp f79857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22153sK2(zzsb zzsbVar, String str, FirebaseApp firebaseApp) {
        super(str);
        this.f79857c = firebaseApp;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzkj
    public final void zza(zzkg zzkgVar) {
        String m47497c;
        super.zza((zzkg<?>) zzkgVar);
        Context applicationContext = this.f79857c.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        zzkgVar.zzfr().put("X-Android-Package", packageName);
        m47497c = zzsb.m47497c(applicationContext, packageName);
        zzkgVar.zzfr().put("X-Android-Cert", m47497c);
    }
}