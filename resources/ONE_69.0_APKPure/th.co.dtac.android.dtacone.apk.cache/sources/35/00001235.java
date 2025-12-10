package p000;

import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;

/* renamed from: T8 */
/* loaded from: classes4.dex */
public final class C1350T8 extends RolloutAssignment {

    /* renamed from: a */
    public final String f6266a;

    /* renamed from: b */
    public final String f6267b;

    /* renamed from: c */
    public final String f6268c;

    /* renamed from: d */
    public final String f6269d;

    /* renamed from: e */
    public final long f6270e;

    public C1350T8(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.f6266a = str;
            if (str2 != null) {
                this.f6267b = str2;
                if (str3 != null) {
                    this.f6268c = str3;
                    if (str4 != null) {
                        this.f6269d = str4;
                        this.f6270e = j;
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
        if (this.f6266a.equals(rolloutAssignment.getRolloutId()) && this.f6267b.equals(rolloutAssignment.getParameterKey()) && this.f6268c.equals(rolloutAssignment.getParameterValue()) && this.f6269d.equals(rolloutAssignment.getVariantId()) && this.f6270e == rolloutAssignment.getTemplateVersion()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterKey() {
        return this.f6267b;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterValue() {
        return this.f6268c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getRolloutId() {
        return this.f6266a;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public long getTemplateVersion() {
        return this.f6270e;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getVariantId() {
        return this.f6269d;
    }

    public int hashCode() {
        long j = this.f6270e;
        return ((((((((this.f6266a.hashCode() ^ 1000003) * 1000003) ^ this.f6267b.hashCode()) * 1000003) ^ this.f6268c.hashCode()) * 1000003) ^ this.f6269d.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f6266a + ", parameterKey=" + this.f6267b + ", parameterValue=" + this.f6268c + ", variantId=" + this.f6269d + ", templateVersion=" + this.f6270e + "}";
    }
}