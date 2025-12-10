package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* renamed from: androidx.camera.core.impl.d */
/* loaded from: classes.dex */
public final class C2499d extends EncoderProfilesProxy.ImmutableEncoderProfilesProxy {

    /* renamed from: a */
    public final int f11322a;

    /* renamed from: b */
    public final int f11323b;

    /* renamed from: c */
    public final List f11324c;

    /* renamed from: d */
    public final List f11325d;

    public C2499d(int i, int i2, List list, List list2) {
        this.f11322a = i;
        this.f11323b = i2;
        if (list != null) {
            this.f11324c = list;
            if (list2 != null) {
                this.f11325d = list2;
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
        if (this.f11322a == immutableEncoderProfilesProxy.getDefaultDurationSeconds() && this.f11323b == immutableEncoderProfilesProxy.getRecommendedFileFormat() && this.f11324c.equals(immutableEncoderProfilesProxy.getAudioProfiles()) && this.f11325d.equals(immutableEncoderProfilesProxy.getVideoProfiles())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public List getAudioProfiles() {
        return this.f11324c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getDefaultDurationSeconds() {
        return this.f11322a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getRecommendedFileFormat() {
        return this.f11323b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public List getVideoProfiles() {
        return this.f11325d;
    }

    public int hashCode() {
        return ((((((this.f11322a ^ 1000003) * 1000003) ^ this.f11323b) * 1000003) ^ this.f11324c.hashCode()) * 1000003) ^ this.f11325d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f11322a + ", recommendedFileFormat=" + this.f11323b + ", audioProfiles=" + this.f11324c + ", videoProfiles=" + this.f11325d + "}";
    }
}