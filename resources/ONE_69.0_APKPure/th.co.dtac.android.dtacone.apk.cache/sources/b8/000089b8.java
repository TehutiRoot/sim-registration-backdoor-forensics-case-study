package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.C6256b;
import com.google.auto.value.AutoValue;

/* loaded from: classes3.dex */
public abstract class SendRequest {

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract Builder mo49131a(Encoding encoding);

        /* renamed from: b */
        public abstract Builder mo49130b(Event event);

        public abstract SendRequest build();

        /* renamed from: c */
        public abstract Builder mo49129c(Transformer transformer);

        public <T> Builder setEvent(Event<T> event, Encoding encoding, Transformer<T, byte[]> transformer) {
            mo49130b(event);
            mo49131a(encoding);
            mo49129c(transformer);
            return this;
        }

        public abstract Builder setTransportContext(TransportContext transportContext);

        public abstract Builder setTransportName(String str);
    }

    /* renamed from: a */
    public static Builder m49140a() {
        return new C6256b.C6258b();
    }

    /* renamed from: b */
    public abstract Encoding mo49136b();

    /* renamed from: c */
    public abstract Event mo49135c();

    /* renamed from: d */
    public byte[] m49139d() {
        return (byte[]) mo49134e().apply(mo49135c().getPayload());
    }

    /* renamed from: e */
    public abstract Transformer mo49134e();

    /* renamed from: f */
    public abstract TransportContext mo49133f();

    /* renamed from: g */
    public abstract String mo49132g();
}