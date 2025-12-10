package p000;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* renamed from: n8 */
/* loaded from: classes4.dex */
public final class C12338n8 extends CrashlyticsReportWithSessionId {

    /* renamed from: a */
    public final CrashlyticsReport f72130a;

    /* renamed from: b */
    public final String f72131b;

    /* renamed from: c */
    public final File f72132c;

    public C12338n8(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport != null) {
            this.f72130a = crashlyticsReport;
            if (str != null) {
                this.f72131b = str;
                if (file != null) {
                    this.f72132c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        if (this.f72130a.equals(crashlyticsReportWithSessionId.getReport()) && this.f72131b.equals(crashlyticsReportWithSessionId.getSessionId()) && this.f72132c.equals(crashlyticsReportWithSessionId.getReportFile())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public CrashlyticsReport getReport() {
        return this.f72130a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public File getReportFile() {
        return this.f72132c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public String getSessionId() {
        return this.f72131b;
    }

    public int hashCode() {
        return ((((this.f72130a.hashCode() ^ 1000003) * 1000003) ^ this.f72131b.hashCode()) * 1000003) ^ this.f72132c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f72130a + ", sessionId=" + this.f72131b + ", reportFile=" + this.f72132c + "}";
    }
}
