package com.tom_roush.fontbox.ttf;

import java.io.IOException;

/* loaded from: classes5.dex */
public class VerticalMetricsTable extends TTFTable {
    public static final String TAG = "vmtx";

    /* renamed from: e */
    public int[] f59623e;

    /* renamed from: f */
    public short[] f59624f;

    /* renamed from: g */
    public short[] f59625g;

    /* renamed from: h */
    public int f59626h;

    public VerticalMetricsTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        VerticalHeaderTable verticalHeader = trueTypeFont.getVerticalHeader();
        if (verticalHeader != null) {
            this.f59626h = verticalHeader.getNumberOfVMetrics();
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
            int i = this.f59626h;
            this.f59623e = new int[i];
            this.f59624f = new short[i];
            int i2 = 0;
            for (int i3 = 0; i3 < this.f59626h; i3++) {
                this.f59623e[i3] = abstractC22790wQ1.mo844t();
                this.f59624f[i3] = abstractC22790wQ1.mo851m();
                i2 += 4;
            }
            if (i2 < getLength()) {
                int i4 = numberOfGlyphs - this.f59626h;
                if (i4 >= 0) {
                    numberOfGlyphs = i4;
                }
                this.f59625g = new short[numberOfGlyphs];
                for (int i5 = 0; i5 < numberOfGlyphs; i5++) {
                    if (i2 < getLength()) {
                        this.f59625g[i5] = abstractC22790wQ1.mo851m();
                        i2 += 2;
                    }
                }
            }
            this.initialized = true;
            return;
        }
        throw new IOException("Could not get vhea table");
    }

    public int getAdvanceHeight(int i) {
        if (i < this.f59626h) {
            return this.f59623e[i];
        }
        int[] iArr = this.f59623e;
        return iArr[iArr.length - 1];
    }

    public int getTopSideBearing(int i) {
        int i2 = this.f59626h;
        if (i < i2) {
            return this.f59624f[i];
        }
        return this.f59625g[i - i2];
    }
}
