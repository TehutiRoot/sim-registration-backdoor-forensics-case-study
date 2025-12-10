package p000;

import android.util.Size;
import androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig;
import java.util.List;

/* renamed from: w8 */
/* loaded from: classes.dex */
public final class C16958w8 extends ImageReaderOutputConfig {

    /* renamed from: a */
    public final int f108336a;

    /* renamed from: b */
    public final int f108337b;

    /* renamed from: c */
    public final String f108338c;

    /* renamed from: d */
    public final List f108339d;

    /* renamed from: e */
    public final Size f108340e;

    /* renamed from: f */
    public final int f108341f;

    /* renamed from: g */
    public final int f108342g;

    public C16958w8(int i, int i2, String str, List list, Size size, int i3, int i4) {
        this.f108336a = i;
        this.f108337b = i2;
        this.f108338c = str;
        if (list != null) {
            this.f108339d = list;
            if (size != null) {
                this.f108340e = size;
                this.f108341f = i3;
                this.f108342g = i4;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceSharingOutputConfigs");
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    /* renamed from: c */
    public int mo797c() {
        return this.f108341f;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    /* renamed from: d */
    public int mo796d() {
        return this.f108342g;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    /* renamed from: e */
    public Size mo795e() {
        return this.f108340e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageReaderOutputConfig)) {
            return false;
        }
        ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) obj;
        if (this.f108336a == imageReaderOutputConfig.getId() && this.f108337b == imageReaderOutputConfig.getSurfaceGroupId() && ((str = this.f108338c) != null ? str.equals(imageReaderOutputConfig.getPhysicalCameraId()) : imageReaderOutputConfig.getPhysicalCameraId() == null) && this.f108339d.equals(imageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.f108340e.equals(imageReaderOutputConfig.mo795e()) && this.f108341f == imageReaderOutputConfig.mo797c() && this.f108342g == imageReaderOutputConfig.mo796d()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, p000.InterfaceC0747Ki
    public int getId() {
        return this.f108336a;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, p000.InterfaceC0747Ki
    public String getPhysicalCameraId() {
        return this.f108338c;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, p000.InterfaceC0747Ki
    public int getSurfaceGroupId() {
        return this.f108337b;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, p000.InterfaceC0747Ki
    public List getSurfaceSharingOutputConfigs() {
        return this.f108339d;
    }

    public int hashCode() {
        int hashCode;
        int i = (((this.f108336a ^ 1000003) * 1000003) ^ this.f108337b) * 1000003;
        String str = this.f108338c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((i ^ hashCode) * 1000003) ^ this.f108339d.hashCode()) * 1000003) ^ this.f108340e.hashCode()) * 1000003) ^ this.f108341f) * 1000003) ^ this.f108342g;
    }

    public String toString() {
        return "ImageReaderOutputConfig{id=" + this.f108336a + ", surfaceGroupId=" + this.f108337b + ", physicalCameraId=" + this.f108338c + ", surfaceSharingOutputConfigs=" + this.f108339d + ", size=" + this.f108340e + ", imageFormat=" + this.f108341f + ", maxImages=" + this.f108342g + "}";
    }
}