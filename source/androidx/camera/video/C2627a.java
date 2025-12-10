package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.AudioSpec;

/* renamed from: androidx.camera.video.a */
/* loaded from: classes.dex */
public final class C2627a extends AudioSpec {

    /* renamed from: a */
    public final Range f11801a;

    /* renamed from: b */
    public final int f11802b;

    /* renamed from: c */
    public final int f11803c;

    /* renamed from: d */
    public final Range f11804d;

    /* renamed from: e */
    public final int f11805e;

    /* renamed from: androidx.camera.video.a$b */
    /* loaded from: classes.dex */
    public static final class C2629b extends AudioSpec.Builder {

        /* renamed from: a */
        public Range f11806a;

        /* renamed from: b */
        public Integer f11807b;

        /* renamed from: c */
        public Integer f11808c;

        /* renamed from: d */
        public Range f11809d;

        /* renamed from: e */
        public Integer f11810e;

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec build() {
            String str = "";
            if (this.f11806a == null) {
                str = " bitrate";
            }
            if (this.f11807b == null) {
                str = str + " sourceFormat";
            }
            if (this.f11808c == null) {
                str = str + " source";
            }
            if (this.f11809d == null) {
                str = str + " sampleRate";
            }
            if (this.f11810e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C2627a(this.f11806a, this.f11807b.intValue(), this.f11808c.intValue(), this.f11809d, this.f11810e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setBitrate(Range range) {
            if (range != null) {
                this.f11806a = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setChannelCount(int i) {
            this.f11810e = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSampleRate(Range range) {
            if (range != null) {
                this.f11809d = range;
                return this;
            }
            throw new NullPointerException("Null sampleRate");
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSource(int i) {
            this.f11808c = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSourceFormat(int i) {
            this.f11807b = Integer.valueOf(i);
            return this;
        }

        public C2629b() {
        }

        public C2629b(AudioSpec audioSpec) {
            this.f11806a = audioSpec.getBitrate();
            this.f11807b = Integer.valueOf(audioSpec.getSourceFormat());
            this.f11808c = Integer.valueOf(audioSpec.getSource());
            this.f11809d = audioSpec.getSampleRate();
            this.f11810e = Integer.valueOf(audioSpec.getChannelCount());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSpec)) {
            return false;
        }
        AudioSpec audioSpec = (AudioSpec) obj;
        if (this.f11801a.equals(audioSpec.getBitrate()) && this.f11802b == audioSpec.getSourceFormat() && this.f11803c == audioSpec.getSource() && this.f11804d.equals(audioSpec.getSampleRate()) && this.f11805e == audioSpec.getChannelCount()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.AudioSpec
    public Range getBitrate() {
        return this.f11801a;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getChannelCount() {
        return this.f11805e;
    }

    @Override // androidx.camera.video.AudioSpec
    public Range getSampleRate() {
        return this.f11804d;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSource() {
        return this.f11803c;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSourceFormat() {
        return this.f11802b;
    }

    public int hashCode() {
        return ((((((((this.f11801a.hashCode() ^ 1000003) * 1000003) ^ this.f11802b) * 1000003) ^ this.f11803c) * 1000003) ^ this.f11804d.hashCode()) * 1000003) ^ this.f11805e;
    }

    @Override // androidx.camera.video.AudioSpec
    public AudioSpec.Builder toBuilder() {
        return new C2629b(this);
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f11801a + ", sourceFormat=" + this.f11802b + ", source=" + this.f11803c + ", sampleRate=" + this.f11804d + ", channelCount=" + this.f11805e + "}";
    }

    public C2627a(Range range, int i, int i2, Range range2, int i3) {
        this.f11801a = range;
        this.f11802b = i;
        this.f11803c = i2;
        this.f11804d = range2;
        this.f11805e = i3;
    }
}
