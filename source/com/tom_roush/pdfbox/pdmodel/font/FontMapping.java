package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.FontBoxFont;

/* loaded from: classes5.dex */
public class FontMapping<T extends FontBoxFont> {

    /* renamed from: a */
    public final FontBoxFont f60349a;

    /* renamed from: b */
    public final boolean f60350b;

    public FontMapping(T t, boolean z) {
        this.f60349a = t;
        this.f60350b = z;
    }

    public T getFont() {
        return (T) this.f60349a;
    }

    public boolean isFallback() {
        return this.f60350b;
    }
}
