package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class VerticalHeaderTable extends TTFTable {
    public static final String TAG = "vhea";

    /* renamed from: e */
    public float f59606e;

    /* renamed from: f */
    public short f59607f;

    /* renamed from: g */
    public short f59608g;

    /* renamed from: h */
    public short f59609h;

    /* renamed from: i */
    public int f59610i;

    /* renamed from: j */
    public short f59611j;

    /* renamed from: k */
    public short f59612k;

    /* renamed from: l */
    public short f59613l;

    /* renamed from: m */
    public short f59614m;

    /* renamed from: n */
    public short f59615n;

    /* renamed from: o */
    public short f59616o;

    /* renamed from: p */
    public short f59617p;

    /* renamed from: q */
    public short f59618q;

    /* renamed from: r */
    public short f59619r;

    /* renamed from: s */
    public short f59620s;

    /* renamed from: t */
    public short f59621t;

    /* renamed from: u */
    public int f59622u;

    public VerticalHeaderTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59606e = abstractC22790wQ1.m854j();
        this.f59607f = abstractC22790wQ1.mo851m();
        this.f59608g = abstractC22790wQ1.mo851m();
        this.f59609h = abstractC22790wQ1.mo851m();
        this.f59610i = abstractC22790wQ1.mo844t();
        this.f59611j = abstractC22790wQ1.mo851m();
        this.f59612k = abstractC22790wQ1.mo851m();
        this.f59613l = abstractC22790wQ1.mo851m();
        this.f59614m = abstractC22790wQ1.mo851m();
        this.f59615n = abstractC22790wQ1.mo851m();
        this.f59616o = abstractC22790wQ1.mo851m();
        this.f59617p = abstractC22790wQ1.mo851m();
        this.f59618q = abstractC22790wQ1.mo851m();
        this.f59619r = abstractC22790wQ1.mo851m();
        this.f59620s = abstractC22790wQ1.mo851m();
        this.f59621t = abstractC22790wQ1.mo851m();
        this.f59622u = abstractC22790wQ1.mo844t();
        this.initialized = true;
    }

    public int getAdvanceHeightMax() {
        return this.f59610i;
    }

    public short getAscender() {
        return this.f59607f;
    }

    public short getCaretOffset() {
        return this.f59616o;
    }

    public short getCaretSlopeRise() {
        return this.f59614m;
    }

    public short getCaretSlopeRun() {
        return this.f59615n;
    }

    public short getDescender() {
        return this.f59608g;
    }

    public short getLineGap() {
        return this.f59609h;
    }

    public short getMetricDataFormat() {
        return this.f59621t;
    }

    public short getMinBottomSideBearing() {
        return this.f59612k;
    }

    public short getMinTopSideBearing() {
        return this.f59611j;
    }

    public int getNumberOfVMetrics() {
        return this.f59622u;
    }

    public short getReserved1() {
        return this.f59617p;
    }

    public short getReserved2() {
        return this.f59618q;
    }

    public short getReserved3() {
        return this.f59619r;
    }

    public short getReserved4() {
        return this.f59620s;
    }

    public float getVersion() {
        return this.f59606e;
    }

    public short getYMaxExtent() {
        return this.f59613l;
    }
}
