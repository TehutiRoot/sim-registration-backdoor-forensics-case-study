package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.a */
/* loaded from: classes4.dex */
public final class C8410a extends CrashlyticsReport {

    /* renamed from: b */
    public final String f55107b;

    /* renamed from: c */
    public final String f55108c;

    /* renamed from: d */
    public final int f55109d;

    /* renamed from: e */
    public final String f55110e;

    /* renamed from: f */
    public final String f55111f;

    /* renamed from: g */
    public final String f55112g;

    /* renamed from: h */
    public final String f55113h;

    /* renamed from: i */
    public final String f55114i;

    /* renamed from: j */
    public final String f55115j;

    /* renamed from: k */
    public final CrashlyticsReport.Session f55116k;

    /* renamed from: l */
    public final CrashlyticsReport.FilesPayload f55117l;

    /* renamed from: m */
    public final CrashlyticsReport.ApplicationExitInfo f55118m;

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$b */
    /* loaded from: classes4.dex */
    public static final class C8412b extends CrashlyticsReport.Builder {

        /* renamed from: a */
        public String f55119a;

        /* renamed from: b */
        public String f55120b;

        /* renamed from: c */
        public int f55121c;

        /* renamed from: d */
        public String f55122d;

        /* renamed from: e */
        public String f55123e;

        /* renamed from: f */
        public String f55124f;

        /* renamed from: g */
        public String f55125g;

        /* renamed from: h */
        public String f55126h;

        /* renamed from: i */
        public String f55127i;

        /* renamed from: j */
        public CrashlyticsReport.Session f55128j;

        /* renamed from: k */
        public CrashlyticsReport.FilesPayload f55129k;

        /* renamed from: l */
        public CrashlyticsReport.ApplicationExitInfo f55130l;

        /* renamed from: m */
        public byte f55131m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport build() {
            if (this.f55131m == 1 && this.f55119a != null && this.f55120b != null && this.f55122d != null && this.f55126h != null && this.f55127i != null) {
                return new C8410a(this.f55119a, this.f55120b, this.f55121c, this.f55122d, this.f55123e, this.f55124f, this.f55125g, this.f55126h, this.f55127i, this.f55128j, this.f55129k, this.f55130l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55119a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f55120b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f55131m) == 0) {
                sb.append(" platform");
            }
            if (this.f55122d == null) {
                sb.append(" installationUuid");
            }
            if (this.f55126h == null) {
                sb.append(" buildVersion");
            }
            if (this.f55127i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f55130l = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setAppQualitySessionId(String str) {
            this.f55125g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setBuildVersion(String str) {
            if (str != null) {
                this.f55126h = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setDisplayVersion(String str) {
            if (str != null) {
                this.f55127i = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setFirebaseAuthenticationToken(String str) {
            this.f55124f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setFirebaseInstallationId(String str) {
            this.f55123e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setGmpAppId(String str) {
            if (str != null) {
                this.f55120b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setInstallationUuid(String str) {
            if (str != null) {
                this.f55122d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.f55129k = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setPlatform(int i) {
            this.f55121c = i;
            this.f55131m = (byte) (this.f55131m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSdkVersion(String str) {
            if (str != null) {
                this.f55119a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session) {
            this.f55128j = session;
            return this;
        }

        public C8412b() {
        }

        public C8412b(CrashlyticsReport crashlyticsReport) {
            this.f55119a = crashlyticsReport.getSdkVersion();
            this.f55120b = crashlyticsReport.getGmpAppId();
            this.f55121c = crashlyticsReport.getPlatform();
            this.f55122d = crashlyticsReport.getInstallationUuid();
            this.f55123e = crashlyticsReport.getFirebaseInstallationId();
            this.f55124f = crashlyticsReport.getFirebaseAuthenticationToken();
            this.f55125g = crashlyticsReport.getAppQualitySessionId();
            this.f55126h = crashlyticsReport.getBuildVersion();
            this.f55127i = crashlyticsReport.getDisplayVersion();
            this.f55128j = crashlyticsReport.getSession();
            this.f55129k = crashlyticsReport.getNdkPayload();
            this.f55130l = crashlyticsReport.getAppExitInfo();
            this.f55131m = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        CrashlyticsReport.Session session;
        CrashlyticsReport.FilesPayload filesPayload;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f55107b.equals(crashlyticsReport.getSdkVersion()) && this.f55108c.equals(crashlyticsReport.getGmpAppId()) && this.f55109d == crashlyticsReport.getPlatform() && this.f55110e.equals(crashlyticsReport.getInstallationUuid()) && ((str = this.f55111f) != null ? str.equals(crashlyticsReport.getFirebaseInstallationId()) : crashlyticsReport.getFirebaseInstallationId() == null) && ((str2 = this.f55112g) != null ? str2.equals(crashlyticsReport.getFirebaseAuthenticationToken()) : crashlyticsReport.getFirebaseAuthenticationToken() == null) && ((str3 = this.f55113h) != null ? str3.equals(crashlyticsReport.getAppQualitySessionId()) : crashlyticsReport.getAppQualitySessionId() == null) && this.f55114i.equals(crashlyticsReport.getBuildVersion()) && this.f55115j.equals(crashlyticsReport.getDisplayVersion()) && ((session = this.f55116k) != null ? session.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() == null) && ((filesPayload = this.f55117l) != null ? filesPayload.equals(crashlyticsReport.getNdkPayload()) : crashlyticsReport.getNdkPayload() == null)) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f55118m;
            if (applicationExitInfo == null) {
                if (crashlyticsReport.getAppExitInfo() == null) {
                    return true;
                }
            } else if (applicationExitInfo.equals(crashlyticsReport.getAppExitInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.f55118m;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getAppQualitySessionId() {
        return this.f55113h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getBuildVersion() {
        return this.f55114i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getDisplayVersion() {
        return this.f55115j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getFirebaseAuthenticationToken() {
        return this.f55112g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getFirebaseInstallationId() {
        return this.f55111f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getGmpAppId() {
        return this.f55108c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getInstallationUuid() {
        return this.f55110e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.f55117l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int getPlatform() {
        return this.f55109d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String getSdkVersion() {
        return this.f55107b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.Session getSession() {
        return this.f55116k;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.f55107b.hashCode() ^ 1000003) * 1000003) ^ this.f55108c.hashCode()) * 1000003) ^ this.f55109d) * 1000003) ^ this.f55110e.hashCode()) * 1000003;
        String str = this.f55111f;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f55112g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f55113h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i3 ^ hashCode3) * 1000003) ^ this.f55114i.hashCode()) * 1000003) ^ this.f55115j.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.f55116k;
        if (session == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = session.hashCode();
        }
        int i4 = (hashCode7 ^ hashCode4) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.f55117l;
        if (filesPayload == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = filesPayload.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f55118m;
        if (applicationExitInfo != null) {
            i = applicationExitInfo.hashCode();
        }
        return i5 ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.Builder toBuilder() {
        return new C8412b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f55107b + ", gmpAppId=" + this.f55108c + ", platform=" + this.f55109d + ", installationUuid=" + this.f55110e + ", firebaseInstallationId=" + this.f55111f + ", firebaseAuthenticationToken=" + this.f55112g + ", appQualitySessionId=" + this.f55113h + ", buildVersion=" + this.f55114i + ", displayVersion=" + this.f55115j + ", session=" + this.f55116k + ", ndkPayload=" + this.f55117l + ", appExitInfo=" + this.f55118m + "}";
    }

    public C8410a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.f55107b = str;
        this.f55108c = str2;
        this.f55109d = i;
        this.f55110e = str3;
        this.f55111f = str4;
        this.f55112g = str5;
        this.f55113h = str6;
        this.f55114i = str7;
        this.f55115j = str8;
        this.f55116k = session;
        this.f55117l = filesPayload;
        this.f55118m = applicationExitInfo;
    }
}
