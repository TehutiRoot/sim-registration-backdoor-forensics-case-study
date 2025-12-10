package androidx.camera.video.internal.encoder;

import android.util.Size;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;

/* renamed from: androidx.camera.video.internal.encoder.b */
/* loaded from: classes.dex */
public final class C2658b extends VideoEncoderConfig {

    /* renamed from: a */
    public final String f12166a;

    /* renamed from: b */
    public final int f12167b;

    /* renamed from: c */
    public final Timebase f12168c;

    /* renamed from: d */
    public final Size f12169d;

    /* renamed from: e */
    public final int f12170e;

    /* renamed from: f */
    public final VideoEncoderDataSpace f12171f;

    /* renamed from: g */
    public final int f12172g;

    /* renamed from: h */
    public final int f12173h;

    /* renamed from: i */
    public final int f12174i;

    /* renamed from: androidx.camera.video.internal.encoder.b$b */
    /* loaded from: classes.dex */
    public static final class C2660b extends VideoEncoderConfig.Builder {

        /* renamed from: a */
        public String f12175a;

        /* renamed from: b */
        public Integer f12176b;

        /* renamed from: c */
        public Timebase f12177c;

        /* renamed from: d */
        public Size f12178d;

        /* renamed from: e */
        public Integer f12179e;

        /* renamed from: f */
        public VideoEncoderDataSpace f12180f;

        /* renamed from: g */
        public Integer f12181g;

        /* renamed from: h */
        public Integer f12182h;

        /* renamed from: i */
        public Integer f12183i;

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig build() {
            String str = "";
            if (this.f12175a == null) {
                str = " mimeType";
            }
            if (this.f12176b == null) {
                str = str + " profile";
            }
            if (this.f12177c == null) {
                str = str + " inputTimebase";
            }
            if (this.f12178d == null) {
                str = str + " resolution";
            }
            if (this.f12179e == null) {
                str = str + " colorFormat";
            }
            if (this.f12180f == null) {
                str = str + " dataSpace";
            }
            if (this.f12181g == null) {
                str = str + " frameRate";
            }
            if (this.f12182h == null) {
                str = str + " IFrameInterval";
            }
            if (this.f12183i == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new C2658b(this.f12175a, this.f12176b.intValue(), this.f12177c, this.f12178d, this.f12179e.intValue(), this.f12180f, this.f12181g.intValue(), this.f12182h.intValue(), this.f12183i.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setBitrate(int i) {
            this.f12183i = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setColorFormat(int i) {
            this.f12179e = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setDataSpace(VideoEncoderDataSpace videoEncoderDataSpace) {
            if (videoEncoderDataSpace != null) {
                this.f12180f = videoEncoderDataSpace;
                return this;
            }
            throw new NullPointerException("Null dataSpace");
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setFrameRate(int i) {
            this.f12181g = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setIFrameInterval(int i) {
            this.f12182h = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setInputTimebase(Timebase timebase) {
            if (timebase != null) {
                this.f12177c = timebase;
                return this;
            }
            throw new NullPointerException("Null inputTimebase");
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setMimeType(String str) {
            if (str != null) {
                this.f12175a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setProfile(int i) {
            this.f12176b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setResolution(Size size) {
            if (size != null) {
                this.f12178d = size;
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
        if (this.f12166a.equals(videoEncoderConfig.getMimeType()) && this.f12167b == videoEncoderConfig.getProfile() && this.f12168c.equals(videoEncoderConfig.getInputTimebase()) && this.f12169d.equals(videoEncoderConfig.getResolution()) && this.f12170e == videoEncoderConfig.getColorFormat() && this.f12171f.equals(videoEncoderConfig.getDataSpace()) && this.f12172g == videoEncoderConfig.getFrameRate() && this.f12173h == videoEncoderConfig.getIFrameInterval() && this.f12174i == videoEncoderConfig.getBitrate()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getBitrate() {
        return this.f12174i;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getColorFormat() {
        return this.f12170e;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public VideoEncoderDataSpace getDataSpace() {
        return this.f12171f;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getFrameRate() {
        return this.f12172g;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getIFrameInterval() {
        return this.f12173h;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public Timebase getInputTimebase() {
        return this.f12168c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public String getMimeType() {
        return this.f12166a;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
        return this.f12167b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public Size getResolution() {
        return this.f12169d;
    }

    public int hashCode() {
        return ((((((((((((((((this.f12166a.hashCode() ^ 1000003) * 1000003) ^ this.f12167b) * 1000003) ^ this.f12168c.hashCode()) * 1000003) ^ this.f12169d.hashCode()) * 1000003) ^ this.f12170e) * 1000003) ^ this.f12171f.hashCode()) * 1000003) ^ this.f12172g) * 1000003) ^ this.f12173h) * 1000003) ^ this.f12174i;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f12166a + ", profile=" + this.f12167b + ", inputTimebase=" + this.f12168c + ", resolution=" + this.f12169d + ", colorFormat=" + this.f12170e + ", dataSpace=" + this.f12171f + ", frameRate=" + this.f12172g + ", IFrameInterval=" + this.f12173h + ", bitrate=" + this.f12174i + "}";
    }

    public C2658b(String str, int i, Timebase timebase, Size size, int i2, VideoEncoderDataSpace videoEncoderDataSpace, int i3, int i4, int i5) {
        this.f12166a = str;
        this.f12167b = i;
        this.f12168c = timebase;
        this.f12169d = size;
        this.f12170e = i2;
        this.f12171f = videoEncoderDataSpace;
        this.f12172g = i3;
        this.f12173h = i4;
        this.f12174i = i5;
    }
}