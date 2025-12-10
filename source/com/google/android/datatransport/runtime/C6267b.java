package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;

/* renamed from: com.google.android.datatransport.runtime.b */
/* loaded from: classes3.dex */
public final class C6267b extends SendRequest {

    /* renamed from: a */
    public final TransportContext f44061a;

    /* renamed from: b */
    public final String f44062b;

    /* renamed from: c */
    public final Event f44063c;

    /* renamed from: d */
    public final Transformer f44064d;

    /* renamed from: e */
    public final Encoding f44065e;

    /* renamed from: com.google.android.datatransport.runtime.b$b */
    /* loaded from: classes3.dex */
    public static final class C6269b extends SendRequest.Builder {

        /* renamed from: a */
        public TransportContext f44066a;

        /* renamed from: b */
        public String f44067b;

        /* renamed from: c */
        public Event f44068c;

        /* renamed from: d */
        public Transformer f44069d;

        /* renamed from: e */
        public Encoding f44070e;

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        /* renamed from: a */
        public SendRequest.Builder mo49134a(Encoding encoding) {
            if (encoding != null) {
                this.f44070e = encoding;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        /* renamed from: b */
        public SendRequest.Builder mo49133b(Event event) {
            if (event != null) {
                this.f44068c = event;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest build() {
            String str = "";
            if (this.f44066a == null) {
                str = " transportContext";
            }
            if (this.f44067b == null) {
                str = str + " transportName";
            }
            if (this.f44068c == null) {
                str = str + " event";
            }
            if (this.f44069d == null) {
                str = str + " transformer";
            }
            if (this.f44070e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C6267b(this.f44066a, this.f44067b, this.f44068c, this.f44069d, this.f44070e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        /* renamed from: c */
        public SendRequest.Builder mo49132c(Transformer transformer) {
            if (transformer != null) {
                this.f44069d = transformer;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportContext(TransportContext transportContext) {
            if (transportContext != null) {
                this.f44066a = transportContext;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportName(String str) {
            if (str != null) {
                this.f44067b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: b */
    public Encoding mo49139b() {
        return this.f44065e;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: c */
    public Event mo49138c() {
        return this.f44063c;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: e */
    public Transformer mo49137e() {
        return this.f44064d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendRequest)) {
            return false;
        }
        SendRequest sendRequest = (SendRequest) obj;
        if (this.f44061a.equals(sendRequest.mo49136f()) && this.f44062b.equals(sendRequest.mo49135g()) && this.f44063c.equals(sendRequest.mo49138c()) && this.f44064d.equals(sendRequest.mo49137e()) && this.f44065e.equals(sendRequest.mo49139b())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: f */
    public TransportContext mo49136f() {
        return this.f44061a;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    /* renamed from: g */
    public String mo49135g() {
        return this.f44062b;
    }

    public int hashCode() {
        return ((((((((this.f44061a.hashCode() ^ 1000003) * 1000003) ^ this.f44062b.hashCode()) * 1000003) ^ this.f44063c.hashCode()) * 1000003) ^ this.f44064d.hashCode()) * 1000003) ^ this.f44065e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f44061a + ", transportName=" + this.f44062b + ", event=" + this.f44063c + ", transformer=" + this.f44064d + ", encoding=" + this.f44065e + "}";
    }

    public C6267b(TransportContext transportContext, String str, Event event, Transformer transformer, Encoding encoding) {
        this.f44061a = transportContext;
        this.f44062b = str;
        this.f44063c = event;
        this.f44064d = transformer;
        this.f44065e = encoding;
    }
}
