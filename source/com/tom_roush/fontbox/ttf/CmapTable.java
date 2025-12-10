package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class CmapTable extends TTFTable {
    public static final int ENCODING_MAC_ROMAN = 0;
    public static final int ENCODING_UNICODE_1_0 = 0;
    public static final int ENCODING_UNICODE_1_1 = 1;
    public static final int ENCODING_UNICODE_2_0_BMP = 3;
    public static final int ENCODING_UNICODE_2_0_FULL = 4;
    public static final int ENCODING_WIN_BIG5 = 3;
    public static final int ENCODING_WIN_JOHAB = 6;
    public static final int ENCODING_WIN_PRC = 4;
    public static final int ENCODING_WIN_SHIFT_JIS = 2;
    public static final int ENCODING_WIN_SYMBOL = 0;
    public static final int ENCODING_WIN_UNICODE_BMP = 1;
    public static final int ENCODING_WIN_UNICODE_FULL = 10;
    public static final int ENCODING_WIN_WANSUNG = 5;
    public static final int PLATFORM_MACINTOSH = 1;
    public static final int PLATFORM_UNICODE = 0;
    public static final int PLATFORM_WINDOWS = 3;
    public static final String TAG = "cmap";

    /* renamed from: e */
    public CmapSubtable[] f59382e;

    public CmapTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        abstractC22790wQ1.mo844t();
        int mo844t = abstractC22790wQ1.mo844t();
        this.f59382e = new CmapSubtable[mo844t];
        for (int i = 0; i < mo844t; i++) {
            CmapSubtable cmapSubtable = new CmapSubtable();
            cmapSubtable.m32956c(abstractC22790wQ1);
            this.f59382e[i] = cmapSubtable;
        }
        int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
        for (int i2 = 0; i2 < mo844t; i2++) {
            this.f59382e[i2].m32955d(this, numberOfGlyphs, abstractC22790wQ1);
        }
        this.initialized = true;
    }

    public CmapSubtable[] getCmaps() {
        return this.f59382e;
    }

    public CmapSubtable getSubtable(int i, int i2) {
        CmapSubtable[] cmapSubtableArr;
        for (CmapSubtable cmapSubtable : this.f59382e) {
            if (cmapSubtable.getPlatformId() == i && cmapSubtable.getPlatformEncodingId() == i2) {
                return cmapSubtable;
            }
        }
        return null;
    }

    public void setCmaps(CmapSubtable[] cmapSubtableArr) {
        this.f59382e = cmapSubtableArr;
    }
}
