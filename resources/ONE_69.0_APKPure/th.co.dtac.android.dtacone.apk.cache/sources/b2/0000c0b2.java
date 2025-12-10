package com.tom_roush.fontbox.ttf;

import java.io.IOException;

/* loaded from: classes5.dex */
public class VerticalMetricsTable extends TTFTable {
    public static final String TAG = "vmtx";

    /* renamed from: e */
    public int[] f59635e;

    /* renamed from: f */
    public short[] f59636f;

    /* renamed from: g */
    public short[] f59637g;

    /* renamed from: h */
    public int f59638h;

    public VerticalMetricsTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        VerticalHeaderTable verticalHeader = trueTypeFont.getVerticalHeader();
        if (verticalHeader != null) {
            this.f59638h = verticalHeader.getNumberOfVMetrics();
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
            int i = this.f59638h;
            this.f59635e = new int[i];
            this.f59636f = new short[i];
            int i2 = 0;
            for (int i3 = 0; i3 < this.f59638h; i3++) {
                this.f59635e[i3] = abstractC22342tR1.mo22679t();
                this.f59636f[i3] = abstractC22342tR1.mo22686m();
                i2 += 4;
            }
            if (i2 < getLength()) {
                int i4 = numberOfGlyphs - this.f59638h;
                if (i4 >= 0) {
                    numberOfGlyphs = i4;
                }
                this.f59637g = new short[numberOfGlyphs];
                for (int i5 = 0; i5 < numberOfGlyphs; i5++) {
                    if (i2 < getLength()) {
                        this.f59637g[i5] = abstractC22342tR1.mo22686m();
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
        if (i < this.f59638h) {
            return this.f59635e[i];
        }
        int[] iArr = this.f59635e;
        return iArr[iArr.length - 1];
    }

    public int getTopSideBearing(int i) {
        int i2 = this.f59638h;
        if (i < i2) {
            return this.f59636f[i];
        }
        return this.f59637g[i - i2];
    }
}