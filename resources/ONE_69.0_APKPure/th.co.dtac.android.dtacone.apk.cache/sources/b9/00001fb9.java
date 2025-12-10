package androidx.camera.core.impl;

import androidx.camera.core.impl.SurfaceConfig;

/* renamed from: androidx.camera.core.impl.i */
/* loaded from: classes.dex */
public final class C2508i extends SurfaceConfig {

    /* renamed from: a */
    public final SurfaceConfig.ConfigType f11355a;

    /* renamed from: b */
    public final SurfaceConfig.ConfigSize f11356b;

    /* renamed from: c */
    public final long f11357c;

    public C2508i(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, long j) {
        if (configType != null) {
            this.f11355a = configType;
            if (configSize != null) {
                this.f11356b = configSize;
                this.f11357c = j;
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
        if (this.f11355a.equals(surfaceConfig.getConfigType()) && this.f11356b.equals(surfaceConfig.getConfigSize()) && this.f11357c == surfaceConfig.getStreamUseCase()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigSize getConfigSize() {
        return this.f11356b;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public SurfaceConfig.ConfigType getConfigType() {
        return this.f11355a;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public long getStreamUseCase() {
        return this.f11357c;
    }

    public int hashCode() {
        long j = this.f11357c;
        return ((((this.f11355a.hashCode() ^ 1000003) * 1000003) ^ this.f11356b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f11355a + ", configSize=" + this.f11356b + ", streamUseCase=" + this.f11357c + "}";
    }
}