package p000;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.AlignmentPattern;
import java.util.ArrayList;
import java.util.List;

/* renamed from: G2 */
/* loaded from: classes5.dex */
public final class C0424G2 {

    /* renamed from: a */
    public final BitMatrix f1841a;

    /* renamed from: c */
    public final int f1843c;

    /* renamed from: d */
    public final int f1844d;

    /* renamed from: e */
    public final int f1845e;

    /* renamed from: f */
    public final int f1846f;

    /* renamed from: g */
    public final float f1847g;

    /* renamed from: i */
    public final ResultPointCallback f1849i;

    /* renamed from: b */
    public final List f1842b = new ArrayList(5);

    /* renamed from: h */
    public final int[] f1848h = new int[3];

    public C0424G2(BitMatrix bitMatrix, int i, int i2, int i3, int i4, float f, ResultPointCallback resultPointCallback) {
        this.f1841a = bitMatrix;
        this.f1843c = i;
        this.f1844d = i2;
        this.f1845e = i3;
        this.f1846f = i4;
        this.f1847g = f;
        this.f1849i = resultPointCallback;
    }

    /* renamed from: a */
    public static float m68336a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* renamed from: b */
    public final float m68335b(int i, int i2, int i3, int i4) {
        BitMatrix bitMatrix = this.f1841a;
        int height = bitMatrix.getHeight();
        int[] iArr = this.f1848h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bitMatrix.get(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bitMatrix.get(i2, i5)) {
                int i7 = iArr[0];
                if (i7 > i3) {
                    break;
                }
                iArr[0] = i7 + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i8 = i + 1;
            while (i8 < height && bitMatrix.get(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != height && iArr[1] <= i3) {
                while (i8 < height && !bitMatrix.get(i2, i8)) {
                    int i10 = iArr[2];
                    if (i10 > i3) {
                        break;
                    }
                    iArr[2] = i10 + 1;
                    i8++;
                }
                int i11 = iArr[2];
                if (i11 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i11) - i4) * 5 < i4 * 2 && m68333d(iArr)) {
                    return m68336a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: c */
    public AlignmentPattern m68334c() {
        int i;
        AlignmentPattern m68332e;
        AlignmentPattern m68332e2;
        int i2 = this.f1843c;
        int i3 = this.f1846f;
        int i4 = this.f1845e + i2;
        int i5 = this.f1844d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            if ((i6 & 1) == 0) {
                i = (i6 + 1) / 2;
            } else {
                i = -((i6 + 1) / 2);
            }
            int i7 = i + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.f1841a.get(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (this.f1841a.get(i8, i7)) {
                    if (i9 == 1) {
                        iArr[1] = iArr[1] + 1;
                    } else if (i9 == 2) {
                        if (m68333d(iArr) && (m68332e2 = m68332e(iArr, i7, i8)) != null) {
                            return m68332e2;
                        }
                        iArr[0] = iArr[2];
                        iArr[1] = 1;
                        iArr[2] = 0;
                        i9 = 1;
                    } else {
                        i9++;
                        iArr[i9] = iArr[i9] + 1;
                    }
                } else {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                }
                i8++;
            }
            if (m68333d(iArr) && (m68332e = m68332e(iArr, i7, i4)) != null) {
                return m68332e;
            }
        }
        if (!this.f1842b.isEmpty()) {
            return (AlignmentPattern) this.f1842b.get(0);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public final boolean m68333d(int[] iArr) {
        float f = this.f1847g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final AlignmentPattern m68332e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float m68336a = m68336a(iArr, i2);
        float m68335b = m68335b(i, (int) m68336a, iArr[1] * 2, i3);
        if (!Float.isNaN(m68335b)) {
            float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            for (AlignmentPattern alignmentPattern : this.f1842b) {
                if (alignmentPattern.m33903b(f, m68335b, m68336a)) {
                    return alignmentPattern.m33902c(m68335b, m68336a, f);
                }
            }
            AlignmentPattern alignmentPattern2 = new AlignmentPattern(m68336a, m68335b, f);
            this.f1842b.add(alignmentPattern2);
            ResultPointCallback resultPointCallback = this.f1849i;
            if (resultPointCallback != null) {
                resultPointCallback.foundPossibleResultPoint(alignmentPattern2);
                return null;
            }
            return null;
        }
        return null;
    }
}