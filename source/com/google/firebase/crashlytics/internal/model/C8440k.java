package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.k */
/* loaded from: classes4.dex */
public final class C8440k extends CrashlyticsReport.Session.Event {

    /* renamed from: a */
    public final long f55229a;

    /* renamed from: b */
    public final String f55230b;

    /* renamed from: c */
    public final CrashlyticsReport.Session.Event.Application f55231c;

    /* renamed from: d */
    public final CrashlyticsReport.Session.Event.Device f55232d;

    /* renamed from: e */
    public final CrashlyticsReport.Session.Event.Log f55233e;

    /* renamed from: f */
    public final CrashlyticsReport.Session.Event.RolloutsState f55234f;

    /* renamed from: com.google.firebase.crashlytics.internal.model.k$b */
    /* loaded from: classes4.dex */
    public static final class C8442b extends CrashlyticsReport.Session.Event.Builder {

        /* renamed from: a */
        public long f55235a;

        /* renamed from: b */
        public String f55236b;

        /* renamed from: c */
        public CrashlyticsReport.Session.Event.Application f55237c;

        /* renamed from: d */
        public CrashlyticsReport.Session.Event.Device f55238d;

        /* renamed from: e */
        public CrashlyticsReport.Session.Event.Log f55239e;

        /* renamed from: f */
        public CrashlyticsReport.Session.Event.RolloutsState f55240f;

        /* renamed from: g */
        public byte f55241g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event build() {
            String str;
            CrashlyticsReport.Session.Event.Application application;
            CrashlyticsReport.Session.Event.Device device2;
            if (this.f55241g == 1 && (str = this.f55236b) != null && (application = this.f55237c) != null && (device2 = this.f55238d) != null) {
                return new C8440k(this.f55235a, str, application, device2, this.f55239e, this.f55240f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f55241g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f55236b == null) {
                sb.append(" type");
            }
            if (this.f55237c == null) {
                sb.append(" app");
            }
            if (this.f55238d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setApp(CrashlyticsReport.Session.Event.Application application) {
            if (application != null) {
                this.f55237c = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setDevice(CrashlyticsReport.Session.Event.Device device2) {
            if (device2 != null) {
                this.f55238d = device2;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setLog(CrashlyticsReport.Session.Event.Log log) {
            this.f55239e = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setRollouts(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.f55240f = rolloutsState;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setTimestamp(long j) {
            this.f55235a = j;
            this.f55241g = (byte) (this.f55241g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public CrashlyticsReport.Session.Event.Builder setType(String str) {
            if (str != null) {
                this.f55236b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public C8442b() {
        }

        public C8442b(CrashlyticsReport.Session.Event event) {
            this.f55235a = event.getTimestamp();
            this.f55236b = event.getType();
            this.f55237c = event.getApp();
            this.f55238d = event.getDevice();
            this.f55239e = event.getLog();
            this.f55240f = event.getRollouts();
            this.f55241g = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.Session.Event.Log log;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.f55229a == event.getTimestamp() && this.f55230b.equals(event.getType()) && this.f55231c.equals(event.getApp()) && this.f55232d.equals(event.getDevice()) && ((log = this.f55233e) != null ? log.equals(event.getLog()) : event.getLog() == null)) {
            CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f55234f;
            if (rolloutsState == null) {
                if (event.getRollouts() == null) {
                    return true;
                }
            } else if (rolloutsState.equals(event.getRollouts())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public CrashlyticsReport.Session.Event.Application getApp() {
        return this.f55231c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public CrashlyticsReport.Session.Event.Device getDevice() {
        return this.f55232d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public CrashlyticsReport.Session.Event.Log getLog() {
        return this.f55233e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public CrashlyticsReport.Session.Event.RolloutsState getRollouts() {
        return this.f55234f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public long getTimestamp() {
        return this.f55229a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public String getType() {
        return this.f55230b;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f55229a;
        int hashCode2 = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f55230b.hashCode()) * 1000003) ^ this.f55231c.hashCode()) * 1000003) ^ this.f55232d.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log = this.f55233e;
        int i = 0;
        if (log == null) {
            hashCode = 0;
        } else {
            hashCode = log.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f55234f;
        if (rolloutsState != null) {
            i = rolloutsState.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public CrashlyticsReport.Session.Event.Builder toBuilder() {
        return new C8442b(this);
    }

    public String toString() {
        return "Event{timestamp=" + this.f55229a + ", type=" + this.f55230b + ", app=" + this.f55231c + ", device=" + this.f55232d + ", log=" + this.f55233e + ", rollouts=" + this.f55234f + "}";
    }

    public C8440k(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device2, CrashlyticsReport.Session.Event.Log log, CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.f55229a = j;
        this.f55230b = str;
        this.f55231c = application;
        this.f55232d = device2;
        this.f55233e = log;
        this.f55234f = rolloutsState;
    }
}
