package androidx.camera.core;

import androidx.camera.core.CameraState;

/* renamed from: androidx.camera.core.c */
/* loaded from: classes.dex */
public final class C2461c extends CameraState.StateError {

    /* renamed from: a */
    public final int f10954a;

    /* renamed from: b */
    public final Throwable f10955b;

    public C2461c(int i, Throwable th2) {
        this.f10954a = i;
        this.f10955b = th2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.StateError)) {
            return false;
        }
        CameraState.StateError stateError = (CameraState.StateError) obj;
        if (this.f10954a == stateError.getCode()) {
            Throwable th2 = this.f10955b;
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
        return this.f10955b;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
        return this.f10954a;
    }

    public int hashCode() {
        int hashCode;
        int i = (this.f10954a ^ 1000003) * 1000003;
        Throwable th2 = this.f10955b;
        if (th2 == null) {
            hashCode = 0;
        } else {
            hashCode = th2.hashCode();
        }
        return i ^ hashCode;
    }

    public String toString() {
        return "StateError{code=" + this.f10954a + ", cause=" + this.f10955b + "}";
    }
}
