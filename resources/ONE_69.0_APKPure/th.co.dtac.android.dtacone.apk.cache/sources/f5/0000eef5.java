package org.apache.commons.codec.language;

import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes6.dex */
public class ColognePhonetic implements StringEncoder {

    /* renamed from: a */
    public static final char[] f73200a = {'A', 'E', 'I', 'J', 'O', Matrix.MATRIX_TYPE_RANDOM_UT, 'Y'};

    /* renamed from: b */
    public static final char[] f73201b = {'C', 'S', Matrix.MATRIX_TYPE_ZERO};

    /* renamed from: c */
    public static final char[] f73202c = {'F', 'P', 'V', 'W'};

    /* renamed from: d */
    public static final char[] f73203d = {'G', 'K', 'Q'};

    /* renamed from: e */
    public static final char[] f73204e = {'C', 'K', 'Q'};

    /* renamed from: f */
    public static final char[] f73205f = {'A', 'H', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'O', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, Matrix.MATRIX_TYPE_RANDOM_UT, 'X'};

    /* renamed from: g */
    public static final char[] f73206g = {'S', Matrix.MATRIX_TYPE_ZERO};

    /* renamed from: h */
    public static final char[] f73207h = {'A', 'H', 'K', 'O', 'Q', Matrix.MATRIX_TYPE_RANDOM_UT, 'X'};

    /* renamed from: i */
    public static final char[] f73208i = {'D', 'T', 'X'};

    /* renamed from: org.apache.commons.codec.language.ColognePhonetic$b */
    /* loaded from: classes6.dex */
    public final class C12491b extends AbstractC12490a {
        public C12491b(char[] cArr) {
            super(cArr);
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.AbstractC12490a
        /* renamed from: a */
        public char[] mo25763a(int i, int i2) {
            char[] cArr = new char[i2];
            char[] cArr2 = this.f73209a;
            System.arraycopy(cArr2, (cArr2.length - this.f73210b) + i, cArr, 0, i2);
            return cArr;
        }

        /* renamed from: d */
        public char m25766d() {
            return this.f73209a[m25765e()];
        }

        /* renamed from: e */
        public int m25765e() {
            return this.f73209a.length - this.f73210b;
        }

        /* renamed from: f */
        public char m25764f() {
            this.f73210b--;
            return m25766d();
        }
    }

    /* renamed from: org.apache.commons.codec.language.ColognePhonetic$c */
    /* loaded from: classes6.dex */
    public final class C12492c extends AbstractC12490a {

        /* renamed from: c */
        public char f73212c;

        public C12492c(int i) {
            super(i);
            this.f73212c = '/';
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.AbstractC12490a
        /* renamed from: a */
        public char[] mo25763a(int i, int i2) {
            return Arrays.copyOfRange(this.f73209a, i, i2);
        }

        /* renamed from: d */
        public void m25762d(char c) {
            if (c != '-' && this.f73212c != c && (c != '0' || this.f73210b == 0)) {
                char[] cArr = this.f73209a;
                int i = this.f73210b;
                cArr[i] = c;
                this.f73210b = i + 1;
            }
            this.f73212c = c;
        }
    }

    /* renamed from: a */
    public static boolean m25770a(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final char[] m25769b(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c != 196) {
                if (c != 214) {
                    if (c == 220) {
                        charArray[i] = Matrix.MATRIX_TYPE_RANDOM_UT;
                    }
                } else {
                    charArray[i] = 'O';
                }
            } else {
                charArray[i] = 'A';
            }
        }
        return charArray;
    }

    public String colognePhonetic(String str) {
        char c;
        if (str == null) {
            return null;
        }
        C12491b c12491b = new C12491b(m25769b(str));
        C12492c c12492c = new C12492c(c12491b.m25767c() * 2);
        char c2 = '-';
        while (!c12491b.m25768b()) {
            char m25764f = c12491b.m25764f();
            if (!c12491b.m25768b()) {
                c = c12491b.m25766d();
            } else {
                c = '-';
            }
            if (m25764f >= 'A' && m25764f <= 'Z') {
                if (m25770a(f73200a, m25764f)) {
                    c12492c.m25762d('0');
                } else if (m25764f != 'B' && (m25764f != 'P' || c == 'H')) {
                    if ((m25764f == 'D' || m25764f == 'T') && !m25770a(f73201b, c)) {
                        c12492c.m25762d('2');
                    } else if (m25770a(f73202c, m25764f)) {
                        c12492c.m25762d('3');
                    } else if (m25770a(f73203d, m25764f)) {
                        c12492c.m25762d('4');
                    } else if (m25764f == 'X' && !m25770a(f73204e, c2)) {
                        c12492c.m25762d('4');
                        c12492c.m25762d('8');
                    } else if (m25764f != 'S' && m25764f != 'Z') {
                        if (m25764f == 'C') {
                            if (c12492c.m25768b()) {
                                if (m25770a(f73205f, c)) {
                                    c12492c.m25762d('4');
                                } else {
                                    c12492c.m25762d('8');
                                }
                            } else if (!m25770a(f73206g, c2) && m25770a(f73207h, c)) {
                                c12492c.m25762d('4');
                            } else {
                                c12492c.m25762d('8');
                            }
                        } else if (m25770a(f73208i, m25764f)) {
                            c12492c.m25762d('8');
                        } else if (m25764f != 'H') {
                            if (m25764f != 'R') {
                                switch (m25764f) {
                                    case 'L':
                                        c12492c.m25762d('5');
                                        break;
                                    case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                                    case 'N':
                                        c12492c.m25762d('6');
                                        break;
                                }
                            } else {
                                c12492c.m25762d('7');
                            }
                        } else {
                            c12492c.m25762d('-');
                        }
                    } else {
                        c12492c.m25762d('8');
                    }
                } else {
                    c12492c.m25762d('1');
                }
                c2 = m25764f;
            }
        }
        return c12492c.toString();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + obj.getClass().getName() + ".");
    }

    public boolean isEncodeEqual(String str, String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }

    /* renamed from: org.apache.commons.codec.language.ColognePhonetic$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC12490a {

        /* renamed from: a */
        public final char[] f73209a;

        /* renamed from: b */
        public int f73210b;

        public AbstractC12490a(char[] cArr) {
            this.f73209a = cArr;
            this.f73210b = cArr.length;
        }

        /* renamed from: a */
        public abstract char[] mo25763a(int i, int i2);

        /* renamed from: b */
        public boolean m25768b() {
            if (m25767c() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public int m25767c() {
            return this.f73210b;
        }

        public String toString() {
            return new String(mo25763a(0, this.f73210b));
        }

        public AbstractC12490a(int i) {
            this.f73209a = new char[i];
            this.f73210b = 0;
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return colognePhonetic(str);
    }
}