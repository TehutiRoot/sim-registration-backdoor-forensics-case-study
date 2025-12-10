package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.ttf.OpenTypeFont;

/* loaded from: classes5.dex */
public final class CIDFontMapping extends FontMapping<OpenTypeFont> {

    /* renamed from: c */
    public final FontBoxFont f60342c;

    public CIDFontMapping(OpenTypeFont openTypeFont, FontBoxFont fontBoxFont, boolean z) {
        super(openTypeFont, z);
        this.f60342c = fontBoxFont;
    }

    public FontBoxFont getTrueTypeFont() {
        return this.f60342c;
    }

    public boolean isCIDFont() {
        if (getFont() != null) {
            return true;
        }
        return false;
    }
}
