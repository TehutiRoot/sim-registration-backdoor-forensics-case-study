package com.tom_roush.fontbox.ttf;

import android.util.Log;
import java.io.EOFException;

/* loaded from: classes5.dex */
public class OS2WindowsMetricsTable extends TTFTable {
    public static final int FAMILY_CLASS_CLAREDON_SERIFS = 4;
    public static final int FAMILY_CLASS_FREEFORM_SERIFS = 7;
    public static final int FAMILY_CLASS_MODERN_SERIFS = 3;
    public static final int FAMILY_CLASS_NO_CLASSIFICATION = 0;
    public static final int FAMILY_CLASS_OLDSTYLE_SERIFS = 1;
    public static final int FAMILY_CLASS_ORNAMENTALS = 9;
    public static final int FAMILY_CLASS_SANS_SERIF = 8;
    public static final int FAMILY_CLASS_SCRIPTS = 10;
    public static final int FAMILY_CLASS_SLAB_SERIFS = 5;
    public static final int FAMILY_CLASS_SYMBOLIC = 12;
    public static final int FAMILY_CLASS_TRANSITIONAL_SERIFS = 2;
    public static final short FSTYPE_BITMAP_ONLY = 512;
    public static final short FSTYPE_EDITIBLE = 8;
    public static final short FSTYPE_NO_SUBSETTING = 256;
    public static final short FSTYPE_PREVIEW_AND_PRINT = 4;
    public static final short FSTYPE_RESTRICTED = 2;
    public static final String TAG = "OS/2";
    public static final int WEIGHT_CLASS_BLACK = 900;
    public static final int WEIGHT_CLASS_BOLD = 700;
    public static final int WEIGHT_CLASS_EXTRA_BOLD = 800;
    public static final int WEIGHT_CLASS_LIGHT = 300;
    public static final int WEIGHT_CLASS_MEDIUM = 500;
    public static final int WEIGHT_CLASS_NORMAL = 400;
    public static final int WEIGHT_CLASS_SEMI_BOLD = 600;
    public static final int WEIGHT_CLASS_THIN = 100;
    public static final int WEIGHT_CLASS_ULTRA_LIGHT = 200;
    public static final int WIDTH_CLASS_CONDENSED = 3;
    public static final int WIDTH_CLASS_EXPANDED = 7;
    public static final int WIDTH_CLASS_EXTRA_CONDENSED = 2;
    public static final int WIDTH_CLASS_EXTRA_EXPANDED = 8;
    public static final int WIDTH_CLASS_MEDIUM = 5;
    public static final int WIDTH_CLASS_SEMI_CONDENSED = 4;
    public static final int WIDTH_CLASS_SEMI_EXPANDED = 6;
    public static final int WIDTH_CLASS_ULTRA_CONDENSED = 1;
    public static final int WIDTH_CLASS_ULTRA_EXPANDED = 9;

    /* renamed from: A */
    public int f59529A;

    /* renamed from: B */
    public int f59530B;

    /* renamed from: C */
    public int f59531C;

    /* renamed from: D */
    public int f59532D;

    /* renamed from: E */
    public int f59533E;

    /* renamed from: F */
    public int f59534F;

    /* renamed from: G */
    public int f59535G;

    /* renamed from: H */
    public int f59536H;

    /* renamed from: I */
    public long f59537I;

    /* renamed from: J */
    public long f59538J;

    /* renamed from: K */
    public int f59539K;

    /* renamed from: L */
    public int f59540L;

    /* renamed from: M */
    public int f59541M;

    /* renamed from: N */
    public int f59542N;

    /* renamed from: O */
    public int f59543O;

    /* renamed from: e */
    public int f59544e;

    /* renamed from: f */
    public short f59545f;

    /* renamed from: g */
    public int f59546g;

    /* renamed from: h */
    public int f59547h;

    /* renamed from: i */
    public short f59548i;

    /* renamed from: j */
    public short f59549j;

    /* renamed from: k */
    public short f59550k;

    /* renamed from: l */
    public short f59551l;

    /* renamed from: m */
    public short f59552m;

    /* renamed from: n */
    public short f59553n;

    /* renamed from: o */
    public short f59554o;

    /* renamed from: p */
    public short f59555p;

    /* renamed from: q */
    public short f59556q;

    /* renamed from: r */
    public short f59557r;

    /* renamed from: s */
    public short f59558s;

    /* renamed from: t */
    public int f59559t;

    /* renamed from: u */
    public byte[] f59560u;

    /* renamed from: v */
    public long f59561v;

    /* renamed from: w */
    public long f59562w;

    /* renamed from: x */
    public long f59563x;

    /* renamed from: y */
    public long f59564y;

    /* renamed from: z */
    public String f59565z;

    public OS2WindowsMetricsTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
        this.f59560u = new byte[10];
        this.f59565z = "XXXX";
        this.f59537I = 0L;
        this.f59538J = 0L;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59544e = abstractC22790wQ1.mo844t();
        this.f59545f = abstractC22790wQ1.mo851m();
        this.f59546g = abstractC22790wQ1.mo844t();
        this.f59547h = abstractC22790wQ1.mo844t();
        this.f59548i = abstractC22790wQ1.mo851m();
        this.f59549j = abstractC22790wQ1.mo851m();
        this.f59550k = abstractC22790wQ1.mo851m();
        this.f59551l = abstractC22790wQ1.mo851m();
        this.f59552m = abstractC22790wQ1.mo851m();
        this.f59553n = abstractC22790wQ1.mo851m();
        this.f59554o = abstractC22790wQ1.mo851m();
        this.f59555p = abstractC22790wQ1.mo851m();
        this.f59556q = abstractC22790wQ1.mo851m();
        this.f59557r = abstractC22790wQ1.mo851m();
        this.f59558s = abstractC22790wQ1.mo851m();
        this.f59559t = abstractC22790wQ1.mo851m();
        this.f59560u = abstractC22790wQ1.m855i(10);
        this.f59561v = abstractC22790wQ1.m845s();
        this.f59562w = abstractC22790wQ1.m845s();
        this.f59563x = abstractC22790wQ1.m845s();
        this.f59564y = abstractC22790wQ1.m845s();
        this.f59565z = abstractC22790wQ1.m850n(4);
        this.f59529A = abstractC22790wQ1.mo844t();
        this.f59530B = abstractC22790wQ1.mo844t();
        this.f59531C = abstractC22790wQ1.mo844t();
        try {
            this.f59532D = abstractC22790wQ1.mo851m();
            this.f59533E = abstractC22790wQ1.mo851m();
            this.f59534F = abstractC22790wQ1.mo851m();
            this.f59535G = abstractC22790wQ1.mo844t();
            this.f59536H = abstractC22790wQ1.mo844t();
            if (this.f59544e >= 1) {
                try {
                    this.f59537I = abstractC22790wQ1.m845s();
                    this.f59538J = abstractC22790wQ1.m845s();
                } catch (EOFException e) {
                    this.f59544e = 0;
                    Log.w("PdfBox-Android", "Could not read all expected parts of version >= 1, setting version to 0", e);
                    this.initialized = true;
                    return;
                }
            }
            if (this.f59544e >= 2) {
                try {
                    this.f59539K = abstractC22790wQ1.mo851m();
                    this.f59540L = abstractC22790wQ1.mo851m();
                    this.f59541M = abstractC22790wQ1.mo844t();
                    this.f59542N = abstractC22790wQ1.mo844t();
                    this.f59543O = abstractC22790wQ1.mo844t();
                } catch (EOFException e2) {
                    this.f59544e = 1;
                    Log.w("PdfBox-Android", "Could not read all expected parts of version >= 2, setting version to 1", e2);
                    this.initialized = true;
                    return;
                }
            }
            this.initialized = true;
        } catch (EOFException unused) {
            this.initialized = true;
        }
    }

    public String getAchVendId() {
        return this.f59565z;
    }

    public short getAverageCharWidth() {
        return this.f59545f;
    }

    public int getBreakChar() {
        return this.f59542N;
    }

    public int getCapHeight() {
        return this.f59540L;
    }

    public long getCodePageRange1() {
        return this.f59537I;
    }

    public long getCodePageRange2() {
        return this.f59538J;
    }

    public int getDefaultChar() {
        return this.f59541M;
    }

    public int getFamilyClass() {
        return this.f59559t;
    }

    public int getFirstCharIndex() {
        return this.f59530B;
    }

    public int getFsSelection() {
        return this.f59529A;
    }

    public short getFsType() {
        return this.f59548i;
    }

    public int getHeight() {
        return this.f59539K;
    }

    public int getLastCharIndex() {
        return this.f59531C;
    }

    public int getMaxContext() {
        return this.f59543O;
    }

    public byte[] getPanose() {
        return this.f59560u;
    }

    public short getStrikeoutPosition() {
        return this.f59558s;
    }

    public short getStrikeoutSize() {
        return this.f59557r;
    }

    public short getSubscriptXOffset() {
        return this.f59551l;
    }

    public short getSubscriptXSize() {
        return this.f59549j;
    }

    public short getSubscriptYOffset() {
        return this.f59552m;
    }

    public short getSubscriptYSize() {
        return this.f59550k;
    }

    public short getSuperscriptXOffset() {
        return this.f59555p;
    }

    public short getSuperscriptXSize() {
        return this.f59553n;
    }

    public short getSuperscriptYOffset() {
        return this.f59556q;
    }

    public short getSuperscriptYSize() {
        return this.f59554o;
    }

    public int getTypoAscender() {
        return this.f59532D;
    }

    public int getTypoDescender() {
        return this.f59533E;
    }

    public int getTypoLineGap() {
        return this.f59534F;
    }

    public long getUnicodeRange1() {
        return this.f59561v;
    }

    public long getUnicodeRange2() {
        return this.f59562w;
    }

    public long getUnicodeRange3() {
        return this.f59563x;
    }

    public long getUnicodeRange4() {
        return this.f59564y;
    }

    public int getVersion() {
        return this.f59544e;
    }

    public int getWeightClass() {
        return this.f59546g;
    }

    public int getWidthClass() {
        return this.f59547h;
    }

    public int getWinAscent() {
        return this.f59535G;
    }

    public int getWinDescent() {
        return this.f59536H;
    }

    public void setAchVendId(String str) {
        this.f59565z = str;
    }

    public void setAverageCharWidth(short s) {
        this.f59545f = s;
    }

    public void setCodePageRange1(long j) {
        this.f59537I = j;
    }

    public void setCodePageRange2(long j) {
        this.f59538J = j;
    }

    public void setFamilyClass(int i) {
        this.f59559t = i;
    }

    public void setFirstCharIndex(int i) {
        this.f59530B = i;
    }

    public void setFsSelection(int i) {
        this.f59529A = i;
    }

    public void setFsType(short s) {
        this.f59548i = s;
    }

    public void setLastCharIndex(int i) {
        this.f59531C = i;
    }

    public void setPanose(byte[] bArr) {
        this.f59560u = bArr;
    }

    public void setStrikeoutPosition(short s) {
        this.f59558s = s;
    }

    public void setStrikeoutSize(short s) {
        this.f59557r = s;
    }

    public void setSubscriptXOffset(short s) {
        this.f59551l = s;
    }

    public void setSubscriptXSize(short s) {
        this.f59549j = s;
    }

    public void setSubscriptYOffset(short s) {
        this.f59552m = s;
    }

    public void setSubscriptYSize(short s) {
        this.f59550k = s;
    }

    public void setSuperscriptXOffset(short s) {
        this.f59555p = s;
    }

    public void setSuperscriptXSize(short s) {
        this.f59553n = s;
    }

    public void setSuperscriptYOffset(short s) {
        this.f59556q = s;
    }

    public void setSuperscriptYSize(short s) {
        this.f59554o = s;
    }

    public void setTypoAscender(int i) {
        this.f59532D = i;
    }

    public void setTypoDescender(int i) {
        this.f59533E = i;
    }

    public void setTypoLineGap(int i) {
        this.f59534F = i;
    }

    public void setUnicodeRange1(long j) {
        this.f59561v = j;
    }

    public void setUnicodeRange2(long j) {
        this.f59562w = j;
    }

    public void setUnicodeRange3(long j) {
        this.f59563x = j;
    }

    public void setUnicodeRange4(long j) {
        this.f59564y = j;
    }

    public void setVersion(int i) {
        this.f59544e = i;
    }

    public void setWeightClass(int i) {
        this.f59546g = i;
    }

    public void setWidthClass(int i) {
        this.f59547h = i;
    }

    public void setWinAscent(int i) {
        this.f59535G = i;
    }

    public void setWinDescent(int i) {
        this.f59536H = i;
    }
}
