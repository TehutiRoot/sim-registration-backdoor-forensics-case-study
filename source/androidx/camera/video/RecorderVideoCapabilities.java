package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.ResolutionValidatedEncoderProfilesProvider;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider;
import androidx.core.util.Preconditions;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class RecorderVideoCapabilities implements VideoCapabilities {

    /* renamed from: a */
    public final EncoderProfilesProvider f11734a;

    /* renamed from: b */
    public final Map f11735b = new HashMap();

    /* renamed from: c */
    public final Map f11736c = new HashMap();

    /* renamed from: androidx.camera.video.RecorderVideoCapabilities$a */
    /* loaded from: classes.dex */
    public static class C2620a {

        /* renamed from: a */
        public final Map f11737a = new LinkedHashMap();

        /* renamed from: b */
        public final TreeMap f11738b = new TreeMap(new CompareSizesByArea());

        /* renamed from: c */
        public final VideoValidatedEncoderProfilesProxy f11739c;

        /* renamed from: d */
        public final VideoValidatedEncoderProfilesProxy f11740d;

        public C2620a(EncoderProfilesProvider encoderProfilesProvider) {
            for (Quality quality : Quality.m62517b()) {
                EncoderProfilesProxy m62373d = m62373d(quality, encoderProfilesProvider);
                if (m62373d != null) {
                    Logger.m63230d("RecorderVideoCapabilities", "profiles = " + m62373d);
                    VideoValidatedEncoderProfilesProxy m62369h = m62369h(m62373d);
                    if (m62369h == null) {
                        Logger.m63223w("RecorderVideoCapabilities", "EncoderProfiles of quality " + quality + " has no video validated profiles.");
                    } else {
                        EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile = m62369h.getDefaultVideoProfile();
                        this.f11738b.put(new Size(defaultVideoProfile.getWidth(), defaultVideoProfile.getHeight()), quality);
                        this.f11737a.put(quality, m62369h);
                    }
                }
            }
            if (this.f11737a.isEmpty()) {
                Logger.m63228e("RecorderVideoCapabilities", "No supported EncoderProfiles");
                this.f11740d = null;
                this.f11739c = null;
                return;
            }
            ArrayDeque arrayDeque = new ArrayDeque(this.f11737a.values());
            this.f11739c = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekFirst();
            this.f11740d = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekLast();
        }

        /* renamed from: a */
        public static void m62376a(Quality quality) {
            boolean m62518a = Quality.m62518a(quality);
            Preconditions.checkArgument(m62518a, "Unknown quality: " + quality);
        }

        /* renamed from: b */
        public VideoValidatedEncoderProfilesProxy m62375b(Size size) {
            Quality m62374c = m62374c(size);
            Logger.m63230d("RecorderVideoCapabilities", "Using supported quality of " + m62374c + " for size " + size);
            if (m62374c != Quality.f11633a) {
                VideoValidatedEncoderProfilesProxy m62372e = m62372e(m62374c);
                if (m62372e == null) {
                    throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
                }
                return m62372e;
            }
            return null;
        }

        /* renamed from: c */
        public Quality m62374c(Size size) {
            Map.Entry ceilingEntry = this.f11738b.ceilingEntry(size);
            if (ceilingEntry != null) {
                return (Quality) ceilingEntry.getValue();
            }
            Map.Entry floorEntry = this.f11738b.floorEntry(size);
            if (floorEntry != null) {
                return (Quality) floorEntry.getValue();
            }
            return Quality.f11633a;
        }

        /* renamed from: d */
        public final EncoderProfilesProxy m62373d(Quality quality, EncoderProfilesProvider encoderProfilesProvider) {
            Preconditions.checkState(quality instanceof Quality.AbstractC2605b, "Currently only support ConstantQuality");
            return encoderProfilesProvider.getAll(((Quality.AbstractC2605b) quality).mo62235d());
        }

        /* renamed from: e */
        public VideoValidatedEncoderProfilesProxy m62372e(Quality quality) {
            m62376a(quality);
            if (quality == Quality.HIGHEST) {
                return this.f11739c;
            }
            if (quality == Quality.LOWEST) {
                return this.f11740d;
            }
            return (VideoValidatedEncoderProfilesProxy) this.f11737a.get(quality);
        }

        /* renamed from: f */
        public List m62371f() {
            return new ArrayList(this.f11737a.keySet());
        }

        /* renamed from: g */
        public boolean m62370g(Quality quality) {
            m62376a(quality);
            if (m62372e(quality) != null) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public final VideoValidatedEncoderProfilesProxy m62369h(EncoderProfilesProxy encoderProfilesProxy) {
            if (encoderProfilesProxy.getVideoProfiles().isEmpty()) {
                return null;
            }
            return VideoValidatedEncoderProfilesProxy.from(encoderProfilesProxy);
        }
    }

    public RecorderVideoCapabilities(CameraInfoInternal cameraInfoInternal, Function function) {
        EncoderProfilesProvider encoderProfilesProvider = cameraInfoInternal.getEncoderProfilesProvider();
        this.f11734a = new QualityValidatedEncoderProfilesProvider(new ResolutionValidatedEncoderProfilesProvider(m62377h(cameraInfoInternal) ? new BackupHdrProfileEncoderProfilesProvider(encoderProfilesProvider, function) : encoderProfilesProvider, cameraInfoInternal.getCameraQuirks()), cameraInfoInternal, DeviceQuirks.getAll());
        for (DynamicRange dynamicRange : cameraInfoInternal.getSupportedDynamicRanges()) {
            C2620a c2620a = new C2620a(new DynamicRangeMatchedEncoderProfilesProvider(this.f11734a, dynamicRange));
            if (!c2620a.m62371f().isEmpty()) {
                this.f11735b.put(dynamicRange, c2620a);
            }
        }
    }

    /* renamed from: a */
    public static boolean m62384a(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(m62378g(dynamicRange2), "Fully specified range is not actually fully specified.");
        if (dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m62383b(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(m62378g(dynamicRange2), "Fully specified range is not actually fully specified.");
        int encoding = dynamicRange.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = dynamicRange2.getEncoding();
        if ((encoding == 2 && encoding2 != 1) || encoding == encoding2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m62382c(DynamicRange dynamicRange, Set set) {
        if (m62378g(dynamicRange)) {
            return set.contains(dynamicRange);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange2 = (DynamicRange) it.next();
            if (m62384a(dynamicRange, dynamicRange2) && m62383b(dynamicRange, dynamicRange2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static RecorderVideoCapabilities m62381d(CameraInfo cameraInfo) {
        return new RecorderVideoCapabilities((CameraInfoInternal) cameraInfo, BackupHdrProfileEncoderProfilesProvider.DEFAULT_VALIDATOR);
    }

    /* renamed from: g */
    public static boolean m62378g(DynamicRange dynamicRange) {
        if (dynamicRange.getEncoding() != 0 && dynamicRange.getEncoding() != 2 && dynamicRange.getBitDepth() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m62377h(CameraInfoInternal cameraInfoInternal) {
        for (DynamicRange dynamicRange : cameraInfoInternal.getSupportedDynamicRanges()) {
            Integer valueOf = Integer.valueOf(dynamicRange.getEncoding());
            int bitDepth = dynamicRange.getBitDepth();
            if (valueOf.equals(3) && bitDepth == 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final C2620a m62380e(DynamicRange dynamicRange) {
        if (!m62382c(dynamicRange, getSupportedDynamicRanges())) {
            return null;
        }
        return new C2620a(new DynamicRangeMatchedEncoderProfilesProvider(this.f11734a, dynamicRange));
    }

    /* renamed from: f */
    public final C2620a m62379f(DynamicRange dynamicRange) {
        if (m62378g(dynamicRange)) {
            return (C2620a) this.f11735b.get(dynamicRange);
        }
        if (this.f11736c.containsKey(dynamicRange)) {
            return (C2620a) this.f11736c.get(dynamicRange);
        }
        C2620a m62380e = m62380e(dynamicRange);
        this.f11736c.put(dynamicRange, m62380e);
        return m62380e;
    }

    @Override // androidx.camera.video.VideoCapabilities
    @Nullable
    public VideoValidatedEncoderProfilesProxy findHighestSupportedEncoderProfilesFor(@NonNull Size size, @NonNull DynamicRange dynamicRange) {
        C2620a m62379f = m62379f(dynamicRange);
        if (m62379f == null) {
            return null;
        }
        return m62379f.m62375b(size);
    }

    @Override // androidx.camera.video.VideoCapabilities
    @NonNull
    public Quality findHighestSupportedQualityFor(@NonNull Size size, @NonNull DynamicRange dynamicRange) {
        C2620a m62379f = m62379f(dynamicRange);
        if (m62379f == null) {
            return Quality.f11633a;
        }
        return m62379f.m62374c(size);
    }

    @Override // androidx.camera.video.VideoCapabilities
    @Nullable
    public VideoValidatedEncoderProfilesProxy getProfiles(@NonNull Quality quality, @NonNull DynamicRange dynamicRange) {
        C2620a m62379f = m62379f(dynamicRange);
        if (m62379f == null) {
            return null;
        }
        return m62379f.m62372e(quality);
    }

    @Override // androidx.camera.video.VideoCapabilities
    @NonNull
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return this.f11735b.keySet();
    }

    @Override // androidx.camera.video.VideoCapabilities
    @NonNull
    public List<Quality> getSupportedQualities(@NonNull DynamicRange dynamicRange) {
        C2620a m62379f = m62379f(dynamicRange);
        if (m62379f == null) {
            return new ArrayList();
        }
        return m62379f.m62371f();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isQualitySupported(@NonNull Quality quality, @NonNull DynamicRange dynamicRange) {
        C2620a m62379f = m62379f(dynamicRange);
        if (m62379f != null && m62379f.m62370g(quality)) {
            return true;
        }
        return false;
    }
}
