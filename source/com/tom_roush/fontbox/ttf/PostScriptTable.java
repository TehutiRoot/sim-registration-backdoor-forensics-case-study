package com.tom_roush.fontbox.ttf;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PostScriptTable extends TTFTable {
    public static final String TAG = "post";

    /* renamed from: e */
    public float f59570e;

    /* renamed from: f */
    public float f59571f;

    /* renamed from: g */
    public short f59572g;

    /* renamed from: h */
    public short f59573h;

    /* renamed from: i */
    public long f59574i;

    /* renamed from: j */
    public long f59575j;

    /* renamed from: k */
    public long f59576k;

    /* renamed from: l */
    public long f59577l;

    /* renamed from: m */
    public long f59578m;

    /* renamed from: n */
    public String[] f59579n;

    public PostScriptTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
        this.f59579n = null;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        String[] strArr;
        this.f59570e = abstractC22790wQ1.m854j();
        this.f59571f = abstractC22790wQ1.m854j();
        this.f59572g = abstractC22790wQ1.mo851m();
        this.f59573h = abstractC22790wQ1.mo851m();
        this.f59574i = abstractC22790wQ1.m845s();
        this.f59575j = abstractC22790wQ1.m845s();
        this.f59576k = abstractC22790wQ1.m845s();
        this.f59577l = abstractC22790wQ1.m845s();
        this.f59578m = abstractC22790wQ1.m845s();
        float f = this.f59570e;
        int i = 0;
        if (f == 1.0f) {
            String[] strArr2 = new String[WGL4Names.NUMBER_OF_MAC_GLYPHS];
            this.f59579n = strArr2;
            System.arraycopy(WGL4Names.MAC_GLYPH_NAMES, 0, strArr2, 0, WGL4Names.NUMBER_OF_MAC_GLYPHS);
        } else if (f == 2.0f) {
            int mo844t = abstractC22790wQ1.mo844t();
            int[] iArr = new int[mo844t];
            this.f59579n = new String[mo844t];
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < mo844t; i3++) {
                int mo844t2 = abstractC22790wQ1.mo844t();
                iArr[i3] = mo844t2;
                if (mo844t2 <= 32767) {
                    i2 = Math.max(i2, mo844t2);
                }
            }
            if (i2 >= 258) {
                int i4 = i2 - 257;
                strArr = new String[i4];
                int i5 = 0;
                while (i5 < i4) {
                    try {
                        strArr[i5] = abstractC22790wQ1.m850n(abstractC22790wQ1.m847q());
                        i5++;
                    } catch (IOException e) {
                        Log.w("PdfBox-Android", "Error reading names in PostScript table at entry " + i5 + " of " + i4 + ", setting remaining entries to .notdef", e);
                        while (i5 < i4) {
                            strArr[i5] = ".notdef";
                            i5++;
                        }
                    }
                }
            } else {
                strArr = null;
            }
            while (i < mo844t) {
                int i6 = iArr[i];
                if (i6 >= 0 && i6 < 258) {
                    this.f59579n[i] = WGL4Names.MAC_GLYPH_NAMES[i6];
                } else if (i6 >= 258 && i6 <= 32767) {
                    this.f59579n[i] = strArr[i6 - 258];
                } else {
                    this.f59579n[i] = ".undefined";
                }
                i++;
            }
        } else if (f == 2.5f) {
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
            int[] iArr2 = new int[numberOfGlyphs];
            int i7 = 0;
            while (i7 < numberOfGlyphs) {
                int i8 = i7 + 1;
                iArr2[i7] = abstractC22790wQ1.m852l() + i8;
                i7 = i8;
            }
            this.f59579n = new String[numberOfGlyphs];
            while (true) {
                String[] strArr3 = this.f59579n;
                if (i >= strArr3.length) {
                    break;
                }
                int i9 = iArr2[i];
                if (i9 >= 0 && i9 < 258) {
                    String str = WGL4Names.MAC_GLYPH_NAMES[i9];
                    if (str != null) {
                        strArr3[i] = str;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("incorrect glyph name index ");
                    sb.append(i9);
                    sb.append(", valid numbers 0..");
                    sb.append(WGL4Names.NUMBER_OF_MAC_GLYPHS);
                }
                i++;
            }
        } else if (f == 3.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No PostScript name information is provided for the font ");
            sb2.append(this.font.getName());
        }
        this.initialized = true;
    }

    public float getFormatType() {
        return this.f59570e;
    }

    public String[] getGlyphNames() {
        return this.f59579n;
    }

    public long getIsFixedPitch() {
        return this.f59574i;
    }

    public float getItalicAngle() {
        return this.f59571f;
    }

    public long getMaxMemType1() {
        return this.f59578m;
    }

    public long getMaxMemType42() {
        return this.f59576k;
    }

    public long getMinMemType1() {
        return this.f59577l;
    }

    public long getMinMemType42() {
        return this.f59575j;
    }

    public String getName(int i) {
        String[] strArr;
        if (i >= 0 && (strArr = this.f59579n) != null && i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public short getUnderlinePosition() {
        return this.f59572g;
    }

    public short getUnderlineThickness() {
        return this.f59573h;
    }

    public void setFormatType(float f) {
        this.f59570e = f;
    }

    public void setGlyphNames(String[] strArr) {
        this.f59579n = strArr;
    }

    public void setIsFixedPitch(long j) {
        this.f59574i = j;
    }

    public void setItalicAngle(float f) {
        this.f59571f = f;
    }

    public void setMaxMemType1(long j) {
        this.f59578m = j;
    }

    public void setMaxMemType42(long j) {
        this.f59576k = j;
    }

    public void setMimMemType1(long j) {
        this.f59577l = j;
    }

    public void setMinMemType42(long j) {
        this.f59575j = j;
    }

    public void setUnderlinePosition(short s) {
        this.f59572g = s;
    }

    public void setUnderlineThickness(short s) {
        this.f59573h = s;
    }
}
