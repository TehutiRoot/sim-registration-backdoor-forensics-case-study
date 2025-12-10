package p000;

import com.google.firebase.remoteconfig.ConfigUpdate;
import java.util.Set;

/* renamed from: m8 */
/* loaded from: classes4.dex */
public final class C12266m8 extends ConfigUpdate {

    /* renamed from: a */
    public final Set f71821a;

    public C12266m8(Set set) {
        if (set != null) {
            this.f71821a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.f71821a.equals(((ConfigUpdate) obj).getUpdatedKeys());
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    public Set getUpdatedKeys() {
        return this.f71821a;
    }

    public int hashCode() {
        return this.f71821a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f71821a + "}";
    }
}
