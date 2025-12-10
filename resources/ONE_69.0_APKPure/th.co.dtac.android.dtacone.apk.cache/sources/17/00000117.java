package p000;

/* renamed from: B8 */
/* loaded from: classes4.dex */
public final class C0082B8 extends AbstractC18218Oi0 {

    /* renamed from: a */
    public final String f322a;

    /* renamed from: b */
    public final String f323b;

    public C0082B8(String str, String str2) {
        if (str != null) {
            this.f322a = str;
            if (str2 != null) {
                this.f323b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // p000.AbstractC18218Oi0
    /* renamed from: b */
    public String mo67096b() {
        return this.f322a;
    }

    @Override // p000.AbstractC18218Oi0
    /* renamed from: c */
    public String mo67095c() {
        return this.f323b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC18218Oi0)) {
            return false;
        }
        AbstractC18218Oi0 abstractC18218Oi0 = (AbstractC18218Oi0) obj;
        if (this.f322a.equals(abstractC18218Oi0.mo67096b()) && this.f323b.equals(abstractC18218Oi0.mo67095c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f322a.hashCode() ^ 1000003) * 1000003) ^ this.f323b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f322a + ", version=" + this.f323b + "}";
    }
}