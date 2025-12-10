package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.p */
/* loaded from: classes4.dex */
public final class C8455p extends CrashlyticsReport.Session.Event.Application.Execution.Signal {

    /* renamed from: a */
    public final String f55287a;

    /* renamed from: b */
    public final String f55288b;

    /* renamed from: c */
    public final long f55289c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.p$b */
    /* loaded from: classes4.dex */
    public static final class C8457b extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {

        /* renamed from: a */
        public String f55290a;

        /* renamed from: b */
        public String f55291b;

        /* renamed from: c */
        public long f55292c;

        /* renamed from: d */
        public byte f55293d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            String str;
            String str2;
            if (this.f55293d == 1 && (str = this.f55290a) != null && (str2 = this.f55291b) != null) {
                return new C8455p(str, str2, this.f55292c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55290a == null) {
                sb.append(" name");
            }
            if (this.f55291b == null) {
                sb.append(" code");
            }
            if ((1 & this.f55293d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j) {
            this.f55292c = j;
            this.f55293d = (byte) (this.f55293d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(String str) {
            if (str != null) {
                this.f55291b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(String str) {
            if (str != null) {
                this.f55290a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        if (this.f55287a.equals(signal.getName()) && this.f55288b.equals(signal.getCode()) && this.f55289c == signal.getAddress()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public long getAddress() {
        return this.f55289c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public String getCode() {
        return this.f55288b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public String getName() {
        return this.f55287a;
    }

    public int hashCode() {
        long j = this.f55289c;
        return ((((this.f55287a.hashCode() ^ 1000003) * 1000003) ^ this.f55288b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f55287a + ", code=" + this.f55288b + ", address=" + this.f55289c + "}";
    }

    public C8455p(String str, String str2, long j) {
        this.f55287a = str;
        this.f55288b = str2;
        this.f55289c = j;
    }
}
