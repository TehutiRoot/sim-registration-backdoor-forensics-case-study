package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;

/* loaded from: classes3.dex */
public final class zzuk implements zzts {

    /* renamed from: a */
    public Provider f47428a;

    /* renamed from: b */
    public final Provider f47429b;

    /* renamed from: c */
    public final zztu f47430c;

    public zzuk(Context context, zztu zztuVar) {
        this.f47430c = zztuVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactory newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(Encoding.m49166of("json"))) {
            this.f47428a = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuh
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49166of("json"), new Transformer() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuj
                        @Override // com.google.android.datatransport.Transformer
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f47429b = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzui
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49166of("proto"), new Transformer() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzug
                    @Override // com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static Event m46652a(zztu zztuVar, zztr zztrVar) {
        int zza = zztuVar.zza();
        if (zztrVar.zza() != 0) {
            return Event.ofData(zztrVar.zze(zza, false));
        }
        return Event.ofTelemetry(zztrVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(zztr zztrVar) {
        if (this.f47430c.zza() == 0) {
            Provider provider = this.f47428a;
            if (provider != null) {
                ((Transport) provider.get()).send(m46652a(this.f47430c, zztrVar));
                return;
            }
            return;
        }
        ((Transport) this.f47429b.get()).send(m46652a(this.f47430c, zztrVar));
    }
}