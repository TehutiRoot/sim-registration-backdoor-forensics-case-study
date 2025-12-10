package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;

/* renamed from: com.google.android.datatransport.cct.internal.c */
/* loaded from: classes3.dex */
public final class C6234c extends ComplianceData {

    /* renamed from: a */
    public final ExternalPrivacyContext f43958a;

    /* renamed from: b */
    public final ComplianceData.ProductIdOrigin f43959b;

    /* renamed from: com.google.android.datatransport.cct.internal.c$b */
    /* loaded from: classes3.dex */
    public static final class C6236b extends ComplianceData.Builder {

        /* renamed from: a */
        public ExternalPrivacyContext f43960a;

        /* renamed from: b */
        public ComplianceData.ProductIdOrigin f43961b;

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public ComplianceData build() {
            return new C6234c(this.f43960a, this.f43961b);
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public ComplianceData.Builder setPrivacyContext(ExternalPrivacyContext externalPrivacyContext) {
            this.f43960a = externalPrivacyContext;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public ComplianceData.Builder setProductIdOrigin(ComplianceData.ProductIdOrigin productIdOrigin) {
            this.f43961b = productIdOrigin;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplianceData)) {
            return false;
        }
        ComplianceData complianceData = (ComplianceData) obj;
        ExternalPrivacyContext externalPrivacyContext = this.f43958a;
        if (externalPrivacyContext != null ? externalPrivacyContext.equals(complianceData.getPrivacyContext()) : complianceData.getPrivacyContext() == null) {
            ComplianceData.ProductIdOrigin productIdOrigin = this.f43959b;
            if (productIdOrigin == null) {
                if (complianceData.getProductIdOrigin() == null) {
                    return true;
                }
            } else if (productIdOrigin.equals(complianceData.getProductIdOrigin())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public ExternalPrivacyContext getPrivacyContext() {
        return this.f43958a;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public ComplianceData.ProductIdOrigin getProductIdOrigin() {
        return this.f43959b;
    }

    public int hashCode() {
        int hashCode;
        ExternalPrivacyContext externalPrivacyContext = this.f43958a;
        int i = 0;
        if (externalPrivacyContext == null) {
            hashCode = 0;
        } else {
            hashCode = externalPrivacyContext.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.f43959b;
        if (productIdOrigin != null) {
            i = productIdOrigin.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f43958a + ", productIdOrigin=" + this.f43959b + "}";
    }

    public C6234c(ExternalPrivacyContext externalPrivacyContext, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.f43958a = externalPrivacyContext;
        this.f43959b = productIdOrigin;
    }
}
