package p000;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: eP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C19692eP1 {

    /* renamed from: a */
    public final CameraInfoInternal f61499a;

    /* renamed from: b */
    public final int f61500b;

    /* renamed from: c */
    public final int f61501c;

    /* renamed from: d */
    public final Rational f61502d;

    /* renamed from: e */
    public final boolean f61503e;

    /* renamed from: f */
    public final C19864fP1 f61504f;

    public C19692eP1(CameraInfoInternal cameraInfoInternal, Size size) {
        Rational m31556i;
        this.f61499a = cameraInfoInternal;
        this.f61500b = cameraInfoInternal.getSensorRotationDegrees();
        this.f61501c = cameraInfoInternal.getLensFacing();
        if (size != null) {
            m31556i = m31557h(size);
        } else {
            m31556i = m31556i(cameraInfoInternal);
        }
        this.f61502d = m31556i;
        boolean z = true;
        if (m31556i != null && m31556i.getNumerator() < m31556i.getDenominator()) {
            z = false;
        }
        this.f61503e = z;
        this.f61504f = new C19864fP1(cameraInfoInternal, m31556i);
    }

    /* renamed from: d */
    public static void m31561d(LinkedHashMap linkedHashMap, Size size) {
        int area = SizeUtil.getArea(size);
        for (Rational rational : linkedHashMap.keySet()) {
            List<Size> list = (List) linkedHashMap.get(rational);
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (SizeUtil.getArea(size2) <= area) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    /* renamed from: f */
    public static void m31559f(LinkedHashMap linkedHashMap, ResolutionStrategy resolutionStrategy) {
        if (resolutionStrategy == null) {
            return;
        }
        for (Rational rational : linkedHashMap.keySet()) {
            m31558g((List) linkedHashMap.get(rational), resolutionStrategy);
        }
    }

    /* renamed from: g */
    public static void m31558g(List list, ResolutionStrategy resolutionStrategy) {
        if (list.isEmpty()) {
            return;
        }
        int fallbackRule = resolutionStrategy.getFallbackRule();
        if (resolutionStrategy.equals(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY)) {
            return;
        }
        Size boundSize = resolutionStrategy.getBoundSize();
        if (fallbackRule != 0) {
            if (fallbackRule != 1) {
                if (fallbackRule != 2) {
                    if (fallbackRule != 3) {
                        if (fallbackRule == 4) {
                            m31547r(list, boundSize, false);
                            return;
                        }
                        return;
                    }
                    m31547r(list, boundSize, true);
                    return;
                }
                m31548q(list, boundSize, false);
                return;
            }
            m31548q(list, boundSize, true);
            return;
        }
        m31546s(list, boundSize);
    }

    /* renamed from: l */
    public static List m31553l(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AspectRatioUtil.ASPECT_RATIO_4_3);
        arrayList.add(AspectRatioUtil.ASPECT_RATIO_16_9);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (AspectRatioUtil.hasMatchingAspectRatio(size, (Rational) it2.next())) {
                            break;
                        }
                    } else {
                        arrayList.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static Rational m31551n(int i, boolean z) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    Logger.m63228e("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
                } else if (z) {
                    return AspectRatioUtil.ASPECT_RATIO_16_9;
                } else {
                    return AspectRatioUtil.ASPECT_RATIO_9_16;
                }
            } else if (z) {
                return AspectRatioUtil.ASPECT_RATIO_4_3;
            } else {
                return AspectRatioUtil.ASPECT_RATIO_3_4;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static Map m31550o(List list) {
        HashMap hashMap = new HashMap();
        for (Rational rational : m31553l(list)) {
            hashMap.put(rational, new ArrayList());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            for (Rational rational2 : hashMap.keySet()) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational2)) {
                    ((List) hashMap.get(rational2)).add(size);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: q */
    public static void m31548q(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* renamed from: r */
    public static void m31547r(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* renamed from: s */
    public static void m31546s(List list, Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    /* renamed from: a */
    public final LinkedHashMap m31564a(List list, AspectRatioStrategy aspectRatioStrategy) {
        return m31563b(m31550o(list), aspectRatioStrategy);
    }

    /* renamed from: b */
    public final LinkedHashMap m31563b(Map map, AspectRatioStrategy aspectRatioStrategy) {
        Rational m31551n = m31551n(aspectRatioStrategy.getPreferredAspectRatio(), this.f61503e);
        if (aspectRatioStrategy.getFallbackRule() == 0) {
            Rational m31551n2 = m31551n(aspectRatioStrategy.getPreferredAspectRatio(), this.f61503e);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational = (Rational) it.next();
                if (!rational.equals(m31551n2)) {
                    map.remove(rational);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(m31551n, this.f61502d));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational2 : arrayList) {
            linkedHashMap.put(rational2, (List) map.get(rational2));
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public final List m31562c(List list, ResolutionSelector resolutionSelector, int i) {
        if (resolutionSelector.getAllowedResolutionMode() == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(this.f61499a.getSupportedHighResolutions(i));
            Collections.sort(arrayList, new CompareSizesByArea(true));
            return arrayList;
        }
        return list;
    }

    /* renamed from: e */
    public final List m31560e(List list, ResolutionFilter resolutionFilter, int i) {
        if (resolutionFilter == null) {
            return list;
        }
        int surfaceRotationToDegrees = CameraOrientationUtil.surfaceRotationToDegrees(i);
        int i2 = this.f61500b;
        boolean z = true;
        if (this.f61501c != 1) {
            z = false;
        }
        List<Size> filter = resolutionFilter.filter(new ArrayList(list), CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, i2, z));
        if (list.containsAll(filter)) {
            return filter;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    /* renamed from: h */
    public final Rational m31557h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: i */
    public final Rational m31556i(CameraInfoInternal cameraInfoInternal) {
        List<Size> supportedResolutions = cameraInfoInternal.getSupportedResolutions(256);
        if (supportedResolutions.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(supportedResolutions, new CompareSizesByArea());
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: j */
    public final List m31555j(int i, ImageOutputConfig imageOutputConfig) {
        Size[] sizeArr;
        List<Pair<Integer, Size[]>> supportedResolutions = imageOutputConfig.getSupportedResolutions(null);
        if (supportedResolutions != null) {
            for (Pair<Integer, Size[]> pair : supportedResolutions) {
                if (((Integer) pair.first).intValue() == i) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    /* renamed from: k */
    public final List m31554k(UseCaseConfig useCaseConfig) {
        int inputFormat = useCaseConfig.getInputFormat();
        List<Size> m31555j = m31555j(inputFormat, (ImageOutputConfig) useCaseConfig);
        if (m31555j == null) {
            m31555j = this.f61499a.getSupportedResolutions(inputFormat);
        }
        ArrayList arrayList = new ArrayList(m31555j);
        Collections.sort(arrayList, new CompareSizesByArea(true));
        if (arrayList.isEmpty()) {
            Logger.m63223w("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + inputFormat + ".");
        }
        return arrayList;
    }

    /* renamed from: m */
    public List m31552m(UseCaseConfig useCaseConfig) {
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        List<Size> customOrderedResolutions = imageOutputConfig.getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null) {
            return customOrderedResolutions;
        }
        if (imageOutputConfig.getResolutionSelector(null) == null) {
            return this.f61504f.m31307f(m31554k(useCaseConfig), useCaseConfig);
        }
        return m31549p(useCaseConfig);
    }

    /* renamed from: p */
    public final List m31549p(UseCaseConfig useCaseConfig) {
        ResolutionSelector resolutionSelector = ((ImageOutputConfig) useCaseConfig).getResolutionSelector();
        List m31554k = m31554k(useCaseConfig);
        if (!useCaseConfig.isHigResolutionDisabled(false)) {
            m31554k = m31562c(m31554k, resolutionSelector, useCaseConfig.getInputFormat());
        }
        LinkedHashMap m31564a = m31564a(m31554k, resolutionSelector.getAspectRatioStrategy());
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        Size maxResolution = imageOutputConfig.getMaxResolution(null);
        if (maxResolution != null) {
            m31561d(m31564a, maxResolution);
        }
        m31559f(m31564a, resolutionSelector.getResolutionStrategy());
        ArrayList arrayList = new ArrayList();
        for (List<Size> list : m31564a.values()) {
            for (Size size : list) {
                if (!arrayList.contains(size)) {
                    arrayList.add(size);
                }
            }
        }
        return m31560e(arrayList, resolutionSelector.getResolutionFilter(), imageOutputConfig.getTargetRotation(0));
    }
}
