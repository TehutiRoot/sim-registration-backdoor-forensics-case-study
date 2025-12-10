package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import java.util.List;

/* renamed from: androidx.camera.core.impl.a */
/* loaded from: classes.dex */
public final class C2496a extends AttachedSurfaceInfo {

    /* renamed from: a */
    public final SurfaceConfig f11306a;

    /* renamed from: b */
    public final int f11307b;

    /* renamed from: c */
    public final Size f11308c;

    /* renamed from: d */
    public final DynamicRange f11309d;

    /* renamed from: e */
    public final List f11310e;

    /* renamed from: f */
    public final Config f11311f;

    /* renamed from: g */
    public final Range f11312g;

    public C2496a(SurfaceConfig surfaceConfig, int i, Size size, DynamicRange dynamicRange, List list, Config config, Range range) {
        if (surfaceConfig != null) {
            this.f11306a = surfaceConfig;
            this.f11307b = i;
            if (size != null) {
                this.f11308c = size;
                if (dynamicRange != null) {
                    this.f11309d = dynamicRange;
                    if (list != null) {
                        this.f11310e = list;
                        this.f11311f = config;
                        this.f11312g = range;
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
        if (this.f11306a.equals(attachedSurfaceInfo.getSurfaceConfig()) && this.f11307b == attachedSurfaceInfo.getImageFormat() && this.f11308c.equals(attachedSurfaceInfo.getSize()) && this.f11309d.equals(attachedSurfaceInfo.getDynamicRange()) && this.f11310e.equals(attachedSurfaceInfo.getCaptureTypes()) && ((config = this.f11311f) != null ? config.equals(attachedSurfaceInfo.getImplementationOptions()) : attachedSurfaceInfo.getImplementationOptions() == null)) {
            Range range = this.f11312g;
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
        return this.f11310e;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public DynamicRange getDynamicRange() {
        return this.f11309d;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public int getImageFormat() {
        return this.f11307b;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public Config getImplementationOptions() {
        return this.f11311f;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public Size getSize() {
        return this.f11308c;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public SurfaceConfig getSurfaceConfig() {
        return this.f11306a;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public Range getTargetFrameRate() {
        return this.f11312g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.f11306a.hashCode() ^ 1000003) * 1000003) ^ this.f11307b) * 1000003) ^ this.f11308c.hashCode()) * 1000003) ^ this.f11309d.hashCode()) * 1000003) ^ this.f11310e.hashCode()) * 1000003;
        Config config = this.f11311f;
        int i = 0;
        if (config == null) {
            hashCode = 0;
        } else {
            hashCode = config.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        Range range = this.f11312g;
        if (range != null) {
            i = range.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f11306a + ", imageFormat=" + this.f11307b + ", size=" + this.f11308c + ", dynamicRange=" + this.f11309d + ", captureTypes=" + this.f11310e + ", implementationOptions=" + this.f11311f + ", targetFrameRate=" + this.f11312g + "}";
    }
}