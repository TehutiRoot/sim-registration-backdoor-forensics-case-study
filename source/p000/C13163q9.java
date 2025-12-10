package p000;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import java.util.List;

/* renamed from: q9 */
/* loaded from: classes.dex */
public final class C13163q9 extends VideoValidatedEncoderProfilesProxy {

    /* renamed from: a */
    public final int f76880a;

    /* renamed from: b */
    public final int f76881b;

    /* renamed from: c */
    public final List f76882c;

    /* renamed from: d */
    public final List f76883d;

    /* renamed from: e */
    public final EncoderProfilesProxy.AudioProfileProxy f76884e;

    /* renamed from: f */
    public final EncoderProfilesProxy.VideoProfileProxy f76885f;

    public C13163q9(int i, int i2, List list, List list2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f76880a = i;
        this.f76881b = i2;
        if (list != null) {
            this.f76882c = list;
            if (list2 != null) {
                this.f76883d = list2;
                this.f76884e = audioProfileProxy;
                if (videoProfileProxy != null) {
                    this.f76885f = videoProfileProxy;
                    return;
                }
                throw new NullPointerException("Null defaultVideoProfile");
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    public boolean equals(Object obj) {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoValidatedEncoderProfilesProxy)) {
            return false;
        }
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = (VideoValidatedEncoderProfilesProxy) obj;
        if (this.f76880a == videoValidatedEncoderProfilesProxy.getDefaultDurationSeconds() && this.f76881b == videoValidatedEncoderProfilesProxy.getRecommendedFileFormat() && this.f76882c.equals(videoValidatedEncoderProfilesProxy.getAudioProfiles()) && this.f76883d.equals(videoValidatedEncoderProfilesProxy.getVideoProfiles()) && ((audioProfileProxy = this.f76884e) != null ? audioProfileProxy.equals(videoValidatedEncoderProfilesProxy.getDefaultAudioProfile()) : videoValidatedEncoderProfilesProxy.getDefaultAudioProfile() == null) && this.f76885f.equals(videoValidatedEncoderProfilesProxy.getDefaultVideoProfile())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public List getAudioProfiles() {
        return this.f76882c;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile() {
        return this.f76884e;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getDefaultDurationSeconds() {
        return this.f76880a;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile() {
        return this.f76885f;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getRecommendedFileFormat() {
        return this.f76881b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public List getVideoProfiles() {
        return this.f76883d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f76880a ^ 1000003) * 1000003) ^ this.f76881b) * 1000003) ^ this.f76882c.hashCode()) * 1000003) ^ this.f76883d.hashCode()) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f76884e;
        if (audioProfileProxy == null) {
            hashCode = 0;
        } else {
            hashCode = audioProfileProxy.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.f76885f.hashCode();
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f76880a + ", recommendedFileFormat=" + this.f76881b + ", audioProfiles=" + this.f76882c + ", videoProfiles=" + this.f76883d + ", defaultAudioProfile=" + this.f76884e + ", defaultVideoProfile=" + this.f76885f + "}";
    }
}
