package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;

/* renamed from: androidx.camera.core.impl.c */
/* loaded from: classes.dex */
public final class C2498c extends EncoderProfilesProxy.AudioProfileProxy {

    /* renamed from: a */
    public final int f11316a;

    /* renamed from: b */
    public final String f11317b;

    /* renamed from: c */
    public final int f11318c;

    /* renamed from: d */
    public final int f11319d;

    /* renamed from: e */
    public final int f11320e;

    /* renamed from: f */
    public final int f11321f;

    public C2498c(int i, String str, int i2, int i3, int i4, int i5) {
        this.f11316a = i;
        if (str != null) {
            this.f11317b = str;
            this.f11318c = i2;
            this.f11319d = i3;
            this.f11320e = i4;
            this.f11321f = i5;
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
        if (this.f11316a == audioProfileProxy.getCodec() && this.f11317b.equals(audioProfileProxy.getMediaType()) && this.f11318c == audioProfileProxy.getBitrate() && this.f11319d == audioProfileProxy.getSampleRate() && this.f11320e == audioProfileProxy.getChannels() && this.f11321f == audioProfileProxy.getProfile()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getBitrate() {
        return this.f11318c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getChannels() {
        return this.f11320e;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getCodec() {
        return this.f11316a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public String getMediaType() {
        return this.f11317b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getProfile() {
        return this.f11321f;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getSampleRate() {
        return this.f11319d;
    }

    public int hashCode() {
        return ((((((((((this.f11316a ^ 1000003) * 1000003) ^ this.f11317b.hashCode()) * 1000003) ^ this.f11318c) * 1000003) ^ this.f11319d) * 1000003) ^ this.f11320e) * 1000003) ^ this.f11321f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f11316a + ", mediaType=" + this.f11317b + ", bitrate=" + this.f11318c + ", sampleRate=" + this.f11319d + ", channels=" + this.f11320e + ", profile=" + this.f11321f + "}";
    }
}