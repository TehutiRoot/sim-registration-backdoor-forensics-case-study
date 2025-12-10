package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* renamed from: androidx.camera.camera2.internal.b */
/* loaded from: classes.dex */
public final class C2372b extends Camera2CameraImpl.AbstractC2349h {

    /* renamed from: a */
    public final String f10450a;

    /* renamed from: b */
    public final Class f10451b;

    /* renamed from: c */
    public final SessionConfig f10452c;

    /* renamed from: d */
    public final UseCaseConfig f10453d;

    /* renamed from: e */
    public final Size f10454e;

    public C2372b(String str, Class cls, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, Size size) {
        if (str != null) {
            this.f10450a = str;
            if (cls != null) {
                this.f10451b = cls;
                if (sessionConfig != null) {
                    this.f10452c = sessionConfig;
                    if (useCaseConfig != null) {
                        this.f10453d = useCaseConfig;
                        this.f10454e = size;
                        return;
                    }
                    throw new NullPointerException("Null useCaseConfig");
                }
                throw new NullPointerException("Null sessionConfig");
            }
            throw new NullPointerException("Null useCaseType");
        }
        throw new NullPointerException("Null useCaseId");
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2349h
    /* renamed from: c */
    public SessionConfig mo63728c() {
        return this.f10452c;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2349h
    /* renamed from: d */
    public Size mo63727d() {
        return this.f10454e;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2349h
    /* renamed from: e */
    public UseCaseConfig mo63726e() {
        return this.f10453d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera2CameraImpl.AbstractC2349h)) {
            return false;
        }
        Camera2CameraImpl.AbstractC2349h abstractC2349h = (Camera2CameraImpl.AbstractC2349h) obj;
        if (this.f10450a.equals(abstractC2349h.mo63725f()) && this.f10451b.equals(abstractC2349h.mo63724g()) && this.f10452c.equals(abstractC2349h.mo63728c()) && this.f10453d.equals(abstractC2349h.mo63726e())) {
            Size size = this.f10454e;
            if (size == null) {
                if (abstractC2349h.mo63727d() == null) {
                    return true;
                }
            } else if (size.equals(abstractC2349h.mo63727d())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2349h
    /* renamed from: f */
    public String mo63725f() {
        return this.f10450a;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2349h
    /* renamed from: g */
    public Class mo63724g() {
        return this.f10451b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f10450a.hashCode() ^ 1000003) * 1000003) ^ this.f10451b.hashCode()) * 1000003) ^ this.f10452c.hashCode()) * 1000003) ^ this.f10453d.hashCode()) * 1000003;
        Size size = this.f10454e;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f10450a + ", useCaseType=" + this.f10451b + ", sessionConfig=" + this.f10452c + ", useCaseConfig=" + this.f10453d + ", surfaceResolution=" + this.f10454e + "}";
    }
}
