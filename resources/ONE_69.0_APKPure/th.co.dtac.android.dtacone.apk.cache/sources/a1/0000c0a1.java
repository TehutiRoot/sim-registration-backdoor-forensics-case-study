package com.tom_roush.fontbox.ttf;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class NameRecord {
    public static final int ENCODING_MACINTOSH_ROMAN = 0;
    public static final int ENCODING_UNICODE_1_0 = 0;
    public static final int ENCODING_UNICODE_1_1 = 1;
    public static final int ENCODING_UNICODE_2_0_BMP = 3;
    public static final int ENCODING_UNICODE_2_0_FULL = 4;
    public static final int ENCODING_WINDOWS_SYMBOL = 0;
    public static final int ENCODING_WINDOWS_UNICODE_BMP = 1;
    public static final int ENCODING_WINDOWS_UNICODE_UCS4 = 10;
    public static final int LANGUAGE_MACINTOSH_ENGLISH = 0;
    public static final int LANGUAGE_UNICODE = 0;
    public static final int LANGUAGE_WINDOWS_EN_US = 1033;
    @Deprecated
    public static final int LANGUGAE_MACINTOSH_ENGLISH = 0;
    @Deprecated
    public static final int LANGUGAE_UNICODE = 0;
    @Deprecated
    public static final int LANGUGAE_WINDOWS_EN_US = 1033;
    public static final int NAME_COPYRIGHT = 0;
    public static final int NAME_FONT_FAMILY_NAME = 1;
    public static final int NAME_FONT_SUB_FAMILY_NAME = 2;
    public static final int NAME_FULL_FONT_NAME = 4;
    public static final int NAME_POSTSCRIPT_NAME = 6;
    public static final int NAME_TRADEMARK = 7;
    public static final int NAME_UNIQUE_FONT_ID = 3;
    public static final int NAME_VERSION = 5;
    public static final int PLATFORM_ISO = 2;
    public static final int PLATFORM_MACINTOSH = 1;
    public static final int PLATFORM_UNICODE = 0;
    public static final int PLATFORM_WINDOWS = 3;

    /* renamed from: a */
    public int f59529a;

    /* renamed from: b */
    public int f59530b;

    /* renamed from: c */
    public int f59531c;

    /* renamed from: d */
    public int f59532d;

    /* renamed from: e */
    public int f59533e;

    /* renamed from: f */
    public int f59534f;

    /* renamed from: g */
    public String f59535g;

    /* renamed from: a */
    public void m32889a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        this.f59529a = abstractC22342tR1.mo22679t();
        this.f59530b = abstractC22342tR1.mo22679t();
        this.f59531c = abstractC22342tR1.mo22679t();
        this.f59532d = abstractC22342tR1.mo22679t();
        this.f59533e = abstractC22342tR1.mo22679t();
        this.f59534f = abstractC22342tR1.mo22679t();
    }

    public int getLanguageId() {
        return this.f59531c;
    }

    public int getNameId() {
        return this.f59532d;
    }

    public int getPlatformEncodingId() {
        return this.f59530b;
    }

    public int getPlatformId() {
        return this.f59529a;
    }

    public String getString() {
        return this.f59535g;
    }

    public int getStringLength() {
        return this.f59533e;
    }

    public int getStringOffset() {
        return this.f59534f;
    }

    public void setLanguageId(int i) {
        this.f59531c = i;
    }

    public void setNameId(int i) {
        this.f59532d = i;
    }

    public void setPlatformEncodingId(int i) {
        this.f59530b = i;
    }

    public void setPlatformId(int i) {
        this.f59529a = i;
    }

    public void setString(String str) {
        this.f59535g = str;
    }

    public void setStringLength(int i) {
        this.f59533e = i;
    }

    public void setStringOffset(int i) {
        this.f59534f = i;
    }

    public String toString() {
        return "platform=" + this.f59529a + " pEncoding=" + this.f59530b + " language=" + this.f59531c + " name=" + this.f59532d + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f59535g;
    }
}