package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.VideoSpec;

/* renamed from: androidx.camera.video.j */
/* loaded from: classes.dex */
public final class C2662j extends VideoSpec {

    /* renamed from: a */
    public final QualitySelector f12198a;

    /* renamed from: b */
    public final Range f12199b;

    /* renamed from: c */
    public final Range f12200c;

    /* renamed from: d */
    public final int f12201d;

    /* renamed from: androidx.camera.video.j$b */
    /* loaded from: classes.dex */
    public static final class C2664b extends VideoSpec.Builder {

        /* renamed from: a */
        public QualitySelector f12202a;

        /* renamed from: b */
        public Range f12203b;

        /* renamed from: c */
        public Range f12204c;

        /* renamed from: d */
        public Integer f12205d;

        @Override // androidx.camera.video.VideoSpec.Builder
        /* renamed from: a */
        public VideoSpec.Builder mo61880a(int i) {
            this.f12205d = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec build() {
            String str = "";
            if (this.f12202a == null) {
                str = " qualitySelector";
            }
            if (this.f12203b == null) {
                str = str + " frameRate";
            }
            if (this.f12204c == null) {
                str = str + " bitrate";
            }
            if (this.f12205d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C2662j(this.f12202a, this.f12203b, this.f12204c, this.f12205d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setBitrate(Range range) {
            if (range != null) {
                this.f12204c = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setFrameRate(Range range) {
            if (range != null) {
                this.f12203b = range;
                return this;
            }
            throw new NullPointerException("Null frameRate");
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setQualitySelector(QualitySelector qualitySelector) {
            if (qualitySelector != null) {
                this.f12202a = qualitySelector;
                return this;
            }
            throw new NullPointerException("Null qualitySelector");
        }

        public C2664b() {
        }

        public C2664b(VideoSpec videoSpec) {
            this.f12202a = videoSpec.getQualitySelector();
            this.f12203b = videoSpec.getFrameRate();
            this.f12204c = videoSpec.getBitrate();
            this.f12205d = Integer.valueOf(videoSpec.mo61881a());
        }
    }

    @Override // androidx.camera.video.VideoSpec
    /* renamed from: a */
    public int mo61881a() {
        return this.f12201d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoSpec)) {
            return false;
        }
        VideoSpec videoSpec = (VideoSpec) obj;
        if (this.f12198a.equals(videoSpec.getQualitySelector()) && this.f12199b.equals(videoSpec.getFrameRate()) && this.f12200c.equals(videoSpec.getBitrate()) && this.f12201d == videoSpec.mo61881a()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.VideoSpec
    public Range getBitrate() {
        return this.f12200c;
    }

    @Override // androidx.camera.video.VideoSpec
    public Range getFrameRate() {
        return this.f12199b;
    }

    @Override // androidx.camera.video.VideoSpec
    public QualitySelector getQualitySelector() {
        return this.f12198a;
    }

    public int hashCode() {
        return ((((((this.f12198a.hashCode() ^ 1000003) * 1000003) ^ this.f12199b.hashCode()) * 1000003) ^ this.f12200c.hashCode()) * 1000003) ^ this.f12201d;
    }

    @Override // androidx.camera.video.VideoSpec
    public VideoSpec.Builder toBuilder() {
        return new C2664b(this);
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f12198a + ", frameRate=" + this.f12199b + ", bitrate=" + this.f12200c + ", aspectRatio=" + this.f12201d + "}";
    }

    public C2662j(QualitySelector qualitySelector, Range range, Range range2, int i) {
        this.f12198a = qualitySelector;
        this.f12199b = range;
        this.f12200c = range2;
        this.f12201d = i;
    }
}