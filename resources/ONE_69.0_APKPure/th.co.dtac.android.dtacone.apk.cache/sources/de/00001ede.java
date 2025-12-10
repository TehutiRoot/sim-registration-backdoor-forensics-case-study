package androidx.camera.core;

import androidx.camera.core.CameraState;

/* renamed from: androidx.camera.core.b */
/* loaded from: classes.dex */
public final class C2442b extends CameraState {

    /* renamed from: a */
    public final CameraState.Type f11040a;

    /* renamed from: b */
    public final CameraState.StateError f11041b;

    public C2442b(CameraState.Type type, CameraState.StateError stateError) {
        if (type != null) {
            this.f11040a = type;
            this.f11041b = stateError;
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
        if (this.f11040a.equals(cameraState.getType())) {
            CameraState.StateError stateError = this.f11041b;
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
        return this.f11041b;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.Type getType() {
        return this.f11040a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f11040a.hashCode() ^ 1000003) * 1000003;
        CameraState.StateError stateError = this.f11041b;
        if (stateError == null) {
            hashCode = 0;
        } else {
            hashCode = stateError.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "CameraState{type=" + this.f11040a + ", error=" + this.f11041b + "}";
    }
}