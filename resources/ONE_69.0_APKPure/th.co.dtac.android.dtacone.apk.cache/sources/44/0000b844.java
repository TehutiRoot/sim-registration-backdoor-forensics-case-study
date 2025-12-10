package com.google.zxing.oned.rss.expanded;

import androidx.appcompat.app.AppCompatDelegate;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import es.dmoral.toasty.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.math.Primes;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;
import th.p047co.dtac.android.dtacone.util.MapLocation;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public final class RSSExpandedReader extends AbstractRSSReader {

    /* renamed from: k */
    public static final int[] f57925k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    public static final int[] f57926l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    public static final int[] f57927m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    public static final int[][] f57928n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    public static final int[][] f57929o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, BitmapUtil.IMAGE_180_DEGREE, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, CameraActivity.REQUEST_CODE, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, SyslogConstants.LOG_LOCAL6, 106, 107, 110, 119, 146}, new int[]{16, 48, SyslogConstants.LOG_LOCAL2, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, SyslogConstants.LOG_LOCAL7, BuildConfig.VERSION_CODE, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, CertificateHolderAuthorization.CVCA, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, WebSocketProtocol.PAYLOAD_SHORT, 167}, new int[]{79, 26, 78, 23, 69, 207, MapLocation.REQUEST_LOCATION, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, SyslogConstants.LOG_LOCAL4, 58, 174, 100, 89}};

    /* renamed from: p */
    public static final int[][] f57930p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    public final List f57931g = new ArrayList(11);

    /* renamed from: h */
    public final List f57932h = new ArrayList();

    /* renamed from: i */
    public final int[] f57933i = new int[2];

    /* renamed from: j */
    public boolean f57934j;

    /* renamed from: f */
    public static Result m34005f(List list) {
        String parseInformation = AbstractExpandedDecoder.createDecoder(AbstractC12214lb.m26798a(list)).parseInformation();
        ResultPoint[] resultPoints = ((C0317ET) list.get(0)).m68654b().getResultPoints();
        ResultPoint[] resultPoints2 = ((C0317ET) list.get(list.size() - 1)).m68654b().getResultPoints();
        return new Result(parseInformation, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    /* renamed from: j */
    public static int m34001j(BitArray bitArray, int i) {
        if (bitArray.get(i)) {
            return bitArray.getNextSet(bitArray.getNextUnset(i));
        }
        return bitArray.getNextUnset(bitArray.getNextSet(i));
    }

    /* renamed from: k */
    public static boolean m34000k(FinderPattern finderPattern, boolean z, boolean z2) {
        if (finderPattern.getValue() == 0 && z && z2) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m33999l(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            C0385FT c0385ft = (C0385FT) it.next();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                C0317ET c0317et = (C0317ET) it2.next();
                for (C0317ET c0317et2 : c0385ft.m68426a()) {
                    if (c0317et.equals(c0317et2)) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m33998m(List list) {
        int[][] iArr;
        for (int[] iArr2 : f57930p) {
            if (list.size() <= iArr2.length) {
                for (int i = 0; i < list.size(); i++) {
                    if (((C0317ET) list.get(i)).m68654b().getValue() != iArr2[i]) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static void m33996o(List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C0385FT c0385ft = (C0385FT) it.next();
            if (c0385ft.m68426a().size() != list.size()) {
                Iterator it2 = c0385ft.m68426a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C0317ET c0317et = (C0317ET) it2.next();
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (c0317et.equals((C0317ET) it3.next())) {
                                break;
                            }
                        }
                    } else {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public static void m33994q(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: b */
    public final void m34009b(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int sum = MathUtils.sum(getOddCounts());
        int sum2 = MathUtils.sum(getEvenCounts());
        boolean z6 = true;
        boolean z7 = false;
        if (sum > 13) {
            z = false;
            z2 = true;
        } else {
            if (sum < 4) {
                z = true;
            } else {
                z = false;
            }
            z2 = false;
        }
        if (sum2 > 13) {
            z3 = false;
            z4 = true;
        } else {
            if (sum2 < 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = false;
        }
        int i2 = (sum + sum2) - i;
        if ((sum & 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((sum2 & 1) == 0) {
            z7 = true;
        }
        if (i2 == 1) {
            if (z5) {
                if (!z7) {
                    z6 = z;
                    z2 = true;
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (z7) {
                z6 = z;
                z4 = true;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        } else if (i2 == -1) {
            if (z5) {
                if (z7) {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (z7) {
                z6 = z;
                z3 = true;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        } else if (i2 == 0) {
            if (z5) {
                if (z7) {
                    if (sum >= sum2) {
                        z6 = z;
                        z3 = true;
                        z2 = true;
                    }
                    z4 = true;
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (!z7) {
                z6 = z;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z6) {
            if (!z2) {
                AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z2) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z3) {
            if (!z4) {
                AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z4) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    /* renamed from: c */
    public final boolean m34008c() {
        C0317ET c0317et = (C0317ET) this.f57931g.get(0);
        DataCharacter m68653c = c0317et.m68653c();
        DataCharacter m68652d = c0317et.m68652d();
        if (m68652d == null) {
            return false;
        }
        int checksumPortion = m68652d.getChecksumPortion();
        int i = 2;
        for (int i2 = 1; i2 < this.f57931g.size(); i2++) {
            C0317ET c0317et2 = (C0317ET) this.f57931g.get(i2);
            checksumPortion += c0317et2.m68653c().getChecksumPortion();
            int i3 = i + 1;
            DataCharacter m68652d2 = c0317et2.m68652d();
            if (m68652d2 != null) {
                checksumPortion += m68652d2.getChecksumPortion();
                i += 2;
            } else {
                i = i3;
            }
        }
        if (((i - 4) * Primes.SMALL_FACTOR_LIMIT) + (checksumPortion % Primes.SMALL_FACTOR_LIMIT) != m68653c.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final List m34007d(List list, int i) {
        while (i < this.f57932h.size()) {
            C0385FT c0385ft = (C0385FT) this.f57932h.get(i);
            this.f57931g.clear();
            for (C0385FT c0385ft2 : list) {
                this.f57931g.addAll(c0385ft2.m68426a());
            }
            this.f57931g.addAll(c0385ft.m68426a());
            if (m33998m(this.f57931g)) {
                if (m34008c()) {
                    return this.f57931g;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(c0385ft);
                try {
                    return m34007d(arrayList, i + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.f57931g.clear();
        this.f57934j = false;
        try {
            return m34005f(m34003h(i, bitArray));
        } catch (NotFoundException unused) {
            this.f57931g.clear();
            this.f57934j = true;
            return m34005f(m34003h(i, bitArray));
        }
    }

    /* renamed from: e */
    public final List m34006e(boolean z) {
        List list = null;
        if (this.f57932h.size() > 25) {
            this.f57932h.clear();
            return null;
        }
        this.f57931g.clear();
        if (z) {
            Collections.reverse(this.f57932h);
        }
        try {
            list = m34007d(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f57932h);
        }
        return list;
    }

    /* renamed from: g */
    public DataCharacter m34004g(BitArray bitArray, FinderPattern finderPattern, boolean z, boolean z2) {
        int i;
        int[] dataCharacterCounters = getDataCharacterCounters();
        dataCharacterCounters[0] = 0;
        dataCharacterCounters[1] = 0;
        dataCharacterCounters[2] = 0;
        dataCharacterCounters[3] = 0;
        dataCharacterCounters[4] = 0;
        dataCharacterCounters[5] = 0;
        dataCharacterCounters[6] = 0;
        dataCharacterCounters[7] = 0;
        if (z2) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1], dataCharacterCounters);
            int i2 = 0;
            for (int length = dataCharacterCounters.length - 1; i2 < length; length--) {
                int i3 = dataCharacterCounters[i2];
                dataCharacterCounters[i2] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i3;
                i2++;
            }
        }
        float sum = MathUtils.sum(dataCharacterCounters) / 17.0f;
        float f = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / 15.0f;
        if (Math.abs(sum - f) / f <= 0.3f) {
            int[] oddCounts = getOddCounts();
            int[] evenCounts = getEvenCounts();
            float[] oddRoundingErrors = getOddRoundingErrors();
            float[] evenRoundingErrors = getEvenRoundingErrors();
            for (int i4 = 0; i4 < dataCharacterCounters.length; i4++) {
                float f2 = (dataCharacterCounters[i4] * 1.0f) / sum;
                int i5 = (int) (0.5f + f2);
                if (i5 <= 0) {
                    if (f2 >= 0.3f) {
                        i5 = 1;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else if (i5 > 8) {
                    if (f2 <= 8.7f) {
                        i5 = 8;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                int i6 = i4 / 2;
                if ((i4 & 1) == 0) {
                    oddCounts[i6] = i5;
                    oddRoundingErrors[i6] = f2 - i5;
                } else {
                    evenCounts[i6] = i5;
                    evenRoundingErrors[i6] = f2 - i5;
                }
            }
            m34009b(17);
            int value = finderPattern.getValue() * 4;
            if (z) {
                i = 0;
            } else {
                i = 2;
            }
            int i7 = ((value + i) + (!z2 ? 1 : 0)) - 1;
            int i8 = 0;
            int i9 = 0;
            for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
                if (m34000k(finderPattern, z, z2)) {
                    i8 += oddCounts[length2] * f57929o[i7][length2 * 2];
                }
                i9 += oddCounts[length2];
            }
            int i10 = 0;
            for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
                if (m34000k(finderPattern, z, z2)) {
                    i10 += evenCounts[length3] * f57929o[i7][(length3 * 2) + 1];
                }
            }
            int i11 = i8 + i10;
            if ((i9 & 1) == 0 && i9 <= 13 && i9 >= 4) {
                int i12 = (13 - i9) / 2;
                int i13 = f57925k[i12];
                return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i13, true) * f57926l[i12]) + RSSUtils.getRSSvalue(evenCounts, 9 - i13, false) + f57927m[i12], i11);
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: h */
    public List m34003h(int i, BitArray bitArray) {
        while (true) {
            try {
                this.f57931g.add(m33995p(bitArray, this.f57931g, i));
            } catch (NotFoundException e) {
                if (!this.f57931g.isEmpty()) {
                    if (m34008c()) {
                        return this.f57931g;
                    }
                    boolean z = !this.f57932h.isEmpty();
                    m33993r(i, false);
                    if (z) {
                        List m34006e = m34006e(false);
                        if (m34006e != null) {
                            return m34006e;
                        }
                        List m34006e2 = m34006e(true);
                        if (m34006e2 != null) {
                            return m34006e2;
                        }
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw e;
            }
        }
    }

    /* renamed from: i */
    public final void m34002i(BitArray bitArray, List list, int i) {
        boolean z;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = ((C0317ET) list.get(list.size() - 1)).m68654b().getStartEnd()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f57934j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < size) {
            z2 = !bitArray.get(i);
            if (!z2) {
                break;
            }
            i++;
        }
        boolean z3 = z2;
        int i2 = 0;
        int i3 = i;
        while (i < size) {
            if (bitArray.get(i) ^ z3) {
                decodeFinderCounters[i2] = decodeFinderCounters[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m33994q(decodeFinderCounters);
                    }
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        int[] iArr = this.f57933i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m33994q(decodeFinderCounters);
                    }
                    i3 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                decodeFinderCounters[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: n */
    public final FinderPattern m33997n(BitArray bitArray, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f57933i[0] - 1;
            while (i5 >= 0 && !bitArray.get(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f57933i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f57933i;
            int i7 = iArr2[0];
            int nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i2 = nextUnset;
            i3 = i7;
            i4 = nextUnset - this.f57933i[1];
        }
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i4;
        try {
            return new FinderPattern(AbstractRSSReader.parseFinderValue(decodeFinderCounters, f57928n), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public C0317ET m33995p(BitArray bitArray, List list, int i) {
        boolean z;
        FinderPattern m33997n;
        DataCharacter dataCharacter;
        if (list.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f57934j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m34002i(bitArray, list, i2);
            m33997n = m33997n(bitArray, i, z);
            if (m33997n == null) {
                i2 = m34001j(bitArray, this.f57933i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        DataCharacter m34004g = m34004g(bitArray, m33997n, z, true);
        if (!list.isEmpty() && ((C0317ET) list.get(list.size() - 1)).m68650f()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacter = m34004g(bitArray, m33997n, z, false);
        } catch (NotFoundException unused) {
            dataCharacter = null;
        }
        return new C0317ET(m34004g, dataCharacter, m33997n, true);
    }

    /* renamed from: r */
    public final void m33993r(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f57932h.size()) {
                break;
            }
            C0385FT c0385ft = (C0385FT) this.f57932h.get(i2);
            if (c0385ft.m68425b() > i) {
                z2 = c0385ft.m68424c(this.f57931g);
                break;
            } else {
                z3 = c0385ft.m68424c(this.f57931g);
                i2++;
            }
        }
        if (z2 || z3 || m33999l(this.f57931g, this.f57932h)) {
            return;
        }
        this.f57932h.add(i2, new C0385FT(this.f57931g, i, z));
        m33996o(this.f57931g, this.f57932h);
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.f57931g.clear();
        this.f57932h.clear();
    }
}