package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import java.util.List;

/* renamed from: androidx.camera.core.impl.a */
/* loaded from: classes.dex */
public final class C2514a extends AttachedSurfaceInfo {

    /* renamed from: a */
    public final SurfaceConfig f11218a;

    /* renamed from: b */
    public final int f11219b;

    /* renamed from: c */
    public final Size f11220c;

    /* renamed from: d */
    public final DynamicRange f11221d;

    /* renamed from: e */
    public final List f11222e;

    /* renamed from: f */
    public final Config f11223f;

    /* renamed from: g */
    public final Range f11224g;

    public C2514a(SurfaceConfig surfaceConfig, int i, Size size, DynamicRange dynamicRange, List list, Config config, Range range) {
        if (surfaceConfig != null) {
            this.f11218a = surfaceConfig;
            this.f11219b = i;
            if (size != null) {
                this.f11220c = size;
                if (dynamicRange != null) {
                    this.f11221d = dynamicRange;
                    if (list != null) {
                        this.f11222e = list;
                        this.f11223f = config;
                        this.f11224g = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public boolean equals(Object obj) {
        Config config;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttachedSurfaceInfo)) {
            return false;
        }
        AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) obj;
        if (this.f11218a.equals(attachedSurfaceInfo.getSurfaceConfig()) && this.f11219b == attachedSurfaceInfo.getImageFormat() && this.f11220c.equals(attachedSurfaceInfo.getSize()) && this.f11221d.equals(attachedSurfaceInfo.getDynamicRange()) && this.f11222e.equals(attachedSurfaceInfo.getCaptureTypes()) && ((config = this.f11223f) != null ? config.equals(attachedSurfaceInfo.getImplementationOptions()) : attachedSurfaceInfo.getImplementationOptions() == null)) {
            Range range = this.f11224g;
            if (range == null) {
                if (attachedSurfaceInfo.getTargetFrameRate() == null) {
                    return true;
                }
            } else if (range.equals(attachedSurfaceInfo.getTargetFrameRate())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public List getCaptureTypes() {
        return this.f11222e;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public DynamicRange getDynamicRange() {
        return this.f11221d;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public int getImageFormat() {
        return this.f11219b;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public Config getImplementationOptions() {
        return this.f11223f;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public Size getSize() {
        return this.f11220c;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public SurfaceConfig getSurfaceConfig() {
        return this.f11218a;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public Range getTargetFrameRate() {
        return this.f11224g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.f11218a.hashCode() ^ 1000003) * 1000003) ^ this.f11219b) * 1000003) ^ this.f11220c.hashCode()) * 1000003) ^ this.f11221d.hashCode()) * 1000003) ^ this.f11222e.hashCode()) * 1000003;
        Config config = this.f11223f;
        int i = 0;
        if (config == null) {
            hashCode = 0;
        } else {
            hashCode = config.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        Range range = this.f11224g;
        if (range != null) {
            i = range.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f11218a + ", imageFormat=" + this.f11219b + ", size=" + this.f11220c + ", dynamicRange=" + this.f11221d + ", captureTypes=" + this.f11222e + ", implementationOptions=" + this.f11223f + ", targetFrameRate=" + this.f11224g + "}";
    }
}
