package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.FontBoxFont;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class FontCache {

    /* renamed from: a */
    public final Map f60346a = new ConcurrentHashMap();

    public void addFont(FontInfo fontInfo, FontBoxFont fontBoxFont) {
        this.f60346a.put(fontInfo, new SoftReference(fontBoxFont));
    }

    public FontBoxFont getFont(FontInfo fontInfo) {
        SoftReference softReference = (SoftReference) this.f60346a.get(fontInfo);
        if (softReference != null) {
            return (FontBoxFont) softReference.get();
        }
        return null;
    }
}
