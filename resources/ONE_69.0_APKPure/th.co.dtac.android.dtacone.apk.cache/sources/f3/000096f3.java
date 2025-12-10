package com.google.android.gms.internal.mlkit_vision_barcode;

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
public final class zzuf implements zztn {

    /* renamed from: a */
    public Provider f46747a;

    /* renamed from: b */
    public final Provider f46748b;

    /* renamed from: c */
    public final zztp f46749c;

    public zzuf(Context context, zztp zztpVar) {
        this.f46749c = zztpVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactory newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(Encoding.m49166of("json"))) {
            this.f46747a = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzuc
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49166of("json"), zzue.zza);
                }
            });
        }
        this.f46748b = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzud
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49166of("proto"), zzub.zza);
            }
        });
    }

    /* renamed from: a */
    public static Event m46988a(zztp zztpVar, zztm zztmVar) {
        int zza = zztpVar.zza();
        if (zztmVar.zza() != 0) {
            return Event.ofData(zztmVar.zze(zza, false));
        }
        return Event.ofTelemetry(zztmVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztn
    public final void zza(zztm zztmVar) {
        if (this.f46749c.zza() == 0) {
            Provider provider = this.f46747a;
            if (provider != null) {
                ((Transport) provider.get()).send(m46988a(this.f46749c, zztmVar));
                return;
            }
            return;
        }
        ((Transport) this.f46748b.get()).send(m46988a(this.f46749c, zztmVar));
    }
}