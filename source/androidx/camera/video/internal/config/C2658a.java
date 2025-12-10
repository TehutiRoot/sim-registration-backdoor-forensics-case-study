package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.AudioMimeInfo;

/* renamed from: androidx.camera.video.internal.config.a */
/* loaded from: classes.dex */
public final class C2658a extends AudioMimeInfo {

    /* renamed from: a */
    public final String f11984a;

    /* renamed from: b */
    public final int f11985b;

    /* renamed from: c */
    public final EncoderProfilesProxy.AudioProfileProxy f11986c;

    /* renamed from: androidx.camera.video.internal.config.a$b */
    /* loaded from: classes.dex */
    public static final class C2660b extends AudioMimeInfo.Builder {

        /* renamed from: a */
        public String f11987a;

        /* renamed from: b */
        public Integer f11988b;

        /* renamed from: c */
        public EncoderProfilesProxy.AudioProfileProxy f11989c;

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        /* renamed from: a */
        public AudioMimeInfo.Builder setMimeType(String str) {
            if (str != null) {
                this.f11987a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        /* renamed from: b */
        public AudioMimeInfo.Builder setProfile(int i) {
            this.f11988b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.config.AudioMimeInfo.Builder
        public AudioMimeInfo.Builder setCompatibleAudioProfile(EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
            this.f11989c = audioProfileProxy;
            return this;
        }

        @Override // androidx.camera.video.internal.config.AudioMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public AudioMimeInfo build() {
            String str = "";
            if (this.f11987a == null) {
                str = " mimeType";
            }
            if (this.f11988b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C2658a(this.f11987a, this.f11988b.intValue(), this.f11989c);
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
        if (this.f11984a.equals(audioMimeInfo.getMimeType()) && this.f11985b == audioMimeInfo.getProfile()) {
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f11986c;
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
        return this.f11986c;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public String getMimeType() {
        return this.f11984a;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public int getProfile() {
        return this.f11985b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f11984a.hashCode() ^ 1000003) * 1000003) ^ this.f11985b) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f11986c;
        if (audioProfileProxy == null) {
            hashCode = 0;
        } else {
            hashCode = audioProfileProxy.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.f11984a + ", profile=" + this.f11985b + ", compatibleAudioProfile=" + this.f11986c + "}";
    }

    public C2658a(String str, int i, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f11984a = str;
        this.f11985b = i;
        this.f11986c = audioProfileProxy;
    }
}
