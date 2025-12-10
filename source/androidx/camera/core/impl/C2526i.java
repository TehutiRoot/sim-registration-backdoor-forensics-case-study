package androidx.camera.core.impl;

import androidx.camera.core.impl.SurfaceConfig;

/* renamed from: androidx.camera.core.impl.i */
/* loaded from: classes.dex */
public final class C2526i extends SurfaceConfig {

    /* renamed from: a */
    public final SurfaceConfig.ConfigType f11267a;

    /* renamed from: b */
    public final SurfaceConfig.ConfigSize f11268b;

    /* renamed from: c */
    public final long f11269c;

    public C2526i(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, long j) {
        if (configType != null) {
            this.f11267a = configType;
            if (configSize != null) {
                this.f11268b = configSize;
                this.f11269c = j;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        if (this.f11267a.equals(surfaceConfig.getConfigType()) && this.f11268b.equals(surfaceConfig.getConfigSize()) && this.f11269c == surfaceConfig.getStreamUseCase()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigSize getConfigSize() {
        return this.f11268b;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigType getConfigType() {
        return this.f11267a;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public long getStreamUseCase() {
        return this.f11269c;
    }

    public int hashCode() {
        long j = this.f11269c;
        return ((((this.f11267a.hashCode() ^ 1000003) * 1000003) ^ this.f11268b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f11267a + ", configSize=" + this.f11268b + ", streamUseCase=" + this.f11269c + "}";
    }
}
