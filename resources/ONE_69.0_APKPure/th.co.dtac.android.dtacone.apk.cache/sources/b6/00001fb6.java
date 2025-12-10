package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamSpec;

/* renamed from: androidx.camera.core.impl.h */
/* loaded from: classes.dex */
public final class C2505h extends StreamSpec {

    /* renamed from: a */
    public final Size f11347a;

    /* renamed from: b */
    public final DynamicRange f11348b;

    /* renamed from: c */
    public final Range f11349c;

    /* renamed from: d */
    public final Config f11350d;

    /* renamed from: androidx.camera.core.impl.h$b */
    /* loaded from: classes.dex */
    public static final class C2507b extends StreamSpec.Builder {

        /* renamed from: a */
        public Size f11351a;

        /* renamed from: b */
        public DynamicRange f11352b;

        /* renamed from: c */
        public Range f11353c;

        /* renamed from: d */
        public Config f11354d;

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec build() {
            String str = "";
            if (this.f11351a == null) {
                str = " resolution";
            }
            if (this.f11352b == null) {
                str = str + " dynamicRange";
            }
            if (this.f11353c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (str.isEmpty()) {
                return new C2505h(this.f11351a, this.f11352b, this.f11353c, this.f11354d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange != null) {
                this.f11352b = dynamicRange;
                return this;
            }
            throw new NullPointerException("Null dynamicRange");
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setExpectedFrameRateRange(Range range) {
            if (range != null) {
                this.f11353c = range;
                return this;
            }
            throw new NullPointerException("Null expectedFrameRateRange");
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setImplementationOptions(Config config) {
            this.f11354d = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setResolution(Size size) {
            if (size != null) {
                this.f11351a = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }

        public C2507b() {
        }

        public C2507b(StreamSpec streamSpec) {
            this.f11351a = streamSpec.getResolution();
            this.f11352b = streamSpec.getDynamicRange();
            this.f11353c = streamSpec.getExpectedFrameRateRange();
            this.f11354d = streamSpec.getImplementationOptions();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamSpec)) {
            return false;
        }
        StreamSpec streamSpec = (StreamSpec) obj;
        if (this.f11347a.equals(streamSpec.getResolution()) && this.f11348b.equals(streamSpec.getDynamicRange()) && this.f11349c.equals(streamSpec.getExpectedFrameRateRange())) {
            Config config = this.f11350d;
            if (config == null) {
                if (streamSpec.getImplementationOptions() == null) {
                    return true;
                }
            } else if (config.equals(streamSpec.getImplementationOptions())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public DynamicRange getDynamicRange() {
        return this.f11348b;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Range getExpectedFrameRateRange() {
        return this.f11349c;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Config getImplementationOptions() {
        return this.f11350d;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Size getResolution() {
        return this.f11347a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.f11347a.hashCode() ^ 1000003) * 1000003) ^ this.f11348b.hashCode()) * 1000003) ^ this.f11349c.hashCode()) * 1000003;
        Config config = this.f11350d;
        if (config == null) {
            hashCode = 0;
        } else {
            hashCode = config.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public StreamSpec.Builder toBuilder() {
        return new C2507b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f11347a + ", dynamicRange=" + this.f11348b + ", expectedFrameRateRange=" + this.f11349c + ", implementationOptions=" + this.f11350d + "}";
    }

    public C2505h(Size size, DynamicRange dynamicRange, Range range, Config config) {
        this.f11347a = size;
        this.f11348b = dynamicRange;
        this.f11349c = range;
        this.f11350d = config;
    }
}