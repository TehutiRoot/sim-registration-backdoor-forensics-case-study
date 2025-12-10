package androidx.camera.core;

import androidx.camera.core.CameraState;

/* renamed from: androidx.camera.core.c */
/* loaded from: classes.dex */
public final class C2443c extends CameraState.StateError {

    /* renamed from: a */
    public final int f11042a;

    /* renamed from: b */
    public final Throwable f11043b;

    public C2443c(int i, Throwable th2) {
        this.f11042a = i;
        this.f11043b = th2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.StateError)) {
            return false;
        }
        CameraState.StateError stateError = (CameraState.StateError) obj;
        if (this.f11042a == stateError.getCode()) {
            Throwable th2 = this.f11043b;
            if (th2 == null) {
                if (stateError.getCause() == null) {
                    return true;
                }
            } else if (th2.equals(stateError.getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public Throwable getCause() {
        return this.f11043b;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
        return this.f11042a;
    }

    public int hashCode() {
        int hashCode;
        int i = (this.f11042a ^ 1000003) * 1000003;
        Throwable th2 = this.f11043b;
        if (th2 == null) {
            hashCode = 0;
        } else {
            hashCode = th2.hashCode();
        }
        return i ^ hashCode;
    }

    public String toString() {
        return "StateError{code=" + this.f11042a + ", cause=" + this.f11043b + "}";
    }
}