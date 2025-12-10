package com.tom_roush.fontbox.ttf;

import java.io.IOException;

/* loaded from: classes5.dex */
public class GlyphTable extends TTFTable {
    public static final String TAG = "glyf";

    /* renamed from: e */
    public GlyphData[] f59451e;

    /* renamed from: f */
    public AbstractC22790wQ1 f59452f;

    /* renamed from: g */
    public IndexToLocationTable f59453g;

    /* renamed from: h */
    public int f59454h;

    /* renamed from: i */
    public int f59455i;

    public GlyphTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
        this.f59455i = 0;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59453g = trueTypeFont.getIndexToLocation();
        int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
        this.f59454h = numberOfGlyphs;
        if (numberOfGlyphs < 5000) {
            this.f59451e = new GlyphData[numberOfGlyphs];
        }
        this.f59452f = abstractC22790wQ1;
        this.initialized = true;
    }

    /* renamed from: f */
    public final GlyphData m32908f(int i) {
        int leftSideBearing;
        GlyphData glyphData = new GlyphData();
        HorizontalMetricsTable horizontalMetrics = this.font.getHorizontalMetrics();
        if (horizontalMetrics == null) {
            leftSideBearing = 0;
        } else {
            leftSideBearing = horizontalMetrics.getLeftSideBearing(i);
        }
        glyphData.m32930a(this, this.f59452f, leftSideBearing);
        if (glyphData.getDescription().isComposite()) {
            glyphData.getDescription().resolve();
        }
        return glyphData;
    }

    public GlyphData getGlyph(int i) throws IOException {
        GlyphData m32908f;
        int i2;
        GlyphData glyphData;
        if (i >= 0 && i < this.f59454h) {
            GlyphData[] glyphDataArr = this.f59451e;
            if (glyphDataArr != null && (glyphData = glyphDataArr[i]) != null) {
                return glyphData;
            }
            synchronized (this.f59452f) {
                try {
                    long[] offsets = this.f59453g.getOffsets();
                    if (offsets[i] == offsets[i + 1]) {
                        m32908f = new GlyphData();
                        m32908f.m32929b();
                    } else {
                        long mo858b = this.f59452f.mo858b();
                        this.f59452f.seek(getOffset() + offsets[i]);
                        m32908f = m32908f(i);
                        this.f59452f.seek(mo858b);
                    }
                    GlyphData[] glyphDataArr2 = this.f59451e;
                    if (glyphDataArr2 != null && glyphDataArr2[i] == null && (i2 = this.f59455i) < 100) {
                        glyphDataArr2[i] = m32908f;
                        this.f59455i = i2 + 1;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m32908f;
        }
        return null;
    }

    @Deprecated
    public GlyphData[] getGlyphs() throws IOException {
        GlyphData[] glyphDataArr;
        synchronized (this.f59452f) {
            try {
                long[] offsets = this.f59453g.getOffsets();
                long j = offsets[this.f59454h];
                long offset = getOffset();
                if (this.f59451e == null) {
                    this.f59451e = new GlyphData[this.f59454h];
                }
                int i = 0;
                while (i < this.f59454h && (j == 0 || j != offsets[i])) {
                    int i2 = i + 1;
                    long j2 = offsets[i2];
                    long j3 = offsets[i];
                    if (j2 > j3 && this.f59451e[i] == null) {
                        this.f59452f.seek(j3 + offset);
                        GlyphData[] glyphDataArr2 = this.f59451e;
                        if (glyphDataArr2[i] == null) {
                            this.f59455i++;
                        }
                        glyphDataArr2[i] = m32908f(i);
                    }
                    i = i2;
                }
                this.initialized = true;
                glyphDataArr = this.f59451e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return glyphDataArr;
    }

    public void setGlyphs(GlyphData[] glyphDataArr) {
        this.f59451e = glyphDataArr;
    }
}
