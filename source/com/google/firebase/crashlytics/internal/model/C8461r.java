package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.r */
/* loaded from: classes4.dex */
public final class C8461r extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {

    /* renamed from: a */
    public final long f55301a;

    /* renamed from: b */
    public final String f55302b;

    /* renamed from: c */
    public final String f55303c;

    /* renamed from: d */
    public final long f55304d;

    /* renamed from: e */
    public final int f55305e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.r$b */
    /* loaded from: classes4.dex */
    public static final class C8463b extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {

        /* renamed from: a */
        public long f55306a;

        /* renamed from: b */
        public String f55307b;

        /* renamed from: c */
        public String f55308c;

        /* renamed from: d */
        public long f55309d;

        /* renamed from: e */
        public int f55310e;

        /* renamed from: f */
        public byte f55311f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String str;
            if (this.f55311f == 7 && (str = this.f55307b) != null) {
                return new C8461r(this.f55306a, str, this.f55308c, this.f55309d, this.f55310e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f55311f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f55307b == null) {
                sb.append(" symbol");
            }
            if ((this.f55311f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f55311f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.f55308c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i) {
            this.f55310e = i;
            this.f55311f = (byte) (this.f55311f | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j) {
            this.f55309d = j;
            this.f55311f = (byte) (this.f55311f | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j) {
            this.f55306a = j;
            this.f55311f = (byte) (this.f55311f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str != null) {
                this.f55307b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        if (this.f55301a == frame.getPc() && this.f55302b.equals(frame.getSymbol()) && ((str = this.f55303c) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.f55304d == frame.getOffset() && this.f55305e == frame.getImportance()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public String getFile() {
        return this.f55303c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public int getImportance() {
        return this.f55305e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getOffset() {
        return this.f55304d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getPc() {
        return this.f55301a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public String getSymbol() {
        return this.f55302b;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f55301a;
        int hashCode2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f55302b.hashCode()) * 1000003;
        String str = this.f55303c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j2 = this.f55304d;
        return this.f55305e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f55301a + ", symbol=" + this.f55302b + ", file=" + this.f55303c + ", offset=" + this.f55304d + ", importance=" + this.f55305e + "}";
    }

    public C8461r(long j, String str, String str2, long j2, int i) {
        this.f55301a = j;
        this.f55302b = str;
        this.f55303c = str2;
        this.f55304d = j2;
        this.f55305e = i;
    }
}
