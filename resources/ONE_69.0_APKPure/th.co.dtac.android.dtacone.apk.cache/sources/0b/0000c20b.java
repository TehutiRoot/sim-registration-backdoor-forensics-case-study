package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.FontBoxFont;

/* loaded from: classes5.dex */
public class FontMapping<T extends FontBoxFont> {

    /* renamed from: a */
    public final FontBoxFont f60361a;

    /* renamed from: b */
    public final boolean f60362b;

    public FontMapping(T t, boolean z) {
        this.f60361a = t;
        this.f60362b = z;
    }

    public T getFont() {
        return (T) this.f60361a;
    }

    public boolean isFallback() {
        return this.f60362b;
    }
}