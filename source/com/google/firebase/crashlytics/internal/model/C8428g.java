package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.g */
/* loaded from: classes4.dex */
public final class C8428g extends CrashlyticsReport.Session {

    /* renamed from: a */
    public final String f55169a;

    /* renamed from: b */
    public final String f55170b;

    /* renamed from: c */
    public final String f55171c;

    /* renamed from: d */
    public final long f55172d;

    /* renamed from: e */
    public final Long f55173e;

    /* renamed from: f */
    public final boolean f55174f;

    /* renamed from: g */
    public final CrashlyticsReport.Session.Application f55175g;

    /* renamed from: h */
    public final CrashlyticsReport.Session.User f55176h;

    /* renamed from: i */
    public final CrashlyticsReport.Session.OperatingSystem f55177i;

    /* renamed from: j */
    public final CrashlyticsReport.Session.Device f55178j;

    /* renamed from: k */
    public final List f55179k;

    /* renamed from: l */
    public final int f55180l;

    /* renamed from: com.google.firebase.crashlytics.internal.model.g$b */
    /* loaded from: classes4.dex */
    public static final class C8430b extends CrashlyticsReport.Session.Builder {

        /* renamed from: a */
        public String f55181a;

        /* renamed from: b */
        public String f55182b;

        /* renamed from: c */
        public String f55183c;

        /* renamed from: d */
        public long f55184d;

        /* renamed from: e */
        public Long f55185e;

        /* renamed from: f */
        public boolean f55186f;

        /* renamed from: g */
        public CrashlyticsReport.Session.Application f55187g;

        /* renamed from: h */
        public CrashlyticsReport.Session.User f55188h;

        /* renamed from: i */
        public CrashlyticsReport.Session.OperatingSystem f55189i;

        /* renamed from: j */
        public CrashlyticsReport.Session.Device f55190j;

        /* renamed from: k */
        public List f55191k;

        /* renamed from: l */
        public int f55192l;

        /* renamed from: m */
        public byte f55193m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session build() {
            String str;
            String str2;
            CrashlyticsReport.Session.Application application;
            if (this.f55193m == 7 && (str = this.f55181a) != null && (str2 = this.f55182b) != null && (application = this.f55187g) != null) {
                return new C8428g(str, str2, this.f55183c, this.f55184d, this.f55185e, this.f55186f, application, this.f55188h, this.f55189i, this.f55190j, this.f55191k, this.f55192l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55181a == null) {
                sb.append(" generator");
            }
            if (this.f55182b == null) {
                sb.append(" identifier");
            }
            if ((this.f55193m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f55193m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f55187g == null) {
                sb.append(" app");
            }
            if ((this.f55193m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application != null) {
                this.f55187g = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setAppQualitySessionId(String str) {
            this.f55183c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.f55186f = z;
            this.f55193m = (byte) (this.f55193m | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device2) {
            this.f55190j = device2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEndedAt(Long l) {
            this.f55185e = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEvents(List list) {
            this.f55191k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGenerator(String str) {
            if (str != null) {
                this.f55181a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGeneratorType(int i) {
            this.f55192l = i;
            this.f55193m = (byte) (this.f55193m | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str != null) {
                this.f55182b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f55189i = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setStartedAt(long j) {
            this.f55184d = j;
            this.f55193m = (byte) (this.f55193m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user) {
            this.f55188h = user;
            return this;
        }

        public C8430b() {
        }

        public C8430b(CrashlyticsReport.Session session) {
            this.f55181a = session.getGenerator();
            this.f55182b = session.getIdentifier();
            this.f55183c = session.getAppQualitySessionId();
            this.f55184d = session.getStartedAt();
            this.f55185e = session.getEndedAt();
            this.f55186f = session.isCrashed();
            this.f55187g = session.getApp();
            this.f55188h = session.getUser();
            this.f55189i = session.getOs();
            this.f55190j = session.getDevice();
            this.f55191k = session.getEvents();
            this.f55192l = session.getGeneratorType();
            this.f55193m = (byte) 7;
        }
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device2;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        if (this.f55169a.equals(session.getGenerator()) && this.f55170b.equals(session.getIdentifier()) && ((str = this.f55171c) != null ? str.equals(session.getAppQualitySessionId()) : session.getAppQualitySessionId() == null) && this.f55172d == session.getStartedAt() && ((l = this.f55173e) != null ? l.equals(session.getEndedAt()) : session.getEndedAt() == null) && this.f55174f == session.isCrashed() && this.f55175g.equals(session.getApp()) && ((user = this.f55176h) != null ? user.equals(session.getUser()) : session.getUser() == null) && ((operatingSystem = this.f55177i) != null ? operatingSystem.equals(session.getOs()) : session.getOs() == null) && ((device2 = this.f55178j) != null ? device2.equals(session.getDevice()) : session.getDevice() == null) && ((list = this.f55179k) != null ? list.equals(session.getEvents()) : session.getEvents() == null) && this.f55180l == session.getGeneratorType()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Application getApp() {
        return this.f55175g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public String getAppQualitySessionId() {
        return this.f55171c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Device getDevice() {
        return this.f55178j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public Long getEndedAt() {
        return this.f55173e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public List getEvents() {
        return this.f55179k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public String getGenerator() {
        return this.f55169a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public int getGeneratorType() {
        return this.f55180l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public String getIdentifier() {
        return this.f55170b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.f55177i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public long getStartedAt() {
        return this.f55172d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.User getUser() {
        return this.f55176h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f55169a.hashCode() ^ 1000003) * 1000003) ^ this.f55170b.hashCode()) * 1000003;
        String str = this.f55171c;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f55172d;
        int i3 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f55173e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        if (this.f55174f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode7 = (((i4 ^ i) * 1000003) ^ this.f55175g.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.f55176h;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i5 = (hashCode7 ^ hashCode3) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f55177i;
        if (operatingSystem == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = operatingSystem.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        CrashlyticsReport.Session.Device device2 = this.f55178j;
        if (device2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = device2.hashCode();
        }
        int i7 = (i6 ^ hashCode5) * 1000003;
        List list = this.f55179k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((i7 ^ i2) * 1000003) ^ this.f55180l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public boolean isCrashed() {
        return this.f55174f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Builder toBuilder() {
        return new C8430b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f55169a + ", identifier=" + this.f55170b + ", appQualitySessionId=" + this.f55171c + ", startedAt=" + this.f55172d + ", endedAt=" + this.f55173e + ", crashed=" + this.f55174f + ", app=" + this.f55175g + ", user=" + this.f55176h + ", os=" + this.f55177i + ", device=" + this.f55178j + ", events=" + this.f55179k + ", generatorType=" + this.f55180l + "}";
    }

    public C8428g(String str, String str2, String str3, long j, Long l, boolean z, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device2, List list, int i) {
        this.f55169a = str;
        this.f55170b = str2;
        this.f55171c = str3;
        this.f55172d = j;
        this.f55173e = l;
        this.f55174f = z;
        this.f55175g = application;
        this.f55176h = user;
        this.f55177i = operatingSystem;
        this.f55178j = device2;
        this.f55179k = list;
        this.f55180l = i;
    }
}
