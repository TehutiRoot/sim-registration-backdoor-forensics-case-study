package com.google.gson.stream;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.google.gson.Strictness;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class JsonReader implements Closeable {

    /* renamed from: a */
    public final Reader f56827a;

    /* renamed from: i */
    public long f56835i;

    /* renamed from: j */
    public int f56836j;

    /* renamed from: k */
    public String f56837k;

    /* renamed from: l */
    public int[] f56838l;

    /* renamed from: n */
    public String[] f56840n;

    /* renamed from: o */
    public int[] f56841o;

    /* renamed from: b */
    public Strictness f56828b = Strictness.LEGACY_STRICT;

    /* renamed from: c */
    public final char[] f56829c = new char[1024];

    /* renamed from: d */
    public int f56830d = 0;

    /* renamed from: e */
    public int f56831e = 0;

    /* renamed from: f */
    public int f56832f = 0;

    /* renamed from: g */
    public int f56833g = 0;

    /* renamed from: h */
    public int f56834h = 0;

    /* renamed from: m */
    public int f56839m = 1;

    /* renamed from: com.google.gson.stream.JsonReader$a */
    /* loaded from: classes4.dex */
    public class C8796a extends JsonReaderInternalAccess {
        @Override // com.google.gson.internal.JsonReaderInternalAccess
        public void promoteNameToValue(JsonReader jsonReader) {
            if (jsonReader instanceof JsonTreeReader) {
                ((JsonTreeReader) jsonReader).promoteNameToValue();
                return;
            }
            int i = jsonReader.f56834h;
            if (i == 0) {
                i = jsonReader.m37480i();
            }
            if (i == 13) {
                jsonReader.f56834h = 9;
            } else if (i == 12) {
                jsonReader.f56834h = 8;
            } else if (i == 14) {
                jsonReader.f56834h = 10;
            } else {
                throw jsonReader.m37463z("a name");
            }
        }
    }

    static {
        JsonReaderInternalAccess.INSTANCE = new C8796a();
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.f56838l = iArr;
        iArr[0] = 6;
        this.f56840n = new String[32];
        this.f56841o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f56827a = reader;
    }

    /* renamed from: k */
    private String m37478k(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f56839m;
            if (i < i2) {
                int i3 = this.f56838l[i];
                switch (i3) {
                    case 1:
                    case 2:
                        int i4 = this.f56841o[i];
                        if (z && i4 > 0 && i == i2 - 1) {
                            i4--;
                        }
                        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                        sb.append(i4);
                        sb.append(AbstractJsonLexerKt.END_LIST);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb.append('.');
                        String str = this.f56840n[i];
                        if (str == null) {
                            break;
                        } else {
                            sb.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError("Unknown scope value: " + i3);
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public void beginArray() throws IOException {
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 3) {
            m37470s(1);
            this.f56841o[this.f56839m - 1] = 0;
            this.f56834h = 0;
            return;
        }
        throw m37463z("BEGIN_ARRAY");
    }

    public void beginObject() throws IOException {
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 1) {
            m37470s(3);
            this.f56834h = 0;
            return;
        }
        throw m37463z("BEGIN_OBJECT");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56834h = 0;
        this.f56838l[0] = 8;
        this.f56839m = 1;
        this.f56827a.close();
    }

    /* renamed from: d */
    public final void m37482d() {
        if (this.f56828b == Strictness.LENIENT) {
            return;
        }
        throw m37464y("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }

    public void endArray() throws IOException {
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 4) {
            int i2 = this.f56839m;
            this.f56839m = i2 - 1;
            int[] iArr = this.f56841o;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.f56834h = 0;
            return;
        }
        throw m37463z("END_ARRAY");
    }

    public void endObject() throws IOException {
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 2) {
            int i2 = this.f56839m;
            int i3 = i2 - 1;
            this.f56839m = i3;
            this.f56840n[i3] = null;
            int[] iArr = this.f56841o;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.f56834h = 0;
            return;
        }
        throw m37463z("END_OBJECT");
    }

    /* renamed from: g */
    public final void m37481g() {
        m37475n(true);
        int i = this.f56830d;
        this.f56830d = i - 1;
        if (i + 4 > this.f56831e && !m37479j(5)) {
            return;
        }
        int i2 = this.f56830d;
        char[] cArr = this.f56829c;
        if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
            this.f56830d = i2 + 5;
        }
    }

    public String getPath() {
        return m37478k(false);
    }

    public String getPreviousPath() {
        return m37478k(true);
    }

    public final Strictness getStrictness() {
        return this.f56828b;
    }

    public boolean hasNext() throws IOException {
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public int m37480i() {
        int m37475n;
        int[] iArr = this.f56838l;
        int i = this.f56839m;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m37475n2 = m37475n(true);
            if (m37475n2 != 44) {
                if (m37475n2 != 59) {
                    if (m37475n2 == 93) {
                        this.f56834h = 4;
                        return 4;
                    }
                    throw m37464y("Unterminated array");
                }
                m37482d();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int m37475n3 = m37475n(true);
                if (m37475n3 != 58) {
                    if (m37475n3 == 61) {
                        m37482d();
                        if (this.f56830d < this.f56831e || m37479j(1)) {
                            char[] cArr = this.f56829c;
                            int i3 = this.f56830d;
                            if (cArr[i3] == '>') {
                                this.f56830d = i3 + 1;
                            }
                        }
                    } else {
                        throw m37464y("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                if (this.f56828b == Strictness.LENIENT) {
                    m37481g();
                }
                this.f56838l[this.f56839m - 1] = 7;
            } else if (i2 == 7) {
                if (m37475n(false) == -1) {
                    this.f56834h = 17;
                    return 17;
                }
                m37482d();
                this.f56830d--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5 && (m37475n = m37475n(true)) != 44) {
                if (m37475n != 59) {
                    if (m37475n == 125) {
                        this.f56834h = 2;
                        return 2;
                    }
                    throw m37464y("Unterminated object");
                }
                m37482d();
            }
            int m37475n4 = m37475n(true);
            if (m37475n4 != 34) {
                if (m37475n4 != 39) {
                    if (m37475n4 != 125) {
                        m37482d();
                        this.f56830d--;
                        if (m37477l((char) m37475n4)) {
                            this.f56834h = 14;
                            return 14;
                        }
                        throw m37464y("Expected name");
                    } else if (i2 != 5) {
                        this.f56834h = 2;
                        return 2;
                    } else {
                        throw m37464y("Expected name");
                    }
                }
                m37482d();
                this.f56834h = 12;
                return 12;
            }
            this.f56834h = 13;
            return 13;
        }
        int m37475n5 = m37475n(true);
        if (m37475n5 != 34) {
            if (m37475n5 != 39) {
                if (m37475n5 != 44 && m37475n5 != 59) {
                    if (m37475n5 != 91) {
                        if (m37475n5 != 93) {
                            if (m37475n5 != 123) {
                                this.f56830d--;
                                int m37472q = m37472q();
                                if (m37472q != 0) {
                                    return m37472q;
                                }
                                int m37471r = m37471r();
                                if (m37471r != 0) {
                                    return m37471r;
                                }
                                if (m37477l(this.f56829c[this.f56830d])) {
                                    m37482d();
                                    this.f56834h = 10;
                                    return 10;
                                }
                                throw m37464y("Expected value");
                            }
                            this.f56834h = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.f56834h = 4;
                            return 4;
                        }
                    } else {
                        this.f56834h = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw m37464y("Unexpected value");
                }
                m37482d();
                this.f56830d--;
                this.f56834h = 7;
                return 7;
            }
            m37482d();
            this.f56834h = 8;
            return 8;
        }
        this.f56834h = 9;
        return 9;
    }

    public final boolean isLenient() {
        if (this.f56828b == Strictness.LENIENT) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m37479j(int i) {
        int i2;
        int i3;
        char[] cArr = this.f56829c;
        int i4 = this.f56833g;
        int i5 = this.f56830d;
        this.f56833g = i4 - i5;
        int i6 = this.f56831e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f56831e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f56831e = 0;
        }
        this.f56830d = 0;
        do {
            Reader reader = this.f56827a;
            int i8 = this.f56831e;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f56831e + read;
            this.f56831e = i2;
            if (this.f56832f == 0 && (i3 = this.f56833g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f56830d++;
                this.f56833g = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: l */
    public final boolean m37477l(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            m37482d();
            return false;
        }
        return false;
    }

    /* renamed from: m */
    public String m37476m() {
        return " at line " + (this.f56832f + 1) + " column " + ((this.f56830d - this.f56833g) + 1) + " path " + getPath();
    }

    /* renamed from: n */
    public final int m37475n(boolean z) {
        char[] cArr = this.f56829c;
        int i = this.f56830d;
        int i2 = this.f56831e;
        while (true) {
            if (i == i2) {
                this.f56830d = i;
                if (!m37479j(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m37476m());
                }
                i = this.f56830d;
                i2 = this.f56831e;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f56832f++;
                this.f56833g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f56830d = i3;
                    if (i3 == i2) {
                        this.f56830d = i;
                        boolean m37479j = m37479j(2);
                        this.f56830d++;
                        if (!m37479j) {
                            return c;
                        }
                    }
                    m37482d();
                    int i4 = this.f56830d;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f56830d = i4 + 1;
                        m37466w();
                        i = this.f56830d;
                        i2 = this.f56831e;
                    } else {
                        this.f56830d = i4 + 1;
                        if (m37467v("*/")) {
                            i = this.f56830d + 2;
                            i2 = this.f56831e;
                        } else {
                            throw m37464y("Unterminated comment");
                        }
                    }
                } else if (c == '#') {
                    this.f56830d = i3;
                    m37482d();
                    m37466w();
                    i = this.f56830d;
                    i2 = this.f56831e;
                } else {
                    this.f56830d = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    public boolean nextBoolean() throws IOException {
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 5) {
            this.f56834h = 0;
            int[] iArr = this.f56841o;
            int i2 = this.f56839m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f56834h = 0;
            int[] iArr2 = this.f56841o;
            int i3 = this.f56839m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw m37463z("a boolean");
        }
    }

    public double nextDouble() throws IOException {
        char c;
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 15) {
            this.f56834h = 0;
            int[] iArr = this.f56841o;
            int i2 = this.f56839m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f56835i;
        }
        if (i == 16) {
            this.f56837k = new String(this.f56829c, this.f56830d, this.f56836j);
            this.f56830d += this.f56836j;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.f56837k = m37473p();
            } else if (i != 11) {
                throw m37463z("a double");
            }
        } else {
            if (i == 8) {
                c = CoreConstants.SINGLE_QUOTE_CHAR;
            } else {
                c = '\"';
            }
            this.f56837k = m37474o(c);
        }
        this.f56834h = 11;
        double parseDouble = Double.parseDouble(this.f56837k);
        if (this.f56828b != Strictness.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw m37464y("JSON forbids NaN and infinities: " + parseDouble);
        }
        this.f56837k = null;
        this.f56834h = 0;
        int[] iArr2 = this.f56841o;
        int i3 = this.f56839m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int nextInt() throws IOException {
        char c;
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 15) {
            long j = this.f56835i;
            int i2 = (int) j;
            if (j == i2) {
                this.f56834h = 0;
                int[] iArr = this.f56841o;
                int i3 = this.f56839m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f56835i + m37476m());
        }
        if (i == 16) {
            this.f56837k = new String(this.f56829c, this.f56830d, this.f56836j);
            this.f56830d += this.f56836j;
        } else if (i != 8 && i != 9 && i != 10) {
            throw m37463z("an int");
        } else {
            if (i == 10) {
                this.f56837k = m37473p();
            } else {
                if (i == 8) {
                    c = CoreConstants.SINGLE_QUOTE_CHAR;
                } else {
                    c = '\"';
                }
                this.f56837k = m37474o(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f56837k);
                this.f56834h = 0;
                int[] iArr2 = this.f56841o;
                int i4 = this.f56839m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f56834h = 11;
        double parseDouble = Double.parseDouble(this.f56837k);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.f56837k = null;
            this.f56834h = 0;
            int[] iArr3 = this.f56841o;
            int i6 = this.f56839m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f56837k + m37476m());
    }

    public long nextLong() throws IOException {
        char c;
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 15) {
            this.f56834h = 0;
            int[] iArr = this.f56841o;
            int i2 = this.f56839m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f56835i;
        }
        if (i == 16) {
            this.f56837k = new String(this.f56829c, this.f56830d, this.f56836j);
            this.f56830d += this.f56836j;
        } else if (i != 8 && i != 9 && i != 10) {
            throw m37463z("a long");
        } else {
            if (i == 10) {
                this.f56837k = m37473p();
            } else {
                if (i == 8) {
                    c = CoreConstants.SINGLE_QUOTE_CHAR;
                } else {
                    c = '\"';
                }
                this.f56837k = m37474o(c);
            }
            try {
                long parseLong = Long.parseLong(this.f56837k);
                this.f56834h = 0;
                int[] iArr2 = this.f56841o;
                int i3 = this.f56839m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f56834h = 11;
        double parseDouble = Double.parseDouble(this.f56837k);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.f56837k = null;
            this.f56834h = 0;
            int[] iArr3 = this.f56841o;
            int i4 = this.f56839m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f56837k + m37476m());
    }

    public String nextName() throws IOException {
        String m37474o;
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 14) {
            m37474o = m37473p();
        } else if (i == 12) {
            m37474o = m37474o(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 13) {
            m37474o = m37474o('\"');
        } else {
            throw m37463z("a name");
        }
        this.f56834h = 0;
        this.f56840n[this.f56839m - 1] = m37474o;
        return m37474o;
    }

    public void nextNull() throws IOException {
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 7) {
            this.f56834h = 0;
            int[] iArr = this.f56841o;
            int i2 = this.f56839m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw m37463z(AbstractJsonLexerKt.NULL);
    }

    public String nextString() throws IOException {
        String str;
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        if (i == 10) {
            str = m37473p();
        } else if (i == 8) {
            str = m37474o(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 9) {
            str = m37474o('\"');
        } else if (i == 11) {
            str = this.f56837k;
            this.f56837k = null;
        } else if (i == 15) {
            str = Long.toString(this.f56835i);
        } else if (i == 16) {
            str = new String(this.f56829c, this.f56830d, this.f56836j);
            this.f56830d += this.f56836j;
        } else {
            throw m37463z("a string");
        }
        this.f56834h = 0;
        int[] iArr = this.f56841o;
        int i2 = this.f56839m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
        r1.append(r0, r3, r2 - r3);
        r10.f56830d = r2;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m37474o(char r11) {
        /*
            r10 = this;
            char[] r0 = r10.f56829c
            r1 = 0
        L3:
            int r2 = r10.f56830d
            int r3 = r10.f56831e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L6c
            int r7 = r2 + 1
            char r2 = r0[r2]
            com.google.gson.Strictness r8 = r10.f56828b
            com.google.gson.Strictness r9 = com.google.gson.Strictness.STRICT
            if (r8 != r9) goto L24
            r8 = 32
            if (r2 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            com.google.gson.stream.MalformedJsonException r11 = r10.m37464y(r11)
            throw r11
        L24:
            if (r2 != r11) goto L3a
            r10.f56830d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L32
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r7)
            return r11
        L32:
            r1.append(r0, r3, r7)
            java.lang.String r11 = r1.toString()
            return r11
        L3a:
            r8 = 92
            if (r2 != r8) goto L5f
            r10.f56830d = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L50
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L50:
            r1.append(r0, r3, r2)
            char r2 = r10.m37469t()
            r1.append(r2)
            int r2 = r10.f56830d
            int r3 = r10.f56831e
            goto L7
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r10.f56832f
            int r2 = r2 + r6
            r10.f56832f = r2
            r10.f56833g = r7
        L6a:
            r2 = r7
            goto L9
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.f56830d = r2
            boolean r2 = r10.m37479j(r6)
            if (r2 == 0) goto L8b
            goto L3
        L8b:
            java.lang.String r11 = "Unterminated string"
            com.google.gson.stream.MalformedJsonException r11 = r10.m37464y(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.m37474o(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        m37482d();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m37473p() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f56830d
            int r4 = r3 + r2
            int r5 = r6.f56831e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f56829c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m37482d()
            goto L5c
        L4e:
            char[] r3 = r6.f56829c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m37479j(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f56829c
            int r4 = r6.f56830d
            r0.append(r3, r4, r2)
            int r3 = r6.f56830d
            int r3 = r3 + r2
            r6.f56830d = r3
            r2 = 1
            boolean r2 = r6.m37479j(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f56829c
            int r3 = r6.f56830d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f56829c
            int r3 = r6.f56830d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f56830d
            int r2 = r2 + r1
            r6.f56830d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.m37473p():java.lang.String");
    }

    public JsonToken peek() throws IOException {
        int i = this.f56834h;
        if (i == 0) {
            i = m37480i();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: q */
    public final int m37472q() {
        String str;
        String str2;
        int i;
        boolean z;
        char c = this.f56829c[this.f56830d];
        if (c != 't' && c != 'T') {
            if (c != 'f' && c != 'F') {
                if (c != 'n' && c != 'N') {
                    return 0;
                }
                str = AbstractJsonLexerKt.NULL;
                str2 = ActionConst.NULL;
                i = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i = 5;
        }
        if (this.f56828b != Strictness.STRICT) {
            z = true;
        } else {
            z = false;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f56830d + i2 >= this.f56831e && !m37479j(i2 + 1)) {
                return 0;
            }
            char c2 = this.f56829c[this.f56830d + i2];
            if (c2 != str.charAt(i2) && (!z || c2 != str2.charAt(i2))) {
                return 0;
            }
        }
        if ((this.f56830d + length < this.f56831e || m37479j(length + 1)) && m37477l(this.f56829c[this.f56830d + length])) {
            return 0;
        }
        this.f56830d += length;
        this.f56834h = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (m37477l(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a7, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ac, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ad, code lost:
        r18.f56835i = r11;
        r18.f56830d += r8;
        r18.f56834h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b8, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b9, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bf, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c2, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c4, code lost:
        r18.f56836j = r8;
        r18.f56834h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ca, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cb, code lost:
        return 0;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m37471r() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.m37471r():int");
    }

    /* renamed from: s */
    public final void m37470s(int i) {
        int i2 = this.f56839m;
        int[] iArr = this.f56838l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f56838l = Arrays.copyOf(iArr, i3);
            this.f56841o = Arrays.copyOf(this.f56841o, i3);
            this.f56840n = (String[]) Arrays.copyOf(this.f56840n, i3);
        }
        int[] iArr2 = this.f56838l;
        int i4 = this.f56839m;
        this.f56839m = i4 + 1;
        iArr2[i4] = i;
    }

    @Deprecated
    public final void setLenient(boolean z) {
        Strictness strictness;
        if (z) {
            strictness = Strictness.LENIENT;
        } else {
            strictness = Strictness.LEGACY_STRICT;
        }
        setStrictness(strictness);
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f56828b = strictness;
    }

    public void skipValue() throws IOException {
        int i = 0;
        do {
            int i2 = this.f56834h;
            if (i2 == 0) {
                i2 = m37480i();
            }
            switch (i2) {
                case 1:
                    m37470s(3);
                    i++;
                    break;
                case 2:
                    if (i == 0) {
                        this.f56840n[this.f56839m - 1] = null;
                    }
                    this.f56839m--;
                    i--;
                    break;
                case 3:
                    m37470s(1);
                    i++;
                    break;
                case 4:
                    this.f56839m--;
                    i--;
                    break;
                case 8:
                    m37468u(CoreConstants.SINGLE_QUOTE_CHAR);
                    break;
                case 9:
                    m37468u('\"');
                    break;
                case 10:
                    m37465x();
                    break;
                case 12:
                    m37468u(CoreConstants.SINGLE_QUOTE_CHAR);
                    if (i == 0) {
                        this.f56840n[this.f56839m - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    m37468u('\"');
                    if (i == 0) {
                        this.f56840n[this.f56839m - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    m37465x();
                    if (i == 0) {
                        this.f56840n[this.f56839m - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.f56830d += this.f56836j;
                    break;
                case 17:
                    return;
            }
            this.f56834h = 0;
        } while (i > 0);
        int[] iArr = this.f56841o;
        int i3 = this.f56839m - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    /* renamed from: t */
    public final char m37469t() {
        int i;
        if (this.f56830d == this.f56831e && !m37479j(1)) {
            throw m37464y("Unterminated escape sequence");
        }
        char[] cArr = this.f56829c;
        int i2 = this.f56830d;
        int i3 = i2 + 1;
        this.f56830d = i3;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c != 'b') {
                            if (c != 'f') {
                                if (c == 'n') {
                                    return '\n';
                                }
                                if (c != 'r') {
                                    if (c != 't') {
                                        if (c == 'u') {
                                            if (i2 + 5 > this.f56831e && !m37479j(4)) {
                                                throw m37464y("Unterminated escape sequence");
                                            }
                                            int i4 = this.f56830d;
                                            int i5 = i4 + 4;
                                            int i6 = 0;
                                            while (i4 < i5) {
                                                char c2 = this.f56829c[i4];
                                                int i7 = i6 << 4;
                                                if (c2 >= '0' && c2 <= '9') {
                                                    i = c2 - '0';
                                                } else if (c2 >= 'a' && c2 <= 'f') {
                                                    i = c2 - 'W';
                                                } else if (c2 >= 'A' && c2 <= 'F') {
                                                    i = c2 - '7';
                                                } else {
                                                    throw m37464y("Malformed Unicode escape \\u" + new String(this.f56829c, this.f56830d, 4));
                                                }
                                                i6 = i7 + i;
                                                i4++;
                                            }
                                            this.f56830d += 4;
                                            return (char) i6;
                                        }
                                        throw m37464y("Invalid escape sequence");
                                    }
                                    return '\t';
                                }
                                return TokenParser.f74557CR;
                            }
                            return '\f';
                        }
                        return '\b';
                    }
                }
            }
            return c;
        } else if (this.f56828b != Strictness.STRICT) {
            this.f56832f++;
            this.f56833g = i3;
        } else {
            throw m37464y("Cannot escape a newline character in strict mode");
        }
        if (this.f56828b == Strictness.STRICT) {
            throw m37464y("Invalid escaped character \"'\" in strict mode");
        }
        return c;
    }

    public String toString() {
        return getClass().getSimpleName() + m37476m();
    }

    /* renamed from: u */
    public final void m37468u(char c) {
        char[] cArr = this.f56829c;
        do {
            int i = this.f56830d;
            int i2 = this.f56831e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f56830d = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f56830d = i3;
                    m37469t();
                    i = this.f56830d;
                    i2 = this.f56831e;
                } else {
                    if (c2 == '\n') {
                        this.f56832f++;
                        this.f56833g = i3;
                    }
                    i = i3;
                }
            }
            this.f56830d = i;
        } while (m37479j(1));
        throw m37464y("Unterminated string");
    }

    /* renamed from: v */
    public final boolean m37467v(String str) {
        int length = str.length();
        while (true) {
            if (this.f56830d + length > this.f56831e && !m37479j(length)) {
                return false;
            }
            char[] cArr = this.f56829c;
            int i = this.f56830d;
            if (cArr[i] == '\n') {
                this.f56832f++;
                this.f56833g = i + 1;
            } else {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f56829c[this.f56830d + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.f56830d++;
        }
    }

    /* renamed from: w */
    public final void m37466w() {
        char c;
        do {
            if (this.f56830d < this.f56831e || m37479j(1)) {
                char[] cArr = this.f56829c;
                int i = this.f56830d;
                int i2 = i + 1;
                this.f56830d = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.f56832f++;
                    this.f56833g = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        m37482d();
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m37465x() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f56830d
            int r2 = r1 + r0
            int r3 = r4.f56831e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f56829c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m37482d()
        L4b:
            int r1 = r4.f56830d
            int r1 = r1 + r0
            r4.f56830d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f56830d = r1
            r0 = 1
            boolean r0 = r4.m37479j(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.m37465x():void");
    }

    /* renamed from: y */
    public final MalformedJsonException m37464y(String str) {
        throw new MalformedJsonException(str + m37476m() + "\nSee " + TroubleshootingGuide.createUrl("malformed-json"));
    }

    /* renamed from: z */
    public final IllegalStateException m37463z(String str) {
        String str2;
        if (peek() == JsonToken.NULL) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        return new IllegalStateException("Expected " + str + " but was " + peek() + m37476m() + "\nSee " + TroubleshootingGuide.createUrl(str2));
    }
}
