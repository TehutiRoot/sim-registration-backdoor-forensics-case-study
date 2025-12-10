package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.m */
/* loaded from: classes4.dex */
public final class C8446m extends CrashlyticsReport.Session.Event.Application.Execution {

    /* renamed from: a */
    public final List f55257a;

    /* renamed from: b */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception f55258b;

    /* renamed from: c */
    public final CrashlyticsReport.ApplicationExitInfo f55259c;

    /* renamed from: d */
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal f55260d;

    /* renamed from: e */
    public final List f55261e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.m$b */
    /* loaded from: classes4.dex */
    public static final class C8448b extends CrashlyticsReport.Session.Event.Application.Execution.Builder {

        /* renamed from: a */
        public List f55262a;

        /* renamed from: b */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception f55263b;

        /* renamed from: c */
        public CrashlyticsReport.ApplicationExitInfo f55264c;

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Application.Execution.Signal f55265d;

        /* renamed from: e */
        public List f55266e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution build() {
            List list;
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = this.f55265d;
            if (signal != null && (list = this.f55266e) != null) {
                return new C8446m(this.f55262a, this.f55263b, this.f55264c, signal, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55265d == null) {
                sb.append(" signal");
            }
            if (this.f55266e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f55264c = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(List list) {
            if (list != null) {
                this.f55266e = list;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setException(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f55263b = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal != null) {
                this.f55265d = signal;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(List list) {
            this.f55262a = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
        List list = this.f55257a;
        if (list != null ? list.equals(execution.getThreads()) : execution.getThreads() == null) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f55258b;
            if (exception != null ? exception.equals(execution.getException()) : execution.getException() == null) {
                CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f55259c;
                if (applicationExitInfo != null ? applicationExitInfo.equals(execution.getAppExitInfo()) : execution.getAppExitInfo() == null) {
                    if (this.f55260d.equals(execution.getSignal()) && this.f55261e.equals(execution.getBinaries())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.f55259c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public List getBinaries() {
        return this.f55261e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public CrashlyticsReport.Session.Event.Application.Execution.Exception getException() {
        return this.f55258b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public CrashlyticsReport.Session.Event.Application.Execution.Signal getSignal() {
        return this.f55260d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public List getThreads() {
        return this.f55257a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List list = this.f55257a;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f55258b;
        if (exception == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = exception.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f55259c;
        if (applicationExitInfo != null) {
            i = applicationExitInfo.hashCode();
        }
        return ((((i3 ^ i) * 1000003) ^ this.f55260d.hashCode()) * 1000003) ^ this.f55261e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f55257a + ", exception=" + this.f55258b + ", appExitInfo=" + this.f55259c + ", signal=" + this.f55260d + ", binaries=" + this.f55261e + "}";
    }

    public C8446m(List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, List list2) {
        this.f55257a = list;
        this.f55258b = exception;
        this.f55259c = applicationExitInfo;
        this.f55260d = signal;
        this.f55261e = list2;
    }
}
