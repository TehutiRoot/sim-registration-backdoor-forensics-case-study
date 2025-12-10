package com.tom_roush.fontbox.ttf;

import android.graphics.Path;
import java.io.IOException;

/* loaded from: classes5.dex */
public class OpenTypeFont extends TrueTypeFont {

    /* renamed from: g */
    public boolean f59566g;

    public OpenTypeFont(AbstractC22790wQ1 abstractC22790wQ1) {
        super(abstractC22790wQ1);
    }

    public CFFTable getCFF() throws IOException {
        if (this.f59566g) {
            return (CFFTable) getTable(CFFTable.TAG);
        }
        throw new UnsupportedOperationException("TTF fonts do not have a CFF table");
    }

    @Override // com.tom_roush.fontbox.ttf.TrueTypeFont
    public GlyphTable getGlyph() throws IOException {
        if (!this.f59566g) {
            return super.getGlyph();
        }
        throw new UnsupportedOperationException("OTF fonts do not have a glyf table");
    }

    @Override // com.tom_roush.fontbox.ttf.TrueTypeFont, com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) throws IOException {
        return getCFF().getFont().getType2CharString(nameToGID(str)).getPath();
    }

    public boolean hasLayoutTables() {
        if (!this.tables.containsKey("BASE") && !this.tables.containsKey("GDEF") && !this.tables.containsKey("GPOS") && !this.tables.containsKey(GlyphSubstitutionTable.TAG) && !this.tables.containsKey("JSTF")) {
            return false;
        }
        return true;
    }

    public boolean isPostScript() {
        return this.tables.containsKey(CFFTable.TAG);
    }

    @Override // com.tom_roush.fontbox.ttf.TrueTypeFont
    /* renamed from: k */
    public void mo32849k(float f) {
        boolean z;
        if (Float.floatToIntBits(f) == 1184802985) {
            z = true;
        } else {
            z = false;
        }
        this.f59566g = z;
        super.mo32849k(f);
    }
}
