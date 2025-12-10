package p000;

import androidx.camera.core.impl.DeviceProperties;

/* renamed from: p8 */
/* loaded from: classes.dex */
public final class C13065p8 extends DeviceProperties {

    /* renamed from: a */
    public final String f76590a;

    /* renamed from: b */
    public final String f76591b;

    /* renamed from: c */
    public final int f76592c;

    public C13065p8(String str, String str2, int i) {
        if (str != null) {
            this.f76590a = str;
            if (str2 != null) {
                this.f76591b = str2;
                this.f76592c = i;
                return;
            }
            throw new NullPointerException("Null model");
        }
        throw new NullPointerException("Null manufacturer");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceProperties)) {
            return false;
        }
        DeviceProperties deviceProperties = (DeviceProperties) obj;
        if (this.f76590a.equals(deviceProperties.manufacturer()) && this.f76591b.equals(deviceProperties.model()) && this.f76592c == deviceProperties.sdkVersion()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f76590a.hashCode() ^ 1000003) * 1000003) ^ this.f76591b.hashCode()) * 1000003) ^ this.f76592c;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public String manufacturer() {
        return this.f76590a;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public String model() {
        return this.f76591b;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public int sdkVersion() {
        return this.f76592c;
    }

    public String toString() {
        return "DeviceProperties{manufacturer=" + this.f76590a + ", model=" + this.f76591b + ", sdkVersion=" + this.f76592c + "}";
    }
}