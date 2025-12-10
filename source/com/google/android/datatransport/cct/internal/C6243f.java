package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

/* renamed from: com.google.android.datatransport.cct.internal.f */
/* loaded from: classes3.dex */
public final class C6243f extends ExternalPrivacyContext {

    /* renamed from: a */
    public final ExternalPRequestContext f43968a;

    /* renamed from: com.google.android.datatransport.cct.internal.f$b */
    /* loaded from: classes3.dex */
    public static final class C6245b extends ExternalPrivacyContext.Builder {

        /* renamed from: a */
        public ExternalPRequestContext f43969a;

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public ExternalPrivacyContext build() {
            return new C6243f(this.f43969a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public ExternalPrivacyContext.Builder setPrequest(ExternalPRequestContext externalPRequestContext) {
            this.f43969a = externalPRequestContext;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPrivacyContext)) {
            return false;
        }
        ExternalPRequestContext externalPRequestContext = this.f43968a;
        ExternalPRequestContext prequest = ((ExternalPrivacyContext) obj).getPrequest();
        if (externalPRequestContext == null) {
            if (prequest == null) {
                return true;
            }
            return false;
        }
        return externalPRequestContext.equals(prequest);
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext
    public ExternalPRequestContext getPrequest() {
        return this.f43968a;
    }

    public int hashCode() {
        int hashCode;
        ExternalPRequestContext externalPRequestContext = this.f43968a;
        if (externalPRequestContext == null) {
            hashCode = 0;
        } else {
            hashCode = externalPRequestContext.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f43968a + "}";
    }

    public C6243f(ExternalPRequestContext externalPRequestContext) {
        this.f43968a = externalPRequestContext;
    }
}
