package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.u */
/* loaded from: classes4.dex */
public final class C8471u extends CrashlyticsReport.Session.Event.Log {

    /* renamed from: a */
    public final String f55335a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.u$b */
    /* loaded from: classes4.dex */
    public static final class C8473b extends CrashlyticsReport.Session.Event.Log.Builder {

        /* renamed from: a */
        public String f55336a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log build() {
            String str = this.f55336a;
            if (str != null) {
                return new C8471u(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log.Builder setContent(String str) {
            if (str != null) {
                this.f55336a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.f55335a.equals(((CrashlyticsReport.Session.Event.Log) obj).getContent());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    public String getContent() {
        return this.f55335a;
    }

    public int hashCode() {
        return this.f55335a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f55335a + "}";
    }

    public C8471u(String str) {
        this.f55335a = str;
    }
}
