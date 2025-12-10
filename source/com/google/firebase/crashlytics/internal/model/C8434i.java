package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.i */
/* loaded from: classes4.dex */
public final class C8434i extends CrashlyticsReport.Session.Application.Organization {

    /* renamed from: a */
    public final String f55208a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.i$b */
    /* loaded from: classes4.dex */
    public static final class C8436b extends CrashlyticsReport.Session.Application.Organization.Builder {

        /* renamed from: a */
        public String f55209a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization build() {
            String str = this.f55209a;
            if (str != null) {
                return new C8434i(str);
            }
            throw new IllegalStateException("Missing required properties: clsId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization.Builder setClsId(String str) {
            if (str != null) {
                this.f55209a = str;
                return this;
            }
            throw new NullPointerException("Null clsId");
        }

        public C8436b() {
        }

        public C8436b(CrashlyticsReport.Session.Application.Organization organization) {
            this.f55209a = organization.getClsId();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.f55208a.equals(((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public String getClsId() {
        return this.f55208a;
    }

    public int hashCode() {
        return this.f55208a.hashCode() ^ 1000003;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public CrashlyticsReport.Session.Application.Organization.Builder toBuilder() {
        return new C8436b(this);
    }

    public String toString() {
        return "Organization{clsId=" + this.f55208a + "}";
    }

    public C8434i(String str) {
        this.f55208a = str;
    }
}
