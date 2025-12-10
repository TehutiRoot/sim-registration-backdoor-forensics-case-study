package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class HorizontalHeaderTable extends TTFTable {
    public static final String TAG = "hhea";

    /* renamed from: e */
    public float f59473e;

    /* renamed from: f */
    public short f59474f;

    /* renamed from: g */
    public short f59475g;

    /* renamed from: h */
    public short f59476h;

    /* renamed from: i */
    public int f59477i;

    /* renamed from: j */
    public short f59478j;

    /* renamed from: k */
    public short f59479k;

    /* renamed from: l */
    public short f59480l;

    /* renamed from: m */
    public short f59481m;

    /* renamed from: n */
    public short f59482n;

    /* renamed from: o */
    public short f59483o;

    /* renamed from: p */
    public short f59484p;

    /* renamed from: q */
    public short f59485q;

    /* renamed from: r */
    public short f59486r;

    /* renamed from: s */
    public short f59487s;

    /* renamed from: t */
    public short f59488t;

    /* renamed from: u */
    public int f59489u;

    public HorizontalHeaderTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59473e = abstractC22790wQ1.m854j();
        this.f59474f = abstractC22790wQ1.mo851m();
        this.f59475g = abstractC22790wQ1.mo851m();
        this.f59476h = abstractC22790wQ1.mo851m();
        this.f59477i = abstractC22790wQ1.mo844t();
        this.f59478j = abstractC22790wQ1.mo851m();
        this.f59479k = abstractC22790wQ1.mo851m();
        this.f59480l = abstractC22790wQ1.mo851m();
        this.f59481m = abstractC22790wQ1.mo851m();
        this.f59482n = abstractC22790wQ1.mo851m();
        this.f59483o = abstractC22790wQ1.mo851m();
        this.f59484p = abstractC22790wQ1.mo851m();
        this.f59485q = abstractC22790wQ1.mo851m();
        this.f59486r = abstractC22790wQ1.mo851m();
        this.f59487s = abstractC22790wQ1.mo851m();
        this.f59488t = abstractC22790wQ1.mo851m();
        this.f59489u = abstractC22790wQ1.mo844t();
        this.initialized = true;
    }

    public int getAdvanceWidthMax() {
        return this.f59477i;
    }

    public short getAscender() {
        return this.f59474f;
    }

    public short getCaretSlopeRise() {
        return this.f59481m;
    }

    public short getCaretSlopeRun() {
        return this.f59482n;
    }

    public short getDescender() {
        return this.f59475g;
    }

    public short getLineGap() {
        return this.f59476h;
    }

    public short getMetricDataFormat() {
        return this.f59488t;
    }

    public short getMinLeftSideBearing() {
        return this.f59478j;
    }

    public short getMinRightSideBearing() {
        return this.f59479k;
    }

    public int getNumberOfHMetrics() {
        return this.f59489u;
    }

    public short getReserved1() {
        return this.f59483o;
    }

    public short getReserved2() {
        return this.f59484p;
    }

    public short getReserved3() {
        return this.f59485q;
    }

    public short getReserved4() {
        return this.f59486r;
    }

    public short getReserved5() {
        return this.f59487s;
    }

    public float getVersion() {
        return this.f59473e;
    }

    public short getXMaxExtent() {
        return this.f59480l;
    }

    public void setAdvanceWidthMax(int i) {
        this.f59477i = i;
    }

    public void setAscender(short s) {
        this.f59474f = s;
    }

    public void setCaretSlopeRise(short s) {
        this.f59481m = s;
    }

    public void setCaretSlopeRun(short s) {
        this.f59482n = s;
    }

    public void setDescender(short s) {
        this.f59475g = s;
    }

    public void setLineGap(short s) {
        this.f59476h = s;
    }

    public void setMetricDataFormat(short s) {
        this.f59488t = s;
    }

    public void setMinLeftSideBearing(short s) {
        this.f59478j = s;
    }

    public void setMinRightSideBearing(short s) {
        this.f59479k = s;
    }

    public void setNumberOfHMetrics(int i) {
        this.f59489u = i;
    }

    public void setReserved1(short s) {
        this.f59483o = s;
    }

    public void setReserved2(short s) {
        this.f59484p = s;
    }

    public void setReserved3(short s) {
        this.f59485q = s;
    }

    public void setReserved4(short s) {
        this.f59486r = s;
    }

    public void setReserved5(short s) {
        this.f59487s = s;
    }

    public void setVersion(float f) {
        this.f59473e = f;
    }

    public void setXMaxExtent(short s) {
        this.f59480l = s;
    }
}
