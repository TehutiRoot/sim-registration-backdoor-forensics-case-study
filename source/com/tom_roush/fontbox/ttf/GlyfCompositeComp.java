package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class GlyfCompositeComp {
    protected static final short ARGS_ARE_XY_VALUES = 2;
    protected static final short ARG_1_AND_2_ARE_WORDS = 1;
    protected static final short MORE_COMPONENTS = 32;
    protected static final short ROUND_XY_TO_GRID = 4;
    protected static final short USE_MY_METRICS = 512;
    protected static final short WE_HAVE_AN_X_AND_Y_SCALE = 64;
    protected static final short WE_HAVE_A_SCALE = 8;
    protected static final short WE_HAVE_A_TWO_BY_TWO = 128;
    protected static final short WE_HAVE_INSTRUCTIONS = 256;

    /* renamed from: a */
    public int f59383a;

    /* renamed from: b */
    public int f59384b;

    /* renamed from: c */
    public final short f59385c;

    /* renamed from: d */
    public final short f59386d;

    /* renamed from: e */
    public final short f59387e;

    /* renamed from: f */
    public final int f59388f;

    /* renamed from: g */
    public double f59389g;

    /* renamed from: h */
    public double f59390h;

    /* renamed from: i */
    public double f59391i;

    /* renamed from: j */
    public double f59392j;

    /* renamed from: k */
    public int f59393k;

    /* renamed from: l */
    public int f59394l;

    /* renamed from: m */
    public int f59395m;

    /* renamed from: n */
    public int f59396n;

    public GlyfCompositeComp(AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59389g = 1.0d;
        this.f59390h = 1.0d;
        this.f59391i = 0.0d;
        this.f59392j = 0.0d;
        this.f59393k = 0;
        this.f59394l = 0;
        this.f59395m = 0;
        this.f59396n = 0;
        short mo851m = abstractC22790wQ1.mo851m();
        this.f59387e = mo851m;
        this.f59388f = abstractC22790wQ1.mo844t();
        if ((mo851m & 1) != 0) {
            this.f59385c = abstractC22790wQ1.mo851m();
            this.f59386d = abstractC22790wQ1.mo851m();
        } else {
            this.f59385c = (short) abstractC22790wQ1.m852l();
            this.f59386d = (short) abstractC22790wQ1.m852l();
        }
        if ((mo851m & 2) != 0) {
            this.f59393k = this.f59385c;
            this.f59394l = this.f59386d;
        } else {
            this.f59395m = this.f59385c;
            this.f59396n = this.f59386d;
        }
        if ((mo851m & 8) != 0) {
            double mo851m2 = abstractC22790wQ1.mo851m() / 16384.0d;
            this.f59390h = mo851m2;
            this.f59389g = mo851m2;
        } else if ((mo851m & 64) != 0) {
            this.f59389g = abstractC22790wQ1.mo851m() / 16384.0d;
            this.f59390h = abstractC22790wQ1.mo851m() / 16384.0d;
        } else if ((mo851m & WE_HAVE_A_TWO_BY_TWO) != 0) {
            this.f59389g = abstractC22790wQ1.mo851m() / 16384.0d;
            this.f59391i = abstractC22790wQ1.mo851m() / 16384.0d;
            this.f59392j = abstractC22790wQ1.mo851m() / 16384.0d;
            this.f59390h = abstractC22790wQ1.mo851m() / 16384.0d;
        }
    }

    public short getArgument1() {
        return this.f59385c;
    }

    public short getArgument2() {
        return this.f59386d;
    }

    public int getFirstContour() {
        return this.f59384b;
    }

    public int getFirstIndex() {
        return this.f59383a;
    }

    public short getFlags() {
        return this.f59387e;
    }

    public int getGlyphIndex() {
        return this.f59388f;
    }

    public double getScale01() {
        return this.f59391i;
    }

    public double getScale10() {
        return this.f59392j;
    }

    public double getXScale() {
        return this.f59389g;
    }

    public int getXTranslate() {
        return this.f59393k;
    }

    public double getYScale() {
        return this.f59390h;
    }

    public int getYTranslate() {
        return this.f59394l;
    }

    public int scaleX(int i, int i2) {
        return Math.round((float) ((i * this.f59389g) + (i2 * this.f59392j)));
    }

    public int scaleY(int i, int i2) {
        return Math.round((float) ((i * this.f59391i) + (i2 * this.f59390h)));
    }

    public void setFirstContour(int i) {
        this.f59384b = i;
    }

    public void setFirstIndex(int i) {
        this.f59383a = i;
    }
}
