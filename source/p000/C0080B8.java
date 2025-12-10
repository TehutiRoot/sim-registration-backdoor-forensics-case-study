package p000;

/* renamed from: B8 */
/* loaded from: classes4.dex */
public final class C0080B8 extends AbstractC17797Ii0 {

    /* renamed from: a */
    public final String f305a;

    /* renamed from: b */
    public final String f306b;

    public C0080B8(String str, String str2) {
        if (str != null) {
            this.f305a = str;
            if (str2 != null) {
                this.f306b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // p000.AbstractC17797Ii0
    /* renamed from: b */
    public String mo67879b() {
        return this.f305a;
    }

    @Override // p000.AbstractC17797Ii0
    /* renamed from: c */
    public String mo67878c() {
        return this.f306b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC17797Ii0)) {
            return false;
        }
        AbstractC17797Ii0 abstractC17797Ii0 = (AbstractC17797Ii0) obj;
        if (this.f305a.equals(abstractC17797Ii0.mo67879b()) && this.f306b.equals(abstractC17797Ii0.mo67878c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f305a.hashCode() ^ 1000003) * 1000003) ^ this.f306b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f305a + ", version=" + this.f306b + "}";
    }
}
