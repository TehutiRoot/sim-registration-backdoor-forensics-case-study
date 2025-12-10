package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.z */
/* loaded from: classes4.dex */
public final class C8486z extends CrashlyticsReport.Session.User {

    /* renamed from: a */
    public final String f55361a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.z$b */
    /* loaded from: classes4.dex */
    public static final class C8488b extends CrashlyticsReport.Session.User.Builder {

        /* renamed from: a */
        public String f55362a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User build() {
            String str = this.f55362a;
            if (str != null) {
                return new C8486z(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public CrashlyticsReport.Session.User.Builder setIdentifier(String str) {
            if (str != null) {
                this.f55362a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.f55361a.equals(((CrashlyticsReport.Session.User) obj).getIdentifier());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    public String getIdentifier() {
        return this.f55361a;
    }

    public int hashCode() {
        return this.f55361a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f55361a + "}";
    }

    public C8486z(String str) {
        this.f55361a = str;
    }
}
