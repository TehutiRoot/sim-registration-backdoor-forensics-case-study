package com.tom_roush.fontbox.ttf;

import java.io.IOException;

/* loaded from: classes5.dex */
public class HorizontalMetricsTable extends TTFTable {
    public static final String TAG = "hmtx";

    /* renamed from: e */
    public int[] f59490e;

    /* renamed from: f */
    public short[] f59491f;

    /* renamed from: g */
    public short[] f59492g;

    /* renamed from: h */
    public int f59493h;

    public HorizontalMetricsTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        int i;
        HorizontalHeaderTable horizontalHeader = trueTypeFont.getHorizontalHeader();
        if (horizontalHeader != null) {
            this.f59493h = horizontalHeader.getNumberOfHMetrics();
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
            int i2 = this.f59493h;
            this.f59490e = new int[i2];
            this.f59491f = new short[i2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = this.f59493h;
                if (i3 >= i) {
                    break;
                }
                this.f59490e[i3] = abstractC22790wQ1.mo844t();
                this.f59491f[i3] = abstractC22790wQ1.mo851m();
                i4 += 4;
                i3++;
            }
            int i5 = numberOfGlyphs - i;
            if (i5 >= 0) {
                numberOfGlyphs = i5;
            }
            this.f59492g = new short[numberOfGlyphs];
            if (i4 < getLength()) {
                for (int i6 = 0; i6 < numberOfGlyphs; i6++) {
                    if (i4 < getLength()) {
                        this.f59492g[i6] = abstractC22790wQ1.mo851m();
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
        if (i < this.f59493h) {
            return this.f59490e[i];
        }
        int[] iArr = this.f59490e;
        return iArr[iArr.length - 1];
    }

    public int getLeftSideBearing(int i) {
        int i2 = this.f59493h;
        if (i < i2) {
            return this.f59491f[i];
        }
        return this.f59492g[i - i2];
    }
}
