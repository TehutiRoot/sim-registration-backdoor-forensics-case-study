package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.FallbackStrategy;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class QualitySelector {

    /* renamed from: a */
    public final List f11636a;

    /* renamed from: b */
    public final FallbackStrategy f11637b;

    public QualitySelector(List list, FallbackStrategy fallbackStrategy) {
        boolean z;
        if (list.isEmpty() && fallbackStrategy == FallbackStrategy.f11615a) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "No preferred quality and fallback strategy.");
        this.f11636a = Collections.unmodifiableList(new ArrayList(list));
        this.f11637b = fallbackStrategy;
    }

    /* renamed from: b */
    public static void m62514b(Quality quality) {
        boolean m62518a = Quality.m62518a(quality);
        Preconditions.checkArgument(m62518a, "Invalid quality: " + quality);
    }

    /* renamed from: c */
    public static void m62513c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Quality quality = (Quality) it.next();
            boolean m62518a = Quality.m62518a(quality);
            Preconditions.checkArgument(m62518a, "qualities contain invalid quality: " + quality);
        }
    }

    /* renamed from: e */
    public static Size m62511e(VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile = videoValidatedEncoderProfilesProxy.getDefaultVideoProfile();
        return new Size(defaultVideoProfile.getWidth(), defaultVideoProfile.getHeight());
    }

    @NonNull
    public static QualitySelector from(@NonNull Quality quality) {
        return from(quality, FallbackStrategy.f11615a);
    }

    @NonNull
    public static QualitySelector fromOrderedList(@NonNull List<Quality> list) {
        return fromOrderedList(list, FallbackStrategy.f11615a);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Map<Quality, Size> getQualityToResolutionMap(@NonNull VideoCapabilities videoCapabilities, @NonNull DynamicRange dynamicRange) {
        HashMap hashMap = new HashMap();
        for (Quality quality : videoCapabilities.getSupportedQualities(dynamicRange)) {
            VideoValidatedEncoderProfilesProxy profiles = videoCapabilities.getProfiles(quality, dynamicRange);
            Objects.requireNonNull(profiles);
            hashMap.put(quality, m62511e(profiles));
        }
        return hashMap;
    }

    @Nullable
    public static Size getResolution(@NonNull CameraInfo cameraInfo, @NonNull Quality quality) {
        m62514b(quality);
        VideoValidatedEncoderProfilesProxy profiles = Recorder.getVideoCapabilities(cameraInfo).getProfiles(quality, DynamicRange.SDR);
        if (profiles != null) {
            return m62511e(profiles);
        }
        return null;
    }

    @NonNull
    @Deprecated
    public static List<Quality> getSupportedQualities(@NonNull CameraInfo cameraInfo) {
        return Recorder.getVideoCapabilities(cameraInfo).getSupportedQualities(DynamicRange.SDR);
    }

    @Deprecated
    public static boolean isQualitySupported(@NonNull CameraInfo cameraInfo, @NonNull Quality quality) {
        return Recorder.getVideoCapabilities(cameraInfo).isQualitySupported(quality, DynamicRange.SDR);
    }

    /* renamed from: a */
    public final void m62515a(List list, Set set) {
        Quality mo62268a;
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        Logger.m63230d("QualitySelector", "Select quality by fallbackStrategy = " + this.f11637b);
        FallbackStrategy fallbackStrategy = this.f11637b;
        if (fallbackStrategy == FallbackStrategy.f11615a) {
            return;
        }
        Preconditions.checkState(fallbackStrategy instanceof FallbackStrategy.AbstractC2594b, "Currently only support type RuleStrategy");
        FallbackStrategy.AbstractC2594b abstractC2594b = (FallbackStrategy.AbstractC2594b) this.f11637b;
        List m62517b = Quality.m62517b();
        boolean z = false;
        if (abstractC2594b.mo62268a() == Quality.HIGHEST) {
            mo62268a = (Quality) m62517b.get(0);
        } else if (abstractC2594b.mo62268a() == Quality.LOWEST) {
            mo62268a = (Quality) m62517b.get(m62517b.size() - 1);
        } else {
            mo62268a = abstractC2594b.mo62268a();
        }
        int indexOf = m62517b.indexOf(mo62268a);
        if (indexOf != -1) {
            z = true;
        }
        Preconditions.checkState(z);
        ArrayList arrayList = new ArrayList();
        for (int i = indexOf - 1; i >= 0; i--) {
            Quality quality = (Quality) m62517b.get(i);
            if (list.contains(quality)) {
                arrayList.add(quality);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = indexOf + 1; i2 < m62517b.size(); i2++) {
            Quality quality2 = (Quality) m62517b.get(i2);
            if (list.contains(quality2)) {
                arrayList2.add(quality2);
            }
        }
        Logger.m63230d("QualitySelector", "sizeSortedQualities = " + m62517b + ", fallback quality = " + mo62268a + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int mo62267b = abstractC2594b.mo62267b();
        if (mo62267b != 0) {
            if (mo62267b != 1) {
                if (mo62267b != 2) {
                    if (mo62267b != 3) {
                        if (mo62267b == 4) {
                            set.addAll(arrayList2);
                            return;
                        }
                        throw new AssertionError("Unhandled fallback strategy: " + this.f11637b);
                    }
                    set.addAll(arrayList2);
                    set.addAll(arrayList);
                    return;
                }
                set.addAll(arrayList);
                return;
            }
            set.addAll(arrayList);
            set.addAll(arrayList2);
        }
    }

    /* renamed from: d */
    public List m62512d(List list) {
        if (list.isEmpty()) {
            Logger.m63223w("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        Logger.m63230d("QualitySelector", "supportedQualities = " + list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = this.f11636a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Quality quality = (Quality) it.next();
            if (quality == Quality.HIGHEST) {
                linkedHashSet.addAll(list);
                break;
            } else if (quality == Quality.LOWEST) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            } else if (list.contains(quality)) {
                linkedHashSet.add(quality);
            } else {
                Logger.m63223w("QualitySelector", "quality is not supported and will be ignored: " + quality);
            }
        }
        m62515a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    @NonNull
    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f11636a + ", fallbackStrategy=" + this.f11637b + "}";
    }

    @NonNull
    public static QualitySelector from(@NonNull Quality quality, @NonNull FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(quality, "quality cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        m62514b(quality);
        return new QualitySelector(Collections.singletonList(quality), fallbackStrategy);
    }

    @NonNull
    public static QualitySelector fromOrderedList(@NonNull List<Quality> list, @NonNull FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(list, "qualities cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        Preconditions.checkArgument(!list.isEmpty(), "qualities cannot be empty");
        m62513c(list);
        return new QualitySelector(list, fallbackStrategy);
    }
}
