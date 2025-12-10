package com.google.gson.stream;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.FormattingStyle;
import com.google.gson.Strictness;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class JsonWriter implements Closeable, Flushable {

    /* renamed from: l */
    public static final Pattern f56842l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m */
    public static final String[] f56843m = new String[128];

    /* renamed from: n */
    public static final String[] f56844n;

    /* renamed from: a */
    public final Writer f56845a;

    /* renamed from: b */
    public int[] f56846b = new int[32];

    /* renamed from: c */
    public int f56847c = 0;

    /* renamed from: d */
    public FormattingStyle f56848d;

    /* renamed from: e */
    public String f56849e;

    /* renamed from: f */
    public String f56850f;

    /* renamed from: g */
    public boolean f56851g;

    /* renamed from: h */
    public Strictness f56852h;

    /* renamed from: i */
    public boolean f56853i;

    /* renamed from: j */
    public String f56854j;

    /* renamed from: k */
    public boolean f56855k;

    static {
        for (int i = 0; i <= 31; i++) {
            f56843m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f56843m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f56844n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        m37456l(6);
        this.f56852h = Strictness.LEGACY_STRICT;
        this.f56855k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f56845a = writer;
        setFormattingStyle(FormattingStyle.COMPACT);
    }

    /* renamed from: i */
    public static boolean m37459i(Class cls) {
        if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m37462b() {
        int peek = peek();
        if (peek == 5) {
            this.f56845a.write(this.f56850f);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m37458j();
        m37455m(4);
    }

    @CanIgnoreReturnValue
    public JsonWriter beginArray() throws IOException {
        m37453o();
        return m37457k(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    @CanIgnoreReturnValue
    public JsonWriter beginObject() throws IOException {
        m37453o();
        return m37457k(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56845a.close();
        int i = this.f56847c;
        if (i <= 1 && (i != 1 || this.f56846b[i - 1] == 7)) {
            this.f56847c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final void m37461d() {
        int peek = peek();
        if (peek != 1) {
            if (peek != 2) {
                if (peek != 4) {
                    if (peek != 6) {
                        if (peek == 7) {
                            if (this.f56852h != Strictness.LENIENT) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    m37455m(7);
                    return;
                }
                this.f56845a.append((CharSequence) this.f56849e);
                m37455m(5);
                return;
            }
            this.f56845a.append((CharSequence) this.f56850f);
            m37458j();
            return;
        }
        m37455m(2);
        m37458j();
    }

    @CanIgnoreReturnValue
    public JsonWriter endArray() throws IOException {
        return m37460g(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    @CanIgnoreReturnValue
    public JsonWriter endObject() throws IOException {
        return m37460g(3, 5, '}');
    }

    public void flush() throws IOException {
        if (this.f56847c != 0) {
            this.f56845a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final JsonWriter m37460g(int i, int i2, char c) {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f56854j == null) {
            this.f56847c--;
            if (peek == i2) {
                m37458j();
            }
            this.f56845a.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f56854j);
    }

    public final FormattingStyle getFormattingStyle() {
        return this.f56848d;
    }

    public final boolean getSerializeNulls() {
        return this.f56855k;
    }

    public final Strictness getStrictness() {
        return this.f56852h;
    }

    public final boolean isHtmlSafe() {
        return this.f56853i;
    }

    public boolean isLenient() {
        if (this.f56852h == Strictness.LENIENT) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m37458j() {
        if (this.f56851g) {
            return;
        }
        this.f56845a.write(this.f56848d.getNewline());
        int i = this.f56847c;
        for (int i2 = 1; i2 < i; i2++) {
            this.f56845a.write(this.f56848d.getIndent());
        }
    }

    @CanIgnoreReturnValue
    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m37453o();
        m37461d();
        this.f56845a.append((CharSequence) str);
        return this;
    }

    /* renamed from: k */
    public final JsonWriter m37457k(int i, char c) {
        m37461d();
        m37456l(i);
        this.f56845a.write(c);
        return this;
    }

    /* renamed from: l */
    public final void m37456l(int i) {
        int i2 = this.f56847c;
        int[] iArr = this.f56846b;
        if (i2 == iArr.length) {
            this.f56846b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f56846b;
        int i3 = this.f56847c;
        this.f56847c = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: m */
    public final void m37455m(int i) {
        this.f56846b[this.f56847c - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m37454n(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f56853i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.f56844n
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.f56843m
        L9:
            java.io.Writer r1 = r8.f56845a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f56845a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f56845a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f56845a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f56845a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.m37454n(java.lang.String):void");
    }

    @CanIgnoreReturnValue
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f56854j == null) {
            int peek = peek();
            if (peek != 3 && peek != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f56854j = str;
            return this;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    @CanIgnoreReturnValue
    public JsonWriter nullValue() throws IOException {
        if (this.f56854j != null) {
            if (this.f56855k) {
                m37453o();
            } else {
                this.f56854j = null;
                return this;
            }
        }
        m37461d();
        this.f56845a.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    /* renamed from: o */
    public final void m37453o() {
        if (this.f56854j != null) {
            m37462b();
            m37454n(this.f56854j);
            this.f56854j = null;
        }
    }

    public final int peek() {
        int i = this.f56847c;
        if (i != 0) {
            return this.f56846b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void setFormattingStyle(FormattingStyle formattingStyle) {
        boolean z;
        Objects.requireNonNull(formattingStyle);
        this.f56848d = formattingStyle;
        this.f56850f = ",";
        if (formattingStyle.usesSpaceAfterSeparators()) {
            this.f56849e = ": ";
            if (this.f56848d.getNewline().isEmpty()) {
                this.f56850f = ", ";
            }
        } else {
            this.f56849e = ":";
        }
        if (this.f56848d.getNewline().isEmpty() && this.f56848d.getIndent().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.f56851g = z;
    }

    public final void setHtmlSafe(boolean z) {
        this.f56853i = z;
    }

    public final void setIndent(String str) {
        if (str.isEmpty()) {
            setFormattingStyle(FormattingStyle.COMPACT);
        } else {
            setFormattingStyle(FormattingStyle.PRETTY.withIndent(str));
        }
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

    public final void setSerializeNulls(boolean z) {
        this.f56855k = z;
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f56852h = strictness;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m37453o();
        m37461d();
        m37454n(str);
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(boolean z) throws IOException {
        m37453o();
        m37461d();
        this.f56845a.write(z ? "true" : "false");
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        m37453o();
        m37461d();
        this.f56845a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(float f) throws IOException {
        m37453o();
        if (this.f56852h != Strictness.LENIENT && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        m37461d();
        this.f56845a.append((CharSequence) Float.toString(f));
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(double d) throws IOException {
        m37453o();
        if (this.f56852h != Strictness.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m37461d();
        this.f56845a.append((CharSequence) Double.toString(d));
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(long j) throws IOException {
        m37453o();
        m37461d();
        this.f56845a.write(Long.toString(j));
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        m37453o();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!m37459i(cls) && !f56842l.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f56852h != Strictness.LENIENT) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        m37461d();
        this.f56845a.append((CharSequence) obj);
        return this;
    }
}
