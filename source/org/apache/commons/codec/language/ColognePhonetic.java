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
    public static final char[] f73116a = {'A', 'E', 'I', 'J', 'O', Matrix.MATRIX_TYPE_RANDOM_UT, 'Y'};

    /* renamed from: b */
    public static final char[] f73117b = {'C', 'S', Matrix.MATRIX_TYPE_ZERO};

    /* renamed from: c */
    public static final char[] f73118c = {'F', 'P', 'V', 'W'};

    /* renamed from: d */
    public static final char[] f73119d = {'G', 'K', 'Q'};

    /* renamed from: e */
    public static final char[] f73120e = {'C', 'K', 'Q'};

    /* renamed from: f */
    public static final char[] f73121f = {'A', 'H', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'O', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, Matrix.MATRIX_TYPE_RANDOM_UT, 'X'};

    /* renamed from: g */
    public static final char[] f73122g = {'S', Matrix.MATRIX_TYPE_ZERO};

    /* renamed from: h */
    public static final char[] f73123h = {'A', 'H', 'K', 'O', 'Q', Matrix.MATRIX_TYPE_RANDOM_UT, 'X'};

    /* renamed from: i */
    public static final char[] f73124i = {'D', 'T', 'X'};

    /* renamed from: org.apache.commons.codec.language.ColognePhonetic$b */
    /* loaded from: classes6.dex */
    public final class C12491b extends AbstractC12490a {
        public C12491b(char[] cArr) {
            super(cArr);
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.AbstractC12490a
        /* renamed from: a */
        public char[] mo25573a(int i, int i2) {
            char[] cArr = new char[i2];
            char[] cArr2 = this.f73125a;
            System.arraycopy(cArr2, (cArr2.length - this.f73126b) + i, cArr, 0, i2);
            return cArr;
        }

        /* renamed from: d */
        public char m25576d() {
            return this.f73125a[m25575e()];
        }

        /* renamed from: e */
        public int m25575e() {
            return this.f73125a.length - this.f73126b;
        }

        /* renamed from: f */
        public char m25574f() {
            this.f73126b--;
            return m25576d();
        }
    }

    /* renamed from: org.apache.commons.codec.language.ColognePhonetic$c */
    /* loaded from: classes6.dex */
    public final class C12492c extends AbstractC12490a {

        /* renamed from: c */
        public char f73128c;

        public C12492c(int i) {
            super(i);
            this.f73128c = '/';
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.AbstractC12490a
        /* renamed from: a */
        public char[] mo25573a(int i, int i2) {
            return Arrays.copyOfRange(this.f73125a, i, i2);
        }

        /* renamed from: d */
        public void m25572d(char c) {
            if (c != '-' && this.f73128c != c && (c != '0' || this.f73126b == 0)) {
                char[] cArr = this.f73125a;
                int i = this.f73126b;
                cArr[i] = c;
                this.f73126b = i + 1;
            }
            this.f73128c = c;
        }
    }

    /* renamed from: a */
    public static boolean m25580a(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final char[] m25579b(String str) {
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
        C12491b c12491b = new C12491b(m25579b(str));
        C12492c c12492c = new C12492c(c12491b.m25577c() * 2);
        char c2 = '-';
        while (!c12491b.m25578b()) {
            char m25574f = c12491b.m25574f();
            if (!c12491b.m25578b()) {
                c = c12491b.m25576d();
            } else {
                c = '-';
            }
            if (m25574f >= 'A' && m25574f <= 'Z') {
                if (m25580a(f73116a, m25574f)) {
                    c12492c.m25572d('0');
                } else if (m25574f != 'B' && (m25574f != 'P' || c == 'H')) {
                    if ((m25574f == 'D' || m25574f == 'T') && !m25580a(f73117b, c)) {
                        c12492c.m25572d('2');
                    } else if (m25580a(f73118c, m25574f)) {
                        c12492c.m25572d('3');
                    } else if (m25580a(f73119d, m25574f)) {
                        c12492c.m25572d('4');
                    } else if (m25574f == 'X' && !m25580a(f73120e, c2)) {
                        c12492c.m25572d('4');
                        c12492c.m25572d('8');
                    } else if (m25574f != 'S' && m25574f != 'Z') {
                        if (m25574f == 'C') {
                            if (c12492c.m25578b()) {
                                if (m25580a(f73121f, c)) {
                                    c12492c.m25572d('4');
                                } else {
                                    c12492c.m25572d('8');
                                }
                            } else if (!m25580a(f73122g, c2) && m25580a(f73123h, c)) {
                                c12492c.m25572d('4');
                            } else {
                                c12492c.m25572d('8');
                            }
                        } else if (m25580a(f73124i, m25574f)) {
                            c12492c.m25572d('8');
                        } else if (m25574f != 'H') {
                            if (m25574f != 'R') {
                                switch (m25574f) {
                                    case 'L':
                                        c12492c.m25572d('5');
                                        break;
                                    case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                                    case 'N':
                                        c12492c.m25572d('6');
                                        break;
                                }
                            } else {
                                c12492c.m25572d('7');
                            }
                        } else {
                            c12492c.m25572d('-');
                        }
                    } else {
                        c12492c.m25572d('8');
                    }
                } else {
                    c12492c.m25572d('1');
                }
                c2 = m25574f;
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
        public final char[] f73125a;

        /* renamed from: b */
        public int f73126b;

        public AbstractC12490a(char[] cArr) {
            this.f73125a = cArr;
            this.f73126b = cArr.length;
        }

        /* renamed from: a */
        public abstract char[] mo25573a(int i, int i2);

        /* renamed from: b */
        public boolean m25578b() {
            if (m25577c() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public int m25577c() {
            return this.f73126b;
        }

        public String toString() {
            return new String(mo25573a(0, this.f73126b));
        }

        public AbstractC12490a(int i) {
            this.f73125a = new char[i];
            this.f73126b = 0;
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return colognePhonetic(str);
    }
}
