package p000;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C19864fP1 {

    /* renamed from: a */
    public final int f61808a;

    /* renamed from: b */
    public final int f61809b;

    /* renamed from: c */
    public final Rational f61810c;

    /* renamed from: d */
    public final boolean f61811d;

    public C19864fP1(CameraInfoInternal cameraInfoInternal, Rational rational) {
        this.f61808a = cameraInfoInternal.getSensorRotationDegrees();
        this.f61809b = cameraInfoInternal.getLensFacing();
        this.f61810c = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.f61811d = z;
    }

    /* renamed from: a */
    public static Size m31312a(Size size, int i, int i2, int i3) {
        if (size != null && m31308e(i, i2, i3)) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    /* renamed from: b */
    public static Rational m31311b(Size size, List list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : C19692eP1.m31553l(list)) {
            if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: e */
    public static boolean m31308e(int i, int i2, int i3) {
        boolean z;
        int surfaceRotationToDegrees = CameraOrientationUtil.surfaceRotationToDegrees(i);
        if (1 == i2) {
            z = true;
        } else {
            z = false;
        }
        int relativeImageRotation = CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, i3, z);
        if (relativeImageRotation != 90 && relativeImageRotation != 270) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final Rational m31310c(ImageOutputConfig imageOutputConfig, List list) {
        if (imageOutputConfig.hasTargetAspectRatio()) {
            return C19692eP1.m31551n(imageOutputConfig.getTargetAspectRatio(), this.f61811d);
        }
        Size m31309d = m31309d(imageOutputConfig);
        if (m31309d != null) {
            return m31311b(m31309d, list);
        }
        return null;
    }

    /* renamed from: d */
    public final Size m31309d(ImageOutputConfig imageOutputConfig) {
        return m31312a(imageOutputConfig.getTargetResolution(null), imageOutputConfig.getTargetRotation(0), this.f61809b, this.f61808a);
    }

    /* renamed from: f */
    public List m31307f(List list, UseCaseConfig useCaseConfig) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new CompareSizesByArea(true));
        ArrayList arrayList2 = new ArrayList();
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        Size maxResolution = imageOutputConfig.getMaxResolution(null);
        Size size = (Size) arrayList.get(0);
        if (maxResolution == null || SizeUtil.getArea(size) < SizeUtil.getArea(maxResolution)) {
            maxResolution = size;
        }
        Size m31309d = m31309d(imageOutputConfig);
        Size size2 = SizeUtil.RESOLUTION_VGA;
        int area = SizeUtil.getArea(size2);
        if (SizeUtil.getArea(maxResolution) < area) {
            size2 = SizeUtil.RESOLUTION_ZERO;
        } else if (m31309d != null && SizeUtil.getArea(m31309d) < area) {
            size2 = m31309d;
        }
        for (Size size3 : arrayList) {
            if (SizeUtil.getArea(size3) <= SizeUtil.getArea(maxResolution) && SizeUtil.getArea(size3) >= SizeUtil.getArea(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (!arrayList2.isEmpty()) {
            Rational m31310c = m31310c(imageOutputConfig, arrayList2);
            if (m31309d == null) {
                m31309d = imageOutputConfig.getDefaultResolution(null);
            }
            ArrayList arrayList3 = new ArrayList();
            new HashMap();
            if (m31310c == null) {
                arrayList3.addAll(arrayList2);
                if (m31309d != null) {
                    C19692eP1.m31548q(arrayList3, m31309d, true);
                }
            } else {
                Map m31550o = C19692eP1.m31550o(arrayList2);
                if (m31309d != null) {
                    for (Rational rational : m31550o.keySet()) {
                        C19692eP1.m31548q((List) m31550o.get(rational), m31309d, true);
                    }
                }
                ArrayList<Rational> arrayList4 = new ArrayList(m31550o.keySet());
                Collections.sort(arrayList4, new AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(m31310c, this.f61810c));
                for (Rational rational2 : arrayList4) {
                    for (Size size4 : (List) m31550o.get(rational2)) {
                        if (!arrayList3.contains(size4)) {
                            arrayList3.add(size4);
                        }
                    }
                }
            }
            return arrayList3;
        }
        throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + maxResolution + "\ninitial size list: " + arrayList);
    }
}
