package p000;

import io.opencensus.tags.TagValue;

/* renamed from: g9 */
/* loaded from: classes5.dex */
public final class C10272g9 extends TagValue {

    /* renamed from: a */
    public final String f62088a;

    public C10272g9(String str) {
        if (str != null) {
            this.f62088a = str;
            return;
        }
        throw new NullPointerException("Null asString");
    }

    @Override // io.opencensus.tags.TagValue
    public String asString() {
        return this.f62088a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TagValue) {
            return this.f62088a.equals(((TagValue) obj).asString());
        }
        return false;
    }

    public int hashCode() {
        return this.f62088a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagValue{asString=" + this.f62088a + "}";
    }
}