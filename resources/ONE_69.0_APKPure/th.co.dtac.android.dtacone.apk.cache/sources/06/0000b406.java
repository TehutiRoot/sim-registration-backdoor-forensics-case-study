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
    public static final Pattern f56854l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m */
    public static final String[] f56855m = new String[128];

    /* renamed from: n */
    public static final String[] f56856n;

    /* renamed from: a */
    public final Writer f56857a;

    /* renamed from: b */
    public int[] f56858b = new int[32];

    /* renamed from: c */
    public int f56859c = 0;

    /* renamed from: d */
    public FormattingStyle f56860d;

    /* renamed from: e */
    public String f56861e;

    /* renamed from: f */
    public String f56862f;

    /* renamed from: g */
    public boolean f56863g;

    /* renamed from: h */
    public Strictness f56864h;

    /* renamed from: i */
    public boolean f56865i;

    /* renamed from: j */
    public String f56866j;

    /* renamed from: k */
    public boolean f56867k;

    static {
        for (int i = 0; i <= 31; i++) {
            f56855m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f56855m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f56856n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        m37448l(6);
        this.f56864h = Strictness.LEGACY_STRICT;
        this.f56867k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f56857a = writer;
        setFormattingStyle(FormattingStyle.COMPACT);
    }

    /* renamed from: i */
    public static boolean m37451i(Class cls) {
        if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m37454b() {
        int peek = peek();
        if (peek == 5) {
            this.f56857a.write(this.f56862f);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m37450j();
        m37447m(4);
    }

    @CanIgnoreReturnValue
    public JsonWriter beginArray() throws IOException {
        m37445o();
        return m37449k(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    @CanIgnoreReturnValue
    public JsonWriter beginObject() throws IOException {
        m37445o();
        return m37449k(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56857a.close();
        int i = this.f56859c;
        if (i <= 1 && (i != 1 || this.f56858b[i - 1] == 7)) {
            this.f56859c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final void m37453d() {
        int peek = peek();
        if (peek != 1) {
            if (peek != 2) {
                if (peek != 4) {
                    if (peek != 6) {
                        if (peek == 7) {
                            if (this.f56864h != Strictness.LENIENT) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    m37447m(7);
                    return;
                }
                this.f56857a.append((CharSequence) this.f56861e);
                m37447m(5);
                return;
            }
            this.f56857a.append((CharSequence) this.f56862f);
            m37450j();
            return;
        }
        m37447m(2);
        m37450j();
    }

    @CanIgnoreReturnValue
    public JsonWriter endArray() throws IOException {
        return m37452g(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    @CanIgnoreReturnValue
    public JsonWriter endObject() throws IOException {
        return m37452g(3, 5, '}');
    }

    public void flush() throws IOException {
        if (this.f56859c != 0) {
            this.f56857a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final JsonWriter m37452g(int i, int i2, char c) {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f56866j == null) {
            this.f56859c--;
            if (peek == i2) {
                m37450j();
            }
            this.f56857a.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f56866j);
    }

    public final FormattingStyle getFormattingStyle() {
        return this.f56860d;
    }

    public final boolean getSerializeNulls() {
        return this.f56867k;
    }

    public final Strictness getStrictness() {
        return this.f56864h;
    }

    public final boolean isHtmlSafe() {
        return this.f56865i;
    }

    public boolean isLenient() {
        if (this.f56864h == Strictness.LENIENT) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m37450j() {
        if (this.f56863g) {
            return;
        }
        this.f56857a.write(this.f56860d.getNewline());
        int i = this.f56859c;
        for (int i2 = 1; i2 < i; i2++) {
            this.f56857a.write(this.f56860d.getIndent());
        }
    }

    @CanIgnoreReturnValue
    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m37445o();
        m37453d();
        this.f56857a.append((CharSequence) str);
        return this;
    }

    /* renamed from: k */
    public final JsonWriter m37449k(int i, char c) {
        m37453d();
        m37448l(i);
        this.f56857a.write(c);
        return this;
    }

    /* renamed from: l */
    public final void m37448l(int i) {
        int i2 = this.f56859c;
        int[] iArr = this.f56858b;
        if (i2 == iArr.length) {
            this.f56858b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f56858b;
        int i3 = this.f56859c;
        this.f56859c = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: m */
    public final void m37447m(int i) {
        this.f56858b[this.f56859c - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m37446n(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f56865i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.f56856n
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.f56855m
        L9:
            java.io.Writer r1 = r8.f56857a
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
            java.io.Writer r6 = r8.f56857a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f56857a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f56857a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f56857a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.m37446n(java.lang.String):void");
    }

    @CanIgnoreReturnValue
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f56866j == null) {
            int peek = peek();
            if (peek != 3 && peek != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f56866j = str;
            return this;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    @CanIgnoreReturnValue
    public JsonWriter nullValue() throws IOException {
        if (this.f56866j != null) {
            if (this.f56867k) {
                m37445o();
            } else {
                this.f56866j = null;
                return this;
            }
        }
        m37453d();
        this.f56857a.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    /* renamed from: o */
    public final void m37445o() {
        if (this.f56866j != null) {
            m37454b();
            m37446n(this.f56866j);
            this.f56866j = null;
        }
    }

    public final int peek() {
        int i = this.f56859c;
        if (i != 0) {
            return this.f56858b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void setFormattingStyle(FormattingStyle formattingStyle) {
        boolean z;
        Objects.requireNonNull(formattingStyle);
        this.f56860d = formattingStyle;
        this.f56862f = ",";
        if (formattingStyle.usesSpaceAfterSeparators()) {
            this.f56861e = ": ";
            if (this.f56860d.getNewline().isEmpty()) {
                this.f56862f = ", ";
            }
        } else {
            this.f56861e = ":";
        }
        if (this.f56860d.getNewline().isEmpty() && this.f56860d.getIndent().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.f56863g = z;
    }

    public final void setHtmlSafe(boolean z) {
        this.f56865i = z;
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
        this.f56867k = z;
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f56864h = strictness;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        m37445o();
        m37453d();
        m37446n(str);
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(boolean z) throws IOException {
        m37445o();
        m37453d();
        this.f56857a.write(z ? "true" : "false");
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        m37445o();
        m37453d();
        this.f56857a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(float f) throws IOException {
        m37445o();
        if (this.f56864h != Strictness.LENIENT && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        m37453d();
        this.f56857a.append((CharSequence) Float.toString(f));
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(double d) throws IOException {
        m37445o();
        if (this.f56864h != Strictness.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m37453d();
        this.f56857a.append((CharSequence) Double.toString(d));
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(long j) throws IOException {
        m37445o();
        m37453d();
        this.f56857a.write(Long.toString(j));
        return this;
    }

    @CanIgnoreReturnValue
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        m37445o();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!m37451i(cls) && !f56854l.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f56864h != Strictness.LENIENT) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        m37453d();
        this.f56857a.append((CharSequence) obj);
        return this;
    }
}