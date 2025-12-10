package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;

/* renamed from: androidx.camera.core.impl.c */
/* loaded from: classes.dex */
public final class C2516c extends EncoderProfilesProxy.AudioProfileProxy {

    /* renamed from: a */
    public final int f11228a;

    /* renamed from: b */
    public final String f11229b;

    /* renamed from: c */
    public final int f11230c;

    /* renamed from: d */
    public final int f11231d;

    /* renamed from: e */
    public final int f11232e;

    /* renamed from: f */
    public final int f11233f;

    public C2516c(int i, String str, int i2, int i3, int i4, int i5) {
        this.f11228a = i;
        if (str != null) {
            this.f11229b = str;
            this.f11230c = i2;
            this.f11231d = i3;
            this.f11232e = i4;
            this.f11233f = i5;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.AudioProfileProxy)) {
            return false;
        }
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = (EncoderProfilesProxy.AudioProfileProxy) obj;
        if (this.f11228a == audioProfileProxy.getCodec() && this.f11229b.equals(audioProfileProxy.getMediaType()) && this.f11230c == audioProfileProxy.getBitrate() && this.f11231d == audioProfileProxy.getSampleRate() && this.f11232e == audioProfileProxy.getChannels() && this.f11233f == audioProfileProxy.getProfile()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getBitrate() {
        return this.f11230c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getChannels() {
        return this.f11232e;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getCodec() {
        return this.f11228a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public String getMediaType() {
        return this.f11229b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getProfile() {
        return this.f11233f;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getSampleRate() {
        return this.f11231d;
    }

    public int hashCode() {
        return ((((((((((this.f11228a ^ 1000003) * 1000003) ^ this.f11229b.hashCode()) * 1000003) ^ this.f11230c) * 1000003) ^ this.f11231d) * 1000003) ^ this.f11232e) * 1000003) ^ this.f11233f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f11228a + ", mediaType=" + this.f11229b + ", bitrate=" + this.f11230c + ", sampleRate=" + this.f11231d + ", channels=" + this.f11232e + ", profile=" + this.f11233f + "}";
    }
}
