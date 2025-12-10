package com.google.auth.oauth2;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class ExternalAccountSupplierContext implements Serializable {
    private static final long serialVersionUID = -7852130853542313494L;
    private final String audience;
    private final String subjectTokenType;

    /* renamed from: com.google.auth.oauth2.ExternalAccountSupplierContext$b */
    /* loaded from: classes4.dex */
    public static class C7343b {

        /* renamed from: a */
        public String f52449a;

        /* renamed from: b */
        public String f52450b;

        /* renamed from: a */
        public ExternalAccountSupplierContext m41660a() {
            return new ExternalAccountSupplierContext(this);
        }

        /* renamed from: b */
        public C7343b m41659b(String str) {
            this.f52449a = str;
            return this;
        }

        /* renamed from: c */
        public C7343b m41658c(String str) {
            this.f52450b = str;
            return this;
        }
    }

    public static C7343b newBuilder() {
        return new C7343b();
    }

    public String getAudience() {
        return this.audience;
    }

    public String getSubjectTokenType() {
        return this.subjectTokenType;
    }

    private ExternalAccountSupplierContext(C7343b c7343b) {
        this.audience = c7343b.f52449a;
        this.subjectTokenType = c7343b.f52450b;
    }
}
