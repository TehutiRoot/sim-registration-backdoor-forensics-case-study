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
    public final List f11724a;

    /* renamed from: b */
    public final FallbackStrategy f11725b;

    public QualitySelector(List list, FallbackStrategy fallbackStrategy) {
        boolean z;
        if (list.isEmpty() && fallbackStrategy == FallbackStrategy.f11703a) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "No preferred quality and fallback strategy.");
        this.f11724a = Collections.unmodifiableList(new ArrayList(list));
        this.f11725b = fallbackStrategy;
    }

    /* renamed from: b */
    public static void m62462b(Quality quality) {
        boolean m62466a = Quality.m62466a(quality);
        Preconditions.checkArgument(m62466a, "Invalid quality: " + quality);
    }

    /* renamed from: c */
    public static void m62461c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Quality quality = (Quality) it.next();
            boolean m62466a = Quality.m62466a(quality);
            Preconditions.checkArgument(m62466a, "qualities contain invalid quality: " + quality);
        }
    }

    /* renamed from: e */
    public static Size m62459e(VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile = videoValidatedEncoderProfilesProxy.getDefaultVideoProfile();
        return new Size(defaultVideoProfile.getWidth(), defaultVideoProfile.getHeight());
    }

    @NonNull
    public static QualitySelector from(@NonNull Quality quality) {
        return from(quality, FallbackStrategy.f11703a);
    }

    @NonNull
    public static QualitySelector fromOrderedList(@NonNull List<Quality> list) {
        return fromOrderedList(list, FallbackStrategy.f11703a);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Map<Quality, Size> getQualityToResolutionMap(@NonNull VideoCapabilities videoCapabilities, @NonNull DynamicRange dynamicRange) {
        HashMap hashMap = new HashMap();
        for (Quality quality : videoCapabilities.getSupportedQualities(dynamicRange)) {
            VideoValidatedEncoderProfilesProxy profiles = videoCapabilities.getProfiles(quality, dynamicRange);
            Objects.requireNonNull(profiles);
            hashMap.put(quality, m62459e(profiles));
        }
        return hashMap;
    }

    @Nullable
    public static Size getResolution(@NonNull CameraInfo cameraInfo, @NonNull Quality quality) {
        m62462b(quality);
        VideoValidatedEncoderProfilesProxy profiles = Recorder.getVideoCapabilities(cameraInfo).getProfiles(quality, DynamicRange.SDR);
        if (profiles != null) {
            return m62459e(profiles);
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
    public final void m62463a(List list, Set set) {
        Quality mo62216a;
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        Logger.m63178d("QualitySelector", "Select quality by fallbackStrategy = " + this.f11725b);
        FallbackStrategy fallbackStrategy = this.f11725b;
        if (fallbackStrategy == FallbackStrategy.f11703a) {
            return;
        }
        Preconditions.checkState(fallbackStrategy instanceof FallbackStrategy.AbstractC2576b, "Currently only support type RuleStrategy");
        FallbackStrategy.AbstractC2576b abstractC2576b = (FallbackStrategy.AbstractC2576b) this.f11725b;
        List m62465b = Quality.m62465b();
        boolean z = false;
        if (abstractC2576b.mo62216a() == Quality.HIGHEST) {
            mo62216a = (Quality) m62465b.get(0);
        } else if (abstractC2576b.mo62216a() == Quality.LOWEST) {
            mo62216a = (Quality) m62465b.get(m62465b.size() - 1);
        } else {
            mo62216a = abstractC2576b.mo62216a();
        }
        int indexOf = m62465b.indexOf(mo62216a);
        if (indexOf != -1) {
            z = true;
        }
        Preconditions.checkState(z);
        ArrayList arrayList = new ArrayList();
        for (int i = indexOf - 1; i >= 0; i--) {
            Quality quality = (Quality) m62465b.get(i);
            if (list.contains(quality)) {
                arrayList.add(quality);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = indexOf + 1; i2 < m62465b.size(); i2++) {
            Quality quality2 = (Quality) m62465b.get(i2);
            if (list.contains(quality2)) {
                arrayList2.add(quality2);
            }
        }
        Logger.m63178d("QualitySelector", "sizeSortedQualities = " + m62465b + ", fallback quality = " + mo62216a + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int mo62215b = abstractC2576b.mo62215b();
        if (mo62215b != 0) {
            if (mo62215b != 1) {
                if (mo62215b != 2) {
                    if (mo62215b != 3) {
                        if (mo62215b == 4) {
                            set.addAll(arrayList2);
                            return;
                        }
                        throw new AssertionError("Unhandled fallback strategy: " + this.f11725b);
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
    public List m62460d(List list) {
        if (list.isEmpty()) {
            Logger.m63171w("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        Logger.m63178d("QualitySelector", "supportedQualities = " + list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = this.f11724a.iterator();
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
                Logger.m63171w("QualitySelector", "quality is not supported and will be ignored: " + quality);
            }
        }
        m62463a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    @NonNull
    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f11724a + ", fallbackStrategy=" + this.f11725b + "}";
    }

    @NonNull
    public static QualitySelector from(@NonNull Quality quality, @NonNull FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(quality, "quality cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        m62462b(quality);
        return new QualitySelector(Collections.singletonList(quality), fallbackStrategy);
    }

    @NonNull
    public static QualitySelector fromOrderedList(@NonNull List<Quality> list, @NonNull FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(list, "qualities cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        Preconditions.checkArgument(!list.isEmpty(), "qualities cannot be empty");
        m62461c(list);
        return new QualitySelector(list, fallbackStrategy);
    }
}