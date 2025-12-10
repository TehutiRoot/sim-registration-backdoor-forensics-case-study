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
    public int f59517a;

    /* renamed from: b */
    public int f59518b;

    /* renamed from: c */
    public int f59519c;

    /* renamed from: d */
    public int f59520d;

    /* renamed from: e */
    public int f59521e;

    /* renamed from: f */
    public int f59522f;

    /* renamed from: g */
    public String f59523g;

    /* renamed from: a */
    public void m32897a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59517a = abstractC22790wQ1.mo844t();
        this.f59518b = abstractC22790wQ1.mo844t();
        this.f59519c = abstractC22790wQ1.mo844t();
        this.f59520d = abstractC22790wQ1.mo844t();
        this.f59521e = abstractC22790wQ1.mo844t();
        this.f59522f = abstractC22790wQ1.mo844t();
    }

    public int getLanguageId() {
        return this.f59519c;
    }

    public int getNameId() {
        return this.f59520d;
    }

    public int getPlatformEncodingId() {
        return this.f59518b;
    }

    public int getPlatformId() {
        return this.f59517a;
    }

    public String getString() {
        return this.f59523g;
    }

    public int getStringLength() {
        return this.f59521e;
    }

    public int getStringOffset() {
        return this.f59522f;
    }

    public void setLanguageId(int i) {
        this.f59519c = i;
    }

    public void setNameId(int i) {
        this.f59520d = i;
    }

    public void setPlatformEncodingId(int i) {
        this.f59518b = i;
    }

    public void setPlatformId(int i) {
        this.f59517a = i;
    }

    public void setString(String str) {
        this.f59523g = str;
    }

    public void setStringLength(int i) {
        this.f59521e = i;
    }

    public void setStringOffset(int i) {
        this.f59522f = i;
    }

    public String toString() {
        return "platform=" + this.f59517a + " pEncoding=" + this.f59518b + " language=" + this.f59519c + " name=" + this.f59520d + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f59523g;
    }
}
