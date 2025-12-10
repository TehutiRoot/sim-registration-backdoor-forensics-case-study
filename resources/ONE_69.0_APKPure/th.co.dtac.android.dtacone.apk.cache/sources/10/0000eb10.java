package p000;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* renamed from: n8 */
/* loaded from: classes4.dex */
public final class C12330n8 extends CrashlyticsReportWithSessionId {

    /* renamed from: a */
    public final CrashlyticsReport f72260a;

    /* renamed from: b */
    public final String f72261b;

    /* renamed from: c */
    public final File f72262c;

    public C12330n8(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport != null) {
            this.f72260a = crashlyticsReport;
            if (str != null) {
                this.f72261b = str;
                if (file != null) {
                    this.f72262c = file;
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
        if (this.f72260a.equals(crashlyticsReportWithSessionId.getReport()) && this.f72261b.equals(crashlyticsReportWithSessionId.getSessionId()) && this.f72262c.equals(crashlyticsReportWithSessionId.getReportFile())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public CrashlyticsReport getReport() {
        return this.f72260a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public File getReportFile() {
        return this.f72262c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public String getSessionId() {
        return this.f72261b;
    }

    public int hashCode() {
        return ((((this.f72260a.hashCode() ^ 1000003) * 1000003) ^ this.f72261b.hashCode()) * 1000003) ^ this.f72262c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f72260a + ", sessionId=" + this.f72261b + ", reportFile=" + this.f72262c + "}";
    }
}