package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;

/* renamed from: androidx.camera.core.impl.f */
/* loaded from: classes.dex */
public final class C2501f extends SessionConfig.OutputConfig {

    /* renamed from: a */
    public final DeferrableSurface f11336a;

    /* renamed from: b */
    public final List f11337b;

    /* renamed from: c */
    public final String f11338c;

    /* renamed from: d */
    public final int f11339d;

    /* renamed from: e */
    public final DynamicRange f11340e;

    /* renamed from: androidx.camera.core.impl.f$b */
    /* loaded from: classes.dex */
    public static final class C2503b extends SessionConfig.OutputConfig.Builder {

        /* renamed from: a */
        public DeferrableSurface f11341a;

        /* renamed from: b */
        public List f11342b;

        /* renamed from: c */
        public String f11343c;

        /* renamed from: d */
        public Integer f11344d;

        /* renamed from: e */
        public DynamicRange f11345e;

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig build() {
            String str = "";
            if (this.f11341a == null) {
                str = " surface";
            }
            if (this.f11342b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f11344d == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f11345e == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C2501f(this.f11341a, this.f11342b, this.f11343c, this.f11344d.intValue(), this.f11345e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange != null) {
                this.f11345e = dynamicRange;
                return this;
            }
            throw new NullPointerException("Null dynamicRange");
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setPhysicalCameraId(String str) {
            this.f11343c = str;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSharedSurfaces(List list) {
            if (list != null) {
                this.f11342b = list;
                return this;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSurface(DeferrableSurface deferrableSurface) {
            if (deferrableSurface != null) {
                this.f11341a = deferrableSurface;
                return this;
            }
            throw new NullPointerException("Null surface");
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSurfaceGroupId(int i) {
            this.f11344d = Integer.valueOf(i);
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionConfig.OutputConfig)) {
            return false;
        }
        SessionConfig.OutputConfig outputConfig = (SessionConfig.OutputConfig) obj;
        if (this.f11336a.equals(outputConfig.getSurface()) && this.f11337b.equals(outputConfig.getSharedSurfaces()) && ((str = this.f11338c) != null ? str.equals(outputConfig.getPhysicalCameraId()) : outputConfig.getPhysicalCameraId() == null) && this.f11339d == outputConfig.getSurfaceGroupId() && this.f11340e.equals(outputConfig.getDynamicRange())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public DynamicRange getDynamicRange() {
        return this.f11340e;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public String getPhysicalCameraId() {
        return this.f11338c;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public List getSharedSurfaces() {
        return this.f11337b;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public DeferrableSurface getSurface() {
        return this.f11336a;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public int getSurfaceGroupId() {
        return this.f11339d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f11336a.hashCode() ^ 1000003) * 1000003) ^ this.f11337b.hashCode()) * 1000003;
        String str = this.f11338c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 ^ hashCode) * 1000003) ^ this.f11339d) * 1000003) ^ this.f11340e.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f11336a + ", sharedSurfaces=" + this.f11337b + ", physicalCameraId=" + this.f11338c + ", surfaceGroupId=" + this.f11339d + ", dynamicRange=" + this.f11340e + "}";
    }

    public C2501f(DeferrableSurface deferrableSurface, List list, String str, int i, DynamicRange dynamicRange) {
        this.f11336a = deferrableSurface;
        this.f11337b = list;
        this.f11338c = str;
        this.f11339d = i;
        this.f11340e = dynamicRange;
    }
}