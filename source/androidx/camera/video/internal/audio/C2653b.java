package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioSettings;

/* renamed from: androidx.camera.video.internal.audio.b */
/* loaded from: classes.dex */
public final class C2653b extends AudioSettings {

    /* renamed from: a */
    public final int f11936a;

    /* renamed from: b */
    public final int f11937b;

    /* renamed from: c */
    public final int f11938c;

    /* renamed from: d */
    public final int f11939d;

    /* renamed from: androidx.camera.video.internal.audio.b$b */
    /* loaded from: classes.dex */
    public static final class C2655b extends AudioSettings.Builder {

        /* renamed from: a */
        public Integer f11940a;

        /* renamed from: b */
        public Integer f11941b;

        /* renamed from: c */
        public Integer f11942c;

        /* renamed from: d */
        public Integer f11943d;

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        /* renamed from: a */
        public AudioSettings mo62124a() {
            String str = "";
            if (this.f11940a == null) {
                str = " audioSource";
            }
            if (this.f11941b == null) {
                str = str + " sampleRate";
            }
            if (this.f11942c == null) {
                str = str + " channelCount";
            }
            if (this.f11943d == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new C2653b(this.f11940a.intValue(), this.f11941b.intValue(), this.f11942c.intValue(), this.f11943d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioFormat(int i) {
            this.f11943d = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioSource(int i) {
            this.f11940a = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setChannelCount(int i) {
            this.f11942c = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setSampleRate(int i) {
            this.f11941b = Integer.valueOf(i);
            return this;
        }

        public C2655b() {
        }

        public C2655b(AudioSettings audioSettings) {
            this.f11940a = Integer.valueOf(audioSettings.getAudioSource());
            this.f11941b = Integer.valueOf(audioSettings.getSampleRate());
            this.f11942c = Integer.valueOf(audioSettings.getChannelCount());
            this.f11943d = Integer.valueOf(audioSettings.getAudioFormat());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSettings)) {
            return false;
        }
        AudioSettings audioSettings = (AudioSettings) obj;
        if (this.f11936a == audioSettings.getAudioSource() && this.f11937b == audioSettings.getSampleRate() && this.f11938c == audioSettings.getChannelCount() && this.f11939d == audioSettings.getAudioFormat()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioFormat() {
        return this.f11939d;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioSource() {
        return this.f11936a;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getChannelCount() {
        return this.f11938c;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getSampleRate() {
        return this.f11937b;
    }

    public int hashCode() {
        return ((((((this.f11936a ^ 1000003) * 1000003) ^ this.f11937b) * 1000003) ^ this.f11938c) * 1000003) ^ this.f11939d;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public AudioSettings.Builder toBuilder() {
        return new C2655b(this);
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.f11936a + ", sampleRate=" + this.f11937b + ", channelCount=" + this.f11938c + ", audioFormat=" + this.f11939d + "}";
    }

    public C2653b(int i, int i2, int i3, int i4) {
        this.f11936a = i;
        this.f11937b = i2;
        this.f11938c = i3;
        this.f11939d = i4;
    }
}
