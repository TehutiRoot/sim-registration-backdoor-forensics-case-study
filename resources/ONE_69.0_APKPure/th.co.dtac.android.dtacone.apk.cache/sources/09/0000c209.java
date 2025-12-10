package com.tom_roush.pdfbox.pdmodel.font;

/* loaded from: classes5.dex */
public final class FontMappers {

    /* renamed from: a */
    public static FontMapper f60359a;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.font.FontMappers$a */
    /* loaded from: classes5.dex */
    public static class C9913a {

        /* renamed from: a */
        public static final FontMapper f60360a = new C19335c40();
    }

    public static FontMapper instance() {
        if (f60359a == null) {
            f60359a = C9913a.f60360a;
        }
        return f60359a;
    }

    public static synchronized void set(FontMapper fontMapper) {
        synchronized (FontMappers.class) {
            f60359a = fontMapper;
        }
    }
}