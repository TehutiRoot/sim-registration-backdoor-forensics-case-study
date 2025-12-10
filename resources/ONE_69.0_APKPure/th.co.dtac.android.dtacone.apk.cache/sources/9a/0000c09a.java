package com.tom_roush.fontbox.ttf;

import java.io.IOException;

/* loaded from: classes5.dex */
public class IndexToLocationTable extends TTFTable {
    public static final String TAG = "loca";

    /* renamed from: e */
    public long[] f59506e;

    public IndexToLocationTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        HeaderTable header = trueTypeFont.getHeader();
        if (header != null) {
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs() + 1;
            this.f59506e = new long[numberOfGlyphs];
            for (int i = 0; i < numberOfGlyphs; i++) {
                if (header.getIndexToLocFormat() == 0) {
                    this.f59506e[i] = abstractC22342tR1.mo22679t() * 2;
                } else if (header.getIndexToLocFormat() == 1) {
                    this.f59506e[i] = abstractC22342tR1.m22680s();
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
        return this.f59506e;
    }

    public void setOffsets(long[] jArr) {
        this.f59506e = jArr;
    }
}