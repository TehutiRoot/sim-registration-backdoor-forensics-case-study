package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* renamed from: androidx.camera.core.impl.d */
/* loaded from: classes.dex */
public final class C2517d extends EncoderProfilesProxy.ImmutableEncoderProfilesProxy {

    /* renamed from: a */
    public final int f11234a;

    /* renamed from: b */
    public final int f11235b;

    /* renamed from: c */
    public final List f11236c;

    /* renamed from: d */
    public final List f11237d;

    public C2517d(int i, int i2, List list, List list2) {
        this.f11234a = i;
        this.f11235b = i2;
        if (list != null) {
            this.f11236c = list;
            if (list2 != null) {
                this.f11237d = list2;
                return;
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.ImmutableEncoderProfilesProxy)) {
            return false;
        }
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy = (EncoderProfilesProxy.ImmutableEncoderProfilesProxy) obj;
        if (this.f11234a == immutableEncoderProfilesProxy.getDefaultDurationSeconds() && this.f11235b == immutableEncoderProfilesProxy.getRecommendedFileFormat() && this.f11236c.equals(immutableEncoderProfilesProxy.getAudioProfiles()) && this.f11237d.equals(immutableEncoderProfilesProxy.getVideoProfiles())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public List getAudioProfiles() {
        return this.f11236c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getDefaultDurationSeconds() {
        return this.f11234a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getRecommendedFileFormat() {
        return this.f11235b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public List getVideoProfiles() {
        return this.f11237d;
    }

    public int hashCode() {
        return ((((((this.f11234a ^ 1000003) * 1000003) ^ this.f11235b) * 1000003) ^ this.f11236c.hashCode()) * 1000003) ^ this.f11237d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f11234a + ", recommendedFileFormat=" + this.f11235b + ", audioProfiles=" + this.f11236c + ", videoProfiles=" + this.f11237d + "}";
    }
}
