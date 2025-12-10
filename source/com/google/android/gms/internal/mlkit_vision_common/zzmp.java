package com.google.android.gms.internal.mlkit_vision_common;

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
public final class zzmp implements zzmc {

    /* renamed from: a */
    public Provider f47058a;

    /* renamed from: b */
    public final Provider f47059b;

    /* renamed from: c */
    public final zzme f47060c;

    public zzmp(Context context, zzme zzmeVar) {
        this.f47060c = zzmeVar;
        CCTDestination cCTDestination = CCTDestination.INSTANCE;
        TransportRuntime.initialize(context);
        final TransportFactory newFactory = TransportRuntime.getInstance().newFactory(cCTDestination);
        if (cCTDestination.getSupportedEncodings().contains(Encoding.m49169of("json"))) {
            this.f47058a = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmm
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49169of("json"), zzmo.zza);
                }
            });
        }
        this.f47059b = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmn
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return TransportFactory.this.getTransport("FIREBASE_ML_SDK", byte[].class, Encoding.m49169of("proto"), zzml.zza);
            }
        });
    }

    /* renamed from: a */
    public static Event m46802a(zzme zzmeVar, zzmb zzmbVar) {
        return Event.ofTelemetry(zzmbVar.zzd(zzmeVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        if (this.f47060c.zza() == 0) {
            Provider provider = this.f47058a;
            if (provider != null) {
                ((Transport) provider.get()).send(m46802a(this.f47060c, zzmbVar));
                return;
            }
            return;
        }
        ((Transport) this.f47059b.get()).send(m46802a(this.f47060c, zzmbVar));
    }
}
