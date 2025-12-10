package p000;

import android.view.Surface;
import androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig;
import java.util.List;

/* renamed from: c9 */
/* loaded from: classes.dex */
public final class C5425c9 extends SurfaceOutputConfig {

    /* renamed from: a */
    public final int f39344a;

    /* renamed from: b */
    public final int f39345b;

    /* renamed from: c */
    public final String f39346c;

    /* renamed from: d */
    public final List f39347d;

    /* renamed from: e */
    public final Surface f39348e;

    public C5425c9(int i, int i2, String str, List list, Surface surface) {
        this.f39344a = i;
        this.f39345b = i2;
        this.f39346c = str;
        if (list != null) {
            this.f39347d = list;
            if (surface != null) {
                this.f39348e = surface;
                return;
            }
            throw new NullPointerException("Null surface");
        }
        throw new NullPointerException("Null surfaceSharingOutputConfigs");
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig
    /* renamed from: c */
    public Surface mo51705c() {
        return this.f39348e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutputConfig)) {
            return false;
        }
        SurfaceOutputConfig surfaceOutputConfig = (SurfaceOutputConfig) obj;
        if (this.f39344a == surfaceOutputConfig.getId() && this.f39345b == surfaceOutputConfig.getSurfaceGroupId() && ((str = this.f39346c) != null ? str.equals(surfaceOutputConfig.getPhysicalCameraId()) : surfaceOutputConfig.getPhysicalCameraId() == null) && this.f39347d.equals(surfaceOutputConfig.getSurfaceSharingOutputConfigs()) && this.f39348e.equals(surfaceOutputConfig.mo51705c())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig, p000.InterfaceC0757Ki
    public int getId() {
        return this.f39344a;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig, p000.InterfaceC0757Ki
    public String getPhysicalCameraId() {
        return this.f39346c;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig, p000.InterfaceC0757Ki
    public int getSurfaceGroupId() {
        return this.f39345b;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig, p000.InterfaceC0757Ki
    public List getSurfaceSharingOutputConfigs() {
        return this.f39347d;
    }

    public int hashCode() {
        int hashCode;
        int i = (((this.f39344a ^ 1000003) * 1000003) ^ this.f39345b) * 1000003;
        String str = this.f39346c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((i ^ hashCode) * 1000003) ^ this.f39347d.hashCode()) * 1000003) ^ this.f39348e.hashCode();
    }

    public String toString() {
        return "SurfaceOutputConfig{id=" + this.f39344a + ", surfaceGroupId=" + this.f39345b + ", physicalCameraId=" + this.f39346c + ", surfaceSharingOutputConfigs=" + this.f39347d + ", surface=" + this.f39348e + "}";
    }
}
