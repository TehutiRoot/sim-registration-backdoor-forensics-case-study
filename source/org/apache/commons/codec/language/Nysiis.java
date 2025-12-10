package org.apache.commons.codec.language;

import java.util.regex.Pattern;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class Nysiis implements StringEncoder {

    /* renamed from: b */
    public static final char[] f73151b = {'A'};

    /* renamed from: c */
    public static final char[] f73152c = {'A', 'F'};

    /* renamed from: d */
    public static final char[] f73153d = {'C'};

    /* renamed from: e */
    public static final char[] f73154e = {'F', 'F'};

    /* renamed from: f */
    public static final char[] f73155f = {'G'};

    /* renamed from: g */
    public static final char[] f73156g = {'N'};

    /* renamed from: h */
    public static final char[] f73157h = {'N', 'N'};

    /* renamed from: i */
    public static final char[] f73158i = {'S'};

    /* renamed from: j */
    public static final char[] f73159j = {'S', 'S', 'S'};

    /* renamed from: k */
    public static final Pattern f73160k = Pattern.compile("^MAC");

    /* renamed from: l */
    public static final Pattern f73161l = Pattern.compile("^KN");

    /* renamed from: m */
    public static final Pattern f73162m = Pattern.compile("^K");

    /* renamed from: n */
    public static final Pattern f73163n = Pattern.compile("^(PH|PF)");

    /* renamed from: o */
    public static final Pattern f73164o = Pattern.compile("^SCH");

    /* renamed from: p */
    public static final Pattern f73165p = Pattern.compile("(EE|IE)$");

    /* renamed from: q */
    public static final Pattern f73166q = Pattern.compile("(DT|RT|RD|NT|ND)$");

    /* renamed from: a */
    public final boolean f73167a;

    public Nysiis() {
        this(true);
    }

    /* renamed from: a */
    private static boolean m25513a(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    /* renamed from: b */
    public static char[] m25512b(char c, char c2, char c3, char c4) {
        if (c2 == 'E' && c3 == 'V') {
            return f73152c;
        }
        if (m25513a(c2)) {
            return f73151b;
        }
        if (c2 != 'K') {
            if (c2 != 'M') {
                if (c2 != 'Q') {
                    if (c2 != 'Z') {
                        if (c2 == 'S' && c3 == 'C' && c4 == 'H') {
                            return f73159j;
                        }
                        if (c2 == 'P' && c3 == 'H') {
                            return f73154e;
                        }
                        return (c2 != 'H' || (m25513a(c) && m25513a(c3))) ? (c2 == 'W' && m25513a(c)) ? new char[]{c} : new char[]{c2} : new char[]{c};
                    }
                    return f73158i;
                }
                return f73155f;
            }
            return f73156g;
        } else if (c3 == 'N') {
            return f73157h;
        } else {
            return f73153d;
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
        return this.f73167a;
    }

    public String nysiis(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String m22459a = AbstractC22260tK1.m22459a(str);
        if (m22459a.isEmpty()) {
            return m22459a;
        }
        String replaceFirst = f73166q.matcher(f73165p.matcher(f73164o.matcher(f73163n.matcher(f73162m.matcher(f73161l.matcher(f73160k.matcher(m22459a).replaceFirst("MCC")).replaceFirst("NN")).replaceFirst("C")).replaceFirst("FF")).replaceFirst("SSS")).replaceFirst("Y")).replaceFirst("D");
        StringBuilder sb = new StringBuilder(replaceFirst.length());
        sb.append(replaceFirst.charAt(0));
        char[] charArray = replaceFirst.toCharArray();
        int length = charArray.length;
        for (int i = 1; i < length; i++) {
            int i2 = length - 1;
            char c2 = TokenParser.f74560SP;
            if (i < i2) {
                c = charArray[i + 1];
            } else {
                c = TokenParser.f74560SP;
            }
            if (i < length - 2) {
                c2 = charArray[i + 2];
            }
            int i3 = i - 1;
            char[] m25512b = m25512b(charArray[i3], charArray[i], c, c2);
            System.arraycopy(m25512b, 0, charArray, i, m25512b.length);
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
        this.f73167a = z;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return nysiis(str);
    }
}
