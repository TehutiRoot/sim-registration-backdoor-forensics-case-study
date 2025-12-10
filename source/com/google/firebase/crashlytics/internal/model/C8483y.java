package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.y */
/* loaded from: classes4.dex */
public final class C8483y extends CrashlyticsReport.Session.OperatingSystem {

    /* renamed from: a */
    public final int f55352a;

    /* renamed from: b */
    public final String f55353b;

    /* renamed from: c */
    public final String f55354c;

    /* renamed from: d */
    public final boolean f55355d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.y$b */
    /* loaded from: classes4.dex */
    public static final class C8485b extends CrashlyticsReport.Session.OperatingSystem.Builder {

        /* renamed from: a */
        public int f55356a;

        /* renamed from: b */
        public String f55357b;

        /* renamed from: c */
        public String f55358c;

        /* renamed from: d */
        public boolean f55359d;

        /* renamed from: e */
        public byte f55360e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem build() {
            String str;
            String str2;
            if (this.f55360e == 3 && (str = this.f55357b) != null && (str2 = this.f55358c) != null) {
                return new C8483y(this.f55356a, str, str2, this.f55359d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f55360e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f55357b == null) {
                sb.append(" version");
            }
            if (this.f55358c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f55360e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(String str) {
            if (str != null) {
                this.f55358c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean z) {
            this.f55359d = z;
            this.f55360e = (byte) (this.f55360e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int i) {
            this.f55356a = i;
            this.f55360e = (byte) (this.f55360e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setVersion(String str) {
            if (str != null) {
                this.f55357b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
        if (this.f55352a == operatingSystem.getPlatform() && this.f55353b.equals(operatingSystem.getVersion()) && this.f55354c.equals(operatingSystem.getBuildVersion()) && this.f55355d == operatingSystem.isJailbroken()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public String getBuildVersion() {
        return this.f55354c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public int getPlatform() {
        return this.f55352a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public String getVersion() {
        return this.f55353b;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f55352a ^ 1000003) * 1000003) ^ this.f55353b.hashCode()) * 1000003) ^ this.f55354c.hashCode()) * 1000003;
        if (this.f55355d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public boolean isJailbroken() {
        return this.f55355d;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f55352a + ", version=" + this.f55353b + ", buildVersion=" + this.f55354c + ", jailbroken=" + this.f55355d + "}";
    }

    public C8483y(int i, String str, String str2, boolean z) {
        this.f55352a = i;
        this.f55353b = str;
        this.f55354c = str2;
        this.f55355d = z;
    }
}
