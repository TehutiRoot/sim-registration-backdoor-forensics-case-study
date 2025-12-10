package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* loaded from: classes6.dex */
public class RefinedSoundex implements StringEncoder {

    /* renamed from: a */
    public final char[] f73169a;
    public static final String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";

    /* renamed from: b */
    public static final char[] f73168b = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final RefinedSoundex US_ENGLISH = new RefinedSoundex();

    public RefinedSoundex() {
        this.f73169a = f73168b;
    }

    /* renamed from: a */
    public char m25511a(char c) {
        int upperCase;
        if (Character.isLetter(c) && Character.toUpperCase(c) - 'A' >= 0) {
            char[] cArr = this.f73169a;
            if (upperCase < cArr.length) {
                return cArr[upperCase];
            }
        }
        return (char) 0;
    }

    public int difference(String str, String str2) throws EncoderException {
        return AbstractC22260tK1.m22458b(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String m22459a = AbstractC22260tK1.m22459a(str);
        if (m22459a.isEmpty()) {
            return m22459a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m22459a.charAt(0));
        char c = '*';
        for (int i = 0; i < m22459a.length(); i++) {
            char m25511a = m25511a(m22459a.charAt(i));
            if (m25511a != c) {
                if (m25511a != 0) {
                    sb.append(m25511a);
                }
                c = m25511a;
            }
        }
        return sb.toString();
    }

    public RefinedSoundex(char[] cArr) {
        this.f73169a = (char[]) cArr.clone();
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    public RefinedSoundex(String str) {
        this.f73169a = str.toCharArray();
    }
}
