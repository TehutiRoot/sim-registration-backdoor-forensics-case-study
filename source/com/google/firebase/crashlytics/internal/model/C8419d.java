package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.d */
/* loaded from: classes4.dex */
public final class C8419d extends CrashlyticsReport.CustomAttribute {

    /* renamed from: a */
    public final String f55157a;

    /* renamed from: b */
    public final String f55158b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.d$b */
    /* loaded from: classes4.dex */
    public static final class C8421b extends CrashlyticsReport.CustomAttribute.Builder {

        /* renamed from: a */
        public String f55159a;

        /* renamed from: b */
        public String f55160b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute build() {
            String str;
            String str2 = this.f55159a;
            if (str2 != null && (str = this.f55160b) != null) {
                return new C8419d(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55159a == null) {
                sb.append(" key");
            }
            if (this.f55160b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setKey(String str) {
            if (str != null) {
                this.f55159a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setValue(String str) {
            if (str != null) {
                this.f55160b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        if (this.f55157a.equals(customAttribute.getKey()) && this.f55158b.equals(customAttribute.getValue())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public String getKey() {
        return this.f55157a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public String getValue() {
        return this.f55158b;
    }

    public int hashCode() {
        return ((this.f55157a.hashCode() ^ 1000003) * 1000003) ^ this.f55158b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f55157a + ", value=" + this.f55158b + "}";
    }

    public C8419d(String str, String str2) {
        this.f55157a = str;
        this.f55158b = str2;
    }
}
