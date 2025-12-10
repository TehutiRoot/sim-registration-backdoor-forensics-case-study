package com.tom_roush.fontbox.ttf;

import com.tom_roush.fontbox.cff.CFFFont;
import com.tom_roush.fontbox.cff.CFFParser;

/* loaded from: classes5.dex */
public class CFFTable extends TTFTable {
    public static final String TAG = "CFF ";

    /* renamed from: e */
    public CFFFont f59382e;

    /* renamed from: com.tom_roush.fontbox.ttf.CFFTable$a */
    /* loaded from: classes5.dex */
    public static class C9861a implements CFFParser.ByteSource {

        /* renamed from: a */
        public final TrueTypeFont f59383a;

        public C9861a(TrueTypeFont trueTypeFont) {
            this.f59383a = trueTypeFont;
        }

        @Override // com.tom_roush.fontbox.cff.CFFParser.ByteSource
        public byte[] getBytes() {
            TrueTypeFont trueTypeFont = this.f59383a;
            return trueTypeFont.getTableBytes(trueTypeFont.getTableMap().get(CFFTable.TAG));
        }
    }

    public CFFTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        this.f59382e = new CFFParser().parse(abstractC22342tR1.m22690i((int) getLength()), new C9861a(this.font)).get(0);
        this.initialized = true;
    }

    public CFFFont getFont() {
        return this.f59382e;
    }
}