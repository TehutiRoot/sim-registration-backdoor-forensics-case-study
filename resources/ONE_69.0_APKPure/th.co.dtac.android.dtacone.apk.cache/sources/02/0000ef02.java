package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* loaded from: classes6.dex */
public class RefinedSoundex implements StringEncoder {

    /* renamed from: a */
    public final char[] f73253a;
    public static final String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";

    /* renamed from: b */
    public static final char[] f73252b = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final RefinedSoundex US_ENGLISH = new RefinedSoundex();

    public RefinedSoundex() {
        this.f73253a = f73252b;
    }

    /* renamed from: a */
    public char m25701a(char c) {
        int upperCase;
        if (Character.isLetter(c) && Character.toUpperCase(c) - 'A' >= 0) {
            char[] cArr = this.f73253a;
            if (upperCase < cArr.length) {
                return cArr[upperCase];
            }
        }
        return (char) 0;
    }

    public int difference(String str, String str2) throws EncoderException {
        return AbstractC21809qL1.m23656b(this, str, str2);
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
        String m23657a = AbstractC21809qL1.m23657a(str);
        if (m23657a.isEmpty()) {
            return m23657a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m23657a.charAt(0));
        char c = '*';
        for (int i = 0; i < m23657a.length(); i++) {
            char m25701a = m25701a(m23657a.charAt(i));
            if (m25701a != c) {
                if (m25701a != 0) {
                    sb.append(m25701a);
                }
                c = m25701a;
            }
        }
        return sb.toString();
    }

    public RefinedSoundex(char[] cArr) {
        this.f73253a = (char[]) cArr.clone();
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    public RefinedSoundex(String str) {
        this.f73253a = str.toCharArray();
    }
}