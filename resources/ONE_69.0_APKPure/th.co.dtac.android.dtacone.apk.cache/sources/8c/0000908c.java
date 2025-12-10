package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzqo;

/* loaded from: classes3.dex */
public final class zzrd implements zzqo.zzb {

    /* renamed from: b */
    public static final GmsLogger f46015b = new GmsLogger("MlStatsLogger", "");

    /* renamed from: a */
    public final ClearcutLogger f46016a;

    public zzrd(Context context) {
        this.f46016a = ClearcutLogger.anonymousLogger(context, "FIREBASE_ML_SDK");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqo.zzb
    public final void zza(zznq.zzad zzadVar) {
        GmsLogger gmsLogger = f46015b;
        String valueOf = String.valueOf(zzadVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 30);
        sb.append("Logging FirebaseMlSdkLogEvent ");
        sb.append(valueOf);
        gmsLogger.m48405d("MlStatsLogger", sb.toString());
        this.f46016a.newEvent(zzadVar.toByteArray()).log();
    }
}