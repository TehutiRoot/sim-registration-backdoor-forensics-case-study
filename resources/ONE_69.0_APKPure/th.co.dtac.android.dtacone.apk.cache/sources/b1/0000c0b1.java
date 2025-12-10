package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class VerticalHeaderTable extends TTFTable {
    public static final String TAG = "vhea";

    /* renamed from: e */
    public float f59618e;

    /* renamed from: f */
    public short f59619f;

    /* renamed from: g */
    public short f59620g;

    /* renamed from: h */
    public short f59621h;

    /* renamed from: i */
    public int f59622i;

    /* renamed from: j */
    public short f59623j;

    /* renamed from: k */
    public short f59624k;

    /* renamed from: l */
    public short f59625l;

    /* renamed from: m */
    public short f59626m;

    /* renamed from: n */
    public short f59627n;

    /* renamed from: o */
    public short f59628o;

    /* renamed from: p */
    public short f59629p;

    /* renamed from: q */
    public short f59630q;

    /* renamed from: r */
    public short f59631r;

    /* renamed from: s */
    public short f59632s;

    /* renamed from: t */
    public short f59633t;

    /* renamed from: u */
    public int f59634u;

    public VerticalHeaderTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        this.f59618e = abstractC22342tR1.m22689j();
        this.f59619f = abstractC22342tR1.mo22686m();
        this.f59620g = abstractC22342tR1.mo22686m();
        this.f59621h = abstractC22342tR1.mo22686m();
        this.f59622i = abstractC22342tR1.mo22679t();
        this.f59623j = abstractC22342tR1.mo22686m();
        this.f59624k = abstractC22342tR1.mo22686m();
        this.f59625l = abstractC22342tR1.mo22686m();
        this.f59626m = abstractC22342tR1.mo22686m();
        this.f59627n = abstractC22342tR1.mo22686m();
        this.f59628o = abstractC22342tR1.mo22686m();
        this.f59629p = abstractC22342tR1.mo22686m();
        this.f59630q = abstractC22342tR1.mo22686m();
        this.f59631r = abstractC22342tR1.mo22686m();
        this.f59632s = abstractC22342tR1.mo22686m();
        this.f59633t = abstractC22342tR1.mo22686m();
        this.f59634u = abstractC22342tR1.mo22679t();
        this.initialized = true;
    }

    public int getAdvanceHeightMax() {
        return this.f59622i;
    }

    public short getAscender() {
        return this.f59619f;
    }

    public short getCaretOffset() {
        return this.f59628o;
    }

    public short getCaretSlopeRise() {
        return this.f59626m;
    }

    public short getCaretSlopeRun() {
        return this.f59627n;
    }

    public short getDescender() {
        return this.f59620g;
    }

    public short getLineGap() {
        return this.f59621h;
    }

    public short getMetricDataFormat() {
        return this.f59633t;
    }

    public short getMinBottomSideBearing() {
        return this.f59624k;
    }

    public short getMinTopSideBearing() {
        return this.f59623j;
    }

    public int getNumberOfVMetrics() {
        return this.f59634u;
    }

    public short getReserved1() {
        return this.f59629p;
    }

    public short getReserved2() {
        return this.f59630q;
    }

    public short getReserved3() {
        return this.f59631r;
    }

    public short getReserved4() {
        return this.f59632s;
    }

    public float getVersion() {
        return this.f59618e;
    }

    public short getYMaxExtent() {
        return this.f59625l;
    }
}