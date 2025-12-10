package p000;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.Set;

/* renamed from: U8 */
/* loaded from: classes4.dex */
public final class C1442U8 extends RolloutsState {

    /* renamed from: a */
    public final Set f6232a;

    public C1442U8(Set set) {
        if (set != null) {
            this.f6232a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutsState) {
            return this.f6232a.equals(((RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsState
    public Set getRolloutAssignments() {
        return this.f6232a;
    }

    public int hashCode() {
        return this.f6232a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f6232a + "}";
    }
}
