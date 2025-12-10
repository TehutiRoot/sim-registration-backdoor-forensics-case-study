package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class KerningTable extends TTFTable {
    public static final String TAG = "kern";

    /* renamed from: e */
    public KerningSubtable[] f59501e;

    public KerningTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        int i;
        int mo844t = abstractC22790wQ1.mo844t();
        if (mo844t != 0) {
            mo844t = (mo844t << 16) | abstractC22790wQ1.mo844t();
        }
        if (mo844t == 0) {
            i = abstractC22790wQ1.mo844t();
        } else if (mo844t == 1) {
            i = (int) abstractC22790wQ1.m845s();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Skipped kerning table due to an unsupported kerning table version: ");
            sb.append(mo844t);
            i = 0;
        }
        if (i > 0) {
            this.f59501e = new KerningSubtable[i];
            for (int i2 = 0; i2 < i; i2++) {
                KerningSubtable kerningSubtable = new KerningSubtable();
                kerningSubtable.m32905c(abstractC22790wQ1, mo844t);
                this.f59501e[i2] = kerningSubtable;
            }
        }
        this.initialized = true;
    }

    public KerningSubtable getHorizontalKerningSubtable() {
        return getHorizontalKerningSubtable(false);
    }

    public KerningSubtable getHorizontalKerningSubtable(boolean z) {
        KerningSubtable[] kerningSubtableArr = this.f59501e;
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
