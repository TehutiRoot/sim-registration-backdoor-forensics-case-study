package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamSpec;

/* renamed from: androidx.camera.core.impl.h */
/* loaded from: classes.dex */
public final class C2523h extends StreamSpec {

    /* renamed from: a */
    public final Size f11259a;

    /* renamed from: b */
    public final DynamicRange f11260b;

    /* renamed from: c */
    public final Range f11261c;

    /* renamed from: d */
    public final Config f11262d;

    /* renamed from: androidx.camera.core.impl.h$b */
    /* loaded from: classes.dex */
    public static final class C2525b extends StreamSpec.Builder {

        /* renamed from: a */
        public Size f11263a;

        /* renamed from: b */
        public DynamicRange f11264b;

        /* renamed from: c */
        public Range f11265c;

        /* renamed from: d */
        public Config f11266d;

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec build() {
            String str = "";
            if (this.f11263a == null) {
                str = " resolution";
            }
            if (this.f11264b == null) {
                str = str + " dynamicRange";
            }
            if (this.f11265c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (str.isEmpty()) {
                return new C2523h(this.f11263a, this.f11264b, this.f11265c, this.f11266d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange != null) {
                this.f11264b = dynamicRange;
                return this;
            }
            throw new NullPointerException("Null dynamicRange");
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setExpectedFrameRateRange(Range range) {
            if (range != null) {
                this.f11265c = range;
                return this;
            }
            throw new NullPointerException("Null expectedFrameRateRange");
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setImplementationOptions(Config config) {
            this.f11266d = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setResolution(Size size) {
            if (size != null) {
                this.f11263a = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }

        public C2525b() {
        }

        public C2525b(StreamSpec streamSpec) {
            this.f11263a = streamSpec.getResolution();
            this.f11264b = streamSpec.getDynamicRange();
            this.f11265c = streamSpec.getExpectedFrameRateRange();
            this.f11266d = streamSpec.getImplementationOptions();
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
        if (this.f11259a.equals(streamSpec.getResolution()) && this.f11260b.equals(streamSpec.getDynamicRange()) && this.f11261c.equals(streamSpec.getExpectedFrameRateRange())) {
            Config config = this.f11262d;
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
        return this.f11260b;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Range getExpectedFrameRateRange() {
        return this.f11261c;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Config getImplementationOptions() {
        return this.f11262d;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public Size getResolution() {
        return this.f11259a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.f11259a.hashCode() ^ 1000003) * 1000003) ^ this.f11260b.hashCode()) * 1000003) ^ this.f11261c.hashCode()) * 1000003;
        Config config = this.f11262d;
        if (config == null) {
            hashCode = 0;
        } else {
            hashCode = config.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public StreamSpec.Builder toBuilder() {
        return new C2525b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f11259a + ", dynamicRange=" + this.f11260b + ", expectedFrameRateRange=" + this.f11261c + ", implementationOptions=" + this.f11262d + "}";
    }

    public C2523h(Size size, DynamicRange dynamicRange, Range range, Config config) {
        this.f11259a = size;
        this.f11260b = dynamicRange;
        this.f11261c = range;
        this.f11262d = config;
    }
}
