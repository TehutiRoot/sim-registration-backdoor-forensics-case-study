package com.tom_roush.fontbox.ttf;

import java.io.IOException;

/* loaded from: classes5.dex */
public class HorizontalMetricsTable extends TTFTable {
    public static final String TAG = "hmtx";

    /* renamed from: e */
    public int[] f59502e;

    /* renamed from: f */
    public short[] f59503f;

    /* renamed from: g */
    public short[] f59504g;

    /* renamed from: h */
    public int f59505h;

    public HorizontalMetricsTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        int i;
        HorizontalHeaderTable horizontalHeader = trueTypeFont.getHorizontalHeader();
        if (horizontalHeader != null) {
            this.f59505h = horizontalHeader.getNumberOfHMetrics();
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
            int i2 = this.f59505h;
            this.f59502e = new int[i2];
            this.f59503f = new short[i2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = this.f59505h;
                if (i3 >= i) {
                    break;
                }
                this.f59502e[i3] = abstractC22342tR1.mo22679t();
                this.f59503f[i3] = abstractC22342tR1.mo22686m();
                i4 += 4;
                i3++;
            }
            int i5 = numberOfGlyphs - i;
            if (i5 >= 0) {
                numberOfGlyphs = i5;
            }
            this.f59504g = new short[numberOfGlyphs];
            if (i4 < getLength()) {
                for (int i6 = 0; i6 < numberOfGlyphs; i6++) {
                    if (i4 < getLength()) {
                        this.f59504g[i6] = abstractC22342tR1.mo22686m();
                        i4 += 2;
                    }
                }
            }
            this.initialized = true;
            return;
        }
        throw new IOException("Could not get hmtx table");
    }

    public int getAdvanceWidth(int i) {
        if (i < this.f59505h) {
            return this.f59502e[i];
        }
        int[] iArr = this.f59502e;
        return iArr[iArr.length - 1];
    }

    public int getLeftSideBearing(int i) {
        int i2 = this.f59505h;
        if (i < i2) {
            return this.f59503f[i];
        }
        return this.f59504g[i - i2];
    }
}