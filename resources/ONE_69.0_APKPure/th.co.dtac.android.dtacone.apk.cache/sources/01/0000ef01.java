package org.apache.commons.codec.language;

import java.util.regex.Pattern;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class Nysiis implements StringEncoder {

    /* renamed from: b */
    public static final char[] f73235b = {'A'};

    /* renamed from: c */
    public static final char[] f73236c = {'A', 'F'};

    /* renamed from: d */
    public static final char[] f73237d = {'C'};

    /* renamed from: e */
    public static final char[] f73238e = {'F', 'F'};

    /* renamed from: f */
    public static final char[] f73239f = {'G'};

    /* renamed from: g */
    public static final char[] f73240g = {'N'};

    /* renamed from: h */
    public static final char[] f73241h = {'N', 'N'};

    /* renamed from: i */
    public static final char[] f73242i = {'S'};

    /* renamed from: j */
    public static final char[] f73243j = {'S', 'S', 'S'};

    /* renamed from: k */
    public static final Pattern f73244k = Pattern.compile("^MAC");

    /* renamed from: l */
    public static final Pattern f73245l = Pattern.compile("^KN");

    /* renamed from: m */
    public static final Pattern f73246m = Pattern.compile("^K");

    /* renamed from: n */
    public static final Pattern f73247n = Pattern.compile("^(PH|PF)");

    /* renamed from: o */
    public static final Pattern f73248o = Pattern.compile("^SCH");

    /* renamed from: p */
    public static final Pattern f73249p = Pattern.compile("(EE|IE)$");

    /* renamed from: q */
    public static final Pattern f73250q = Pattern.compile("(DT|RT|RD|NT|ND)$");

    /* renamed from: a */
    public final boolean f73251a;

    public Nysiis() {
        this(true);
    }

    /* renamed from: a */
    private static boolean m25703a(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    /* renamed from: b */
    public static char[] m25702b(char c, char c2, char c3, char c4) {
        if (c2 == 'E' && c3 == 'V') {
            return f73236c;
        }
        if (m25703a(c2)) {
            return f73235b;
        }
        if (c2 != 'K') {
            if (c2 != 'M') {
                if (c2 != 'Q') {
                    if (c2 != 'Z') {
                        if (c2 == 'S' && c3 == 'C' && c4 == 'H') {
                            return f73243j;
                        }
                        if (c2 == 'P' && c3 == 'H') {
                            return f73238e;
                        }
                        return (c2 != 'H' || (m25703a(c) && m25703a(c3))) ? (c2 == 'W' && m25703a(c)) ? new char[]{c} : new char[]{c2} : new char[]{c};
                    }
                    return f73242i;
                }
                return f73239f;
            }
            return f73240g;
        } else if (c3 == 'N') {
            return f73241h;
        } else {
            return f73237d;
        }
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return nysiis((String) obj);
        }
        throw new EncoderException("Parameter supplied to Nysiis encode is not of type java.lang.String");
    }

    public boolean isStrict() {
        return this.f73251a;
    }

    public String nysiis(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String m23657a = AbstractC21809qL1.m23657a(str);
        if (m23657a.isEmpty()) {
            return m23657a;
        }
        String replaceFirst = f73250q.matcher(f73249p.matcher(f73248o.matcher(f73247n.matcher(f73246m.matcher(f73245l.matcher(f73244k.matcher(m23657a).replaceFirst("MCC")).replaceFirst("NN")).replaceFirst("C")).replaceFirst("FF")).replaceFirst("SSS")).replaceFirst("Y")).replaceFirst("D");
        StringBuilder sb = new StringBuilder(replaceFirst.length());
        sb.append(replaceFirst.charAt(0));
        char[] charArray = replaceFirst.toCharArray();
        int length = charArray.length;
        for (int i = 1; i < length; i++) {
            int i2 = length - 1;
            char c2 = TokenParser.f74644SP;
            if (i < i2) {
                c = charArray[i + 1];
            } else {
                c = TokenParser.f74644SP;
            }
            if (i < length - 2) {
                c2 = charArray[i + 2];
            }
            int i3 = i - 1;
            char[] m25702b = m25702b(charArray[i3], charArray[i], c, c2);
            System.arraycopy(m25702b, 0, charArray, i, m25702b.length);
            char c3 = charArray[i];
            if (c3 != charArray[i3]) {
                sb.append(c3);
            }
        }
        if (sb.length() > 1) {
            char charAt = sb.charAt(sb.length() - 1);
            if (charAt == 'S') {
                sb.deleteCharAt(sb.length() - 1);
                charAt = sb.charAt(sb.length() - 1);
            }
            if (sb.length() > 2 && sb.charAt(sb.length() - 2) == 'A' && charAt == 'Y') {
                sb.deleteCharAt(sb.length() - 2);
            }
            if (charAt == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        String sb2 = sb.toString();
        if (isStrict()) {
            return sb2.substring(0, Math.min(6, sb2.length()));
        }
        return sb2;
    }

    public Nysiis(boolean z) {
        this.f73251a = z;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return nysiis(str);
    }
}