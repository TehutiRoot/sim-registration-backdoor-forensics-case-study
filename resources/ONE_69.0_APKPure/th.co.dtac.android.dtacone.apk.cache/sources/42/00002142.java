package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoMimeInfo;

/* renamed from: androidx.camera.video.internal.config.b */
/* loaded from: classes.dex */
public final class C2643b extends VideoMimeInfo {

    /* renamed from: a */
    public final String f12078a;

    /* renamed from: b */
    public final int f12079b;

    /* renamed from: c */
    public final EncoderProfilesProxy.VideoProfileProxy f12080c;

    /* renamed from: androidx.camera.video.internal.config.b$b */
    /* loaded from: classes.dex */
    public static final class C2645b extends VideoMimeInfo.Builder {

        /* renamed from: a */
        public String f12081a;

        /* renamed from: b */
        public Integer f12082b;

        /* renamed from: c */
        public EncoderProfilesProxy.VideoProfileProxy f12083c;

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        /* renamed from: a */
        public VideoMimeInfo.Builder setMimeType(String str) {
            if (str != null) {
                this.f12081a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        /* renamed from: b */
        public VideoMimeInfo.Builder setProfile(int i) {
            this.f12082b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder
        public VideoMimeInfo.Builder setCompatibleVideoProfile(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
            this.f12083c = videoProfileProxy;
            return this;
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public VideoMimeInfo build() {
            String str = "";
            if (this.f12081a == null) {
                str = " mimeType";
            }
            if (this.f12082b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C2643b(this.f12081a, this.f12082b.intValue(), this.f12083c);
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
        if (this.f12078a.equals(videoMimeInfo.getMimeType()) && this.f12079b == videoMimeInfo.getProfile()) {
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f12080c;
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
        return this.f12080c;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public String getMimeType() {
        return this.f12078a;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public int getProfile() {
        return this.f12079b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f12078a.hashCode() ^ 1000003) * 1000003) ^ this.f12079b) * 1000003;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f12080c;
        if (videoProfileProxy == null) {
            hashCode = 0;
        } else {
            hashCode = videoProfileProxy.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f12078a + ", profile=" + this.f12079b + ", compatibleVideoProfile=" + this.f12080c + "}";
    }

    public C2643b(String str, int i, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f12078a = str;
        this.f12079b = i;
        this.f12080c = videoProfileProxy;
    }
}