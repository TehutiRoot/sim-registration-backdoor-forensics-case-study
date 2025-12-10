package com.tom_roush.fontbox.ttf;

import java.util.Calendar;

/* loaded from: classes5.dex */
public class HeaderTable extends TTFTable {
    public static final int MAC_STYLE_BOLD = 1;
    public static final int MAC_STYLE_ITALIC = 2;
    public static final String TAG = "head";

    /* renamed from: e */
    public float f59456e;

    /* renamed from: f */
    public float f59457f;

    /* renamed from: g */
    public long f59458g;

    /* renamed from: h */
    public long f59459h;

    /* renamed from: i */
    public int f59460i;

    /* renamed from: j */
    public int f59461j;

    /* renamed from: k */
    public Calendar f59462k;

    /* renamed from: l */
    public Calendar f59463l;

    /* renamed from: m */
    public short f59464m;

    /* renamed from: n */
    public short f59465n;

    /* renamed from: o */
    public short f59466o;

    /* renamed from: p */
    public short f59467p;

    /* renamed from: q */
    public int f59468q;

    /* renamed from: r */
    public int f59469r;

    /* renamed from: s */
    public short f59470s;

    /* renamed from: t */
    public short f59471t;

    /* renamed from: u */
    public short f59472u;

    public HeaderTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59456e = abstractC22790wQ1.m854j();
        this.f59457f = abstractC22790wQ1.m854j();
        this.f59458g = abstractC22790wQ1.m845s();
        this.f59459h = abstractC22790wQ1.m845s();
        this.f59460i = abstractC22790wQ1.mo844t();
        this.f59461j = abstractC22790wQ1.mo844t();
        this.f59462k = abstractC22790wQ1.m853k();
        this.f59463l = abstractC22790wQ1.m853k();
        this.f59464m = abstractC22790wQ1.mo851m();
        this.f59465n = abstractC22790wQ1.mo851m();
        this.f59466o = abstractC22790wQ1.mo851m();
        this.f59467p = abstractC22790wQ1.mo851m();
        this.f59468q = abstractC22790wQ1.mo844t();
        this.f59469r = abstractC22790wQ1.mo844t();
        this.f59470s = abstractC22790wQ1.mo851m();
        this.f59471t = abstractC22790wQ1.mo851m();
        this.f59472u = abstractC22790wQ1.mo851m();
        this.initialized = true;
    }

    public long getCheckSumAdjustment() {
        return this.f59458g;
    }

    public Calendar getCreated() {
        return this.f59462k;
    }

    public int getFlags() {
        return this.f59460i;
    }

    public short getFontDirectionHint() {
        return this.f59470s;
    }

    public float getFontRevision() {
        return this.f59457f;
    }

    public short getGlyphDataFormat() {
        return this.f59472u;
    }

    public short getIndexToLocFormat() {
        return this.f59471t;
    }

    public int getLowestRecPPEM() {
        return this.f59469r;
    }

    public int getMacStyle() {
        return this.f59468q;
    }

    public long getMagicNumber() {
        return this.f59459h;
    }

    public Calendar getModified() {
        return this.f59463l;
    }

    public int getUnitsPerEm() {
        return this.f59461j;
    }

    public float getVersion() {
        return this.f59456e;
    }

    public short getXMax() {
        return this.f59466o;
    }

    public short getXMin() {
        return this.f59464m;
    }

    public short getYMax() {
        return this.f59467p;
    }

    public short getYMin() {
        return this.f59465n;
    }

    public void setCheckSumAdjustment(long j) {
        this.f59458g = j;
    }

    public void setCreated(Calendar calendar) {
        this.f59462k = calendar;
    }

    public void setFlags(int i) {
        this.f59460i = i;
    }

    public void setFontDirectionHint(short s) {
        this.f59470s = s;
    }

    public void setFontRevision(float f) {
        this.f59457f = f;
    }

    public void setGlyphDataFormat(short s) {
        this.f59472u = s;
    }

    public void setIndexToLocFormat(short s) {
        this.f59471t = s;
    }

    public void setLowestRecPPEM(int i) {
        this.f59469r = i;
    }

    public void setMacStyle(int i) {
        this.f59468q = i;
    }

    public void setMagicNumber(long j) {
        this.f59459h = j;
    }

    public void setModified(Calendar calendar) {
        this.f59463l = calendar;
    }

    public void setUnitsPerEm(int i) {
        this.f59461j = i;
    }

    public void setVersion(float f) {
        this.f59456e = f;
    }

    public void setXMax(short s) {
        this.f59466o = s;
    }

    public void setXMin(short s) {
        this.f59464m = s;
    }

    public void setYMax(short s) {
        this.f59467p = s;
    }

    public void setYMin(short s) {
        this.f59465n = s;
    }
}
