package androidx.camera.video;

import androidx.camera.video.MediaSpec;

/* renamed from: androidx.camera.video.e */
/* loaded from: classes.dex */
public final class C2637e extends MediaSpec {

    /* renamed from: a */
    public final VideoSpec f11829a;

    /* renamed from: b */
    public final AudioSpec f11830b;

    /* renamed from: c */
    public final int f11831c;

    /* renamed from: androidx.camera.video.e$b */
    /* loaded from: classes.dex */
    public static final class C2639b extends MediaSpec.Builder {

        /* renamed from: a */
        public VideoSpec f11832a;

        /* renamed from: b */
        public AudioSpec f11833b;

        /* renamed from: c */
        public Integer f11834c;

        @Override // androidx.camera.video.MediaSpec.Builder
        /* renamed from: a */
        public AudioSpec mo62254a() {
            AudioSpec audioSpec = this.f11833b;
            if (audioSpec != null) {
                return audioSpec;
            }
            throw new IllegalStateException("Property \"audioSpec\" has not been set");
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        /* renamed from: b */
        public VideoSpec mo62253b() {
            VideoSpec videoSpec = this.f11832a;
            if (videoSpec != null) {
                return videoSpec;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public MediaSpec build() {
            String str = "";
            if (this.f11832a == null) {
                str = " videoSpec";
            }
            if (this.f11833b == null) {
                str = str + " audioSpec";
            }
            if (this.f11834c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C2637e(this.f11832a, this.f11833b, this.f11834c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public MediaSpec.Builder setAudioSpec(AudioSpec audioSpec) {
            if (audioSpec != null) {
                this.f11833b = audioSpec;
                return this;
            }
            throw new NullPointerException("Null audioSpec");
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public MediaSpec.Builder setOutputFormat(int i) {
            this.f11834c = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public MediaSpec.Builder setVideoSpec(VideoSpec videoSpec) {
            if (videoSpec != null) {
                this.f11832a = videoSpec;
                return this;
            }
            throw new NullPointerException("Null videoSpec");
        }

        public C2639b() {
        }

        public C2639b(MediaSpec mediaSpec) {
            this.f11832a = mediaSpec.getVideoSpec();
            this.f11833b = mediaSpec.getAudioSpec();
            this.f11834c = Integer.valueOf(mediaSpec.getOutputFormat());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaSpec)) {
            return false;
        }
        MediaSpec mediaSpec = (MediaSpec) obj;
        if (this.f11829a.equals(mediaSpec.getVideoSpec()) && this.f11830b.equals(mediaSpec.getAudioSpec()) && this.f11831c == mediaSpec.getOutputFormat()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.MediaSpec
    public AudioSpec getAudioSpec() {
        return this.f11830b;
    }

    @Override // androidx.camera.video.MediaSpec
    public int getOutputFormat() {
        return this.f11831c;
    }

    @Override // androidx.camera.video.MediaSpec
    public VideoSpec getVideoSpec() {
        return this.f11829a;
    }

    public int hashCode() {
        return ((((this.f11829a.hashCode() ^ 1000003) * 1000003) ^ this.f11830b.hashCode()) * 1000003) ^ this.f11831c;
    }

    @Override // androidx.camera.video.MediaSpec
    public MediaSpec.Builder toBuilder() {
        return new C2639b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f11829a + ", audioSpec=" + this.f11830b + ", outputFormat=" + this.f11831c + "}";
    }

    public C2637e(VideoSpec videoSpec, AudioSpec audioSpec, int i) {
        this.f11829a = videoSpec;
        this.f11830b = audioSpec;
        this.f11831c = i;
    }
}
