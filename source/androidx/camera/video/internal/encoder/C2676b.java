package androidx.camera.video.internal.encoder;

import android.util.Size;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;

/* renamed from: androidx.camera.video.internal.encoder.b */
/* loaded from: classes.dex */
public final class C2676b extends VideoEncoderConfig {

    /* renamed from: a */
    public final String f12078a;

    /* renamed from: b */
    public final int f12079b;

    /* renamed from: c */
    public final Timebase f12080c;

    /* renamed from: d */
    public final Size f12081d;

    /* renamed from: e */
    public final int f12082e;

    /* renamed from: f */
    public final VideoEncoderDataSpace f12083f;

    /* renamed from: g */
    public final int f12084g;

    /* renamed from: h */
    public final int f12085h;

    /* renamed from: i */
    public final int f12086i;

    /* renamed from: androidx.camera.video.internal.encoder.b$b */
    /* loaded from: classes.dex */
    public static final class C2678b extends VideoEncoderConfig.Builder {

        /* renamed from: a */
        public String f12087a;

        /* renamed from: b */
        public Integer f12088b;

        /* renamed from: c */
        public Timebase f12089c;

        /* renamed from: d */
        public Size f12090d;

        /* renamed from: e */
        public Integer f12091e;

        /* renamed from: f */
        public VideoEncoderDataSpace f12092f;

        /* renamed from: g */
        public Integer f12093g;

        /* renamed from: h */
        public Integer f12094h;

        /* renamed from: i */
        public Integer f12095i;

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig build() {
            String str = "";
            if (this.f12087a == null) {
                str = " mimeType";
            }
            if (this.f12088b == null) {
                str = str + " profile";
            }
            if (this.f12089c == null) {
                str = str + " inputTimebase";
            }
            if (this.f12090d == null) {
                str = str + " resolution";
            }
            if (this.f12091e == null) {
                str = str + " colorFormat";
            }
            if (this.f12092f == null) {
                str = str + " dataSpace";
            }
            if (this.f12093g == null) {
                str = str + " frameRate";
            }
            if (this.f12094h == null) {
                str = str + " IFrameInterval";
            }
            if (this.f12095i == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new C2676b(this.f12087a, this.f12088b.intValue(), this.f12089c, this.f12090d, this.f12091e.intValue(), this.f12092f, this.f12093g.intValue(), this.f12094h.intValue(), this.f12095i.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setBitrate(int i) {
            this.f12095i = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setColorFormat(int i) {
            this.f12091e = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setDataSpace(VideoEncoderDataSpace videoEncoderDataSpace) {
            if (videoEncoderDataSpace != null) {
                this.f12092f = videoEncoderDataSpace;
                return this;
            }
            throw new NullPointerException("Null dataSpace");
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setFrameRate(int i) {
            this.f12093g = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setIFrameInterval(int i) {
            this.f12094h = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setInputTimebase(Timebase timebase) {
            if (timebase != null) {
                this.f12089c = timebase;
                return this;
            }
            throw new NullPointerException("Null inputTimebase");
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setMimeType(String str) {
            if (str != null) {
                this.f12087a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setProfile(int i) {
            this.f12088b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setResolution(Size size) {
            if (size != null) {
                this.f12090d = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoEncoderConfig)) {
            return false;
        }
        VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) obj;
        if (this.f12078a.equals(videoEncoderConfig.getMimeType()) && this.f12079b == videoEncoderConfig.getProfile() && this.f12080c.equals(videoEncoderConfig.getInputTimebase()) && this.f12081d.equals(videoEncoderConfig.getResolution()) && this.f12082e == videoEncoderConfig.getColorFormat() && this.f12083f.equals(videoEncoderConfig.getDataSpace()) && this.f12084g == videoEncoderConfig.getFrameRate() && this.f12085h == videoEncoderConfig.getIFrameInterval() && this.f12086i == videoEncoderConfig.getBitrate()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getBitrate() {
        return this.f12086i;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getColorFormat() {
        return this.f12082e;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public VideoEncoderDataSpace getDataSpace() {
        return this.f12083f;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getFrameRate() {
        return this.f12084g;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getIFrameInterval() {
        return this.f12085h;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public Timebase getInputTimebase() {
        return this.f12080c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public String getMimeType() {
        return this.f12078a;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
        return this.f12079b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public Size getResolution() {
        return this.f12081d;
    }

    public int hashCode() {
        return ((((((((((((((((this.f12078a.hashCode() ^ 1000003) * 1000003) ^ this.f12079b) * 1000003) ^ this.f12080c.hashCode()) * 1000003) ^ this.f12081d.hashCode()) * 1000003) ^ this.f12082e) * 1000003) ^ this.f12083f.hashCode()) * 1000003) ^ this.f12084g) * 1000003) ^ this.f12085h) * 1000003) ^ this.f12086i;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f12078a + ", profile=" + this.f12079b + ", inputTimebase=" + this.f12080c + ", resolution=" + this.f12081d + ", colorFormat=" + this.f12082e + ", dataSpace=" + this.f12083f + ", frameRate=" + this.f12084g + ", IFrameInterval=" + this.f12085h + ", bitrate=" + this.f12086i + "}";
    }

    public C2676b(String str, int i, Timebase timebase, Size size, int i2, VideoEncoderDataSpace videoEncoderDataSpace, int i3, int i4, int i5) {
        this.f12078a = str;
        this.f12079b = i;
        this.f12080c = timebase;
        this.f12081d = size;
        this.f12082e = i2;
        this.f12083f = videoEncoderDataSpace;
        this.f12084g = i3;
        this.f12085h = i4;
        this.f12086i = i5;
    }
}
