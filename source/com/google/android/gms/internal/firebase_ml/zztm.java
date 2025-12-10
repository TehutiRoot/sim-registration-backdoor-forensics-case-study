package com.google.android.gms.internal.firebase_ml;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zztm implements Closeable, Flushable {

    /* renamed from: i */
    public static final String[] f46078i = new String[128];

    /* renamed from: j */
    public static final String[] f46079j;

    /* renamed from: a */
    public final Writer f46080a;

    /* renamed from: b */
    public int[] f46081b = new int[32];

    /* renamed from: c */
    public int f46082c = 0;

    /* renamed from: d */
    public String f46083d;

    /* renamed from: e */
    public String f46084e;

    /* renamed from: f */
    public boolean f46085f;

    /* renamed from: g */
    public String f46086g;

    /* renamed from: h */
    public boolean f46087h;

    static {
        for (int i = 0; i <= 31; i++) {
            f46078i[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f46078i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f46079j = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zztm(Writer writer) {
        m47453g(6);
        this.f46084e = ":";
        this.f46087h = true;
        this.f46080a = writer;
    }

    /* renamed from: b */
    public final zztm m47455b(int i, String str) {
        m47448m();
        m47453g(i);
        this.f46080a.write(str);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f46080a.close();
        int i = this.f46082c;
        if (i <= 1 && (i != 1 || this.f46081b[i - 1] == 7)) {
            this.f46082c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final zztm m47454d(int i, int i2, String str) {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f46086g == null) {
            this.f46082c--;
            if (peek == i2) {
                m47449l();
            }
            this.f46080a.write(str);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f46086g);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f46082c != 0) {
            this.f46080a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final void m47453g(int i) {
        int i2 = this.f46082c;
        int[] iArr = this.f46081b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f46081b = iArr2;
        }
        int[] iArr3 = this.f46081b;
        int i3 = this.f46082c;
        this.f46082c = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m47452i(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String[] r0 = com.google.android.gms.internal.firebase_ml.zztm.f46078i
            java.io.Writer r1 = r8.f46080a
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        Lf:
            if (r3 >= r1) goto L3e
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1e
            r5 = r0[r5]
            if (r5 != 0) goto L2b
            goto L3b
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3b
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L34
            java.io.Writer r6 = r8.f46080a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L34:
            java.io.Writer r4 = r8.f46080a
            r4.write(r5)
            int r4 = r3 + 1
        L3b:
            int r3 = r3 + 1
            goto Lf
        L3e:
            if (r4 >= r1) goto L46
            java.io.Writer r0 = r8.f46080a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L46:
            java.io.Writer r9 = r8.f46080a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zztm.m47452i(java.lang.String):void");
    }

    /* renamed from: j */
    public final void m47451j(int i) {
        this.f46081b[this.f46082c - 1] = i;
    }

    /* renamed from: k */
    public final void m47450k() {
        if (this.f46086g != null) {
            int peek = peek();
            if (peek == 5) {
                this.f46080a.write(44);
            } else if (peek != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m47449l();
            m47451j(4);
            m47452i(this.f46086g);
            this.f46086g = null;
        }
    }

    /* renamed from: l */
    public final void m47449l() {
        if (this.f46083d == null) {
            return;
        }
        this.f46080a.write("\n");
        int i = this.f46082c;
        for (int i2 = 1; i2 < i; i2++) {
            this.f46080a.write(this.f46083d);
        }
    }

    /* renamed from: m */
    public final void m47448m() {
        int peek = peek();
        if (peek != 1) {
            if (peek != 2) {
                if (peek != 4) {
                    if (peek != 6) {
                        if (peek == 7) {
                            if (!this.f46085f) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    m47451j(7);
                    return;
                }
                this.f46080a.append((CharSequence) this.f46084e);
                m47451j(5);
                return;
            }
            this.f46080a.append(',');
            m47449l();
            return;
        }
        m47451j(2);
        m47449l();
    }

    public final int peek() {
        int i = this.f46082c;
        if (i != 0) {
            return this.f46081b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.f46083d = null;
            this.f46084e = ":";
            return;
        }
        this.f46083d = str;
        this.f46084e = ": ";
    }

    public final void setLenient(boolean z) {
        this.f46085f = true;
    }

    public final zztm zza(Number number) throws IOException {
        if (number == null) {
            return zzry();
        }
        m47450k();
        String obj = number.toString();
        if (!this.f46085f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m47448m();
        this.f46080a.append((CharSequence) obj);
        return this;
    }

    public final zztm zzaw(boolean z) throws IOException {
        String str;
        m47450k();
        m47448m();
        Writer writer = this.f46080a;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    public final zztm zzb(double d) throws IOException {
        m47450k();
        if (!this.f46085f && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m47448m();
        this.f46080a.append((CharSequence) Double.toString(d));
        return this;
    }

    public final zztm zzcf(String str) throws IOException {
        if (str != null) {
            if (this.f46086g == null) {
                if (this.f46082c != 0) {
                    this.f46086g = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public final zztm zzcg(String str) throws IOException {
        if (str == null) {
            return zzry();
        }
        m47450k();
        m47448m();
        m47452i(str);
        return this;
    }

    public final zztm zzrt() throws IOException {
        m47450k();
        return m47455b(1, "[");
    }

    public final zztm zzru() throws IOException {
        return m47454d(1, 2, "]");
    }

    public final zztm zzrv() throws IOException {
        m47450k();
        return m47455b(3, "{");
    }

    public final zztm zzrw() throws IOException {
        return m47454d(3, 5, "}");
    }

    public final zztm zzry() throws IOException {
        if (this.f46086g != null) {
            if (this.f46087h) {
                m47450k();
            } else {
                this.f46086g = null;
                return this;
            }
        }
        m47448m();
        this.f46080a.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public final zztm zzu(long j) throws IOException {
        m47450k();
        m47448m();
        this.f46080a.write(Long.toString(j));
        return this;
    }
}
