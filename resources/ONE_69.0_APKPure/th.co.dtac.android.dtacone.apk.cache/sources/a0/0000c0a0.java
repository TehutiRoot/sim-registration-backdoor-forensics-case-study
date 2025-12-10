package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class MaximumProfileTable extends TTFTable {
    public static final String TAG = "maxp";

    /* renamed from: e */
    public float f59514e;

    /* renamed from: f */
    public int f59515f;

    /* renamed from: g */
    public int f59516g;

    /* renamed from: h */
    public int f59517h;

    /* renamed from: i */
    public int f59518i;

    /* renamed from: j */
    public int f59519j;

    /* renamed from: k */
    public int f59520k;

    /* renamed from: l */
    public int f59521l;

    /* renamed from: m */
    public int f59522m;

    /* renamed from: n */
    public int f59523n;

    /* renamed from: o */
    public int f59524o;

    /* renamed from: p */
    public int f59525p;

    /* renamed from: q */
    public int f59526q;

    /* renamed from: r */
    public int f59527r;

    /* renamed from: s */
    public int f59528s;

    public MaximumProfileTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        this.f59514e = abstractC22342tR1.m22689j();
        this.f59515f = abstractC22342tR1.mo22679t();
        this.f59516g = abstractC22342tR1.mo22679t();
        this.f59517h = abstractC22342tR1.mo22679t();
        this.f59518i = abstractC22342tR1.mo22679t();
        this.f59519j = abstractC22342tR1.mo22679t();
        this.f59520k = abstractC22342tR1.mo22679t();
        this.f59521l = abstractC22342tR1.mo22679t();
        this.f59522m = abstractC22342tR1.mo22679t();
        this.f59523n = abstractC22342tR1.mo22679t();
        this.f59524o = abstractC22342tR1.mo22679t();
        this.f59525p = abstractC22342tR1.mo22679t();
        this.f59526q = abstractC22342tR1.mo22679t();
        this.f59527r = abstractC22342tR1.mo22679t();
        this.f59528s = abstractC22342tR1.mo22679t();
        this.initialized = true;
    }

    public int getMaxComponentDepth() {
        return this.f59528s;
    }

    public int getMaxComponentElements() {
        return this.f59527r;
    }

    public int getMaxCompositeContours() {
        return this.f59519j;
    }

    public int getMaxCompositePoints() {
        return this.f59518i;
    }

    public int getMaxContours() {
        return this.f59517h;
    }

    public int getMaxFunctionDefs() {
        return this.f59523n;
    }

    public int getMaxInstructionDefs() {
        return this.f59524o;
    }

    public int getMaxPoints() {
        return this.f59516g;
    }

    public int getMaxSizeOfInstructions() {
        return this.f59526q;
    }

    public int getMaxStackElements() {
        return this.f59525p;
    }

    public int getMaxStorage() {
        return this.f59522m;
    }

    public int getMaxTwilightPoints() {
        return this.f59521l;
    }

    public int getMaxZones() {
        return this.f59520k;
    }

    public int getNumGlyphs() {
        return this.f59515f;
    }

    public float getVersion() {
        return this.f59514e;
    }

    public void setMaxComponentDepth(int i) {
        this.f59528s = i;
    }

    public void setMaxComponentElements(int i) {
        this.f59527r = i;
    }

    public void setMaxCompositeContours(int i) {
        this.f59519j = i;
    }

    public void setMaxCompositePoints(int i) {
        this.f59518i = i;
    }

    public void setMaxContours(int i) {
        this.f59517h = i;
    }

    public void setMaxFunctionDefs(int i) {
        this.f59523n = i;
    }

    public void setMaxInstructionDefs(int i) {
        this.f59524o = i;
    }

    public void setMaxPoints(int i) {
        this.f59516g = i;
    }

    public void setMaxSizeOfInstructions(int i) {
        this.f59526q = i;
    }

    public void setMaxStackElements(int i) {
        this.f59525p = i;
    }

    public void setMaxStorage(int i) {
        this.f59522m = i;
    }

    public void setMaxTwilightPoints(int i) {
        this.f59521l = i;
    }

    public void setMaxZones(int i) {
        this.f59520k = i;
    }

    public void setNumGlyphs(int i) {
        this.f59515f = i;
    }

    public void setVersion(float f) {
        this.f59514e = f;
    }
}