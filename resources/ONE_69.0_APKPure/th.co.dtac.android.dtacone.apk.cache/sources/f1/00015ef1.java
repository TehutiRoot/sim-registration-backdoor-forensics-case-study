package p000;

import androidx.camera.core.impl.Identifier;

/* renamed from: v8 */
/* loaded from: classes.dex */
public final class C16886v8 extends Identifier {

    /* renamed from: a */
    public final Object f107997a;

    public C16886v8(Object obj) {
        if (obj != null) {
            this.f107997a = obj;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Identifier) {
            return this.f107997a.equals(((Identifier) obj).getValue());
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Identifier
    public Object getValue() {
        return this.f107997a;
    }

    public int hashCode() {
        return this.f107997a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f107997a + "}";
    }
}