package p000;

import android.util.Size;
import androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig;
import java.util.List;

/* renamed from: w8 */
/* loaded from: classes.dex */
public final class C16948w8 extends ImageReaderOutputConfig {

    /* renamed from: a */
    public final int f107910a;

    /* renamed from: b */
    public final int f107911b;

    /* renamed from: c */
    public final String f107912c;

    /* renamed from: d */
    public final List f107913d;

    /* renamed from: e */
    public final Size f107914e;

    /* renamed from: f */
    public final int f107915f;

    /* renamed from: g */
    public final int f107916g;

    public C16948w8(int i, int i2, String str, List list, Size size, int i3, int i4) {
        this.f107910a = i;
        this.f107911b = i2;
        this.f107912c = str;
        if (list != null) {
            this.f107913d = list;
            if (size != null) {
                this.f107914e = size;
                this.f107915f = i3;
                this.f107916g = i4;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceSharingOutputConfigs");
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    /* renamed from: c */
    public int mo900c() {
        return this.f107915f;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    /* renamed from: d */
    public int mo899d() {
        return this.f107916g;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    /* renamed from: e */
    public Size mo898e() {
        return this.f107914e;
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
        if (this.f107910a == imageReaderOutputConfig.getId() && this.f107911b == imageReaderOutputConfig.getSurfaceGroupId() && ((str = this.f107912c) != null ? str.equals(imageReaderOutputConfig.getPhysicalCameraId()) : imageReaderOutputConfig.getPhysicalCameraId() == null) && this.f107913d.equals(imageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.f107914e.equals(imageReaderOutputConfig.mo898e()) && this.f107915f == imageReaderOutputConfig.mo900c() && this.f107916g == imageReaderOutputConfig.mo899d()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, p000.InterfaceC0757Ki
    public int getId() {
        return this.f107910a;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, p000.InterfaceC0757Ki
    public String getPhysicalCameraId() {
        return this.f107912c;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, p000.InterfaceC0757Ki
    public int getSurfaceGroupId() {
        return this.f107911b;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, p000.InterfaceC0757Ki
    public List getSurfaceSharingOutputConfigs() {
        return this.f107913d;
    }

    public int hashCode() {
        int hashCode;
        int i = (((this.f107910a ^ 1000003) * 1000003) ^ this.f107911b) * 1000003;
        String str = this.f107912c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((i ^ hashCode) * 1000003) ^ this.f107913d.hashCode()) * 1000003) ^ this.f107914e.hashCode()) * 1000003) ^ this.f107915f) * 1000003) ^ this.f107916g;
    }

    public String toString() {
        return "ImageReaderOutputConfig{id=" + this.f107910a + ", surfaceGroupId=" + this.f107911b + ", physicalCameraId=" + this.f107912c + ", surfaceSharingOutputConfigs=" + this.f107913d + ", size=" + this.f107914e + ", imageFormat=" + this.f107915f + ", maxImages=" + this.f107916g + "}";
    }
}
