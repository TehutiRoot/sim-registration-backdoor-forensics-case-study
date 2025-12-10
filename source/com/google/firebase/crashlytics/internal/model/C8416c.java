package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.c */
/* loaded from: classes4.dex */
public final class C8416c extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {

    /* renamed from: a */
    public final String f55151a;

    /* renamed from: b */
    public final String f55152b;

    /* renamed from: c */
    public final String f55153c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.c$b */
    /* loaded from: classes4.dex */
    public static final class C8418b extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {

        /* renamed from: a */
        public String f55154a;

        /* renamed from: b */
        public String f55155b;

        /* renamed from: c */
        public String f55156c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
            String str;
            String str2;
            String str3 = this.f55154a;
            if (str3 != null && (str = this.f55155b) != null && (str2 = this.f55156c) != null) {
                return new C8416c(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55154a == null) {
                sb.append(" arch");
            }
            if (this.f55155b == null) {
                sb.append(" libraryName");
            }
            if (this.f55156c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(String str) {
            if (str != null) {
                this.f55154a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(String str) {
            if (str != null) {
                this.f55156c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(String str) {
            if (str != null) {
                this.f55155b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
        if (this.f55151a.equals(buildIdMappingForArch.getArch()) && this.f55152b.equals(buildIdMappingForArch.getLibraryName()) && this.f55153c.equals(buildIdMappingForArch.getBuildId())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public String getArch() {
        return this.f55151a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public String getBuildId() {
        return this.f55153c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public String getLibraryName() {
        return this.f55152b;
    }

    public int hashCode() {
        return ((((this.f55151a.hashCode() ^ 1000003) * 1000003) ^ this.f55152b.hashCode()) * 1000003) ^ this.f55153c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f55151a + ", libraryName=" + this.f55152b + ", buildId=" + this.f55153c + "}";
    }

    public C8416c(String str, String str2, String str3) {
        this.f55151a = str;
        this.f55152b = str2;
        this.f55153c = str3;
    }
}
