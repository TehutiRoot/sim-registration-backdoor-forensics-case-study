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
    public int f59395a;

    /* renamed from: b */
    public int f59396b;

    /* renamed from: c */
    public final short f59397c;

    /* renamed from: d */
    public final short f59398d;

    /* renamed from: e */
    public final short f59399e;

    /* renamed from: f */
    public final int f59400f;

    /* renamed from: g */
    public double f59401g;

    /* renamed from: h */
    public double f59402h;

    /* renamed from: i */
    public double f59403i;

    /* renamed from: j */
    public double f59404j;

    /* renamed from: k */
    public int f59405k;

    /* renamed from: l */
    public int f59406l;

    /* renamed from: m */
    public int f59407m;

    /* renamed from: n */
    public int f59408n;

    public GlyfCompositeComp(AbstractC22342tR1 abstractC22342tR1) {
        this.f59401g = 1.0d;
        this.f59402h = 1.0d;
        this.f59403i = 0.0d;
        this.f59404j = 0.0d;
        this.f59405k = 0;
        this.f59406l = 0;
        this.f59407m = 0;
        this.f59408n = 0;
        short mo22686m = abstractC22342tR1.mo22686m();
        this.f59399e = mo22686m;
        this.f59400f = abstractC22342tR1.mo22679t();
        if ((mo22686m & 1) != 0) {
            this.f59397c = abstractC22342tR1.mo22686m();
            this.f59398d = abstractC22342tR1.mo22686m();
        } else {
            this.f59397c = (short) abstractC22342tR1.m22687l();
            this.f59398d = (short) abstractC22342tR1.m22687l();
        }
        if ((mo22686m & 2) != 0) {
            this.f59405k = this.f59397c;
            this.f59406l = this.f59398d;
        } else {
            this.f59407m = this.f59397c;
            this.f59408n = this.f59398d;
        }
        if ((mo22686m & 8) != 0) {
            double mo22686m2 = abstractC22342tR1.mo22686m() / 16384.0d;
            this.f59402h = mo22686m2;
            this.f59401g = mo22686m2;
        } else if ((mo22686m & 64) != 0) {
            this.f59401g = abstractC22342tR1.mo22686m() / 16384.0d;
            this.f59402h = abstractC22342tR1.mo22686m() / 16384.0d;
        } else if ((mo22686m & WE_HAVE_A_TWO_BY_TWO) != 0) {
            this.f59401g = abstractC22342tR1.mo22686m() / 16384.0d;
            this.f59403i = abstractC22342tR1.mo22686m() / 16384.0d;
            this.f59404j = abstractC22342tR1.mo22686m() / 16384.0d;
            this.f59402h = abstractC22342tR1.mo22686m() / 16384.0d;
        }
    }

    public short getArgument1() {
        return this.f59397c;
    }

    public short getArgument2() {
        return this.f59398d;
    }

    public int getFirstContour() {
        return this.f59396b;
    }

    public int getFirstIndex() {
        return this.f59395a;
    }

    public short getFlags() {
        return this.f59399e;
    }

    public int getGlyphIndex() {
        return this.f59400f;
    }

    public double getScale01() {
        return this.f59403i;
    }

    public double getScale10() {
        return this.f59404j;
    }

    public double getXScale() {
        return this.f59401g;
    }

    public int getXTranslate() {
        return this.f59405k;
    }

    public double getYScale() {
        return this.f59402h;
    }

    public int getYTranslate() {
        return this.f59406l;
    }

    public int scaleX(int i, int i2) {
        return Math.round((float) ((i * this.f59401g) + (i2 * this.f59404j)));
    }

    public int scaleY(int i, int i2) {
        return Math.round((float) ((i * this.f59403i) + (i2 * this.f59402h)));
    }

    public void setFirstContour(int i) {
        this.f59396b = i;
    }

    public void setFirstIndex(int i) {
        this.f59395a = i;
    }
}