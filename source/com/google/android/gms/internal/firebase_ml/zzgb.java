package com.google.android.gms.internal.firebase_ml;

import com.google.api.client.googleapis.MethodOverride;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzgb implements zzgy, zzhe {

    /* renamed from: a */
    public final boolean f45751a;

    public zzgb() {
        this(false);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhe
    public final void zza(zzhc zzhcVar) {
        zzhcVar.zza(this);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgy
    public final void zzb(zzhc zzhcVar) throws IOException {
        String requestMethod = zzhcVar.getRequestMethod();
        if (!requestMethod.equals("POST")) {
            if ((requestMethod.equals("GET") && zzhcVar.zzgc().zzfz().length() > 2048) || !zzhcVar.zzgb().zzaj(requestMethod)) {
                String requestMethod2 = zzhcVar.getRequestMethod();
                zzhcVar.zzaf("POST");
                zzgx zzgxVar = (zzgx) zzhcVar.zzgg().zzb(MethodOverride.HEADER, requestMethod2);
                if (requestMethod2.equals("GET")) {
                    zzhcVar.zza(new zzho((zzgu) zzhcVar.zzgc().clone()));
                    zzhcVar.zzgc().clear();
                } else if (zzhcVar.zzgd() == null) {
                    zzhcVar.zza(new zzgp());
                }
            }
        }
    }

    public zzgb(boolean z) {
        this.f45751a = false;
    }
}
