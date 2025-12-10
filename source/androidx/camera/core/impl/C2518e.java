package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;

/* renamed from: androidx.camera.core.impl.e */
/* loaded from: classes.dex */
public final class C2518e extends EncoderProfilesProxy.VideoProfileProxy {

    /* renamed from: a */
    public final int f11238a;

    /* renamed from: b */
    public final String f11239b;

    /* renamed from: c */
    public final int f11240c;

    /* renamed from: d */
    public final int f11241d;

    /* renamed from: e */
    public final int f11242e;

    /* renamed from: f */
    public final int f11243f;

    /* renamed from: g */
    public final int f11244g;

    /* renamed from: h */
    public final int f11245h;

    /* renamed from: i */
    public final int f11246i;

    /* renamed from: j */
    public final int f11247j;

    public C2518e(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f11238a = i;
        if (str != null) {
            this.f11239b = str;
            this.f11240c = i2;
            this.f11241d = i3;
            this.f11242e = i4;
            this.f11243f = i5;
            this.f11244g = i6;
            this.f11245h = i7;
            this.f11246i = i8;
            this.f11247j = i9;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.VideoProfileProxy)) {
            return false;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) obj;
        if (this.f11238a == videoProfileProxy.getCodec() && this.f11239b.equals(videoProfileProxy.getMediaType()) && this.f11240c == videoProfileProxy.getBitrate() && this.f11241d == videoProfileProxy.getFrameRate() && this.f11242e == videoProfileProxy.getWidth() && this.f11243f == videoProfileProxy.getHeight() && this.f11244g == videoProfileProxy.getProfile() && this.f11245h == videoProfileProxy.getBitDepth() && this.f11246i == videoProfileProxy.getChromaSubsampling() && this.f11247j == videoProfileProxy.getHdrFormat()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getBitDepth() {
        return this.f11245h;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getBitrate() {
        return this.f11240c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getChromaSubsampling() {
        return this.f11246i;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getCodec() {
        return this.f11238a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getFrameRate() {
        return this.f11241d;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getHdrFormat() {
        return this.f11247j;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getHeight() {
        return this.f11243f;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public String getMediaType() {
        return this.f11239b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getProfile() {
        return this.f11244g;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getWidth() {
        return this.f11242e;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f11238a ^ 1000003) * 1000003) ^ this.f11239b.hashCode()) * 1000003) ^ this.f11240c) * 1000003) ^ this.f11241d) * 1000003) ^ this.f11242e) * 1000003) ^ this.f11243f) * 1000003) ^ this.f11244g) * 1000003) ^ this.f11245h) * 1000003) ^ this.f11246i) * 1000003) ^ this.f11247j;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f11238a + ", mediaType=" + this.f11239b + ", bitrate=" + this.f11240c + ", frameRate=" + this.f11241d + ", width=" + this.f11242e + ", height=" + this.f11243f + ", profile=" + this.f11244g + ", bitDepth=" + this.f11245h + ", chromaSubsampling=" + this.f11246i + ", hdrFormat=" + this.f11247j + "}";
    }
}
