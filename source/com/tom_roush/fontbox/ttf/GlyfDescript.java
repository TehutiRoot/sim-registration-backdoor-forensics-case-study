package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public abstract class GlyfDescript implements GlyphDescription {
    public static final byte ON_CURVE = 1;
    public static final byte REPEAT = 8;
    public static final byte X_DUAL = 16;
    public static final byte X_SHORT_VECTOR = 2;
    public static final byte Y_DUAL = 32;
    public static final byte Y_SHORT_VECTOR = 4;

    /* renamed from: a */
    public int[] f59404a;

    /* renamed from: b */
    public final int f59405b;

    public GlyfDescript(short s, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59405b = s;
    }

    /* renamed from: a */
    public void m32933a(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        this.f59404a = abstractC22790wQ1.m846r(i);
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getContourCount() {
        return this.f59405b;
    }

    public int[] getInstructions() {
        return this.f59404a;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public void resolve() {
    }
}
