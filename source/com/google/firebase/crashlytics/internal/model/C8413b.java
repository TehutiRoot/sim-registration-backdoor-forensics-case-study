package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.b */
/* loaded from: classes4.dex */
public final class C8413b extends CrashlyticsReport.ApplicationExitInfo {

    /* renamed from: a */
    public final int f55132a;

    /* renamed from: b */
    public final String f55133b;

    /* renamed from: c */
    public final int f55134c;

    /* renamed from: d */
    public final int f55135d;

    /* renamed from: e */
    public final long f55136e;

    /* renamed from: f */
    public final long f55137f;

    /* renamed from: g */
    public final long f55138g;

    /* renamed from: h */
    public final String f55139h;

    /* renamed from: i */
    public final List f55140i;

    /* renamed from: com.google.firebase.crashlytics.internal.model.b$b */
    /* loaded from: classes4.dex */
    public static final class C8415b extends CrashlyticsReport.ApplicationExitInfo.Builder {

        /* renamed from: a */
        public int f55141a;

        /* renamed from: b */
        public String f55142b;

        /* renamed from: c */
        public int f55143c;

        /* renamed from: d */
        public int f55144d;

        /* renamed from: e */
        public long f55145e;

        /* renamed from: f */
        public long f55146f;

        /* renamed from: g */
        public long f55147g;

        /* renamed from: h */
        public String f55148h;

        /* renamed from: i */
        public List f55149i;

        /* renamed from: j */
        public byte f55150j;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo build() {
            String str;
            if (this.f55150j == 63 && (str = this.f55142b) != null) {
                return new C8413b(this.f55141a, str, this.f55143c, this.f55144d, this.f55145e, this.f55146f, this.f55147g, this.f55148h, this.f55149i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f55150j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f55142b == null) {
                sb.append(" processName");
            }
            if ((this.f55150j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f55150j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f55150j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f55150j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f55150j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(List list) {
            this.f55149i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i) {
            this.f55144d = i;
            this.f55150j = (byte) (this.f55150j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i) {
            this.f55141a = i;
            this.f55150j = (byte) (this.f55150j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            if (str != null) {
                this.f55142b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j) {
            this.f55145e = j;
            this.f55150j = (byte) (this.f55150j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i) {
            this.f55143c = i;
            this.f55150j = (byte) (this.f55150j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j) {
            this.f55146f = j;
            this.f55150j = (byte) (this.f55150j | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j) {
            this.f55147g = j;
            this.f55150j = (byte) (this.f55150j | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(String str) {
            this.f55148h = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.f55132a == applicationExitInfo.getPid() && this.f55133b.equals(applicationExitInfo.getProcessName()) && this.f55134c == applicationExitInfo.getReasonCode() && this.f55135d == applicationExitInfo.getImportance() && this.f55136e == applicationExitInfo.getPss() && this.f55137f == applicationExitInfo.getRss() && this.f55138g == applicationExitInfo.getTimestamp() && ((str = this.f55139h) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null)) {
            List list = this.f55140i;
            if (list == null) {
                if (applicationExitInfo.getBuildIdMappingForArch() == null) {
                    return true;
                }
            } else if (list.equals(applicationExitInfo.getBuildIdMappingForArch())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public List getBuildIdMappingForArch() {
        return this.f55140i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getImportance() {
        return this.f55135d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getPid() {
        return this.f55132a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public String getProcessName() {
        return this.f55133b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getPss() {
        return this.f55136e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getReasonCode() {
        return this.f55134c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getRss() {
        return this.f55137f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getTimestamp() {
        return this.f55138g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public String getTraceFile() {
        return this.f55139h;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f55136e;
        long j2 = this.f55137f;
        long j3 = this.f55138g;
        int hashCode2 = (((((((((((((this.f55132a ^ 1000003) * 1000003) ^ this.f55133b.hashCode()) * 1000003) ^ this.f55134c) * 1000003) ^ this.f55135d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f55139h;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f55140i;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f55132a + ", processName=" + this.f55133b + ", reasonCode=" + this.f55134c + ", importance=" + this.f55135d + ", pss=" + this.f55136e + ", rss=" + this.f55137f + ", timestamp=" + this.f55138g + ", traceFile=" + this.f55139h + ", buildIdMappingForArch=" + this.f55140i + "}";
    }

    public C8413b(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.f55132a = i;
        this.f55133b = str;
        this.f55134c = i2;
        this.f55135d = i3;
        this.f55136e = j;
        this.f55137f = j2;
        this.f55138g = j3;
        this.f55139h = str2;
        this.f55140i = list;
    }
}
