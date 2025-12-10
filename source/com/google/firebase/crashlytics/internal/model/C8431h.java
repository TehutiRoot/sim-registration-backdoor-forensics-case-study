package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.h */
/* loaded from: classes4.dex */
public final class C8431h extends CrashlyticsReport.Session.Application {

    /* renamed from: a */
    public final String f55194a;

    /* renamed from: b */
    public final String f55195b;

    /* renamed from: c */
    public final String f55196c;

    /* renamed from: d */
    public final CrashlyticsReport.Session.Application.Organization f55197d;

    /* renamed from: e */
    public final String f55198e;

    /* renamed from: f */
    public final String f55199f;

    /* renamed from: g */
    public final String f55200g;

    /* renamed from: com.google.firebase.crashlytics.internal.model.h$b */
    /* loaded from: classes4.dex */
    public static final class C8433b extends CrashlyticsReport.Session.Application.Builder {

        /* renamed from: a */
        public String f55201a;

        /* renamed from: b */
        public String f55202b;

        /* renamed from: c */
        public String f55203c;

        /* renamed from: d */
        public CrashlyticsReport.Session.Application.Organization f55204d;

        /* renamed from: e */
        public String f55205e;

        /* renamed from: f */
        public String f55206f;

        /* renamed from: g */
        public String f55207g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application build() {
            String str;
            String str2 = this.f55201a;
            if (str2 != null && (str = this.f55202b) != null) {
                return new C8431h(str2, str, this.f55203c, this.f55204d, this.f55205e, this.f55206f, this.f55207g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55201a == null) {
                sb.append(" identifier");
            }
            if (this.f55202b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(String str) {
            this.f55206f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(String str) {
            this.f55207g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setDisplayVersion(String str) {
            this.f55203c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setIdentifier(String str) {
            if (str != null) {
                this.f55201a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setInstallationUuid(String str) {
            this.f55205e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setOrganization(CrashlyticsReport.Session.Application.Organization organization) {
            this.f55204d = organization;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public CrashlyticsReport.Session.Application.Builder setVersion(String str) {
            if (str != null) {
                this.f55202b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }

        public C8433b() {
        }

        public C8433b(CrashlyticsReport.Session.Application application) {
            this.f55201a = application.getIdentifier();
            this.f55202b = application.getVersion();
            this.f55203c = application.getDisplayVersion();
            this.f55204d = application.getOrganization();
            this.f55205e = application.getInstallationUuid();
            this.f55206f = application.getDevelopmentPlatform();
            this.f55207g = application.getDevelopmentPlatformVersion();
        }
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (this.f55194a.equals(application.getIdentifier()) && this.f55195b.equals(application.getVersion()) && ((str = this.f55196c) != null ? str.equals(application.getDisplayVersion()) : application.getDisplayVersion() == null) && ((organization = this.f55197d) != null ? organization.equals(application.getOrganization()) : application.getOrganization() == null) && ((str2 = this.f55198e) != null ? str2.equals(application.getInstallationUuid()) : application.getInstallationUuid() == null) && ((str3 = this.f55199f) != null ? str3.equals(application.getDevelopmentPlatform()) : application.getDevelopmentPlatform() == null)) {
            String str4 = this.f55200g;
            if (str4 == null) {
                if (application.getDevelopmentPlatformVersion() == null) {
                    return true;
                }
            } else if (str4.equals(application.getDevelopmentPlatformVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getDevelopmentPlatform() {
        return this.f55199f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getDevelopmentPlatformVersion() {
        return this.f55200g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getDisplayVersion() {
        return this.f55196c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getIdentifier() {
        return this.f55194a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getInstallationUuid() {
        return this.f55198e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.f55197d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public String getVersion() {
        return this.f55195b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f55194a.hashCode() ^ 1000003) * 1000003) ^ this.f55195b.hashCode()) * 1000003;
        String str = this.f55196c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization = this.f55197d;
        if (organization == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = organization.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.f55198e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str3 = this.f55199f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str4 = this.f55200g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public CrashlyticsReport.Session.Application.Builder toBuilder() {
        return new C8433b(this);
    }

    public String toString() {
        return "Application{identifier=" + this.f55194a + ", version=" + this.f55195b + ", displayVersion=" + this.f55196c + ", organization=" + this.f55197d + ", installationUuid=" + this.f55198e + ", developmentPlatform=" + this.f55199f + ", developmentPlatformVersion=" + this.f55200g + "}";
    }

    public C8431h(String str, String str2, String str3, CrashlyticsReport.Session.Application.Organization organization, String str4, String str5, String str6) {
        this.f55194a = str;
        this.f55195b = str2;
        this.f55196c = str3;
        this.f55197d = organization;
        this.f55198e = str4;
        this.f55199f = str5;
        this.f55200g = str6;
    }
}
