package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* loaded from: classes6.dex */
public class Soundex implements StringEncoder {
    public static final char SILENT_MARKER = '-';

    /* renamed from: a */
    public int f73171a;

    /* renamed from: b */
    public final char[] f73172b;

    /* renamed from: c */
    public final boolean f73173c;
    public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";

    /* renamed from: d */
    public static final char[] f73170d = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final Soundex US_ENGLISH = new Soundex();
    public static final Soundex US_ENGLISH_SIMPLIFIED = new Soundex(US_ENGLISH_MAPPING_STRING, false);
    public static final Soundex US_ENGLISH_GENEALOGY = new Soundex("-123-12--22455-12623-1-2-2");

    public Soundex() {
        this.f73171a = 4;
        this.f73172b = f73170d;
        this.f73173c = true;
    }

    /* renamed from: a */
    public final boolean m25510a(char[] cArr) {
        for (char c : cArr) {
            if (c == '-') {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final char m25509b(char c) {
        int i = c - 'A';
        if (i >= 0) {
            char[] cArr = this.f73172b;
            if (i < cArr.length) {
                return cArr[i];
            }
        }
        throw new IllegalArgumentException("The character is not mapped: " + c + " (index=" + i + ")");
    }

    public int difference(String str, String str2) throws EncoderException {
        return AbstractC22260tK1.m22458b(this, str, str2);
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
        return this.f73171a;
    }

    @Deprecated
    public void setMaxLength(int i) {
        this.f73171a = i;
    }

    public String soundex(String str) {
        char m25509b;
        if (str == null) {
            return null;
        }
        String m22459a = AbstractC22260tK1.m22459a(str);
        if (m22459a.isEmpty()) {
            return m22459a;
        }
        char[] cArr = {'0', '0', '0', '0'};
        char charAt = m22459a.charAt(0);
        cArr[0] = charAt;
        char m25509b2 = m25509b(charAt);
        int i = 1;
        for (int i2 = 1; i2 < m22459a.length() && i < 4; i2++) {
            char charAt2 = m22459a.charAt(i2);
            if ((!this.f73173c || (charAt2 != 'H' && charAt2 != 'W')) && (m25509b = m25509b(charAt2)) != '-') {
                if (m25509b != '0' && m25509b != m25509b2) {
                    cArr[i] = m25509b;
                    i++;
                }
                m25509b2 = m25509b;
            }
        }
        return new String(cArr);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    public Soundex(char[] cArr) {
        this.f73171a = 4;
        char[] cArr2 = (char[]) cArr.clone();
        this.f73172b = cArr2;
        this.f73173c = !m25510a(cArr2);
    }

    public Soundex(String str) {
        this.f73171a = 4;
        char[] charArray = str.toCharArray();
        this.f73172b = charArray;
        this.f73173c = !m25510a(charArray);
    }

    public Soundex(String str, boolean z) {
        this.f73171a = 4;
        this.f73172b = str.toCharArray();
        this.f73173c = z;
    }
}
