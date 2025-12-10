package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.C6281e;

/* renamed from: com.google.android.datatransport.runtime.e */
/* loaded from: classes3.dex */
public final class C6281e implements Transport {

    /* renamed from: a */
    public final TransportContext f44109a;

    /* renamed from: b */
    public final String f44110b;

    /* renamed from: c */
    public final Encoding f44111c;

    /* renamed from: d */
    public final Transformer f44112d;

    /* renamed from: e */
    public final InterfaceC22456uV1 f44113e;

    public C6281e(TransportContext transportContext, String str, Encoding encoding, Transformer transformer, InterfaceC22456uV1 interfaceC22456uV1) {
        this.f44109a = transportContext;
        this.f44110b = str;
        this.f44111c = encoding;
        this.f44112d = transformer;
        this.f44113e = interfaceC22456uV1;
    }

    /* renamed from: a */
    public static /* synthetic */ void m49125a(Exception exc) {
        m49123c(exc);
    }

    /* renamed from: c */
    public static /* synthetic */ void m49123c(Exception exc) {
    }

    /* renamed from: b */
    public TransportContext m49124b() {
        return this.f44109a;
    }

    @Override // com.google.android.datatransport.Transport
    public void schedule(Event event, TransportScheduleCallback transportScheduleCallback) {
        this.f44113e.send(SendRequest.m49143a().setTransportContext(this.f44109a).mo49133b(event).setTransportName(this.f44110b).mo49132c(this.f44112d).mo49134a(this.f44111c).build(), transportScheduleCallback);
    }

    @Override // com.google.android.datatransport.Transport
    public void send(Event event) {
        schedule(event, new TransportScheduleCallback() { // from class: tV1
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                C6281e.m49125a(exc);
            }
        });
    }
}
