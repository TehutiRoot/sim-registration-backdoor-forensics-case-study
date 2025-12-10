package androidx.camera.core.impl;

import androidx.camera.core.impl.StateObservable;

/* renamed from: androidx.camera.core.impl.g */
/* loaded from: classes.dex */
public final class C2504g extends StateObservable.AbstractC2491a {

    /* renamed from: a */
    public final Throwable f11346a;

    public C2504g(Throwable th2) {
        if (th2 != null) {
            this.f11346a = th2;
            return;
        }
        throw new NullPointerException("Null error");
    }

    @Override // androidx.camera.core.impl.StateObservable.AbstractC2491a
    /* renamed from: a */
    public Throwable mo62836a() {
        return this.f11346a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StateObservable.AbstractC2491a) {
            return this.f11346a.equals(((StateObservable.AbstractC2491a) obj).mo62836a());
        }
        return false;
    }

    public int hashCode() {
        return this.f11346a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f11346a + "}";
    }
}