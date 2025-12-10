package com.tom_roush.fontbox.ttf;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class OTFParser extends TTFParser {
    public OTFParser() {
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public boolean allowCFF() {
        return true;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    /* renamed from: e */
    public OpenTypeFont mo32881a(AbstractC22342tR1 abstractC22342tR1) {
        return new OpenTypeFont(abstractC22342tR1);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    /* renamed from: f */
    public OpenTypeFont mo32880b(AbstractC22342tR1 abstractC22342tR1) {
        return (OpenTypeFont) super.mo32880b(abstractC22342tR1);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public TTFTable readTable(TrueTypeFont trueTypeFont, String str) {
        if (!str.equals("BASE") && !str.equals("GDEF") && !str.equals("GPOS") && !str.equals(GlyphSubstitutionTable.TAG) && !str.equals("JSTF")) {
            if (str.equals(CFFTable.TAG)) {
                return new CFFTable(trueTypeFont);
            }
            return super.readTable(trueTypeFont, str);
        }
        return new OTLTable(trueTypeFont);
    }

    public OTFParser(boolean z) {
        this(z, false);
    }

    public OTFParser(boolean z, boolean z2) {
        super(z, z2);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public OpenTypeFont parse(String str) throws IOException {
        return (OpenTypeFont) super.parse(str);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public OpenTypeFont parse(File file) throws IOException {
        return (OpenTypeFont) super.parse(file);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFParser
    public OpenTypeFont parse(InputStream inputStream) throws IOException {
        return (OpenTypeFont) super.parse(inputStream);
    }
}