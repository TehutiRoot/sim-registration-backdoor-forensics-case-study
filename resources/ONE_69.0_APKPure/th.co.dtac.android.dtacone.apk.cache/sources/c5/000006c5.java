package p000;

import androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig;
import java.util.List;

/* renamed from: H8 */
/* loaded from: classes.dex */
public final class C0498H8 extends MultiResolutionImageReaderOutputConfig {

    /* renamed from: a */
    public final int f2290a;

    /* renamed from: b */
    public final int f2291b;

    /* renamed from: c */
    public final String f2292c;

    /* renamed from: d */
    public final List f2293d;

    /* renamed from: e */
    public final int f2294e;

    /* renamed from: f */
    public final int f2295f;

    public C0498H8(int i, int i2, String str, List list, int i3, int i4) {
        this.f2290a = i;
        this.f2291b = i2;
        this.f2292c = str;
        if (list != null) {
            this.f2293d = list;
            this.f2294e = i3;
            this.f2295f = i4;
            return;
        }
        throw new NullPointerException("Null surfaceSharingOutputConfigs");
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    /* renamed from: b */
    public int mo62524b() {
        return this.f2294e;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    /* renamed from: c */
    public int mo62523c() {
        return this.f2295f;
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
        if (this.f2290a == multiResolutionImageReaderOutputConfig.getId() && this.f2291b == multiResolutionImageReaderOutputConfig.getSurfaceGroupId() && ((str = this.f2292c) != null ? str.equals(multiResolutionImageReaderOutputConfig.getPhysicalCameraId()) : multiResolutionImageReaderOutputConfig.getPhysicalCameraId() == null) && this.f2293d.equals(multiResolutionImageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.f2294e == multiResolutionImageReaderOutputConfig.mo62524b() && this.f2295f == multiResolutionImageReaderOutputConfig.mo62523c()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, p000.InterfaceC0747Ki
    public int getId() {
        return this.f2290a;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, p000.InterfaceC0747Ki
    public String getPhysicalCameraId() {
        return this.f2292c;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, p000.InterfaceC0747Ki
    public int getSurfaceGroupId() {
        return this.f2291b;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, p000.InterfaceC0747Ki
    public List getSurfaceSharingOutputConfigs() {
        return this.f2293d;
    }

    public int hashCode() {
        int hashCode;
        int i = (((this.f2290a ^ 1000003) * 1000003) ^ this.f2291b) * 1000003;
        String str = this.f2292c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((i ^ hashCode) * 1000003) ^ this.f2293d.hashCode()) * 1000003) ^ this.f2294e) * 1000003) ^ this.f2295f;
    }

    public String toString() {
        return "MultiResolutionImageReaderOutputConfig{id=" + this.f2290a + ", surfaceGroupId=" + this.f2291b + ", physicalCameraId=" + this.f2292c + ", surfaceSharingOutputConfigs=" + this.f2293d + ", imageFormat=" + this.f2294e + ", maxImages=" + this.f2295f + "}";
    }
}