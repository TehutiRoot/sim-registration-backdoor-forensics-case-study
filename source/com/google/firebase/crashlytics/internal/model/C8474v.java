package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.v */
/* loaded from: classes4.dex */
public final class C8474v extends CrashlyticsReport.Session.Event.RolloutAssignment {

    /* renamed from: a */
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f55337a;

    /* renamed from: b */
    public final String f55338b;

    /* renamed from: c */
    public final String f55339c;

    /* renamed from: d */
    public final long f55340d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.v$b */
    /* loaded from: classes4.dex */
    public static final class C8476b extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f55341a;

        /* renamed from: b */
        public String f55342b;

        /* renamed from: c */
        public String f55343c;

        /* renamed from: d */
        public long f55344d;

        /* renamed from: e */
        public byte f55345e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment build() {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
            String str;
            String str2;
            if (this.f55345e == 1 && (rolloutVariant = this.f55341a) != null && (str = this.f55342b) != null && (str2 = this.f55343c) != null) {
                return new C8474v(rolloutVariant, str, str2, this.f55344d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55341a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f55342b == null) {
                sb.append(" parameterKey");
            }
            if (this.f55343c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f55345e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(String str) {
            if (str != null) {
                this.f55342b = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(String str) {
            if (str != null) {
                this.f55343c = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant != null) {
                this.f55341a = rolloutVariant;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j) {
            this.f55344d = j;
            this.f55345e = (byte) (this.f55345e | 1);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        if (this.f55337a.equals(rolloutAssignment.getRolloutVariant()) && this.f55338b.equals(rolloutAssignment.getParameterKey()) && this.f55339c.equals(rolloutAssignment.getParameterValue()) && this.f55340d == rolloutAssignment.getTemplateVersion()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public String getParameterKey() {
        return this.f55338b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public String getParameterValue() {
        return this.f55339c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
        return this.f55337a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public long getTemplateVersion() {
        return this.f55340d;
    }

    public int hashCode() {
        long j = this.f55340d;
        return ((((((this.f55337a.hashCode() ^ 1000003) * 1000003) ^ this.f55338b.hashCode()) * 1000003) ^ this.f55339c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f55337a + ", parameterKey=" + this.f55338b + ", parameterValue=" + this.f55339c + ", templateVersion=" + this.f55340d + "}";
    }

    public C8474v(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j) {
        this.f55337a = rolloutVariant;
        this.f55338b = str;
        this.f55339c = str2;
        this.f55340d = j;
    }
}
