package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: DL */
/* loaded from: classes.dex */
public final class C0239DL {

    /* renamed from: a */
    public final CameraCharacteristicsCompat f994a;

    /* renamed from: b */
    public final DynamicRangesCompat f995b;

    /* renamed from: c */
    public final boolean f996c;

    /* renamed from: DL$a */
    /* loaded from: classes.dex */
    public static final class C0240a {
        @Nullable
        @DoNotInline
        /* renamed from: a */
        public static DynamicRange m68834a(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
            Long l = (Long) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l != null) {
                return DynamicRangeConversions.profileToDynamicRange(l.longValue());
            }
            return null;
        }
    }

    public C0239DL(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f994a = cameraCharacteristicsCompat;
        this.f995b = DynamicRangesCompat.fromCameraCharacteristics(cameraCharacteristicsCompat);
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (iArr[i] == 18) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f996c = z;
    }

    /* renamed from: a */
    public static boolean m68844a(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        if (dynamicRange.getEncoding() == 2 && dynamicRange2.getEncoding() == 1) {
            return false;
        }
        if (dynamicRange.getEncoding() != 2 && dynamicRange.getEncoding() != 0 && dynamicRange.getEncoding() != dynamicRange2.getEncoding()) {
            return false;
        }
        if (dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m68843b(DynamicRange dynamicRange, DynamicRange dynamicRange2, Set set) {
        if (!set.contains(dynamicRange2)) {
            Logger.m63178d("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", dynamicRange, dynamicRange2));
            return false;
        }
        return m68844a(dynamicRange, dynamicRange2);
    }

    /* renamed from: c */
    public static DynamicRange m68842c(DynamicRange dynamicRange, Collection collection, Set set) {
        if (dynamicRange.getEncoding() == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange2 = (DynamicRange) it.next();
            Preconditions.checkNotNull(dynamicRange2, "Fully specified DynamicRange cannot be null.");
            int encoding = dynamicRange2.getEncoding();
            Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified DynamicRange must have fully defined encoding.");
            if (encoding != 1 && m68843b(dynamicRange, dynamicRange2, set)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m68840e(DynamicRange dynamicRange) {
        return Objects.equals(dynamicRange, DynamicRange.UNSPECIFIED);
    }

    /* renamed from: f */
    public static boolean m68839f(DynamicRange dynamicRange) {
        if (dynamicRange.getEncoding() != 2 && ((dynamicRange.getEncoding() == 0 || dynamicRange.getBitDepth() != 0) && (dynamicRange.getEncoding() != 0 || dynamicRange.getBitDepth() == 0))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static void m68835j(Set set, DynamicRange dynamicRange, DynamicRangesCompat dynamicRangesCompat) {
        Preconditions.checkState(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<DynamicRange> dynamicRangeCaptureRequestConstraints = dynamicRangesCompat.getDynamicRangeCaptureRequestConstraints(dynamicRange);
        if (!dynamicRangeCaptureRequestConstraints.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            set.retainAll(dynamicRangeCaptureRequestConstraints);
            if (set.isEmpty()) {
                throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", dynamicRange, TextUtils.join("\n  ", dynamicRangeCaptureRequestConstraints), TextUtils.join("\n  ", hashSet)));
            }
        }
    }

    /* renamed from: d */
    public boolean m68841d() {
        return this.f996c;
    }

    /* renamed from: g */
    public Map m68838g(List list, List list2, List list3) {
        Set<DynamicRange> linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((AttachedSurfaceInfo) it.next()).getDynamicRange());
        }
        Set supportedDynamicRanges = this.f995b.getSupportedDynamicRanges();
        Set hashSet = new HashSet(supportedDynamicRanges);
        for (DynamicRange dynamicRange : linkedHashSet) {
            m68835j(hashSet, dynamicRange, this.f995b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            UseCaseConfig useCaseConfig = (UseCaseConfig) list2.get(((Integer) it2.next()).intValue());
            DynamicRange dynamicRange2 = useCaseConfig.getDynamicRange();
            if (m68840e(dynamicRange2)) {
                arrayList3.add(useCaseConfig);
            } else if (m68839f(dynamicRange2)) {
                arrayList2.add(useCaseConfig);
            } else {
                arrayList.add(useCaseConfig);
            }
        }
        HashMap hashMap = new HashMap();
        Set linkedHashSet2 = new LinkedHashSet();
        ArrayList<UseCaseConfig> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (UseCaseConfig useCaseConfig2 : arrayList4) {
            DynamicRange m68836i = m68836i(supportedDynamicRanges, linkedHashSet, linkedHashSet2, useCaseConfig2, hashSet);
            hashMap.put(useCaseConfig2, m68836i);
            if (!linkedHashSet.contains(m68836i)) {
                linkedHashSet2.add(m68836i);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public final DynamicRange m68837h(DynamicRange dynamicRange, Set set, Set set2, Set set3, String str) {
        DynamicRange dynamicRange2;
        String str2;
        if (dynamicRange.isFullySpecified()) {
            if (!set.contains(dynamicRange)) {
                return null;
            }
            return dynamicRange;
        }
        int encoding = dynamicRange.getEncoding();
        int bitDepth = dynamicRange.getBitDepth();
        if (encoding == 1 && bitDepth == 0) {
            DynamicRange dynamicRange3 = DynamicRange.SDR;
            if (!set.contains(dynamicRange3)) {
                return null;
            }
            return dynamicRange3;
        }
        DynamicRange m68842c = m68842c(dynamicRange, set2, set);
        if (m68842c != null) {
            Logger.m63178d("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, dynamicRange, m68842c));
            return m68842c;
        }
        DynamicRange m68842c2 = m68842c(dynamicRange, set3, set);
        if (m68842c2 != null) {
            Logger.m63178d("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, dynamicRange, m68842c2));
            return m68842c2;
        }
        DynamicRange dynamicRange4 = DynamicRange.SDR;
        if (m68843b(dynamicRange, dynamicRange4, set)) {
            Logger.m63178d("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, dynamicRange, dynamicRange4));
            return dynamicRange4;
        }
        if (encoding == 2 && (bitDepth == 10 || bitDepth == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                dynamicRange2 = C0240a.m68834a(this.f994a);
                if (dynamicRange2 != null) {
                    linkedHashSet.add(dynamicRange2);
                }
            } else {
                dynamicRange2 = null;
            }
            linkedHashSet.add(DynamicRange.HLG_10_BIT);
            DynamicRange m68842c3 = m68842c(dynamicRange, linkedHashSet, set);
            if (m68842c3 != null) {
                if (m68842c3.equals(dynamicRange2)) {
                    str2 = "recommended";
                } else {
                    str2 = "required";
                }
                Logger.m63178d("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, str2, dynamicRange, m68842c3));
                return m68842c3;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange5 = (DynamicRange) it.next();
            Preconditions.checkState(dynamicRange5.isFullySpecified(), "Candidate dynamic range must be fully specified.");
            if (!dynamicRange5.equals(DynamicRange.SDR) && m68844a(dynamicRange, dynamicRange5)) {
                Logger.m63178d("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, dynamicRange, dynamicRange5));
                return dynamicRange5;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final DynamicRange m68836i(Set set, Set set2, Set set3, UseCaseConfig useCaseConfig, Set set4) {
        DynamicRange dynamicRange = useCaseConfig.getDynamicRange();
        DynamicRange m68837h = m68837h(dynamicRange, set4, set2, set3, useCaseConfig.getTargetName());
        if (m68837h != null) {
            m68835j(set4, m68837h, this.f995b);
            return m68837h;
        }
        throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", useCaseConfig.getTargetName(), dynamicRange, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
    }
}