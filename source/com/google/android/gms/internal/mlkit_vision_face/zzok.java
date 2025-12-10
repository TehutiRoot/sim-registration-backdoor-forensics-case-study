package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;

/* loaded from: classes3.dex */
public final class zzok implements zzob {

    /* renamed from: a */
    public Provider f47229a;

    /* renamed from: b */
    public final Provider f47230b;

    /* renamed from: c */
    public final zznt f47231c;

    public zzok(Context context, zznt zzntVar) {
        this.f47231c = zzntVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactory newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(Encoding.m49169of("json"))) {
            this.f47229a = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoh
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49169of("json"), zzoj.zza);
                }
            });
        }
        this.f47230b = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoi
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49169of("proto"), zzog.zza);
            }
        });
    }

    /* renamed from: a */
    public static Event m46726a(zznt zzntVar, zznr zznrVar) {
        int zza = zzntVar.zza();
        if (zznrVar.zza() != 0) {
            return Event.ofData(zznrVar.zze(zza, false));
        }
        return Event.ofTelemetry(zznrVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        if (this.f47231c.zza() == 0) {
            Provider provider = this.f47229a;
            if (provider != null) {
                ((Transport) provider.get()).send(m46726a(this.f47231c, zznrVar));
                return;
            }
            return;
        }
        ((Transport) this.f47230b.get()).send(m46726a(this.f47231c, zznrVar));
    }
}
