package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.VideoSpec;

/* renamed from: androidx.camera.video.j */
/* loaded from: classes.dex */
public final class C2680j extends VideoSpec {

    /* renamed from: a */
    public final QualitySelector f12110a;

    /* renamed from: b */
    public final Range f12111b;

    /* renamed from: c */
    public final Range f12112c;

    /* renamed from: d */
    public final int f12113d;

    /* renamed from: androidx.camera.video.j$b */
    /* loaded from: classes.dex */
    public static final class C2682b extends VideoSpec.Builder {

        /* renamed from: a */
        public QualitySelector f12114a;

        /* renamed from: b */
        public Range f12115b;

        /* renamed from: c */
        public Range f12116c;

        /* renamed from: d */
        public Integer f12117d;

        @Override // androidx.camera.video.VideoSpec.Builder
        /* renamed from: a */
        public VideoSpec.Builder mo61932a(int i) {
            this.f12117d = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec build() {
            String str = "";
            if (this.f12114a == null) {
                str = " qualitySelector";
            }
            if (this.f12115b == null) {
                str = str + " frameRate";
            }
            if (this.f12116c == null) {
                str = str + " bitrate";
            }
            if (this.f12117d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C2680j(this.f12114a, this.f12115b, this.f12116c, this.f12117d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setBitrate(Range range) {
            if (range != null) {
                this.f12116c = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setFrameRate(Range range) {
            if (range != null) {
                this.f12115b = range;
                return this;
            }
            throw new NullPointerException("Null frameRate");
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setQualitySelector(QualitySelector qualitySelector) {
            if (qualitySelector != null) {
                this.f12114a = qualitySelector;
                return this;
            }
            throw new NullPointerException("Null qualitySelector");
        }

        public C2682b() {
        }

        public C2682b(VideoSpec videoSpec) {
            this.f12114a = videoSpec.getQualitySelector();
            this.f12115b = videoSpec.getFrameRate();
            this.f12116c = videoSpec.getBitrate();
            this.f12117d = Integer.valueOf(videoSpec.mo61933a());
        }
    }

    @Override // androidx.camera.video.VideoSpec
    /* renamed from: a */
    public int mo61933a() {
        return this.f12113d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoSpec)) {
            return false;
        }
        VideoSpec videoSpec = (VideoSpec) obj;
        if (this.f12110a.equals(videoSpec.getQualitySelector()) && this.f12111b.equals(videoSpec.getFrameRate()) && this.f12112c.equals(videoSpec.getBitrate()) && this.f12113d == videoSpec.mo61933a()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.VideoSpec
    public Range getBitrate() {
        return this.f12112c;
    }

    @Override // androidx.camera.video.VideoSpec
    public Range getFrameRate() {
        return this.f12111b;
    }

    @Override // androidx.camera.video.VideoSpec
    public QualitySelector getQualitySelector() {
        return this.f12110a;
    }

    public int hashCode() {
        return ((((((this.f12110a.hashCode() ^ 1000003) * 1000003) ^ this.f12111b.hashCode()) * 1000003) ^ this.f12112c.hashCode()) * 1000003) ^ this.f12113d;
    }

    @Override // androidx.camera.video.VideoSpec
    public VideoSpec.Builder toBuilder() {
        return new C2682b(this);
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f12110a + ", frameRate=" + this.f12111b + ", bitrate=" + this.f12112c + ", aspectRatio=" + this.f12113d + "}";
    }

    public C2680j(QualitySelector qualitySelector, Range range, Range range2, int i) {
        this.f12110a = qualitySelector;
        this.f12111b = range;
        this.f12112c = range2;
        this.f12113d = i;
    }
}
