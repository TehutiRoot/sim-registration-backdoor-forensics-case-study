package p000;

import androidx.compose.p003ui.text.input.GapBufferKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G50 */
/* loaded from: classes2.dex */
public final class G50 {

    /* renamed from: a */
    public int f1867a;

    /* renamed from: b */
    public char[] f1868b;

    /* renamed from: c */
    public int f1869c;

    /* renamed from: d */
    public int f1870d;

    public G50(char[] initBuffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initBuffer, "initBuffer");
        this.f1867a = initBuffer.length;
        this.f1868b = initBuffer;
        this.f1869c = i;
        this.f1870d = i2;
    }

    /* renamed from: a */
    public final void m68327a(StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(this.f1868b, 0, this.f1869c);
        char[] cArr = this.f1868b;
        int i = this.f1870d;
        builder.append(cArr, i, this.f1867a - i);
    }

    /* renamed from: b */
    public final void m68326b(int i, int i2) {
        int i3 = this.f1869c;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.f1868b;
            ArraysKt___ArraysJvmKt.copyInto(cArr, cArr, this.f1870d - i4, i2, i3);
            this.f1869c = i;
            this.f1870d -= i4;
        } else if (i < i3 && i2 >= i3) {
            this.f1870d = i2 + m68325c();
            this.f1869c = i;
        } else {
            int m68325c = i + m68325c();
            int m68325c2 = i2 + m68325c();
            int i5 = this.f1870d;
            char[] cArr2 = this.f1868b;
            ArraysKt___ArraysJvmKt.copyInto(cArr2, cArr2, this.f1869c, i5, m68325c);
            this.f1869c += m68325c - i5;
            this.f1870d = m68325c2;
        }
    }

    /* renamed from: c */
    public final int m68325c() {
        return this.f1870d - this.f1869c;
    }

    /* renamed from: d */
    public final char m68324d(int i) {
        int i2 = this.f1869c;
        if (i < i2) {
            return this.f1868b[i];
        }
        return this.f1868b[(i - i2) + this.f1870d];
    }

    /* renamed from: e */
    public final int m68323e() {
        return this.f1867a - m68325c();
    }

    /* renamed from: f */
    public final void m68322f(int i) {
        if (i <= m68325c()) {
            return;
        }
        int m68325c = i - m68325c();
        int i2 = this.f1867a;
        do {
            i2 *= 2;
        } while (i2 - this.f1867a < m68325c);
        char[] cArr = new char[i2];
        ArraysKt___ArraysJvmKt.copyInto(this.f1868b, cArr, 0, 0, this.f1869c);
        int i3 = this.f1867a;
        int i4 = this.f1870d;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        ArraysKt___ArraysJvmKt.copyInto(this.f1868b, cArr, i6, i4, i5 + i4);
        this.f1868b = cArr;
        this.f1867a = i2;
        this.f1870d = i6;
    }

    /* renamed from: g */
    public final void m68321g(int i, int i2, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m68322f(text.length() - (i2 - i));
        m68326b(i, i2);
        GapBufferKt.m58979a(text, this.f1868b, this.f1869c);
        this.f1869c += text.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply { append(this) }.toString()");
        return sb2;
    }
}