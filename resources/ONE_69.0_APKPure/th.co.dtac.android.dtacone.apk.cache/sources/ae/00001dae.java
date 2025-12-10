package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* renamed from: androidx.camera.camera2.internal.b */
/* loaded from: classes.dex */
public final class C2354b extends Camera2CameraImpl.AbstractC2331h {

    /* renamed from: a */
    public final String f10538a;

    /* renamed from: b */
    public final Class f10539b;

    /* renamed from: c */
    public final SessionConfig f10540c;

    /* renamed from: d */
    public final UseCaseConfig f10541d;

    /* renamed from: e */
    public final Size f10542e;

    public C2354b(String str, Class cls, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, Size size) {
        if (str != null) {
            this.f10538a = str;
            if (cls != null) {
                this.f10539b = cls;
                if (sessionConfig != null) {
                    this.f10540c = sessionConfig;
                    if (useCaseConfig != null) {
                        this.f10541d = useCaseConfig;
                        this.f10542e = size;
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

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2331h
    /* renamed from: c */
    public SessionConfig mo63679c() {
        return this.f10540c;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2331h
    /* renamed from: d */
    public Size mo63678d() {
        return this.f10542e;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2331h
    /* renamed from: e */
    public UseCaseConfig mo63677e() {
        return this.f10541d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera2CameraImpl.AbstractC2331h)) {
            return false;
        }
        Camera2CameraImpl.AbstractC2331h abstractC2331h = (Camera2CameraImpl.AbstractC2331h) obj;
        if (this.f10538a.equals(abstractC2331h.mo63676f()) && this.f10539b.equals(abstractC2331h.mo63675g()) && this.f10540c.equals(abstractC2331h.mo63679c()) && this.f10541d.equals(abstractC2331h.mo63677e())) {
            Size size = this.f10542e;
            if (size == null) {
                if (abstractC2331h.mo63678d() == null) {
                    return true;
                }
            } else if (size.equals(abstractC2331h.mo63678d())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2331h
    /* renamed from: f */
    public String mo63676f() {
        return this.f10538a;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.AbstractC2331h
    /* renamed from: g */
    public Class mo63675g() {
        return this.f10539b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f10538a.hashCode() ^ 1000003) * 1000003) ^ this.f10539b.hashCode()) * 1000003) ^ this.f10540c.hashCode()) * 1000003) ^ this.f10541d.hashCode()) * 1000003;
        Size size = this.f10542e;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f10538a + ", useCaseType=" + this.f10539b + ", sessionConfig=" + this.f10540c + ", useCaseConfig=" + this.f10541d + ", surfaceResolution=" + this.f10542e + "}";
    }
}