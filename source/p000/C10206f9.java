package p000;

import io.opencensus.tags.TagKey;

/* renamed from: f9 */
/* loaded from: classes5.dex */
public final class C10206f9 extends TagKey {

    /* renamed from: a */
    public final String f61727a;

    public C10206f9(String str) {
        if (str != null) {
            this.f61727a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TagKey) {
            return this.f61727a.equals(((TagKey) obj).getName());
        }
        return false;
    }

    @Override // io.opencensus.tags.TagKey
    public String getName() {
        return this.f61727a;
    }

    public int hashCode() {
        return this.f61727a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagKey{name=" + this.f61727a + "}";
    }
}
