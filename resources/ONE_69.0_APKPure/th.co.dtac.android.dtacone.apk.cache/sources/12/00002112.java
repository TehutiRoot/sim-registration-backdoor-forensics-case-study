package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioSettings;

/* renamed from: androidx.camera.video.internal.audio.b */
/* loaded from: classes.dex */
public final class C2635b extends AudioSettings {

    /* renamed from: a */
    public final int f12024a;

    /* renamed from: b */
    public final int f12025b;

    /* renamed from: c */
    public final int f12026c;

    /* renamed from: d */
    public final int f12027d;

    /* renamed from: androidx.camera.video.internal.audio.b$b */
    /* loaded from: classes.dex */
    public static final class C2637b extends AudioSettings.Builder {

        /* renamed from: a */
        public Integer f12028a;

        /* renamed from: b */
        public Integer f12029b;

        /* renamed from: c */
        public Integer f12030c;

        /* renamed from: d */
        public Integer f12031d;

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        /* renamed from: a */
        public AudioSettings mo62072a() {
            String str = "";
            if (this.f12028a == null) {
                str = " audioSource";
            }
            if (this.f12029b == null) {
                str = str + " sampleRate";
            }
            if (this.f12030c == null) {
                str = str + " channelCount";
            }
            if (this.f12031d == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new C2635b(this.f12028a.intValue(), this.f12029b.intValue(), this.f12030c.intValue(), this.f12031d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioFormat(int i) {
            this.f12031d = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioSource(int i) {
            this.f12028a = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setChannelCount(int i) {
            this.f12030c = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setSampleRate(int i) {
            this.f12029b = Integer.valueOf(i);
            return this;
        }

        public C2637b() {
        }

        public C2637b(AudioSettings audioSettings) {
            this.f12028a = Integer.valueOf(audioSettings.getAudioSource());
            this.f12029b = Integer.valueOf(audioSettings.getSampleRate());
            this.f12030c = Integer.valueOf(audioSettings.getChannelCount());
            this.f12031d = Integer.valueOf(audioSettings.getAudioFormat());
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
        if (this.f12024a == audioSettings.getAudioSource() && this.f12025b == audioSettings.getSampleRate() && this.f12026c == audioSettings.getChannelCount() && this.f12027d == audioSettings.getAudioFormat()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioFormat() {
        return this.f12027d;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioSource() {
        return this.f12024a;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getChannelCount() {
        return this.f12026c;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getSampleRate() {
        return this.f12025b;
    }

    public int hashCode() {
        return ((((((this.f12024a ^ 1000003) * 1000003) ^ this.f12025b) * 1000003) ^ this.f12026c) * 1000003) ^ this.f12027d;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public AudioSettings.Builder toBuilder() {
        return new C2637b(this);
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.f12024a + ", sampleRate=" + this.f12025b + ", channelCount=" + this.f12026c + ", audioFormat=" + this.f12027d + "}";
    }

    public C2635b(int i, int i2, int i3, int i4) {
        this.f12024a = i;
        this.f12025b = i2;
        this.f12026c = i3;
        this.f12027d = i4;
    }
}