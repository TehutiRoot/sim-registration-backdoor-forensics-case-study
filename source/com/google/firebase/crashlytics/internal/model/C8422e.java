package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.e */
/* loaded from: classes4.dex */
public final class C8422e extends CrashlyticsReport.FilesPayload {

    /* renamed from: a */
    public final List f55161a;

    /* renamed from: b */
    public final String f55162b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.e$b */
    /* loaded from: classes4.dex */
    public static final class C8424b extends CrashlyticsReport.FilesPayload.Builder {

        /* renamed from: a */
        public List f55163a;

        /* renamed from: b */
        public String f55164b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload build() {
            List list = this.f55163a;
            if (list != null) {
                return new C8422e(list, this.f55164b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setFiles(List list) {
            if (list != null) {
                this.f55163a = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.f55164b = str;
            return this;
        }

        public C8424b() {
        }

        public C8424b(CrashlyticsReport.FilesPayload filesPayload) {
            this.f55163a = filesPayload.getFiles();
            this.f55164b = filesPayload.getOrgId();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    /* renamed from: a */
    public CrashlyticsReport.FilesPayload.Builder mo38867a() {
        return new C8424b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (this.f55161a.equals(filesPayload.getFiles())) {
            String str = this.f55162b;
            if (str == null) {
                if (filesPayload.getOrgId() == null) {
                    return true;
                }
            } else if (str.equals(filesPayload.getOrgId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public List getFiles() {
        return this.f55161a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public String getOrgId() {
        return this.f55162b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f55161a.hashCode() ^ 1000003) * 1000003;
        String str = this.f55162b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f55161a + ", orgId=" + this.f55162b + "}";
    }

    public C8422e(List list, String str) {
        this.f55161a = list;
        this.f55162b = str;
    }
}
