package p000;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import java.util.List;

/* renamed from: q9 */
/* loaded from: classes.dex */
public final class C13165q9 extends VideoValidatedEncoderProfilesProxy {

    /* renamed from: a */
    public final int f77091a;

    /* renamed from: b */
    public final int f77092b;

    /* renamed from: c */
    public final List f77093c;

    /* renamed from: d */
    public final List f77094d;

    /* renamed from: e */
    public final EncoderProfilesProxy.AudioProfileProxy f77095e;

    /* renamed from: f */
    public final EncoderProfilesProxy.VideoProfileProxy f77096f;

    public C13165q9(int i, int i2, List list, List list2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f77091a = i;
        this.f77092b = i2;
        if (list != null) {
            this.f77093c = list;
            if (list2 != null) {
                this.f77094d = list2;
                this.f77095e = audioProfileProxy;
                if (videoProfileProxy != null) {
                    this.f77096f = videoProfileProxy;
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
        if (this.f77091a == videoValidatedEncoderProfilesProxy.getDefaultDurationSeconds() && this.f77092b == videoValidatedEncoderProfilesProxy.getRecommendedFileFormat() && this.f77093c.equals(videoValidatedEncoderProfilesProxy.getAudioProfiles()) && this.f77094d.equals(videoValidatedEncoderProfilesProxy.getVideoProfiles()) && ((audioProfileProxy = this.f77095e) != null ? audioProfileProxy.equals(videoValidatedEncoderProfilesProxy.getDefaultAudioProfile()) : videoValidatedEncoderProfilesProxy.getDefaultAudioProfile() == null) && this.f77096f.equals(videoValidatedEncoderProfilesProxy.getDefaultVideoProfile())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public List getAudioProfiles() {
        return this.f77093c;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile() {
        return this.f77095e;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getDefaultDurationSeconds() {
        return this.f77091a;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile() {
        return this.f77096f;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getRecommendedFileFormat() {
        return this.f77092b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public List getVideoProfiles() {
        return this.f77094d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f77091a ^ 1000003) * 1000003) ^ this.f77092b) * 1000003) ^ this.f77093c.hashCode()) * 1000003) ^ this.f77094d.hashCode()) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f77095e;
        if (audioProfileProxy == null) {
            hashCode = 0;
        } else {
            hashCode = audioProfileProxy.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.f77096f.hashCode();
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f77091a + ", recommendedFileFormat=" + this.f77092b + ", audioProfiles=" + this.f77093c + ", videoProfiles=" + this.f77094d + ", defaultAudioProfile=" + this.f77095e + ", defaultVideoProfile=" + this.f77096f + "}";
    }
}