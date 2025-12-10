package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.model.l */
/* loaded from: classes4.dex */
public final class C8443l extends CrashlyticsReport.Session.Event.Application {

    /* renamed from: a */
    public final CrashlyticsReport.Session.Event.Application.Execution f55242a;

    /* renamed from: b */
    public final List f55243b;

    /* renamed from: c */
    public final List f55244c;

    /* renamed from: d */
    public final Boolean f55245d;

    /* renamed from: e */
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails f55246e;

    /* renamed from: f */
    public final List f55247f;

    /* renamed from: g */
    public final int f55248g;

    /* renamed from: com.google.firebase.crashlytics.internal.model.l$b */
    /* loaded from: classes4.dex */
    public static final class C8445b extends CrashlyticsReport.Session.Event.Application.Builder {

        /* renamed from: a */
        public CrashlyticsReport.Session.Event.Application.Execution f55249a;

        /* renamed from: b */
        public List f55250b;

        /* renamed from: c */
        public List f55251c;

        /* renamed from: d */
        public Boolean f55252d;

        /* renamed from: e */
        public CrashlyticsReport.Session.Event.Application.ProcessDetails f55253e;

        /* renamed from: f */
        public List f55254f;

        /* renamed from: g */
        public int f55255g;

        /* renamed from: h */
        public byte f55256h;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application build() {
            CrashlyticsReport.Session.Event.Application.Execution execution;
            if (this.f55256h == 1 && (execution = this.f55249a) != null) {
                return new C8443l(execution, this.f55250b, this.f55251c, this.f55252d, this.f55253e, this.f55254f, this.f55255g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55249a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f55256h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(List list) {
            this.f55254f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setBackground(Boolean bool) {
            this.f55252d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.f55253e = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(List list) {
            this.f55250b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution != null) {
                this.f55249a = execution;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(List list) {
            this.f55251c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.f55255g = i;
            this.f55256h = (byte) (this.f55256h | 1);
            return this;
        }

        public C8445b() {
        }

        public C8445b(CrashlyticsReport.Session.Event.Application application) {
            this.f55249a = application.getExecution();
            this.f55250b = application.getCustomAttributes();
            this.f55251c = application.getInternalKeys();
            this.f55252d = application.getBackground();
            this.f55253e = application.getCurrentProcessDetails();
            this.f55254f = application.getAppProcessDetails();
            this.f55255g = application.getUiOrientation();
            this.f55256h = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (this.f55242a.equals(application.getExecution()) && ((list = this.f55243b) != null ? list.equals(application.getCustomAttributes()) : application.getCustomAttributes() == null) && ((list2 = this.f55244c) != null ? list2.equals(application.getInternalKeys()) : application.getInternalKeys() == null) && ((bool = this.f55245d) != null ? bool.equals(application.getBackground()) : application.getBackground() == null) && ((processDetails = this.f55246e) != null ? processDetails.equals(application.getCurrentProcessDetails()) : application.getCurrentProcessDetails() == null) && ((list3 = this.f55247f) != null ? list3.equals(application.getAppProcessDetails()) : application.getAppProcessDetails() == null) && this.f55248g == application.getUiOrientation()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public List getAppProcessDetails() {
        return this.f55247f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public Boolean getBackground() {
        return this.f55245d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails() {
        return this.f55246e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public List getCustomAttributes() {
        return this.f55243b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.f55242a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public List getInternalKeys() {
        return this.f55244c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public int getUiOrientation() {
        return this.f55248g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f55242a.hashCode() ^ 1000003) * 1000003;
        List list = this.f55243b;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f55244c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Boolean bool = this.f55245d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.f55246e;
        if (processDetails == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = processDetails.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        List list3 = this.f55247f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return ((i5 ^ i) * 1000003) ^ this.f55248g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new C8445b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f55242a + ", customAttributes=" + this.f55243b + ", internalKeys=" + this.f55244c + ", background=" + this.f55245d + ", currentProcessDetails=" + this.f55246e + ", appProcessDetails=" + this.f55247f + ", uiOrientation=" + this.f55248g + "}";
    }

    public C8443l(CrashlyticsReport.Session.Event.Application.Execution execution, List list, List list2, Boolean bool, CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, List list3, int i) {
        this.f55242a = execution;
        this.f55243b = list;
        this.f55244c = list2;
        this.f55245d = bool;
        this.f55246e = processDetails;
        this.f55247f = list3;
        this.f55248g = i;
    }
}
