package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.o */
/* loaded from: classes4.dex */
public final class C8452o extends CrashlyticsReport.Session.Event.Application.Execution.Exception {

    /* renamed from: a */
    public final String f55276a;

    /* renamed from: b */
    public final String f55277b;

    /* renamed from: c */
    public final List f55278c;

    /* renamed from: d */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception f55279d;

    /* renamed from: e */
    public final int f55280e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.o$b */
    /* loaded from: classes4.dex */
    public static final class C8454b extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {

        /* renamed from: a */
        public String f55281a;

        /* renamed from: b */
        public String f55282b;

        /* renamed from: c */
        public List f55283c;

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception f55284d;

        /* renamed from: e */
        public int f55285e;

        /* renamed from: f */
        public byte f55286f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception build() {
            String str;
            List list;
            if (this.f55286f == 1 && (str = this.f55281a) != null && (list = this.f55283c) != null) {
                return new C8452o(str, this.f55282b, list, this.f55284d, this.f55285e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55281a == null) {
                sb.append(" type");
            }
            if (this.f55283c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f55286f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f55284d = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(List list) {
            if (list != null) {
                this.f55283c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int i) {
            this.f55285e = i;
            this.f55286f = (byte) (this.f55286f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(String str) {
            this.f55282b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(String str) {
            if (str != null) {
                this.f55281a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        if (this.f55276a.equals(exception2.getType()) && ((str = this.f55277b) != null ? str.equals(exception2.getReason()) : exception2.getReason() == null) && this.f55278c.equals(exception2.getFrames()) && ((exception = this.f55279d) != null ? exception.equals(exception2.getCausedBy()) : exception2.getCausedBy() == null) && this.f55280e == exception2.getOverflowCount()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy() {
        return this.f55279d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public List getFrames() {
        return this.f55278c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public int getOverflowCount() {
        return this.f55280e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public String getReason() {
        return this.f55277b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public String getType() {
        return this.f55276a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f55276a.hashCode() ^ 1000003) * 1000003;
        String str = this.f55277b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f55278c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f55279d;
        if (exception != null) {
            i = exception.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f55280e;
    }

    public String toString() {
        return "Exception{type=" + this.f55276a + ", reason=" + this.f55277b + ", frames=" + this.f55278c + ", causedBy=" + this.f55279d + ", overflowCount=" + this.f55280e + "}";
    }

    public C8452o(String str, String str2, List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i) {
        this.f55276a = str;
        this.f55277b = str2;
        this.f55278c = list;
        this.f55279d = exception;
        this.f55280e = i;
    }
}
