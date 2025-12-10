package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;

/* renamed from: androidx.camera.video.internal.encoder.a */
/* loaded from: classes.dex */
public final class C2655a extends AudioEncoderConfig {

    /* renamed from: a */
    public final String f12154a;

    /* renamed from: b */
    public final int f12155b;

    /* renamed from: c */
    public final Timebase f12156c;

    /* renamed from: d */
    public final int f12157d;

    /* renamed from: e */
    public final int f12158e;

    /* renamed from: f */
    public final int f12159f;

    /* renamed from: androidx.camera.video.internal.encoder.a$b */
    /* loaded from: classes.dex */
    public static final class C2657b extends AudioEncoderConfig.Builder {

        /* renamed from: a */
        public String f12160a;

        /* renamed from: b */
        public Integer f12161b;

        /* renamed from: c */
        public Timebase f12162c;

        /* renamed from: d */
        public Integer f12163d;

        /* renamed from: e */
        public Integer f12164e;

        /* renamed from: f */
        public Integer f12165f;

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        /* renamed from: a */
        public AudioEncoderConfig mo61889a() {
            String str = "";
            if (this.f12160a == null) {
                str = " mimeType";
            }
            if (this.f12161b == null) {
                str = str + " profile";
            }
            if (this.f12162c == null) {
                str = str + " inputTimebase";
            }
            if (this.f12163d == null) {
                str = str + " bitrate";
            }
            if (this.f12164e == null) {
                str = str + " sampleRate";
            }
            if (this.f12165f == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C2655a(this.f12160a, this.f12161b.intValue(), this.f12162c, this.f12163d.intValue(), this.f12164e.intValue(), this.f12165f.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setBitrate(int i) {
            this.f12163d = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setChannelCount(int i) {
            this.f12165f = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setInputTimebase(Timebase timebase) {
            if (timebase != null) {
                this.f12162c = timebase;
                return this;
            }
            throw new NullPointerException("Null inputTimebase");
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setMimeType(String str) {
            if (str != null) {
                this.f12160a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setProfile(int i) {
            this.f12161b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setSampleRate(int i) {
            this.f12164e = Integer.valueOf(i);
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
        if (this.f12154a.equals(audioEncoderConfig.getMimeType()) && this.f12155b == audioEncoderConfig.getProfile() && this.f12156c.equals(audioEncoderConfig.getInputTimebase()) && this.f12157d == audioEncoderConfig.getBitrate() && this.f12158e == audioEncoderConfig.getSampleRate() && this.f12159f == audioEncoderConfig.getChannelCount()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getBitrate() {
        return this.f12157d;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getChannelCount() {
        return this.f12159f;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public Timebase getInputTimebase() {
        return this.f12156c;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public String getMimeType() {
        return this.f12154a;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
        return this.f12155b;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getSampleRate() {
        return this.f12158e;
    }

    public int hashCode() {
        return ((((((((((this.f12154a.hashCode() ^ 1000003) * 1000003) ^ this.f12155b) * 1000003) ^ this.f12156c.hashCode()) * 1000003) ^ this.f12157d) * 1000003) ^ this.f12158e) * 1000003) ^ this.f12159f;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f12154a + ", profile=" + this.f12155b + ", inputTimebase=" + this.f12156c + ", bitrate=" + this.f12157d + ", sampleRate=" + this.f12158e + ", channelCount=" + this.f12159f + "}";
    }

    public C2655a(String str, int i, Timebase timebase, int i2, int i3, int i4) {
        this.f12154a = str;
        this.f12155b = i;
        this.f12156c = timebase;
        this.f12157d = i2;
        this.f12158e = i3;
        this.f12159f = i4;
    }
}