package com.tom_roush.pdfbox.pdmodel.font;

/* loaded from: classes5.dex */
public final class FontMappers {

    /* renamed from: a */
    public static FontMapper f60347a;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.font.FontMappers$a */
    /* loaded from: classes5.dex */
    public static class C9924a {

        /* renamed from: a */
        public static final FontMapper f60348a = new Y30();
    }

    public static FontMapper instance() {
        if (f60347a == null) {
            f60347a = C9924a.f60348a;
        }
        return f60347a;
    }

    public static synchronized void set(FontMapper fontMapper) {
        synchronized (FontMappers.class) {
            f60347a = fontMapper;
        }
    }
}
