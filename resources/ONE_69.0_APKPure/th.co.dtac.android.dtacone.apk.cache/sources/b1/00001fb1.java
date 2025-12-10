package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;

/* renamed from: androidx.camera.core.impl.e */
/* loaded from: classes.dex */
public final class C2500e extends EncoderProfilesProxy.VideoProfileProxy {

    /* renamed from: a */
    public final int f11326a;

    /* renamed from: b */
    public final String f11327b;

    /* renamed from: c */
    public final int f11328c;

    /* renamed from: d */
    public final int f11329d;

    /* renamed from: e */
    public final int f11330e;

    /* renamed from: f */
    public final int f11331f;

    /* renamed from: g */
    public final int f11332g;

    /* renamed from: h */
    public final int f11333h;

    /* renamed from: i */
    public final int f11334i;

    /* renamed from: j */
    public final int f11335j;

    public C2500e(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f11326a = i;
        if (str != null) {
            this.f11327b = str;
            this.f11328c = i2;
            this.f11329d = i3;
            this.f11330e = i4;
            this.f11331f = i5;
            this.f11332g = i6;
            this.f11333h = i7;
            this.f11334i = i8;
            this.f11335j = i9;
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
        if (this.f11326a == videoProfileProxy.getCodec() && this.f11327b.equals(videoProfileProxy.getMediaType()) && this.f11328c == videoProfileProxy.getBitrate() && this.f11329d == videoProfileProxy.getFrameRate() && this.f11330e == videoProfileProxy.getWidth() && this.f11331f == videoProfileProxy.getHeight() && this.f11332g == videoProfileProxy.getProfile() && this.f11333h == videoProfileProxy.getBitDepth() && this.f11334i == videoProfileProxy.getChromaSubsampling() && this.f11335j == videoProfileProxy.getHdrFormat()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getBitDepth() {
        return this.f11333h;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getBitrate() {
        return this.f11328c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getChromaSubsampling() {
        return this.f11334i;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getCodec() {
        return this.f11326a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getFrameRate() {
        return this.f11329d;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getHdrFormat() {
        return this.f11335j;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getHeight() {
        return this.f11331f;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public String getMediaType() {
        return this.f11327b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getProfile() {
        return this.f11332g;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public int getWidth() {
        return this.f11330e;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f11326a ^ 1000003) * 1000003) ^ this.f11327b.hashCode()) * 1000003) ^ this.f11328c) * 1000003) ^ this.f11329d) * 1000003) ^ this.f11330e) * 1000003) ^ this.f11331f) * 1000003) ^ this.f11332g) * 1000003) ^ this.f11333h) * 1000003) ^ this.f11334i) * 1000003) ^ this.f11335j;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f11326a + ", mediaType=" + this.f11327b + ", bitrate=" + this.f11328c + ", frameRate=" + this.f11329d + ", width=" + this.f11330e + ", height=" + this.f11331f + ", profile=" + this.f11332g + ", bitDepth=" + this.f11333h + ", chromaSubsampling=" + this.f11334i + ", hdrFormat=" + this.f11335j + "}";
    }
}