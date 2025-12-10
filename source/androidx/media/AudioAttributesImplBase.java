package androidx.media;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes2.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f36019a;

    /* renamed from: b */
    public int f36020b;

    /* renamed from: c */
    public int f36021c;

    /* renamed from: d */
    public int f36022d;

    public AudioAttributesImplBase() {
        this.f36019a = 0;
        this.f36020b = 0;
        this.f36021c = 0;
        this.f36022d = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: a */
    public int mo54021a() {
        return this.f36022d;
    }

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: b */
    public Object mo54020b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f36020b != audioAttributesImplBase.getContentType() || this.f36021c != audioAttributesImplBase.getFlags() || this.f36019a != audioAttributesImplBase.getUsage() || this.f36022d != audioAttributesImplBase.f36022d) {
            return false;
        }
        return true;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f36020b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i = this.f36021c;
        int legacyStreamType = getLegacyStreamType();
        if (legacyStreamType == 6) {
            i |= 4;
        } else if (legacyStreamType == 7) {
            i |= 1;
        }
        return i & 273;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i = this.f36022d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m54027c(false, this.f36021c, this.f36019a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.f36019a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return AudioAttributesCompat.m54027c(true, this.f36021c, this.f36019a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36020b), Integer.valueOf(this.f36021c), Integer.valueOf(this.f36019a), Integer.valueOf(this.f36022d)});
    }

    @Override // androidx.media.AudioAttributesImpl
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.media.audio_attrs.USAGE", this.f36019a);
        bundle.putInt("androidx.media.audio_attrs.CONTENT_TYPE", this.f36020b);
        bundle.putInt("androidx.media.audio_attrs.FLAGS", this.f36021c);
        int i = this.f36022d;
        if (i != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f36022d != -1) {
            sb.append(" stream=");
            sb.append(this.f36022d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m54025e(this.f36019a));
        sb.append(" content=");
        sb.append(this.f36020b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f36021c).toUpperCase());
        return sb.toString();
    }

    public AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f36020b = i;
        this.f36021c = i2;
        this.f36019a = i3;
        this.f36022d = i4;
    }
}
