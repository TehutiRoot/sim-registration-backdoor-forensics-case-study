package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class MaximumProfileTable extends TTFTable {
    public static final String TAG = "maxp";

    /* renamed from: e */
    public float f59502e;

    /* renamed from: f */
    public int f59503f;

    /* renamed from: g */
    public int f59504g;

    /* renamed from: h */
    public int f59505h;

    /* renamed from: i */
    public int f59506i;

    /* renamed from: j */
    public int f59507j;

    /* renamed from: k */
    public int f59508k;

    /* renamed from: l */
    public int f59509l;

    /* renamed from: m */
    public int f59510m;

    /* renamed from: n */
    public int f59511n;

    /* renamed from: o */
    public int f59512o;

    /* renamed from: p */
    public int f59513p;

    /* renamed from: q */
    public int f59514q;

    /* renamed from: r */
    public int f59515r;

    /* renamed from: s */
    public int f59516s;

    public MaximumProfileTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59502e = abstractC22790wQ1.m854j();
        this.f59503f = abstractC22790wQ1.mo844t();
        this.f59504g = abstractC22790wQ1.mo844t();
        this.f59505h = abstractC22790wQ1.mo844t();
        this.f59506i = abstractC22790wQ1.mo844t();
        this.f59507j = abstractC22790wQ1.mo844t();
        this.f59508k = abstractC22790wQ1.mo844t();
        this.f59509l = abstractC22790wQ1.mo844t();
        this.f59510m = abstractC22790wQ1.mo844t();
        this.f59511n = abstractC22790wQ1.mo844t();
        this.f59512o = abstractC22790wQ1.mo844t();
        this.f59513p = abstractC22790wQ1.mo844t();
        this.f59514q = abstractC22790wQ1.mo844t();
        this.f59515r = abstractC22790wQ1.mo844t();
        this.f59516s = abstractC22790wQ1.mo844t();
        this.initialized = true;
    }

    public int getMaxComponentDepth() {
        return this.f59516s;
    }

    public int getMaxComponentElements() {
        return this.f59515r;
    }

    public int getMaxCompositeContours() {
        return this.f59507j;
    }

    public int getMaxCompositePoints() {
        return this.f59506i;
    }

    public int getMaxContours() {
        return this.f59505h;
    }

    public int getMaxFunctionDefs() {
        return this.f59511n;
    }

    public int getMaxInstructionDefs() {
        return this.f59512o;
    }

    public int getMaxPoints() {
        return this.f59504g;
    }

    public int getMaxSizeOfInstructions() {
        return this.f59514q;
    }

    public int getMaxStackElements() {
        return this.f59513p;
    }

    public int getMaxStorage() {
        return this.f59510m;
    }

    public int getMaxTwilightPoints() {
        return this.f59509l;
    }

    public int getMaxZones() {
        return this.f59508k;
    }

    public int getNumGlyphs() {
        return this.f59503f;
    }

    public float getVersion() {
        return this.f59502e;
    }

    public void setMaxComponentDepth(int i) {
        this.f59516s = i;
    }

    public void setMaxComponentElements(int i) {
        this.f59515r = i;
    }

    public void setMaxCompositeContours(int i) {
        this.f59507j = i;
    }

    public void setMaxCompositePoints(int i) {
        this.f59506i = i;
    }

    public void setMaxContours(int i) {
        this.f59505h = i;
    }

    public void setMaxFunctionDefs(int i) {
        this.f59511n = i;
    }

    public void setMaxInstructionDefs(int i) {
        this.f59512o = i;
    }

    public void setMaxPoints(int i) {
        this.f59504g = i;
    }

    public void setMaxSizeOfInstructions(int i) {
        this.f59514q = i;
    }

    public void setMaxStackElements(int i) {
        this.f59513p = i;
    }

    public void setMaxStorage(int i) {
        this.f59510m = i;
    }

    public void setMaxTwilightPoints(int i) {
        this.f59509l = i;
    }

    public void setMaxZones(int i) {
        this.f59508k = i;
    }

    public void setNumGlyphs(int i) {
        this.f59503f = i;
    }

    public void setVersion(float f) {
        this.f59502e = f;
    }
}
