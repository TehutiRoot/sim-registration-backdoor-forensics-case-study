package com.tom_roush.pdfbox.android;

/* loaded from: classes5.dex */
public class PDFBoxConfig {
    public static FontLoadLevel FONT_LOAD_LEVEL = FontLoadLevel.MINIMUM;

    /* renamed from: a */
    public static boolean f59708a = false;

    /* loaded from: classes5.dex */
    public enum FontLoadLevel {
        FULL,
        MINIMUM,
        NONE
    }

    public static FontLoadLevel getFontLoadLevel() {
        return FONT_LOAD_LEVEL;
    }

    public static boolean isDebugEnabled() {
        return f59708a;
    }

    public static void setDebugLoggingEnabled(boolean z) {
        f59708a = z;
    }

    public static void setFontLoadLevel(FontLoadLevel fontLoadLevel) {
        FONT_LOAD_LEVEL = fontLoadLevel;
    }
}
