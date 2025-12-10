package androidx.camera.core.impl;

import androidx.camera.core.impl.StateObservable;

/* renamed from: androidx.camera.core.impl.g */
/* loaded from: classes.dex */
public final class C2522g extends StateObservable.AbstractC2509a {

    /* renamed from: a */
    public final Throwable f11258a;

    public C2522g(Throwable th2) {
        if (th2 != null) {
            this.f11258a = th2;
            return;
        }
        throw new NullPointerException("Null error");
    }

    @Override // androidx.camera.core.impl.StateObservable.AbstractC2509a
    /* renamed from: a */
    public Throwable mo62888a() {
        return this.f11258a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StateObservable.AbstractC2509a) {
            return this.f11258a.equals(((StateObservable.AbstractC2509a) obj).mo62888a());
        }
        return false;
    }

    public int hashCode() {
        return this.f11258a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f11258a + "}";
    }
}
