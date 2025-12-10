package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.C6267b;
import com.google.auto.value.AutoValue;

/* loaded from: classes3.dex */
public abstract class SendRequest {

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract Builder mo49134a(Encoding encoding);

        /* renamed from: b */
        public abstract Builder mo49133b(Event event);

        public abstract SendRequest build();

        /* renamed from: c */
        public abstract Builder mo49132c(Transformer transformer);

        public <T> Builder setEvent(Event<T> event, Encoding encoding, Transformer<T, byte[]> transformer) {
            mo49133b(event);
            mo49134a(encoding);
            mo49132c(transformer);
            return this;
        }

        public abstract Builder setTransportContext(TransportContext transportContext);

        public abstract Builder setTransportName(String str);
    }

    /* renamed from: a */
    public static Builder m49143a() {
        return new C6267b.C6269b();
    }

    /* renamed from: b */
    public abstract Encoding mo49139b();

    /* renamed from: c */
    public abstract Event mo49138c();

    /* renamed from: d */
    public byte[] m49142d() {
        return (byte[]) mo49137e().apply(mo49138c().getPayload());
    }

    /* renamed from: e */
    public abstract Transformer mo49137e();

    /* renamed from: f */
    public abstract TransportContext mo49136f();

    /* renamed from: g */
    public abstract String mo49135g();
}
