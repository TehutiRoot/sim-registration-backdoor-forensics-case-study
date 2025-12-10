package p000;

import androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig;
import java.util.List;

/* renamed from: H8 */
/* loaded from: classes.dex */
public final class C0505H8 extends MultiResolutionImageReaderOutputConfig {

    /* renamed from: a */
    public final int f2111a;

    /* renamed from: b */
    public final int f2112b;

    /* renamed from: c */
    public final String f2113c;

    /* renamed from: d */
    public final List f2114d;

    /* renamed from: e */
    public final int f2115e;

    /* renamed from: f */
    public final int f2116f;

    public C0505H8(int i, int i2, String str, List list, int i3, int i4) {
        this.f2111a = i;
        this.f2112b = i2;
        this.f2113c = str;
        if (list != null) {
            this.f2114d = list;
            this.f2115e = i3;
            this.f2116f = i4;
            return;
        }
        throw new NullPointerException("Null surfaceSharingOutputConfigs");
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    /* renamed from: b */
    public int mo62576b() {
        return this.f2115e;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    /* renamed from: c */
    public int mo62575c() {
        return this.f2116f;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiResolutionImageReaderOutputConfig)) {
            return false;
        }
        MultiResolutionImageReaderOutputConfig multiResolutionImageReaderOutputConfig = (MultiResolutionImageReaderOutputConfig) obj;
        if (this.f2111a == multiResolutionImageReaderOutputConfig.getId() && this.f2112b == multiResolutionImageReaderOutputConfig.getSurfaceGroupId() && ((str = this.f2113c) != null ? str.equals(multiResolutionImageReaderOutputConfig.getPhysicalCameraId()) : multiResolutionImageReaderOutputConfig.getPhysicalCameraId() == null) && this.f2114d.equals(multiResolutionImageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.f2115e == multiResolutionImageReaderOutputConfig.mo62576b() && this.f2116f == multiResolutionImageReaderOutputConfig.mo62575c()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, p000.InterfaceC0757Ki
    public int getId() {
        return this.f2111a;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, p000.InterfaceC0757Ki
    public String getPhysicalCameraId() {
        return this.f2113c;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, p000.InterfaceC0757Ki
    public int getSurfaceGroupId() {
        return this.f2112b;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, p000.InterfaceC0757Ki
    public List getSurfaceSharingOutputConfigs() {
        return this.f2114d;
    }

    public int hashCode() {
        int hashCode;
        int i = (((this.f2111a ^ 1000003) * 1000003) ^ this.f2112b) * 1000003;
        String str = this.f2113c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((i ^ hashCode) * 1000003) ^ this.f2114d.hashCode()) * 1000003) ^ this.f2115e) * 1000003) ^ this.f2116f;
    }

    public String toString() {
        return "MultiResolutionImageReaderOutputConfig{id=" + this.f2111a + ", surfaceGroupId=" + this.f2112b + ", physicalCameraId=" + this.f2113c + ", surfaceSharingOutputConfigs=" + this.f2114d + ", imageFormat=" + this.f2115e + ", maxImages=" + this.f2116f + "}";
    }
}
