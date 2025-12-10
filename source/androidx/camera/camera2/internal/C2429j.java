package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.DoNotInline;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraMode;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.j */
/* loaded from: classes.dex */
public final class C2429j {

    /* renamed from: g */
    public final String f10675g;

    /* renamed from: h */
    public final InterfaceC13944sh f10676h;

    /* renamed from: i */
    public final CameraCharacteristicsCompat f10677i;

    /* renamed from: j */
    public final ExtraSupportedSurfaceCombinationsContainer f10678j;

    /* renamed from: k */
    public final int f10679k;

    /* renamed from: l */
    public boolean f10680l;

    /* renamed from: m */
    public boolean f10681m;

    /* renamed from: n */
    public boolean f10682n;

    /* renamed from: o */
    public boolean f10683o;

    /* renamed from: p */
    public boolean f10684p;

    /* renamed from: q */
    public SurfaceSizeDefinition f10685q;

    /* renamed from: s */
    public final DisplayInfoManager f10687s;

    /* renamed from: v */
    public final C0172CL f10690v;

    /* renamed from: a */
    public final List f10669a = new ArrayList();

    /* renamed from: b */
    public final List f10670b = new ArrayList();

    /* renamed from: c */
    public final List f10671c = new ArrayList();

    /* renamed from: d */
    public final Map f10672d = new HashMap();

    /* renamed from: e */
    public final List f10673e = new ArrayList();

    /* renamed from: f */
    public final List f10674f = new ArrayList();

    /* renamed from: r */
    public List f10686r = new ArrayList();

    /* renamed from: t */
    public final TargetAspectRatio f10688t = new TargetAspectRatio();

    /* renamed from: u */
    public final ResolutionCorrector f10689u = new ResolutionCorrector();

    /* renamed from: androidx.camera.camera2.internal.j$a */
    /* loaded from: classes.dex */
    public static class C2430a {
        @DoNotInline
        /* renamed from: a */
        public static Size[] m63395a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.j$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2431b {
        /* renamed from: c */
        public static AbstractC2431b m63392c(int i, int i2) {
            return new C2373c(i, i2);
        }

        /* renamed from: a */
        public abstract int mo63394a();

        /* renamed from: b */
        public abstract int mo63393b();
    }

    public C2429j(Context context, String str, CameraManagerCompat cameraManagerCompat, InterfaceC13944sh interfaceC13944sh) {
        int i;
        this.f10680l = false;
        this.f10681m = false;
        this.f10682n = false;
        this.f10683o = false;
        this.f10684p = false;
        String str2 = (String) Preconditions.checkNotNull(str);
        this.f10675g = str2;
        this.f10676h = (InterfaceC13944sh) Preconditions.checkNotNull(interfaceC13944sh);
        this.f10678j = new ExtraSupportedSurfaceCombinationsContainer();
        this.f10687s = DisplayInfoManager.getInstance(context);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str2);
            this.f10677i = cameraCharacteristicsCompat;
            Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            this.f10679k = i;
            int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 3) {
                        this.f10680l = true;
                    } else if (i2 == 6) {
                        this.f10681m = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i2 == 16) {
                        this.f10684p = true;
                    }
                }
            }
            C0172CL c0172cl = new C0172CL(this.f10677i);
            this.f10690v = c0172cl;
            m63412j();
            if (this.f10684p) {
                m63410l();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f10682n = hasSystemFeature;
            if (hasSystemFeature) {
                m63414h();
            }
            if (c0172cl.m68783d()) {
                m63415g();
            }
            boolean isStreamUseCaseSupported = StreamUseCaseUtil.isStreamUseCaseSupported(this.f10677i);
            this.f10683o = isStreamUseCaseSupported;
            if (isStreamUseCaseSupported) {
                m63413i();
            }
            m63411k();
            m63420b();
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    /* renamed from: d */
    public static Range m63418d(Range range, Range range2, Range range3) {
        double m63402t = m63402t(range2.intersect(range));
        double m63402t2 = m63402t(range3.intersect(range));
        double m63402t3 = m63402t2 / m63402t(range3);
        double m63402t4 = m63402t / m63402t(range2);
        int i = (m63402t2 > m63402t ? 1 : (m63402t2 == m63402t ? 0 : -1));
        if (i > 0) {
            if (m63402t3 >= 0.5d || m63402t3 >= m63402t4) {
                return range3;
            }
        } else if (i == 0) {
            int i2 = (m63402t3 > m63402t4 ? 1 : (m63402t3 == m63402t4 ? 0 : -1));
            if (i2 > 0) {
                return range3;
            }
            if (i2 == 0 && ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue()) {
                return range3;
            }
        } else if (m63402t4 < 0.5d && m63402t3 > m63402t4) {
            return range3;
        }
        return range2;
    }

    /* renamed from: o */
    public static int m63407o(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: s */
    public static int m63403s(Range range, Range range2) {
        boolean z;
        if (!range.contains((Range) ((Integer) range2.getUpper())) && !range.contains((Range) ((Integer) range2.getLower()))) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Ranges must not intersect");
        if (((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue()) {
            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue();
        }
        return ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    /* renamed from: t */
    public static int m63402t(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    /* renamed from: x */
    public static int m63398x(Map map) {
        for (DynamicRange dynamicRange : map.values()) {
            if (dynamicRange.getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    /* renamed from: A */
    public final Pair m63433A(int i, List list, List list2, List list3, List list4, int i2, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) it.next();
            arrayList.add(attachedSurfaceInfo.getSurfaceConfig());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), attachedSurfaceInfo);
            }
        }
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Size size = (Size) list2.get(i3);
            UseCaseConfig useCaseConfig = (UseCaseConfig) list3.get(((Integer) list4.get(i3)).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(i, inputFormat, size, m63430D(inputFormat)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), useCaseConfig);
            }
            i2 = m63431C(i2, useCaseConfig.getInputFormat(), size);
        }
        return new Pair(arrayList, Integer.valueOf(i2));
    }

    /* renamed from: B */
    public final Range m63432B(List list, List list2, List list3) {
        Iterator it = list.iterator();
        Range range = null;
        while (it.hasNext()) {
            range = m63429E(((AttachedSurfaceInfo) it.next()).getTargetFrameRate(), range);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            range = m63429E(((UseCaseConfig) list2.get(((Integer) it2.next()).intValue())).getTargetFrameRate(null), range);
        }
        return range;
    }

    /* renamed from: C */
    public final int m63431C(int i, int i2, Size size) {
        return Math.min(i, m63407o(this.f10677i, i2, size));
    }

    /* renamed from: D */
    public SurfaceSizeDefinition m63430D(int i) {
        if (!this.f10686r.contains(Integer.valueOf(i))) {
            m63423K(this.f10685q.getS720pSizeMap(), SizeUtil.RESOLUTION_720P, i);
            m63423K(this.f10685q.getS1440pSizeMap(), SizeUtil.RESOLUTION_1440P, i);
            m63424J(this.f10685q.getMaximumSizeMap(), i);
            m63422L(this.f10685q.getUltraMaximumSizeMap(), i);
            this.f10686r.add(Integer.valueOf(i));
        }
        return this.f10685q;
    }

    /* renamed from: E */
    public final Range m63429E(Range range, Range range2) {
        if (range2 != null) {
            if (range != null) {
                try {
                    return range2.intersect(range);
                } catch (IllegalArgumentException unused) {
                }
            }
            return range2;
        }
        return range;
    }

    /* renamed from: F */
    public final List m63428F(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int surfaceOccupancyPriority = ((UseCaseConfig) it.next()).getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer num : arrayList2) {
            int intValue = num.intValue();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                UseCaseConfig useCaseConfig = (UseCaseConfig) it2.next();
                if (intValue == useCaseConfig.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(useCaseConfig)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    public final boolean m63427G(AbstractC2431b abstractC2431b, List list, Map map) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AttachedSurfaceInfo) it.next()).getSurfaceConfig());
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        for (UseCaseConfig useCaseConfig : map.keySet()) {
            List list2 = (List) map.get(useCaseConfig);
            if (list2 != null && !list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "No available output size is found for " + useCaseConfig + ".");
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(abstractC2431b.mo63394a(), inputFormat, (Size) Collections.min(list2, compareSizesByArea), m63430D(inputFormat)));
        }
        return m63419c(abstractC2431b, arrayList);
    }

    /* renamed from: H */
    public final void m63426H() {
        this.f10687s.m63780e();
        if (this.f10685q == null) {
            m63411k();
            return;
        }
        this.f10685q = SurfaceSizeDefinition.create(this.f10685q.getAnalysisSize(), this.f10685q.getS720pSizeMap(), this.f10687s.m63781d(), this.f10685q.getS1440pSizeMap(), this.f10685q.getRecordSize(), this.f10685q.getMaximumSizeMap(), this.f10685q.getUltraMaximumSizeMap());
    }

    /* renamed from: I */
    public SurfaceConfig m63425I(int i, int i2, Size size) {
        return SurfaceConfig.transformSurfaceConfig(i, i2, size, m63430D(i2));
    }

    /* renamed from: J */
    public final void m63424J(Map map, int i) {
        Size m63406p = m63406p(this.f10677i.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i, true);
        if (m63406p != null) {
            map.put(Integer.valueOf(i), m63406p);
        }
    }

    /* renamed from: K */
    public final void m63423K(Map map, Size size, int i) {
        if (!this.f10682n) {
            return;
        }
        Size m63406p = m63406p(this.f10677i.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i, false);
        Integer valueOf = Integer.valueOf(i);
        if (m63406p != null) {
            size = (Size) Collections.min(Arrays.asList(size, m63406p), new CompareSizesByArea());
        }
        map.put(valueOf, size);
    }

    /* renamed from: L */
    public final void m63422L(Map map, int i) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 31 && this.f10684p) {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = this.f10677i;
            key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.get(key);
            if (streamConfigurationMap == null) {
                return;
            }
            map.put(Integer.valueOf(i), m63406p(streamConfigurationMap, i, true));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public List m63421a(List list, int i) {
        Rational rational;
        int i2 = this.f10688t.get(this.f10675g, this.f10677i);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    rational = null;
                } else {
                    Size maximumSize = m63430D(256).getMaximumSize(256);
                    rational = new Rational(maximumSize.getWidth(), maximumSize.getHeight());
                }
            } else {
                rational = AspectRatioUtil.ASPECT_RATIO_16_9;
            }
        } else {
            rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f10689u.insertOrPrioritize(SurfaceConfig.getConfigType(i), list);
    }

    /* renamed from: b */
    public final void m63420b() {
    }

    /* renamed from: c */
    public boolean m63419c(AbstractC2431b abstractC2431b, List list) {
        boolean z = false;
        for (SurfaceCombination surfaceCombination : m63396z(abstractC2431b)) {
            if (surfaceCombination.getOrderedSupportedSurfaceConfigList(list) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final AbstractC2431b m63417e(int i, Map map) {
        int m63398x = m63398x(map);
        if (i != 0 && m63398x == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f10675g, CameraMode.toLabelString(i)));
        }
        return AbstractC2431b.m63392c(i, m63398x);
    }

    /* renamed from: f */
    public final Map m63416f(Map map, AbstractC2431b abstractC2431b, Range range) {
        int i;
        HashMap hashMap = new HashMap();
        for (UseCaseConfig useCaseConfig : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            for (Size size : (List) map.get(useCaseConfig)) {
                int inputFormat = useCaseConfig.getInputFormat();
                SurfaceConfig.ConfigSize configSize = SurfaceConfig.transformSurfaceConfig(abstractC2431b.mo63394a(), inputFormat, size, m63430D(inputFormat)).getConfigSize();
                if (range != null) {
                    i = m63407o(this.f10677i, inputFormat, size);
                } else {
                    i = Integer.MAX_VALUE;
                }
                Set set = (Set) hashMap2.get(configSize);
                if (set == null) {
                    set = new HashSet();
                    hashMap2.put(configSize, set);
                }
                if (!set.contains(Integer.valueOf(i))) {
                    arrayList.add(size);
                    set.add(Integer.valueOf(i));
                }
            }
            hashMap.put(useCaseConfig, arrayList);
        }
        return hashMap;
    }

    /* renamed from: g */
    public final void m63415g() {
        this.f10673e.addAll(GuaranteedConfigurationsUtil.get10BitSupportedCombinationList());
    }

    /* renamed from: h */
    public final void m63414h() {
        this.f10671c.addAll(GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList());
    }

    /* renamed from: i */
    public final void m63413i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f10674f.addAll(GuaranteedConfigurationsUtil.getStreamUseCaseSupportedCombinationList());
        }
    }

    /* renamed from: j */
    public final void m63412j() {
        this.f10669a.addAll(GuaranteedConfigurationsUtil.generateSupportedCombinationList(this.f10679k, this.f10680l, this.f10681m));
        this.f10669a.addAll(this.f10678j.get(this.f10675g, this.f10679k));
    }

    /* renamed from: k */
    public final void m63411k() {
        this.f10685q = SurfaceSizeDefinition.create(SizeUtil.RESOLUTION_VGA, new HashMap(), this.f10687s.m63781d(), new HashMap(), m63401u(), new HashMap(), new HashMap());
    }

    /* renamed from: l */
    public final void m63410l() {
        this.f10670b.addAll(GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList());
    }

    /* renamed from: m */
    public final List m63409m(List list) {
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i *= ((List) it.next()).size();
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new ArrayList());
            }
            int size = i / ((List) list.get(0)).size();
            int i3 = i;
            for (int i4 = 0; i4 < list.size(); i4++) {
                List list2 = (List) list.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    ((List) arrayList.get(i5)).add((Size) list2.get((i5 % i3) / size));
                }
                if (i4 < list.size() - 1) {
                    i3 = size;
                    size /= ((List) list.get(i4 + 1)).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    /* renamed from: n */
    public final Range m63408n(Range range, int i) {
        if (range != null) {
            Range<Integer> range2 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            if (!range.equals(range2)) {
                Range<Integer>[] rangeArr = (Range[]) this.f10677i.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return range2;
                }
                Range<Integer> range3 = new Range<>(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i)));
                int i2 = 0;
                for (Range<Integer> range4 : rangeArr) {
                    if (i >= range4.getLower().intValue()) {
                        if (range2.equals(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                            range2 = range4;
                        }
                        if (range4.equals(range3)) {
                            return range4;
                        }
                        try {
                            int m63402t = m63402t(range4.intersect(range3));
                            if (i2 == 0) {
                                i2 = m63402t;
                            } else {
                                if (m63402t >= i2) {
                                    range2 = m63418d(range3, range2, range4);
                                    i2 = m63402t(range3.intersect(range2));
                                }
                                range4 = range2;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (i2 == 0) {
                                if (m63403s(range4, range3) >= m63403s(range2, range3)) {
                                    if (m63403s(range4, range3) == m63403s(range2, range3)) {
                                        if (range4.getLower().intValue() <= range2.getUpper().intValue() && m63402t(range4) >= m63402t(range2)) {
                                        }
                                    }
                                }
                            }
                        }
                        range2 = range4;
                    }
                }
                return range2;
            }
        }
        return StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    }

    /* renamed from: p */
    public final Size m63406p(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] outputSizes;
        Size[] m63395a;
        if (i == 34) {
            outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(i);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
            Size size = (Size) Collections.max(Arrays.asList(outputSizes), compareSizesByArea);
            Size size2 = SizeUtil.RESOLUTION_ZERO;
            if (Build.VERSION.SDK_INT >= 23 && z && (m63395a = C2430a.m63395a(streamConfigurationMap, i)) != null && m63395a.length > 0) {
                size2 = (Size) Collections.max(Arrays.asList(m63395a), compareSizesByArea);
            }
            return (Size) Collections.max(Arrays.asList(size, size2), compareSizesByArea);
        }
        return null;
    }

    /* renamed from: q */
    public final int m63405q(List list) {
        Iterator it = list.iterator();
        int i = Integer.MAX_VALUE;
        while (it.hasNext()) {
            AttachedSurfaceInfo attachedSurfaceInfo = (AttachedSurfaceInfo) it.next();
            i = m63431C(i, attachedSurfaceInfo.getImageFormat(), attachedSurfaceInfo.getSize());
        }
        return i;
    }

    /* renamed from: r */
    public List m63404r(AbstractC2431b abstractC2431b, List list) {
        if (!StreamUseCaseUtil.shouldUseStreamUseCase(abstractC2431b)) {
            return null;
        }
        for (SurfaceCombination surfaceCombination : this.f10674f) {
            List<SurfaceConfig> orderedSupportedSurfaceConfigList = surfaceCombination.getOrderedSupportedSurfaceConfigList(list);
            if (orderedSupportedSurfaceConfigList != null) {
                return orderedSupportedSurfaceConfigList;
            }
        }
        return null;
    }

    /* renamed from: u */
    public final Size m63401u() {
        CamcorderProfile camcorderProfile;
        try {
            int parseInt = Integer.parseInt(this.f10675g);
            if (this.f10676h.mo22561b(parseInt, 1)) {
                camcorderProfile = this.f10676h.mo22562a(parseInt, 1);
            } else {
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            return m63400v(parseInt);
        } catch (NumberFormatException unused) {
            return m63399w();
        }
    }

    /* renamed from: v */
    public final Size m63400v(int i) {
        CamcorderProfile camcorderProfile;
        Size size = SizeUtil.RESOLUTION_480P;
        if (this.f10676h.mo22561b(i, 10)) {
            camcorderProfile = this.f10676h.mo22562a(i, 10);
        } else if (this.f10676h.mo22561b(i, 8)) {
            camcorderProfile = this.f10676h.mo22562a(i, 8);
        } else if (this.f10676h.mo22561b(i, 12)) {
            camcorderProfile = this.f10676h.mo22562a(i, 12);
        } else if (this.f10676h.mo22561b(i, 6)) {
            camcorderProfile = this.f10676h.mo22562a(i, 6);
        } else if (this.f10676h.mo22561b(i, 5)) {
            camcorderProfile = this.f10676h.mo22562a(i, 5);
        } else if (this.f10676h.mo22561b(i, 4)) {
            camcorderProfile = this.f10676h.mo22562a(i, 4);
        } else {
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        return size;
    }

    /* renamed from: w */
    public final Size m63399w() {
        Size[] outputSizes = this.f10677i.getStreamConfigurationMapCompat().toStreamConfigurationMap().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return SizeUtil.RESOLUTION_480P;
        }
        Arrays.sort(outputSizes, new CompareSizesByArea(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = SizeUtil.RESOLUTION_1080P;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return SizeUtil.RESOLUTION_480P;
    }

    /* renamed from: y */
    public Pair m63397y(int i, List list, Map map) {
        Map map2;
        HashMap hashMap;
        HashMap hashMap2;
        Range range;
        List list2;
        Map map3;
        int i2;
        String str;
        String str2;
        Map map4;
        List list3;
        String str3;
        String str4;
        Map map5;
        Map map6;
        List list4;
        List list5;
        HashMap hashMap3;
        boolean z;
        int i3;
        int i4;
        int i5;
        String str5;
        m63426H();
        List arrayList = new ArrayList(map.keySet());
        List<Integer> m63428F = m63428F(arrayList);
        Map m68780g = this.f10690v.m68780g(list, arrayList, m63428F);
        AbstractC2431b m63417e = m63417e(i, m68780g);
        boolean m63427G = m63427G(m63417e, list, map);
        String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        String str7 = " New configs: ";
        String str8 = "No supported surface combination is found for camera device - Id : ";
        if (m63427G) {
            Range m63432B = m63432B(list, arrayList, m63428F);
            Map m63416f = m63416f(map, m63417e, m63432B);
            List arrayList2 = new ArrayList();
            for (Integer num : m63428F) {
                UseCaseConfig useCaseConfig = (UseCaseConfig) arrayList.get(num.intValue());
                arrayList2.add(m63421a((List) m63416f.get(useCaseConfig), useCaseConfig.getInputFormat()));
            }
            List m63409m = m63409m(arrayList2);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            Map hashMap6 = new HashMap();
            Map hashMap7 = new HashMap();
            boolean containsZslUseCase = StreamUseCaseUtil.containsZslUseCase(list, arrayList);
            int m63405q = m63405q(list);
            Map map7 = hashMap7;
            Range range2 = null;
            if (this.f10683o && !containsZslUseCase) {
                Iterator it = m63409m.iterator();
                List list6 = null;
                while (true) {
                    if (it.hasNext()) {
                        Map map8 = map7;
                        Map map9 = hashMap6;
                        hashMap = hashMap5;
                        hashMap2 = hashMap4;
                        map3 = m68780g;
                        Range range3 = m63432B;
                        List list7 = m63428F;
                        range = range3;
                        str = str8;
                        int i6 = m63405q;
                        i2 = m63405q;
                        str2 = str7;
                        list2 = m63428F;
                        str5 = str6;
                        list6 = m63404r(m63417e, (List) m63433A(i, list, (List) it.next(), arrayList, list7, i6, map9, map8).first);
                        map2 = map9;
                        map4 = map8;
                        if (list6 != null && !StreamUseCaseUtil.areCaptureTypesEligible(map2, map4, list6)) {
                            list6 = null;
                        }
                        if (list6 != null) {
                            if (StreamUseCaseUtil.areStreamUseCasesAvailableForSurfaceConfigs(this.f10677i, list6)) {
                                break;
                            }
                            list6 = null;
                        }
                        map2.clear();
                        map4.clear();
                        map7 = map4;
                        hashMap6 = map2;
                        str6 = str5;
                        str8 = str;
                        str7 = str2;
                        m68780g = map3;
                        hashMap5 = hashMap;
                        hashMap4 = hashMap2;
                        m63432B = range;
                        m63405q = i2;
                        m63428F = list2;
                    } else {
                        hashMap = hashMap5;
                        hashMap2 = hashMap4;
                        range = m63432B;
                        list2 = m63428F;
                        map3 = m68780g;
                        i2 = m63405q;
                        str = str8;
                        str2 = str7;
                        str5 = str6;
                        map4 = map7;
                        map2 = hashMap6;
                        break;
                    }
                }
                if (list6 == null && !m63427G) {
                    throw new IllegalArgumentException(str + this.f10675g + str5 + list + str2 + arrayList);
                }
                list3 = list6;
            } else {
                map2 = hashMap6;
                hashMap = hashMap5;
                hashMap2 = hashMap4;
                range = m63432B;
                list2 = m63428F;
                map3 = m68780g;
                i2 = m63405q;
                str = "No supported surface combination is found for camera device - Id : ";
                str2 = " New configs: ";
                map4 = map7;
                list3 = null;
            }
            Iterator it2 = m63409m.iterator();
            List list8 = null;
            List list9 = null;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MAX_VALUE;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (it2.hasNext()) {
                    List list10 = (List) it2.next();
                    int i9 = i7;
                    int i10 = i8;
                    str4 = str2;
                    map5 = map4;
                    str3 = str;
                    map6 = map2;
                    Pair m63433A = m63433A(i, list, list10, arrayList, list2, i2, null, null);
                    List list11 = (List) m63433A.first;
                    i8 = ((Integer) m63433A.second).intValue();
                    int i11 = i2;
                    if (range != null && i11 > i8 && i8 < ((Integer) range.getLower()).intValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z2 && m63419c(m63417e, list11)) {
                        i3 = i10;
                        i4 = Integer.MAX_VALUE;
                        if (i3 == Integer.MAX_VALUE || i3 < i8) {
                            i3 = i8;
                            list8 = list10;
                        }
                        if (z) {
                            if (z3) {
                                list5 = list9;
                                list4 = list10;
                                i7 = i9;
                                break;
                            }
                            i3 = i8;
                            list8 = list10;
                            z2 = true;
                        }
                    } else {
                        i3 = i10;
                        i4 = Integer.MAX_VALUE;
                    }
                    if (list3 != null && !z3 && m63404r(m63417e, list11) != null) {
                        i5 = i9;
                        if (i5 == i4 || i5 < i8) {
                            i5 = i8;
                            list9 = list10;
                        }
                        if (!z) {
                            continue;
                        } else if (z2) {
                            i7 = i8;
                            i8 = i3;
                            list4 = list8;
                            list5 = list10;
                            break;
                        } else {
                            i5 = i8;
                            list9 = list10;
                            z3 = true;
                        }
                    } else {
                        i5 = i9;
                    }
                    i7 = i5;
                    i2 = i11;
                    i8 = i3;
                    map2 = map6;
                    map4 = map5;
                    str = str3;
                    str2 = str4;
                } else {
                    str3 = str;
                    str4 = str2;
                    map5 = map4;
                    map6 = map2;
                    list4 = list8;
                    list5 = list9;
                    break;
                }
            }
            if (list4 != null) {
                if (range != null) {
                    range2 = m63408n(range, i8);
                }
                Range range4 = range2;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    UseCaseConfig useCaseConfig2 = (UseCaseConfig) it3.next();
                    List list12 = list2;
                    Map map10 = map3;
                    Iterator it4 = it3;
                    StreamSpec.Builder implementationOptions = StreamSpec.builder((Size) list4.get(list12.indexOf(Integer.valueOf(arrayList.indexOf(useCaseConfig2))))).setDynamicRange((DynamicRange) Preconditions.checkNotNull((DynamicRange) map10.get(useCaseConfig2))).setImplementationOptions(StreamUseCaseUtil.getStreamSpecImplementationOptions(useCaseConfig2));
                    if (range4 != null) {
                        implementationOptions.setExpectedFrameRateRange(range4);
                    }
                    hashMap.put(useCaseConfig2, implementationOptions.build());
                    it3 = it4;
                    list2 = list12;
                    map3 = map10;
                }
                HashMap hashMap8 = hashMap;
                if (list3 != null && i8 == i7 && list4.size() == list5.size()) {
                    for (int i12 = 0; i12 < list4.size(); i12++) {
                        if (((Size) list4.get(i12)).equals(list5.get(i12))) {
                        }
                    }
                    hashMap3 = hashMap2;
                    if (!StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithInteropOverride(this.f10677i, list, hashMap8, hashMap3)) {
                        StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(hashMap8, hashMap3, map6, map5, list3);
                    }
                    return new Pair(hashMap8, hashMap3);
                }
                hashMap3 = hashMap2;
                return new Pair(hashMap8, hashMap3);
            }
            throw new IllegalArgumentException(str3 + this.f10675g + " and Hardware level: " + this.f10679k + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str4 + arrayList);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f10675g + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
    }

    /* renamed from: z */
    public final List m63396z(AbstractC2431b abstractC2431b) {
        if (this.f10672d.containsKey(abstractC2431b)) {
            return (List) this.f10672d.get(abstractC2431b);
        }
        List arrayList = new ArrayList();
        if (abstractC2431b.mo63393b() == 8) {
            int mo63394a = abstractC2431b.mo63394a();
            if (mo63394a != 1) {
                if (mo63394a != 2) {
                    arrayList.addAll(this.f10669a);
                } else {
                    arrayList.addAll(this.f10670b);
                    arrayList.addAll(this.f10669a);
                }
            } else {
                arrayList = this.f10671c;
            }
        } else if (abstractC2431b.mo63393b() == 10 && abstractC2431b.mo63394a() == 0) {
            arrayList.addAll(this.f10673e);
        }
        this.f10672d.put(abstractC2431b, arrayList);
        return arrayList;
    }
}
