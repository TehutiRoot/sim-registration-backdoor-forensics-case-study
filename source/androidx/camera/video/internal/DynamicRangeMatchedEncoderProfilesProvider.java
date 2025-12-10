package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class DynamicRangeMatchedEncoderProfilesProvider implements EncoderProfilesProvider {

    /* renamed from: a */
    public final EncoderProfilesProvider f11863a;

    /* renamed from: b */
    public final DynamicRange f11864b;

    /* renamed from: c */
    public final Map f11865c = new HashMap();

    public DynamicRangeMatchedEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull DynamicRange dynamicRange) {
        this.f11863a = encoderProfilesProvider;
        this.f11864b = dynamicRange;
    }

    /* renamed from: a */
    public static EncoderProfilesProxy m62209a(EncoderProfilesProxy encoderProfilesProxy, DynamicRange dynamicRange) {
        if (encoderProfilesProxy == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxy.getVideoProfiles()) {
            if (m62207c(videoProfileProxy, dynamicRange) && m62206d(videoProfileProxy, dynamicRange)) {
                arrayList.add(videoProfileProxy);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    /* renamed from: b */
    private EncoderProfilesProxy m62208b(int i) {
        if (this.f11865c.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) this.f11865c.get(Integer.valueOf(i));
        }
        if (this.f11863a.hasProfile(i)) {
            EncoderProfilesProxy m62209a = m62209a(this.f11863a.getAll(i), this.f11864b);
            this.f11865c.put(Integer.valueOf(i), m62209a);
            return m62209a;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m62207c(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, DynamicRange dynamicRange) {
        Set<Integer> set = DynamicRangeUtil.DR_TO_VP_BIT_DEPTH_MAP.get(Integer.valueOf(dynamicRange.getBitDepth()));
        if (set != null && set.contains(Integer.valueOf(videoProfileProxy.getBitDepth()))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m62206d(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, DynamicRange dynamicRange) {
        Set<Integer> set = DynamicRangeUtil.DR_TO_VP_FORMAT_MAP.get(Integer.valueOf(dynamicRange.getEncoding()));
        if (set != null && set.contains(Integer.valueOf(videoProfileProxy.getHdrFormat()))) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i) {
        return m62208b(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        if (!this.f11863a.hasProfile(i) || m62208b(i) == null) {
            return false;
        }
        return true;
    }
}
