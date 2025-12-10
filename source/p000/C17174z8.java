package p000;

import io.opencensus.metrics.LabelKey;

/* renamed from: z8 */
/* loaded from: classes5.dex */
public final class C17174z8 extends LabelKey {

    /* renamed from: a */
    public final String f108983a;

    /* renamed from: b */
    public final String f108984b;

    public C17174z8(String str, String str2) {
        if (str != null) {
            this.f108983a = str;
            if (str2 != null) {
                this.f108984b = str2;
                return;
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null key");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelKey)) {
            return false;
        }
        LabelKey labelKey = (LabelKey) obj;
        if (this.f108983a.equals(labelKey.getKey()) && this.f108984b.equals(labelKey.getDescription())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.LabelKey
    public String getDescription() {
        return this.f108984b;
    }

    @Override // io.opencensus.metrics.LabelKey
    public String getKey() {
        return this.f108983a;
    }

    public int hashCode() {
        return ((this.f108983a.hashCode() ^ 1000003) * 1000003) ^ this.f108984b.hashCode();
    }

    public String toString() {
        return "LabelKey{key=" + this.f108983a + ", description=" + this.f108984b + "}";
    }
}
