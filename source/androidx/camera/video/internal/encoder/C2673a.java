package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;

/* renamed from: androidx.camera.video.internal.encoder.a */
/* loaded from: classes.dex */
public final class C2673a extends AudioEncoderConfig {

    /* renamed from: a */
    public final String f12066a;

    /* renamed from: b */
    public final int f12067b;

    /* renamed from: c */
    public final Timebase f12068c;

    /* renamed from: d */
    public final int f12069d;

    /* renamed from: e */
    public final int f12070e;

    /* renamed from: f */
    public final int f12071f;

    /* renamed from: androidx.camera.video.internal.encoder.a$b */
    /* loaded from: classes.dex */
    public static final class C2675b extends AudioEncoderConfig.Builder {

        /* renamed from: a */
        public String f12072a;

        /* renamed from: b */
        public Integer f12073b;

        /* renamed from: c */
        public Timebase f12074c;

        /* renamed from: d */
        public Integer f12075d;

        /* renamed from: e */
        public Integer f12076e;

        /* renamed from: f */
        public Integer f12077f;

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        /* renamed from: a */
        public AudioEncoderConfig mo61941a() {
            String str = "";
            if (this.f12072a == null) {
                str = " mimeType";
            }
            if (this.f12073b == null) {
                str = str + " profile";
            }
            if (this.f12074c == null) {
                str = str + " inputTimebase";
            }
            if (this.f12075d == null) {
                str = str + " bitrate";
            }
            if (this.f12076e == null) {
                str = str + " sampleRate";
            }
            if (this.f12077f == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C2673a(this.f12072a, this.f12073b.intValue(), this.f12074c, this.f12075d.intValue(), this.f12076e.intValue(), this.f12077f.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setBitrate(int i) {
            this.f12075d = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setChannelCount(int i) {
            this.f12077f = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setInputTimebase(Timebase timebase) {
            if (timebase != null) {
                this.f12074c = timebase;
                return this;
            }
            throw new NullPointerException("Null inputTimebase");
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setMimeType(String str) {
            if (str != null) {
                this.f12072a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setProfile(int i) {
            this.f12073b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setSampleRate(int i) {
            this.f12076e = Integer.valueOf(i);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioEncoderConfig)) {
            return false;
        }
        AudioEncoderConfig audioEncoderConfig = (AudioEncoderConfig) obj;
        if (this.f12066a.equals(audioEncoderConfig.getMimeType()) && this.f12067b == audioEncoderConfig.getProfile() && this.f12068c.equals(audioEncoderConfig.getInputTimebase()) && this.f12069d == audioEncoderConfig.getBitrate() && this.f12070e == audioEncoderConfig.getSampleRate() && this.f12071f == audioEncoderConfig.getChannelCount()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getBitrate() {
        return this.f12069d;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getChannelCount() {
        return this.f12071f;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public Timebase getInputTimebase() {
        return this.f12068c;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public String getMimeType() {
        return this.f12066a;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
        return this.f12067b;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getSampleRate() {
        return this.f12070e;
    }

    public int hashCode() {
        return ((((((((((this.f12066a.hashCode() ^ 1000003) * 1000003) ^ this.f12067b) * 1000003) ^ this.f12068c.hashCode()) * 1000003) ^ this.f12069d) * 1000003) ^ this.f12070e) * 1000003) ^ this.f12071f;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f12066a + ", profile=" + this.f12067b + ", inputTimebase=" + this.f12068c + ", bitrate=" + this.f12069d + ", sampleRate=" + this.f12070e + ", channelCount=" + this.f12071f + "}";
    }

    public C2673a(String str, int i, Timebase timebase, int i2, int i3, int i4) {
        this.f12066a = str;
        this.f12067b = i;
        this.f12068c = timebase;
        this.f12069d = i2;
        this.f12070e = i3;
        this.f12071f = i4;
    }
}
