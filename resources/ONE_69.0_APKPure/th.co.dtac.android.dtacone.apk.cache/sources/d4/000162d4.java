package p000;

import io.opencensus.metrics.LabelKey;

/* renamed from: z8 */
/* loaded from: classes5.dex */
public final class C17189z8 extends LabelKey {

    /* renamed from: a */
    public final String f109264a;

    /* renamed from: b */
    public final String f109265b;

    public C17189z8(String str, String str2) {
        if (str != null) {
            this.f109264a = str;
            if (str2 != null) {
                this.f109265b = str2;
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
        if (this.f109264a.equals(labelKey.getKey()) && this.f109265b.equals(labelKey.getDescription())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.LabelKey
    public String getDescription() {
        return this.f109265b;
    }

    @Override // io.opencensus.metrics.LabelKey
    public String getKey() {
        return this.f109264a;
    }

    public int hashCode() {
        return ((this.f109264a.hashCode() ^ 1000003) * 1000003) ^ this.f109265b.hashCode();
    }

    public String toString() {
        return "LabelKey{key=" + this.f109264a + ", description=" + this.f109265b + "}";
    }
}