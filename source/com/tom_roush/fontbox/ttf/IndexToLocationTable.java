package com.tom_roush.fontbox.ttf;

import java.io.IOException;

/* loaded from: classes5.dex */
public class IndexToLocationTable extends TTFTable {
    public static final String TAG = "loca";

    /* renamed from: e */
    public long[] f59494e;

    public IndexToLocationTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        HeaderTable header = trueTypeFont.getHeader();
        if (header != null) {
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs() + 1;
            this.f59494e = new long[numberOfGlyphs];
            for (int i = 0; i < numberOfGlyphs; i++) {
                if (header.getIndexToLocFormat() == 0) {
                    this.f59494e[i] = abstractC22790wQ1.mo844t() * 2;
                } else if (header.getIndexToLocFormat() == 1) {
                    this.f59494e[i] = abstractC22790wQ1.m845s();
                } else {
                    throw new IOException("Error:TTF.loca unknown offset format.");
                }
            }
            this.initialized = true;
            return;
        }
        throw new IOException("Could not get head table");
    }

    public long[] getOffsets() {
        return this.f59494e;
    }

    public void setOffsets(long[] jArr) {
        this.f59494e = jArr;
    }
}
