package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class KerningTable extends TTFTable {
    public static final String TAG = "kern";

    /* renamed from: e */
    public KerningSubtable[] f59513e;

    public KerningTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        int i;
        int mo22679t = abstractC22342tR1.mo22679t();
        if (mo22679t != 0) {
            mo22679t = (mo22679t << 16) | abstractC22342tR1.mo22679t();
        }
        if (mo22679t == 0) {
            i = abstractC22342tR1.mo22679t();
        } else if (mo22679t == 1) {
            i = (int) abstractC22342tR1.m22680s();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Skipped kerning table due to an unsupported kerning table version: ");
            sb.append(mo22679t);
            i = 0;
        }
        if (i > 0) {
            this.f59513e = new KerningSubtable[i];
            for (int i2 = 0; i2 < i; i2++) {
                KerningSubtable kerningSubtable = new KerningSubtable();
                kerningSubtable.m32897c(abstractC22342tR1, mo22679t);
                this.f59513e[i2] = kerningSubtable;
            }
        }
        this.initialized = true;
    }

    public KerningSubtable getHorizontalKerningSubtable() {
        return getHorizontalKerningSubtable(false);
    }

    public KerningSubtable getHorizontalKerningSubtable(boolean z) {
        KerningSubtable[] kerningSubtableArr = this.f59513e;
        if (kerningSubtableArr != null) {
            for (KerningSubtable kerningSubtable : kerningSubtableArr) {
                if (kerningSubtable.isHorizontalKerning(z)) {
                    return kerningSubtable;
                }
            }
            return null;
        }
        return null;
    }
}