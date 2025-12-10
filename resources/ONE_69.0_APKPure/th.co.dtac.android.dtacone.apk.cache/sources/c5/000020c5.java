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
    public final EncoderProfilesProvider f11822a;

    /* renamed from: b */
    public final Map f11823b = new HashMap();

    /* renamed from: c */
    public final Map f11824c = new HashMap();

    /* renamed from: androidx.camera.video.RecorderVideoCapabilities$a */
    /* loaded from: classes.dex */
    public static class C2602a {

        /* renamed from: a */
        public final Map f11825a = new LinkedHashMap();

        /* renamed from: b */
        public final TreeMap f11826b = new TreeMap(new CompareSizesByArea());

        /* renamed from: c */
        public final VideoValidatedEncoderProfilesProxy f11827c;

        /* renamed from: d */
        public final VideoValidatedEncoderProfilesProxy f11828d;

        public C2602a(EncoderProfilesProvider encoderProfilesProvider) {
            for (Quality quality : Quality.m62465b()) {
                EncoderProfilesProxy m62321d = m62321d(quality, encoderProfilesProvider);
                if (m62321d != null) {
                    Logger.m63178d("RecorderVideoCapabilities", "profiles = " + m62321d);
                    VideoValidatedEncoderProfilesProxy m62317h = m62317h(m62321d);
                    if (m62317h == null) {
                        Logger.m63171w("RecorderVideoCapabilities", "EncoderProfiles of quality " + quality + " has no video validated profiles.");
                    } else {
                        EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile = m62317h.getDefaultVideoProfile();
                        this.f11826b.put(new Size(defaultVideoProfile.getWidth(), defaultVideoProfile.getHeight()), quality);
                        this.f11825a.put(quality, m62317h);
                    }
                }
            }
            if (this.f11825a.isEmpty()) {
                Logger.m63176e("RecorderVideoCapabilities", "No supported EncoderProfiles");
                this.f11828d = null;
                this.f11827c = null;
                return;
            }
            ArrayDeque arrayDeque = new ArrayDeque(this.f11825a.values());
            this.f11827c = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekFirst();
            this.f11828d = (VideoValidatedEncoderProfilesProxy) arrayDeque.peekLast();
        }

        /* renamed from: a */
        public static void m62324a(Quality quality) {
            boolean m62466a = Quality.m62466a(quality);
            Preconditions.checkArgument(m62466a, "Unknown quality: " + quality);
        }

        /* renamed from: b */
        public VideoValidatedEncoderProfilesProxy m62323b(Size size) {
            Quality m62322c = m62322c(size);
            Logger.m63178d("RecorderVideoCapabilities", "Using supported quality of " + m62322c + " for size " + size);
            if (m62322c != Quality.f11721a) {
                VideoValidatedEncoderProfilesProxy m62320e = m62320e(m62322c);
                if (m62320e == null) {
                    throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
                }
                return m62320e;
            }
            return null;
        }

        /* renamed from: c */
        public Quality m62322c(Size size) {
            Map.Entry ceilingEntry = this.f11826b.ceilingEntry(size);
            if (ceilingEntry != null) {
                return (Quality) ceilingEntry.getValue();
            }
            Map.Entry floorEntry = this.f11826b.floorEntry(size);
            if (floorEntry != null) {
                return (Quality) floorEntry.getValue();
            }
            return Quality.f11721a;
        }

        /* renamed from: d */
        public final EncoderProfilesProxy m62321d(Quality quality, EncoderProfilesProvider encoderProfilesProvider) {
            Preconditions.checkState(quality instanceof Quality.AbstractC2587b, "Currently only support ConstantQuality");
            return encoderProfilesProvider.getAll(((Quality.AbstractC2587b) quality).mo62183d());
        }

        /* renamed from: e */
        public VideoValidatedEncoderProfilesProxy m62320e(Quality quality) {
            m62324a(quality);
            if (quality == Quality.HIGHEST) {
                return this.f11827c;
            }
            if (quality == Quality.LOWEST) {
                return this.f11828d;
            }
            return (VideoValidatedEncoderProfilesProxy) this.f11825a.get(quality);
        }

        /* renamed from: f */
        public List m62319f() {
            return new ArrayList(this.f11825a.keySet());
        }

        /* renamed from: g */
        public boolean m62318g(Quality quality) {
            m62324a(quality);
            if (m62320e(quality) != null) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public final VideoValidatedEncoderProfilesProxy m62317h(EncoderProfilesProxy encoderProfilesProxy) {
            if (encoderProfilesProxy.getVideoProfiles().isEmpty()) {
                return null;
            }
            return VideoValidatedEncoderProfilesProxy.from(encoderProfilesProxy);
        }
    }

    public RecorderVideoCapabilities(CameraInfoInternal cameraInfoInternal, Function function) {
        EncoderProfilesProvider encoderProfilesProvider = cameraInfoInternal.getEncoderProfilesProvider();
        this.f11822a = new QualityValidatedEncoderProfilesProvider(new ResolutionValidatedEncoderProfilesProvider(m62325h(cameraInfoInternal) ? new BackupHdrProfileEncoderProfilesProvider(encoderProfilesProvider, function) : encoderProfilesProvider, cameraInfoInternal.getCameraQuirks()), cameraInfoInternal, DeviceQuirks.getAll());
        for (DynamicRange dynamicRange : cameraInfoInternal.getSupportedDynamicRanges()) {
            C2602a c2602a = new C2602a(new DynamicRangeMatchedEncoderProfilesProvider(this.f11822a, dynamicRange));
            if (!c2602a.m62319f().isEmpty()) {
                this.f11823b.put(dynamicRange, c2602a);
            }
        }
    }

    /* renamed from: a */
    public static boolean m62332a(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(m62326g(dynamicRange2), "Fully specified range is not actually fully specified.");
        if (dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m62331b(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(m62326g(dynamicRange2), "Fully specified range is not actually fully specified.");
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
    public static boolean m62330c(DynamicRange dynamicRange, Set set) {
        if (m62326g(dynamicRange)) {
            return set.contains(dynamicRange);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange2 = (DynamicRange) it.next();
            if (m62332a(dynamicRange, dynamicRange2) && m62331b(dynamicRange, dynamicRange2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static RecorderVideoCapabilities m62329d(CameraInfo cameraInfo) {
        return new RecorderVideoCapabilities((CameraInfoInternal) cameraInfo, BackupHdrProfileEncoderProfilesProvider.DEFAULT_VALIDATOR);
    }

    /* renamed from: g */
    public static boolean m62326g(DynamicRange dynamicRange) {
        if (dynamicRange.getEncoding() != 0 && dynamicRange.getEncoding() != 2 && dynamicRange.getBitDepth() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m62325h(CameraInfoInternal cameraInfoInternal) {
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
    public final C2602a m62328e(DynamicRange dynamicRange) {
        if (!m62330c(dynamicRange, getSupportedDynamicRanges())) {
            return null;
        }
        return new C2602a(new DynamicRangeMatchedEncoderProfilesProvider(this.f11822a, dynamicRange));
    }

    /* renamed from: f */
    public final C2602a m62327f(DynamicRange dynamicRange) {
        if (m62326g(dynamicRange)) {
            return (C2602a) this.f11823b.get(dynamicRange);
        }
        if (this.f11824c.containsKey(dynamicRange)) {
            return (C2602a) this.f11824c.get(dynamicRange);
        }
        C2602a m62328e = m62328e(dynamicRange);
        this.f11824c.put(dynamicRange, m62328e);
        return m62328e;
    }

    @Override // androidx.camera.video.VideoCapabilities
    @Nullable
    public VideoValidatedEncoderProfilesProxy findHighestSupportedEncoderProfilesFor(@NonNull Size size, @NonNull DynamicRange dynamicRange) {
        C2602a m62327f = m62327f(dynamicRange);
        if (m62327f == null) {
            return null;
        }
        return m62327f.m62323b(size);
    }

    @Override // androidx.camera.video.VideoCapabilities
    @NonNull
    public Quality findHighestSupportedQualityFor(@NonNull Size size, @NonNull DynamicRange dynamicRange) {
        C2602a m62327f = m62327f(dynamicRange);
        if (m62327f == null) {
            return Quality.f11721a;
        }
        return m62327f.m62322c(size);
    }

    @Override // androidx.camera.video.VideoCapabilities
    @Nullable
    public VideoValidatedEncoderProfilesProxy getProfiles(@NonNull Quality quality, @NonNull DynamicRange dynamicRange) {
        C2602a m62327f = m62327f(dynamicRange);
        if (m62327f == null) {
            return null;
        }
        return m62327f.m62320e(quality);
    }

    @Override // androidx.camera.video.VideoCapabilities
    @NonNull
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return this.f11823b.keySet();
    }

    @Override // androidx.camera.video.VideoCapabilities
    @NonNull
    public List<Quality> getSupportedQualities(@NonNull DynamicRange dynamicRange) {
        C2602a m62327f = m62327f(dynamicRange);
        if (m62327f == null) {
            return new ArrayList();
        }
        return m62327f.m62319f();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isQualitySupported(@NonNull Quality quality, @NonNull DynamicRange dynamicRange) {
        C2602a m62327f = m62327f(dynamicRange);
        if (m62327f != null && m62327f.m62318g(quality)) {
            return true;
        }
        return false;
    }
}