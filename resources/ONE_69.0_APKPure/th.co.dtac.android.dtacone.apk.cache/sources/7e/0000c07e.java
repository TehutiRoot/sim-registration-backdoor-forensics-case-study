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
    public CmapSubtable[] f59394e;

    public CmapTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        abstractC22342tR1.mo22679t();
        int mo22679t = abstractC22342tR1.mo22679t();
        this.f59394e = new CmapSubtable[mo22679t];
        for (int i = 0; i < mo22679t; i++) {
            CmapSubtable cmapSubtable = new CmapSubtable();
            cmapSubtable.m32948c(abstractC22342tR1);
            this.f59394e[i] = cmapSubtable;
        }
        int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
        for (int i2 = 0; i2 < mo22679t; i2++) {
            this.f59394e[i2].m32947d(this, numberOfGlyphs, abstractC22342tR1);
        }
        this.initialized = true;
    }

    public CmapSubtable[] getCmaps() {
        return this.f59394e;
    }

    public CmapSubtable getSubtable(int i, int i2) {
        CmapSubtable[] cmapSubtableArr;
        for (CmapSubtable cmapSubtable : this.f59394e) {
            if (cmapSubtable.getPlatformId() == i && cmapSubtable.getPlatformEncodingId() == i2) {
                return cmapSubtable;
            }
        }
        return null;
    }

    public void setCmaps(CmapSubtable[] cmapSubtableArr) {
        this.f59394e = cmapSubtableArr;
    }
}