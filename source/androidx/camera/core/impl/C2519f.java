package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;

/* renamed from: androidx.camera.core.impl.f */
/* loaded from: classes.dex */
public final class C2519f extends SessionConfig.OutputConfig {

    /* renamed from: a */
    public final DeferrableSurface f11248a;

    /* renamed from: b */
    public final List f11249b;

    /* renamed from: c */
    public final String f11250c;

    /* renamed from: d */
    public final int f11251d;

    /* renamed from: e */
    public final DynamicRange f11252e;

    /* renamed from: androidx.camera.core.impl.f$b */
    /* loaded from: classes.dex */
    public static final class C2521b extends SessionConfig.OutputConfig.Builder {

        /* renamed from: a */
        public DeferrableSurface f11253a;

        /* renamed from: b */
        public List f11254b;

        /* renamed from: c */
        public String f11255c;

        /* renamed from: d */
        public Integer f11256d;

        /* renamed from: e */
        public DynamicRange f11257e;

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig build() {
            String str = "";
            if (this.f11253a == null) {
                str = " surface";
            }
            if (this.f11254b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f11256d == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f11257e == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C2519f(this.f11253a, this.f11254b, this.f11255c, this.f11256d.intValue(), this.f11257e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange != null) {
                this.f11257e = dynamicRange;
                return this;
            }
            throw new NullPointerException("Null dynamicRange");
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setPhysicalCameraId(String str) {
            this.f11255c = str;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSharedSurfaces(List list) {
            if (list != null) {
                this.f11254b = list;
                return this;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSurface(DeferrableSurface deferrableSurface) {
            if (deferrableSurface != null) {
                this.f11253a = deferrableSurface;
                return this;
            }
            throw new NullPointerException("Null surface");
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public SessionConfig.OutputConfig.Builder setSurfaceGroupId(int i) {
            this.f11256d = Integer.valueOf(i);
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
        if (this.f11248a.equals(outputConfig.getSurface()) && this.f11249b.equals(outputConfig.getSharedSurfaces()) && ((str = this.f11250c) != null ? str.equals(outputConfig.getPhysicalCameraId()) : outputConfig.getPhysicalCameraId() == null) && this.f11251d == outputConfig.getSurfaceGroupId() && this.f11252e.equals(outputConfig.getDynamicRange())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public DynamicRange getDynamicRange() {
        return this.f11252e;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public String getPhysicalCameraId() {
        return this.f11250c;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public List getSharedSurfaces() {
        return this.f11249b;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public DeferrableSurface getSurface() {
        return this.f11248a;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public int getSurfaceGroupId() {
        return this.f11251d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f11248a.hashCode() ^ 1000003) * 1000003) ^ this.f11249b.hashCode()) * 1000003;
        String str = this.f11250c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 ^ hashCode) * 1000003) ^ this.f11251d) * 1000003) ^ this.f11252e.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f11248a + ", sharedSurfaces=" + this.f11249b + ", physicalCameraId=" + this.f11250c + ", surfaceGroupId=" + this.f11251d + ", dynamicRange=" + this.f11252e + "}";
    }

    public C2519f(DeferrableSurface deferrableSurface, List list, String str, int i, DynamicRange dynamicRange) {
        this.f11248a = deferrableSurface;
        this.f11249b = list;
        this.f11250c = str;
        this.f11251d = i;
        this.f11252e = dynamicRange;
    }
}
