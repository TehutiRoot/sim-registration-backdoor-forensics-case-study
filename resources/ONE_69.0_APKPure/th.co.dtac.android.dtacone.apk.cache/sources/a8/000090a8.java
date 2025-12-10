package com.google.android.gms.internal.firebase_ml;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zztm implements Closeable, Flushable {

    /* renamed from: i */
    public static final String[] f46090i = new String[128];

    /* renamed from: j */
    public static final String[] f46091j;

    /* renamed from: a */
    public final Writer f46092a;

    /* renamed from: b */
    public int[] f46093b = new int[32];

    /* renamed from: c */
    public int f46094c = 0;

    /* renamed from: d */
    public String f46095d;

    /* renamed from: e */
    public String f46096e;

    /* renamed from: f */
    public boolean f46097f;

    /* renamed from: g */
    public String f46098g;

    /* renamed from: h */
    public boolean f46099h;

    static {
        for (int i = 0; i <= 31; i++) {
            f46090i[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f46090i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f46091j = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zztm(Writer writer) {
        m47462g(6);
        this.f46096e = ":";
        this.f46099h = true;
        this.f46092a = writer;
    }

    /* renamed from: b */
    public final zztm m47464b(int i, String str) {
        m47457m();
        m47462g(i);
        this.f46092a.write(str);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f46092a.close();
        int i = this.f46094c;
        if (i <= 1 && (i != 1 || this.f46093b[i - 1] == 7)) {
            this.f46094c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final zztm m47463d(int i, int i2, String str) {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f46098g == null) {
            this.f46094c--;
            if (peek == i2) {
                m47458l();
            }
            this.f46092a.write(str);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f46098g);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f46094c != 0) {
            this.f46092a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final void m47462g(int i) {
        int i2 = this.f46094c;
        int[] iArr = this.f46093b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f46093b = iArr2;
        }
        int[] iArr3 = this.f46093b;
        int i3 = this.f46094c;
        this.f46094c = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m47461i(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String[] r0 = com.google.android.gms.internal.firebase_ml.zztm.f46090i
            java.io.Writer r1 = r8.f46092a
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
            java.io.Writer r6 = r8.f46092a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L34:
            java.io.Writer r4 = r8.f46092a
            r4.write(r5)
            int r4 = r3 + 1
        L3b:
            int r3 = r3 + 1
            goto Lf
        L3e:
            if (r4 >= r1) goto L46
            java.io.Writer r0 = r8.f46092a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L46:
            java.io.Writer r9 = r8.f46092a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zztm.m47461i(java.lang.String):void");
    }

    /* renamed from: j */
    public final void m47460j(int i) {
        this.f46093b[this.f46094c - 1] = i;
    }

    /* renamed from: k */
    public final void m47459k() {
        if (this.f46098g != null) {
            int peek = peek();
            if (peek == 5) {
                this.f46092a.write(44);
            } else if (peek != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m47458l();
            m47460j(4);
            m47461i(this.f46098g);
            this.f46098g = null;
        }
    }

    /* renamed from: l */
    public final void m47458l() {
        if (this.f46095d == null) {
            return;
        }
        this.f46092a.write("\n");
        int i = this.f46094c;
        for (int i2 = 1; i2 < i; i2++) {
            this.f46092a.write(this.f46095d);
        }
    }

    /* renamed from: m */
    public final void m47457m() {
        int peek = peek();
        if (peek != 1) {
            if (peek != 2) {
                if (peek != 4) {
                    if (peek != 6) {
                        if (peek == 7) {
                            if (!this.f46097f) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    m47460j(7);
                    return;
                }
                this.f46092a.append((CharSequence) this.f46096e);
                m47460j(5);
                return;
            }
            this.f46092a.append(',');
            m47458l();
            return;
        }
        m47460j(2);
        m47458l();
    }

    public final int peek() {
        int i = this.f46094c;
        if (i != 0) {
            return this.f46093b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.f46095d = null;
            this.f46096e = ":";
            return;
        }
        this.f46095d = str;
        this.f46096e = ": ";
    }

    public final void setLenient(boolean z) {
        this.f46097f = true;
    }

    public final zztm zza(Number number) throws IOException {
        if (number == null) {
            return zzry();
        }
        m47459k();
        String obj = number.toString();
        if (!this.f46097f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m47457m();
        this.f46092a.append((CharSequence) obj);
        return this;
    }

    public final zztm zzaw(boolean z) throws IOException {
        String str;
        m47459k();
        m47457m();
        Writer writer = this.f46092a;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    public final zztm zzb(double d) throws IOException {
        m47459k();
        if (!this.f46097f && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m47457m();
        this.f46092a.append((CharSequence) Double.toString(d));
        return this;
    }

    public final zztm zzcf(String str) throws IOException {
        if (str != null) {
            if (this.f46098g == null) {
                if (this.f46094c != 0) {
                    this.f46098g = str;
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
        m47459k();
        m47457m();
        m47461i(str);
        return this;
    }

    public final zztm zzrt() throws IOException {
        m47459k();
        return m47464b(1, "[");
    }

    public final zztm zzru() throws IOException {
        return m47463d(1, 2, "]");
    }

    public final zztm zzrv() throws IOException {
        m47459k();
        return m47464b(3, "{");
    }

    public final zztm zzrw() throws IOException {
        return m47463d(3, 5, "}");
    }

    public final zztm zzry() throws IOException {
        if (this.f46098g != null) {
            if (this.f46099h) {
                m47459k();
            } else {
                this.f46098g = null;
                return this;
            }
        }
        m47457m();
        this.f46092a.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public final zztm zzu(long j) throws IOException {
        m47459k();
        m47457m();
        this.f46092a.write(Long.toString(j));
        return this;
    }
}