package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.q */
/* loaded from: classes4.dex */
public final class C8458q extends CrashlyticsReport.Session.Event.Application.Execution.Thread {

    /* renamed from: a */
    public final String f55294a;

    /* renamed from: b */
    public final int f55295b;

    /* renamed from: c */
    public final List f55296c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.q$b */
    /* loaded from: classes4.dex */
    public static final class C8460b extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {

        /* renamed from: a */
        public String f55297a;

        /* renamed from: b */
        public int f55298b;

        /* renamed from: c */
        public List f55299c;

        /* renamed from: d */
        public byte f55300d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread build() {
            String str;
            List list;
            if (this.f55300d == 1 && (str = this.f55297a) != null && (list = this.f55299c) != null) {
                return new C8458q(str, this.f55298b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55297a == null) {
                sb.append(" name");
            }
            if ((1 & this.f55300d) == 0) {
                sb.append(" importance");
            }
            if (this.f55299c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(List list) {
            if (list != null) {
                this.f55299c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i) {
            this.f55298b = i;
            this.f55300d = (byte) (this.f55300d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(String str) {
            if (str != null) {
                this.f55297a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        if (this.f55294a.equals(thread.getName()) && this.f55295b == thread.getImportance() && this.f55296c.equals(thread.getFrames())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public List getFrames() {
        return this.f55296c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public int getImportance() {
        return this.f55295b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public String getName() {
        return this.f55294a;
    }

    public int hashCode() {
        return ((((this.f55294a.hashCode() ^ 1000003) * 1000003) ^ this.f55295b) * 1000003) ^ this.f55296c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f55294a + ", importance=" + this.f55295b + ", frames=" + this.f55296c + "}";
    }

    public C8458q(String str, int i, List list) {
        this.f55294a = str;
        this.f55295b = i;
        this.f55296c = list;
    }
}
