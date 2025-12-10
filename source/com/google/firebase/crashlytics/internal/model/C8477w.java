package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.w */
/* loaded from: classes4.dex */
public final class C8477w extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {

    /* renamed from: a */
    public final String f55346a;

    /* renamed from: b */
    public final String f55347b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.w$b */
    /* loaded from: classes4.dex */
    public static final class C8479b extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {

        /* renamed from: a */
        public String f55348a;

        /* renamed from: b */
        public String f55349b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build() {
            String str;
            String str2 = this.f55348a;
            if (str2 != null && (str = this.f55349b) != null) {
                return new C8477w(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55348a == null) {
                sb.append(" rolloutId");
            }
            if (this.f55349b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(String str) {
            if (str != null) {
                this.f55348a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(String str) {
            if (str != null) {
                this.f55349b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
        if (this.f55346a.equals(rolloutVariant.getRolloutId()) && this.f55347b.equals(rolloutVariant.getVariantId())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    public String getRolloutId() {
        return this.f55346a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    public String getVariantId() {
        return this.f55347b;
    }

    public int hashCode() {
        return ((this.f55346a.hashCode() ^ 1000003) * 1000003) ^ this.f55347b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f55346a + ", variantId=" + this.f55347b + "}";
    }

    public C8477w(String str, String str2) {
        this.f55346a = str;
        this.f55347b = str2;
    }
}
