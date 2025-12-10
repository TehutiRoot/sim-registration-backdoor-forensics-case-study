package p000;

import androidx.camera.core.impl.DeviceProperties;

/* renamed from: p8 */
/* loaded from: classes.dex */
public final class C13064p8 extends DeviceProperties {

    /* renamed from: a */
    public final String f76493a;

    /* renamed from: b */
    public final String f76494b;

    /* renamed from: c */
    public final int f76495c;

    public C13064p8(String str, String str2, int i) {
        if (str != null) {
            this.f76493a = str;
            if (str2 != null) {
                this.f76494b = str2;
                this.f76495c = i;
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
        if (this.f76493a.equals(deviceProperties.manufacturer()) && this.f76494b.equals(deviceProperties.model()) && this.f76495c == deviceProperties.sdkVersion()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f76493a.hashCode() ^ 1000003) * 1000003) ^ this.f76494b.hashCode()) * 1000003) ^ this.f76495c;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public String manufacturer() {
        return this.f76493a;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public String model() {
        return this.f76494b;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public int sdkVersion() {
        return this.f76495c;
    }

    public String toString() {
        return "DeviceProperties{manufacturer=" + this.f76493a + ", model=" + this.f76494b + ", sdkVersion=" + this.f76495c + "}";
    }
}
