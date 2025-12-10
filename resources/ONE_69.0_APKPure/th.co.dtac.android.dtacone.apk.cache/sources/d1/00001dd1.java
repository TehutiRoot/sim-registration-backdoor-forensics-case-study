package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.support.p001v4.media.session.PlaybackStateCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiresApi(33)
/* loaded from: classes.dex */
public final class DynamicRangeConversions {

    /* renamed from: a */
    public static final Map f10580a;

    /* renamed from: b */
    public static final Map f10581b;

    static {
        HashMap hashMap = new HashMap();
        f10580a = hashMap;
        HashMap hashMap2 = new HashMap();
        f10581b = hashMap2;
        DynamicRange dynamicRange = DynamicRange.SDR;
        hashMap.put(1L, dynamicRange);
        hashMap2.put(dynamicRange, Collections.singletonList(1L));
        hashMap.put(2L, DynamicRange.HLG_10_BIT);
        hashMap2.put((DynamicRange) hashMap.get(2L), Collections.singletonList(2L));
        DynamicRange dynamicRange2 = DynamicRange.HDR10_10_BIT;
        hashMap.put(4L, dynamicRange2);
        hashMap2.put(dynamicRange2, Collections.singletonList(4L));
        DynamicRange dynamicRange3 = DynamicRange.HDR10_PLUS_10_BIT;
        hashMap.put(8L, dynamicRange3);
        hashMap2.put(dynamicRange3, Collections.singletonList(8L));
        List<Long> asList = Arrays.asList(64L, 128L, 16L, 32L);
        for (Long l : asList) {
            f10580a.put(l, DynamicRange.DOLBY_VISION_10_BIT);
        }
        f10581b.put(DynamicRange.DOLBY_VISION_10_BIT, asList);
        List<Long> asList2 = Arrays.asList(1024L, Long.valueOf((long) PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L);
        for (Long l2 : asList2) {
            f10580a.put(l2, DynamicRange.DOLBY_VISION_8_BIT);
        }
        f10581b.put(DynamicRange.DOLBY_VISION_8_BIT, asList2);
    }

    @Nullable
    @DoNotInline
    public static Long dynamicRangeToFirstSupportedProfile(@NonNull DynamicRange dynamicRange, @NonNull DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) f10581b.get(dynamicRange);
        if (list != null) {
            supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
            for (Long l : list) {
                if (supportedProfiles.contains(l)) {
                    return l;
                }
            }
            return null;
        }
        return null;
    }

    @Nullable
    @DoNotInline
    public static DynamicRange profileToDynamicRange(long j) {
        return (DynamicRange) f10580a.get(Long.valueOf(j));
    }
}