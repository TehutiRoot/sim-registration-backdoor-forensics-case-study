package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.t */
/* loaded from: classes4.dex */
public final class C8468t extends CrashlyticsReport.Session.Event.Device {

    /* renamed from: a */
    public final Double f55322a;

    /* renamed from: b */
    public final int f55323b;

    /* renamed from: c */
    public final boolean f55324c;

    /* renamed from: d */
    public final int f55325d;

    /* renamed from: e */
    public final long f55326e;

    /* renamed from: f */
    public final long f55327f;

    /* renamed from: com.google.firebase.crashlytics.internal.model.t$b */
    /* loaded from: classes4.dex */
    public static final class C8470b extends CrashlyticsReport.Session.Event.Device.Builder {

        /* renamed from: a */
        public Double f55328a;

        /* renamed from: b */
        public int f55329b;

        /* renamed from: c */
        public boolean f55330c;

        /* renamed from: d */
        public int f55331d;

        /* renamed from: e */
        public long f55332e;

        /* renamed from: f */
        public long f55333f;

        /* renamed from: g */
        public byte f55334g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device build() {
            if (this.f55334g != 31) {
                StringBuilder sb = new StringBuilder();
                if ((this.f55334g & 1) == 0) {
                    sb.append(" batteryVelocity");
                }
                if ((this.f55334g & 2) == 0) {
                    sb.append(" proximityOn");
                }
                if ((this.f55334g & 4) == 0) {
                    sb.append(" orientation");
                }
                if ((this.f55334g & 8) == 0) {
                    sb.append(" ramUsed");
                }
                if ((this.f55334g & 16) == 0) {
                    sb.append(" diskUsed");
                }
                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
            }
            return new C8468t(this.f55328a, this.f55329b, this.f55330c, this.f55331d, this.f55332e, this.f55333f);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(Double d) {
            this.f55328a = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i) {
            this.f55329b = i;
            this.f55334g = (byte) (this.f55334g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j) {
            this.f55333f = j;
            this.f55334g = (byte) (this.f55334g | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i) {
            this.f55331d = i;
            this.f55334g = (byte) (this.f55334g | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z) {
            this.f55330c = z;
            this.f55334g = (byte) (this.f55334g | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j) {
            this.f55332e = j;
            this.f55334g = (byte) (this.f55334g | 8);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device2 = (CrashlyticsReport.Session.Event.Device) obj;
        Double d = this.f55322a;
        if (d != null ? d.equals(device2.getBatteryLevel()) : device2.getBatteryLevel() == null) {
            if (this.f55323b == device2.getBatteryVelocity() && this.f55324c == device2.isProximityOn() && this.f55325d == device2.getOrientation() && this.f55326e == device2.getRamUsed() && this.f55327f == device2.getDiskUsed()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public Double getBatteryLevel() {
        return this.f55322a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getBatteryVelocity() {
        return this.f55323b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getDiskUsed() {
        return this.f55327f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getOrientation() {
        return this.f55325d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getRamUsed() {
        return this.f55326e;
    }

    public int hashCode() {
        int hashCode;
        int i;
        Double d = this.f55322a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ this.f55323b) * 1000003;
        if (this.f55324c) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j = this.f55326e;
        long j2 = this.f55327f;
        return ((((((i2 ^ i) * 1000003) ^ this.f55325d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public boolean isProximityOn() {
        return this.f55324c;
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f55322a + ", batteryVelocity=" + this.f55323b + ", proximityOn=" + this.f55324c + ", orientation=" + this.f55325d + ", ramUsed=" + this.f55326e + ", diskUsed=" + this.f55327f + "}";
    }

    public C8468t(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f55322a = d;
        this.f55323b = i;
        this.f55324c = z;
        this.f55325d = i2;
        this.f55326e = j;
        this.f55327f = j2;
    }
}
