package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.x */
/* loaded from: classes4.dex */
public final class C8480x extends CrashlyticsReport.Session.Event.RolloutsState {

    /* renamed from: a */
    public final List f55350a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.x$b */
    /* loaded from: classes4.dex */
    public static final class C8482b extends CrashlyticsReport.Session.Event.RolloutsState.Builder {

        /* renamed from: a */
        public List f55351a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState build() {
            List list = this.f55351a;
            if (list != null) {
                return new C8480x(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(List list) {
            if (list != null) {
                this.f55351a = list;
                return this;
            }
            throw new NullPointerException("Null rolloutAssignments");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.f55350a.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    public List getRolloutAssignments() {
        return this.f55350a;
    }

    public int hashCode() {
        return this.f55350a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f55350a + "}";
    }

    public C8480x(List list) {
        this.f55350a = list;
    }
}
