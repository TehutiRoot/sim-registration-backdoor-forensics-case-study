package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.AudioSpec;

/* renamed from: androidx.camera.video.a */
/* loaded from: classes.dex */
public final class C2609a extends AudioSpec {

    /* renamed from: a */
    public final Range f11889a;

    /* renamed from: b */
    public final int f11890b;

    /* renamed from: c */
    public final int f11891c;

    /* renamed from: d */
    public final Range f11892d;

    /* renamed from: e */
    public final int f11893e;

    /* renamed from: androidx.camera.video.a$b */
    /* loaded from: classes.dex */
    public static final class C2611b extends AudioSpec.Builder {

        /* renamed from: a */
        public Range f11894a;

        /* renamed from: b */
        public Integer f11895b;

        /* renamed from: c */
        public Integer f11896c;

        /* renamed from: d */
        public Range f11897d;

        /* renamed from: e */
        public Integer f11898e;

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec build() {
            String str = "";
            if (this.f11894a == null) {
                str = " bitrate";
            }
            if (this.f11895b == null) {
                str = str + " sourceFormat";
            }
            if (this.f11896c == null) {
                str = str + " source";
            }
            if (this.f11897d == null) {
                str = str + " sampleRate";
            }
            if (this.f11898e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C2609a(this.f11894a, this.f11895b.intValue(), this.f11896c.intValue(), this.f11897d, this.f11898e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setBitrate(Range range) {
            if (range != null) {
                this.f11894a = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setChannelCount(int i) {
            this.f11898e = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSampleRate(Range range) {
            if (range != null) {
                this.f11897d = range;
                return this;
            }
            throw new NullPointerException("Null sampleRate");
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSource(int i) {
            this.f11896c = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSourceFormat(int i) {
            this.f11895b = Integer.valueOf(i);
            return this;
        }

        public C2611b() {
        }

        public C2611b(AudioSpec audioSpec) {
            this.f11894a = audioSpec.getBitrate();
            this.f11895b = Integer.valueOf(audioSpec.getSourceFormat());
            this.f11896c = Integer.valueOf(audioSpec.getSource());
            this.f11897d = audioSpec.getSampleRate();
            this.f11898e = Integer.valueOf(audioSpec.getChannelCount());
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
        if (this.f11889a.equals(audioSpec.getBitrate()) && this.f11890b == audioSpec.getSourceFormat() && this.f11891c == audioSpec.getSource() && this.f11892d.equals(audioSpec.getSampleRate()) && this.f11893e == audioSpec.getChannelCount()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.AudioSpec
    public Range getBitrate() {
        return this.f11889a;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getChannelCount() {
        return this.f11893e;
    }

    @Override // androidx.camera.video.AudioSpec
    public Range getSampleRate() {
        return this.f11892d;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSource() {
        return this.f11891c;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSourceFormat() {
        return this.f11890b;
    }

    public int hashCode() {
        return ((((((((this.f11889a.hashCode() ^ 1000003) * 1000003) ^ this.f11890b) * 1000003) ^ this.f11891c) * 1000003) ^ this.f11892d.hashCode()) * 1000003) ^ this.f11893e;
    }

    @Override // androidx.camera.video.AudioSpec
    public AudioSpec.Builder toBuilder() {
        return new C2611b(this);
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f11889a + ", sourceFormat=" + this.f11890b + ", source=" + this.f11891c + ", sampleRate=" + this.f11892d + ", channelCount=" + this.f11893e + "}";
    }

    public C2609a(Range range, int i, int i2, Range range2, int i3) {
        this.f11889a = range;
        this.f11890b = i;
        this.f11891c = i2;
        this.f11892d = range2;
        this.f11893e = i3;
    }
}