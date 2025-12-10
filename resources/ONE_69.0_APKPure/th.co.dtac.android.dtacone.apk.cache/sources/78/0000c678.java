package p000;

import io.opencensus.tags.TagKey;

/* renamed from: f9 */
/* loaded from: classes5.dex */
public final class C10201f9 extends TagKey {

    /* renamed from: a */
    public final String f61788a;

    public C10201f9(String str) {
        if (str != null) {
            this.f61788a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TagKey) {
            return this.f61788a.equals(((TagKey) obj).getName());
        }
        return false;
    }

    @Override // io.opencensus.tags.TagKey
    public String getName() {
        return this.f61788a;
    }

    public int hashCode() {
        return this.f61788a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagKey{name=" + this.f61788a + "}";
    }
}