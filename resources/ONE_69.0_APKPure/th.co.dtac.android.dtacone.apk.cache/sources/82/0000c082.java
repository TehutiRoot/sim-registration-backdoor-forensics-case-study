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
    public int[] f59416a;

    /* renamed from: b */
    public final int f59417b;

    public GlyfDescript(short s, AbstractC22342tR1 abstractC22342tR1) {
        this.f59417b = s;
    }

    /* renamed from: a */
    public void m32925a(AbstractC22342tR1 abstractC22342tR1, int i) {
        this.f59416a = abstractC22342tR1.m22681r(i);
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getContourCount() {
        return this.f59417b;
    }

    public int[] getInstructions() {
        return this.f59416a;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public void resolve() {
    }
}