package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.AudioMimeInfo;

/* renamed from: androidx.camera.video.internal.config.a */
/* loaded from: classes.dex */
public final class C2640a extends AudioMimeInfo {

    /* renamed from: a */
    public final String f12072a;

    /* renamed from: b */
    public final int f12073b;

    /* renamed from: c */
    public final EncoderProfilesProxy.AudioProfileProxy f12074c;

    /* renamed from: androidx.camera.video.internal.config.a$b */
    /* loaded from: classes.dex */
    public static final class C2642b extends AudioMimeInfo.Builder {

        /* renamed from: a */
        public String f12075a;

        /* renamed from: b */
        public Integer f12076b;

        /* renamed from: c */
        public EncoderProfilesProxy.AudioProfileProxy f12077c;

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        /* renamed from: a */
        public AudioMimeInfo.Builder setMimeType(String str) {
            if (str != null) {
                this.f12075a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        /* renamed from: b */
        public AudioMimeInfo.Builder setProfile(int i) {
            this.f12076b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.config.AudioMimeInfo.Builder
        public AudioMimeInfo.Builder setCompatibleAudioProfile(EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
            this.f12077c = audioProfileProxy;
            return this;
        }

        @Override // androidx.camera.video.internal.config.AudioMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public AudioMimeInfo build() {
            String str = "";
            if (this.f12075a == null) {
                str = " mimeType";
            }
            if (this.f12076b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C2640a(this.f12075a, this.f12076b.intValue(), this.f12077c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioMimeInfo)) {
            return false;
        }
        AudioMimeInfo audioMimeInfo = (AudioMimeInfo) obj;
        if (this.f12072a.equals(audioMimeInfo.getMimeType()) && this.f12073b == audioMimeInfo.getProfile()) {
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f12074c;
            if (audioProfileProxy == null) {
                if (audioMimeInfo.getCompatibleAudioProfile() == null) {
                    return true;
                }
            } else if (audioProfileProxy.equals(audioMimeInfo.getCompatibleAudioProfile())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.config.AudioMimeInfo
    public EncoderProfilesProxy.AudioProfileProxy getCompatibleAudioProfile() {
        return this.f12074c;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public String getMimeType() {
        return this.f12072a;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public int getProfile() {
        return this.f12073b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f12072a.hashCode() ^ 1000003) * 1000003) ^ this.f12073b) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f12074c;
        if (audioProfileProxy == null) {
            hashCode = 0;
        } else {
            hashCode = audioProfileProxy.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.f12072a + ", profile=" + this.f12073b + ", compatibleAudioProfile=" + this.f12074c + "}";
    }

    public C2640a(String str, int i, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f12072a = str;
        this.f12073b = i;
        this.f12074c = audioProfileProxy;
    }
}