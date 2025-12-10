package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.internal._BufferKt;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class FastParser<T extends FastJsonResponse> {

    /* renamed from: g */
    public static final char[] f45256g = {AbstractJsonLexerKt.UNICODE_ESC, 'l', 'l'};

    /* renamed from: h */
    public static final char[] f45257h = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e'};

    /* renamed from: i */
    public static final char[] f45258i = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e', '\"'};

    /* renamed from: j */
    public static final char[] f45259j = {'a', 'l', 's', 'e'};

    /* renamed from: k */
    public static final char[] f45260k = {'a', 'l', 's', 'e', '\"'};

    /* renamed from: l */
    public static final char[] f45261l = {'\n'};

    /* renamed from: m */
    public static final InterfaceC6358i f45262m = new C6350a();

    /* renamed from: n */
    public static final InterfaceC6358i f45263n = new C6351b();

    /* renamed from: o */
    public static final InterfaceC6358i f45264o = new C6352c();

    /* renamed from: p */
    public static final InterfaceC6358i f45265p = new C6353d();

    /* renamed from: q */
    public static final InterfaceC6358i f45266q = new C6354e();

    /* renamed from: r */
    public static final InterfaceC6358i f45267r = new C6355f();

    /* renamed from: s */
    public static final InterfaceC6358i f45268s = new C6356g();

    /* renamed from: t */
    public static final InterfaceC6358i f45269t = new C6357h();

    /* renamed from: a */
    public final char[] f45270a = new char[1];

    /* renamed from: b */
    public final char[] f45271b = new char[32];

    /* renamed from: c */
    public final char[] f45272c = new char[1024];

    /* renamed from: d */
    public final StringBuilder f45273d = new StringBuilder(32);

    /* renamed from: e */
    public final StringBuilder f45274e = new StringBuilder(1024);

    /* renamed from: f */
    public final Stack f45275f = new Stack();

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class ParseException extends Exception {
        public ParseException(@NonNull String str) {
            super(str);
        }

        public ParseException(@NonNull String str, @NonNull Throwable th2) {
            super("Error instantiating inner object", th2);
        }

        public ParseException(@NonNull Throwable th2) {
            super(th2);
        }
    }

    /* renamed from: a */
    public static final String m48357a(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        loop0: while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                int i = 0;
                while (i < read) {
                    char c = cArr[i];
                    if (!Character.isISOControl(c) || (cArr2 != null && cArr2[0] == c)) {
                        int i2 = i + 1;
                        if (c == '\"') {
                            if (!z) {
                                sb.append(cArr, 0, i);
                                bufferedReader.reset();
                                bufferedReader.skip(i2);
                                if (z2) {
                                    return JsonUtils.unescapeString(sb.toString());
                                }
                                return sb.toString();
                            }
                        } else if (c == '\\') {
                            z = !z;
                            z2 = true;
                            i = i2;
                        }
                        z = false;
                        i = i2;
                    }
                }
                sb.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
            } else {
                throw new ParseException("Unexpected EOF while parsing string");
            }
        }
        throw new ParseException("Unexpected control character while reading string");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public final boolean m48358A(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) {
        HashMap hashMap;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String m48340r = m48340r(bufferedReader);
        if (m48340r != null) {
            while (m48340r != null) {
                FastJsonResponse.Field<?, ?> field = fieldMappings.get(m48340r);
                if (field == null) {
                    m48340r = m48339s(bufferedReader);
                } else {
                    this.f45275f.push(4);
                    int i = field.zaa;
                    switch (i) {
                        case 0:
                            if (field.zab) {
                                fastJsonResponse.zav(field, m48336v(bufferedReader, f45262m));
                                break;
                            } else {
                                fastJsonResponse.zau(field, m48345m(bufferedReader));
                                break;
                            }
                        case 1:
                            if (field.zab) {
                                fastJsonResponse.zag(field, m48336v(bufferedReader, f45268s));
                                break;
                            } else {
                                fastJsonResponse.zae(field, m48337u(bufferedReader));
                                break;
                            }
                        case 2:
                            if (field.zab) {
                                fastJsonResponse.zay(field, m48336v(bufferedReader, f45263n));
                                break;
                            } else {
                                fastJsonResponse.zax(field, m48343o(bufferedReader));
                                break;
                            }
                        case 3:
                            if (field.zab) {
                                fastJsonResponse.zas(field, m48336v(bufferedReader, f45264o));
                                break;
                            } else {
                                fastJsonResponse.zaq(field, m48346l(bufferedReader));
                                break;
                            }
                        case 4:
                            if (field.zab) {
                                fastJsonResponse.zao(field, m48336v(bufferedReader, f45265p));
                                break;
                            } else {
                                fastJsonResponse.zam(field, m48347k(bufferedReader));
                                break;
                            }
                        case 5:
                            if (field.zab) {
                                fastJsonResponse.zac(field, m48336v(bufferedReader, f45269t));
                                break;
                            } else {
                                fastJsonResponse.zaa(field, m48338t(bufferedReader));
                                break;
                            }
                        case 6:
                            if (field.zab) {
                                fastJsonResponse.zaj(field, m48336v(bufferedReader, f45266q));
                                break;
                            } else {
                                fastJsonResponse.zai(field, m48332z(bufferedReader, false));
                                break;
                            }
                        case 7:
                            if (field.zab) {
                                fastJsonResponse.zaC(field, m48336v(bufferedReader, f45267r));
                                break;
                            } else {
                                fastJsonResponse.zaA(field, m48342p(bufferedReader));
                                break;
                            }
                        case 8:
                            fastJsonResponse.zal(field, Base64Utils.decode(m48341q(bufferedReader, this.f45272c, this.f45274e, f45261l)));
                            break;
                        case 9:
                            fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(m48341q(bufferedReader, this.f45272c, this.f45274e, f45261l)));
                            break;
                        case 10:
                            char m48348j = m48348j(bufferedReader);
                            if (m48348j == 'n') {
                                m48333y(bufferedReader, f45256g);
                                hashMap = null;
                            } else if (m48348j == '{') {
                                this.f45275f.push(1);
                                hashMap = new HashMap();
                                while (true) {
                                    char m48348j2 = m48348j(bufferedReader);
                                    if (m48348j2 != 0) {
                                        if (m48348j2 != '\"') {
                                            if (m48348j2 == '}') {
                                                m48334x(1);
                                            }
                                        } else {
                                            String m48357a = m48357a(bufferedReader, this.f45271b, this.f45273d, null);
                                            if (m48348j(bufferedReader) == ':') {
                                                if (m48348j(bufferedReader) == '\"') {
                                                    hashMap.put(m48357a, m48357a(bufferedReader, this.f45271b, this.f45273d, null));
                                                    char m48348j3 = m48348j(bufferedReader);
                                                    if (m48348j3 != ',') {
                                                        if (m48348j3 == '}') {
                                                            m48334x(1);
                                                        } else {
                                                            throw new ParseException("Unexpected character while parsing string map: " + m48348j3);
                                                        }
                                                    }
                                                } else {
                                                    throw new ParseException("Expected String value for key ".concat(String.valueOf(m48357a)));
                                                }
                                            } else {
                                                throw new ParseException("No map value found for key ".concat(String.valueOf(m48357a)));
                                            }
                                        }
                                    } else {
                                        throw new ParseException("Unexpected EOF");
                                    }
                                }
                            } else {
                                throw new ParseException("Expected start of a map object");
                            }
                            fastJsonResponse.zaB(field, hashMap);
                            break;
                        case 11:
                            if (field.zab) {
                                char m48348j4 = m48348j(bufferedReader);
                                if (m48348j4 == 'n') {
                                    m48333y(bufferedReader, f45256g);
                                    fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                                    break;
                                } else {
                                    this.f45275f.push(5);
                                    if (m48348j4 == '[') {
                                        fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, m48335w(bufferedReader, field));
                                        break;
                                    } else {
                                        throw new ParseException("Expected array start");
                                    }
                                }
                            } else {
                                char m48348j5 = m48348j(bufferedReader);
                                if (m48348j5 == 'n') {
                                    m48333y(bufferedReader, f45256g);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                                    break;
                                } else {
                                    this.f45275f.push(1);
                                    if (m48348j5 == '{') {
                                        try {
                                            FastJsonResponse zad = field.zad();
                                            m48358A(bufferedReader, zad);
                                            fastJsonResponse.addConcreteTypeInternal(field, field.zae, zad);
                                            break;
                                        } catch (IllegalAccessException e) {
                                            throw new ParseException("Error instantiating inner object", e);
                                        } catch (InstantiationException e2) {
                                            throw new ParseException("Error instantiating inner object", e2);
                                        }
                                    } else {
                                        throw new ParseException("Expected start of object");
                                    }
                                }
                            }
                        default:
                            throw new ParseException("Invalid field type " + i);
                    }
                    m48334x(4);
                    m48334x(2);
                    char m48348j6 = m48348j(bufferedReader);
                    if (m48348j6 != ',') {
                        if (m48348j6 == '}') {
                            m48340r = null;
                        } else {
                            throw new ParseException("Expected end of object or field separator, but found: " + m48348j6);
                        }
                    } else {
                        m48340r = m48340r(bufferedReader);
                    }
                }
            }
            m48334x(1);
            return true;
        }
        m48334x(1);
        return false;
    }

    /* renamed from: j */
    public final char m48348j(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.f45270a) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.f45270a[0])) {
            if (bufferedReader.read(this.f45270a) == -1) {
                return (char) 0;
            }
        }
        return this.f45270a[0];
    }

    /* renamed from: k */
    public final double m48347k(BufferedReader bufferedReader) {
        int m48344n = m48344n(bufferedReader, this.f45272c);
        if (m48344n == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.f45272c, 0, m48344n));
    }

    /* renamed from: l */
    public final float m48346l(BufferedReader bufferedReader) {
        int m48344n = m48344n(bufferedReader, this.f45272c);
        if (m48344n == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.f45272c, 0, m48344n));
    }

    /* renamed from: m */
    public final int m48345m(BufferedReader bufferedReader) {
        int i;
        int i2;
        int i3;
        int i4;
        int m48344n = m48344n(bufferedReader, this.f45272c);
        if (m48344n == 0) {
            return 0;
        }
        char[] cArr = this.f45272c;
        if (m48344n > 0) {
            char c = cArr[0];
            if (c == '-') {
                i = Integer.MIN_VALUE;
            } else {
                i = -2147483647;
            }
            if (c == '-') {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 < m48344n) {
                i3 = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    i4 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i3 = i2;
                i4 = 0;
            }
            while (i3 < m48344n) {
                int i5 = i3 + 1;
                int digit2 = Character.digit(cArr[i3], 10);
                if (digit2 >= 0) {
                    if (i4 >= -214748364) {
                        int i6 = i4 * 10;
                        if (i6 >= i + digit2) {
                            i4 = i6 - digit2;
                            i3 = i5;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i2 != 0) {
                if (i3 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return i4;
            }
            return -i4;
        }
        throw new ParseException("No number to parse");
    }

    /* renamed from: n */
    public final int m48344n(BufferedReader bufferedReader, char[] cArr) {
        int i;
        char m48348j = m48348j(bufferedReader);
        if (m48348j != 0) {
            if (m48348j != ',') {
                if (m48348j == 'n') {
                    m48333y(bufferedReader, f45256g);
                    return 0;
                }
                bufferedReader.mark(1024);
                if (m48348j == '\"') {
                    i = 0;
                    boolean z = false;
                    while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                        char c = cArr[i];
                        if (!Character.isISOControl(c)) {
                            int i2 = i + 1;
                            if (c == '\"') {
                                if (!z) {
                                    bufferedReader.reset();
                                    bufferedReader.skip(i2);
                                    return i;
                                }
                            } else if (c == '\\') {
                                z = !z;
                                i = i2;
                            }
                            z = false;
                            i = i2;
                        } else {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                } else {
                    cArr[0] = m48348j;
                    i = 1;
                    while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                        char c2 = cArr[i];
                        if (c2 != '}' && c2 != ',' && !Character.isWhitespace(c2) && cArr[i] != ']') {
                            i++;
                        } else {
                            bufferedReader.reset();
                            bufferedReader.skip(i - 1);
                            cArr[i] = 0;
                            return i;
                        }
                    }
                }
                if (i == 1024) {
                    throw new ParseException("Absurdly long value");
                }
                throw new ParseException("Unexpected EOF");
            }
            throw new ParseException("Missing value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* renamed from: o */
    public final long m48343o(BufferedReader bufferedReader) {
        long j;
        long j2;
        int i;
        int m48344n = m48344n(bufferedReader, this.f45272c);
        if (m48344n == 0) {
            return 0L;
        }
        char[] cArr = this.f45272c;
        if (m48344n > 0) {
            int i2 = 0;
            char c = cArr[0];
            if (c == '-') {
                j = Long.MIN_VALUE;
            } else {
                j = -9223372036854775807L;
            }
            if (c == '-') {
                i2 = 1;
            }
            if (i2 < m48344n) {
                i = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    j2 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                j2 = 0;
                i = i2;
            }
            while (i < m48344n) {
                int i3 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 >= 0) {
                    if (j2 >= _BufferKt.OVERFLOW_ZONE) {
                        long j3 = j2 * 10;
                        long j4 = digit2;
                        if (j3 >= j + j4) {
                            j2 = j3 - j4;
                            i = i3;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i2 != 0) {
                if (i <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return j2;
            }
            return -j2;
        }
        throw new ParseException("No number to parse");
    }

    /* renamed from: p */
    public final String m48342p(BufferedReader bufferedReader) {
        return m48341q(bufferedReader, this.f45271b, this.f45273d, null);
    }

    @KeepForSdk
    public void parse(@NonNull InputStream inputStream, @NonNull T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.f45275f.push(0);
                char m48348j = m48348j(bufferedReader);
                if (m48348j != 0) {
                    if (m48348j != '[') {
                        if (m48348j == '{') {
                            this.f45275f.push(1);
                            m48358A(bufferedReader, t);
                        } else {
                            throw new ParseException("Unexpected token: " + m48348j);
                        }
                    } else {
                        this.f45275f.push(5);
                        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                        if (fieldMappings.size() == 1) {
                            FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                            t.addConcreteTypeArrayInternal(value, value.zae, m48335w(bufferedReader, value));
                        } else {
                            throw new ParseException("Object array response class must have a single Field");
                        }
                    }
                    m48334x(0);
                    try {
                        bufferedReader.close();
                        return;
                    } catch (IOException unused) {
                        Log.w("FastParser", "Failed to close reader while parsing.");
                        return;
                    }
                }
                throw new ParseException("No data to parse");
            } catch (IOException e) {
                throw new ParseException(e);
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th2;
        }
    }

    /* renamed from: q */
    public final String m48341q(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        char m48348j = m48348j(bufferedReader);
        if (m48348j != '\"') {
            if (m48348j == 'n') {
                m48333y(bufferedReader, f45256g);
                return null;
            }
            throw new ParseException("Expected string");
        }
        return m48357a(bufferedReader, cArr, sb, cArr2);
    }

    /* renamed from: r */
    public final String m48340r(BufferedReader bufferedReader) {
        this.f45275f.push(2);
        char m48348j = m48348j(bufferedReader);
        if (m48348j != '\"') {
            if (m48348j != ']') {
                if (m48348j == '}') {
                    m48334x(2);
                    return null;
                }
                throw new ParseException("Unexpected token: " + m48348j);
            }
            m48334x(2);
            m48334x(1);
            m48334x(5);
            return null;
        }
        this.f45275f.push(3);
        String m48357a = m48357a(bufferedReader, this.f45271b, this.f45273d, null);
        m48334x(3);
        if (m48348j(bufferedReader) == ':') {
            return m48357a;
        }
        throw new ParseException("Expected key/value separator");
    }

    /* renamed from: s */
    public final String m48339s(BufferedReader bufferedReader) {
        bufferedReader.mark(1024);
        char m48348j = m48348j(bufferedReader);
        int i = 1;
        if (m48348j != '\"') {
            if (m48348j != ',') {
                if (m48348j != '[') {
                    if (m48348j != '{') {
                        bufferedReader.reset();
                        m48344n(bufferedReader, this.f45272c);
                    } else {
                        this.f45275f.push(1);
                        bufferedReader.mark(32);
                        char m48348j2 = m48348j(bufferedReader);
                        if (m48348j2 == '}') {
                            m48334x(1);
                        } else if (m48348j2 == '\"') {
                            bufferedReader.reset();
                            m48340r(bufferedReader);
                            do {
                            } while (m48339s(bufferedReader) != null);
                            m48334x(1);
                        } else {
                            throw new ParseException("Unexpected token " + m48348j2);
                        }
                    }
                } else {
                    this.f45275f.push(5);
                    bufferedReader.mark(32);
                    if (m48348j(bufferedReader) == ']') {
                        m48334x(5);
                    } else {
                        bufferedReader.reset();
                        boolean z = false;
                        loop1: while (true) {
                            boolean z2 = false;
                            while (i > 0) {
                                char m48348j3 = m48348j(bufferedReader);
                                if (m48348j3 != 0) {
                                    if (!Character.isISOControl(m48348j3)) {
                                        if (m48348j3 == '\"') {
                                            if (!z2) {
                                                z = !z;
                                            }
                                            m48348j3 = '\"';
                                        }
                                        if (m48348j3 == '[') {
                                            if (!z) {
                                                i++;
                                            }
                                            m48348j3 = AbstractJsonLexerKt.BEGIN_LIST;
                                        }
                                        if (m48348j3 == ']' && !z) {
                                            i--;
                                        }
                                        if (m48348j3 == '\\' && z) {
                                            z2 = !z2;
                                        }
                                    } else {
                                        throw new ParseException("Unexpected control character while reading array");
                                    }
                                } else {
                                    throw new ParseException("Unexpected EOF while parsing array");
                                }
                            }
                            m48334x(5);
                            break loop1;
                        }
                    }
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else if (bufferedReader.read(this.f45270a) != -1) {
            char c = this.f45270a[0];
            boolean z3 = false;
            do {
                if (c == '\"') {
                    if (z3) {
                        c = '\"';
                        z3 = true;
                    }
                }
                if (c == '\\') {
                    z3 = !z3;
                } else {
                    z3 = false;
                }
                if (bufferedReader.read(this.f45270a) != -1) {
                    c = this.f45270a[0];
                } else {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        } else {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char m48348j4 = m48348j(bufferedReader);
        if (m48348j4 != ',') {
            if (m48348j4 == '}') {
                m48334x(2);
                return null;
            }
            throw new ParseException("Unexpected token " + m48348j4);
        }
        m48334x(2);
        return m48340r(bufferedReader);
    }

    /* renamed from: t */
    public final BigDecimal m48338t(BufferedReader bufferedReader) {
        int m48344n = m48344n(bufferedReader, this.f45272c);
        if (m48344n == 0) {
            return null;
        }
        return new BigDecimal(new String(this.f45272c, 0, m48344n));
    }

    /* renamed from: u */
    public final BigInteger m48337u(BufferedReader bufferedReader) {
        int m48344n = m48344n(bufferedReader, this.f45272c);
        if (m48344n == 0) {
            return null;
        }
        return new BigInteger(new String(this.f45272c, 0, m48344n));
    }

    /* renamed from: v */
    public final ArrayList m48336v(BufferedReader bufferedReader, InterfaceC6358i interfaceC6358i) {
        char m48348j = m48348j(bufferedReader);
        if (m48348j == 'n') {
            m48333y(bufferedReader, f45256g);
            return null;
        } else if (m48348j == '[') {
            this.f45275f.push(5);
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(1024);
                char m48348j2 = m48348j(bufferedReader);
                if (m48348j2 != 0) {
                    if (m48348j2 != ',') {
                        if (m48348j2 != ']') {
                            bufferedReader.reset();
                            arrayList.add(interfaceC6358i.mo48326a(this, bufferedReader));
                        } else {
                            m48334x(5);
                            return arrayList;
                        }
                    }
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    /* renamed from: w */
    public final ArrayList m48335w(BufferedReader bufferedReader, FastJsonResponse.Field field) {
        ArrayList arrayList = new ArrayList();
        char m48348j = m48348j(bufferedReader);
        if (m48348j != ']') {
            if (m48348j != 'n') {
                if (m48348j == '{') {
                    this.f45275f.push(1);
                    while (true) {
                        try {
                            FastJsonResponse zad = field.zad();
                            if (m48358A(bufferedReader, zad)) {
                                arrayList.add(zad);
                                char m48348j2 = m48348j(bufferedReader);
                                if (m48348j2 != ',') {
                                    if (m48348j2 == ']') {
                                        m48334x(5);
                                        return arrayList;
                                    }
                                    throw new ParseException("Unexpected token: " + m48348j2);
                                } else if (m48348j(bufferedReader) == '{') {
                                    this.f45275f.push(1);
                                } else {
                                    throw new ParseException("Expected start of next object in array");
                                }
                            } else {
                                return arrayList;
                            }
                        } catch (IllegalAccessException e) {
                            throw new ParseException("Error instantiating inner object", e);
                        } catch (InstantiationException e2) {
                            throw new ParseException("Error instantiating inner object", e2);
                        }
                    }
                } else {
                    throw new ParseException("Unexpected token: " + m48348j);
                }
            } else {
                m48333y(bufferedReader, f45256g);
                m48334x(5);
                return null;
            }
        } else {
            m48334x(5);
            return arrayList;
        }
    }

    /* renamed from: x */
    public final void m48334x(int i) {
        if (!this.f45275f.isEmpty()) {
            int intValue = ((Integer) this.f45275f.pop()).intValue();
            if (intValue == i) {
                return;
            }
            throw new ParseException("Expected state " + i + " but had " + intValue);
        }
        throw new ParseException("Expected state " + i + " but had empty stack");
    }

    /* renamed from: y */
    public final void m48333y(BufferedReader bufferedReader, char[] cArr) {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i < length) {
                int read = bufferedReader.read(this.f45271b, 0, length - i);
                if (read != -1) {
                    for (int i2 = 0; i2 < read; i2++) {
                        if (cArr[i2 + i] != this.f45271b[i2]) {
                            throw new ParseException("Unexpected character");
                        }
                    }
                    i += read;
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: z */
    public final boolean m48332z(BufferedReader bufferedReader, boolean z) {
        char[] cArr;
        char[] cArr2;
        char m48348j = m48348j(bufferedReader);
        if (m48348j != '\"') {
            if (m48348j != 'f') {
                if (m48348j != 'n') {
                    if (m48348j == 't') {
                        if (z) {
                            cArr2 = f45258i;
                        } else {
                            cArr2 = f45257h;
                        }
                        m48333y(bufferedReader, cArr2);
                        return true;
                    }
                    throw new ParseException("Unexpected token: " + m48348j);
                }
                m48333y(bufferedReader, f45256g);
                return false;
            }
            if (z) {
                cArr = f45260k;
            } else {
                cArr = f45259j;
            }
            m48333y(bufferedReader, cArr);
            return false;
        } else if (!z) {
            return m48332z(bufferedReader, true);
        } else {
            throw new ParseException("No boolean value found in string");
        }
    }
}