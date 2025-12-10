package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.C6270e;

/* renamed from: com.google.android.datatransport.runtime.e */
/* loaded from: classes3.dex */
public final class C6270e implements Transport {

    /* renamed from: a */
    public final TransportContext f44121a;

    /* renamed from: b */
    public final String f44122b;

    /* renamed from: c */
    public final Encoding f44123c;

    /* renamed from: d */
    public final Transformer f44124d;

    /* renamed from: e */
    public final InterfaceC22006rW1 f44125e;

    public C6270e(TransportContext transportContext, String str, Encoding encoding, Transformer transformer, InterfaceC22006rW1 interfaceC22006rW1) {
        this.f44121a = transportContext;
        this.f44122b = str;
        this.f44123c = encoding;
        this.f44124d = transformer;
        this.f44125e = interfaceC22006rW1;
    }

    /* renamed from: a */
    public static /* synthetic */ void m49122a(Exception exc) {
        m49120c(exc);
    }

    /* renamed from: c */
    public static /* synthetic */ void m49120c(Exception exc) {
    }

    /* renamed from: b */
    public TransportContext m49121b() {
        return this.f44121a;
    }

    @Override // com.google.android.datatransport.Transport
    public void schedule(Event event, TransportScheduleCallback transportScheduleCallback) {
        this.f44125e.send(SendRequest.m49140a().setTransportContext(this.f44121a).mo49130b(event).setTransportName(this.f44122b).mo49129c(this.f44124d).mo49131a(this.f44123c).build(), transportScheduleCallback);
    }

    @Override // com.google.android.datatransport.Transport
    public void send(Event event) {
        schedule(event, new TransportScheduleCallback() { // from class: qW1
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                C6270e.m49122a(exc);
            }
        });
    }
}