package com.tom_roush.pdfbox.pdmodel.font;

import android.util.Log;
import com.tom_roush.fontbox.ttf.GlyphData;
import com.tom_roush.fontbox.ttf.GlyphTable;
import com.tom_roush.fontbox.ttf.HorizontalMetricsTable;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.ttf.VerticalHeaderTable;
import com.tom_roush.fontbox.ttf.VerticalMetricsTable;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public final class PDCIDFontType2Embedder extends FW1 {

    /* renamed from: h */
    public final PDDocument f60389h;

    /* renamed from: i */
    public final PDType0Font f60390i;

    /* renamed from: j */
    public final COSDictionary f60391j;

    /* renamed from: k */
    public final COSDictionary f60392k;

    /* renamed from: l */
    public final boolean f60393l;

    /* loaded from: classes5.dex */
    public enum State {
        FIRST,
        BRACKET,
        SERIAL
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2Embedder$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9916a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60394a;

        static {
            int[] iArr = new int[State.values().length];
            f60394a = iArr;
            try {
                iArr[State.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60394a[State.BRACKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60394a[State.SERIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PDCIDFontType2Embedder(PDDocument pDDocument, COSDictionary cOSDictionary, TrueTypeFont trueTypeFont, boolean z, PDType0Font pDType0Font, boolean z2) {
        super(pDDocument, cOSDictionary, trueTypeFont, z);
        COSBase cOSBase;
        this.f60389h = pDDocument;
        this.f60391j = cOSDictionary;
        this.f60390i = pDType0Font;
        this.f60393l = z2;
        cOSDictionary.setItem(COSName.SUBTYPE, COSName.TYPE0);
        cOSDictionary.setName(COSName.BASE_FONT, this.f1705c.getFontName());
        COSName cOSName = COSName.ENCODING;
        if (z2) {
            cOSBase = COSName.IDENTITY_V;
        } else {
            cOSBase = COSName.IDENTITY_H;
        }
        cOSDictionary.setItem(cOSName, cOSBase);
        COSDictionary m32431t = m32431t();
        this.f60392k = m32431t;
        COSArray cOSArray = new COSArray();
        cOSArray.add((COSBase) m32431t);
        cOSDictionary.setItem(COSName.DESCENDANT_FONTS, (COSBase) cOSArray);
        if (!z) {
            m32437n(null);
        }
    }

    @Override // p000.FW1
    /* renamed from: c */
    public void mo26263c(InputStream inputStream, String str, Map map) {
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Integer num = (Integer) entry.getKey();
            num.intValue();
            Integer num2 = (Integer) entry.getValue();
            num2.intValue();
            hashMap.put(num2, num);
        }
        m32437n(map);
        if (this.f60393l) {
            m32434q(hashMap);
        }
        m68415b(inputStream);
        m32440k(str);
        m32432s(hashMap);
        m32438m(hashMap);
        m32439l(hashMap);
    }

    /* renamed from: k */
    public final void m32440k(String str) {
        String str2 = str + this.f1705c.getFontName();
        COSDictionary cOSDictionary = this.f60391j;
        COSName cOSName = COSName.BASE_FONT;
        cOSDictionary.setName(cOSName, str2);
        this.f1705c.setFontName(str2);
        this.f60392k.setName(cOSName, str2);
    }

    /* renamed from: l */
    public final void m32439l(Map map) {
        int intValue = ((Integer) Collections.max(map.keySet())).intValue();
        byte[] bArr = new byte[(intValue / 8) + 1];
        for (int i = 0; i <= intValue; i++) {
            int i2 = i / 8;
            bArr[i2] = (byte) ((1 << (7 - (i % 8))) | bArr[i2]);
        }
        this.f1705c.setCIDSet(new PDStream(this.f60389h, (InputStream) new ByteArrayInputStream(bArr), COSName.FLATE_DECODE));
    }

    /* renamed from: m */
    public final void m32438m(Map map) {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int intValue = ((Integer) Collections.max(map.keySet())).intValue();
        for (int i2 = 0; i2 <= intValue; i2++) {
            if (map.containsKey(Integer.valueOf(i2))) {
                i = ((Integer) map.get(Integer.valueOf(i2))).intValue();
            } else {
                i = 0;
            }
            byteArrayOutputStream.write(new byte[]{(byte) ((i >> 8) & 255), (byte) (i & 255)});
        }
        this.f60392k.setItem(COSName.CID_TO_GID_MAP, new PDStream(this.f60389h, (InputStream) new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.FLATE_DECODE));
    }

    /* renamed from: n */
    public final void m32437n(Map map) {
        int i;
        C22002rU1 c22002rU1 = new C22002rU1();
        int numGlyphs = this.f1704b.getMaximumProfile().getNumGlyphs();
        boolean z = false;
        for (int i2 = 1; i2 <= numGlyphs; i2++) {
            if (map != null) {
                if (map.containsKey(Integer.valueOf(i2))) {
                    i = ((Integer) map.get(Integer.valueOf(i2))).intValue();
                }
            } else {
                i = i2;
            }
            List<Integer> charCodes = this.f1707e.getCharCodes(i);
            if (charCodes != null) {
                int intValue = charCodes.get(0).intValue();
                if (intValue > 65535) {
                    z = true;
                }
                c22002rU1.m23505a(i, new String(new int[]{intValue}, 0, 1));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c22002rU1.m23503c(byteArrayOutputStream);
        PDStream pDStream = new PDStream(this.f60389h, (InputStream) new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.FLATE_DECODE);
        if (z && this.f60389h.getVersion() < 1.5d) {
            this.f60389h.setVersion(1.5f);
        }
        this.f60391j.setItem(COSName.TO_UNICODE, pDStream);
    }

    /* renamed from: o */
    public final boolean m32436o(COSDictionary cOSDictionary) {
        VerticalHeaderTable verticalHeader;
        if (this.f1704b.getVerticalHeader() == null) {
            Log.w("PdfBox-Android", "Font to be subset is set to vertical, but has no 'vhea' table");
            return false;
        }
        float unitsPerEm = 1000.0f / this.f1704b.getHeader().getUnitsPerEm();
        long round = Math.round(verticalHeader.getAscender() * unitsPerEm);
        long round2 = Math.round((-verticalHeader.getAdvanceHeightMax()) * unitsPerEm);
        if (round != 880 || round2 != -1000) {
            COSArray cOSArray = new COSArray();
            cOSArray.add((COSBase) COSInteger.get(round));
            cOSArray.add((COSBase) COSInteger.get(round2));
            cOSDictionary.setItem(COSName.DW2, (COSBase) cOSArray);
            return true;
        }
        return true;
    }

    /* renamed from: p */
    public final void m32435p(COSDictionary cOSDictionary) {
        if (!m32436o(cOSDictionary)) {
            return;
        }
        int numberOfGlyphs = this.f1704b.getNumberOfGlyphs();
        int[] iArr = new int[numberOfGlyphs * 4];
        for (int i = 0; i < numberOfGlyphs; i++) {
            GlyphData glyph = this.f1704b.getGlyph().getGlyph(i);
            if (glyph == null) {
                iArr[i * 4] = Integer.MIN_VALUE;
            } else {
                int i2 = i * 4;
                iArr[i2] = i;
                iArr[i2 + 1] = this.f1704b.getVerticalMetrics().getAdvanceHeight(i);
                iArr[i2 + 2] = this.f1704b.getHorizontalMetrics().getAdvanceWidth(i);
                iArr[i2 + 3] = glyph.getYMaximum() + this.f1704b.getVerticalMetrics().getTopSideBearing(i);
            }
        }
        cOSDictionary.setItem(COSName.f59859W2, (COSBase) m32429v(iArr));
    }

    /* renamed from: q */
    public final void m32434q(Map map) {
        GlyphData glyph;
        VerticalMetricsTable verticalMetricsTable;
        GlyphTable glyphTable;
        long j;
        if (!m32436o(this.f60392k)) {
            return;
        }
        float unitsPerEm = 1000.0f / this.f1704b.getHeader().getUnitsPerEm();
        VerticalHeaderTable verticalHeader = this.f1704b.getVerticalHeader();
        VerticalMetricsTable verticalMetrics = this.f1704b.getVerticalMetrics();
        GlyphTable glyph2 = this.f1704b.getGlyph();
        HorizontalMetricsTable horizontalMetrics = this.f1704b.getHorizontalMetrics();
        long round = Math.round(verticalHeader.getAscender() * unitsPerEm);
        long round2 = Math.round((-verticalHeader.getAdvanceHeightMax()) * unitsPerEm);
        COSArray cOSArray = new COSArray();
        COSArray cOSArray2 = new COSArray();
        int i = Integer.MIN_VALUE;
        for (Integer num : new TreeSet(map.keySet())) {
            int intValue = num.intValue();
            if (glyph2.getGlyph(intValue) == null) {
                verticalMetricsTable = verticalMetrics;
                glyphTable = glyph2;
            } else {
                long round3 = Math.round((glyph.getYMaximum() + verticalMetrics.getTopSideBearing(intValue)) * unitsPerEm);
                glyphTable = glyph2;
                verticalMetricsTable = verticalMetrics;
                long round4 = Math.round((-verticalMetrics.getAdvanceHeight(intValue)) * unitsPerEm);
                if (round3 != round || round4 != round2) {
                    long j2 = round;
                    if (i != intValue - 1) {
                        COSArray cOSArray3 = new COSArray();
                        j = round2;
                        cOSArray.add((COSBase) COSInteger.get(intValue));
                        cOSArray.add((COSBase) cOSArray3);
                        cOSArray2 = cOSArray3;
                    } else {
                        j = round2;
                    }
                    cOSArray2.add((COSBase) COSInteger.get(round4));
                    cOSArray2.add((COSBase) COSInteger.get(Math.round(horizontalMetrics.getAdvanceWidth(intValue) * unitsPerEm) / 2));
                    cOSArray2.add((COSBase) COSInteger.get(round3));
                    i = intValue;
                    glyph2 = glyphTable;
                    verticalMetrics = verticalMetricsTable;
                    round = j2;
                    round2 = j;
                }
            }
            glyph2 = glyphTable;
            verticalMetrics = verticalMetricsTable;
        }
        this.f60392k.setItem(COSName.f59859W2, (COSBase) cOSArray);
    }

    /* renamed from: r */
    public final void m32433r(COSDictionary cOSDictionary) {
        int numberOfGlyphs = this.f1704b.getNumberOfGlyphs();
        int[] iArr = new int[numberOfGlyphs * 2];
        for (int i = 0; i < numberOfGlyphs; i++) {
            int i2 = i * 2;
            iArr[i2] = i;
            iArr[i2 + 1] = this.f1704b.getHorizontalMetrics().getAdvanceWidth(i);
        }
        cOSDictionary.setItem(COSName.f59858W, (COSBase) m32428w(iArr));
    }

    /* renamed from: s */
    public final void m32432s(Map map) {
        float unitsPerEm = 1000.0f / this.f1704b.getHeader().getUnitsPerEm();
        COSArray cOSArray = new COSArray();
        COSArray cOSArray2 = new COSArray();
        int i = Integer.MIN_VALUE;
        for (Integer num : new TreeSet(map.keySet())) {
            int intValue = num.intValue();
            long round = Math.round(this.f1704b.getHorizontalMetrics().getAdvanceWidth(((Integer) map.get(num)).intValue()) * unitsPerEm);
            if (round != 1000) {
                if (i != intValue - 1) {
                    cOSArray2 = new COSArray();
                    cOSArray.add((COSBase) COSInteger.get(intValue));
                    cOSArray.add((COSBase) cOSArray2);
                }
                cOSArray2.add((COSBase) COSInteger.get(round));
                i = intValue;
            }
        }
        this.f60392k.setItem(COSName.f59858W, (COSBase) cOSArray);
    }

    /* renamed from: t */
    public final COSDictionary m32431t() {
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.FONT);
        cOSDictionary.setItem(COSName.SUBTYPE, (COSBase) COSName.CID_FONT_TYPE2);
        cOSDictionary.setName(COSName.BASE_FONT, this.f1705c.getFontName());
        cOSDictionary.setItem(COSName.CIDSYSTEMINFO, (COSBase) m32427x("Adobe", "Identity", 0));
        cOSDictionary.setItem(COSName.FONT_DESC, (COSBase) this.f1705c.getCOSObject());
        m32433r(cOSDictionary);
        if (this.f60393l) {
            m32435p(cOSDictionary);
        }
        cOSDictionary.setItem(COSName.CID_TO_GID_MAP, (COSBase) COSName.IDENTITY);
        return cOSDictionary;
    }

    /* renamed from: u */
    public PDCIDFont m32430u() {
        return new PDCIDFontType2(this.f60392k, this.f60390i, this.f1704b);
    }

    /* renamed from: v */
    public final COSArray m32429v(int[] iArr) {
        float f;
        COSArray cOSArray;
        State state;
        int[] iArr2 = iArr;
        if (iArr2.length != 0) {
            float unitsPerEm = 1000.0f / this.f1704b.getHeader().getUnitsPerEm();
            long j = iArr2[0];
            long round = Math.round((-iArr2[1]) * unitsPerEm);
            long round2 = Math.round((iArr2[2] * unitsPerEm) / 2.0f);
            long round3 = Math.round(iArr2[3] * unitsPerEm);
            COSArray cOSArray2 = new COSArray();
            COSArray cOSArray3 = new COSArray();
            cOSArray3.add((COSBase) COSInteger.get(j));
            State state2 = State.FIRST;
            int i = 4;
            while (i < iArr2.length) {
                COSArray cOSArray4 = cOSArray3;
                long j2 = iArr2[i];
                if (j2 == -2147483648L) {
                    f = unitsPerEm;
                    state = state2;
                    cOSArray = cOSArray4;
                } else {
                    long j3 = round3;
                    long round4 = Math.round((-iArr2[i + 1]) * unitsPerEm);
                    long j4 = round2;
                    round2 = Math.round((iArr2[i + 2] * unitsPerEm) / 2.0f);
                    long round5 = Math.round(iArr2[i + 3] * unitsPerEm);
                    f = unitsPerEm;
                    int i2 = C9916a.f60394a[state2.ordinal()];
                    State state3 = state2;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3 || (j2 == j + 1 && round4 == round && round2 == j4 && round5 == j3)) {
                                cOSArray = cOSArray4;
                                state = state3;
                                j = j2;
                                round = round4;
                                round3 = round5;
                            } else {
                                cOSArray = cOSArray4;
                                cOSArray.add((COSBase) COSInteger.get(j));
                                cOSArray.add((COSBase) COSInteger.get(round));
                                cOSArray.add((COSBase) COSInteger.get(j4));
                                cOSArray.add((COSBase) COSInteger.get(j3));
                                cOSArray.add((COSBase) COSInteger.get(j2));
                                state = State.FIRST;
                                j = j2;
                                round = round4;
                                round3 = round5;
                            }
                        } else {
                            cOSArray = cOSArray4;
                            int i3 = (j2 > (j + 1) ? 1 : (j2 == (j + 1) ? 0 : -1));
                            if (i3 == 0 && round4 == round && round2 == j4 && round5 == j3) {
                                state = State.SERIAL;
                                cOSArray.add((COSBase) cOSArray2);
                                cOSArray.add((COSBase) COSInteger.get(j));
                            } else if (i3 == 0) {
                                cOSArray2.add((COSBase) COSInteger.get(round));
                                cOSArray2.add((COSBase) COSInteger.get(j4));
                                cOSArray2.add((COSBase) COSInteger.get(j3));
                                state = state3;
                            } else {
                                state = State.FIRST;
                                cOSArray2.add((COSBase) COSInteger.get(round));
                                cOSArray2.add((COSBase) COSInteger.get(j4));
                                cOSArray2.add((COSBase) COSInteger.get(j3));
                                cOSArray.add((COSBase) cOSArray2);
                                cOSArray.add((COSBase) COSInteger.get(j2));
                            }
                            j = j2;
                            round = round4;
                            round3 = round5;
                        }
                    } else {
                        cOSArray = cOSArray4;
                        int i4 = (j2 > (j + 1) ? 1 : (j2 == (j + 1) ? 0 : -1));
                        if (i4 == 0 && round4 == round && round2 == j4 && round5 == j3) {
                            state = State.SERIAL;
                        } else if (i4 == 0) {
                            state = State.BRACKET;
                            cOSArray2 = new COSArray();
                            cOSArray2.add((COSBase) COSInteger.get(round));
                            cOSArray2.add((COSBase) COSInteger.get(j4));
                            cOSArray2.add((COSBase) COSInteger.get(j3));
                        } else {
                            cOSArray2 = new COSArray();
                            cOSArray2.add((COSBase) COSInteger.get(round));
                            cOSArray2.add((COSBase) COSInteger.get(j4));
                            cOSArray2.add((COSBase) COSInteger.get(j3));
                            cOSArray.add((COSBase) cOSArray2);
                            cOSArray.add((COSBase) COSInteger.get(j2));
                            state = state3;
                        }
                        j = j2;
                        round = round4;
                        round3 = round5;
                    }
                }
                i += 4;
                iArr2 = iArr;
                cOSArray3 = cOSArray;
                state2 = state;
                unitsPerEm = f;
            }
            State state4 = state2;
            COSArray cOSArray5 = cOSArray3;
            long j5 = round2;
            long j6 = round3;
            int i5 = C9916a.f60394a[state4.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        cOSArray5.add((COSBase) COSInteger.get(j));
                        cOSArray5.add((COSBase) COSInteger.get(round));
                        cOSArray5.add((COSBase) COSInteger.get(j5));
                        cOSArray5.add((COSBase) COSInteger.get(j6));
                    }
                } else {
                    cOSArray2.add((COSBase) COSInteger.get(round));
                    cOSArray2.add((COSBase) COSInteger.get(j5));
                    cOSArray2.add((COSBase) COSInteger.get(j6));
                    cOSArray5.add((COSBase) cOSArray2);
                }
            } else {
                COSArray cOSArray6 = new COSArray();
                cOSArray6.add((COSBase) COSInteger.get(round));
                cOSArray6.add((COSBase) COSInteger.get(j5));
                cOSArray6.add((COSBase) COSInteger.get(j6));
                cOSArray5.add((COSBase) cOSArray6);
            }
            return cOSArray5;
        }
        throw new IllegalArgumentException("length of values must be > 0");
    }

    /* renamed from: w */
    public final COSArray m32428w(int[] iArr) {
        State state;
        if (iArr.length != 0) {
            float unitsPerEm = 1000.0f / this.f1704b.getHeader().getUnitsPerEm();
            long j = iArr[0];
            int i = 1;
            long round = Math.round(iArr[1] * unitsPerEm);
            COSArray cOSArray = new COSArray();
            COSArray cOSArray2 = new COSArray();
            cOSArray2.add((COSBase) COSInteger.get(j));
            State state2 = State.FIRST;
            int i2 = 2;
            while (i2 < iArr.length) {
                long j2 = iArr[i2];
                int i3 = i2;
                long round2 = Math.round(iArr[i2 + 1] * unitsPerEm);
                int i4 = C9916a.f60394a[state2.ordinal()];
                if (i4 != i) {
                    if (i4 != 2) {
                        if (i4 == 3 && (j2 != j + 1 || round2 != round)) {
                            cOSArray2.add((COSBase) COSInteger.get(j));
                            cOSArray2.add((COSBase) COSInteger.get(round));
                            cOSArray2.add((COSBase) COSInteger.get(j2));
                            state = State.FIRST;
                            state2 = state;
                        }
                    } else {
                        int i5 = (j2 > (j + 1) ? 1 : (j2 == (j + 1) ? 0 : -1));
                        if (i5 == 0 && round2 == round) {
                            state = State.SERIAL;
                            cOSArray2.add((COSBase) cOSArray);
                            cOSArray2.add((COSBase) COSInteger.get(j));
                        } else if (i5 == 0) {
                            cOSArray.add((COSBase) COSInteger.get(round));
                        } else {
                            state = State.FIRST;
                            cOSArray.add((COSBase) COSInteger.get(round));
                            cOSArray2.add((COSBase) cOSArray);
                            cOSArray2.add((COSBase) COSInteger.get(j2));
                        }
                        state2 = state;
                    }
                } else {
                    int i6 = (j2 > (j + 1) ? 1 : (j2 == (j + 1) ? 0 : -1));
                    if (i6 == 0 && round2 == round) {
                        state = State.SERIAL;
                        state2 = state;
                    } else if (i6 == 0) {
                        State state3 = State.BRACKET;
                        COSArray cOSArray3 = new COSArray();
                        cOSArray3.add((COSBase) COSInteger.get(round));
                        state2 = state3;
                        cOSArray = cOSArray3;
                    } else {
                        COSArray cOSArray4 = new COSArray();
                        cOSArray4.add((COSBase) COSInteger.get(round));
                        cOSArray2.add((COSBase) cOSArray4);
                        cOSArray2.add((COSBase) COSInteger.get(j2));
                        cOSArray = cOSArray4;
                    }
                }
                round = round2;
                j = j2;
                i2 = i3 + 2;
                i = 1;
            }
            int i7 = C9916a.f60394a[state2.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        cOSArray2.add((COSBase) COSInteger.get(j));
                        cOSArray2.add((COSBase) COSInteger.get(round));
                    }
                } else {
                    cOSArray.add((COSBase) COSInteger.get(round));
                    cOSArray2.add((COSBase) cOSArray);
                }
            } else {
                COSArray cOSArray5 = new COSArray();
                cOSArray5.add((COSBase) COSInteger.get(round));
                cOSArray2.add((COSBase) cOSArray5);
            }
            return cOSArray2;
        }
        throw new IllegalArgumentException("length of widths must be > 0");
    }

    /* renamed from: x */
    public final COSDictionary m32427x(String str, String str2, int i) {
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDictionary.setString(COSName.REGISTRY, str);
        cOSDictionary.setString(COSName.ORDERING, str2);
        cOSDictionary.setInt(COSName.SUPPLEMENT, i);
        return cOSDictionary;
    }
}