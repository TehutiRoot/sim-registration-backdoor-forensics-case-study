package com.google.auth.oauth2;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class ExternalAccountSupplierContext implements Serializable {
    private static final long serialVersionUID = -7852130853542313494L;
    private final String audience;
    private final String subjectTokenType;

    /* renamed from: com.google.auth.oauth2.ExternalAccountSupplierContext$b */
    /* loaded from: classes4.dex */
    public static class C7332b {

        /* renamed from: a */
        public String f52461a;

        /* renamed from: b */
        public String f52462b;

        /* renamed from: a */
        public ExternalAccountSupplierContext m41647a() {
            return new ExternalAccountSupplierContext(this);
        }

        /* renamed from: b */
        public C7332b m41646b(String str) {
            this.f52461a = str;
            return this;
        }

        /* renamed from: c */
        public C7332b m41645c(String str) {
            this.f52462b = str;
            return this;
        }
    }

    public static C7332b newBuilder() {
        return new C7332b();
    }

    public String getAudience() {
        return this.audience;
    }

    public String getSubjectTokenType() {
        return this.subjectTokenType;
    }

    private ExternalAccountSupplierContext(C7332b c7332b) {
        this.audience = c7332b.f52461a;
        this.subjectTokenType = c7332b.f52462b;
    }
}