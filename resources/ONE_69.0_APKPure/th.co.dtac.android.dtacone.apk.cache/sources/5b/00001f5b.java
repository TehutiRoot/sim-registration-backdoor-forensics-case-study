package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.quirk.ProfileResolutionQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class EncoderProfilesResolutionValidator {

    /* renamed from: a */
    public final List f11232a;

    /* renamed from: b */
    public final Set f11233b;

    public EncoderProfilesResolutionValidator(@Nullable List<ProfileResolutionQuirk> list) {
        ArrayList arrayList = new ArrayList();
        this.f11232a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f11233b = m62882a(list);
    }

    /* renamed from: a */
    public final Set m62882a(List list) {
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet(((ProfileResolutionQuirk) list.get(0)).getSupportedResolutions());
            for (int i = 1; i < list.size(); i++) {
                hashSet.retainAll(((ProfileResolutionQuirk) list.get(i)).getSupportedResolutions());
            }
            return hashSet;
        }
        return Collections.emptySet();
    }

    @Nullable
    public EncoderProfilesProxy filterInvalidVideoResolution(@Nullable EncoderProfilesProxy encoderProfilesProxy) {
        if (encoderProfilesProxy == null) {
            return null;
        }
        if (!hasQuirk()) {
            return encoderProfilesProxy;
        }
        ArrayList arrayList = new ArrayList();
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxy.getVideoProfiles()) {
            if (this.f11233b.contains(new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight()))) {
                arrayList.add(videoProfileProxy);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    public boolean hasQuirk() {
        return !this.f11232a.isEmpty();
    }

    public boolean hasValidVideoResolution(@Nullable EncoderProfilesProxy encoderProfilesProxy) {
        if (encoderProfilesProxy == null) {
            return false;
        }
        if (!hasQuirk()) {
            return !encoderProfilesProxy.getVideoProfiles().isEmpty();
        }
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxy.getVideoProfiles()) {
            if (this.f11233b.contains(new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight()))) {
                return true;
            }
        }
        return false;
    }
}