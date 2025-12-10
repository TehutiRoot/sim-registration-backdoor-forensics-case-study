package com.google.android.gms.internal.firebase_ml;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public final class zzth implements Closeable {

    /* renamed from: p */
    public static final char[] f46062p = ")]}'\n".toCharArray();

    /* renamed from: a */
    public final Reader f46063a;

    /* renamed from: i */
    public long f46071i;

    /* renamed from: j */
    public int f46072j;

    /* renamed from: k */
    public String f46073k;

    /* renamed from: l */
    public int[] f46074l;

    /* renamed from: n */
    public String[] f46076n;

    /* renamed from: o */
    public int[] f46077o;

    /* renamed from: b */
    public boolean f46064b = false;

    /* renamed from: c */
    public final char[] f46065c = new char[1024];

    /* renamed from: d */
    public int f46066d = 0;

    /* renamed from: e */
    public int f46067e = 0;

    /* renamed from: f */
    public int f46068f = 0;

    /* renamed from: g */
    public int f46069g = 0;

    /* renamed from: h */
    public int f46070h = 0;

    /* renamed from: m */
    public int f46075m = 1;

    static {
        zzti.zzbyl = new QJ2();
    }

    public zzth(Reader reader) {
        int[] iArr = new int[32];
        this.f46074l = iArr;
        iArr[0] = 6;
        this.f46076n = new String[32];
        this.f46077o = new int[32];
        if (reader != null) {
            this.f46063a = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: b */
    public final int m47468b(boolean z) {
        char[] cArr = this.f46065c;
        int i = this.f46066d;
        int i2 = this.f46067e;
        while (true) {
            if (i == i2) {
                this.f46066d = i;
                if (m47465i(1)) {
                    i = this.f46066d;
                    i2 = this.f46067e;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + m47457q());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f46068f++;
                this.f46069g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f46066d = i3;
                    if (i3 == i2) {
                        this.f46066d = i;
                        boolean m47465i = m47465i(2);
                        this.f46066d++;
                        if (!m47465i) {
                            return c;
                        }
                    }
                    m47459o();
                    int i4 = this.f46066d;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f46066d = i4 + 1;
                        m47458p();
                        i = this.f46066d;
                        i2 = this.f46067e;
                    } else {
                        this.f46066d = i4 + 1;
                        while (true) {
                            if (this.f46066d + 2 > this.f46067e && !m47465i(2)) {
                                throw m47467d("Unterminated comment");
                            }
                            char[] cArr2 = this.f46065c;
                            int i5 = this.f46066d;
                            if (cArr2[i5] == '\n') {
                                this.f46068f++;
                                this.f46069g = i5 + 1;
                            } else {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (this.f46065c[this.f46066d + i6] == "*/".charAt(i6)) {
                                    }
                                }
                                i = this.f46066d + 2;
                                i2 = this.f46067e;
                                break;
                            }
                            this.f46066d++;
                        }
                    }
                } else if (c == '#') {
                    this.f46066d = i3;
                    m47459o();
                    m47458p();
                    i = this.f46066d;
                    i2 = this.f46067e;
                } else {
                    this.f46066d = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    public final void beginArray() throws IOException {
        int i = this.f46070h;
        if (i == 0) {
            i = m47461m();
        }
        if (i == 3) {
            m47466g(1);
            this.f46077o[this.f46075m - 1] = 0;
            this.f46070h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + zzrm() + m47457q());
    }

    public final void beginObject() throws IOException {
        int i = this.f46070h;
        if (i == 0) {
            i = m47461m();
        }
        if (i == 1) {
            m47466g(3);
            this.f46070h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + zzrm() + m47457q());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f46070h = 0;
        this.f46074l[0] = 8;
        this.f46075m = 1;
        this.f46063a.close();
    }

    /* renamed from: d */
    public final IOException m47467d(String str) {
        throw new zztl(str + m47457q());
    }

    public final void endArray() throws IOException {
        int i = this.f46070h;
        if (i == 0) {
            i = m47461m();
        }
        if (i == 4) {
            int i2 = this.f46075m;
            this.f46075m = i2 - 1;
            int[] iArr = this.f46077o;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.f46070h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + zzrm() + m47457q());
    }

    public final void endObject() throws IOException {
        int i = this.f46070h;
        if (i == 0) {
            i = m47461m();
        }
        if (i == 2) {
            int i2 = this.f46075m;
            int i3 = i2 - 1;
            this.f46075m = i3;
            this.f46076n[i3] = null;
            int[] iArr = this.f46077o;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.f46070h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + zzrm() + m47457q());
    }

    /* renamed from: g */
    public final void m47466g(int i) {
        int i2 = this.f46075m;
        int[] iArr = this.f46074l;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 << 1];
            int[] iArr3 = new int[i2 << 1];
            String[] strArr = new String[i2 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f46077o, 0, iArr3, 0, this.f46075m);
            System.arraycopy(this.f46076n, 0, strArr, 0, this.f46075m);
            this.f46074l = iArr2;
            this.f46077o = iArr3;
            this.f46076n = strArr;
        }
        int[] iArr4 = this.f46074l;
        int i3 = this.f46075m;
        this.f46075m = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: i */
    public final boolean m47465i(int i) {
        int i2;
        int i3;
        char[] cArr = this.f46065c;
        int i4 = this.f46069g;
        int i5 = this.f46066d;
        this.f46069g = i4 - i5;
        int i6 = this.f46067e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f46067e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f46067e = 0;
        }
        this.f46066d = 0;
        do {
            Reader reader = this.f46063a;
            int i8 = this.f46067e;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f46067e + read;
            this.f46067e = i2;
            if (this.f46068f == 0 && (i3 = this.f46069g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f46066d++;
                this.f46069g = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: j */
    public final boolean m47464j(char c) {
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
            m47459o();
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public final String m47463k(char c) {
        char[] cArr = this.f46065c;
        StringBuilder sb = null;
        while (true) {
            int i = this.f46066d;
            int i2 = this.f46067e;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.f46066d = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f46066d = i4;
                        int i6 = i4 - i;
                        int i7 = i6 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i6 << 1, 16));
                        }
                        sb.append(cArr, i, i7);
                        sb.append(m47456r());
                    } else {
                        if (c2 == '\n') {
                            this.f46068f++;
                            this.f46069g = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i3 - i) << 1, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.f46066d = i3;
                    if (!m47465i(1)) {
                        throw m47467d("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final void m47462l(char c) {
        char[] cArr = this.f46065c;
        while (true) {
            int i = this.f46066d;
            int i2 = this.f46067e;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f46066d = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f46066d = i3;
                        m47456r();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.f46068f++;
                            this.f46069g = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f46066d = i;
                    if (!m47465i(1)) {
                        throw m47467d("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0207, code lost:
        if (m47464j(r4) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x020a, code lost:
        if (r8 != 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x020c, code lost:
        if (r11 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0212, code lost:
        if (r12 != Long.MIN_VALUE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0214, code lost:
        if (r16 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x021a, code lost:
        if (r12 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x021c, code lost:
        if (r16 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x021e, code lost:
        if (r16 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0221, code lost:
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0222, code lost:
        r19.f46071i = r12;
        r19.f46066d += r9;
        r4 = 15;
        r19.f46070h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x022e, code lost:
        if (r8 == 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0231, code lost:
        if (r8 == 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0234, code lost:
        if (r8 != 7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0239, code lost:
        r19.f46072j = r9;
        r4 = 16;
        r19.f46070h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0266 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0267  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m47461m() {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzth.m47461m():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        m47459o();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m47460n() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f46066d
            int r4 = r3 + r2
            int r5 = r6.f46067e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f46065c
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
            r6.m47459o()
            goto L5c
        L4e:
            char[] r3 = r6.f46065c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m47465i(r3)
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
            char[] r3 = r6.f46065c
            int r4 = r6.f46066d
            r0.append(r3, r4, r2)
            int r3 = r6.f46066d
            int r3 = r3 + r2
            r6.f46066d = r3
            r2 = 1
            boolean r2 = r6.m47465i(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f46065c
            int r3 = r6.f46066d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f46065c
            int r3 = r6.f46066d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f46066d
            int r2 = r2 + r1
            r6.f46066d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzth.m47460n():java.lang.String");
    }

    public final boolean nextBoolean() throws IOException {
        int i = this.f46070h;
        if (i == 0) {
            i = m47461m();
        }
        if (i == 5) {
            this.f46070h = 0;
            int[] iArr = this.f46077o;
            int i2 = this.f46075m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f46070h = 0;
            int[] iArr2 = this.f46077o;
            int i3 = this.f46075m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + zzrm() + m47457q());
        }
    }

    public final String nextName() throws IOException {
        String m47463k;
        int i = this.f46070h;
        if (i == 0) {
            i = m47461m();
        }
        if (i == 14) {
            m47463k = m47460n();
        } else if (i == 12) {
            m47463k = m47463k(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 13) {
            m47463k = m47463k('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + zzrm() + m47457q());
        }
        this.f46070h = 0;
        this.f46076n[this.f46075m - 1] = m47463k;
        return m47463k;
    }

    public final void nextNull() throws IOException {
        int i = this.f46070h;
        if (i == 0) {
            i = m47461m();
        }
        if (i == 7) {
            this.f46070h = 0;
            int[] iArr = this.f46077o;
            int i2 = this.f46075m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + zzrm() + m47457q());
    }

    public final String nextString() throws IOException {
        String str;
        int i = this.f46070h;
        if (i == 0) {
            i = m47461m();
        }
        if (i == 10) {
            str = m47460n();
        } else if (i == 8) {
            str = m47463k(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 9) {
            str = m47463k('\"');
        } else if (i == 11) {
            str = null;
            this.f46073k = null;
        } else if (i == 15) {
            str = Long.toString(this.f46071i);
        } else if (i == 16) {
            str = new String(this.f46065c, this.f46066d, this.f46072j);
            this.f46066d += this.f46072j;
        } else {
            throw new IllegalStateException("Expected a string but was " + zzrm() + m47457q());
        }
        this.f46070h = 0;
        int[] iArr = this.f46077o;
        int i2 = this.f46075m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: o */
    public final void m47459o() {
        if (this.f46064b) {
            return;
        }
        throw m47467d("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* renamed from: p */
    public final void m47458p() {
        char c;
        do {
            if (this.f46066d < this.f46067e || m47465i(1)) {
                char[] cArr = this.f46065c;
                int i = this.f46066d;
                int i2 = i + 1;
                this.f46066d = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.f46068f++;
                    this.f46069g = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: q */
    public final String m47457q() {
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(this.f46068f + 1);
        sb.append(" column ");
        sb.append((this.f46066d - this.f46069g) + 1);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i = this.f46075m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f46074l[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb2.append('.');
                    String str = this.f46076n[i2];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(this.f46077o[i2]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    /* renamed from: r */
    public final char m47456r() {
        int i;
        if (this.f46066d == this.f46067e && !m47465i(1)) {
            throw m47467d("Unterminated escape sequence");
        }
        char[] cArr = this.f46065c;
        int i2 = this.f46066d;
        int i3 = i2 + 1;
        this.f46066d = i3;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i2 + 5 > this.f46067e && !m47465i(4)) {
                                        throw m47467d("Unterminated escape sequence");
                                    }
                                    int i4 = this.f46066d;
                                    int i5 = i4 + 4;
                                    char c2 = 0;
                                    while (i4 < i5) {
                                        char c3 = this.f46065c[i4];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 >= '0' && c3 <= '9') {
                                            i = c3 - '0';
                                        } else if (c3 >= 'a' && c3 <= 'f') {
                                            i = c3 - 'W';
                                        } else if (c3 >= 'A' && c3 <= 'F') {
                                            i = c3 - '7';
                                        } else {
                                            throw new NumberFormatException("\\u" + new String(this.f46065c, this.f46066d, 4));
                                        }
                                        c2 = (char) (c4 + i);
                                        i4++;
                                    }
                                    this.f46066d += 4;
                                    return c2;
                                }
                                throw m47467d("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return TokenParser.f74557CR;
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f46068f++;
            this.f46069g = i3;
        }
        return c;
    }

    public final void setLenient(boolean z) {
        this.f46064b = true;
    }

    public final void skipValue() throws IOException {
        int i = 0;
        do {
            int i2 = this.f46070h;
            if (i2 == 0) {
                i2 = m47461m();
            }
            if (i2 == 3) {
                m47466g(1);
            } else if (i2 == 1) {
                m47466g(3);
            } else {
                if (i2 == 4) {
                    this.f46075m--;
                } else if (i2 == 2) {
                    this.f46075m--;
                } else {
                    if (i2 != 14 && i2 != 10) {
                        if (i2 != 8 && i2 != 12) {
                            if (i2 != 9 && i2 != 13) {
                                if (i2 == 16) {
                                    this.f46066d += this.f46072j;
                                }
                            } else {
                                m47462l('\"');
                            }
                        } else {
                            m47462l(CoreConstants.SINGLE_QUOTE_CHAR);
                        }
                    } else {
                        do {
                            int i3 = 0;
                            while (true) {
                                int i4 = this.f46066d;
                                if (i4 + i3 < this.f46067e) {
                                    char c = this.f46065c[i4 + i3];
                                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                        if (c != '#') {
                                            if (c != ',') {
                                                if (c != '/' && c != '=') {
                                                    if (c != '{' && c != '}' && c != ':') {
                                                        if (c != ';') {
                                                            switch (c) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i3++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f46066d = i4 + i3;
                                }
                            }
                            m47459o();
                            this.f46066d += i3;
                        } while (m47465i(1));
                    }
                    this.f46070h = 0;
                }
                i--;
                this.f46070h = 0;
            }
            i++;
            this.f46070h = 0;
        } while (i != 0);
        int[] iArr = this.f46077o;
        int i5 = this.f46075m;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.f46076n[i5 - 1] = AbstractJsonLexerKt.NULL;
    }

    public final String toString() {
        return zzth.class.getSimpleName() + m47457q();
    }

    public final zztj zzrm() throws IOException {
        int i = this.f46070h;
        if (i == 0) {
            i = m47461m();
        }
        switch (i) {
            case 1:
                return zztj.BEGIN_OBJECT;
            case 2:
                return zztj.END_OBJECT;
            case 3:
                return zztj.BEGIN_ARRAY;
            case 4:
                return zztj.END_ARRAY;
            case 5:
            case 6:
                return zztj.BOOLEAN;
            case 7:
                return zztj.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return zztj.STRING;
            case 12:
            case 13:
            case 14:
                return zztj.NAME;
            case 15:
            case 16:
                return zztj.NUMBER;
            case 17:
                return zztj.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
