package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* loaded from: classes6.dex */
public class Soundex implements StringEncoder {
    public static final char SILENT_MARKER = '-';

    /* renamed from: a */
    public int f73255a;

    /* renamed from: b */
    public final char[] f73256b;

    /* renamed from: c */
    public final boolean f73257c;
    public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";

    /* renamed from: d */
    public static final char[] f73254d = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final Soundex US_ENGLISH = new Soundex();
    public static final Soundex US_ENGLISH_SIMPLIFIED = new Soundex(US_ENGLISH_MAPPING_STRING, false);
    public static final Soundex US_ENGLISH_GENEALOGY = new Soundex("-123-12--22455-12623-1-2-2");

    public Soundex() {
        this.f73255a = 4;
        this.f73256b = f73254d;
        this.f73257c = true;
    }

    /* renamed from: a */
    public final boolean m25700a(char[] cArr) {
        for (char c : cArr) {
            if (c == '-') {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final char m25699b(char c) {
        int i = c - 'A';
        if (i >= 0) {
            char[] cArr = this.f73256b;
            if (i < cArr.length) {
                return cArr[i];
            }
        }
        throw new IllegalArgumentException("The character is not mapped: " + c + " (index=" + i + ")");
    }

    public int difference(String str, String str2) throws EncoderException {
        return AbstractC21809qL1.m23656b(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    @Deprecated
    public int getMaxLength() {
        return this.f73255a;
    }

    @Deprecated
    public void setMaxLength(int i) {
        this.f73255a = i;
    }

    public String soundex(String str) {
        char m25699b;
        if (str == null) {
            return null;
        }
        String m23657a = AbstractC21809qL1.m23657a(str);
        if (m23657a.isEmpty()) {
            return m23657a;
        }
        char[] cArr = {'0', '0', '0', '0'};
        char charAt = m23657a.charAt(0);
        cArr[0] = charAt;
        char m25699b2 = m25699b(charAt);
        int i = 1;
        for (int i2 = 1; i2 < m23657a.length() && i < 4; i2++) {
            char charAt2 = m23657a.charAt(i2);
            if ((!this.f73257c || (charAt2 != 'H' && charAt2 != 'W')) && (m25699b = m25699b(charAt2)) != '-') {
                if (m25699b != '0' && m25699b != m25699b2) {
                    cArr[i] = m25699b;
                    i++;
                }
                m25699b2 = m25699b;
            }
        }
        return new String(cArr);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    public Soundex(char[] cArr) {
        this.f73255a = 4;
        char[] cArr2 = (char[]) cArr.clone();
        this.f73256b = cArr2;
        this.f73257c = !m25700a(cArr2);
    }

    public Soundex(String str) {
        this.f73255a = 4;
        char[] charArray = str.toCharArray();
        this.f73256b = charArray;
        this.f73257c = !m25700a(charArray);
    }

    public Soundex(String str, boolean z) {
        this.f73255a = 4;
        this.f73256b = str.toCharArray();
        this.f73257c = z;
    }
}