package com.tom_roush.fontbox.ttf;

import com.tom_roush.fontbox.cff.CFFFont;
import com.tom_roush.fontbox.cff.CFFParser;

/* loaded from: classes5.dex */
public class CFFTable extends TTFTable {
    public static final String TAG = "CFF ";

    /* renamed from: e */
    public CFFFont f59370e;

    /* renamed from: com.tom_roush.fontbox.ttf.CFFTable$a */
    /* loaded from: classes5.dex */
    public static class C9872a implements CFFParser.ByteSource {

        /* renamed from: a */
        public final TrueTypeFont f59371a;

        public C9872a(TrueTypeFont trueTypeFont) {
            this.f59371a = trueTypeFont;
        }

        @Override // com.tom_roush.fontbox.cff.CFFParser.ByteSource
        public byte[] getBytes() {
            TrueTypeFont trueTypeFont = this.f59371a;
            return trueTypeFont.getTableBytes(trueTypeFont.getTableMap().get(CFFTable.TAG));
        }
    }

    public CFFTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59370e = new CFFParser().parse(abstractC22790wQ1.m855i((int) getLength()), new C9872a(this.font)).get(0);
        this.initialized = true;
    }

    public CFFFont getFont() {
        return this.f59370e;
    }
}
