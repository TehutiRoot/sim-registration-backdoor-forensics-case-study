package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.n */
/* loaded from: classes4.dex */
public final class C8449n extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {

    /* renamed from: a */
    public final long f55267a;

    /* renamed from: b */
    public final long f55268b;

    /* renamed from: c */
    public final String f55269c;

    /* renamed from: d */
    public final String f55270d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.n$b */
    /* loaded from: classes4.dex */
    public static final class C8451b extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {

        /* renamed from: a */
        public long f55271a;

        /* renamed from: b */
        public long f55272b;

        /* renamed from: c */
        public String f55273c;

        /* renamed from: d */
        public String f55274d;

        /* renamed from: e */
        public byte f55275e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
            String str;
            if (this.f55275e == 3 && (str = this.f55273c) != null) {
                return new C8449n(this.f55271a, this.f55272b, str, this.f55274d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f55275e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f55275e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f55273c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j) {
            this.f55271a = j;
            this.f55275e = (byte) (this.f55275e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(String str) {
            if (str != null) {
                this.f55273c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j) {
            this.f55272b = j;
            this.f55275e = (byte) (this.f55275e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(String str) {
            this.f55274d = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.f55267a == binaryImage.getBaseAddress() && this.f55268b == binaryImage.getSize() && this.f55269c.equals(binaryImage.getName())) {
            String str = this.f55270d;
            if (str == null) {
                if (binaryImage.getUuid() == null) {
                    return true;
                }
            } else if (str.equals(binaryImage.getUuid())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long getBaseAddress() {
        return this.f55267a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public String getName() {
        return this.f55269c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long getSize() {
        return this.f55268b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public String getUuid() {
        return this.f55270d;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f55267a;
        long j2 = this.f55268b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f55269c.hashCode()) * 1000003;
        String str = this.f55270d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f55267a + ", size=" + this.f55268b + ", name=" + this.f55269c + ", uuid=" + this.f55270d + "}";
    }

    public C8449n(long j, long j2, String str, String str2) {
        this.f55267a = j;
        this.f55268b = j2;
        this.f55269c = str;
        this.f55270d = str2;
    }
}
