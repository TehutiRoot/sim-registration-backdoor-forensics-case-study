package p000;

import androidx.compose.p003ui.text.input.GapBufferKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C50 */
/* loaded from: classes2.dex */
public final class C50 {

    /* renamed from: a */
    public int f606a;

    /* renamed from: b */
    public char[] f607b;

    /* renamed from: c */
    public int f608c;

    /* renamed from: d */
    public int f609d;

    public C50(char[] initBuffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initBuffer, "initBuffer");
        this.f606a = initBuffer.length;
        this.f607b = initBuffer;
        this.f608c = i;
        this.f609d = i2;
    }

    /* renamed from: a */
    public final void m68832a(StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(this.f607b, 0, this.f608c);
        char[] cArr = this.f607b;
        int i = this.f609d;
        builder.append(cArr, i, this.f606a - i);
    }

    /* renamed from: b */
    public final void m68831b(int i, int i2) {
        int i3 = this.f608c;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.f607b;
            ArraysKt___ArraysJvmKt.copyInto(cArr, cArr, this.f609d - i4, i2, i3);
            this.f608c = i;
            this.f609d -= i4;
        } else if (i < i3 && i2 >= i3) {
            this.f609d = i2 + m68830c();
            this.f608c = i;
        } else {
            int m68830c = i + m68830c();
            int m68830c2 = i2 + m68830c();
            int i5 = this.f609d;
            char[] cArr2 = this.f607b;
            ArraysKt___ArraysJvmKt.copyInto(cArr2, cArr2, this.f608c, i5, m68830c);
            this.f608c += m68830c - i5;
            this.f609d = m68830c2;
        }
    }

    /* renamed from: c */
    public final int m68830c() {
        return this.f609d - this.f608c;
    }

    /* renamed from: d */
    public final char m68829d(int i) {
        int i2 = this.f608c;
        if (i < i2) {
            return this.f607b[i];
        }
        return this.f607b[(i - i2) + this.f609d];
    }

    /* renamed from: e */
    public final int m68828e() {
        return this.f606a - m68830c();
    }

    /* renamed from: f */
    public final void m68827f(int i) {
        if (i <= m68830c()) {
            return;
        }
        int m68830c = i - m68830c();
        int i2 = this.f606a;
        do {
            i2 *= 2;
        } while (i2 - this.f606a < m68830c);
        char[] cArr = new char[i2];
        ArraysKt___ArraysJvmKt.copyInto(this.f607b, cArr, 0, 0, this.f608c);
        int i3 = this.f606a;
        int i4 = this.f609d;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        ArraysKt___ArraysJvmKt.copyInto(this.f607b, cArr, i6, i4, i5 + i4);
        this.f607b = cArr;
        this.f606a = i2;
        this.f609d = i6;
    }

    /* renamed from: g */
    public final void m68826g(int i, int i2, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m68827f(text.length() - (i2 - i));
        m68831b(i, i2);
        GapBufferKt.m59029a(text, this.f607b, this.f608c);
        this.f608c += text.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply { append(this) }.toString()");
        return sb2;
    }
}
