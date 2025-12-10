package com.google.android.gms.internal.mlkit_common;

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
public final class zzsp implements zzrz {

    /* renamed from: a */
    public Provider f46504a;

    /* renamed from: b */
    public final Provider f46505b;

    /* renamed from: c */
    public final zzsb f46506c;

    public zzsp(Context context, zzsb zzsbVar) {
        this.f46506c = zzsbVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactory newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(Encoding.m49169of("json"))) {
            this.f46504a = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49169of("json"), new Transformer() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // com.google.android.datatransport.Transformer
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f46505b = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49169of("proto"), new Transformer() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static Event m47086a(zzsb zzsbVar, zzry zzryVar) {
        return Event.ofTelemetry(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.f46506c.zza() == 0) {
            Provider provider = this.f46504a;
            if (provider != null) {
                ((Transport) provider.get()).send(m47086a(this.f46506c, zzryVar));
                return;
            }
            return;
        }
        ((Transport) this.f46505b.get()).send(m47086a(this.f46506c, zzryVar));
    }
}
