package androidx.camera.core;

import androidx.camera.core.CameraState;

/* renamed from: androidx.camera.core.b */
/* loaded from: classes.dex */
public final class C2460b extends CameraState {

    /* renamed from: a */
    public final CameraState.Type f10952a;

    /* renamed from: b */
    public final CameraState.StateError f10953b;

    public C2460b(CameraState.Type type, CameraState.StateError stateError) {
        if (type != null) {
            this.f10952a = type;
            this.f10953b = stateError;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        if (this.f10952a.equals(cameraState.getType())) {
            CameraState.StateError stateError = this.f10953b;
            if (stateError == null) {
                if (cameraState.getError() == null) {
                    return true;
                }
            } else if (stateError.equals(cameraState.getError())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.StateError getError() {
        return this.f10953b;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.Type getType() {
        return this.f10952a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f10952a.hashCode() ^ 1000003) * 1000003;
        CameraState.StateError stateError = this.f10953b;
        if (stateError == null) {
            hashCode = 0;
        } else {
            hashCode = stateError.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "CameraState{type=" + this.f10952a + ", error=" + this.f10953b + "}";
    }
}
