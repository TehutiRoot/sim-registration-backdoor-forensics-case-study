package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.s */
/* loaded from: classes4.dex */
public final class C8464s extends CrashlyticsReport.Session.Event.Application.ProcessDetails {

    /* renamed from: a */
    public final String f55312a;

    /* renamed from: b */
    public final int f55313b;

    /* renamed from: c */
    public final int f55314c;

    /* renamed from: d */
    public final boolean f55315d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.s$b */
    /* loaded from: classes4.dex */
    public static final class C8466b extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {

        /* renamed from: a */
        public String f55316a;

        /* renamed from: b */
        public int f55317b;

        /* renamed from: c */
        public int f55318c;

        /* renamed from: d */
        public boolean f55319d;

        /* renamed from: e */
        public byte f55320e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails build() {
            String str;
            if (this.f55320e == 7 && (str = this.f55316a) != null) {
                return new C8464s(str, this.f55317b, this.f55318c, this.f55319d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55316a == null) {
                sb.append(" processName");
            }
            if ((this.f55320e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f55320e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f55320e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean z) {
            this.f55319d = z;
            this.f55320e = (byte) (this.f55320e | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int i) {
            this.f55318c = i;
            this.f55320e = (byte) (this.f55320e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int i) {
            this.f55317b = i;
            this.f55320e = (byte) (this.f55320e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(String str) {
            if (str != null) {
                this.f55316a = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        if (this.f55312a.equals(processDetails.getProcessName()) && this.f55313b == processDetails.getPid() && this.f55314c == processDetails.getImportance() && this.f55315d == processDetails.isDefaultProcess()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getImportance() {
        return this.f55314c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getPid() {
        return this.f55313b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public String getProcessName() {
        return this.f55312a;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f55312a.hashCode() ^ 1000003) * 1000003) ^ this.f55313b) * 1000003) ^ this.f55314c) * 1000003;
        if (this.f55315d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public boolean isDefaultProcess() {
        return this.f55315d;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f55312a + ", pid=" + this.f55313b + ", importance=" + this.f55314c + ", defaultProcess=" + this.f55315d + "}";
    }

    public C8464s(String str, int i, int i2, boolean z) {
        this.f55312a = str;
        this.f55313b = i;
        this.f55314c = i2;
        this.f55315d = z;
    }
}
