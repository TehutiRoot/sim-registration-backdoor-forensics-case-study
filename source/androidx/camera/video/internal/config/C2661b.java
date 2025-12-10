package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoMimeInfo;

/* renamed from: androidx.camera.video.internal.config.b */
/* loaded from: classes.dex */
public final class C2661b extends VideoMimeInfo {

    /* renamed from: a */
    public final String f11990a;

    /* renamed from: b */
    public final int f11991b;

    /* renamed from: c */
    public final EncoderProfilesProxy.VideoProfileProxy f11992c;

    /* renamed from: androidx.camera.video.internal.config.b$b */
    /* loaded from: classes.dex */
    public static final class C2663b extends VideoMimeInfo.Builder {

        /* renamed from: a */
        public String f11993a;

        /* renamed from: b */
        public Integer f11994b;

        /* renamed from: c */
        public EncoderProfilesProxy.VideoProfileProxy f11995c;

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        /* renamed from: a */
        public VideoMimeInfo.Builder setMimeType(String str) {
            if (str != null) {
                this.f11993a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        /* renamed from: b */
        public VideoMimeInfo.Builder setProfile(int i) {
            this.f11994b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder
        public VideoMimeInfo.Builder setCompatibleVideoProfile(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
            this.f11995c = videoProfileProxy;
            return this;
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public VideoMimeInfo build() {
            String str = "";
            if (this.f11993a == null) {
                str = " mimeType";
            }
            if (this.f11994b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C2661b(this.f11993a, this.f11994b.intValue(), this.f11995c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoMimeInfo)) {
            return false;
        }
        VideoMimeInfo videoMimeInfo = (VideoMimeInfo) obj;
        if (this.f11990a.equals(videoMimeInfo.getMimeType()) && this.f11991b == videoMimeInfo.getProfile()) {
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f11992c;
            if (videoProfileProxy == null) {
                if (videoMimeInfo.getCompatibleVideoProfile() == null) {
                    return true;
                }
            } else if (videoProfileProxy.equals(videoMimeInfo.getCompatibleVideoProfile())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.config.VideoMimeInfo
    public EncoderProfilesProxy.VideoProfileProxy getCompatibleVideoProfile() {
        return this.f11992c;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public String getMimeType() {
        return this.f11990a;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public int getProfile() {
        return this.f11991b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f11990a.hashCode() ^ 1000003) * 1000003) ^ this.f11991b) * 1000003;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f11992c;
        if (videoProfileProxy == null) {
            hashCode = 0;
        } else {
            hashCode = videoProfileProxy.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f11990a + ", profile=" + this.f11991b + ", compatibleVideoProfile=" + this.f11992c + "}";
    }

    public C2661b(String str, int i, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f11990a = str;
        this.f11991b = i;
        this.f11992c = videoProfileProxy;
    }
}
