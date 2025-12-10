package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.j */
/* loaded from: classes4.dex */
public final class C8437j extends CrashlyticsReport.Session.Device {

    /* renamed from: a */
    public final int f55210a;

    /* renamed from: b */
    public final String f55211b;

    /* renamed from: c */
    public final int f55212c;

    /* renamed from: d */
    public final long f55213d;

    /* renamed from: e */
    public final long f55214e;

    /* renamed from: f */
    public final boolean f55215f;

    /* renamed from: g */
    public final int f55216g;

    /* renamed from: h */
    public final String f55217h;

    /* renamed from: i */
    public final String f55218i;

    /* renamed from: com.google.firebase.crashlytics.internal.model.j$b */
    /* loaded from: classes4.dex */
    public static final class C8439b extends CrashlyticsReport.Session.Device.Builder {

        /* renamed from: a */
        public int f55219a;

        /* renamed from: b */
        public String f55220b;

        /* renamed from: c */
        public int f55221c;

        /* renamed from: d */
        public long f55222d;

        /* renamed from: e */
        public long f55223e;

        /* renamed from: f */
        public boolean f55224f;

        /* renamed from: g */
        public int f55225g;

        /* renamed from: h */
        public String f55226h;

        /* renamed from: i */
        public String f55227i;

        /* renamed from: j */
        public byte f55228j;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device build() {
            String str;
            String str2;
            String str3;
            if (this.f55228j == 63 && (str = this.f55220b) != null && (str2 = this.f55226h) != null && (str3 = this.f55227i) != null) {
                return new C8437j(this.f55219a, str, this.f55221c, this.f55222d, this.f55223e, this.f55224f, this.f55225g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f55228j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f55220b == null) {
                sb.append(" model");
            }
            if ((this.f55228j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f55228j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f55228j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f55228j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f55228j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f55226h == null) {
                sb.append(" manufacturer");
            }
            if (this.f55227i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setArch(int i) {
            this.f55219a = i;
            this.f55228j = (byte) (this.f55228j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setCores(int i) {
            this.f55221c = i;
            this.f55228j = (byte) (this.f55228j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setDiskSpace(long j) {
            this.f55223e = j;
            this.f55228j = (byte) (this.f55228j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setManufacturer(String str) {
            if (str != null) {
                this.f55226h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModel(String str) {
            if (str != null) {
                this.f55220b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModelClass(String str) {
            if (str != null) {
                this.f55227i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setRam(long j) {
            this.f55222d = j;
            this.f55228j = (byte) (this.f55228j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setSimulator(boolean z) {
            this.f55224f = z;
            this.f55228j = (byte) (this.f55228j | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setState(int i) {
            this.f55225g = i;
            this.f55228j = (byte) (this.f55228j | 32);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device2 = (CrashlyticsReport.Session.Device) obj;
        if (this.f55210a == device2.getArch() && this.f55211b.equals(device2.getModel()) && this.f55212c == device2.getCores() && this.f55213d == device2.getRam() && this.f55214e == device2.getDiskSpace() && this.f55215f == device2.isSimulator() && this.f55216g == device2.getState() && this.f55217h.equals(device2.getManufacturer()) && this.f55218i.equals(device2.getModelClass())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getArch() {
        return this.f55210a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getCores() {
        return this.f55212c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getDiskSpace() {
        return this.f55214e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public String getManufacturer() {
        return this.f55217h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public String getModel() {
        return this.f55211b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public String getModelClass() {
        return this.f55218i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getRam() {
        return this.f55213d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getState() {
        return this.f55216g;
    }

    public int hashCode() {
        int i;
        long j = this.f55213d;
        long j2 = this.f55214e;
        int hashCode = (((((((((this.f55210a ^ 1000003) * 1000003) ^ this.f55211b.hashCode()) * 1000003) ^ this.f55212c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f55215f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f55216g) * 1000003) ^ this.f55217h.hashCode()) * 1000003) ^ this.f55218i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public boolean isSimulator() {
        return this.f55215f;
    }

    public String toString() {
        return "Device{arch=" + this.f55210a + ", model=" + this.f55211b + ", cores=" + this.f55212c + ", ram=" + this.f55213d + ", diskSpace=" + this.f55214e + ", simulator=" + this.f55215f + ", state=" + this.f55216g + ", manufacturer=" + this.f55217h + ", modelClass=" + this.f55218i + "}";
    }

    public C8437j(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f55210a = i;
        this.f55211b = str;
        this.f55212c = i2;
        this.f55213d = j;
        this.f55214e = j2;
        this.f55215f = z;
        this.f55216g = i3;
        this.f55217h = str2;
        this.f55218i = str3;
    }
}
