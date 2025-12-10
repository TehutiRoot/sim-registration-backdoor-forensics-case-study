package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;

/* loaded from: classes5.dex */
public class Detector {

    /* renamed from: a */
    public final BitMatrix f58005a;

    /* renamed from: b */
    public ResultPointCallback f58006b;

    public Detector(BitMatrix bitMatrix) {
        this.f58005a = bitMatrix;
    }

    /* renamed from: b */
    public static int m33900b(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f) {
        int round = (MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2) / f) + MathUtils.round(ResultPoint.distance(resultPoint, resultPoint3) / f)) / 2;
        int i = round + 7;
        int i2 = i & 3;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 == 3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                return i;
            }
            return round + 6;
        }
        return round + 8;
    }

    /* renamed from: c */
    public static PerspectiveTransform m33899c(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float x;
        float y;
        float f;
        float f2 = i - 3.5f;
        if (resultPoint4 != null) {
            x = resultPoint4.getX();
            y = resultPoint4.getY();
            f = f2 - 3.0f;
        } else {
            x = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f = f2;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x, y, resultPoint3.getX(), resultPoint3.getY());
    }

    /* renamed from: d */
    public static BitMatrix m33898d(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i) {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i, perspectiveTransform);
    }

    /* renamed from: a */
    public final float m33901a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float m33896f = m33896f((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float m33896f2 = m33896f((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        if (Float.isNaN(m33896f)) {
            return m33896f2 / 7.0f;
        }
        if (Float.isNaN(m33896f2)) {
            return m33896f / 7.0f;
        }
        return (m33896f + m33896f2) / 14.0f;
    }

    public final float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (m33901a(resultPoint, resultPoint2) + m33901a(resultPoint, resultPoint3)) / 2.0f;
    }

    public DetectorResult detect() throws NotFoundException, FormatException {
        return detect(null);
    }

    /* renamed from: e */
    public final float m33897e(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Detector detector;
        boolean z2;
        boolean z3;
        int i13 = 1;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i14 = (-abs) / 2;
        int i15 = -1;
        if (i5 < i7) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i6 < i8) {
            i15 = 1;
        }
        int i16 = i7 + i9;
        int i17 = i5;
        int i18 = i6;
        int i19 = 0;
        while (true) {
            if (i17 != i16) {
                if (z) {
                    i11 = i18;
                } else {
                    i11 = i17;
                }
                if (z) {
                    i12 = i17;
                } else {
                    i12 = i18;
                }
                if (i19 == i13) {
                    detector = this;
                    z2 = z;
                    i10 = i16;
                    z3 = true;
                } else {
                    detector = this;
                    z2 = z;
                    i10 = i16;
                    z3 = false;
                }
                if (z3 == detector.f58005a.get(i11, i12)) {
                    if (i19 == 2) {
                        return MathUtils.distance(i17, i18, i5, i6);
                    }
                    i19++;
                }
                i14 += abs2;
                if (i14 > 0) {
                    if (i18 == i8) {
                        break;
                    }
                    i18 += i15;
                    i14 -= abs;
                }
                i17 += i9;
                i16 = i10;
                z = z2;
                i13 = 1;
            } else {
                i10 = i16;
                break;
            }
        }
        if (i19 == 2) {
            return MathUtils.distance(i10, i8, i5, i6);
        }
        return Float.NaN;
    }

    /* renamed from: f */
    public final float m33896f(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float m33897e = m33897e(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.f58005a.getWidth()) {
            f = ((this.f58005a.getWidth() - 1) - i) / (i5 - i);
            i5 = this.f58005a.getWidth() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.f58005a.getHeight()) {
            f2 = ((this.f58005a.getHeight() - 1) - i2) / (i7 - i2);
            i6 = this.f58005a.getHeight() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (m33897e + m33897e(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }

    public final AlignmentPattern findAlignmentInRegion(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f58005a.getWidth() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f58005a.getHeight() - 1, i2 + i3) - max2;
            if (min2 >= f3) {
                return new C0424G2(this.f58005a, max, max2, min, min2, f, this.f58006b).m68334c();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final BitMatrix getImage() {
        return this.f58005a;
    }

    public final ResultPointCallback getResultPointCallback() {
        return this.f58006b;
    }

    public final DetectorResult processFinderPatternInfo(FinderPatternInfo finderPatternInfo) throws NotFoundException, FormatException {
        AlignmentPattern alignmentPattern;
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float calculateModuleSize = calculateModuleSize(topLeft, topRight, bottomLeft);
        if (calculateModuleSize >= 1.0f) {
            int m33900b = m33900b(topLeft, topRight, bottomLeft, calculateModuleSize);
            Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(m33900b);
            int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
            if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
                float x = (topRight.getX() - topLeft.getX()) + bottomLeft.getX();
                float y = (topRight.getY() - topLeft.getY()) + bottomLeft.getY();
                float f = 1.0f - (3.0f / dimensionForVersion);
                int x2 = (int) (topLeft.getX() + ((x - topLeft.getX()) * f));
                int y2 = (int) (topLeft.getY() + (f * (y - topLeft.getY())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        alignmentPattern = findAlignmentInRegion(calculateModuleSize, x2, y2, i);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
            }
            alignmentPattern = null;
            return new DetectorResult(m33898d(this.f58005a, m33899c(topLeft, topRight, bottomLeft, alignmentPattern, m33900b), m33900b), alignmentPattern == null ? new ResultPoint[]{bottomLeft, topLeft, topRight} : new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPattern});
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.f58006b = resultPointCallback;
        return processFinderPatternInfo(new FinderPatternFinder(this.f58005a, resultPointCallback).m33888e(map));
    }
}