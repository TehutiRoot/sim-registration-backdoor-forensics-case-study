package p000;

import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;

/* renamed from: T8 */
/* loaded from: classes4.dex */
public final class C1367T8 extends RolloutAssignment {

    /* renamed from: a */
    public final String f5932a;

    /* renamed from: b */
    public final String f5933b;

    /* renamed from: c */
    public final String f5934c;

    /* renamed from: d */
    public final String f5935d;

    /* renamed from: e */
    public final long f5936e;

    public C1367T8(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.f5932a = str;
            if (str2 != null) {
                this.f5933b = str2;
                if (str3 != null) {
                    this.f5934c = str3;
                    if (str4 != null) {
                        this.f5935d = str4;
                        this.f5936e = j;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        if (this.f5932a.equals(rolloutAssignment.getRolloutId()) && this.f5933b.equals(rolloutAssignment.getParameterKey()) && this.f5934c.equals(rolloutAssignment.getParameterValue()) && this.f5935d.equals(rolloutAssignment.getVariantId()) && this.f5936e == rolloutAssignment.getTemplateVersion()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterKey() {
        return this.f5933b;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterValue() {
        return this.f5934c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getRolloutId() {
        return this.f5932a;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public long getTemplateVersion() {
        return this.f5936e;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getVariantId() {
        return this.f5935d;
    }

    public int hashCode() {
        long j = this.f5936e;
        return ((((((((this.f5932a.hashCode() ^ 1000003) * 1000003) ^ this.f5933b.hashCode()) * 1000003) ^ this.f5934c.hashCode()) * 1000003) ^ this.f5935d.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f5932a + ", parameterKey=" + this.f5933b + ", parameterValue=" + this.f5934c + ", variantId=" + this.f5935d + ", templateVersion=" + this.f5936e + "}";
    }
}
